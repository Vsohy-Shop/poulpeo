package androidx.mediarouter.media;

import android.content.Context;
import android.content.Intent;
import android.media.MediaRoute2Info;
import android.media.MediaRoute2ProviderService;
import android.media.RouteDiscoveryPreference;
import android.media.RoutingSessionInfo;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.collection.ArrayMap;
import androidx.mediarouter.media.MediaRouteProvider;
import androidx.mediarouter.media.MediaRouteProviderService;
import androidx.mediarouter.media.MediaRouter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@RequiresApi(api = 30)
class MediaRoute2ProviderServiceAdapter extends MediaRoute2ProviderService {
    static final boolean DEBUG = Log.isLoggable(TAG, 3);
    public static final String SERVICE_INTERFACE = "android.media.MediaRoute2ProviderService";
    private static final String TAG = "MR2ProviderService";
    private final Object mLock = new Object();
    private volatile MediaRouteProviderDescriptor mProviderDescriptor;
    final MediaRouteProviderService.MediaRouteProviderServiceImplApi30 mServiceImpl;
    final SparseArray<String> mSessionIdMap = new SparseArray<>();
    @GuardedBy("mLock")
    final Map<String, SessionRecord> mSessionRecords = new ArrayMap();

    static class IncomingHandler extends Handler {
        private final MediaRoute2ProviderServiceAdapter mServiceAdapter;
        private final String mSessionId;

        IncomingHandler(MediaRoute2ProviderServiceAdapter mediaRoute2ProviderServiceAdapter, String str) {
            super(Looper.myLooper());
            this.mServiceAdapter = mediaRoute2ProviderServiceAdapter;
            this.mSessionId = str;
        }

        public void handleMessage(Message message) {
            Messenger messenger = message.replyTo;
            int i = message.what;
            int i2 = message.arg1;
            Object obj = message.obj;
            Bundle data = message.getData();
            if (i == 7) {
                int i3 = data.getInt(MediaRouteProviderProtocol.CLIENT_DATA_VOLUME, -1);
                String string = data.getString(MediaRouteProviderProtocol.CLIENT_DATA_ROUTE_ID);
                if (i3 >= 0 && string != null) {
                    this.mServiceAdapter.setRouteVolume(string, i3);
                }
            } else if (i == 8) {
                int i4 = data.getInt(MediaRouteProviderProtocol.CLIENT_DATA_VOLUME, 0);
                String string2 = data.getString(MediaRouteProviderProtocol.CLIENT_DATA_ROUTE_ID);
                if (i4 != 0 && string2 != null) {
                    this.mServiceAdapter.updateRouteVolume(string2, i4);
                }
            } else if (i == 9 && (obj instanceof Intent)) {
                this.mServiceAdapter.onControlRequest(messenger, i2, this.mSessionId, (Intent) obj);
            }
        }
    }

    @RequiresApi(api = 30)
    final class SessionRecord {
        static final int SESSION_FLAG_DYNAMIC = 4;
        static final int SESSION_FLAG_GROUP = 2;
        static final int SESSION_FLAG_MR2 = 1;
        private final WeakReference<MediaRouteProviderService.MediaRouteProviderServiceImplApi30.ClientRecord> mClientRecord;
        private final MediaRouteProvider.DynamicGroupRouteController mController;
        private final int mFlags;
        private boolean mIsCreated;
        private boolean mIsReleased;
        private final long mRequestId;
        String mRouteId;
        private final Map<String, MediaRouteProvider.RouteController> mRouteIdToControllerMap;
        String mSessionId;
        private RoutingSessionInfo mSessionInfo;

        SessionRecord(MediaRoute2ProviderServiceAdapter mediaRoute2ProviderServiceAdapter, MediaRouteProvider.DynamicGroupRouteController dynamicGroupRouteController, long j, int i) {
            this(dynamicGroupRouteController, j, i, (MediaRouteProviderService.MediaRouteProviderServiceImplApi30.ClientRecord) null);
        }

        private MediaRouteProvider.RouteController getOrCreateRouteController(String str, String str2) {
            MediaRouteProvider.RouteController routeController;
            MediaRouteProvider.RouteController routeController2 = this.mRouteIdToControllerMap.get(str);
            if (routeController2 != null) {
                return routeController2;
            }
            if (str2 == null) {
                routeController = MediaRoute2ProviderServiceAdapter.this.getMediaRouteProvider().onCreateRouteController(str);
            } else {
                routeController = MediaRoute2ProviderServiceAdapter.this.getMediaRouteProvider().onCreateRouteController(str, str2);
            }
            if (routeController != null) {
                this.mRouteIdToControllerMap.put(str, routeController);
            }
            return routeController;
        }

        private void notifySessionCreated() {
            if (this.mIsCreated) {
                Log.w(MediaRoute2ProviderServiceAdapter.TAG, "notifySessionCreated: Routing session is already created.");
                return;
            }
            this.mIsCreated = true;
            MediaRoute2ProviderServiceAdapter.this.notifySessionCreated(this.mRequestId, this.mSessionInfo);
        }

        private boolean releaseRouteControllerByRouteId(String str) {
            MediaRouteProvider.RouteController remove = this.mRouteIdToControllerMap.remove(str);
            if (remove == null) {
                return false;
            }
            remove.onUnselect(0);
            remove.onRelease();
            return true;
        }

        /* access modifiers changed from: package-private */
        public MediaRouteProvider.RouteController findControllerByRouteId(String str) {
            MediaRouteProviderService.MediaRouteProviderServiceImplApi30.ClientRecord clientRecord = this.mClientRecord.get();
            if (clientRecord != null) {
                return clientRecord.findControllerByRouteId(str);
            }
            return this.mRouteIdToControllerMap.get(str);
        }

        public int getFlags() {
            return this.mFlags;
        }

        /* access modifiers changed from: package-private */
        public MediaRouteProvider.DynamicGroupRouteController getGroupController() {
            return this.mController;
        }

        public void release(boolean z) {
            MediaRouteProviderService.MediaRouteProviderServiceImplApi30.ClientRecord clientRecord;
            if (!this.mIsReleased) {
                if ((this.mFlags & 3) == 3) {
                    updateMemberRouteControllers((String) null, this.mSessionInfo, (RoutingSessionInfo) null);
                }
                if (z) {
                    this.mController.onUnselect(2);
                    this.mController.onRelease();
                    if ((this.mFlags & 1) == 0 && (clientRecord = this.mClientRecord.get()) != null) {
                        MediaRouteProvider.RouteController routeController = this.mController;
                        if (routeController instanceof DynamicGroupRouteControllerProxy) {
                            routeController = ((DynamicGroupRouteControllerProxy) routeController).mRouteController;
                        }
                        clientRecord.releaseControllerByProvider(routeController, this.mRouteId);
                    }
                }
                this.mIsReleased = true;
                MediaRoute2ProviderServiceAdapter.this.notifySessionReleased(this.mSessionId);
            }
        }

        /* access modifiers changed from: package-private */
        public void setSessionInfo(@NonNull RoutingSessionInfo routingSessionInfo) {
            String str;
            if (this.mSessionInfo != null) {
                Log.w(MediaRoute2ProviderServiceAdapter.TAG, "setSessionInfo: This shouldn't be called after sessionInfo is set");
                return;
            }
            Messenger messenger = new Messenger(new IncomingHandler(MediaRoute2ProviderServiceAdapter.this, this.mSessionId));
            RoutingSessionInfo.Builder builder = new RoutingSessionInfo.Builder(routingSessionInfo);
            Bundle bundle = new Bundle();
            bundle.putParcelable("androidx.mediarouter.media.KEY_MESSENGER", messenger);
            if (routingSessionInfo.getName() != null) {
                str = routingSessionInfo.getName().toString();
            } else {
                str = null;
            }
            bundle.putString("androidx.mediarouter.media.KEY_SESSION_NAME", str);
            this.mSessionInfo = builder.setControlHints(bundle).build();
        }

        public void updateMemberRouteControllers(String str, RoutingSessionInfo routingSessionInfo, RoutingSessionInfo routingSessionInfo2) {
            List<String> list;
            List<String> list2;
            if (routingSessionInfo == null) {
                list = Collections.emptyList();
            } else {
                list = routingSessionInfo.getSelectedRoutes();
            }
            if (routingSessionInfo2 == null) {
                list2 = Collections.emptyList();
            } else {
                list2 = routingSessionInfo2.getSelectedRoutes();
            }
            for (String str2 : list2) {
                if (findControllerByRouteId(str2) == null) {
                    getOrCreateRouteController(str2, str).onSelect();
                }
            }
            for (String str3 : list) {
                if (!list2.contains(str3)) {
                    releaseRouteControllerByRouteId(str3);
                }
            }
        }

        public void updateSessionInfo(@Nullable MediaRouteDescriptor mediaRouteDescriptor, @Nullable Collection<MediaRouteProvider.DynamicGroupRouteController.DynamicRouteDescriptor> collection) {
            RoutingSessionInfo routingSessionInfo = this.mSessionInfo;
            if (routingSessionInfo == null) {
                Log.w(MediaRoute2ProviderServiceAdapter.TAG, "updateSessionInfo: mSessionInfo is null. This shouldn't happen.");
            } else if (mediaRouteDescriptor == null || mediaRouteDescriptor.isEnabled()) {
                RoutingSessionInfo.Builder builder = new RoutingSessionInfo.Builder(routingSessionInfo);
                if (mediaRouteDescriptor != null) {
                    this.mRouteId = mediaRouteDescriptor.getId();
                    RoutingSessionInfo.Builder unused = builder.setName(mediaRouteDescriptor.getName()).setVolume(mediaRouteDescriptor.getVolume()).setVolumeMax(mediaRouteDescriptor.getVolumeMax()).setVolumeHandling(mediaRouteDescriptor.getVolumeHandling());
                    RoutingSessionInfo.Builder unused2 = builder.clearSelectedRoutes();
                    if (mediaRouteDescriptor.getGroupMemberIds().isEmpty()) {
                        RoutingSessionInfo.Builder unused3 = builder.addSelectedRoute(this.mRouteId);
                    } else {
                        for (String a : mediaRouteDescriptor.getGroupMemberIds()) {
                            RoutingSessionInfo.Builder unused4 = builder.addSelectedRoute(a);
                        }
                    }
                    Bundle a2 = routingSessionInfo.getControlHints();
                    if (a2 == null) {
                        Log.w(MediaRoute2ProviderServiceAdapter.TAG, "updateSessionInfo: controlHints is null. This shouldn't happen.");
                        a2 = new Bundle();
                    }
                    a2.putString("androidx.mediarouter.media.KEY_SESSION_NAME", mediaRouteDescriptor.getName());
                    a2.putBundle("androidx.mediarouter.media.KEY_GROUP_ROUTE", mediaRouteDescriptor.asBundle());
                    RoutingSessionInfo.Builder unused5 = builder.setControlHints(a2);
                }
                this.mSessionInfo = builder.build();
                if (collection != null && !collection.isEmpty()) {
                    RoutingSessionInfo.Builder unused6 = builder.clearSelectedRoutes();
                    RoutingSessionInfo.Builder unused7 = builder.clearSelectableRoutes();
                    RoutingSessionInfo.Builder unused8 = builder.clearDeselectableRoutes();
                    RoutingSessionInfo.Builder unused9 = builder.clearTransferableRoutes();
                    boolean z = false;
                    for (MediaRouteProvider.DynamicGroupRouteController.DynamicRouteDescriptor next : collection) {
                        String id = next.getRouteDescriptor().getId();
                        int i = next.mSelectionState;
                        if (i == 2 || i == 3) {
                            RoutingSessionInfo.Builder unused10 = builder.addSelectedRoute(id);
                            z = true;
                        }
                        if (next.isGroupable()) {
                            RoutingSessionInfo.Builder unused11 = builder.addSelectableRoute(id);
                        }
                        if (next.isUnselectable()) {
                            RoutingSessionInfo.Builder unused12 = builder.addDeselectableRoute(id);
                        }
                        if (next.isTransferable()) {
                            RoutingSessionInfo.Builder unused13 = builder.addTransferableRoute(id);
                        }
                    }
                    if (z) {
                        this.mSessionInfo = builder.build();
                    }
                }
                if (MediaRoute2ProviderServiceAdapter.DEBUG) {
                    Log.d(MediaRoute2ProviderServiceAdapter.TAG, "updateSessionInfo: groupRoute=" + mediaRouteDescriptor + ", sessionInfo=" + this.mSessionInfo);
                }
                if ((this.mFlags & 5) == 5 && mediaRouteDescriptor != null) {
                    updateMemberRouteControllers(mediaRouteDescriptor.getId(), routingSessionInfo, this.mSessionInfo);
                }
                if (!this.mIsCreated) {
                    notifySessionCreated();
                } else {
                    MediaRoute2ProviderServiceAdapter.this.notifySessionUpdated(this.mSessionInfo);
                }
            } else {
                MediaRoute2ProviderServiceAdapter.this.onReleaseSession(0, this.mSessionId);
            }
        }

        SessionRecord(MediaRouteProvider.DynamicGroupRouteController dynamicGroupRouteController, long j, int i, MediaRouteProviderService.MediaRouteProviderServiceImplApi30.ClientRecord clientRecord) {
            this.mRouteIdToControllerMap = new ArrayMap();
            this.mIsCreated = false;
            this.mController = dynamicGroupRouteController;
            this.mRequestId = j;
            this.mFlags = i;
            this.mClientRecord = new WeakReference<>(clientRecord);
        }
    }

    MediaRoute2ProviderServiceAdapter(MediaRouteProviderService.MediaRouteProviderServiceImplApi30 mediaRouteProviderServiceImplApi30) {
        this.mServiceImpl = mediaRouteProviderServiceImplApi30;
    }

    private String assignSessionId(SessionRecord sessionRecord) {
        String uuid;
        synchronized (this.mLock) {
            do {
                uuid = UUID.randomUUID().toString();
            } while (this.mSessionRecords.containsKey(uuid));
            sessionRecord.mSessionId = uuid;
            this.mSessionRecords.put(uuid, sessionRecord);
        }
        return uuid;
    }

    private MediaRouteProvider.RouteController findControllerByRouteId(String str) {
        ArrayList<SessionRecord> arrayList = new ArrayList<>();
        synchronized (this.mLock) {
            arrayList.addAll(this.mSessionRecords.values());
        }
        for (SessionRecord findControllerByRouteId : arrayList) {
            MediaRouteProvider.RouteController findControllerByRouteId2 = findControllerByRouteId.findControllerByRouteId(str);
            if (findControllerByRouteId2 != null) {
                return findControllerByRouteId2;
            }
        }
        return null;
    }

    private MediaRouteProvider.DynamicGroupRouteController findControllerBySessionId(String str) {
        MediaRouteProvider.DynamicGroupRouteController dynamicGroupRouteController;
        synchronized (this.mLock) {
            SessionRecord sessionRecord = this.mSessionRecords.get(str);
            if (sessionRecord == null) {
                dynamicGroupRouteController = null;
            } else {
                dynamicGroupRouteController = sessionRecord.getGroupController();
            }
        }
        return dynamicGroupRouteController;
    }

    private SessionRecord findSessionRecordByController(MediaRouteProvider.DynamicGroupRouteController dynamicGroupRouteController) {
        synchronized (this.mLock) {
            for (Map.Entry<String, SessionRecord> value : this.mSessionRecords.entrySet()) {
                SessionRecord sessionRecord = (SessionRecord) value.getValue();
                if (sessionRecord.getGroupController() == dynamicGroupRouteController) {
                    return sessionRecord;
                }
            }
            return null;
        }
    }

    private MediaRouteDescriptor getRouteDescriptor(String str, String str2) {
        if (getMediaRouteProvider() == null || this.mProviderDescriptor == null) {
            Log.w(TAG, str2 + ": no provider info");
            return null;
        }
        for (MediaRouteDescriptor next : this.mProviderDescriptor.getRoutes()) {
            if (TextUtils.equals(next.getId(), str)) {
                return next;
            }
        }
        Log.w(TAG, str2 + ": Couldn't find a route : " + str);
        return null;
    }

    public void attachBaseContext(Context context) {
        MediaRoute2ProviderServiceAdapter.super.attachBaseContext(context);
    }

    /* access modifiers changed from: package-private */
    public MediaRouteProvider getMediaRouteProvider() {
        MediaRouteProviderService service = this.mServiceImpl.getService();
        if (service == null) {
            return null;
        }
        return service.getMediaRouteProvider();
    }

    /* access modifiers changed from: package-private */
    public void notifyRouteControllerAdded(MediaRouteProviderService.MediaRouteProviderServiceImplApi30.ClientRecord clientRecord, MediaRouteProvider.RouteController routeController, int i, String str, String str2) {
        int i2;
        DynamicGroupRouteControllerProxy dynamicGroupRouteControllerProxy;
        int i3;
        MediaRouteDescriptor routeDescriptor = getRouteDescriptor(str2, "notifyRouteControllerAdded");
        if (routeDescriptor != null) {
            if (routeController instanceof MediaRouteProvider.DynamicGroupRouteController) {
                dynamicGroupRouteControllerProxy = (MediaRouteProvider.DynamicGroupRouteController) routeController;
                i2 = 6;
            } else {
                if (!routeDescriptor.getGroupMemberIds().isEmpty()) {
                    i3 = 2;
                } else {
                    i3 = 0;
                }
                i2 = i3;
                dynamicGroupRouteControllerProxy = new DynamicGroupRouteControllerProxy(str2, routeController);
            }
            SessionRecord sessionRecord = new SessionRecord(dynamicGroupRouteControllerProxy, 0, i2, clientRecord);
            sessionRecord.mRouteId = str2;
            String assignSessionId = assignSessionId(sessionRecord);
            this.mSessionIdMap.put(i, assignSessionId);
            RoutingSessionInfo.Builder a = new RoutingSessionInfo.Builder(assignSessionId, str).setName(routeDescriptor.getName()).setVolumeHandling(routeDescriptor.getVolumeHandling()).setVolume(routeDescriptor.getVolume()).setVolumeMax(routeDescriptor.getVolumeMax());
            if (routeDescriptor.getGroupMemberIds().isEmpty()) {
                RoutingSessionInfo.Builder unused = a.addSelectedRoute(str2);
            } else {
                for (String a2 : routeDescriptor.getGroupMemberIds()) {
                    RoutingSessionInfo.Builder unused2 = a.addSelectedRoute(a2);
                }
            }
            sessionRecord.setSessionInfo(a.build());
        }
    }

    /* access modifiers changed from: package-private */
    public void notifyRouteControllerRemoved(int i) {
        SessionRecord remove;
        String str = this.mSessionIdMap.get(i);
        if (str != null) {
            this.mSessionIdMap.remove(i);
            synchronized (this.mLock) {
                remove = this.mSessionRecords.remove(str);
            }
            if (remove != null) {
                remove.release(false);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void onControlRequest(Messenger messenger, int i, String str, Intent intent) {
        if (getSessionInfo(str) == null) {
            Log.w(TAG, "onCustomCommand: Couldn't find a session");
            return;
        }
        MediaRouteProvider.DynamicGroupRouteController findControllerBySessionId = findControllerBySessionId(str);
        if (findControllerBySessionId == null) {
            Log.w(TAG, "onControlRequest: Couldn't find a controller");
            notifyRequestFailed((long) i, 3);
            return;
        }
        final String str2 = str;
        final Intent intent2 = intent;
        final Messenger messenger2 = messenger;
        final int i2 = i;
        findControllerBySessionId.onControlRequest(intent, new MediaRouter.ControlRequestCallback() {
            public void onError(String str, Bundle bundle) {
                if (MediaRoute2ProviderServiceAdapter.DEBUG) {
                    Log.d(MediaRoute2ProviderServiceAdapter.TAG, "Route control request failed, sessionId=" + str2 + ", intent=" + intent2 + ", error=" + str + ", data=" + bundle);
                }
                if (str != null) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(MediaRouteProviderProtocol.SERVICE_DATA_ERROR, str);
                    sendReply(messenger2, 4, i2, 0, bundle, bundle2);
                    return;
                }
                sendReply(messenger2, 4, i2, 0, bundle, (Bundle) null);
            }

            public void onResult(Bundle bundle) {
                if (MediaRoute2ProviderServiceAdapter.DEBUG) {
                    Log.d(MediaRoute2ProviderServiceAdapter.TAG, "Route control request succeeded, sessionId=" + str2 + ", intent=" + intent2 + ", data=" + bundle);
                }
                sendReply(messenger2, 3, i2, 0, bundle, (Bundle) null);
            }

            /* access modifiers changed from: package-private */
            public void sendReply(Messenger messenger, int i, int i2, int i3, Object obj, Bundle bundle) {
                Message obtain = Message.obtain();
                obtain.what = i;
                obtain.arg1 = i2;
                obtain.arg2 = i3;
                obtain.obj = obj;
                obtain.setData(bundle);
                try {
                    messenger.send(obtain);
                } catch (DeadObjectException unused) {
                } catch (RemoteException e) {
                    Log.e(MediaRoute2ProviderServiceAdapter.TAG, "Could not send message to the client.", e);
                }
            }
        });
    }

    public void onCreateSession(long j, @NonNull String str, @NonNull String str2, @Nullable Bundle bundle) {
        MediaRouteProvider.DynamicGroupRouteController dynamicGroupRouteController;
        MediaRouteProvider mediaRouteProvider = getMediaRouteProvider();
        MediaRouteDescriptor routeDescriptor = getRouteDescriptor(str2, "onCreateSession");
        int i = 3;
        if (routeDescriptor == null) {
            notifyRequestFailed(j, 3);
            return;
        }
        if (this.mProviderDescriptor.supportsDynamicGroupRoute()) {
            dynamicGroupRouteController = mediaRouteProvider.onCreateDynamicGroupRouteController(str2);
            if (dynamicGroupRouteController == null) {
                Log.w(TAG, "onCreateSession: Couldn't create a dynamic controller");
                notifyRequestFailed(j, 1);
                return;
            }
            i = 7;
        } else {
            MediaRouteProvider.RouteController onCreateRouteController = mediaRouteProvider.onCreateRouteController(str2);
            if (onCreateRouteController == null) {
                Log.w(TAG, "onCreateSession: Couldn't create a controller");
                notifyRequestFailed(j, 1);
                return;
            }
            if (routeDescriptor.getGroupMemberIds().isEmpty()) {
                i = 1;
            }
            dynamicGroupRouteController = new DynamicGroupRouteControllerProxy(str2, onCreateRouteController);
        }
        dynamicGroupRouteController.onSelect();
        SessionRecord sessionRecord = new SessionRecord(this, dynamicGroupRouteController, j, i);
        RoutingSessionInfo.Builder a = new RoutingSessionInfo.Builder(assignSessionId(sessionRecord), str).setName(routeDescriptor.getName()).setVolumeHandling(routeDescriptor.getVolumeHandling()).setVolume(routeDescriptor.getVolume()).setVolumeMax(routeDescriptor.getVolumeMax());
        if (routeDescriptor.getGroupMemberIds().isEmpty()) {
            RoutingSessionInfo.Builder unused = a.addSelectedRoute(str2);
        } else {
            for (String a2 : routeDescriptor.getGroupMemberIds()) {
                RoutingSessionInfo.Builder unused2 = a.addSelectedRoute(a2);
            }
        }
        RoutingSessionInfo a3 = a.build();
        sessionRecord.setSessionInfo(a3);
        if ((i & 6) == 2) {
            sessionRecord.updateMemberRouteControllers(str2, (RoutingSessionInfo) null, a3);
        }
        this.mServiceImpl.setDynamicRoutesChangedListener(dynamicGroupRouteController);
    }

    public void onDeselectRoute(long j, @NonNull String str, @NonNull String str2) {
        if (getSessionInfo(str) == null) {
            Log.w(TAG, "onDeselectRoute: Couldn't find a session");
            notifyRequestFailed(j, 4);
        } else if (getRouteDescriptor(str2, "onDeselectRoute") == null) {
            notifyRequestFailed(j, 3);
        } else {
            MediaRouteProvider.DynamicGroupRouteController findControllerBySessionId = findControllerBySessionId(str);
            if (findControllerBySessionId == null) {
                Log.w(TAG, "onDeselectRoute: Couldn't find a controller");
                notifyRequestFailed(j, 3);
                return;
            }
            findControllerBySessionId.onRemoveMemberRoute(str2);
        }
    }

    public void onDiscoveryPreferenceChanged(@NonNull RouteDiscoveryPreference routeDiscoveryPreference) {
        this.mServiceImpl.setBaseDiscoveryRequest(MediaRouter2Utils.toMediaRouteDiscoveryRequest(routeDiscoveryPreference));
    }

    public void onReleaseSession(long j, @NonNull String str) {
        SessionRecord remove;
        if (getSessionInfo(str) != null) {
            synchronized (this.mLock) {
                remove = this.mSessionRecords.remove(str);
            }
            if (remove == null) {
                Log.w(TAG, "onReleaseSession: Couldn't find a session");
                notifyRequestFailed(j, 4);
                return;
            }
            remove.release(true);
        }
    }

    public void onSelectRoute(long j, @NonNull String str, @NonNull String str2) {
        if (getSessionInfo(str) == null) {
            Log.w(TAG, "onSelectRoute: Couldn't find a session");
            notifyRequestFailed(j, 4);
        } else if (getRouteDescriptor(str2, "onSelectRoute") == null) {
            notifyRequestFailed(j, 3);
        } else {
            MediaRouteProvider.DynamicGroupRouteController findControllerBySessionId = findControllerBySessionId(str);
            if (findControllerBySessionId == null) {
                Log.w(TAG, "onSelectRoute: Couldn't find a controller");
                notifyRequestFailed(j, 3);
                return;
            }
            findControllerBySessionId.onAddMemberRoute(str2);
        }
    }

    public void onSetRouteVolume(long j, @NonNull String str, int i) {
        MediaRouteProvider.RouteController findControllerByRouteId = findControllerByRouteId(str);
        if (findControllerByRouteId == null) {
            Log.w(TAG, "onSetRouteVolume: Couldn't find a controller for routeId=" + str);
            notifyRequestFailed(j, 3);
            return;
        }
        findControllerByRouteId.onSetVolume(i);
    }

    public void onSetSessionVolume(long j, @NonNull String str, int i) {
        if (getSessionInfo(str) == null) {
            Log.w(TAG, "onSetSessionVolume: Couldn't find a session");
            notifyRequestFailed(j, 4);
            return;
        }
        MediaRouteProvider.DynamicGroupRouteController findControllerBySessionId = findControllerBySessionId(str);
        if (findControllerBySessionId == null) {
            Log.w(TAG, "onSetSessionVolume: Couldn't find a controller");
            notifyRequestFailed(j, 3);
            return;
        }
        findControllerBySessionId.onSetVolume(i);
    }

    public void onTransferToRoute(long j, @NonNull String str, @NonNull String str2) {
        if (getSessionInfo(str) == null) {
            Log.w(TAG, "onTransferToRoute: Couldn't find a session");
            notifyRequestFailed(j, 4);
        } else if (getRouteDescriptor(str2, "onTransferToRoute") == null) {
            notifyRequestFailed(j, 3);
        } else {
            MediaRouteProvider.DynamicGroupRouteController findControllerBySessionId = findControllerBySessionId(str);
            if (findControllerBySessionId == null) {
                Log.w(TAG, "onTransferToRoute: Couldn't find a controller");
                notifyRequestFailed(j, 3);
                return;
            }
            findControllerBySessionId.onUpdateMemberRoutes(Collections.singletonList(str2));
        }
    }

    public void setDynamicRouteDescriptor(MediaRouteProvider.DynamicGroupRouteController dynamicGroupRouteController, MediaRouteDescriptor mediaRouteDescriptor, Collection<MediaRouteProvider.DynamicGroupRouteController.DynamicRouteDescriptor> collection) {
        SessionRecord findSessionRecordByController = findSessionRecordByController(dynamicGroupRouteController);
        if (findSessionRecordByController == null) {
            Log.w(TAG, "setDynamicRouteDescriptor: Ignoring unknown controller");
        } else {
            findSessionRecordByController.updateSessionInfo(mediaRouteDescriptor, collection);
        }
    }

    public void setProviderDescriptor(@Nullable MediaRouteProviderDescriptor mediaRouteProviderDescriptor) {
        List<MediaRouteDescriptor> list;
        this.mProviderDescriptor = mediaRouteProviderDescriptor;
        if (mediaRouteProviderDescriptor == null) {
            list = Collections.emptyList();
        } else {
            list = mediaRouteProviderDescriptor.getRoutes();
        }
        ArrayMap arrayMap = new ArrayMap();
        for (MediaRouteDescriptor next : list) {
            if (next != null) {
                arrayMap.put(next.getId(), next);
            }
        }
        updateStaticSessions(arrayMap);
        ArrayList arrayList = new ArrayList();
        for (MediaRouteDescriptor fwkMediaRoute2Info : arrayMap.values()) {
            MediaRoute2Info fwkMediaRoute2Info2 = MediaRouter2Utils.toFwkMediaRoute2Info(fwkMediaRoute2Info);
            if (fwkMediaRoute2Info2 != null) {
                arrayList.add(fwkMediaRoute2Info2);
            }
        }
        notifyRoutes(arrayList);
    }

    /* access modifiers changed from: package-private */
    public void setRouteVolume(@NonNull String str, int i) {
        MediaRouteProvider.RouteController findControllerByRouteId = findControllerByRouteId(str);
        if (findControllerByRouteId == null) {
            Log.w(TAG, "setRouteVolume: Couldn't find a controller for routeId=" + str);
            return;
        }
        findControllerByRouteId.onSetVolume(i);
    }

    /* access modifiers changed from: package-private */
    public void updateRouteVolume(@NonNull String str, int i) {
        MediaRouteProvider.RouteController findControllerByRouteId = findControllerByRouteId(str);
        if (findControllerByRouteId == null) {
            Log.w(TAG, "updateRouteVolume: Couldn't find a controller for routeId=" + str);
            return;
        }
        findControllerByRouteId.onUpdateVolume(i);
    }

    /* access modifiers changed from: package-private */
    public void updateStaticSessions(Map<String, MediaRouteDescriptor> map) {
        ArrayList<SessionRecord> arrayList = new ArrayList<>();
        synchronized (this.mLock) {
            for (SessionRecord next : this.mSessionRecords.values()) {
                if ((next.getFlags() & 4) == 0) {
                    arrayList.add(next);
                }
            }
        }
        for (SessionRecord sessionRecord : arrayList) {
            DynamicGroupRouteControllerProxy dynamicGroupRouteControllerProxy = (DynamicGroupRouteControllerProxy) sessionRecord.getGroupController();
            if (map.containsKey(dynamicGroupRouteControllerProxy.getRouteId())) {
                sessionRecord.updateSessionInfo(map.get(dynamicGroupRouteControllerProxy.getRouteId()), (Collection<MediaRouteProvider.DynamicGroupRouteController.DynamicRouteDescriptor>) null);
            }
        }
    }

    private static class DynamicGroupRouteControllerProxy extends MediaRouteProvider.DynamicGroupRouteController {
        final MediaRouteProvider.RouteController mRouteController;
        private final String mRouteId;

        DynamicGroupRouteControllerProxy(String str, MediaRouteProvider.RouteController routeController) {
            this.mRouteId = str;
            this.mRouteController = routeController;
        }

        public String getRouteId() {
            return this.mRouteId;
        }

        public boolean onControlRequest(@NonNull Intent intent, MediaRouter.ControlRequestCallback controlRequestCallback) {
            return this.mRouteController.onControlRequest(intent, controlRequestCallback);
        }

        public void onRelease() {
            this.mRouteController.onRelease();
        }

        public void onSelect() {
            this.mRouteController.onSelect();
        }

        public void onSetVolume(int i) {
            this.mRouteController.onSetVolume(i);
        }

        public void onUnselect(int i) {
            this.mRouteController.onUnselect(i);
        }

        public void onUpdateVolume(int i) {
            this.mRouteController.onUpdateVolume(i);
        }

        public void onAddMemberRoute(@NonNull String str) {
        }

        public void onRemoveMemberRoute(@NonNull String str) {
        }

        public void onUpdateMemberRoutes(@Nullable List<String> list) {
        }
    }
}
