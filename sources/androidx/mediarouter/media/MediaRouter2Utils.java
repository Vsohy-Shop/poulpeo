package androidx.mediarouter.media;

import android.content.IntentFilter;
import android.media.MediaRoute2Info;
import android.media.RouteDiscoveryPreference;
import android.net.Uri;
import android.os.Bundle;
import android.util.ArraySet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.mediarouter.media.MediaRouteDescriptor;
import androidx.mediarouter.media.MediaRouteSelector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

@RequiresApi(api = 30)
class MediaRouter2Utils {
    static final String FEATURE_EMPTY = "android.media.route.feature.EMPTY";
    static final String FEATURE_REMOTE_GROUP_PLAYBACK = "android.media.route.feature.REMOTE_GROUP_PLAYBACK";
    static final String KEY_CONTROL_FILTERS = "androidx.mediarouter.media.KEY_CONTROL_FILTERS";
    static final String KEY_DEVICE_TYPE = "androidx.mediarouter.media.KEY_DEVICE_TYPE";
    static final String KEY_EXTRAS = "androidx.mediarouter.media.KEY_EXTRAS";
    static final String KEY_GROUP_ROUTE = "androidx.mediarouter.media.KEY_GROUP_ROUTE";
    static final String KEY_MESSENGER = "androidx.mediarouter.media.KEY_MESSENGER";
    static final String KEY_ORIGINAL_ROUTE_ID = "androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID";
    static final String KEY_PLAYBACK_TYPE = "androidx.mediarouter.media.KEY_PLAYBACK_TYPE";
    static final String KEY_SESSION_NAME = "androidx.mediarouter.media.KEY_SESSION_NAME";

    private MediaRouter2Utils() {
    }

    @NonNull
    static List<String> getRouteIds(@Nullable List<MediaRoute2Info> list) {
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (MediaRoute2Info next : list) {
            if (next != null) {
                arrayList.add(next.getId());
            }
        }
        return arrayList;
    }

    static String toControlCategory(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case 94496206:
                if (str.equals("android.media.route.feature.REMOTE_PLAYBACK")) {
                    c = 0;
                    break;
                }
                break;
            case 1328964233:
                if (str.equals("android.media.route.feature.LIVE_AUDIO")) {
                    c = 1;
                    break;
                }
                break;
            case 1348000558:
                if (str.equals("android.media.route.feature.LIVE_VIDEO")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return MediaControlIntent.CATEGORY_REMOTE_PLAYBACK;
            case 1:
                return MediaControlIntent.CATEGORY_LIVE_AUDIO;
            case 2:
                return MediaControlIntent.CATEGORY_LIVE_VIDEO;
            default:
                return str;
        }
    }

    @NonNull
    static List<IntentFilter> toControlFilters(@Nullable Collection<String> collection) {
        if (collection == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        ArraySet arraySet = new ArraySet();
        for (String next : collection) {
            if (!arraySet.contains(next)) {
                arraySet.add(next);
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addCategory(toControlCategory(next));
                arrayList.add(intentFilter);
            }
        }
        return arrayList;
    }

    @NonNull
    static RouteDiscoveryPreference toDiscoveryPreference(@Nullable MediaRouteDiscoveryRequest mediaRouteDiscoveryRequest) {
        if (mediaRouteDiscoveryRequest == null || !mediaRouteDiscoveryRequest.isValid()) {
            return new RouteDiscoveryPreference.Builder(new ArrayList(), false).build();
        }
        boolean isActiveScan = mediaRouteDiscoveryRequest.isActiveScan();
        ArrayList arrayList = new ArrayList();
        for (String routeFeature : mediaRouteDiscoveryRequest.getSelector().getControlCategories()) {
            arrayList.add(toRouteFeature(routeFeature));
        }
        return new RouteDiscoveryPreference.Builder(arrayList, isActiveScan).build();
    }

    static Collection<String> toFeatures(List<IntentFilter> list) {
        HashSet hashSet = new HashSet();
        for (IntentFilter next : list) {
            int countCategories = next.countCategories();
            for (int i = 0; i < countCategories; i++) {
                hashSet.add(toRouteFeature(next.getCategory(i)));
            }
        }
        return hashSet;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0055, code lost:
        if (r1 != 2) goto L_0x0062;
     */
    @androidx.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.media.MediaRoute2Info toFwkMediaRoute2Info(@androidx.annotation.Nullable androidx.mediarouter.media.MediaRouteDescriptor r4) {
        /*
            if (r4 != 0) goto L_0x0004
            r4 = 0
            return r4
        L_0x0004:
            android.media.MediaRoute2Info$Builder r0 = new android.media.MediaRoute2Info$Builder
            java.lang.String r1 = r4.getId()
            java.lang.String r2 = r4.getName()
            r0.<init>(r1, r2)
            java.lang.String r1 = r4.getDescription()
            android.media.MediaRoute2Info$Builder r0 = r0.setDescription(r1)
            int r1 = r4.getConnectionState()
            android.media.MediaRoute2Info$Builder r0 = r0.setConnectionState(r1)
            int r1 = r4.getVolumeHandling()
            android.media.MediaRoute2Info$Builder r0 = r0.setVolumeHandling(r1)
            int r1 = r4.getVolume()
            android.media.MediaRoute2Info$Builder r0 = r0.setVolume(r1)
            int r1 = r4.getVolumeMax()
            android.media.MediaRoute2Info$Builder r0 = r0.setVolumeMax(r1)
            java.util.List r1 = r4.getControlFilters()
            java.util.Collection r1 = toFeatures(r1)
            android.media.MediaRoute2Info$Builder r0 = r0.addFeatures(r1)
            android.net.Uri r1 = r4.getIconUri()
            android.media.MediaRoute2Info$Builder r0 = r0.setIconUri(r1)
            int r1 = r4.getDeviceType()
            r2 = 1
            if (r1 == r2) goto L_0x0058
            r2 = 2
            if (r1 == r2) goto L_0x005d
            goto L_0x0062
        L_0x0058:
            java.lang.String r1 = "android.media.route.feature.REMOTE_VIDEO_PLAYBACK"
            android.media.MediaRoute2Info.Builder unused = r0.addFeature(r1)
        L_0x005d:
            java.lang.String r1 = "android.media.route.feature.REMOTE_AUDIO_PLAYBACK"
            android.media.MediaRoute2Info.Builder unused = r0.addFeature(r1)
        L_0x0062:
            java.util.List r1 = r4.getGroupMemberIds()
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0071
            java.lang.String r1 = "android.media.route.feature.REMOTE_GROUP_PLAYBACK"
            android.media.MediaRoute2Info.Builder unused = r0.addFeature(r1)
        L_0x0071:
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r2 = "androidx.mediarouter.media.KEY_EXTRAS"
            android.os.Bundle r3 = r4.getExtras()
            r1.putBundle(r2, r3)
            java.util.ArrayList r2 = new java.util.ArrayList
            java.util.List r3 = r4.getControlFilters()
            r2.<init>(r3)
            java.lang.String r3 = "androidx.mediarouter.media.KEY_CONTROL_FILTERS"
            r1.putParcelableArrayList(r3, r2)
            java.lang.String r2 = "androidx.mediarouter.media.KEY_DEVICE_TYPE"
            int r3 = r4.getDeviceType()
            r1.putInt(r2, r3)
            java.lang.String r2 = "androidx.mediarouter.media.KEY_PLAYBACK_TYPE"
            int r3 = r4.getPlaybackType()
            r1.putInt(r2, r3)
            java.lang.String r2 = "androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID"
            java.lang.String r3 = r4.getId()
            r1.putString(r2, r3)
            android.media.MediaRoute2Info.Builder unused = r0.setExtras(r1)
            java.util.List r4 = r4.getControlFilters()
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x00ba
            java.lang.String r4 = "android.media.route.feature.EMPTY"
            android.media.MediaRoute2Info.Builder unused = r0.addFeature(r4)
        L_0x00ba:
            android.media.MediaRoute2Info r4 = r0.build()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.media.MediaRouter2Utils.toFwkMediaRoute2Info(androidx.mediarouter.media.MediaRouteDescriptor):android.media.MediaRoute2Info");
    }

    @Nullable
    public static MediaRouteDescriptor toMediaRouteDescriptor(@Nullable MediaRoute2Info mediaRoute2Info) {
        if (mediaRoute2Info == null) {
            return null;
        }
        MediaRouteDescriptor.Builder canDisconnect = new MediaRouteDescriptor.Builder(mediaRoute2Info.getId(), mediaRoute2Info.getName().toString()).setConnectionState(mediaRoute2Info.getConnectionState()).setVolumeHandling(mediaRoute2Info.getVolumeHandling()).setVolumeMax(mediaRoute2Info.getVolumeMax()).setVolume(mediaRoute2Info.getVolume()).setExtras(mediaRoute2Info.getExtras()).setEnabled(true).setCanDisconnect(false);
        CharSequence a = mediaRoute2Info.getDescription();
        if (a != null) {
            canDisconnect.setDescription(a.toString());
        }
        Uri a2 = mediaRoute2Info.getIconUri();
        if (a2 != null) {
            canDisconnect.setIconUri(a2);
        }
        Bundle a3 = mediaRoute2Info.getExtras();
        if (a3 == null || !a3.containsKey(KEY_EXTRAS) || !a3.containsKey(KEY_DEVICE_TYPE) || !a3.containsKey(KEY_CONTROL_FILTERS)) {
            return null;
        }
        canDisconnect.setExtras(a3.getBundle(KEY_EXTRAS));
        canDisconnect.setDeviceType(a3.getInt(KEY_DEVICE_TYPE, 0));
        canDisconnect.setPlaybackType(a3.getInt(KEY_PLAYBACK_TYPE, 1));
        ArrayList parcelableArrayList = a3.getParcelableArrayList(KEY_CONTROL_FILTERS);
        if (parcelableArrayList != null) {
            canDisconnect.addControlFilters(parcelableArrayList);
        }
        return canDisconnect.build();
    }

    @NonNull
    static MediaRouteDiscoveryRequest toMediaRouteDiscoveryRequest(@NonNull RouteDiscoveryPreference routeDiscoveryPreference) {
        ArrayList arrayList = new ArrayList();
        for (String controlCategory : routeDiscoveryPreference.getPreferredFeatures()) {
            arrayList.add(toControlCategory(controlCategory));
        }
        return new MediaRouteDiscoveryRequest(new MediaRouteSelector.Builder().addControlCategories(arrayList).build(), routeDiscoveryPreference.shouldPerformActiveScan());
    }

    static String toRouteFeature(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -2065577523:
                if (str.equals(MediaControlIntent.CATEGORY_REMOTE_PLAYBACK)) {
                    c = 0;
                    break;
                }
                break;
            case 956939050:
                if (str.equals(MediaControlIntent.CATEGORY_LIVE_AUDIO)) {
                    c = 1;
                    break;
                }
                break;
            case 975975375:
                if (str.equals(MediaControlIntent.CATEGORY_LIVE_VIDEO)) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return "android.media.route.feature.REMOTE_PLAYBACK";
            case 1:
                return "android.media.route.feature.LIVE_AUDIO";
            case 2:
                return "android.media.route.feature.LIVE_VIDEO";
            default:
                return str;
        }
    }
}
