package androidx.mediarouter.media;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.media.AudioManager;
import android.view.Display;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.mediarouter.C2410R;
import androidx.mediarouter.media.MediaRouteDescriptor;
import androidx.mediarouter.media.MediaRouteProvider;
import androidx.mediarouter.media.MediaRouteProviderDescriptor;
import androidx.mediarouter.media.MediaRouter;
import androidx.mediarouter.media.MediaRouterApi24;
import androidx.mediarouter.media.MediaRouterJellybean;
import androidx.mediarouter.media.MediaRouterJellybeanMr1;
import androidx.mediarouter.media.MediaRouterJellybeanMr2;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

abstract class SystemMediaRouteProvider extends MediaRouteProvider {
    public static final String DEFAULT_ROUTE_ID = "DEFAULT_ROUTE";
    public static final String PACKAGE_NAME = "android";
    private static final String TAG = "SystemMediaRouteProvider";

    @RequiresApi(24)
    private static class Api24Impl extends JellybeanMr2Impl {
        public Api24Impl(Context context, SyncCallback syncCallback) {
            super(context, syncCallback);
        }

        /* access modifiers changed from: protected */
        public void onBuildSystemRouteDescriptor(JellybeanImpl.SystemRouteRecord systemRouteRecord, MediaRouteDescriptor.Builder builder) {
            super.onBuildSystemRouteDescriptor(systemRouteRecord, builder);
            builder.setDeviceType(MediaRouterApi24.RouteInfo.getDeviceType(systemRouteRecord.mRouteObj));
        }
    }

    @RequiresApi(17)
    private static class JellybeanMr1Impl extends JellybeanImpl implements MediaRouterJellybeanMr1.Callback {
        private MediaRouterJellybeanMr1.ActiveScanWorkaround mActiveScanWorkaround;
        private MediaRouterJellybeanMr1.IsConnectingWorkaround mIsConnectingWorkaround;

        public JellybeanMr1Impl(Context context, SyncCallback syncCallback) {
            super(context, syncCallback);
        }

        /* access modifiers changed from: protected */
        public Object createCallbackObj() {
            return MediaRouterJellybeanMr1.createCallback(this);
        }

        /* access modifiers changed from: protected */
        public boolean isConnecting(JellybeanImpl.SystemRouteRecord systemRouteRecord) {
            if (this.mIsConnectingWorkaround == null) {
                this.mIsConnectingWorkaround = new MediaRouterJellybeanMr1.IsConnectingWorkaround();
            }
            return this.mIsConnectingWorkaround.isConnecting(systemRouteRecord.mRouteObj);
        }

        /* access modifiers changed from: protected */
        public void onBuildSystemRouteDescriptor(JellybeanImpl.SystemRouteRecord systemRouteRecord, MediaRouteDescriptor.Builder builder) {
            super.onBuildSystemRouteDescriptor(systemRouteRecord, builder);
            if (!MediaRouterJellybeanMr1.RouteInfo.isEnabled(systemRouteRecord.mRouteObj)) {
                builder.setEnabled(false);
            }
            if (isConnecting(systemRouteRecord)) {
                builder.setConnectionState(1);
            }
            Display presentationDisplay = MediaRouterJellybeanMr1.RouteInfo.getPresentationDisplay(systemRouteRecord.mRouteObj);
            if (presentationDisplay != null) {
                builder.setPresentationDisplayId(presentationDisplay.getDisplayId());
            }
        }

        public void onRoutePresentationDisplayChanged(Object obj) {
            int i;
            int findSystemRouteRecord = findSystemRouteRecord(obj);
            if (findSystemRouteRecord >= 0) {
                JellybeanImpl.SystemRouteRecord systemRouteRecord = this.mSystemRouteRecords.get(findSystemRouteRecord);
                Display presentationDisplay = MediaRouterJellybeanMr1.RouteInfo.getPresentationDisplay(obj);
                if (presentationDisplay != null) {
                    i = presentationDisplay.getDisplayId();
                } else {
                    i = -1;
                }
                if (i != systemRouteRecord.mRouteDescriptor.getPresentationDisplayId()) {
                    systemRouteRecord.mRouteDescriptor = new MediaRouteDescriptor.Builder(systemRouteRecord.mRouteDescriptor).setPresentationDisplayId(i).build();
                    publishRoutes();
                }
            }
        }

        /* access modifiers changed from: protected */
        public void updateCallback() {
            int i;
            super.updateCallback();
            if (this.mActiveScanWorkaround == null) {
                this.mActiveScanWorkaround = new MediaRouterJellybeanMr1.ActiveScanWorkaround(getContext(), getHandler());
            }
            MediaRouterJellybeanMr1.ActiveScanWorkaround activeScanWorkaround = this.mActiveScanWorkaround;
            if (this.mActiveScan) {
                i = this.mRouteTypes;
            } else {
                i = 0;
            }
            activeScanWorkaround.setActiveScanRouteTypes(i);
        }
    }

    @RequiresApi(18)
    private static class JellybeanMr2Impl extends JellybeanMr1Impl {
        public JellybeanMr2Impl(Context context, SyncCallback syncCallback) {
            super(context, syncCallback);
        }

        /* access modifiers changed from: protected */
        public Object getDefaultRoute() {
            return MediaRouterJellybeanMr2.getDefaultRoute(this.mRouterObj);
        }

        /* access modifiers changed from: protected */
        public boolean isConnecting(JellybeanImpl.SystemRouteRecord systemRouteRecord) {
            return MediaRouterJellybeanMr2.RouteInfo.isConnecting(systemRouteRecord.mRouteObj);
        }

        /* access modifiers changed from: protected */
        public void onBuildSystemRouteDescriptor(JellybeanImpl.SystemRouteRecord systemRouteRecord, MediaRouteDescriptor.Builder builder) {
            super.onBuildSystemRouteDescriptor(systemRouteRecord, builder);
            CharSequence description = MediaRouterJellybeanMr2.RouteInfo.getDescription(systemRouteRecord.mRouteObj);
            if (description != null) {
                builder.setDescription(description.toString());
            }
        }

        /* access modifiers changed from: protected */
        public void selectRoute(Object obj) {
            MediaRouterJellybean.selectRoute(this.mRouterObj, 8388611, obj);
        }

        /* access modifiers changed from: protected */
        public void updateCallback() {
            if (this.mCallbackRegistered) {
                MediaRouterJellybean.removeCallback(this.mRouterObj, this.mCallbackObj);
            }
            this.mCallbackRegistered = true;
            MediaRouterJellybeanMr2.addCallback(this.mRouterObj, this.mRouteTypes, this.mCallbackObj, this.mActiveScan | true ? 1 : 0);
        }

        /* access modifiers changed from: protected */
        public void updateUserRouteProperties(JellybeanImpl.UserRouteRecord userRouteRecord) {
            super.updateUserRouteProperties(userRouteRecord);
            MediaRouterJellybeanMr2.UserRouteInfo.setDescription(userRouteRecord.mRouteObj, userRouteRecord.mRoute.getDescription());
        }
    }

    static class LegacyImpl extends SystemMediaRouteProvider {
        private static final ArrayList<IntentFilter> CONTROL_FILTERS;
        static final int PLAYBACK_STREAM = 3;
        final AudioManager mAudioManager;
        int mLastReportedVolume = -1;
        private final VolumeChangeReceiver mVolumeChangeReceiver;

        final class DefaultRouteController extends MediaRouteProvider.RouteController {
            DefaultRouteController() {
            }

            public void onSetVolume(int i) {
                LegacyImpl.this.mAudioManager.setStreamVolume(3, i, 0);
                LegacyImpl.this.publishRoutes();
            }

            public void onUpdateVolume(int i) {
                int streamVolume = LegacyImpl.this.mAudioManager.getStreamVolume(3);
                if (Math.min(LegacyImpl.this.mAudioManager.getStreamMaxVolume(3), Math.max(0, i + streamVolume)) != streamVolume) {
                    LegacyImpl.this.mAudioManager.setStreamVolume(3, streamVolume, 0);
                }
                LegacyImpl.this.publishRoutes();
            }
        }

        final class VolumeChangeReceiver extends BroadcastReceiver {
            public static final String EXTRA_VOLUME_STREAM_TYPE = "android.media.EXTRA_VOLUME_STREAM_TYPE";
            public static final String EXTRA_VOLUME_STREAM_VALUE = "android.media.EXTRA_VOLUME_STREAM_VALUE";
            public static final String VOLUME_CHANGED_ACTION = "android.media.VOLUME_CHANGED_ACTION";

            VolumeChangeReceiver() {
            }

            public void onReceive(Context context, Intent intent) {
                int intExtra;
                if (intent.getAction().equals(VOLUME_CHANGED_ACTION) && intent.getIntExtra(EXTRA_VOLUME_STREAM_TYPE, -1) == 3 && (intExtra = intent.getIntExtra(EXTRA_VOLUME_STREAM_VALUE, -1)) >= 0) {
                    LegacyImpl legacyImpl = LegacyImpl.this;
                    if (intExtra != legacyImpl.mLastReportedVolume) {
                        legacyImpl.publishRoutes();
                    }
                }
            }
        }

        static {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addCategory(MediaControlIntent.CATEGORY_LIVE_AUDIO);
            intentFilter.addCategory(MediaControlIntent.CATEGORY_LIVE_VIDEO);
            ArrayList<IntentFilter> arrayList = new ArrayList<>();
            CONTROL_FILTERS = arrayList;
            arrayList.add(intentFilter);
        }

        public LegacyImpl(Context context) {
            super(context);
            this.mAudioManager = (AudioManager) context.getSystemService("audio");
            VolumeChangeReceiver volumeChangeReceiver = new VolumeChangeReceiver();
            this.mVolumeChangeReceiver = volumeChangeReceiver;
            context.registerReceiver(volumeChangeReceiver, new IntentFilter(VolumeChangeReceiver.VOLUME_CHANGED_ACTION));
            publishRoutes();
        }

        public MediaRouteProvider.RouteController onCreateRouteController(String str) {
            if (str.equals(SystemMediaRouteProvider.DEFAULT_ROUTE_ID)) {
                return new DefaultRouteController();
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public void publishRoutes() {
            Resources resources = getContext().getResources();
            int streamMaxVolume = this.mAudioManager.getStreamMaxVolume(3);
            this.mLastReportedVolume = this.mAudioManager.getStreamVolume(3);
            setDescriptor(new MediaRouteProviderDescriptor.Builder().addRoute(new MediaRouteDescriptor.Builder(SystemMediaRouteProvider.DEFAULT_ROUTE_ID, resources.getString(C2410R.string.mr_system_route_name)).addControlFilters(CONTROL_FILTERS).setPlaybackStream(3).setPlaybackType(0).setVolumeHandling(1).setVolumeMax(streamMaxVolume).setVolume(this.mLastReportedVolume).build()).build());
        }
    }

    public interface SyncCallback {
        void onSystemRouteSelectedByDescriptorId(@NonNull String str);
    }

    protected SystemMediaRouteProvider(Context context) {
        super(context, new MediaRouteProvider.ProviderMetadata(new ComponentName(PACKAGE_NAME, SystemMediaRouteProvider.class.getName())));
    }

    public static SystemMediaRouteProvider obtain(Context context, SyncCallback syncCallback) {
        return new Api24Impl(context, syncCallback);
    }

    /* access modifiers changed from: protected */
    public Object getDefaultRoute() {
        return null;
    }

    /* access modifiers changed from: protected */
    public Object getSystemRoute(MediaRouter.RouteInfo routeInfo) {
        return null;
    }

    public void onSyncRouteAdded(MediaRouter.RouteInfo routeInfo) {
    }

    public void onSyncRouteChanged(MediaRouter.RouteInfo routeInfo) {
    }

    public void onSyncRouteRemoved(MediaRouter.RouteInfo routeInfo) {
    }

    public void onSyncRouteSelected(MediaRouter.RouteInfo routeInfo) {
    }

    @RequiresApi(16)
    static class JellybeanImpl extends SystemMediaRouteProvider implements MediaRouterJellybean.Callback, MediaRouterJellybean.VolumeCallback {
        private static final ArrayList<IntentFilter> LIVE_AUDIO_CONTROL_FILTERS;
        private static final ArrayList<IntentFilter> LIVE_VIDEO_CONTROL_FILTERS;
        protected boolean mActiveScan;
        protected final Object mCallbackObj;
        protected boolean mCallbackRegistered;
        private MediaRouterJellybean.GetDefaultRouteWorkaround mGetDefaultRouteWorkaround;
        protected int mRouteTypes;
        protected final Object mRouterObj;
        private MediaRouterJellybean.SelectRouteWorkaround mSelectRouteWorkaround;
        private final SyncCallback mSyncCallback;
        protected final ArrayList<SystemRouteRecord> mSystemRouteRecords = new ArrayList<>();
        protected final Object mUserRouteCategoryObj;
        protected final ArrayList<UserRouteRecord> mUserRouteRecords = new ArrayList<>();
        protected final Object mVolumeCallbackObj;

        protected static final class SystemRouteController extends MediaRouteProvider.RouteController {
            private final Object mRouteObj;

            public SystemRouteController(Object obj) {
                this.mRouteObj = obj;
            }

            public void onSetVolume(int i) {
                MediaRouterJellybean.RouteInfo.requestSetVolume(this.mRouteObj, i);
            }

            public void onUpdateVolume(int i) {
                MediaRouterJellybean.RouteInfo.requestUpdateVolume(this.mRouteObj, i);
            }
        }

        protected static final class SystemRouteRecord {
            public MediaRouteDescriptor mRouteDescriptor;
            public final String mRouteDescriptorId;
            public final Object mRouteObj;

            public SystemRouteRecord(Object obj, String str) {
                this.mRouteObj = obj;
                this.mRouteDescriptorId = str;
            }
        }

        protected static final class UserRouteRecord {
            public final MediaRouter.RouteInfo mRoute;
            public final Object mRouteObj;

            public UserRouteRecord(MediaRouter.RouteInfo routeInfo, Object obj) {
                this.mRoute = routeInfo;
                this.mRouteObj = obj;
            }
        }

        static {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addCategory(MediaControlIntent.CATEGORY_LIVE_AUDIO);
            ArrayList<IntentFilter> arrayList = new ArrayList<>();
            LIVE_AUDIO_CONTROL_FILTERS = arrayList;
            arrayList.add(intentFilter);
            IntentFilter intentFilter2 = new IntentFilter();
            intentFilter2.addCategory(MediaControlIntent.CATEGORY_LIVE_VIDEO);
            ArrayList<IntentFilter> arrayList2 = new ArrayList<>();
            LIVE_VIDEO_CONTROL_FILTERS = arrayList2;
            arrayList2.add(intentFilter2);
        }

        public JellybeanImpl(Context context, SyncCallback syncCallback) {
            super(context);
            this.mSyncCallback = syncCallback;
            Object mediaRouter = MediaRouterJellybean.getMediaRouter(context);
            this.mRouterObj = mediaRouter;
            this.mCallbackObj = createCallbackObj();
            this.mVolumeCallbackObj = createVolumeCallbackObj();
            this.mUserRouteCategoryObj = MediaRouterJellybean.createRouteCategory(mediaRouter, context.getResources().getString(C2410R.string.mr_user_route_category_name), false);
            updateSystemRoutes();
        }

        private boolean addSystemRouteNoPublish(Object obj) {
            if (getUserRouteRecord(obj) != null || findSystemRouteRecord(obj) >= 0) {
                return false;
            }
            SystemRouteRecord systemRouteRecord = new SystemRouteRecord(obj, assignRouteId(obj));
            updateSystemRouteDescriptor(systemRouteRecord);
            this.mSystemRouteRecords.add(systemRouteRecord);
            return true;
        }

        private String assignRouteId(Object obj) {
            boolean z;
            String str;
            if (getDefaultRoute() == obj) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                str = SystemMediaRouteProvider.DEFAULT_ROUTE_ID;
            } else {
                str = String.format(Locale.US, "ROUTE_%08x", new Object[]{Integer.valueOf(getRouteName(obj).hashCode())});
            }
            if (findSystemRouteRecordByDescriptorId(str) < 0) {
                return str;
            }
            int i = 2;
            while (true) {
                String format = String.format(Locale.US, "%s_%d", new Object[]{str, Integer.valueOf(i)});
                if (findSystemRouteRecordByDescriptorId(format) < 0) {
                    return format;
                }
                i++;
            }
        }

        private void updateSystemRoutes() {
            updateCallback();
            boolean z = false;
            for (Object addSystemRouteNoPublish : MediaRouterJellybean.getRoutes(this.mRouterObj)) {
                z |= addSystemRouteNoPublish(addSystemRouteNoPublish);
            }
            if (z) {
                publishRoutes();
            }
        }

        /* access modifiers changed from: protected */
        public Object createCallbackObj() {
            return MediaRouterJellybean.createCallback(this);
        }

        /* access modifiers changed from: protected */
        public Object createVolumeCallbackObj() {
            return MediaRouterJellybean.createVolumeCallback(this);
        }

        /* access modifiers changed from: protected */
        public int findSystemRouteRecord(Object obj) {
            int size = this.mSystemRouteRecords.size();
            for (int i = 0; i < size; i++) {
                if (this.mSystemRouteRecords.get(i).mRouteObj == obj) {
                    return i;
                }
            }
            return -1;
        }

        /* access modifiers changed from: protected */
        public int findSystemRouteRecordByDescriptorId(String str) {
            int size = this.mSystemRouteRecords.size();
            for (int i = 0; i < size; i++) {
                if (this.mSystemRouteRecords.get(i).mRouteDescriptorId.equals(str)) {
                    return i;
                }
            }
            return -1;
        }

        /* access modifiers changed from: protected */
        public int findUserRouteRecord(MediaRouter.RouteInfo routeInfo) {
            int size = this.mUserRouteRecords.size();
            for (int i = 0; i < size; i++) {
                if (this.mUserRouteRecords.get(i).mRoute == routeInfo) {
                    return i;
                }
            }
            return -1;
        }

        /* access modifiers changed from: protected */
        public Object getDefaultRoute() {
            if (this.mGetDefaultRouteWorkaround == null) {
                this.mGetDefaultRouteWorkaround = new MediaRouterJellybean.GetDefaultRouteWorkaround();
            }
            return this.mGetDefaultRouteWorkaround.getDefaultRoute(this.mRouterObj);
        }

        /* access modifiers changed from: protected */
        public String getRouteName(Object obj) {
            CharSequence name = MediaRouterJellybean.RouteInfo.getName(obj, getContext());
            if (name != null) {
                return name.toString();
            }
            return "";
        }

        /* access modifiers changed from: protected */
        public Object getSystemRoute(MediaRouter.RouteInfo routeInfo) {
            int findSystemRouteRecordByDescriptorId;
            if (routeInfo != null && (findSystemRouteRecordByDescriptorId = findSystemRouteRecordByDescriptorId(routeInfo.getDescriptorId())) >= 0) {
                return this.mSystemRouteRecords.get(findSystemRouteRecordByDescriptorId).mRouteObj;
            }
            return null;
        }

        /* access modifiers changed from: protected */
        public UserRouteRecord getUserRouteRecord(Object obj) {
            Object tag = MediaRouterJellybean.RouteInfo.getTag(obj);
            if (tag instanceof UserRouteRecord) {
                return (UserRouteRecord) tag;
            }
            return null;
        }

        /* access modifiers changed from: protected */
        public void onBuildSystemRouteDescriptor(SystemRouteRecord systemRouteRecord, MediaRouteDescriptor.Builder builder) {
            int supportedTypes = MediaRouterJellybean.RouteInfo.getSupportedTypes(systemRouteRecord.mRouteObj);
            if ((supportedTypes & 1) != 0) {
                builder.addControlFilters(LIVE_AUDIO_CONTROL_FILTERS);
            }
            if ((supportedTypes & 2) != 0) {
                builder.addControlFilters(LIVE_VIDEO_CONTROL_FILTERS);
            }
            builder.setPlaybackType(MediaRouterJellybean.RouteInfo.getPlaybackType(systemRouteRecord.mRouteObj));
            builder.setPlaybackStream(MediaRouterJellybean.RouteInfo.getPlaybackStream(systemRouteRecord.mRouteObj));
            builder.setVolume(MediaRouterJellybean.RouteInfo.getVolume(systemRouteRecord.mRouteObj));
            builder.setVolumeMax(MediaRouterJellybean.RouteInfo.getVolumeMax(systemRouteRecord.mRouteObj));
            builder.setVolumeHandling(MediaRouterJellybean.RouteInfo.getVolumeHandling(systemRouteRecord.mRouteObj));
        }

        public MediaRouteProvider.RouteController onCreateRouteController(String str) {
            int findSystemRouteRecordByDescriptorId = findSystemRouteRecordByDescriptorId(str);
            if (findSystemRouteRecordByDescriptorId >= 0) {
                return new SystemRouteController(this.mSystemRouteRecords.get(findSystemRouteRecordByDescriptorId).mRouteObj);
            }
            return null;
        }

        public void onDiscoveryRequestChanged(MediaRouteDiscoveryRequest mediaRouteDiscoveryRequest) {
            boolean z;
            int i = 0;
            if (mediaRouteDiscoveryRequest != null) {
                List<String> controlCategories = mediaRouteDiscoveryRequest.getSelector().getControlCategories();
                int size = controlCategories.size();
                int i2 = 0;
                while (i < size) {
                    String str = controlCategories.get(i);
                    if (str.equals(MediaControlIntent.CATEGORY_LIVE_AUDIO)) {
                        i2 |= 1;
                    } else if (str.equals(MediaControlIntent.CATEGORY_LIVE_VIDEO)) {
                        i2 |= 2;
                    } else {
                        i2 |= 8388608;
                    }
                    i++;
                }
                z = mediaRouteDiscoveryRequest.isActiveScan();
                i = i2;
            } else {
                z = false;
            }
            if (this.mRouteTypes != i || this.mActiveScan != z) {
                this.mRouteTypes = i;
                this.mActiveScan = z;
                updateSystemRoutes();
            }
        }

        public void onRouteAdded(Object obj) {
            if (addSystemRouteNoPublish(obj)) {
                publishRoutes();
            }
        }

        public void onRouteChanged(Object obj) {
            int findSystemRouteRecord;
            if (getUserRouteRecord(obj) == null && (findSystemRouteRecord = findSystemRouteRecord(obj)) >= 0) {
                updateSystemRouteDescriptor(this.mSystemRouteRecords.get(findSystemRouteRecord));
                publishRoutes();
            }
        }

        public void onRouteRemoved(Object obj) {
            int findSystemRouteRecord;
            if (getUserRouteRecord(obj) == null && (findSystemRouteRecord = findSystemRouteRecord(obj)) >= 0) {
                this.mSystemRouteRecords.remove(findSystemRouteRecord);
                publishRoutes();
            }
        }

        public void onRouteSelected(int i, Object obj) {
            if (obj == MediaRouterJellybean.getSelectedRoute(this.mRouterObj, 8388611)) {
                UserRouteRecord userRouteRecord = getUserRouteRecord(obj);
                if (userRouteRecord != null) {
                    userRouteRecord.mRoute.select();
                    return;
                }
                int findSystemRouteRecord = findSystemRouteRecord(obj);
                if (findSystemRouteRecord >= 0) {
                    this.mSyncCallback.onSystemRouteSelectedByDescriptorId(this.mSystemRouteRecords.get(findSystemRouteRecord).mRouteDescriptorId);
                }
            }
        }

        public void onRouteVolumeChanged(Object obj) {
            int findSystemRouteRecord;
            if (getUserRouteRecord(obj) == null && (findSystemRouteRecord = findSystemRouteRecord(obj)) >= 0) {
                SystemRouteRecord systemRouteRecord = this.mSystemRouteRecords.get(findSystemRouteRecord);
                int volume = MediaRouterJellybean.RouteInfo.getVolume(obj);
                if (volume != systemRouteRecord.mRouteDescriptor.getVolume()) {
                    systemRouteRecord.mRouteDescriptor = new MediaRouteDescriptor.Builder(systemRouteRecord.mRouteDescriptor).setVolume(volume).build();
                    publishRoutes();
                }
            }
        }

        public void onSyncRouteAdded(MediaRouter.RouteInfo routeInfo) {
            if (routeInfo.getProviderInstance() != this) {
                Object createUserRoute = MediaRouterJellybean.createUserRoute(this.mRouterObj, this.mUserRouteCategoryObj);
                UserRouteRecord userRouteRecord = new UserRouteRecord(routeInfo, createUserRoute);
                MediaRouterJellybean.RouteInfo.setTag(createUserRoute, userRouteRecord);
                MediaRouterJellybean.UserRouteInfo.setVolumeCallback(createUserRoute, this.mVolumeCallbackObj);
                updateUserRouteProperties(userRouteRecord);
                this.mUserRouteRecords.add(userRouteRecord);
                MediaRouterJellybean.addUserRoute(this.mRouterObj, createUserRoute);
                return;
            }
            int findSystemRouteRecord = findSystemRouteRecord(MediaRouterJellybean.getSelectedRoute(this.mRouterObj, 8388611));
            if (findSystemRouteRecord >= 0 && this.mSystemRouteRecords.get(findSystemRouteRecord).mRouteDescriptorId.equals(routeInfo.getDescriptorId())) {
                routeInfo.select();
            }
        }

        public void onSyncRouteChanged(MediaRouter.RouteInfo routeInfo) {
            int findUserRouteRecord;
            if (routeInfo.getProviderInstance() != this && (findUserRouteRecord = findUserRouteRecord(routeInfo)) >= 0) {
                updateUserRouteProperties(this.mUserRouteRecords.get(findUserRouteRecord));
            }
        }

        public void onSyncRouteRemoved(MediaRouter.RouteInfo routeInfo) {
            int findUserRouteRecord;
            if (routeInfo.getProviderInstance() != this && (findUserRouteRecord = findUserRouteRecord(routeInfo)) >= 0) {
                UserRouteRecord remove = this.mUserRouteRecords.remove(findUserRouteRecord);
                MediaRouterJellybean.RouteInfo.setTag(remove.mRouteObj, (Object) null);
                MediaRouterJellybean.UserRouteInfo.setVolumeCallback(remove.mRouteObj, (Object) null);
                MediaRouterJellybean.removeUserRoute(this.mRouterObj, remove.mRouteObj);
            }
        }

        public void onSyncRouteSelected(MediaRouter.RouteInfo routeInfo) {
            if (routeInfo.isSelected()) {
                if (routeInfo.getProviderInstance() != this) {
                    int findUserRouteRecord = findUserRouteRecord(routeInfo);
                    if (findUserRouteRecord >= 0) {
                        selectRoute(this.mUserRouteRecords.get(findUserRouteRecord).mRouteObj);
                        return;
                    }
                    return;
                }
                int findSystemRouteRecordByDescriptorId = findSystemRouteRecordByDescriptorId(routeInfo.getDescriptorId());
                if (findSystemRouteRecordByDescriptorId >= 0) {
                    selectRoute(this.mSystemRouteRecords.get(findSystemRouteRecordByDescriptorId).mRouteObj);
                }
            }
        }

        public void onVolumeSetRequest(Object obj, int i) {
            UserRouteRecord userRouteRecord = getUserRouteRecord(obj);
            if (userRouteRecord != null) {
                userRouteRecord.mRoute.requestSetVolume(i);
            }
        }

        public void onVolumeUpdateRequest(Object obj, int i) {
            UserRouteRecord userRouteRecord = getUserRouteRecord(obj);
            if (userRouteRecord != null) {
                userRouteRecord.mRoute.requestUpdateVolume(i);
            }
        }

        /* access modifiers changed from: protected */
        public void publishRoutes() {
            MediaRouteProviderDescriptor.Builder builder = new MediaRouteProviderDescriptor.Builder();
            int size = this.mSystemRouteRecords.size();
            for (int i = 0; i < size; i++) {
                builder.addRoute(this.mSystemRouteRecords.get(i).mRouteDescriptor);
            }
            setDescriptor(builder.build());
        }

        /* access modifiers changed from: protected */
        public void selectRoute(Object obj) {
            if (this.mSelectRouteWorkaround == null) {
                this.mSelectRouteWorkaround = new MediaRouterJellybean.SelectRouteWorkaround();
            }
            this.mSelectRouteWorkaround.selectRoute(this.mRouterObj, 8388611, obj);
        }

        /* access modifiers changed from: protected */
        public void updateCallback() {
            if (this.mCallbackRegistered) {
                this.mCallbackRegistered = false;
                MediaRouterJellybean.removeCallback(this.mRouterObj, this.mCallbackObj);
            }
            int i = this.mRouteTypes;
            if (i != 0) {
                this.mCallbackRegistered = true;
                MediaRouterJellybean.addCallback(this.mRouterObj, i, this.mCallbackObj);
            }
        }

        /* access modifiers changed from: protected */
        public void updateSystemRouteDescriptor(SystemRouteRecord systemRouteRecord) {
            MediaRouteDescriptor.Builder builder = new MediaRouteDescriptor.Builder(systemRouteRecord.mRouteDescriptorId, getRouteName(systemRouteRecord.mRouteObj));
            onBuildSystemRouteDescriptor(systemRouteRecord, builder);
            systemRouteRecord.mRouteDescriptor = builder.build();
        }

        /* access modifiers changed from: protected */
        public void updateUserRouteProperties(UserRouteRecord userRouteRecord) {
            MediaRouterJellybean.UserRouteInfo.setName(userRouteRecord.mRouteObj, userRouteRecord.mRoute.getName());
            MediaRouterJellybean.UserRouteInfo.setPlaybackType(userRouteRecord.mRouteObj, userRouteRecord.mRoute.getPlaybackType());
            MediaRouterJellybean.UserRouteInfo.setPlaybackStream(userRouteRecord.mRouteObj, userRouteRecord.mRoute.getPlaybackStream());
            MediaRouterJellybean.UserRouteInfo.setVolume(userRouteRecord.mRouteObj, userRouteRecord.mRoute.getVolume());
            MediaRouterJellybean.UserRouteInfo.setVolumeMax(userRouteRecord.mRouteObj, userRouteRecord.mRoute.getVolumeMax());
            MediaRouterJellybean.UserRouteInfo.setVolumeHandling(userRouteRecord.mRouteObj, userRouteRecord.mRoute.getVolumeHandling());
        }

        public void onRouteUngrouped(Object obj, Object obj2) {
        }

        public void onRouteUnselected(int i, Object obj) {
        }

        public void onRouteGrouped(Object obj, Object obj2, int i) {
        }
    }
}
