package androidx.mediarouter.media;

import android.content.Context;
import android.content.Intent;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.ArraySet;
import android.util.Log;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.emoji2.text.C1978b;
import androidx.mediarouter.C2410R;
import androidx.mediarouter.media.MediaRouteDescriptor;
import androidx.mediarouter.media.MediaRouteProvider;
import androidx.mediarouter.media.MediaRouteProviderDescriptor;
import androidx.mediarouter.media.MediaRouteSelector;
import androidx.mediarouter.media.MediaRouter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

@RequiresApi(30)
class MediaRoute2Provider extends MediaRouteProvider {
    static final boolean DEBUG = Log.isLoggable(TAG, 3);
    static final String TAG = "MR2Provider";
    final Callback mCallback;
    private final MediaRouter2.ControllerCallback mControllerCallback = new ControllerCallback();
    final Map<MediaRouter2.RoutingController, GroupRouteController> mControllerMap = new ArrayMap();
    private final Handler mHandler;
    private final Executor mHandlerExecutor;
    final MediaRouter2 mMediaRouter2;
    private final MediaRouter2.RouteCallback mRouteCallback = new RouteCallback();
    private Map<String, String> mRouteIdToOriginalRouteIdMap = new ArrayMap();
    private List<MediaRoute2Info> mRoutes = new ArrayList();
    private final MediaRouter2.TransferCallback mTransferCallback = new TransferCallback();

    static abstract class Callback {
        Callback() {
        }

        public abstract void onReleaseController(@NonNull MediaRouteProvider.RouteController routeController);

        public abstract void onSelectFallbackRoute(int i);

        public abstract void onSelectRoute(@NonNull String str, int i);
    }

    private class ControllerCallback extends MediaRouter2.ControllerCallback {
        ControllerCallback() {
        }

        public void onControllerUpdated(@NonNull MediaRouter2.RoutingController routingController) {
            MediaRoute2Provider.this.setDynamicRouteDescriptors(routingController);
        }
    }

    private class GroupRouteController extends MediaRouteProvider.DynamicGroupRouteController {
        private static final long OPTIMISTIC_VOLUME_TIMEOUT_MS = 1000;
        private final Runnable mClearOptimisticVolumeRunnable = new C2531z(this);
        final Handler mControllerHandler;
        @Nullable
        MediaRouteDescriptor mGroupRouteDescriptor;
        final String mInitialMemberRouteId;
        AtomicInteger mNextRequestId = new AtomicInteger(1);
        int mOptimisticVolume = -1;
        final SparseArray<MediaRouter.ControlRequestCallback> mPendingCallbacks = new SparseArray<>();
        @Nullable
        final Messenger mReceiveMessenger;
        final MediaRouter2.RoutingController mRoutingController;
        @Nullable
        final Messenger mServiceMessenger;

        class ReceiveHandler extends Handler {
            ReceiveHandler() {
                super(Looper.getMainLooper());
            }

            public void handleMessage(Message message) {
                String str;
                int i = message.what;
                int i2 = message.arg1;
                Object obj = message.obj;
                Bundle peekData = message.peekData();
                MediaRouter.ControlRequestCallback controlRequestCallback = GroupRouteController.this.mPendingCallbacks.get(i2);
                if (controlRequestCallback == null) {
                    Log.w(MediaRoute2Provider.TAG, "Pending callback not found for control request.");
                    return;
                }
                GroupRouteController.this.mPendingCallbacks.remove(i2);
                if (i == 3) {
                    controlRequestCallback.onResult((Bundle) obj);
                } else if (i == 4) {
                    if (peekData == null) {
                        str = null;
                    } else {
                        str = peekData.getString(MediaRouteProviderProtocol.SERVICE_DATA_ERROR);
                    }
                    controlRequestCallback.onError(str, (Bundle) obj);
                }
            }
        }

        GroupRouteController(@NonNull MediaRouter2.RoutingController routingController, @NonNull String str) {
            Messenger messenger;
            this.mRoutingController = routingController;
            this.mInitialMemberRouteId = str;
            Messenger messengerFromRoutingController = MediaRoute2Provider.getMessengerFromRoutingController(routingController);
            this.mServiceMessenger = messengerFromRoutingController;
            if (messengerFromRoutingController == null) {
                messenger = null;
            } else {
                messenger = new Messenger(new ReceiveHandler());
            }
            this.mReceiveMessenger = messenger;
            this.mControllerHandler = new Handler(Looper.getMainLooper());
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void lambda$new$0() {
            this.mOptimisticVolume = -1;
        }

        private void scheduleClearOptimisticVolume() {
            this.mControllerHandler.removeCallbacks(this.mClearOptimisticVolumeRunnable);
            this.mControllerHandler.postDelayed(this.mClearOptimisticVolumeRunnable, 1000);
        }

        public String getGroupRouteId() {
            MediaRouteDescriptor mediaRouteDescriptor = this.mGroupRouteDescriptor;
            if (mediaRouteDescriptor != null) {
                return mediaRouteDescriptor.getId();
            }
            return this.mRoutingController.getId();
        }

        public void onAddMemberRoute(@NonNull String str) {
            if (str == null || str.isEmpty()) {
                Log.w(MediaRoute2Provider.TAG, "onAddMemberRoute: Ignoring null or empty routeId.");
                return;
            }
            MediaRoute2Info routeById = MediaRoute2Provider.this.getRouteById(str);
            if (routeById == null) {
                Log.w(MediaRoute2Provider.TAG, "onAddMemberRoute: Specified route not found. routeId=" + str);
                return;
            }
            this.mRoutingController.selectRoute(routeById);
        }

        public boolean onControlRequest(Intent intent, @Nullable MediaRouter.ControlRequestCallback controlRequestCallback) {
            MediaRouter2.RoutingController routingController = this.mRoutingController;
            if (!(routingController == null || routingController.isReleased() || this.mServiceMessenger == null)) {
                int andIncrement = this.mNextRequestId.getAndIncrement();
                Message obtain = Message.obtain();
                obtain.what = 9;
                obtain.arg1 = andIncrement;
                obtain.obj = intent;
                obtain.replyTo = this.mReceiveMessenger;
                try {
                    this.mServiceMessenger.send(obtain);
                    if (controlRequestCallback == null) {
                        return true;
                    }
                    this.mPendingCallbacks.put(andIncrement, controlRequestCallback);
                    return true;
                } catch (DeadObjectException unused) {
                } catch (RemoteException e) {
                    Log.e(MediaRoute2Provider.TAG, "Could not send control request to service.", e);
                }
            }
            return false;
        }

        public void onRelease() {
            this.mRoutingController.release();
        }

        public void onRemoveMemberRoute(String str) {
            if (str == null || str.isEmpty()) {
                Log.w(MediaRoute2Provider.TAG, "onRemoveMemberRoute: Ignoring null or empty routeId.");
                return;
            }
            MediaRoute2Info routeById = MediaRoute2Provider.this.getRouteById(str);
            if (routeById == null) {
                Log.w(MediaRoute2Provider.TAG, "onRemoveMemberRoute: Specified route not found. routeId=" + str);
                return;
            }
            this.mRoutingController.deselectRoute(routeById);
        }

        public void onSetVolume(int i) {
            MediaRouter2.RoutingController routingController = this.mRoutingController;
            if (routingController != null) {
                routingController.setVolume(i);
                this.mOptimisticVolume = i;
                scheduleClearOptimisticVolume();
            }
        }

        public void onUpdateMemberRoutes(@Nullable List<String> list) {
            if (list == null || list.isEmpty()) {
                Log.w(MediaRoute2Provider.TAG, "onUpdateMemberRoutes: Ignoring null or empty routeIds.");
                return;
            }
            String str = list.get(0);
            MediaRoute2Info routeById = MediaRoute2Provider.this.getRouteById(str);
            if (routeById == null) {
                Log.w(MediaRoute2Provider.TAG, "onUpdateMemberRoutes: Specified route not found. routeId=" + str);
                return;
            }
            MediaRoute2Provider.this.mMediaRouter2.transferTo(routeById);
        }

        public void onUpdateVolume(int i) {
            MediaRouter2.RoutingController routingController = this.mRoutingController;
            if (routingController != null) {
                int i2 = this.mOptimisticVolume;
                if (i2 < 0) {
                    i2 = routingController.getVolume();
                }
                int max = Math.max(0, Math.min(i2 + i, this.mRoutingController.getVolumeMax()));
                this.mOptimisticVolume = max;
                this.mRoutingController.setVolume(max);
                scheduleClearOptimisticVolume();
            }
        }

        /* access modifiers changed from: package-private */
        public void setGroupRouteDescriptor(@NonNull MediaRouteDescriptor mediaRouteDescriptor) {
            this.mGroupRouteDescriptor = mediaRouteDescriptor;
        }

        /* access modifiers changed from: package-private */
        public void setMemberRouteVolume(@NonNull String str, int i) {
            MediaRouter2.RoutingController routingController = this.mRoutingController;
            if (routingController != null && !routingController.isReleased() && this.mServiceMessenger != null) {
                int andIncrement = this.mNextRequestId.getAndIncrement();
                Message obtain = Message.obtain();
                obtain.what = 7;
                obtain.arg1 = andIncrement;
                Bundle bundle = new Bundle();
                bundle.putInt(MediaRouteProviderProtocol.CLIENT_DATA_VOLUME, i);
                bundle.putString(MediaRouteProviderProtocol.CLIENT_DATA_ROUTE_ID, str);
                obtain.setData(bundle);
                obtain.replyTo = this.mReceiveMessenger;
                try {
                    this.mServiceMessenger.send(obtain);
                } catch (DeadObjectException unused) {
                } catch (RemoteException e) {
                    Log.e(MediaRoute2Provider.TAG, "Could not send control request to service.", e);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void updateMemberRouteVolume(@NonNull String str, int i) {
            MediaRouter2.RoutingController routingController = this.mRoutingController;
            if (routingController != null && !routingController.isReleased() && this.mServiceMessenger != null) {
                int andIncrement = this.mNextRequestId.getAndIncrement();
                Message obtain = Message.obtain();
                obtain.what = 8;
                obtain.arg1 = andIncrement;
                Bundle bundle = new Bundle();
                bundle.putInt(MediaRouteProviderProtocol.CLIENT_DATA_VOLUME, i);
                bundle.putString(MediaRouteProviderProtocol.CLIENT_DATA_ROUTE_ID, str);
                obtain.setData(bundle);
                obtain.replyTo = this.mReceiveMessenger;
                try {
                    this.mServiceMessenger.send(obtain);
                } catch (DeadObjectException unused) {
                } catch (RemoteException e) {
                    Log.e(MediaRoute2Provider.TAG, "Could not send control request to service.", e);
                }
            }
        }
    }

    private class MemberRouteController extends MediaRouteProvider.RouteController {
        final GroupRouteController mGroupRouteController;
        final String mOriginalRouteId;

        MemberRouteController(@Nullable String str, @Nullable GroupRouteController groupRouteController) {
            this.mOriginalRouteId = str;
            this.mGroupRouteController = groupRouteController;
        }

        public void onSetVolume(int i) {
            GroupRouteController groupRouteController;
            String str = this.mOriginalRouteId;
            if (str != null && (groupRouteController = this.mGroupRouteController) != null) {
                groupRouteController.setMemberRouteVolume(str, i);
            }
        }

        public void onUpdateVolume(int i) {
            GroupRouteController groupRouteController;
            String str = this.mOriginalRouteId;
            if (str != null && (groupRouteController = this.mGroupRouteController) != null) {
                groupRouteController.updateMemberRouteVolume(str, i);
            }
        }
    }

    private class RouteCallback extends MediaRouter2.RouteCallback {
        RouteCallback() {
        }

        public void onRoutesAdded(@NonNull List<MediaRoute2Info> list) {
            MediaRoute2Provider.this.refreshRoutes();
        }

        public void onRoutesChanged(@NonNull List<MediaRoute2Info> list) {
            MediaRoute2Provider.this.refreshRoutes();
        }

        public void onRoutesRemoved(@NonNull List<MediaRoute2Info> list) {
            MediaRoute2Provider.this.refreshRoutes();
        }
    }

    private class TransferCallback extends MediaRouter2.TransferCallback {
        TransferCallback() {
        }

        public void onStop(@NonNull MediaRouter2.RoutingController routingController) {
            MediaRouteProvider.RouteController remove = MediaRoute2Provider.this.mControllerMap.remove(routingController);
            if (remove != null) {
                MediaRoute2Provider.this.mCallback.onReleaseController(remove);
                return;
            }
            Log.w(MediaRoute2Provider.TAG, "onStop: No matching routeController found. routingController=" + routingController);
        }

        public void onTransfer(@NonNull MediaRouter2.RoutingController routingController, @NonNull MediaRouter2.RoutingController routingController2) {
            MediaRoute2Provider.this.mControllerMap.remove(routingController);
            if (routingController2 == MediaRoute2Provider.this.mMediaRouter2.getSystemController()) {
                MediaRoute2Provider.this.mCallback.onSelectFallbackRoute(3);
                return;
            }
            List a = routingController2.getSelectedRoutes();
            if (a.isEmpty()) {
                Log.w(MediaRoute2Provider.TAG, "Selected routes are empty. This shouldn't happen.");
                return;
            }
            String a2 = ((MediaRoute2Info) a.get(0)).getId();
            MediaRoute2Provider.this.mControllerMap.put(routingController2, new GroupRouteController(routingController2, a2));
            MediaRoute2Provider.this.mCallback.onSelectRoute(a2, 3);
            MediaRoute2Provider.this.setDynamicRouteDescriptors(routingController2);
        }

        public void onTransferFailure(@NonNull MediaRoute2Info mediaRoute2Info) {
            Log.w(MediaRoute2Provider.TAG, "Transfer failed. requestedRoute=" + mediaRoute2Info);
        }
    }

    MediaRoute2Provider(@NonNull Context context, @NonNull Callback callback) {
        super(context);
        this.mMediaRouter2 = MediaRouter2.getInstance(context);
        this.mCallback = callback;
        Handler handler = new Handler(Looper.getMainLooper());
        this.mHandler = handler;
        Objects.requireNonNull(handler);
        this.mHandlerExecutor = new C1978b(handler);
    }

    @Nullable
    static Messenger getMessengerFromRoutingController(@Nullable MediaRouter2.RoutingController routingController) {
        Bundle a;
        if (routingController == null || (a = routingController.getControlHints()) == null) {
            return null;
        }
        return (Messenger) a.getParcelable("androidx.mediarouter.media.KEY_MESSENGER");
    }

    @Nullable
    static String getSessionIdForRouteController(@Nullable MediaRouteProvider.RouteController routeController) {
        MediaRouter2.RoutingController routingController;
        if ((routeController instanceof GroupRouteController) && (routingController = ((GroupRouteController) routeController).mRoutingController) != null) {
            return routingController.getId();
        }
        return null;
    }

    private MediaRouteDiscoveryRequest updateDiscoveryRequest(@Nullable MediaRouteDiscoveryRequest mediaRouteDiscoveryRequest, boolean z) {
        if (mediaRouteDiscoveryRequest == null) {
            mediaRouteDiscoveryRequest = new MediaRouteDiscoveryRequest(MediaRouteSelector.EMPTY, false);
        }
        List<String> controlCategories = mediaRouteDiscoveryRequest.getSelector().getControlCategories();
        if (!z) {
            controlCategories.remove(MediaControlIntent.CATEGORY_LIVE_AUDIO);
        } else if (!controlCategories.contains(MediaControlIntent.CATEGORY_LIVE_AUDIO)) {
            controlCategories.add(MediaControlIntent.CATEGORY_LIVE_AUDIO);
        }
        return new MediaRouteDiscoveryRequest(new MediaRouteSelector.Builder().addControlCategories(controlCategories).build(), mediaRouteDiscoveryRequest.isActiveScan());
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public MediaRoute2Info getRouteById(@Nullable String str) {
        if (str == null) {
            return null;
        }
        for (MediaRoute2Info next : this.mRoutes) {
            if (TextUtils.equals(next.getId(), str)) {
                return next;
            }
        }
        return null;
    }

    @Nullable
    public MediaRouteProvider.DynamicGroupRouteController onCreateDynamicGroupRouteController(@NonNull String str) {
        for (Map.Entry<MediaRouter2.RoutingController, GroupRouteController> value : this.mControllerMap.entrySet()) {
            GroupRouteController groupRouteController = (GroupRouteController) value.getValue();
            if (TextUtils.equals(str, groupRouteController.mInitialMemberRouteId)) {
                return groupRouteController;
            }
        }
        return null;
    }

    @Nullable
    public MediaRouteProvider.RouteController onCreateRouteController(@NonNull String str) {
        return new MemberRouteController(this.mRouteIdToOriginalRouteIdMap.get(str), (GroupRouteController) null);
    }

    public void onDiscoveryRequestChanged(@Nullable MediaRouteDiscoveryRequest mediaRouteDiscoveryRequest) {
        if (MediaRouter.getGlobalCallbackCount() > 0) {
            this.mMediaRouter2.registerRouteCallback(this.mHandlerExecutor, this.mRouteCallback, MediaRouter2Utils.toDiscoveryPreference(updateDiscoveryRequest(mediaRouteDiscoveryRequest, MediaRouter.isTransferToLocalEnabled())));
            this.mMediaRouter2.registerTransferCallback(this.mHandlerExecutor, this.mTransferCallback);
            this.mMediaRouter2.registerControllerCallback(this.mHandlerExecutor, this.mControllerCallback);
            return;
        }
        this.mMediaRouter2.unregisterRouteCallback(this.mRouteCallback);
        this.mMediaRouter2.unregisterTransferCallback(this.mTransferCallback);
        this.mMediaRouter2.unregisterControllerCallback(this.mControllerCallback);
    }

    /* access modifiers changed from: protected */
    public void refreshRoutes() {
        ArrayList arrayList = new ArrayList();
        ArraySet arraySet = new ArraySet();
        for (MediaRoute2Info mediaRoute2Info : this.mMediaRouter2.getRoutes()) {
            if (mediaRoute2Info != null && !arraySet.contains(mediaRoute2Info) && !mediaRoute2Info.isSystemRoute()) {
                arraySet.add(mediaRoute2Info);
                arrayList.add(mediaRoute2Info);
            }
        }
        if (!arrayList.equals(this.mRoutes)) {
            this.mRoutes = arrayList;
            this.mRouteIdToOriginalRouteIdMap.clear();
            for (MediaRoute2Info next : this.mRoutes) {
                Bundle a = next.getExtras();
                if (a == null || a.getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID") == null) {
                    Log.w(TAG, "Cannot find the original route Id. route=" + next);
                } else {
                    this.mRouteIdToOriginalRouteIdMap.put(next.getId(), a.getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID"));
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (MediaRoute2Info next2 : this.mRoutes) {
                MediaRouteDescriptor mediaRouteDescriptor = MediaRouter2Utils.toMediaRouteDescriptor(next2);
                if (next2 != null) {
                    arrayList2.add(mediaRouteDescriptor);
                }
            }
            setDescriptor(new MediaRouteProviderDescriptor.Builder().setSupportsDynamicGroupRoute(true).addRoutes(arrayList2).build());
        }
    }

    /* access modifiers changed from: package-private */
    public void setDynamicRouteDescriptors(MediaRouter2.RoutingController routingController) {
        int i;
        GroupRouteController groupRouteController = this.mControllerMap.get(routingController);
        if (groupRouteController == null) {
            Log.w(TAG, "setDynamicRouteDescriptors: No matching routeController found. routingController=" + routingController);
            return;
        }
        List a = routingController.getSelectedRoutes();
        if (a.isEmpty()) {
            Log.w(TAG, "setDynamicRouteDescriptors: No selected routes. This may happen when the selected routes become invalid.routingController=" + routingController);
            return;
        }
        List<String> routeIds = MediaRouter2Utils.getRouteIds(a);
        MediaRouteDescriptor mediaRouteDescriptor = MediaRouter2Utils.toMediaRouteDescriptor((MediaRoute2Info) a.get(0));
        Bundle a2 = routingController.getControlHints();
        String string = getContext().getString(C2410R.string.mr_dialog_default_group_name);
        MediaRouteDescriptor mediaRouteDescriptor2 = null;
        if (a2 != null) {
            try {
                String string2 = a2.getString("androidx.mediarouter.media.KEY_SESSION_NAME");
                if (!TextUtils.isEmpty(string2)) {
                    string = string2;
                }
                Bundle bundle = a2.getBundle("androidx.mediarouter.media.KEY_GROUP_ROUTE");
                if (bundle != null) {
                    mediaRouteDescriptor2 = MediaRouteDescriptor.fromBundle(bundle);
                }
            } catch (Exception e) {
                Log.w(TAG, "Exception while unparceling control hints.", e);
            }
        }
        if (mediaRouteDescriptor2 == null) {
            mediaRouteDescriptor2 = new MediaRouteDescriptor.Builder(routingController.getId(), string).setConnectionState(2).setPlaybackType(1).setVolume(routingController.getVolume()).setVolumeMax(routingController.getVolumeMax()).setVolumeHandling(routingController.getVolumeHandling()).addControlFilters(mediaRouteDescriptor.getControlFilters()).addGroupMemberIds(routeIds).build();
        }
        List<String> routeIds2 = MediaRouter2Utils.getRouteIds(routingController.getSelectableRoutes());
        List<String> routeIds3 = MediaRouter2Utils.getRouteIds(routingController.getDeselectableRoutes());
        MediaRouteProviderDescriptor descriptor = getDescriptor();
        if (descriptor == null) {
            Log.w(TAG, "setDynamicRouteDescriptors: providerDescriptor is not set.");
            return;
        }
        ArrayList arrayList = new ArrayList();
        List<MediaRouteDescriptor> routes = descriptor.getRoutes();
        if (!routes.isEmpty()) {
            for (MediaRouteDescriptor next : routes) {
                String id = next.getId();
                MediaRouteProvider.DynamicGroupRouteController.DynamicRouteDescriptor.Builder builder = new MediaRouteProvider.DynamicGroupRouteController.DynamicRouteDescriptor.Builder(next);
                if (routeIds.contains(id)) {
                    i = 3;
                } else {
                    i = 1;
                }
                arrayList.add(builder.setSelectionState(i).setIsGroupable(routeIds2.contains(id)).setIsUnselectable(routeIds3.contains(id)).setIsTransferable(true).build());
            }
        }
        groupRouteController.setGroupRouteDescriptor(mediaRouteDescriptor2);
        groupRouteController.notifyDynamicRoutesChanged(mediaRouteDescriptor2, arrayList);
    }

    public void transferTo(@NonNull String str) {
        MediaRoute2Info routeById = getRouteById(str);
        if (routeById == null) {
            Log.w(TAG, "transferTo: Specified route not found. routeId=" + str);
            return;
        }
        this.mMediaRouter2.transferTo(routeById);
    }

    @Nullable
    public MediaRouteProvider.RouteController onCreateRouteController(@NonNull String str, @NonNull String str2) {
        String str3 = this.mRouteIdToOriginalRouteIdMap.get(str);
        for (GroupRouteController next : this.mControllerMap.values()) {
            if (TextUtils.equals(str2, next.getGroupRouteId())) {
                return new MemberRouteController(str3, next);
            }
        }
        Log.w(TAG, "Could not find the matching GroupRouteController. routeId=" + str + ", routeGroupId=" + str2);
        return new MemberRouteController(str3, (GroupRouteController) null);
    }
}
