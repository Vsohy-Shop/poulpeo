package androidx.mediarouter.media;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.support.p001v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.util.Log;
import android.view.Display;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.collection.ArrayMap;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.ActivityManagerCompat;
import androidx.core.content.ContextCompat;
import androidx.core.hardware.display.DisplayManagerCompat;
import androidx.core.util.ObjectsCompat;
import androidx.core.util.Pair;
import androidx.media.VolumeProviderCompat;
import androidx.mediarouter.media.MediaRoute2Provider;
import androidx.mediarouter.media.MediaRouteProvider;
import androidx.mediarouter.media.MediaRouteSelector;
import androidx.mediarouter.media.RegisteredMediaRouteProviderWatcher;
import androidx.mediarouter.media.RemoteControlClientCompat;
import androidx.mediarouter.media.SystemMediaRouteProvider;
import com.google.common.util.concurrent.C6906d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

public final class MediaRouter {
    public static final int AVAILABILITY_FLAG_IGNORE_DEFAULT_ROUTE = 1;
    public static final int AVAILABILITY_FLAG_REQUIRE_MATCH = 2;
    public static final int CALLBACK_FLAG_FORCE_DISCOVERY = 8;
    public static final int CALLBACK_FLAG_PERFORM_ACTIVE_SCAN = 1;
    public static final int CALLBACK_FLAG_REQUEST_DISCOVERY = 4;
    public static final int CALLBACK_FLAG_UNFILTERED_EVENTS = 2;
    static final boolean DEBUG = Log.isLoggable(TAG, 3);
    static final String TAG = "MediaRouter";
    public static final int UNSELECT_REASON_DISCONNECTED = 1;
    public static final int UNSELECT_REASON_ROUTE_CHANGED = 3;
    public static final int UNSELECT_REASON_STOPPED = 2;
    public static final int UNSELECT_REASON_UNKNOWN = 0;
    static GlobalMediaRouter sGlobal;
    final ArrayList<CallbackRecord> mCallbackRecords = new ArrayList<>();
    final Context mContext;

    public static abstract class Callback {
        @Deprecated
        public void onRouteSelected(@NonNull MediaRouter mediaRouter, @NonNull RouteInfo routeInfo) {
        }

        @Deprecated
        public void onRouteUnselected(@NonNull MediaRouter mediaRouter, @NonNull RouteInfo routeInfo) {
        }

        public void onRouteSelected(@NonNull MediaRouter mediaRouter, @NonNull RouteInfo routeInfo, int i) {
            onRouteSelected(mediaRouter, routeInfo);
        }

        public void onRouteUnselected(@NonNull MediaRouter mediaRouter, @NonNull RouteInfo routeInfo, int i) {
            onRouteUnselected(mediaRouter, routeInfo);
        }

        public void onRouteSelected(@NonNull MediaRouter mediaRouter, @NonNull RouteInfo routeInfo, int i, @NonNull RouteInfo routeInfo2) {
            onRouteSelected(mediaRouter, routeInfo, i);
        }

        public void onProviderAdded(@NonNull MediaRouter mediaRouter, @NonNull ProviderInfo providerInfo) {
        }

        public void onProviderChanged(@NonNull MediaRouter mediaRouter, @NonNull ProviderInfo providerInfo) {
        }

        public void onProviderRemoved(@NonNull MediaRouter mediaRouter, @NonNull ProviderInfo providerInfo) {
        }

        public void onRouteAdded(@NonNull MediaRouter mediaRouter, @NonNull RouteInfo routeInfo) {
        }

        public void onRouteChanged(@NonNull MediaRouter mediaRouter, @NonNull RouteInfo routeInfo) {
        }

        public void onRoutePresentationDisplayChanged(@NonNull MediaRouter mediaRouter, @NonNull RouteInfo routeInfo) {
        }

        public void onRouteRemoved(@NonNull MediaRouter mediaRouter, @NonNull RouteInfo routeInfo) {
        }

        public void onRouteVolumeChanged(@NonNull MediaRouter mediaRouter, @NonNull RouteInfo routeInfo) {
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public void onRouterParamsChanged(@NonNull MediaRouter mediaRouter, @Nullable MediaRouterParams mediaRouterParams) {
        }
    }

    private static final class CallbackRecord {
        public final Callback mCallback;
        public int mFlags;
        public final MediaRouter mRouter;
        public MediaRouteSelector mSelector = MediaRouteSelector.EMPTY;
        public long mTimestamp;

        public CallbackRecord(MediaRouter mediaRouter, Callback callback) {
            this.mRouter = mediaRouter;
            this.mCallback = callback;
        }

        public boolean filterRouteEvent(RouteInfo routeInfo, int i, RouteInfo routeInfo2, int i2) {
            if ((this.mFlags & 2) != 0 || routeInfo.matchesSelector(this.mSelector)) {
                return true;
            }
            if (!MediaRouter.isTransferToLocalEnabled() || !routeInfo.isDefaultOrBluetooth() || i != 262 || i2 != 3 || routeInfo2 == null) {
                return false;
            }
            return !routeInfo2.isDefaultOrBluetooth();
        }
    }

    static final class GlobalMediaRouter implements SystemMediaRouteProvider.SyncCallback, RegisteredMediaRouteProviderWatcher.Callback {
        private MediaRouterActiveScanThrottlingHelper mActiveScanThrottlingHelper;
        final Context mApplicationContext;
        private RouteInfo mBluetoothRoute;
        private int mCallbackCount;
        final CallbackHandler mCallbackHandler = new CallbackHandler();
        private MediaSessionCompat mCompatSession;
        RouteInfo mDefaultRoute;
        private MediaRouteDiscoveryRequest mDiscoveryRequest;
        private MediaRouteDiscoveryRequest mDiscoveryRequestForMr2Provider;
        private DisplayManagerCompat mDisplayManager;
        MediaRouteProvider.DynamicGroupRouteController.OnDynamicRoutesChangedListener mDynamicRoutesListener = new MediaRouteProvider.DynamicGroupRouteController.OnDynamicRoutesChangedListener() {
            public void onRoutesChanged(@NonNull MediaRouteProvider.DynamicGroupRouteController dynamicGroupRouteController, @Nullable MediaRouteDescriptor mediaRouteDescriptor, @NonNull Collection<MediaRouteProvider.DynamicGroupRouteController.DynamicRouteDescriptor> collection) {
                GlobalMediaRouter globalMediaRouter = GlobalMediaRouter.this;
                if (dynamicGroupRouteController == globalMediaRouter.mRequestedRouteController && mediaRouteDescriptor != null) {
                    ProviderInfo provider = globalMediaRouter.mRequestedRoute.getProvider();
                    String id = mediaRouteDescriptor.getId();
                    RouteInfo routeInfo = new RouteInfo(provider, id, GlobalMediaRouter.this.assignRouteUniqueId(provider, id));
                    routeInfo.maybeUpdateDescriptor(mediaRouteDescriptor);
                    GlobalMediaRouter globalMediaRouter2 = GlobalMediaRouter.this;
                    if (globalMediaRouter2.mSelectedRoute != routeInfo) {
                        globalMediaRouter2.notifyTransfer(globalMediaRouter2, routeInfo, globalMediaRouter2.mRequestedRouteController, 3, globalMediaRouter2.mRequestedRoute, collection);
                        GlobalMediaRouter globalMediaRouter3 = GlobalMediaRouter.this;
                        globalMediaRouter3.mRequestedRoute = null;
                        globalMediaRouter3.mRequestedRouteController = null;
                    }
                } else if (dynamicGroupRouteController == globalMediaRouter.mSelectedRouteController) {
                    if (mediaRouteDescriptor != null) {
                        globalMediaRouter.updateRouteDescriptorAndNotify(globalMediaRouter.mSelectedRoute, mediaRouteDescriptor);
                    }
                    GlobalMediaRouter.this.mSelectedRoute.updateDynamicDescriptors(collection);
                }
            }
        };
        boolean mIsInitialized;
        private final boolean mLowRam;
        private MediaSessionRecord mMediaSession;
        MediaRoute2Provider mMr2Provider;
        OnPrepareTransferListener mOnPrepareTransferListener;
        final RemoteControlClientCompat.PlaybackInfo mPlaybackInfo = new RemoteControlClientCompat.PlaybackInfo();
        private final ProviderCallback mProviderCallback = new ProviderCallback();
        private final ArrayList<ProviderInfo> mProviders = new ArrayList<>();
        MediaSessionCompat mRccMediaSession;
        @VisibleForTesting
        RegisteredMediaRouteProviderWatcher mRegisteredProviderWatcher;
        private final ArrayList<RemoteControlClientRecord> mRemoteControlClients = new ArrayList<>();
        RouteInfo mRequestedRoute;
        MediaRouteProvider.RouteController mRequestedRouteController;
        final Map<String, MediaRouteProvider.RouteController> mRouteControllerMap = new HashMap();
        private MediaRouterParams mRouterParams;
        final ArrayList<WeakReference<MediaRouter>> mRouters = new ArrayList<>();
        private final ArrayList<RouteInfo> mRoutes = new ArrayList<>();
        RouteInfo mSelectedRoute;
        MediaRouteProvider.RouteController mSelectedRouteController;
        private final MediaSessionCompat.C0073h mSessionActiveListener = new MediaSessionCompat.C0073h() {
            public void onActiveChanged() {
                MediaSessionCompat mediaSessionCompat = GlobalMediaRouter.this.mRccMediaSession;
                if (mediaSessionCompat == null) {
                    return;
                }
                if (mediaSessionCompat.mo202g()) {
                    GlobalMediaRouter globalMediaRouter = GlobalMediaRouter.this;
                    globalMediaRouter.addRemoteControlClient(globalMediaRouter.mRccMediaSession.mo200d());
                    return;
                }
                GlobalMediaRouter globalMediaRouter2 = GlobalMediaRouter.this;
                globalMediaRouter2.removeRemoteControlClient(globalMediaRouter2.mRccMediaSession.mo200d());
            }
        };
        SystemMediaRouteProvider mSystemProvider;
        PrepareTransferNotifier mTransferNotifier;
        boolean mTransferReceiverDeclared;
        RouteInfo mTransferredRoute;
        MediaRouteProvider.RouteController mTransferredRouteController;
        private final Map<Pair<String, String>, String> mUniqueIdMap = new HashMap();

        private final class CallbackHandler extends Handler {
            public static final int MSG_PROVIDER_ADDED = 513;
            public static final int MSG_PROVIDER_CHANGED = 515;
            public static final int MSG_PROVIDER_REMOVED = 514;
            public static final int MSG_ROUTER_PARAMS_CHANGED = 769;
            public static final int MSG_ROUTE_ADDED = 257;
            public static final int MSG_ROUTE_ANOTHER_SELECTED = 264;
            public static final int MSG_ROUTE_CHANGED = 259;
            public static final int MSG_ROUTE_PRESENTATION_DISPLAY_CHANGED = 261;
            public static final int MSG_ROUTE_REMOVED = 258;
            public static final int MSG_ROUTE_SELECTED = 262;
            public static final int MSG_ROUTE_UNSELECTED = 263;
            public static final int MSG_ROUTE_VOLUME_CHANGED = 260;
            private static final int MSG_TYPE_MASK = 65280;
            private static final int MSG_TYPE_PROVIDER = 512;
            private static final int MSG_TYPE_ROUTE = 256;
            private static final int MSG_TYPE_ROUTER = 768;
            private final List<RouteInfo> mDynamicGroupRoutes = new ArrayList();
            private final ArrayList<CallbackRecord> mTempCallbackRecords = new ArrayList<>();

            CallbackHandler() {
            }

            private void invokeCallback(CallbackRecord callbackRecord, int i, Object obj, int i2) {
                RouteInfo routeInfo;
                RouteInfo routeInfo2;
                MediaRouter mediaRouter = callbackRecord.mRouter;
                Callback callback = callbackRecord.mCallback;
                int i3 = 65280 & i;
                if (i3 == 256) {
                    if (i == 264 || i == 262) {
                        routeInfo = (RouteInfo) ((Pair) obj).second;
                    } else {
                        routeInfo = (RouteInfo) obj;
                    }
                    if (i == 264 || i == 262) {
                        routeInfo2 = (RouteInfo) ((Pair) obj).first;
                    } else {
                        routeInfo2 = null;
                    }
                    if (routeInfo != null && callbackRecord.filterRouteEvent(routeInfo, i, routeInfo2, i2)) {
                        switch (i) {
                            case 257:
                                callback.onRouteAdded(mediaRouter, routeInfo);
                                return;
                            case MSG_ROUTE_REMOVED /*258*/:
                                callback.onRouteRemoved(mediaRouter, routeInfo);
                                return;
                            case MSG_ROUTE_CHANGED /*259*/:
                                callback.onRouteChanged(mediaRouter, routeInfo);
                                return;
                            case MSG_ROUTE_VOLUME_CHANGED /*260*/:
                                callback.onRouteVolumeChanged(mediaRouter, routeInfo);
                                return;
                            case MSG_ROUTE_PRESENTATION_DISPLAY_CHANGED /*261*/:
                                callback.onRoutePresentationDisplayChanged(mediaRouter, routeInfo);
                                return;
                            case MSG_ROUTE_SELECTED /*262*/:
                                callback.onRouteSelected(mediaRouter, routeInfo, i2, routeInfo);
                                return;
                            case MSG_ROUTE_UNSELECTED /*263*/:
                                callback.onRouteUnselected(mediaRouter, routeInfo, i2);
                                return;
                            case MSG_ROUTE_ANOTHER_SELECTED /*264*/:
                                callback.onRouteSelected(mediaRouter, routeInfo, i2, routeInfo2);
                                return;
                            default:
                                return;
                        }
                    }
                } else if (i3 == 512) {
                    ProviderInfo providerInfo = (ProviderInfo) obj;
                    switch (i) {
                        case 513:
                            callback.onProviderAdded(mediaRouter, providerInfo);
                            return;
                        case MSG_PROVIDER_REMOVED /*514*/:
                            callback.onProviderRemoved(mediaRouter, providerInfo);
                            return;
                        case MSG_PROVIDER_CHANGED /*515*/:
                            callback.onProviderChanged(mediaRouter, providerInfo);
                            return;
                        default:
                            return;
                    }
                } else if (i3 == MSG_TYPE_ROUTER && i == 769) {
                    callback.onRouterParamsChanged(mediaRouter, (MediaRouterParams) obj);
                }
            }

            private void syncWithSystemProvider(int i, Object obj) {
                if (i == 262) {
                    RouteInfo routeInfo = (RouteInfo) ((Pair) obj).second;
                    GlobalMediaRouter.this.mSystemProvider.onSyncRouteSelected(routeInfo);
                    if (GlobalMediaRouter.this.mDefaultRoute != null && routeInfo.isDefaultOrBluetooth()) {
                        for (RouteInfo onSyncRouteRemoved : this.mDynamicGroupRoutes) {
                            GlobalMediaRouter.this.mSystemProvider.onSyncRouteRemoved(onSyncRouteRemoved);
                        }
                        this.mDynamicGroupRoutes.clear();
                    }
                } else if (i != 264) {
                    switch (i) {
                        case 257:
                            GlobalMediaRouter.this.mSystemProvider.onSyncRouteAdded((RouteInfo) obj);
                            return;
                        case MSG_ROUTE_REMOVED /*258*/:
                            GlobalMediaRouter.this.mSystemProvider.onSyncRouteRemoved((RouteInfo) obj);
                            return;
                        case MSG_ROUTE_CHANGED /*259*/:
                            GlobalMediaRouter.this.mSystemProvider.onSyncRouteChanged((RouteInfo) obj);
                            return;
                        default:
                            return;
                    }
                } else {
                    RouteInfo routeInfo2 = (RouteInfo) ((Pair) obj).second;
                    this.mDynamicGroupRoutes.add(routeInfo2);
                    GlobalMediaRouter.this.mSystemProvider.onSyncRouteAdded(routeInfo2);
                    GlobalMediaRouter.this.mSystemProvider.onSyncRouteSelected(routeInfo2);
                }
            }

            public void handleMessage(Message message) {
                int i = message.what;
                Object obj = message.obj;
                int i2 = message.arg1;
                if (i == 259 && GlobalMediaRouter.this.getSelectedRoute().getId().equals(((RouteInfo) obj).getId())) {
                    GlobalMediaRouter.this.updateSelectedRouteIfNeeded(true);
                }
                syncWithSystemProvider(i, obj);
                try {
                    int size = GlobalMediaRouter.this.mRouters.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        MediaRouter mediaRouter = (MediaRouter) GlobalMediaRouter.this.mRouters.get(size).get();
                        if (mediaRouter == null) {
                            GlobalMediaRouter.this.mRouters.remove(size);
                        } else {
                            this.mTempCallbackRecords.addAll(mediaRouter.mCallbackRecords);
                        }
                    }
                    int size2 = this.mTempCallbackRecords.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        invokeCallback(this.mTempCallbackRecords.get(i3), i, obj, i2);
                    }
                } finally {
                    this.mTempCallbackRecords.clear();
                }
            }

            public void post(int i, Object obj) {
                obtainMessage(i, obj).sendToTarget();
            }

            public void post(int i, Object obj, int i2) {
                Message obtainMessage = obtainMessage(i, obj);
                obtainMessage.arg1 = i2;
                obtainMessage.sendToTarget();
            }
        }

        private final class MediaSessionRecord {
            private int mControlType;
            private int mMaxVolume;
            private final MediaSessionCompat mMsCompat;
            private VolumeProviderCompat mVpCompat;

            MediaSessionRecord(GlobalMediaRouter globalMediaRouter, Object obj) {
                this(MediaSessionCompat.m164b(globalMediaRouter.mApplicationContext, obj));
            }

            public void clearVolumeHandling() {
                MediaSessionCompat mediaSessionCompat = this.mMsCompat;
                if (mediaSessionCompat != null) {
                    mediaSessionCompat.mo210o(GlobalMediaRouter.this.mPlaybackInfo.playbackStream);
                    this.mVpCompat = null;
                }
            }

            public void configureVolume(int i, int i2, int i3, @Nullable String str) {
                if (this.mMsCompat != null) {
                    VolumeProviderCompat volumeProviderCompat = this.mVpCompat;
                    if (volumeProviderCompat != null && i == this.mControlType && i2 == this.mMaxVolume) {
                        volumeProviderCompat.setCurrentVolume(i3);
                        return;
                    }
                    C24541 r2 = new VolumeProviderCompat(i, i2, i3, str) {
                        public void onAdjustVolume(final int i) {
                            GlobalMediaRouter.this.mCallbackHandler.post(new Runnable() {
                                public void run() {
                                    RouteInfo routeInfo = GlobalMediaRouter.this.mSelectedRoute;
                                    if (routeInfo != null) {
                                        routeInfo.requestUpdateVolume(i);
                                    }
                                }
                            });
                        }

                        public void onSetVolumeTo(final int i) {
                            GlobalMediaRouter.this.mCallbackHandler.post(new Runnable() {
                                public void run() {
                                    RouteInfo routeInfo = GlobalMediaRouter.this.mSelectedRoute;
                                    if (routeInfo != null) {
                                        routeInfo.requestSetVolume(i);
                                    }
                                }
                            });
                        }
                    };
                    this.mVpCompat = r2;
                    this.mMsCompat.mo211p(r2);
                }
            }

            public MediaSessionCompat.Token getToken() {
                MediaSessionCompat mediaSessionCompat = this.mMsCompat;
                if (mediaSessionCompat != null) {
                    return mediaSessionCompat.mo201e();
                }
                return null;
            }

            MediaSessionRecord(MediaSessionCompat mediaSessionCompat) {
                this.mMsCompat = mediaSessionCompat;
            }
        }

        final class Mr2ProviderCallback extends MediaRoute2Provider.Callback {
            Mr2ProviderCallback() {
            }

            public void onReleaseController(@NonNull MediaRouteProvider.RouteController routeController) {
                if (routeController == GlobalMediaRouter.this.mSelectedRouteController) {
                    selectRouteToFallbackRoute(2);
                } else if (MediaRouter.DEBUG) {
                    Log.d(MediaRouter.TAG, "A RouteController unrelated to the selected route is released. controller=" + routeController);
                }
            }

            public void onSelectFallbackRoute(int i) {
                selectRouteToFallbackRoute(i);
            }

            public void onSelectRoute(@NonNull String str, int i) {
                RouteInfo routeInfo;
                Iterator<RouteInfo> it = GlobalMediaRouter.this.getRoutes().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        routeInfo = null;
                        break;
                    }
                    routeInfo = it.next();
                    if (routeInfo.getProviderInstance() == GlobalMediaRouter.this.mMr2Provider && TextUtils.equals(str, routeInfo.getDescriptorId())) {
                        break;
                    }
                }
                if (routeInfo == null) {
                    Log.w(MediaRouter.TAG, "onSelectRoute: The target RouteInfo is not found for descriptorId=" + str);
                    return;
                }
                GlobalMediaRouter.this.selectRouteInternal(routeInfo, i);
            }

            /* access modifiers changed from: package-private */
            public void selectRouteToFallbackRoute(int i) {
                RouteInfo chooseFallbackRoute = GlobalMediaRouter.this.chooseFallbackRoute();
                if (GlobalMediaRouter.this.getSelectedRoute() != chooseFallbackRoute) {
                    GlobalMediaRouter.this.selectRouteInternal(chooseFallbackRoute, i);
                }
            }
        }

        private final class ProviderCallback extends MediaRouteProvider.Callback {
            ProviderCallback() {
            }

            public void onDescriptorChanged(@NonNull MediaRouteProvider mediaRouteProvider, MediaRouteProviderDescriptor mediaRouteProviderDescriptor) {
                GlobalMediaRouter.this.updateProviderDescriptor(mediaRouteProvider, mediaRouteProviderDescriptor);
            }
        }

        private final class RemoteControlClientRecord implements RemoteControlClientCompat.VolumeCallback {
            private boolean mDisconnected;
            private final RemoteControlClientCompat mRccCompat;

            public RemoteControlClientRecord(Object obj) {
                RemoteControlClientCompat obtain = RemoteControlClientCompat.obtain(GlobalMediaRouter.this.mApplicationContext, obj);
                this.mRccCompat = obtain;
                obtain.setVolumeCallback(this);
                updatePlaybackInfo();
            }

            public void disconnect() {
                this.mDisconnected = true;
                this.mRccCompat.setVolumeCallback((RemoteControlClientCompat.VolumeCallback) null);
            }

            public Object getRemoteControlClient() {
                return this.mRccCompat.getRemoteControlClient();
            }

            public void onVolumeSetRequest(int i) {
                RouteInfo routeInfo;
                if (!this.mDisconnected && (routeInfo = GlobalMediaRouter.this.mSelectedRoute) != null) {
                    routeInfo.requestSetVolume(i);
                }
            }

            public void onVolumeUpdateRequest(int i) {
                RouteInfo routeInfo;
                if (!this.mDisconnected && (routeInfo = GlobalMediaRouter.this.mSelectedRoute) != null) {
                    routeInfo.requestUpdateVolume(i);
                }
            }

            public void updatePlaybackInfo() {
                this.mRccCompat.setPlaybackInfo(GlobalMediaRouter.this.mPlaybackInfo);
            }
        }

        GlobalMediaRouter(Context context) {
            this.mApplicationContext = context;
            this.mLowRam = ActivityManagerCompat.isLowRamDevice((ActivityManager) context.getSystemService("activity"));
        }

        private ProviderInfo findProviderInfo(MediaRouteProvider mediaRouteProvider) {
            int size = this.mProviders.size();
            for (int i = 0; i < size; i++) {
                if (this.mProviders.get(i).mProviderInstance == mediaRouteProvider) {
                    return this.mProviders.get(i);
                }
            }
            return null;
        }

        private int findRemoteControlClientRecord(Object obj) {
            int size = this.mRemoteControlClients.size();
            for (int i = 0; i < size; i++) {
                if (this.mRemoteControlClients.get(i).getRemoteControlClient() == obj) {
                    return i;
                }
            }
            return -1;
        }

        private int findRouteByUniqueId(String str) {
            int size = this.mRoutes.size();
            for (int i = 0; i < size; i++) {
                if (this.mRoutes.get(i).mUniqueId.equals(str)) {
                    return i;
                }
            }
            return -1;
        }

        private boolean isSystemDefaultRoute(RouteInfo routeInfo) {
            if (routeInfo.getProviderInstance() != this.mSystemProvider || !routeInfo.mDescriptorId.equals(SystemMediaRouteProvider.DEFAULT_ROUTE_ID)) {
                return false;
            }
            return true;
        }

        private boolean isSystemLiveAudioOnlyRoute(RouteInfo routeInfo) {
            if (routeInfo.getProviderInstance() != this.mSystemProvider || !routeInfo.supportsControlCategory(MediaControlIntent.CATEGORY_LIVE_AUDIO) || routeInfo.supportsControlCategory(MediaControlIntent.CATEGORY_LIVE_VIDEO)) {
                return false;
            }
            return true;
        }

        private void setMediaSessionRecord(MediaSessionRecord mediaSessionRecord) {
            MediaSessionRecord mediaSessionRecord2 = this.mMediaSession;
            if (mediaSessionRecord2 != null) {
                mediaSessionRecord2.clearVolumeHandling();
            }
            this.mMediaSession = mediaSessionRecord;
            if (mediaSessionRecord != null) {
                updatePlaybackInfoFromSelectedRoute();
            }
        }

        private void start() {
            this.mActiveScanThrottlingHelper = new MediaRouterActiveScanThrottlingHelper(new Runnable() {
                public void run() {
                    GlobalMediaRouter.this.updateDiscoveryRequest();
                }
            });
            addProvider(this.mSystemProvider);
            MediaRoute2Provider mediaRoute2Provider = this.mMr2Provider;
            if (mediaRoute2Provider != null) {
                addProvider(mediaRoute2Provider);
            }
            RegisteredMediaRouteProviderWatcher registeredMediaRouteProviderWatcher = new RegisteredMediaRouteProviderWatcher(this.mApplicationContext, this);
            this.mRegisteredProviderWatcher = registeredMediaRouteProviderWatcher;
            registeredMediaRouteProviderWatcher.start();
        }

        private void updateMr2ProviderDiscoveryRequest(@NonNull MediaRouteSelector mediaRouteSelector, boolean z) {
            if (isMediaTransferEnabled()) {
                MediaRouteDiscoveryRequest mediaRouteDiscoveryRequest = this.mDiscoveryRequestForMr2Provider;
                if (mediaRouteDiscoveryRequest == null || !mediaRouteDiscoveryRequest.getSelector().equals(mediaRouteSelector) || this.mDiscoveryRequestForMr2Provider.isActiveScan() != z) {
                    if (!mediaRouteSelector.isEmpty() || z) {
                        this.mDiscoveryRequestForMr2Provider = new MediaRouteDiscoveryRequest(mediaRouteSelector, z);
                    } else if (this.mDiscoveryRequestForMr2Provider != null) {
                        this.mDiscoveryRequestForMr2Provider = null;
                    } else {
                        return;
                    }
                    if (MediaRouter.DEBUG) {
                        Log.d(MediaRouter.TAG, "Updated MediaRoute2Provider's discovery request: " + this.mDiscoveryRequestForMr2Provider);
                    }
                    this.mMr2Provider.setDiscoveryRequest(this.mDiscoveryRequestForMr2Provider);
                }
            }
        }

        private void updateProviderContents(ProviderInfo providerInfo, MediaRouteProviderDescriptor mediaRouteProviderDescriptor) {
            boolean z;
            if (providerInfo.updateDescriptor(mediaRouteProviderDescriptor)) {
                int i = 0;
                if (mediaRouteProviderDescriptor == null || (!mediaRouteProviderDescriptor.isValid() && mediaRouteProviderDescriptor != this.mSystemProvider.getDescriptor())) {
                    Log.w(MediaRouter.TAG, "Ignoring invalid provider descriptor: " + mediaRouteProviderDescriptor);
                    z = false;
                } else {
                    List<MediaRouteDescriptor> routes = mediaRouteProviderDescriptor.getRoutes();
                    ArrayList<Pair> arrayList = new ArrayList<>();
                    ArrayList<Pair> arrayList2 = new ArrayList<>();
                    z = false;
                    for (MediaRouteDescriptor next : routes) {
                        if (next == null || !next.isValid()) {
                            Log.w(MediaRouter.TAG, "Ignoring invalid system route descriptor: " + next);
                        } else {
                            String id = next.getId();
                            int findRouteIndexByDescriptorId = providerInfo.findRouteIndexByDescriptorId(id);
                            if (findRouteIndexByDescriptorId < 0) {
                                RouteInfo routeInfo = new RouteInfo(providerInfo, id, assignRouteUniqueId(providerInfo, id));
                                int i2 = i + 1;
                                providerInfo.mRoutes.add(i, routeInfo);
                                this.mRoutes.add(routeInfo);
                                if (next.getGroupMemberIds().size() > 0) {
                                    arrayList.add(new Pair(routeInfo, next));
                                } else {
                                    routeInfo.maybeUpdateDescriptor(next);
                                    if (MediaRouter.DEBUG) {
                                        Log.d(MediaRouter.TAG, "Route added: " + routeInfo);
                                    }
                                    this.mCallbackHandler.post(257, routeInfo);
                                }
                                i = i2;
                            } else if (findRouteIndexByDescriptorId < i) {
                                Log.w(MediaRouter.TAG, "Ignoring route descriptor with duplicate id: " + next);
                            } else {
                                RouteInfo routeInfo2 = providerInfo.mRoutes.get(findRouteIndexByDescriptorId);
                                int i3 = i + 1;
                                Collections.swap(providerInfo.mRoutes, findRouteIndexByDescriptorId, i);
                                if (next.getGroupMemberIds().size() > 0) {
                                    arrayList2.add(new Pair(routeInfo2, next));
                                } else if (updateRouteDescriptorAndNotify(routeInfo2, next) != 0 && routeInfo2 == this.mSelectedRoute) {
                                    z = true;
                                }
                                i = i3;
                            }
                        }
                    }
                    for (Pair pair : arrayList) {
                        RouteInfo routeInfo3 = (RouteInfo) pair.first;
                        routeInfo3.maybeUpdateDescriptor((MediaRouteDescriptor) pair.second);
                        if (MediaRouter.DEBUG) {
                            Log.d(MediaRouter.TAG, "Route added: " + routeInfo3);
                        }
                        this.mCallbackHandler.post(257, routeInfo3);
                    }
                    for (Pair pair2 : arrayList2) {
                        RouteInfo routeInfo4 = (RouteInfo) pair2.first;
                        if (updateRouteDescriptorAndNotify(routeInfo4, (MediaRouteDescriptor) pair2.second) != 0 && routeInfo4 == this.mSelectedRoute) {
                            z = true;
                        }
                    }
                }
                for (int size = providerInfo.mRoutes.size() - 1; size >= i; size--) {
                    RouteInfo routeInfo5 = providerInfo.mRoutes.get(size);
                    routeInfo5.maybeUpdateDescriptor((MediaRouteDescriptor) null);
                    this.mRoutes.remove(routeInfo5);
                }
                updateSelectedRouteIfNeeded(z);
                for (int size2 = providerInfo.mRoutes.size() - 1; size2 >= i; size2--) {
                    RouteInfo remove = providerInfo.mRoutes.remove(size2);
                    if (MediaRouter.DEBUG) {
                        Log.d(MediaRouter.TAG, "Route removed: " + remove);
                    }
                    this.mCallbackHandler.post(CallbackHandler.MSG_ROUTE_REMOVED, remove);
                }
                if (MediaRouter.DEBUG) {
                    Log.d(MediaRouter.TAG, "Provider changed: " + providerInfo);
                }
                this.mCallbackHandler.post(CallbackHandler.MSG_PROVIDER_CHANGED, providerInfo);
            }
        }

        /* access modifiers changed from: package-private */
        public void addMemberToDynamicGroup(@NonNull RouteInfo routeInfo) {
            if (this.mSelectedRouteController instanceof MediaRouteProvider.DynamicGroupRouteController) {
                RouteInfo.DynamicGroupState dynamicGroupState = getDynamicGroupState(routeInfo);
                if (this.mSelectedRoute.getMemberRoutes().contains(routeInfo) || dynamicGroupState == null || !dynamicGroupState.isGroupable()) {
                    Log.w(MediaRouter.TAG, "Ignoring attempt to add a non-groupable route to dynamic group : " + routeInfo);
                    return;
                }
                ((MediaRouteProvider.DynamicGroupRouteController) this.mSelectedRouteController).onAddMemberRoute(routeInfo.getDescriptorId());
                return;
            }
            throw new IllegalStateException("There is no currently selected dynamic group route.");
        }

        public void addProvider(@NonNull MediaRouteProvider mediaRouteProvider) {
            if (findProviderInfo(mediaRouteProvider) == null) {
                ProviderInfo providerInfo = new ProviderInfo(mediaRouteProvider);
                this.mProviders.add(providerInfo);
                if (MediaRouter.DEBUG) {
                    Log.d(MediaRouter.TAG, "Provider added: " + providerInfo);
                }
                this.mCallbackHandler.post(513, providerInfo);
                updateProviderContents(providerInfo, mediaRouteProvider.getDescriptor());
                mediaRouteProvider.setCallback(this.mProviderCallback);
                mediaRouteProvider.setDiscoveryRequest(this.mDiscoveryRequest);
            }
        }

        public void addRemoteControlClient(Object obj) {
            if (findRemoteControlClientRecord(obj) < 0) {
                this.mRemoteControlClients.add(new RemoteControlClientRecord(obj));
            }
        }

        /* access modifiers changed from: package-private */
        public String assignRouteUniqueId(ProviderInfo providerInfo, String str) {
            String flattenToShortString = providerInfo.getComponentName().flattenToShortString();
            String str2 = flattenToShortString + ":" + str;
            if (findRouteByUniqueId(str2) < 0) {
                this.mUniqueIdMap.put(new Pair(flattenToShortString, str), str2);
                return str2;
            }
            Log.w(MediaRouter.TAG, "Either " + str + " isn't unique in " + flattenToShortString + " or we're trying to assign a unique ID for an already added route");
            int i = 2;
            while (true) {
                String format = String.format(Locale.US, "%s_%d", new Object[]{str2, Integer.valueOf(i)});
                if (findRouteByUniqueId(format) < 0) {
                    this.mUniqueIdMap.put(new Pair(flattenToShortString, str), format);
                    return format;
                }
                i++;
            }
        }

        /* access modifiers changed from: package-private */
        public RouteInfo chooseFallbackRoute() {
            Iterator<RouteInfo> it = this.mRoutes.iterator();
            while (it.hasNext()) {
                RouteInfo next = it.next();
                if (next != this.mDefaultRoute && isSystemLiveAudioOnlyRoute(next) && next.isSelectable()) {
                    return next;
                }
            }
            return this.mDefaultRoute;
        }

        /* access modifiers changed from: package-private */
        public void ensureInitialized() {
            if (!this.mIsInitialized) {
                this.mIsInitialized = true;
                if (Build.VERSION.SDK_INT >= 30) {
                    this.mTransferReceiverDeclared = MediaTransferReceiver.isDeclared(this.mApplicationContext);
                } else {
                    this.mTransferReceiverDeclared = false;
                }
                if (this.mTransferReceiverDeclared) {
                    this.mMr2Provider = new MediaRoute2Provider(this.mApplicationContext, new Mr2ProviderCallback());
                } else {
                    this.mMr2Provider = null;
                }
                this.mSystemProvider = SystemMediaRouteProvider.obtain(this.mApplicationContext, this);
                start();
            }
        }

        /* access modifiers changed from: package-private */
        public RouteInfo getBluetoothRoute() {
            return this.mBluetoothRoute;
        }

        /* access modifiers changed from: package-private */
        public int getCallbackCount() {
            return this.mCallbackCount;
        }

        public ContentResolver getContentResolver() {
            return this.mApplicationContext.getContentResolver();
        }

        /* access modifiers changed from: package-private */
        @NonNull
        public RouteInfo getDefaultRoute() {
            RouteInfo routeInfo = this.mDefaultRoute;
            if (routeInfo != null) {
                return routeInfo;
            }
            throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
        }

        public Display getDisplay(int i) {
            if (this.mDisplayManager == null) {
                this.mDisplayManager = DisplayManagerCompat.getInstance(this.mApplicationContext);
            }
            return this.mDisplayManager.getDisplay(i);
        }

        /* access modifiers changed from: package-private */
        @Nullable
        public RouteInfo.DynamicGroupState getDynamicGroupState(RouteInfo routeInfo) {
            return this.mSelectedRoute.getDynamicGroupState(routeInfo);
        }

        public MediaSessionCompat.Token getMediaSessionToken() {
            MediaSessionRecord mediaSessionRecord = this.mMediaSession;
            if (mediaSessionRecord != null) {
                return mediaSessionRecord.getToken();
            }
            MediaSessionCompat mediaSessionCompat = this.mCompatSession;
            if (mediaSessionCompat != null) {
                return mediaSessionCompat.mo201e();
            }
            return null;
        }

        public Context getProviderContext(String str) {
            if (str.equals(SystemMediaRouteProvider.PACKAGE_NAME)) {
                return this.mApplicationContext;
            }
            try {
                return this.mApplicationContext.createPackageContext(str, 4);
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        /* access modifiers changed from: package-private */
        @Nullable
        public List<ProviderInfo> getProviders() {
            return this.mProviders;
        }

        public RouteInfo getRoute(String str) {
            Iterator<RouteInfo> it = this.mRoutes.iterator();
            while (it.hasNext()) {
                RouteInfo next = it.next();
                if (next.mUniqueId.equals(str)) {
                    return next;
                }
            }
            return null;
        }

        public MediaRouter getRouter(Context context) {
            int size = this.mRouters.size();
            while (true) {
                size--;
                if (size >= 0) {
                    MediaRouter mediaRouter = (MediaRouter) this.mRouters.get(size).get();
                    if (mediaRouter == null) {
                        this.mRouters.remove(size);
                    } else if (mediaRouter.mContext == context) {
                        return mediaRouter;
                    }
                } else {
                    MediaRouter mediaRouter2 = new MediaRouter(context);
                    this.mRouters.add(new WeakReference(mediaRouter2));
                    return mediaRouter2;
                }
            }
        }

        /* access modifiers changed from: package-private */
        @Nullable
        public MediaRouterParams getRouterParams() {
            return this.mRouterParams;
        }

        public List<RouteInfo> getRoutes() {
            return this.mRoutes;
        }

        /* access modifiers changed from: package-private */
        @NonNull
        public RouteInfo getSelectedRoute() {
            RouteInfo routeInfo = this.mSelectedRoute;
            if (routeInfo != null) {
                return routeInfo;
            }
            throw new IllegalStateException("There is no currently selected route.  The media router has not yet been fully initialized.");
        }

        /* access modifiers changed from: package-private */
        public String getUniqueId(ProviderInfo providerInfo, String str) {
            return this.mUniqueIdMap.get(new Pair(providerInfo.getComponentName().flattenToShortString(), str));
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public boolean isGroupVolumeUxEnabled() {
            Bundle bundle;
            MediaRouterParams mediaRouterParams = this.mRouterParams;
            if (mediaRouterParams == null || (bundle = mediaRouterParams.mExtras) == null || bundle.getBoolean(MediaRouterParams.ENABLE_GROUP_VOLUME_UX, true)) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean isMediaTransferEnabled() {
            MediaRouterParams mediaRouterParams;
            if (!this.mTransferReceiverDeclared || ((mediaRouterParams = this.mRouterParams) != null && !mediaRouterParams.isMediaTransferReceiverEnabled())) {
                return false;
            }
            return true;
        }

        public boolean isRouteAvailable(MediaRouteSelector mediaRouteSelector, int i) {
            boolean z;
            if (mediaRouteSelector.isEmpty()) {
                return false;
            }
            if ((i & 2) == 0 && this.mLowRam) {
                return true;
            }
            MediaRouterParams mediaRouterParams = this.mRouterParams;
            if (mediaRouterParams == null || !mediaRouterParams.isOutputSwitcherEnabled() || !isMediaTransferEnabled()) {
                z = false;
            } else {
                z = true;
            }
            int size = this.mRoutes.size();
            for (int i2 = 0; i2 < size; i2++) {
                RouteInfo routeInfo = this.mRoutes.get(i2);
                if (((i & 1) == 0 || !routeInfo.isDefaultOrBluetooth()) && ((!z || routeInfo.isDefaultOrBluetooth() || routeInfo.getProviderInstance() == this.mMr2Provider) && routeInfo.matchesSelector(mediaRouteSelector))) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean isTransferToLocalEnabled() {
            MediaRouterParams mediaRouterParams = this.mRouterParams;
            if (mediaRouterParams == null) {
                return false;
            }
            return mediaRouterParams.isTransferToLocalEnabled();
        }

        /* access modifiers changed from: package-private */
        public void maybeUpdateMemberRouteControllers() {
            if (this.mSelectedRoute.isGroup()) {
                List<RouteInfo> memberRoutes = this.mSelectedRoute.getMemberRoutes();
                HashSet hashSet = new HashSet();
                for (RouteInfo routeInfo : memberRoutes) {
                    hashSet.add(routeInfo.mUniqueId);
                }
                Iterator<Map.Entry<String, MediaRouteProvider.RouteController>> it = this.mRouteControllerMap.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry next = it.next();
                    if (!hashSet.contains(next.getKey())) {
                        MediaRouteProvider.RouteController routeController = (MediaRouteProvider.RouteController) next.getValue();
                        routeController.onUnselect(0);
                        routeController.onRelease();
                        it.remove();
                    }
                }
                for (RouteInfo next2 : memberRoutes) {
                    if (!this.mRouteControllerMap.containsKey(next2.mUniqueId)) {
                        MediaRouteProvider.RouteController onCreateRouteController = next2.getProviderInstance().onCreateRouteController(next2.mDescriptorId, this.mSelectedRoute.mDescriptorId);
                        onCreateRouteController.onSelect();
                        this.mRouteControllerMap.put(next2.mUniqueId, onCreateRouteController);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void notifyTransfer(GlobalMediaRouter globalMediaRouter, RouteInfo routeInfo, @Nullable MediaRouteProvider.RouteController routeController, int i, @Nullable RouteInfo routeInfo2, @Nullable Collection<MediaRouteProvider.DynamicGroupRouteController.DynamicRouteDescriptor> collection) {
            OnPrepareTransferListener onPrepareTransferListener;
            PrepareTransferNotifier prepareTransferNotifier = this.mTransferNotifier;
            if (prepareTransferNotifier != null) {
                prepareTransferNotifier.cancel();
                this.mTransferNotifier = null;
            }
            PrepareTransferNotifier prepareTransferNotifier2 = new PrepareTransferNotifier(globalMediaRouter, routeInfo, routeController, i, routeInfo2, collection);
            this.mTransferNotifier = prepareTransferNotifier2;
            if (prepareTransferNotifier2.mReason != 3 || (onPrepareTransferListener = this.mOnPrepareTransferListener) == null) {
                prepareTransferNotifier2.finishTransfer();
                return;
            }
            C6906d<Void> onPrepareTransfer = onPrepareTransferListener.onPrepareTransfer(this.mSelectedRoute, prepareTransferNotifier2.mToRoute);
            if (onPrepareTransfer == null) {
                this.mTransferNotifier.finishTransfer();
            } else {
                this.mTransferNotifier.setFuture(onPrepareTransfer);
            }
        }

        public void onSystemRouteSelectedByDescriptorId(String str) {
            RouteInfo findRouteByDescriptorId;
            this.mCallbackHandler.removeMessages(CallbackHandler.MSG_ROUTE_SELECTED);
            ProviderInfo findProviderInfo = findProviderInfo(this.mSystemProvider);
            if (findProviderInfo != null && (findRouteByDescriptorId = findProviderInfo.findRouteByDescriptorId(str)) != null) {
                findRouteByDescriptorId.select();
            }
        }

        public void releaseProviderController(@NonNull RegisteredMediaRouteProvider registeredMediaRouteProvider, @NonNull MediaRouteProvider.RouteController routeController) {
            if (this.mSelectedRouteController == routeController) {
                selectRoute(chooseFallbackRoute(), 2);
            }
        }

        /* access modifiers changed from: package-private */
        public void removeMemberFromDynamicGroup(@NonNull RouteInfo routeInfo) {
            if (this.mSelectedRouteController instanceof MediaRouteProvider.DynamicGroupRouteController) {
                RouteInfo.DynamicGroupState dynamicGroupState = getDynamicGroupState(routeInfo);
                if (!this.mSelectedRoute.getMemberRoutes().contains(routeInfo) || dynamicGroupState == null || !dynamicGroupState.isUnselectable()) {
                    Log.w(MediaRouter.TAG, "Ignoring attempt to remove a non-unselectable member route : " + routeInfo);
                } else if (this.mSelectedRoute.getMemberRoutes().size() <= 1) {
                    Log.w(MediaRouter.TAG, "Ignoring attempt to remove the last member route.");
                } else {
                    ((MediaRouteProvider.DynamicGroupRouteController) this.mSelectedRouteController).onRemoveMemberRoute(routeInfo.getDescriptorId());
                }
            } else {
                throw new IllegalStateException("There is no currently selected dynamic group route.");
            }
        }

        public void removeProvider(MediaRouteProvider mediaRouteProvider) {
            ProviderInfo findProviderInfo = findProviderInfo(mediaRouteProvider);
            if (findProviderInfo != null) {
                mediaRouteProvider.setCallback((MediaRouteProvider.Callback) null);
                mediaRouteProvider.setDiscoveryRequest((MediaRouteDiscoveryRequest) null);
                updateProviderContents(findProviderInfo, (MediaRouteProviderDescriptor) null);
                if (MediaRouter.DEBUG) {
                    Log.d(MediaRouter.TAG, "Provider removed: " + findProviderInfo);
                }
                this.mCallbackHandler.post(CallbackHandler.MSG_PROVIDER_REMOVED, findProviderInfo);
                this.mProviders.remove(findProviderInfo);
            }
        }

        public void removeRemoteControlClient(Object obj) {
            int findRemoteControlClientRecord = findRemoteControlClientRecord(obj);
            if (findRemoteControlClientRecord >= 0) {
                this.mRemoteControlClients.remove(findRemoteControlClientRecord).disconnect();
            }
        }

        public void requestSetVolume(RouteInfo routeInfo, int i) {
            MediaRouteProvider.RouteController routeController;
            MediaRouteProvider.RouteController routeController2;
            if (routeInfo == this.mSelectedRoute && (routeController2 = this.mSelectedRouteController) != null) {
                routeController2.onSetVolume(i);
            } else if (!this.mRouteControllerMap.isEmpty() && (routeController = this.mRouteControllerMap.get(routeInfo.mUniqueId)) != null) {
                routeController.onSetVolume(i);
            }
        }

        public void requestUpdateVolume(RouteInfo routeInfo, int i) {
            MediaRouteProvider.RouteController routeController;
            MediaRouteProvider.RouteController routeController2;
            if (routeInfo == this.mSelectedRoute && (routeController2 = this.mSelectedRouteController) != null) {
                routeController2.onUpdateVolume(i);
            } else if (!this.mRouteControllerMap.isEmpty() && (routeController = this.mRouteControllerMap.get(routeInfo.mUniqueId)) != null) {
                routeController.onUpdateVolume(i);
            }
        }

        /* access modifiers changed from: package-private */
        public void reset() {
            if (this.mIsInitialized) {
                this.mRegisteredProviderWatcher.stop();
                this.mActiveScanThrottlingHelper.reset();
                setMediaSessionCompat((MediaSessionCompat) null);
                Iterator<RemoteControlClientRecord> it = this.mRemoteControlClients.iterator();
                while (it.hasNext()) {
                    it.next().disconnect();
                }
                for (ProviderInfo providerInfo : new ArrayList(this.mProviders)) {
                    removeProvider(providerInfo.mProviderInstance);
                }
                this.mCallbackHandler.removeCallbacksAndMessages((Object) null);
            }
        }

        /* access modifiers changed from: package-private */
        public void selectRoute(@NonNull RouteInfo routeInfo, int i) {
            MediaRoute2Provider mediaRoute2Provider;
            if (!this.mRoutes.contains(routeInfo)) {
                Log.w(MediaRouter.TAG, "Ignoring attempt to select removed route: " + routeInfo);
            } else if (!routeInfo.mEnabled) {
                Log.w(MediaRouter.TAG, "Ignoring attempt to select disabled route: " + routeInfo);
            } else if (Build.VERSION.SDK_INT < 30 || routeInfo.getProviderInstance() != (mediaRoute2Provider = this.mMr2Provider) || this.mSelectedRoute == routeInfo) {
                selectRouteInternal(routeInfo, i);
            } else {
                mediaRoute2Provider.transferTo(routeInfo.getDescriptorId());
            }
        }

        /* access modifiers changed from: package-private */
        public void selectRouteInternal(@NonNull RouteInfo routeInfo, int i) {
            if (MediaRouter.sGlobal == null || (this.mBluetoothRoute != null && routeInfo.isDefault())) {
                StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
                StringBuilder sb = new StringBuilder();
                for (int i2 = 3; i2 < stackTrace.length; i2++) {
                    StackTraceElement stackTraceElement = stackTrace[i2];
                    sb.append(stackTraceElement.getClassName());
                    sb.append(".");
                    sb.append(stackTraceElement.getMethodName());
                    sb.append(":");
                    sb.append(stackTraceElement.getLineNumber());
                    sb.append("  ");
                }
                if (MediaRouter.sGlobal == null) {
                    Log.w(MediaRouter.TAG, "setSelectedRouteInternal is called while sGlobal is null: pkgName=" + this.mApplicationContext.getPackageName() + ", callers=" + sb.toString());
                } else {
                    Log.w(MediaRouter.TAG, "Default route is selected while a BT route is available: pkgName=" + this.mApplicationContext.getPackageName() + ", callers=" + sb.toString());
                }
            }
            if (this.mSelectedRoute != routeInfo) {
                if (this.mRequestedRoute != null) {
                    this.mRequestedRoute = null;
                    MediaRouteProvider.RouteController routeController = this.mRequestedRouteController;
                    if (routeController != null) {
                        routeController.onUnselect(3);
                        this.mRequestedRouteController.onRelease();
                        this.mRequestedRouteController = null;
                    }
                }
                if (isMediaTransferEnabled() && routeInfo.getProvider().supportsDynamicGroup()) {
                    MediaRouteProvider.DynamicGroupRouteController onCreateDynamicGroupRouteController = routeInfo.getProviderInstance().onCreateDynamicGroupRouteController(routeInfo.mDescriptorId);
                    if (onCreateDynamicGroupRouteController != null) {
                        onCreateDynamicGroupRouteController.setOnDynamicRoutesChangedListener(ContextCompat.getMainExecutor(this.mApplicationContext), this.mDynamicRoutesListener);
                        this.mRequestedRoute = routeInfo;
                        this.mRequestedRouteController = onCreateDynamicGroupRouteController;
                        onCreateDynamicGroupRouteController.onSelect();
                        return;
                    }
                    Log.w(MediaRouter.TAG, "setSelectedRouteInternal: Failed to create dynamic group route controller. route=" + routeInfo);
                }
                MediaRouteProvider.RouteController onCreateRouteController = routeInfo.getProviderInstance().onCreateRouteController(routeInfo.mDescriptorId);
                if (onCreateRouteController != null) {
                    onCreateRouteController.onSelect();
                }
                if (MediaRouter.DEBUG) {
                    Log.d(MediaRouter.TAG, "Route selected: " + routeInfo);
                }
                if (this.mSelectedRoute == null) {
                    this.mSelectedRoute = routeInfo;
                    this.mSelectedRouteController = onCreateRouteController;
                    this.mCallbackHandler.post(CallbackHandler.MSG_ROUTE_SELECTED, new Pair(null, routeInfo), i);
                    return;
                }
                notifyTransfer(this, routeInfo, onCreateRouteController, i, (RouteInfo) null, (Collection<MediaRouteProvider.DynamicGroupRouteController.DynamicRouteDescriptor>) null);
            }
        }

        public void sendControlRequest(RouteInfo routeInfo, Intent intent, ControlRequestCallback controlRequestCallback) {
            MediaRouteProvider.RouteController routeController;
            MediaRouteProvider.RouteController routeController2;
            if (routeInfo != this.mSelectedRoute || (routeController2 = this.mSelectedRouteController) == null || !routeController2.onControlRequest(intent, controlRequestCallback)) {
                PrepareTransferNotifier prepareTransferNotifier = this.mTransferNotifier;
                if ((prepareTransferNotifier == null || routeInfo != prepareTransferNotifier.mToRoute || (routeController = prepareTransferNotifier.mToRouteController) == null || !routeController.onControlRequest(intent, controlRequestCallback)) && controlRequestCallback != null) {
                    controlRequestCallback.onError((String) null, (Bundle) null);
                }
            }
        }

        public void setMediaSession(Object obj) {
            MediaSessionRecord mediaSessionRecord;
            if (obj != null) {
                mediaSessionRecord = new MediaSessionRecord(this, obj);
            } else {
                mediaSessionRecord = null;
            }
            setMediaSessionRecord(mediaSessionRecord);
        }

        public void setMediaSessionCompat(MediaSessionCompat mediaSessionCompat) {
            MediaSessionRecord mediaSessionRecord;
            this.mCompatSession = mediaSessionCompat;
            if (mediaSessionCompat != null) {
                mediaSessionRecord = new MediaSessionRecord(mediaSessionCompat);
            } else {
                mediaSessionRecord = null;
            }
            setMediaSessionRecord(mediaSessionRecord);
        }

        /* access modifiers changed from: package-private */
        public void setRouterParams(@Nullable MediaRouterParams mediaRouterParams) {
            boolean z;
            MediaRouterParams mediaRouterParams2 = this.mRouterParams;
            this.mRouterParams = mediaRouterParams;
            if (isMediaTransferEnabled()) {
                if (this.mMr2Provider == null) {
                    MediaRoute2Provider mediaRoute2Provider = new MediaRoute2Provider(this.mApplicationContext, new Mr2ProviderCallback());
                    this.mMr2Provider = mediaRoute2Provider;
                    addProvider(mediaRoute2Provider);
                    updateDiscoveryRequest();
                    this.mRegisteredProviderWatcher.rescan();
                }
                boolean z2 = false;
                if (mediaRouterParams2 == null) {
                    z = false;
                } else {
                    z = mediaRouterParams2.isTransferToLocalEnabled();
                }
                if (mediaRouterParams != null) {
                    z2 = mediaRouterParams.isTransferToLocalEnabled();
                }
                if (z != z2) {
                    this.mMr2Provider.setDiscoveryRequestInternal(this.mDiscoveryRequestForMr2Provider);
                }
            } else {
                MediaRoute2Provider mediaRoute2Provider2 = this.mMr2Provider;
                if (mediaRoute2Provider2 != null) {
                    removeProvider(mediaRoute2Provider2);
                    this.mMr2Provider = null;
                    this.mRegisteredProviderWatcher.rescan();
                }
            }
            this.mCallbackHandler.post(CallbackHandler.MSG_ROUTER_PARAMS_CHANGED, mediaRouterParams);
        }

        /* access modifiers changed from: package-private */
        public void transferToRoute(@NonNull RouteInfo routeInfo) {
            if (this.mSelectedRouteController instanceof MediaRouteProvider.DynamicGroupRouteController) {
                RouteInfo.DynamicGroupState dynamicGroupState = getDynamicGroupState(routeInfo);
                if (dynamicGroupState == null || !dynamicGroupState.isTransferable()) {
                    Log.w(MediaRouter.TAG, "Ignoring attempt to transfer to a non-transferable route.");
                } else {
                    ((MediaRouteProvider.DynamicGroupRouteController) this.mSelectedRouteController).onUpdateMemberRoutes(Collections.singletonList(routeInfo.getDescriptorId()));
                }
            } else {
                throw new IllegalStateException("There is no currently selected dynamic group route.");
            }
        }

        public void updateDiscoveryRequest() {
            MediaRouteSelector mediaRouteSelector;
            boolean z;
            MediaRouteSelector.Builder builder = new MediaRouteSelector.Builder();
            this.mActiveScanThrottlingHelper.reset();
            int size = this.mRouters.size();
            int i = 0;
            boolean z2 = false;
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                MediaRouter mediaRouter = (MediaRouter) this.mRouters.get(size).get();
                if (mediaRouter == null) {
                    this.mRouters.remove(size);
                } else {
                    int size2 = mediaRouter.mCallbackRecords.size();
                    i += size2;
                    for (int i2 = 0; i2 < size2; i2++) {
                        CallbackRecord callbackRecord = mediaRouter.mCallbackRecords.get(i2);
                        builder.addSelector(callbackRecord.mSelector);
                        if ((callbackRecord.mFlags & 1) != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        this.mActiveScanThrottlingHelper.requestActiveScan(z, callbackRecord.mTimestamp);
                        if (z) {
                            z2 = true;
                        }
                        int i3 = callbackRecord.mFlags;
                        if ((i3 & 4) != 0 && !this.mLowRam) {
                            z2 = true;
                        }
                        if ((i3 & 8) != 0) {
                            z2 = true;
                        }
                    }
                }
            }
            boolean finalizeActiveScanAndScheduleSuppressActiveScanRunnable = this.mActiveScanThrottlingHelper.finalizeActiveScanAndScheduleSuppressActiveScanRunnable();
            this.mCallbackCount = i;
            if (z2) {
                mediaRouteSelector = builder.build();
            } else {
                mediaRouteSelector = MediaRouteSelector.EMPTY;
            }
            updateMr2ProviderDiscoveryRequest(builder.build(), finalizeActiveScanAndScheduleSuppressActiveScanRunnable);
            MediaRouteDiscoveryRequest mediaRouteDiscoveryRequest = this.mDiscoveryRequest;
            if (mediaRouteDiscoveryRequest == null || !mediaRouteDiscoveryRequest.getSelector().equals(mediaRouteSelector) || this.mDiscoveryRequest.isActiveScan() != finalizeActiveScanAndScheduleSuppressActiveScanRunnable) {
                if (!mediaRouteSelector.isEmpty() || finalizeActiveScanAndScheduleSuppressActiveScanRunnable) {
                    this.mDiscoveryRequest = new MediaRouteDiscoveryRequest(mediaRouteSelector, finalizeActiveScanAndScheduleSuppressActiveScanRunnable);
                } else if (this.mDiscoveryRequest != null) {
                    this.mDiscoveryRequest = null;
                } else {
                    return;
                }
                if (MediaRouter.DEBUG) {
                    Log.d(MediaRouter.TAG, "Updated discovery request: " + this.mDiscoveryRequest);
                }
                if (z2 && !finalizeActiveScanAndScheduleSuppressActiveScanRunnable && this.mLowRam) {
                    Log.i(MediaRouter.TAG, "Forcing passive route discovery on a low-RAM device, system performance may be affected.  Please consider using CALLBACK_FLAG_REQUEST_DISCOVERY instead of CALLBACK_FLAG_FORCE_DISCOVERY.");
                }
                int size3 = this.mProviders.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    MediaRouteProvider mediaRouteProvider = this.mProviders.get(i4).mProviderInstance;
                    if (mediaRouteProvider != this.mMr2Provider) {
                        mediaRouteProvider.setDiscoveryRequest(this.mDiscoveryRequest);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void updatePlaybackInfoFromSelectedRoute() {
            RouteInfo routeInfo = this.mSelectedRoute;
            if (routeInfo != null) {
                this.mPlaybackInfo.volume = routeInfo.getVolume();
                this.mPlaybackInfo.volumeMax = this.mSelectedRoute.getVolumeMax();
                this.mPlaybackInfo.volumeHandling = this.mSelectedRoute.getVolumeHandling();
                this.mPlaybackInfo.playbackStream = this.mSelectedRoute.getPlaybackStream();
                this.mPlaybackInfo.playbackType = this.mSelectedRoute.getPlaybackType();
                if (!isMediaTransferEnabled() || this.mSelectedRoute.getProviderInstance() != this.mMr2Provider) {
                    this.mPlaybackInfo.volumeControlId = null;
                } else {
                    this.mPlaybackInfo.volumeControlId = MediaRoute2Provider.getSessionIdForRouteController(this.mSelectedRouteController);
                }
                int size = this.mRemoteControlClients.size();
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    this.mRemoteControlClients.get(i2).updatePlaybackInfo();
                }
                if (this.mMediaSession == null) {
                    return;
                }
                if (this.mSelectedRoute == getDefaultRoute() || this.mSelectedRoute == getBluetoothRoute()) {
                    this.mMediaSession.clearVolumeHandling();
                    return;
                }
                RemoteControlClientCompat.PlaybackInfo playbackInfo = this.mPlaybackInfo;
                if (playbackInfo.volumeHandling == 1) {
                    i = 2;
                }
                this.mMediaSession.configureVolume(i, playbackInfo.volumeMax, playbackInfo.volume, playbackInfo.volumeControlId);
                return;
            }
            MediaSessionRecord mediaSessionRecord = this.mMediaSession;
            if (mediaSessionRecord != null) {
                mediaSessionRecord.clearVolumeHandling();
            }
        }

        /* access modifiers changed from: package-private */
        public void updateProviderDescriptor(MediaRouteProvider mediaRouteProvider, MediaRouteProviderDescriptor mediaRouteProviderDescriptor) {
            ProviderInfo findProviderInfo = findProviderInfo(mediaRouteProvider);
            if (findProviderInfo != null) {
                updateProviderContents(findProviderInfo, mediaRouteProviderDescriptor);
            }
        }

        /* access modifiers changed from: package-private */
        public int updateRouteDescriptorAndNotify(RouteInfo routeInfo, MediaRouteDescriptor mediaRouteDescriptor) {
            int maybeUpdateDescriptor = routeInfo.maybeUpdateDescriptor(mediaRouteDescriptor);
            if (maybeUpdateDescriptor != 0) {
                if ((maybeUpdateDescriptor & 1) != 0) {
                    if (MediaRouter.DEBUG) {
                        Log.d(MediaRouter.TAG, "Route changed: " + routeInfo);
                    }
                    this.mCallbackHandler.post(CallbackHandler.MSG_ROUTE_CHANGED, routeInfo);
                }
                if ((maybeUpdateDescriptor & 2) != 0) {
                    if (MediaRouter.DEBUG) {
                        Log.d(MediaRouter.TAG, "Route volume changed: " + routeInfo);
                    }
                    this.mCallbackHandler.post(CallbackHandler.MSG_ROUTE_VOLUME_CHANGED, routeInfo);
                }
                if ((maybeUpdateDescriptor & 4) != 0) {
                    if (MediaRouter.DEBUG) {
                        Log.d(MediaRouter.TAG, "Route presentation display changed: " + routeInfo);
                    }
                    this.mCallbackHandler.post(CallbackHandler.MSG_ROUTE_PRESENTATION_DISPLAY_CHANGED, routeInfo);
                }
            }
            return maybeUpdateDescriptor;
        }

        /* access modifiers changed from: package-private */
        public void updateSelectedRouteIfNeeded(boolean z) {
            RouteInfo routeInfo = this.mDefaultRoute;
            if (routeInfo != null && !routeInfo.isSelectable()) {
                Log.i(MediaRouter.TAG, "Clearing the default route because it is no longer selectable: " + this.mDefaultRoute);
                this.mDefaultRoute = null;
            }
            if (this.mDefaultRoute == null && !this.mRoutes.isEmpty()) {
                Iterator<RouteInfo> it = this.mRoutes.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    RouteInfo next = it.next();
                    if (isSystemDefaultRoute(next) && next.isSelectable()) {
                        this.mDefaultRoute = next;
                        Log.i(MediaRouter.TAG, "Found default route: " + this.mDefaultRoute);
                        break;
                    }
                }
            }
            RouteInfo routeInfo2 = this.mBluetoothRoute;
            if (routeInfo2 != null && !routeInfo2.isSelectable()) {
                Log.i(MediaRouter.TAG, "Clearing the bluetooth route because it is no longer selectable: " + this.mBluetoothRoute);
                this.mBluetoothRoute = null;
            }
            if (this.mBluetoothRoute == null && !this.mRoutes.isEmpty()) {
                Iterator<RouteInfo> it2 = this.mRoutes.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    RouteInfo next2 = it2.next();
                    if (isSystemLiveAudioOnlyRoute(next2) && next2.isSelectable()) {
                        this.mBluetoothRoute = next2;
                        Log.i(MediaRouter.TAG, "Found bluetooth route: " + this.mBluetoothRoute);
                        break;
                    }
                }
            }
            RouteInfo routeInfo3 = this.mSelectedRoute;
            if (routeInfo3 == null || !routeInfo3.isEnabled()) {
                Log.i(MediaRouter.TAG, "Unselecting the current route because it is no longer selectable: " + this.mSelectedRoute);
                selectRouteInternal(chooseFallbackRoute(), 0);
            } else if (z) {
                maybeUpdateMemberRouteControllers();
                updatePlaybackInfoFromSelectedRoute();
            }
        }
    }

    public interface OnPrepareTransferListener {
        @MainThread
        @Nullable
        C6906d<Void> onPrepareTransfer(@NonNull RouteInfo routeInfo, @NonNull RouteInfo routeInfo2);
    }

    static final class PrepareTransferNotifier {
        private static final long TRANSFER_TIMEOUT_MS = 15000;
        private boolean mCanceled = false;
        private boolean mFinished = false;
        private final RouteInfo mFromRoute;
        private C6906d<Void> mFuture = null;
        @Nullable
        final List<MediaRouteProvider.DynamicGroupRouteController.DynamicRouteDescriptor> mMemberRoutes;
        final int mReason;
        private final RouteInfo mRequestedRoute;
        private final WeakReference<GlobalMediaRouter> mRouter;
        final RouteInfo mToRoute;
        final MediaRouteProvider.RouteController mToRouteController;

        PrepareTransferNotifier(GlobalMediaRouter globalMediaRouter, RouteInfo routeInfo, @Nullable MediaRouteProvider.RouteController routeController, int i, @Nullable RouteInfo routeInfo2, @Nullable Collection<MediaRouteProvider.DynamicGroupRouteController.DynamicRouteDescriptor> collection) {
            ArrayList arrayList = null;
            this.mRouter = new WeakReference<>(globalMediaRouter);
            this.mToRoute = routeInfo;
            this.mToRouteController = routeController;
            this.mReason = i;
            this.mFromRoute = globalMediaRouter.mSelectedRoute;
            this.mRequestedRoute = routeInfo2;
            this.mMemberRoutes = collection != null ? new ArrayList(collection) : arrayList;
            globalMediaRouter.mCallbackHandler.postDelayed(new C2522u0(this), 15000);
        }

        private void selectToRouteAndNotify() {
            GlobalMediaRouter globalMediaRouter = this.mRouter.get();
            if (globalMediaRouter != null) {
                RouteInfo routeInfo = this.mToRoute;
                globalMediaRouter.mSelectedRoute = routeInfo;
                globalMediaRouter.mSelectedRouteController = this.mToRouteController;
                RouteInfo routeInfo2 = this.mRequestedRoute;
                if (routeInfo2 == null) {
                    globalMediaRouter.mCallbackHandler.post(GlobalMediaRouter.CallbackHandler.MSG_ROUTE_SELECTED, new Pair(this.mFromRoute, routeInfo), this.mReason);
                } else {
                    globalMediaRouter.mCallbackHandler.post(GlobalMediaRouter.CallbackHandler.MSG_ROUTE_ANOTHER_SELECTED, new Pair(routeInfo2, routeInfo), this.mReason);
                }
                globalMediaRouter.mRouteControllerMap.clear();
                globalMediaRouter.maybeUpdateMemberRouteControllers();
                globalMediaRouter.updatePlaybackInfoFromSelectedRoute();
                List<MediaRouteProvider.DynamicGroupRouteController.DynamicRouteDescriptor> list = this.mMemberRoutes;
                if (list != null) {
                    globalMediaRouter.mSelectedRoute.updateDynamicDescriptors(list);
                }
            }
        }

        private void unselectFromRouteAndNotify() {
            RouteInfo routeInfo;
            GlobalMediaRouter globalMediaRouter = this.mRouter.get();
            if (globalMediaRouter != null && globalMediaRouter.mSelectedRoute == (routeInfo = this.mFromRoute)) {
                globalMediaRouter.mCallbackHandler.post(GlobalMediaRouter.CallbackHandler.MSG_ROUTE_UNSELECTED, routeInfo, this.mReason);
                MediaRouteProvider.RouteController routeController = globalMediaRouter.mSelectedRouteController;
                if (routeController != null) {
                    routeController.onUnselect(this.mReason);
                    globalMediaRouter.mSelectedRouteController.onRelease();
                }
                if (!globalMediaRouter.mRouteControllerMap.isEmpty()) {
                    for (MediaRouteProvider.RouteController next : globalMediaRouter.mRouteControllerMap.values()) {
                        next.onUnselect(this.mReason);
                        next.onRelease();
                    }
                    globalMediaRouter.mRouteControllerMap.clear();
                }
                globalMediaRouter.mSelectedRouteController = null;
            }
        }

        /* access modifiers changed from: package-private */
        public void cancel() {
            if (!this.mFinished && !this.mCanceled) {
                this.mCanceled = true;
                MediaRouteProvider.RouteController routeController = this.mToRouteController;
                if (routeController != null) {
                    routeController.onUnselect(0);
                    this.mToRouteController.onRelease();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void finishTransfer() {
            C6906d<Void> dVar;
            MediaRouter.checkCallingThread();
            if (!this.mFinished && !this.mCanceled) {
                GlobalMediaRouter globalMediaRouter = this.mRouter.get();
                if (globalMediaRouter == null || globalMediaRouter.mTransferNotifier != this || ((dVar = this.mFuture) != null && dVar.isCancelled())) {
                    cancel();
                    return;
                }
                this.mFinished = true;
                globalMediaRouter.mTransferNotifier = null;
                unselectFromRouteAndNotify();
                selectToRouteAndNotify();
            }
        }

        /* access modifiers changed from: package-private */
        public void setFuture(C6906d<Void> dVar) {
            GlobalMediaRouter globalMediaRouter = this.mRouter.get();
            if (globalMediaRouter == null || globalMediaRouter.mTransferNotifier != this) {
                Log.w(MediaRouter.TAG, "Router is released. Cancel transfer");
                cancel();
            } else if (this.mFuture == null) {
                this.mFuture = dVar;
                C2522u0 u0Var = new C2522u0(this);
                GlobalMediaRouter.CallbackHandler callbackHandler = globalMediaRouter.mCallbackHandler;
                Objects.requireNonNull(callbackHandler);
                dVar.addListener(u0Var, new C2524v0(callbackHandler));
            } else {
                throw new IllegalStateException("future is already set");
            }
        }
    }

    public static final class ProviderInfo {
        private MediaRouteProviderDescriptor mDescriptor;
        private final MediaRouteProvider.ProviderMetadata mMetadata;
        final MediaRouteProvider mProviderInstance;
        final List<RouteInfo> mRoutes = new ArrayList();

        ProviderInfo(MediaRouteProvider mediaRouteProvider) {
            this.mProviderInstance = mediaRouteProvider;
            this.mMetadata = mediaRouteProvider.getMetadata();
        }

        /* access modifiers changed from: package-private */
        public RouteInfo findRouteByDescriptorId(String str) {
            int size = this.mRoutes.size();
            for (int i = 0; i < size; i++) {
                if (this.mRoutes.get(i).mDescriptorId.equals(str)) {
                    return this.mRoutes.get(i);
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public int findRouteIndexByDescriptorId(String str) {
            int size = this.mRoutes.size();
            for (int i = 0; i < size; i++) {
                if (this.mRoutes.get(i).mDescriptorId.equals(str)) {
                    return i;
                }
            }
            return -1;
        }

        @NonNull
        public ComponentName getComponentName() {
            return this.mMetadata.getComponentName();
        }

        @NonNull
        public String getPackageName() {
            return this.mMetadata.getPackageName();
        }

        @NonNull
        public MediaRouteProvider getProviderInstance() {
            MediaRouter.checkCallingThread();
            return this.mProviderInstance;
        }

        @NonNull
        public List<RouteInfo> getRoutes() {
            MediaRouter.checkCallingThread();
            return Collections.unmodifiableList(this.mRoutes);
        }

        /* access modifiers changed from: package-private */
        public boolean supportsDynamicGroup() {
            MediaRouteProviderDescriptor mediaRouteProviderDescriptor = this.mDescriptor;
            if (mediaRouteProviderDescriptor == null || !mediaRouteProviderDescriptor.supportsDynamicGroupRoute()) {
                return false;
            }
            return true;
        }

        public String toString() {
            return "MediaRouter.RouteProviderInfo{ packageName=" + getPackageName() + " }";
        }

        /* access modifiers changed from: package-private */
        public boolean updateDescriptor(MediaRouteProviderDescriptor mediaRouteProviderDescriptor) {
            if (this.mDescriptor == mediaRouteProviderDescriptor) {
                return false;
            }
            this.mDescriptor = mediaRouteProviderDescriptor;
            return true;
        }
    }

    public static class RouteInfo {
        static final int CHANGE_GENERAL = 1;
        static final int CHANGE_PRESENTATION_DISPLAY = 4;
        static final int CHANGE_VOLUME = 2;
        public static final int CONNECTION_STATE_CONNECTED = 2;
        public static final int CONNECTION_STATE_CONNECTING = 1;
        public static final int CONNECTION_STATE_DISCONNECTED = 0;
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public static final int DEVICE_TYPE_BLUETOOTH = 3;
        public static final int DEVICE_TYPE_SPEAKER = 2;
        public static final int DEVICE_TYPE_TV = 1;
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public static final int DEVICE_TYPE_UNKNOWN = 0;
        public static final int PLAYBACK_TYPE_LOCAL = 0;
        public static final int PLAYBACK_TYPE_REMOTE = 1;
        public static final int PLAYBACK_VOLUME_FIXED = 0;
        public static final int PLAYBACK_VOLUME_VARIABLE = 1;
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public static final int PRESENTATION_DISPLAY_ID_NONE = -1;
        static final String SYSTEM_MEDIA_ROUTE_PROVIDER_PACKAGE_NAME = "android";
        private boolean mCanDisconnect;
        private int mConnectionState;
        private final ArrayList<IntentFilter> mControlFilters = new ArrayList<>();
        private String mDescription;
        MediaRouteDescriptor mDescriptor;
        final String mDescriptorId;
        private int mDeviceType;
        private Map<String, MediaRouteProvider.DynamicGroupRouteController.DynamicRouteDescriptor> mDynamicGroupDescriptors;
        boolean mEnabled;
        private Bundle mExtras;
        private Uri mIconUri;
        private List<RouteInfo> mMemberRoutes = new ArrayList();
        private String mName;
        private int mPlaybackStream;
        private int mPlaybackType;
        private Display mPresentationDisplay;
        private int mPresentationDisplayId = -1;
        private final ProviderInfo mProvider;
        private IntentSender mSettingsIntent;
        final String mUniqueId;
        private int mVolume;
        private int mVolumeHandling;
        private int mVolumeMax;

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public static final class DynamicGroupState {
            final MediaRouteProvider.DynamicGroupRouteController.DynamicRouteDescriptor mDynamicDescriptor;

            DynamicGroupState(MediaRouteProvider.DynamicGroupRouteController.DynamicRouteDescriptor dynamicRouteDescriptor) {
                this.mDynamicDescriptor = dynamicRouteDescriptor;
            }

            @RestrictTo({RestrictTo.Scope.LIBRARY})
            public int getSelectionState() {
                MediaRouteProvider.DynamicGroupRouteController.DynamicRouteDescriptor dynamicRouteDescriptor = this.mDynamicDescriptor;
                if (dynamicRouteDescriptor != null) {
                    return dynamicRouteDescriptor.getSelectionState();
                }
                return 1;
            }

            @RestrictTo({RestrictTo.Scope.LIBRARY})
            public boolean isGroupable() {
                MediaRouteProvider.DynamicGroupRouteController.DynamicRouteDescriptor dynamicRouteDescriptor = this.mDynamicDescriptor;
                if (dynamicRouteDescriptor == null || !dynamicRouteDescriptor.isGroupable()) {
                    return false;
                }
                return true;
            }

            @RestrictTo({RestrictTo.Scope.LIBRARY})
            public boolean isTransferable() {
                MediaRouteProvider.DynamicGroupRouteController.DynamicRouteDescriptor dynamicRouteDescriptor = this.mDynamicDescriptor;
                if (dynamicRouteDescriptor == null || !dynamicRouteDescriptor.isTransferable()) {
                    return false;
                }
                return true;
            }

            @RestrictTo({RestrictTo.Scope.LIBRARY})
            public boolean isUnselectable() {
                MediaRouteProvider.DynamicGroupRouteController.DynamicRouteDescriptor dynamicRouteDescriptor = this.mDynamicDescriptor;
                if (dynamicRouteDescriptor == null || dynamicRouteDescriptor.isUnselectable()) {
                    return true;
                }
                return false;
            }
        }

        RouteInfo(ProviderInfo providerInfo, String str, String str2) {
            this.mProvider = providerInfo;
            this.mDescriptorId = str;
            this.mUniqueId = str2;
        }

        private boolean isSameControlFilter(IntentFilter intentFilter, IntentFilter intentFilter2) {
            int countActions;
            if (intentFilter == intentFilter2) {
                return true;
            }
            if (intentFilter == null || intentFilter2 == null || (countActions = intentFilter.countActions()) != intentFilter2.countActions()) {
                return false;
            }
            for (int i = 0; i < countActions; i++) {
                if (!intentFilter.getAction(i).equals(intentFilter2.getAction(i))) {
                    return false;
                }
            }
            int countCategories = intentFilter.countCategories();
            if (countCategories != intentFilter2.countCategories()) {
                return false;
            }
            for (int i2 = 0; i2 < countCategories; i2++) {
                if (!intentFilter.getCategory(i2).equals(intentFilter2.getCategory(i2))) {
                    return false;
                }
            }
            return true;
        }

        private boolean isSameControlFilters(List<IntentFilter> list, List<IntentFilter> list2) {
            if (list == list2) {
                return true;
            }
            if (list == null || list2 == null) {
                return false;
            }
            ListIterator<IntentFilter> listIterator = list.listIterator();
            ListIterator<IntentFilter> listIterator2 = list2.listIterator();
            while (listIterator.hasNext() && listIterator2.hasNext()) {
                if (!isSameControlFilter(listIterator.next(), listIterator2.next())) {
                    return false;
                }
            }
            if (listIterator.hasNext() || listIterator2.hasNext()) {
                return false;
            }
            return true;
        }

        private static boolean isSystemMediaRouteProvider(RouteInfo routeInfo) {
            return TextUtils.equals(routeInfo.getProviderInstance().getMetadata().getPackageName(), "android");
        }

        public boolean canDisconnect() {
            return this.mCanDisconnect;
        }

        /* access modifiers changed from: package-private */
        public RouteInfo findRouteByDynamicRouteDescriptor(MediaRouteProvider.DynamicGroupRouteController.DynamicRouteDescriptor dynamicRouteDescriptor) {
            return getProvider().findRouteByDescriptorId(dynamicRouteDescriptor.getRouteDescriptor().getId());
        }

        public int getConnectionState() {
            return this.mConnectionState;
        }

        @NonNull
        public List<IntentFilter> getControlFilters() {
            return this.mControlFilters;
        }

        @Nullable
        public String getDescription() {
            return this.mDescription;
        }

        /* access modifiers changed from: package-private */
        public String getDescriptorId() {
            return this.mDescriptorId;
        }

        public int getDeviceType() {
            return this.mDeviceType;
        }

        @Nullable
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public MediaRouteProvider.DynamicGroupRouteController getDynamicGroupController() {
            MediaRouter.checkCallingThread();
            MediaRouteProvider.RouteController routeController = MediaRouter.getGlobalRouter().mSelectedRouteController;
            if (routeController instanceof MediaRouteProvider.DynamicGroupRouteController) {
                return (MediaRouteProvider.DynamicGroupRouteController) routeController;
            }
            return null;
        }

        @Nullable
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public DynamicGroupState getDynamicGroupState(@NonNull RouteInfo routeInfo) {
            if (routeInfo != null) {
                Map<String, MediaRouteProvider.DynamicGroupRouteController.DynamicRouteDescriptor> map = this.mDynamicGroupDescriptors;
                if (map == null || !map.containsKey(routeInfo.mUniqueId)) {
                    return null;
                }
                return new DynamicGroupState(this.mDynamicGroupDescriptors.get(routeInfo.mUniqueId));
            }
            throw new NullPointerException("route must not be null");
        }

        @Nullable
        public Bundle getExtras() {
            return this.mExtras;
        }

        @Nullable
        public Uri getIconUri() {
            return this.mIconUri;
        }

        @NonNull
        public String getId() {
            return this.mUniqueId;
        }

        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public List<RouteInfo> getMemberRoutes() {
            return Collections.unmodifiableList(this.mMemberRoutes);
        }

        @NonNull
        public String getName() {
            return this.mName;
        }

        public int getPlaybackStream() {
            return this.mPlaybackStream;
        }

        public int getPlaybackType() {
            return this.mPlaybackType;
        }

        @Nullable
        public Display getPresentationDisplay() {
            MediaRouter.checkCallingThread();
            if (this.mPresentationDisplayId >= 0 && this.mPresentationDisplay == null) {
                this.mPresentationDisplay = MediaRouter.getGlobalRouter().getDisplay(this.mPresentationDisplayId);
            }
            return this.mPresentationDisplay;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public int getPresentationDisplayId() {
            return this.mPresentationDisplayId;
        }

        @NonNull
        public ProviderInfo getProvider() {
            return this.mProvider;
        }

        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public MediaRouteProvider getProviderInstance() {
            return this.mProvider.getProviderInstance();
        }

        @Nullable
        public IntentSender getSettingsIntent() {
            return this.mSettingsIntent;
        }

        public int getVolume() {
            return this.mVolume;
        }

        public int getVolumeHandling() {
            if (!isGroup() || MediaRouter.isGroupVolumeUxEnabled()) {
                return this.mVolumeHandling;
            }
            return 0;
        }

        public int getVolumeMax() {
            return this.mVolumeMax;
        }

        public boolean isBluetooth() {
            MediaRouter.checkCallingThread();
            if (MediaRouter.getGlobalRouter().getBluetoothRoute() == this) {
                return true;
            }
            return false;
        }

        @Deprecated
        public boolean isConnecting() {
            if (this.mConnectionState == 1) {
                return true;
            }
            return false;
        }

        public boolean isDefault() {
            MediaRouter.checkCallingThread();
            if (MediaRouter.getGlobalRouter().getDefaultRoute() == this) {
                return true;
            }
            return false;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public boolean isDefaultOrBluetooth() {
            if (isDefault() || this.mDeviceType == 3) {
                return true;
            }
            if (!isSystemMediaRouteProvider(this) || !supportsControlCategory(MediaControlIntent.CATEGORY_LIVE_AUDIO) || supportsControlCategory(MediaControlIntent.CATEGORY_LIVE_VIDEO)) {
                return false;
            }
            return true;
        }

        public boolean isDeviceSpeaker() {
            int identifier = Resources.getSystem().getIdentifier("default_audio_route_name", TypedValues.Custom.S_STRING, "android");
            if (!isDefault() || !TextUtils.equals(Resources.getSystem().getText(identifier), this.mName)) {
                return false;
            }
            return true;
        }

        public boolean isEnabled() {
            return this.mEnabled;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public boolean isGroup() {
            if (getMemberRoutes().size() >= 1) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean isSelectable() {
            if (this.mDescriptor == null || !this.mEnabled) {
                return false;
            }
            return true;
        }

        public boolean isSelected() {
            MediaRouter.checkCallingThread();
            if (MediaRouter.getGlobalRouter().getSelectedRoute() == this) {
                return true;
            }
            return false;
        }

        public boolean matchesSelector(@NonNull MediaRouteSelector mediaRouteSelector) {
            if (mediaRouteSelector != null) {
                MediaRouter.checkCallingThread();
                return mediaRouteSelector.matchesControlFilters(this.mControlFilters);
            }
            throw new IllegalArgumentException("selector must not be null");
        }

        /* access modifiers changed from: package-private */
        public int maybeUpdateDescriptor(MediaRouteDescriptor mediaRouteDescriptor) {
            if (this.mDescriptor != mediaRouteDescriptor) {
                return updateDescriptor(mediaRouteDescriptor);
            }
            return 0;
        }

        public void requestSetVolume(int i) {
            MediaRouter.checkCallingThread();
            MediaRouter.getGlobalRouter().requestSetVolume(this, Math.min(this.mVolumeMax, Math.max(0, i)));
        }

        public void requestUpdateVolume(int i) {
            MediaRouter.checkCallingThread();
            if (i != 0) {
                MediaRouter.getGlobalRouter().requestUpdateVolume(this, i);
            }
        }

        public void select() {
            MediaRouter.checkCallingThread();
            MediaRouter.getGlobalRouter().selectRoute(this, 3);
        }

        public void sendControlRequest(@NonNull Intent intent, @Nullable ControlRequestCallback controlRequestCallback) {
            if (intent != null) {
                MediaRouter.checkCallingThread();
                MediaRouter.getGlobalRouter().sendControlRequest(this, intent, controlRequestCallback);
                return;
            }
            throw new IllegalArgumentException("intent must not be null");
        }

        public boolean supportsControlAction(@NonNull String str, @NonNull String str2) {
            if (str == null) {
                throw new IllegalArgumentException("category must not be null");
            } else if (str2 != null) {
                MediaRouter.checkCallingThread();
                int size = this.mControlFilters.size();
                for (int i = 0; i < size; i++) {
                    IntentFilter intentFilter = this.mControlFilters.get(i);
                    if (intentFilter.hasCategory(str) && intentFilter.hasAction(str2)) {
                        return true;
                    }
                }
                return false;
            } else {
                throw new IllegalArgumentException("action must not be null");
            }
        }

        public boolean supportsControlCategory(@NonNull String str) {
            if (str != null) {
                MediaRouter.checkCallingThread();
                int size = this.mControlFilters.size();
                for (int i = 0; i < size; i++) {
                    if (this.mControlFilters.get(i).hasCategory(str)) {
                        return true;
                    }
                }
                return false;
            }
            throw new IllegalArgumentException("category must not be null");
        }

        public boolean supportsControlRequest(@NonNull Intent intent) {
            if (intent != null) {
                MediaRouter.checkCallingThread();
                ContentResolver contentResolver = MediaRouter.getGlobalRouter().getContentResolver();
                int size = this.mControlFilters.size();
                for (int i = 0; i < size; i++) {
                    if (this.mControlFilters.get(i).match(contentResolver, intent, true, MediaRouter.TAG) >= 0) {
                        return true;
                    }
                }
                return false;
            }
            throw new IllegalArgumentException("intent must not be null");
        }

        @NonNull
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("MediaRouter.RouteInfo{ uniqueId=" + this.mUniqueId + ", name=" + this.mName + ", description=" + this.mDescription + ", iconUri=" + this.mIconUri + ", enabled=" + this.mEnabled + ", connectionState=" + this.mConnectionState + ", canDisconnect=" + this.mCanDisconnect + ", playbackType=" + this.mPlaybackType + ", playbackStream=" + this.mPlaybackStream + ", deviceType=" + this.mDeviceType + ", volumeHandling=" + this.mVolumeHandling + ", volume=" + this.mVolume + ", volumeMax=" + this.mVolumeMax + ", presentationDisplayId=" + this.mPresentationDisplayId + ", extras=" + this.mExtras + ", settingsIntent=" + this.mSettingsIntent + ", providerPackageName=" + this.mProvider.getPackageName());
            if (isGroup()) {
                sb.append(", members=[");
                int size = this.mMemberRoutes.size();
                for (int i = 0; i < size; i++) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    if (this.mMemberRoutes.get(i) != this) {
                        sb.append(this.mMemberRoutes.get(i).getId());
                    }
                }
                sb.append(']');
            }
            sb.append(" }");
            return sb.toString();
        }

        /* access modifiers changed from: package-private */
        public int updateDescriptor(MediaRouteDescriptor mediaRouteDescriptor) {
            int i;
            this.mDescriptor = mediaRouteDescriptor;
            boolean z = false;
            if (mediaRouteDescriptor == null) {
                return 0;
            }
            if (!ObjectsCompat.equals(this.mName, mediaRouteDescriptor.getName())) {
                this.mName = mediaRouteDescriptor.getName();
                i = 1;
            } else {
                i = 0;
            }
            if (!ObjectsCompat.equals(this.mDescription, mediaRouteDescriptor.getDescription())) {
                this.mDescription = mediaRouteDescriptor.getDescription();
                i |= 1;
            }
            if (!ObjectsCompat.equals(this.mIconUri, mediaRouteDescriptor.getIconUri())) {
                this.mIconUri = mediaRouteDescriptor.getIconUri();
                i |= 1;
            }
            if (this.mEnabled != mediaRouteDescriptor.isEnabled()) {
                this.mEnabled = mediaRouteDescriptor.isEnabled();
                i |= 1;
            }
            if (this.mConnectionState != mediaRouteDescriptor.getConnectionState()) {
                this.mConnectionState = mediaRouteDescriptor.getConnectionState();
                i |= 1;
            }
            if (!isSameControlFilters(this.mControlFilters, mediaRouteDescriptor.getControlFilters())) {
                this.mControlFilters.clear();
                this.mControlFilters.addAll(mediaRouteDescriptor.getControlFilters());
                i |= 1;
            }
            if (this.mPlaybackType != mediaRouteDescriptor.getPlaybackType()) {
                this.mPlaybackType = mediaRouteDescriptor.getPlaybackType();
                i |= 1;
            }
            if (this.mPlaybackStream != mediaRouteDescriptor.getPlaybackStream()) {
                this.mPlaybackStream = mediaRouteDescriptor.getPlaybackStream();
                i |= 1;
            }
            if (this.mDeviceType != mediaRouteDescriptor.getDeviceType()) {
                this.mDeviceType = mediaRouteDescriptor.getDeviceType();
                i |= 1;
            }
            if (this.mVolumeHandling != mediaRouteDescriptor.getVolumeHandling()) {
                this.mVolumeHandling = mediaRouteDescriptor.getVolumeHandling();
                i |= 3;
            }
            if (this.mVolume != mediaRouteDescriptor.getVolume()) {
                this.mVolume = mediaRouteDescriptor.getVolume();
                i |= 3;
            }
            if (this.mVolumeMax != mediaRouteDescriptor.getVolumeMax()) {
                this.mVolumeMax = mediaRouteDescriptor.getVolumeMax();
                i |= 3;
            }
            if (this.mPresentationDisplayId != mediaRouteDescriptor.getPresentationDisplayId()) {
                this.mPresentationDisplayId = mediaRouteDescriptor.getPresentationDisplayId();
                this.mPresentationDisplay = null;
                i |= 5;
            }
            if (!ObjectsCompat.equals(this.mExtras, mediaRouteDescriptor.getExtras())) {
                this.mExtras = mediaRouteDescriptor.getExtras();
                i |= 1;
            }
            if (!ObjectsCompat.equals(this.mSettingsIntent, mediaRouteDescriptor.getSettingsActivity())) {
                this.mSettingsIntent = mediaRouteDescriptor.getSettingsActivity();
                i |= 1;
            }
            if (this.mCanDisconnect != mediaRouteDescriptor.canDisconnectAndKeepPlaying()) {
                this.mCanDisconnect = mediaRouteDescriptor.canDisconnectAndKeepPlaying();
                i |= 5;
            }
            List<String> groupMemberIds = mediaRouteDescriptor.getGroupMemberIds();
            ArrayList arrayList = new ArrayList();
            if (groupMemberIds.size() != this.mMemberRoutes.size()) {
                z = true;
            }
            if (!groupMemberIds.isEmpty()) {
                GlobalMediaRouter globalRouter = MediaRouter.getGlobalRouter();
                for (String uniqueId : groupMemberIds) {
                    RouteInfo route = globalRouter.getRoute(globalRouter.getUniqueId(getProvider(), uniqueId));
                    if (route != null) {
                        arrayList.add(route);
                        if (!z && !this.mMemberRoutes.contains(route)) {
                            z = true;
                        }
                    }
                }
            }
            if (!z) {
                return i;
            }
            this.mMemberRoutes = arrayList;
            return i | 1;
        }

        /* access modifiers changed from: package-private */
        public void updateDynamicDescriptors(Collection<MediaRouteProvider.DynamicGroupRouteController.DynamicRouteDescriptor> collection) {
            this.mMemberRoutes.clear();
            if (this.mDynamicGroupDescriptors == null) {
                this.mDynamicGroupDescriptors = new ArrayMap();
            }
            this.mDynamicGroupDescriptors.clear();
            for (MediaRouteProvider.DynamicGroupRouteController.DynamicRouteDescriptor next : collection) {
                RouteInfo findRouteByDynamicRouteDescriptor = findRouteByDynamicRouteDescriptor(next);
                if (findRouteByDynamicRouteDescriptor != null) {
                    this.mDynamicGroupDescriptors.put(findRouteByDynamicRouteDescriptor.mUniqueId, next);
                    if (next.getSelectionState() == 2 || next.getSelectionState() == 3) {
                        this.mMemberRoutes.add(findRouteByDynamicRouteDescriptor);
                    }
                }
            }
            MediaRouter.getGlobalRouter().mCallbackHandler.post(GlobalMediaRouter.CallbackHandler.MSG_ROUTE_CHANGED, this);
        }
    }

    MediaRouter(Context context) {
        this.mContext = context;
    }

    static void checkCallingThread() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("The media router service must only be accessed on the application's main thread.");
        }
    }

    private int findCallbackRecord(Callback callback) {
        int size = this.mCallbackRecords.size();
        for (int i = 0; i < size; i++) {
            if (this.mCallbackRecords.get(i).mCallback == callback) {
                return i;
            }
        }
        return -1;
    }

    static int getGlobalCallbackCount() {
        if (sGlobal == null) {
            return 0;
        }
        return getGlobalRouter().getCallbackCount();
    }

    @MainThread
    static GlobalMediaRouter getGlobalRouter() {
        GlobalMediaRouter globalMediaRouter = sGlobal;
        if (globalMediaRouter == null) {
            return null;
        }
        globalMediaRouter.ensureInitialized();
        return sGlobal;
    }

    @NonNull
    public static MediaRouter getInstance(@NonNull Context context) {
        if (context != null) {
            checkCallingThread();
            if (sGlobal == null) {
                sGlobal = new GlobalMediaRouter(context.getApplicationContext());
            }
            return sGlobal.getRouter(context);
        }
        throw new IllegalArgumentException("context must not be null");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static boolean isGroupVolumeUxEnabled() {
        if (sGlobal == null) {
            return false;
        }
        return getGlobalRouter().isGroupVolumeUxEnabled();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static boolean isMediaTransferEnabled() {
        if (sGlobal == null) {
            return false;
        }
        return getGlobalRouter().isMediaTransferEnabled();
    }

    static boolean isTransferToLocalEnabled() {
        GlobalMediaRouter globalRouter = getGlobalRouter();
        if (globalRouter == null) {
            return false;
        }
        return globalRouter.isTransferToLocalEnabled();
    }

    @MainThread
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static void resetGlobalRouter() {
        GlobalMediaRouter globalMediaRouter = sGlobal;
        if (globalMediaRouter != null) {
            globalMediaRouter.reset();
            sGlobal = null;
        }
    }

    public void addCallback(@NonNull MediaRouteSelector mediaRouteSelector, @NonNull Callback callback) {
        addCallback(mediaRouteSelector, callback, 0);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void addMemberToDynamicGroup(@NonNull RouteInfo routeInfo) {
        if (routeInfo != null) {
            checkCallingThread();
            getGlobalRouter().addMemberToDynamicGroup(routeInfo);
            return;
        }
        throw new NullPointerException("route must not be null");
    }

    public void addProvider(@NonNull MediaRouteProvider mediaRouteProvider) {
        if (mediaRouteProvider != null) {
            checkCallingThread();
            if (DEBUG) {
                Log.d(TAG, "addProvider: " + mediaRouteProvider);
            }
            getGlobalRouter().addProvider(mediaRouteProvider);
            return;
        }
        throw new IllegalArgumentException("providerInstance must not be null");
    }

    public void addRemoteControlClient(@NonNull Object obj) {
        if (obj != null) {
            checkCallingThread();
            if (DEBUG) {
                Log.d(TAG, "addRemoteControlClient: " + obj);
            }
            getGlobalRouter().addRemoteControlClient(obj);
            return;
        }
        throw new IllegalArgumentException("remoteControlClient must not be null");
    }

    @Nullable
    public RouteInfo getBluetoothRoute() {
        checkCallingThread();
        GlobalMediaRouter globalRouter = getGlobalRouter();
        if (globalRouter == null) {
            return null;
        }
        return globalRouter.getBluetoothRoute();
    }

    @NonNull
    public RouteInfo getDefaultRoute() {
        checkCallingThread();
        return getGlobalRouter().getDefaultRoute();
    }

    @Nullable
    public MediaSessionCompat.Token getMediaSessionToken() {
        GlobalMediaRouter globalMediaRouter = sGlobal;
        if (globalMediaRouter == null) {
            return null;
        }
        return globalMediaRouter.getMediaSessionToken();
    }

    @NonNull
    public List<ProviderInfo> getProviders() {
        checkCallingThread();
        GlobalMediaRouter globalRouter = getGlobalRouter();
        if (globalRouter == null) {
            return Collections.emptyList();
        }
        return globalRouter.getProviders();
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public RouteInfo getRoute(String str) {
        checkCallingThread();
        GlobalMediaRouter globalRouter = getGlobalRouter();
        if (globalRouter == null) {
            return null;
        }
        return globalRouter.getRoute(str);
    }

    @Nullable
    public MediaRouterParams getRouterParams() {
        checkCallingThread();
        GlobalMediaRouter globalRouter = getGlobalRouter();
        if (globalRouter == null) {
            return null;
        }
        return globalRouter.getRouterParams();
    }

    @NonNull
    public List<RouteInfo> getRoutes() {
        checkCallingThread();
        GlobalMediaRouter globalRouter = getGlobalRouter();
        if (globalRouter == null) {
            return Collections.emptyList();
        }
        return globalRouter.getRoutes();
    }

    @NonNull
    public RouteInfo getSelectedRoute() {
        checkCallingThread();
        return getGlobalRouter().getSelectedRoute();
    }

    public boolean isRouteAvailable(@NonNull MediaRouteSelector mediaRouteSelector, int i) {
        if (mediaRouteSelector != null) {
            checkCallingThread();
            return getGlobalRouter().isRouteAvailable(mediaRouteSelector, i);
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    public void removeCallback(@NonNull Callback callback) {
        if (callback != null) {
            checkCallingThread();
            if (DEBUG) {
                Log.d(TAG, "removeCallback: callback=" + callback);
            }
            int findCallbackRecord = findCallbackRecord(callback);
            if (findCallbackRecord >= 0) {
                this.mCallbackRecords.remove(findCallbackRecord);
                getGlobalRouter().updateDiscoveryRequest();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("callback must not be null");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void removeMemberFromDynamicGroup(@NonNull RouteInfo routeInfo) {
        if (routeInfo != null) {
            checkCallingThread();
            getGlobalRouter().removeMemberFromDynamicGroup(routeInfo);
            return;
        }
        throw new NullPointerException("route must not be null");
    }

    public void removeProvider(@NonNull MediaRouteProvider mediaRouteProvider) {
        if (mediaRouteProvider != null) {
            checkCallingThread();
            if (DEBUG) {
                Log.d(TAG, "removeProvider: " + mediaRouteProvider);
            }
            getGlobalRouter().removeProvider(mediaRouteProvider);
            return;
        }
        throw new IllegalArgumentException("providerInstance must not be null");
    }

    public void removeRemoteControlClient(@NonNull Object obj) {
        if (obj != null) {
            checkCallingThread();
            if (DEBUG) {
                Log.d(TAG, "removeRemoteControlClient: " + obj);
            }
            getGlobalRouter().removeRemoteControlClient(obj);
            return;
        }
        throw new IllegalArgumentException("remoteControlClient must not be null");
    }

    public void selectRoute(@NonNull RouteInfo routeInfo) {
        if (routeInfo != null) {
            checkCallingThread();
            if (DEBUG) {
                Log.d(TAG, "selectRoute: " + routeInfo);
            }
            getGlobalRouter().selectRoute(routeInfo, 3);
            return;
        }
        throw new IllegalArgumentException("route must not be null");
    }

    public void setMediaSession(@Nullable Object obj) {
        checkCallingThread();
        if (DEBUG) {
            Log.d(TAG, "setMediaSession: " + obj);
        }
        getGlobalRouter().setMediaSession(obj);
    }

    public void setMediaSessionCompat(@Nullable MediaSessionCompat mediaSessionCompat) {
        checkCallingThread();
        if (DEBUG) {
            Log.d(TAG, "setMediaSessionCompat: " + mediaSessionCompat);
        }
        getGlobalRouter().setMediaSessionCompat(mediaSessionCompat);
    }

    @MainThread
    public void setOnPrepareTransferListener(@Nullable OnPrepareTransferListener onPrepareTransferListener) {
        checkCallingThread();
        getGlobalRouter().mOnPrepareTransferListener = onPrepareTransferListener;
    }

    public void setRouterParams(@Nullable MediaRouterParams mediaRouterParams) {
        checkCallingThread();
        getGlobalRouter().setRouterParams(mediaRouterParams);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void transferToRoute(@NonNull RouteInfo routeInfo) {
        if (routeInfo != null) {
            checkCallingThread();
            getGlobalRouter().transferToRoute(routeInfo);
            return;
        }
        throw new NullPointerException("route must not be null");
    }

    public void unselect(int i) {
        if (i < 0 || i > 3) {
            throw new IllegalArgumentException("Unsupported reason to unselect route");
        }
        checkCallingThread();
        GlobalMediaRouter globalRouter = getGlobalRouter();
        RouteInfo chooseFallbackRoute = globalRouter.chooseFallbackRoute();
        if (globalRouter.getSelectedRoute() != chooseFallbackRoute) {
            globalRouter.selectRoute(chooseFallbackRoute, i);
        }
    }

    @NonNull
    public RouteInfo updateSelectedRoute(@NonNull MediaRouteSelector mediaRouteSelector) {
        if (mediaRouteSelector != null) {
            checkCallingThread();
            if (DEBUG) {
                Log.d(TAG, "updateSelectedRoute: " + mediaRouteSelector);
            }
            GlobalMediaRouter globalRouter = getGlobalRouter();
            RouteInfo selectedRoute = globalRouter.getSelectedRoute();
            if (selectedRoute.isDefaultOrBluetooth() || selectedRoute.matchesSelector(mediaRouteSelector)) {
                return selectedRoute;
            }
            RouteInfo chooseFallbackRoute = globalRouter.chooseFallbackRoute();
            globalRouter.selectRoute(chooseFallbackRoute, 3);
            return chooseFallbackRoute;
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    public void addCallback(@NonNull MediaRouteSelector mediaRouteSelector, @NonNull Callback callback, int i) {
        CallbackRecord callbackRecord;
        boolean z;
        if (mediaRouteSelector == null) {
            throw new IllegalArgumentException("selector must not be null");
        } else if (callback != null) {
            checkCallingThread();
            if (DEBUG) {
                Log.d(TAG, "addCallback: selector=" + mediaRouteSelector + ", callback=" + callback + ", flags=" + Integer.toHexString(i));
            }
            int findCallbackRecord = findCallbackRecord(callback);
            if (findCallbackRecord < 0) {
                callbackRecord = new CallbackRecord(this, callback);
                this.mCallbackRecords.add(callbackRecord);
            } else {
                callbackRecord = this.mCallbackRecords.get(findCallbackRecord);
            }
            boolean z2 = true;
            if (i != callbackRecord.mFlags) {
                callbackRecord.mFlags = i;
                z = true;
            } else {
                z = false;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if ((i & 1) != 0) {
                z = true;
            }
            callbackRecord.mTimestamp = elapsedRealtime;
            if (!callbackRecord.mSelector.contains(mediaRouteSelector)) {
                callbackRecord.mSelector = new MediaRouteSelector.Builder(callbackRecord.mSelector).addSelector(mediaRouteSelector).build();
            } else {
                z2 = z;
            }
            if (z2) {
                getGlobalRouter().updateDiscoveryRequest();
            }
        } else {
            throw new IllegalArgumentException("callback must not be null");
        }
    }

    public static abstract class ControlRequestCallback {
        public void onResult(@Nullable Bundle bundle) {
        }

        public void onError(@Nullable String str, @Nullable Bundle bundle) {
        }
    }
}
