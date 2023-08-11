package androidx.mediarouter.media;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.collection.ArrayMap;
import androidx.core.content.ContextCompat;
import androidx.core.util.ObjectsCompat;
import androidx.mediarouter.media.MediaRouteDescriptor;
import androidx.mediarouter.media.MediaRouteProvider;
import androidx.mediarouter.media.MediaRouteProviderDescriptor;
import androidx.mediarouter.media.MediaRouteSelector;
import androidx.mediarouter.media.MediaRouter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public abstract class MediaRouteProviderService extends Service {
    static final boolean DEBUG = Log.isLoggable(TAG, 3);
    static final int PRIVATE_MSG_CLIENT_DIED = 1;
    public static final String SERVICE_INTERFACE = "android.media.MediaRouteProviderService";
    static final String TAG = "MediaRouteProviderSrv";
    final MediaRouteProviderServiceImpl mImpl;
    final PrivateHandler mPrivateHandler = new PrivateHandler();
    MediaRouteProvider mProvider;
    private final MediaRouteProvider.Callback mProviderCallback;
    private final ReceiveHandler mReceiveHandler;
    final Messenger mReceiveMessenger;

    interface MediaRouteProviderServiceImpl {
        void attachBaseContext(Context context);

        MediaRouteProvider.Callback getProviderCallback();

        boolean onAddMemberRoute(Messenger messenger, int i, int i2, String str);

        IBinder onBind(Intent intent);

        void onBinderDied(Messenger messenger);

        boolean onCreateDynamicGroupRouteController(Messenger messenger, int i, int i2, String str);

        boolean onCreateRouteController(Messenger messenger, int i, int i2, String str, String str2);

        boolean onRegisterClient(Messenger messenger, int i, int i2, String str);

        boolean onReleaseRouteController(Messenger messenger, int i, int i2);

        boolean onRemoveMemberRoute(Messenger messenger, int i, int i2, String str);

        boolean onRouteControlRequest(Messenger messenger, int i, int i2, Intent intent);

        boolean onSelectRoute(Messenger messenger, int i, int i2);

        boolean onSetDiscoveryRequest(Messenger messenger, int i, MediaRouteDiscoveryRequest mediaRouteDiscoveryRequest);

        boolean onSetRouteVolume(Messenger messenger, int i, int i2, int i3);

        boolean onUnregisterClient(Messenger messenger, int i);

        boolean onUnselectRoute(Messenger messenger, int i, int i2, int i3);

        boolean onUpdateMemberRoutes(Messenger messenger, int i, int i2, List<String> list);

        boolean onUpdateRouteVolume(Messenger messenger, int i, int i2, int i3);
    }

    @RequiresApi(api = 30)
    static class MediaRouteProviderServiceImplApi30 extends MediaRouteProviderServiceImplBase {
        final MediaRouteProvider.DynamicGroupRouteController.OnDynamicRoutesChangedListener mDynamicRoutesChangedListener = new C2518s0(this);
        MediaRoute2ProviderServiceAdapter mMR2ProviderServiceAdapter;

        class ClientRecord extends MediaRouteProviderServiceImplBase.ClientRecord {
            private static final long DISABLE_ROUTE_FOR_RELEASED_CONTROLLER_TIMEOUT_MS = 5000;
            private final Handler mClientHandler = new Handler(Looper.getMainLooper());
            private final Map<String, Integer> mReleasedControllerIds;
            private final Map<String, MediaRouteProvider.RouteController> mRouteIdToControllerMap = new ArrayMap();

            ClientRecord(Messenger messenger, int i, String str) {
                super(messenger, i, str);
                if (i < 4) {
                    this.mReleasedControllerIds = new ArrayMap();
                } else {
                    this.mReleasedControllerIds = Collections.emptyMap();
                }
            }

            private void disableRouteForReleasedRouteController(String str, int i) {
                this.mReleasedControllerIds.put(str, Integer.valueOf(i));
                this.mClientHandler.postDelayed(new C2520t0(this, str), DISABLE_ROUTE_FOR_RELEASED_CONTROLLER_TIMEOUT_MS);
                sendDescriptor();
            }

            /* access modifiers changed from: private */
            /* renamed from: enableRouteForReleasedRouteController */
            public void lambda$disableRouteForReleasedRouteController$0(String str) {
                if (this.mReleasedControllerIds.remove(str) != null) {
                    sendDescriptor();
                }
            }

            public Bundle createDescriptorBundle(MediaRouteProviderDescriptor mediaRouteProviderDescriptor) {
                if (this.mReleasedControllerIds.isEmpty()) {
                    return super.createDescriptorBundle(mediaRouteProviderDescriptor);
                }
                ArrayList arrayList = new ArrayList();
                for (MediaRouteDescriptor next : mediaRouteProviderDescriptor.getRoutes()) {
                    if (this.mReleasedControllerIds.containsKey(next.getId())) {
                        arrayList.add(new MediaRouteDescriptor.Builder(next).setEnabled(false).build());
                    } else {
                        arrayList.add(next);
                    }
                }
                return super.createDescriptorBundle(new MediaRouteProviderDescriptor.Builder(mediaRouteProviderDescriptor).setRoutes(arrayList).build());
            }

            public Bundle createDynamicGroupRouteController(String str, int i) {
                Bundle createDynamicGroupRouteController = super.createDynamicGroupRouteController(str, i);
                if (!(createDynamicGroupRouteController == null || this.mPackageName == null)) {
                    MediaRouteProviderServiceImplApi30.this.mMR2ProviderServiceAdapter.notifyRouteControllerAdded(this, this.mControllers.get(i), i, this.mPackageName, str);
                }
                return createDynamicGroupRouteController;
            }

            public boolean createRouteController(String str, String str2, int i) {
                MediaRouteProvider.RouteController routeController = this.mRouteIdToControllerMap.get(str);
                if (routeController != null) {
                    this.mControllers.put(i, routeController);
                    return true;
                }
                boolean createRouteController = super.createRouteController(str, str2, i);
                if (str2 == null && createRouteController && this.mPackageName != null) {
                    MediaRouteProviderServiceImplApi30.this.mMR2ProviderServiceAdapter.notifyRouteControllerAdded(this, this.mControllers.get(i), i, this.mPackageName, str);
                }
                if (createRouteController) {
                    this.mRouteIdToControllerMap.put(str, this.mControllers.get(i));
                }
                return createRouteController;
            }

            public void dispose() {
                int size = this.mControllers.size();
                for (int i = 0; i < size; i++) {
                    MediaRouteProviderServiceImplApi30.this.mMR2ProviderServiceAdapter.notifyRouteControllerRemoved(this.mControllers.keyAt(i));
                }
                this.mRouteIdToControllerMap.clear();
                super.dispose();
            }

            public MediaRouteProvider.RouteController findControllerByRouteId(String str) {
                return this.mRouteIdToControllerMap.get(str);
            }

            public int findControllerIdByController(MediaRouteProvider.RouteController routeController) {
                int indexOfValue = this.mControllers.indexOfValue(routeController);
                if (indexOfValue < 0) {
                    return -1;
                }
                return this.mControllers.keyAt(indexOfValue);
            }

            /* access modifiers changed from: package-private */
            public void releaseControllerByProvider(MediaRouteProvider.RouteController routeController, String str) {
                int findControllerIdByController = findControllerIdByController(routeController);
                releaseRouteController(findControllerIdByController);
                if (this.mVersion < 4) {
                    disableRouteForReleasedRouteController(str, findControllerIdByController);
                } else if (findControllerIdByController < 0) {
                    Log.w(MediaRouteProviderService.TAG, "releaseControllerByProvider: Can't find the controller. route ID=" + str);
                } else {
                    MediaRouteProviderService.sendMessage(this.mMessenger, 8, 0, findControllerIdByController, (Object) null, (Bundle) null);
                }
            }

            public boolean releaseRouteController(int i) {
                MediaRouteProviderServiceImplApi30.this.mMR2ProviderServiceAdapter.notifyRouteControllerRemoved(i);
                MediaRouteProvider.RouteController routeController = this.mControllers.get(i);
                if (routeController != null) {
                    Iterator<Map.Entry<String, MediaRouteProvider.RouteController>> it = this.mRouteIdToControllerMap.entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Map.Entry next = it.next();
                        if (next.getValue() == routeController) {
                            this.mRouteIdToControllerMap.remove(next.getKey());
                            break;
                        }
                    }
                }
                Iterator<Map.Entry<String, Integer>> it2 = this.mReleasedControllerIds.entrySet().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Map.Entry next2 = it2.next();
                    if (((Integer) next2.getValue()).intValue() == i) {
                        lambda$disableRouteForReleasedRouteController$0((String) next2.getKey());
                        break;
                    }
                }
                return super.releaseRouteController(i);
            }

            /* access modifiers changed from: package-private */
            public void sendDescriptor() {
                MediaRouteProviderDescriptor descriptor = MediaRouteProviderServiceImplApi30.this.getService().getMediaRouteProvider().getDescriptor();
                if (descriptor != null) {
                    MediaRouteProviderService.sendMessage(this.mMessenger, 5, 0, 0, createDescriptorBundle(descriptor), (Bundle) null);
                }
            }

            /* access modifiers changed from: package-private */
            public void sendDynamicRouteDescriptors(MediaRouteProvider.DynamicGroupRouteController dynamicGroupRouteController, MediaRouteDescriptor mediaRouteDescriptor, Collection<MediaRouteProvider.DynamicGroupRouteController.DynamicRouteDescriptor> collection) {
                super.sendDynamicRouteDescriptors(dynamicGroupRouteController, mediaRouteDescriptor, collection);
                MediaRoute2ProviderServiceAdapter mediaRoute2ProviderServiceAdapter = MediaRouteProviderServiceImplApi30.this.mMR2ProviderServiceAdapter;
                if (mediaRoute2ProviderServiceAdapter != null) {
                    mediaRoute2ProviderServiceAdapter.setDynamicRouteDescriptor(dynamicGroupRouteController, mediaRouteDescriptor, collection);
                }
            }
        }

        MediaRouteProviderServiceImplApi30(MediaRouteProviderService mediaRouteProviderService) {
            super(mediaRouteProviderService);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void lambda$new$0(MediaRouteProvider.DynamicGroupRouteController dynamicGroupRouteController, MediaRouteDescriptor mediaRouteDescriptor, Collection collection) {
            this.mMR2ProviderServiceAdapter.setDynamicRouteDescriptor(dynamicGroupRouteController, mediaRouteDescriptor, collection);
        }

        public void attachBaseContext(Context context) {
            MediaRoute2ProviderServiceAdapter mediaRoute2ProviderServiceAdapter = this.mMR2ProviderServiceAdapter;
            if (mediaRoute2ProviderServiceAdapter != null) {
                mediaRoute2ProviderServiceAdapter.attachBaseContext(context);
            }
        }

        /* access modifiers changed from: package-private */
        public MediaRouteProviderServiceImplBase.ClientRecord createClientRecord(Messenger messenger, int i, String str) {
            return new ClientRecord(messenger, i, str);
        }

        /* JADX WARNING: type inference failed for: r0v3, types: [android.app.Service, androidx.mediarouter.media.MediaRoute2ProviderServiceAdapter] */
        public IBinder onBind(Intent intent) {
            this.mService.ensureProvider();
            if (this.mMR2ProviderServiceAdapter == null) {
                this.mMR2ProviderServiceAdapter = new MediaRoute2ProviderServiceAdapter(this);
                if (this.mService.getBaseContext() != null) {
                    this.mMR2ProviderServiceAdapter.attachBaseContext(this.mService);
                }
            }
            IBinder onBind = super.onBind(intent);
            if (onBind != null) {
                return onBind;
            }
            return this.mMR2ProviderServiceAdapter.onBind(intent);
        }

        /* access modifiers changed from: package-private */
        public void sendDescriptorChanged(MediaRouteProviderDescriptor mediaRouteProviderDescriptor) {
            super.sendDescriptorChanged(mediaRouteProviderDescriptor);
            this.mMR2ProviderServiceAdapter.setProviderDescriptor(mediaRouteProviderDescriptor);
        }

        /* access modifiers changed from: package-private */
        public void setDynamicRoutesChangedListener(MediaRouteProvider.DynamicGroupRouteController dynamicGroupRouteController) {
            dynamicGroupRouteController.setOnDynamicRoutesChangedListener(ContextCompat.getMainExecutor(this.mService.getApplicationContext()), this.mDynamicRoutesChangedListener);
        }
    }

    private final class PrivateHandler extends Handler {
        PrivateHandler() {
        }

        public void handleMessage(Message message) {
            if (message.what == 1) {
                MediaRouteProviderService.this.mImpl.onBinderDied((Messenger) message.obj);
            }
        }
    }

    private static final class ReceiveHandler extends Handler {
        private final WeakReference<MediaRouteProviderService> mServiceRef;

        public ReceiveHandler(MediaRouteProviderService mediaRouteProviderService) {
            this.mServiceRef = new WeakReference<>(mediaRouteProviderService);
        }

        private boolean processMessage(int i, Messenger messenger, int i2, int i3, Object obj, Bundle bundle, String str) {
            MediaRouteProviderService mediaRouteProviderService = this.mServiceRef.get();
            int i4 = 0;
            if (mediaRouteProviderService != null) {
                switch (i) {
                    case 1:
                        return mediaRouteProviderService.mImpl.onRegisterClient(messenger, i2, i3, str);
                    case 2:
                        return mediaRouteProviderService.mImpl.onUnregisterClient(messenger, i2);
                    case 3:
                        String string = bundle.getString(MediaRouteProviderProtocol.CLIENT_DATA_ROUTE_ID);
                        String string2 = bundle.getString(MediaRouteProviderProtocol.CLIENT_DATA_ROUTE_LIBRARY_GROUP);
                        if (string != null) {
                            return mediaRouteProviderService.mImpl.onCreateRouteController(messenger, i2, i3, string, string2);
                        }
                        break;
                    case 4:
                        return mediaRouteProviderService.mImpl.onReleaseRouteController(messenger, i2, i3);
                    case 5:
                        return mediaRouteProviderService.mImpl.onSelectRoute(messenger, i2, i3);
                    case 6:
                        if (bundle != null) {
                            i4 = bundle.getInt(MediaRouteProviderProtocol.CLIENT_DATA_UNSELECT_REASON, 0);
                        }
                        return mediaRouteProviderService.mImpl.onUnselectRoute(messenger, i2, i3, i4);
                    case 7:
                        int i5 = bundle.getInt(MediaRouteProviderProtocol.CLIENT_DATA_VOLUME, -1);
                        if (i5 >= 0) {
                            return mediaRouteProviderService.mImpl.onSetRouteVolume(messenger, i2, i3, i5);
                        }
                        break;
                    case 8:
                        int i6 = bundle.getInt(MediaRouteProviderProtocol.CLIENT_DATA_VOLUME, 0);
                        if (i6 != 0) {
                            return mediaRouteProviderService.mImpl.onUpdateRouteVolume(messenger, i2, i3, i6);
                        }
                        break;
                    case 9:
                        if (obj instanceof Intent) {
                            return mediaRouteProviderService.mImpl.onRouteControlRequest(messenger, i2, i3, (Intent) obj);
                        }
                        break;
                    case 10:
                        if (obj == null || (obj instanceof Bundle)) {
                            MediaRouteDiscoveryRequest fromBundle = MediaRouteDiscoveryRequest.fromBundle((Bundle) obj);
                            MediaRouteProviderServiceImpl mediaRouteProviderServiceImpl = mediaRouteProviderService.mImpl;
                            if (fromBundle == null || !fromBundle.isValid()) {
                                fromBundle = null;
                            }
                            return mediaRouteProviderServiceImpl.onSetDiscoveryRequest(messenger, i2, fromBundle);
                        }
                    case 11:
                        String string3 = bundle.getString(MediaRouteProviderProtocol.CLIENT_DATA_MEMBER_ROUTE_ID);
                        if (string3 != null) {
                            return mediaRouteProviderService.mImpl.onCreateDynamicGroupRouteController(messenger, i2, i3, string3);
                        }
                        break;
                    case 12:
                        String string4 = bundle.getString(MediaRouteProviderProtocol.CLIENT_DATA_MEMBER_ROUTE_ID);
                        if (string4 != null) {
                            return mediaRouteProviderService.mImpl.onAddMemberRoute(messenger, i2, i3, string4);
                        }
                        break;
                    case 13:
                        String string5 = bundle.getString(MediaRouteProviderProtocol.CLIENT_DATA_MEMBER_ROUTE_ID);
                        if (string5 != null) {
                            return mediaRouteProviderService.mImpl.onRemoveMemberRoute(messenger, i2, i3, string5);
                        }
                        break;
                    case 14:
                        ArrayList<String> stringArrayList = bundle.getStringArrayList(MediaRouteProviderProtocol.CLIENT_DATA_MEMBER_ROUTE_IDS);
                        if (stringArrayList != null) {
                            return mediaRouteProviderService.mImpl.onUpdateMemberRoutes(messenger, i2, i3, stringArrayList);
                        }
                        break;
                }
            }
            return false;
        }

        public void handleMessage(Message message) {
            String str;
            String[] packagesForUid;
            Message message2 = message;
            Messenger messenger = message2.replyTo;
            if (MediaRouteProviderProtocol.isValidRemoteMessenger(messenger)) {
                int i = message2.what;
                int i2 = message2.arg1;
                int i3 = message2.arg2;
                Object obj = message2.obj;
                Bundle peekData = message.peekData();
                if (i != 1 || (packagesForUid = this.mServiceRef.get().getPackageManager().getPackagesForUid(message2.sendingUid)) == null || packagesForUid.length <= 0) {
                    str = null;
                } else {
                    str = packagesForUid[0];
                }
                if (!processMessage(i, messenger, i2, i3, obj, peekData, str)) {
                    if (MediaRouteProviderService.DEBUG) {
                        Log.d(MediaRouteProviderService.TAG, MediaRouteProviderService.getClientId(messenger) + ": Message failed, what=" + i + ", requestId=" + i2 + ", arg=" + i3 + ", obj=" + obj + ", data=" + peekData);
                    }
                    MediaRouteProviderService.sendGenericFailure(messenger, i2);
                    return;
                }
                return;
            }
            if (MediaRouteProviderService.DEBUG) {
                Log.d(MediaRouteProviderService.TAG, "Ignoring message without valid reply messenger.");
            }
        }
    }

    public MediaRouteProviderService() {
        ReceiveHandler receiveHandler = new ReceiveHandler(this);
        this.mReceiveHandler = receiveHandler;
        this.mReceiveMessenger = new Messenger(receiveHandler);
        if (Build.VERSION.SDK_INT >= 30) {
            this.mImpl = new MediaRouteProviderServiceImplApi30(this);
        } else {
            this.mImpl = new MediaRouteProviderServiceImplBase(this);
        }
        this.mProviderCallback = this.mImpl.getProviderCallback();
    }

    @VisibleForTesting
    static Bundle createDescriptorBundleForClientVersion(MediaRouteProviderDescriptor mediaRouteProviderDescriptor, int i) {
        if (mediaRouteProviderDescriptor == null) {
            return null;
        }
        MediaRouteProviderDescriptor.Builder builder = new MediaRouteProviderDescriptor.Builder(mediaRouteProviderDescriptor);
        builder.setRoutes((Collection<MediaRouteDescriptor>) null);
        if (i < 4) {
            builder.setSupportsDynamicGroupRoute(false);
        }
        for (MediaRouteDescriptor next : mediaRouteProviderDescriptor.getRoutes()) {
            if (i >= next.getMinClientVersion() && i <= next.getMaxClientVersion()) {
                builder.addRoute(next);
            }
        }
        return builder.build().asBundle();
    }

    static String getClientId(Messenger messenger) {
        return "Client connection " + messenger.getBinder().toString();
    }

    static void sendGenericFailure(Messenger messenger, int i) {
        if (i != 0) {
            sendMessage(messenger, 0, i, 0, (Object) null, (Bundle) null);
        }
    }

    static void sendGenericSuccess(Messenger messenger, int i) {
        if (i != 0) {
            sendMessage(messenger, 1, i, 0, (Object) null, (Bundle) null);
        }
    }

    static void sendMessage(Messenger messenger, int i, int i2, int i3, Object obj, Bundle bundle) {
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
            Log.e(TAG, "Could not send message to " + getClientId(messenger), e);
        }
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(@NonNull Context context) {
        super.attachBaseContext(context);
        this.mImpl.attachBaseContext(context);
    }

    /* access modifiers changed from: package-private */
    public void ensureProvider() {
        MediaRouteProvider onCreateMediaRouteProvider;
        if (this.mProvider == null && (onCreateMediaRouteProvider = onCreateMediaRouteProvider()) != null) {
            String packageName = onCreateMediaRouteProvider.getMetadata().getPackageName();
            if (packageName.equals(getPackageName())) {
                this.mProvider = onCreateMediaRouteProvider;
                onCreateMediaRouteProvider.setCallback(this.mProviderCallback);
                return;
            }
            throw new IllegalStateException("onCreateMediaRouteProvider() returned a provider whose package name does not match the package name of the service.  A media route provider service can only export its own media route providers.  Provider package name: " + packageName + ".  Service package name: " + getPackageName() + ".");
        }
    }

    @Nullable
    public MediaRouteProvider getMediaRouteProvider() {
        return this.mProvider;
    }

    @Nullable
    public IBinder onBind(@NonNull Intent intent) {
        return this.mImpl.onBind(intent);
    }

    @Nullable
    public abstract MediaRouteProvider onCreateMediaRouteProvider();

    public void onDestroy() {
        MediaRouteProvider mediaRouteProvider = this.mProvider;
        if (mediaRouteProvider != null) {
            mediaRouteProvider.setCallback((MediaRouteProvider.Callback) null);
        }
        super.onDestroy();
    }

    static class MediaRouteProviderServiceImplBase implements MediaRouteProviderServiceImpl {
        private final MediaRouterActiveScanThrottlingHelper mActiveScanThrottlingHelper = new MediaRouterActiveScanThrottlingHelper(new Runnable() {
            public void run() {
                MediaRouteProviderServiceImplBase.this.updateCompositeDiscoveryRequest();
            }
        });
        MediaRouteDiscoveryRequest mBaseDiscoveryRequest;
        long mBaseDiscoveryRequestTimestamp;
        final ArrayList<ClientRecord> mClients = new ArrayList<>();
        MediaRouteDiscoveryRequest mCompositeDiscoveryRequest;
        final MediaRouteProviderService mService;

        class ClientRecord implements IBinder.DeathRecipient {
            final SparseArray<MediaRouteProvider.RouteController> mControllers = new SparseArray<>();
            public MediaRouteDiscoveryRequest mDiscoveryRequest;
            public long mDiscoveryRequestTimestamp;
            final MediaRouteProvider.DynamicGroupRouteController.OnDynamicRoutesChangedListener mDynamicRoutesChangedListener = new MediaRouteProvider.DynamicGroupRouteController.OnDynamicRoutesChangedListener() {
                public void onRoutesChanged(@NonNull MediaRouteProvider.DynamicGroupRouteController dynamicGroupRouteController, @NonNull MediaRouteDescriptor mediaRouteDescriptor, @NonNull Collection<MediaRouteProvider.DynamicGroupRouteController.DynamicRouteDescriptor> collection) {
                    ClientRecord.this.sendDynamicRouteDescriptors(dynamicGroupRouteController, mediaRouteDescriptor, collection);
                }
            };
            public final Messenger mMessenger;
            public final String mPackageName;
            public final int mVersion;

            ClientRecord(Messenger messenger, int i, String str) {
                this.mMessenger = messenger;
                this.mVersion = i;
                this.mPackageName = str;
            }

            public void binderDied() {
                MediaRouteProviderServiceImplBase.this.mService.mPrivateHandler.obtainMessage(1, this.mMessenger).sendToTarget();
            }

            public Bundle createDescriptorBundle(MediaRouteProviderDescriptor mediaRouteProviderDescriptor) {
                return MediaRouteProviderService.createDescriptorBundleForClientVersion(mediaRouteProviderDescriptor, this.mVersion);
            }

            public Bundle createDynamicGroupRouteController(String str, int i) {
                MediaRouteProvider.DynamicGroupRouteController onCreateDynamicGroupRouteController;
                if (this.mControllers.indexOfKey(i) >= 0 || (onCreateDynamicGroupRouteController = MediaRouteProviderServiceImplBase.this.mService.getMediaRouteProvider().onCreateDynamicGroupRouteController(str)) == null) {
                    return null;
                }
                onCreateDynamicGroupRouteController.setOnDynamicRoutesChangedListener(ContextCompat.getMainExecutor(MediaRouteProviderServiceImplBase.this.mService.getApplicationContext()), this.mDynamicRoutesChangedListener);
                this.mControllers.put(i, onCreateDynamicGroupRouteController);
                Bundle bundle = new Bundle();
                bundle.putString(MediaRouteProviderProtocol.DATA_KEY_GROUPABLE_SECION_TITLE, onCreateDynamicGroupRouteController.getGroupableSelectionTitle());
                bundle.putString(MediaRouteProviderProtocol.DATA_KEY_TRANSFERABLE_SECTION_TITLE, onCreateDynamicGroupRouteController.getTransferableSectionTitle());
                return bundle;
            }

            public boolean createRouteController(String str, String str2, int i) {
                MediaRouteProvider.RouteController routeController;
                if (this.mControllers.indexOfKey(i) >= 0) {
                    return false;
                }
                if (str2 == null) {
                    routeController = MediaRouteProviderServiceImplBase.this.mService.getMediaRouteProvider().onCreateRouteController(str);
                } else {
                    routeController = MediaRouteProviderServiceImplBase.this.mService.getMediaRouteProvider().onCreateRouteController(str, str2);
                }
                if (routeController == null) {
                    return false;
                }
                this.mControllers.put(i, routeController);
                return true;
            }

            public void dispose() {
                int size = this.mControllers.size();
                for (int i = 0; i < size; i++) {
                    this.mControllers.valueAt(i).onRelease();
                }
                this.mControllers.clear();
                this.mMessenger.getBinder().unlinkToDeath(this, 0);
                setDiscoveryRequest((MediaRouteDiscoveryRequest) null);
            }

            public MediaRouteProvider.RouteController getRouteController(int i) {
                return this.mControllers.get(i);
            }

            public boolean hasMessenger(Messenger messenger) {
                if (this.mMessenger.getBinder() == messenger.getBinder()) {
                    return true;
                }
                return false;
            }

            public boolean register() {
                try {
                    this.mMessenger.getBinder().linkToDeath(this, 0);
                    return true;
                } catch (RemoteException unused) {
                    binderDied();
                    return false;
                }
            }

            public boolean releaseRouteController(int i) {
                MediaRouteProvider.RouteController routeController = this.mControllers.get(i);
                if (routeController == null) {
                    return false;
                }
                this.mControllers.remove(i);
                routeController.onRelease();
                return true;
            }

            /* access modifiers changed from: package-private */
            public void sendDynamicRouteDescriptors(MediaRouteProvider.DynamicGroupRouteController dynamicGroupRouteController, MediaRouteDescriptor mediaRouteDescriptor, Collection<MediaRouteProvider.DynamicGroupRouteController.DynamicRouteDescriptor> collection) {
                int indexOfValue = this.mControllers.indexOfValue(dynamicGroupRouteController);
                if (indexOfValue < 0) {
                    Log.w(MediaRouteProviderService.TAG, "Ignoring unknown dynamic group route controller: " + dynamicGroupRouteController);
                    return;
                }
                int keyAt = this.mControllers.keyAt(indexOfValue);
                ArrayList arrayList = new ArrayList();
                for (MediaRouteProvider.DynamicGroupRouteController.DynamicRouteDescriptor bundle : collection) {
                    arrayList.add(bundle.toBundle());
                }
                Bundle bundle2 = new Bundle();
                if (mediaRouteDescriptor != null) {
                    bundle2.putParcelable(MediaRouteProviderProtocol.DATA_KEY_GROUP_ROUTE_DESCRIPTOR, mediaRouteDescriptor.asBundle());
                }
                bundle2.putParcelableArrayList(MediaRouteProviderProtocol.DATA_KEY_DYNAMIC_ROUTE_DESCRIPTORS, arrayList);
                MediaRouteProviderService.sendMessage(this.mMessenger, 7, 0, keyAt, bundle2, (Bundle) null);
            }

            public boolean setDiscoveryRequest(MediaRouteDiscoveryRequest mediaRouteDiscoveryRequest) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (ObjectsCompat.equals(this.mDiscoveryRequest, mediaRouteDiscoveryRequest)) {
                    return false;
                }
                this.mDiscoveryRequest = mediaRouteDiscoveryRequest;
                this.mDiscoveryRequestTimestamp = elapsedRealtime;
                return MediaRouteProviderServiceImplBase.this.updateCompositeDiscoveryRequest();
            }

            public String toString() {
                return MediaRouteProviderService.getClientId(this.mMessenger);
            }
        }

        class ProviderCallbackBase extends MediaRouteProvider.Callback {
            ProviderCallbackBase() {
            }

            public void onDescriptorChanged(@NonNull MediaRouteProvider mediaRouteProvider, MediaRouteProviderDescriptor mediaRouteProviderDescriptor) {
                MediaRouteProviderServiceImplBase.this.sendDescriptorChanged(mediaRouteProviderDescriptor);
            }
        }

        MediaRouteProviderServiceImplBase(MediaRouteProviderService mediaRouteProviderService) {
            this.mService = mediaRouteProviderService;
        }

        private ClientRecord getClient(Messenger messenger) {
            int findClient = findClient(messenger);
            if (findClient >= 0) {
                return this.mClients.get(findClient);
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public ClientRecord createClientRecord(Messenger messenger, int i, String str) {
            return new ClientRecord(messenger, i, str);
        }

        /* access modifiers changed from: package-private */
        public int findClient(Messenger messenger) {
            int size = this.mClients.size();
            for (int i = 0; i < size; i++) {
                if (this.mClients.get(i).hasMessenger(messenger)) {
                    return i;
                }
            }
            return -1;
        }

        public MediaRouteProvider.Callback getProviderCallback() {
            return new ProviderCallbackBase();
        }

        public MediaRouteProviderService getService() {
            return this.mService;
        }

        public boolean onAddMemberRoute(Messenger messenger, int i, int i2, String str) {
            ClientRecord client = getClient(messenger);
            if (client == null) {
                return false;
            }
            MediaRouteProvider.RouteController routeController = client.getRouteController(i2);
            if (!(routeController instanceof MediaRouteProvider.DynamicGroupRouteController)) {
                return false;
            }
            ((MediaRouteProvider.DynamicGroupRouteController) routeController).onAddMemberRoute(str);
            if (MediaRouteProviderService.DEBUG) {
                Log.d(MediaRouteProviderService.TAG, client + ": Added a member route, controllerId=" + i2 + ", memberId=" + str);
            }
            MediaRouteProviderService.sendGenericSuccess(messenger, i);
            return true;
        }

        public IBinder onBind(Intent intent) {
            if (!intent.getAction().equals("android.media.MediaRouteProviderService")) {
                return null;
            }
            this.mService.ensureProvider();
            if (this.mService.getMediaRouteProvider() != null) {
                return this.mService.mReceiveMessenger.getBinder();
            }
            return null;
        }

        public void onBinderDied(Messenger messenger) {
            int findClient = findClient(messenger);
            if (findClient >= 0) {
                ClientRecord remove = this.mClients.remove(findClient);
                if (MediaRouteProviderService.DEBUG) {
                    Log.d(MediaRouteProviderService.TAG, remove + ": Binder died");
                }
                remove.dispose();
            }
        }

        public boolean onCreateDynamicGroupRouteController(Messenger messenger, int i, int i2, String str) {
            Bundle createDynamicGroupRouteController;
            ClientRecord client = getClient(messenger);
            if (client == null || (createDynamicGroupRouteController = client.createDynamicGroupRouteController(str, i2)) == null) {
                return false;
            }
            if (MediaRouteProviderService.DEBUG) {
                Log.d(MediaRouteProviderService.TAG, client + ": Route controller created, controllerId=" + i2 + ", initialMemberRouteId=" + str);
            }
            MediaRouteProviderService.sendMessage(messenger, 6, i, 3, createDynamicGroupRouteController, (Bundle) null);
            return true;
        }

        public boolean onCreateRouteController(Messenger messenger, int i, int i2, String str, String str2) {
            ClientRecord client = getClient(messenger);
            if (client == null || !client.createRouteController(str, str2, i2)) {
                return false;
            }
            if (MediaRouteProviderService.DEBUG) {
                Log.d(MediaRouteProviderService.TAG, client + ": Route controller created, controllerId=" + i2 + ", routeId=" + str + ", routeGroupId=" + str2);
            }
            MediaRouteProviderService.sendGenericSuccess(messenger, i);
            return true;
        }

        public boolean onRegisterClient(Messenger messenger, int i, int i2, String str) {
            if (i2 < 1 || findClient(messenger) >= 0) {
                return false;
            }
            ClientRecord createClientRecord = createClientRecord(messenger, i2, str);
            if (!createClientRecord.register()) {
                return false;
            }
            this.mClients.add(createClientRecord);
            if (MediaRouteProviderService.DEBUG) {
                Log.d(MediaRouteProviderService.TAG, createClientRecord + ": Registered, version=" + i2);
            }
            if (i != 0) {
                MediaRouteProviderService.sendMessage(messenger, 2, i, 3, MediaRouteProviderService.createDescriptorBundleForClientVersion(this.mService.getMediaRouteProvider().getDescriptor(), createClientRecord.mVersion), (Bundle) null);
            }
            return true;
        }

        public boolean onReleaseRouteController(Messenger messenger, int i, int i2) {
            ClientRecord client = getClient(messenger);
            if (client == null || !client.releaseRouteController(i2)) {
                return false;
            }
            if (MediaRouteProviderService.DEBUG) {
                Log.d(MediaRouteProviderService.TAG, client + ": Route controller released, controllerId=" + i2);
            }
            MediaRouteProviderService.sendGenericSuccess(messenger, i);
            return true;
        }

        public boolean onRemoveMemberRoute(Messenger messenger, int i, int i2, String str) {
            ClientRecord client = getClient(messenger);
            if (client == null) {
                return false;
            }
            MediaRouteProvider.RouteController routeController = client.getRouteController(i2);
            if (!(routeController instanceof MediaRouteProvider.DynamicGroupRouteController)) {
                return false;
            }
            ((MediaRouteProvider.DynamicGroupRouteController) routeController).onRemoveMemberRoute(str);
            if (MediaRouteProviderService.DEBUG) {
                Log.d(MediaRouteProviderService.TAG, client + ": Removed a member route, controllerId=" + i2 + ", memberId=" + str);
            }
            MediaRouteProviderService.sendGenericSuccess(messenger, i);
            return true;
        }

        public boolean onRouteControlRequest(Messenger messenger, int i, int i2, Intent intent) {
            MediaRouteProvider.RouteController routeController;
            C24492 r9;
            ClientRecord client = getClient(messenger);
            if (client == null || (routeController = client.getRouteController(i2)) == null) {
                return false;
            }
            if (i != 0) {
                final ClientRecord clientRecord = client;
                final int i3 = i2;
                final Intent intent2 = intent;
                final Messenger messenger2 = messenger;
                final int i4 = i;
                r9 = new MediaRouter.ControlRequestCallback() {
                    public void onError(String str, Bundle bundle) {
                        if (MediaRouteProviderService.DEBUG) {
                            Log.d(MediaRouteProviderService.TAG, clientRecord + ": Route control request failed, controllerId=" + i3 + ", intent=" + intent2 + ", error=" + str + ", data=" + bundle);
                        }
                        if (MediaRouteProviderServiceImplBase.this.findClient(messenger2) < 0) {
                            return;
                        }
                        if (str != null) {
                            Bundle bundle2 = new Bundle();
                            bundle2.putString(MediaRouteProviderProtocol.SERVICE_DATA_ERROR, str);
                            MediaRouteProviderService.sendMessage(messenger2, 4, i4, 0, bundle, bundle2);
                            return;
                        }
                        MediaRouteProviderService.sendMessage(messenger2, 4, i4, 0, bundle, (Bundle) null);
                    }

                    public void onResult(Bundle bundle) {
                        if (MediaRouteProviderService.DEBUG) {
                            Log.d(MediaRouteProviderService.TAG, clientRecord + ": Route control request succeeded, controllerId=" + i3 + ", intent=" + intent2 + ", data=" + bundle);
                        }
                        if (MediaRouteProviderServiceImplBase.this.findClient(messenger2) >= 0) {
                            MediaRouteProviderService.sendMessage(messenger2, 3, i4, 0, bundle, (Bundle) null);
                        }
                    }
                };
            } else {
                r9 = null;
            }
            if (!routeController.onControlRequest(intent, r9)) {
                return false;
            }
            if (!MediaRouteProviderService.DEBUG) {
                return true;
            }
            Log.d(MediaRouteProviderService.TAG, client + ": Route control request delivered, controllerId=" + i2 + ", intent=" + intent);
            return true;
        }

        public boolean onSelectRoute(Messenger messenger, int i, int i2) {
            MediaRouteProvider.RouteController routeController;
            ClientRecord client = getClient(messenger);
            if (client == null || (routeController = client.getRouteController(i2)) == null) {
                return false;
            }
            routeController.onSelect();
            if (MediaRouteProviderService.DEBUG) {
                Log.d(MediaRouteProviderService.TAG, client + ": Route selected, controllerId=" + i2);
            }
            MediaRouteProviderService.sendGenericSuccess(messenger, i);
            return true;
        }

        public boolean onSetDiscoveryRequest(Messenger messenger, int i, MediaRouteDiscoveryRequest mediaRouteDiscoveryRequest) {
            ClientRecord client = getClient(messenger);
            if (client == null) {
                return false;
            }
            boolean discoveryRequest = client.setDiscoveryRequest(mediaRouteDiscoveryRequest);
            if (MediaRouteProviderService.DEBUG) {
                Log.d(MediaRouteProviderService.TAG, client + ": Set discovery request, request=" + mediaRouteDiscoveryRequest + ", actuallyChanged=" + discoveryRequest + ", compositeDiscoveryRequest=" + this.mCompositeDiscoveryRequest);
            }
            MediaRouteProviderService.sendGenericSuccess(messenger, i);
            return true;
        }

        public boolean onSetRouteVolume(Messenger messenger, int i, int i2, int i3) {
            MediaRouteProvider.RouteController routeController;
            ClientRecord client = getClient(messenger);
            if (client == null || (routeController = client.getRouteController(i2)) == null) {
                return false;
            }
            routeController.onSetVolume(i3);
            if (MediaRouteProviderService.DEBUG) {
                Log.d(MediaRouteProviderService.TAG, client + ": Route volume changed, controllerId=" + i2 + ", volume=" + i3);
            }
            MediaRouteProviderService.sendGenericSuccess(messenger, i);
            return true;
        }

        public boolean onUnregisterClient(Messenger messenger, int i) {
            int findClient = findClient(messenger);
            if (findClient < 0) {
                return false;
            }
            ClientRecord remove = this.mClients.remove(findClient);
            if (MediaRouteProviderService.DEBUG) {
                Log.d(MediaRouteProviderService.TAG, remove + ": Unregistered");
            }
            remove.dispose();
            MediaRouteProviderService.sendGenericSuccess(messenger, i);
            return true;
        }

        public boolean onUnselectRoute(Messenger messenger, int i, int i2, int i3) {
            MediaRouteProvider.RouteController routeController;
            ClientRecord client = getClient(messenger);
            if (client == null || (routeController = client.getRouteController(i2)) == null) {
                return false;
            }
            routeController.onUnselect(i3);
            if (MediaRouteProviderService.DEBUG) {
                Log.d(MediaRouteProviderService.TAG, client + ": Route unselected, controllerId=" + i2);
            }
            MediaRouteProviderService.sendGenericSuccess(messenger, i);
            return true;
        }

        public boolean onUpdateMemberRoutes(Messenger messenger, int i, int i2, List<String> list) {
            ClientRecord client = getClient(messenger);
            if (client == null) {
                return false;
            }
            MediaRouteProvider.RouteController routeController = client.getRouteController(i2);
            if (!(routeController instanceof MediaRouteProvider.DynamicGroupRouteController)) {
                return false;
            }
            ((MediaRouteProvider.DynamicGroupRouteController) routeController).onUpdateMemberRoutes(list);
            if (MediaRouteProviderService.DEBUG) {
                Log.d(MediaRouteProviderService.TAG, client + ": Updated list of member routes, controllerId=" + i2 + ", memberIds=" + list);
            }
            MediaRouteProviderService.sendGenericSuccess(messenger, i);
            return true;
        }

        public boolean onUpdateRouteVolume(Messenger messenger, int i, int i2, int i3) {
            MediaRouteProvider.RouteController routeController;
            ClientRecord client = getClient(messenger);
            if (client == null || (routeController = client.getRouteController(i2)) == null) {
                return false;
            }
            routeController.onUpdateVolume(i3);
            if (MediaRouteProviderService.DEBUG) {
                Log.d(MediaRouteProviderService.TAG, client + ": Route volume updated, controllerId=" + i2 + ", delta=" + i3);
            }
            MediaRouteProviderService.sendGenericSuccess(messenger, i);
            return true;
        }

        /* access modifiers changed from: package-private */
        public void sendDescriptorChanged(MediaRouteProviderDescriptor mediaRouteProviderDescriptor) {
            int size = this.mClients.size();
            for (int i = 0; i < size; i++) {
                ClientRecord clientRecord = this.mClients.get(i);
                MediaRouteProviderService.sendMessage(clientRecord.mMessenger, 5, 0, 0, clientRecord.createDescriptorBundle(mediaRouteProviderDescriptor), (Bundle) null);
                if (MediaRouteProviderService.DEBUG) {
                    Log.d(MediaRouteProviderService.TAG, clientRecord + ": Sent descriptor change event, descriptor=" + mediaRouteProviderDescriptor);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public boolean setBaseDiscoveryRequest(MediaRouteDiscoveryRequest mediaRouteDiscoveryRequest) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (ObjectsCompat.equals(this.mBaseDiscoveryRequest, mediaRouteDiscoveryRequest) && !mediaRouteDiscoveryRequest.isActiveScan()) {
                return false;
            }
            this.mBaseDiscoveryRequest = mediaRouteDiscoveryRequest;
            this.mBaseDiscoveryRequestTimestamp = elapsedRealtime;
            return updateCompositeDiscoveryRequest();
        }

        /* access modifiers changed from: package-private */
        public boolean updateCompositeDiscoveryRequest() {
            MediaRouteSelector.Builder builder;
            this.mActiveScanThrottlingHelper.reset();
            MediaRouteDiscoveryRequest mediaRouteDiscoveryRequest = this.mBaseDiscoveryRequest;
            MediaRouteDiscoveryRequest mediaRouteDiscoveryRequest2 = null;
            if (mediaRouteDiscoveryRequest != null) {
                this.mActiveScanThrottlingHelper.requestActiveScan(mediaRouteDiscoveryRequest.isActiveScan(), this.mBaseDiscoveryRequestTimestamp);
                builder = new MediaRouteSelector.Builder(this.mBaseDiscoveryRequest.getSelector());
            } else {
                builder = null;
            }
            int size = this.mClients.size();
            for (int i = 0; i < size; i++) {
                ClientRecord clientRecord = this.mClients.get(i);
                MediaRouteDiscoveryRequest mediaRouteDiscoveryRequest3 = clientRecord.mDiscoveryRequest;
                if (mediaRouteDiscoveryRequest3 != null && (!mediaRouteDiscoveryRequest3.getSelector().isEmpty() || mediaRouteDiscoveryRequest3.isActiveScan())) {
                    this.mActiveScanThrottlingHelper.requestActiveScan(mediaRouteDiscoveryRequest3.isActiveScan(), clientRecord.mDiscoveryRequestTimestamp);
                    if (builder == null) {
                        builder = new MediaRouteSelector.Builder(mediaRouteDiscoveryRequest3.getSelector());
                    } else {
                        builder.addSelector(mediaRouteDiscoveryRequest3.getSelector());
                    }
                }
            }
            boolean finalizeActiveScanAndScheduleSuppressActiveScanRunnable = this.mActiveScanThrottlingHelper.finalizeActiveScanAndScheduleSuppressActiveScanRunnable();
            if (builder != null) {
                mediaRouteDiscoveryRequest2 = new MediaRouteDiscoveryRequest(builder.build(), finalizeActiveScanAndScheduleSuppressActiveScanRunnable);
            }
            if (ObjectsCompat.equals(this.mCompositeDiscoveryRequest, mediaRouteDiscoveryRequest2)) {
                return false;
            }
            this.mCompositeDiscoveryRequest = mediaRouteDiscoveryRequest2;
            this.mService.getMediaRouteProvider().setDiscoveryRequest(mediaRouteDiscoveryRequest2);
            return true;
        }

        public void attachBaseContext(Context context) {
        }
    }
}
