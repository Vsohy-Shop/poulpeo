package androidx.mediarouter.media;

import android.content.IntentFilter;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public final class MediaRouteDescriptor {
    static final String IS_DYNAMIC_GROUP_ROUTE = "isDynamicGroupRoute";
    static final String KEY_CAN_DISCONNECT = "canDisconnect";
    static final String KEY_CONNECTING = "connecting";
    static final String KEY_CONNECTION_STATE = "connectionState";
    static final String KEY_CONTROL_FILTERS = "controlFilters";
    static final String KEY_DESCRIPTION = "status";
    static final String KEY_DEVICE_TYPE = "deviceType";
    static final String KEY_ENABLED = "enabled";
    static final String KEY_EXTRAS = "extras";
    static final String KEY_GROUP_MEMBER_IDS = "groupMemberIds";
    static final String KEY_ICON_URI = "iconUri";
    static final String KEY_ID = "id";
    static final String KEY_MAX_CLIENT_VERSION = "maxClientVersion";
    static final String KEY_MIN_CLIENT_VERSION = "minClientVersion";
    static final String KEY_NAME = "name";
    static final String KEY_PLAYBACK_STREAM = "playbackStream";
    static final String KEY_PLAYBACK_TYPE = "playbackType";
    static final String KEY_PRESENTATION_DISPLAY_ID = "presentationDisplayId";
    static final String KEY_SETTINGS_INTENT = "settingsIntent";
    static final String KEY_VOLUME = "volume";
    static final String KEY_VOLUME_HANDLING = "volumeHandling";
    static final String KEY_VOLUME_MAX = "volumeMax";
    final Bundle mBundle;
    List<IntentFilter> mControlFilters;
    List<String> mGroupMemberIds;

    MediaRouteDescriptor(Bundle bundle) {
        this.mBundle = bundle;
    }

    @Nullable
    public static MediaRouteDescriptor fromBundle(@Nullable Bundle bundle) {
        if (bundle != null) {
            return new MediaRouteDescriptor(bundle);
        }
        return null;
    }

    @NonNull
    public Bundle asBundle() {
        return this.mBundle;
    }

    public boolean canDisconnectAndKeepPlaying() {
        return this.mBundle.getBoolean(KEY_CAN_DISCONNECT, false);
    }

    /* access modifiers changed from: package-private */
    public void ensureControlFilters() {
        if (this.mControlFilters == null) {
            ArrayList parcelableArrayList = this.mBundle.getParcelableArrayList(KEY_CONTROL_FILTERS);
            this.mControlFilters = parcelableArrayList;
            if (parcelableArrayList == null) {
                this.mControlFilters = Collections.emptyList();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void ensureGroupMemberIds() {
        if (this.mGroupMemberIds == null) {
            ArrayList<String> stringArrayList = this.mBundle.getStringArrayList(KEY_GROUP_MEMBER_IDS);
            this.mGroupMemberIds = stringArrayList;
            if (stringArrayList == null) {
                this.mGroupMemberIds = Collections.emptyList();
            }
        }
    }

    public int getConnectionState() {
        return this.mBundle.getInt(KEY_CONNECTION_STATE, 0);
    }

    @NonNull
    public List<IntentFilter> getControlFilters() {
        ensureControlFilters();
        return this.mControlFilters;
    }

    @Nullable
    public String getDescription() {
        return this.mBundle.getString("status");
    }

    public int getDeviceType() {
        return this.mBundle.getInt(KEY_DEVICE_TYPE);
    }

    @Nullable
    public Bundle getExtras() {
        return this.mBundle.getBundle("extras");
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public List<String> getGroupMemberIds() {
        ensureGroupMemberIds();
        return this.mGroupMemberIds;
    }

    @Nullable
    public Uri getIconUri() {
        String string = this.mBundle.getString(KEY_ICON_URI);
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    @NonNull
    public String getId() {
        return this.mBundle.getString("id");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int getMaxClientVersion() {
        return this.mBundle.getInt(KEY_MAX_CLIENT_VERSION, Integer.MAX_VALUE);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int getMinClientVersion() {
        return this.mBundle.getInt(KEY_MIN_CLIENT_VERSION, 1);
    }

    @NonNull
    public String getName() {
        return this.mBundle.getString("name");
    }

    public int getPlaybackStream() {
        return this.mBundle.getInt(KEY_PLAYBACK_STREAM, -1);
    }

    public int getPlaybackType() {
        return this.mBundle.getInt(KEY_PLAYBACK_TYPE, 1);
    }

    public int getPresentationDisplayId() {
        return this.mBundle.getInt(KEY_PRESENTATION_DISPLAY_ID, -1);
    }

    @Nullable
    public IntentSender getSettingsActivity() {
        return (IntentSender) this.mBundle.getParcelable(KEY_SETTINGS_INTENT);
    }

    public int getVolume() {
        return this.mBundle.getInt("volume");
    }

    public int getVolumeHandling() {
        return this.mBundle.getInt(KEY_VOLUME_HANDLING, 0);
    }

    public int getVolumeMax() {
        return this.mBundle.getInt(KEY_VOLUME_MAX);
    }

    @Deprecated
    public boolean isConnecting() {
        return this.mBundle.getBoolean(KEY_CONNECTING, false);
    }

    public boolean isDynamicGroupRoute() {
        return this.mBundle.getBoolean(IS_DYNAMIC_GROUP_ROUTE, false);
    }

    public boolean isEnabled() {
        return this.mBundle.getBoolean(KEY_ENABLED, true);
    }

    public boolean isValid() {
        ensureControlFilters();
        if (TextUtils.isEmpty(getId()) || TextUtils.isEmpty(getName()) || this.mControlFilters.contains((Object) null)) {
            return false;
        }
        return true;
    }

    public String toString() {
        return "MediaRouteDescriptor{ " + "id=" + getId() + ", groupMemberIds=" + getGroupMemberIds() + ", name=" + getName() + ", description=" + getDescription() + ", iconUri=" + getIconUri() + ", isEnabled=" + isEnabled() + ", connectionState=" + getConnectionState() + ", controlFilters=" + Arrays.toString(getControlFilters().toArray()) + ", playbackType=" + getPlaybackType() + ", playbackStream=" + getPlaybackStream() + ", deviceType=" + getDeviceType() + ", volume=" + getVolume() + ", volumeMax=" + getVolumeMax() + ", volumeHandling=" + getVolumeHandling() + ", presentationDisplayId=" + getPresentationDisplayId() + ", extras=" + getExtras() + ", isValid=" + isValid() + ", minClientVersion=" + getMinClientVersion() + ", maxClientVersion=" + getMaxClientVersion() + " }";
    }

    public static final class Builder {
        private final Bundle mBundle;
        private ArrayList<IntentFilter> mControlFilters;
        private ArrayList<String> mGroupMemberIds;

        public Builder(@NonNull String str, @NonNull String str2) {
            this.mBundle = new Bundle();
            setId(str);
            setName(str2);
        }

        @NonNull
        public Builder addControlFilter(@NonNull IntentFilter intentFilter) {
            if (intentFilter != null) {
                if (this.mControlFilters == null) {
                    this.mControlFilters = new ArrayList<>();
                }
                if (!this.mControlFilters.contains(intentFilter)) {
                    this.mControlFilters.add(intentFilter);
                }
                return this;
            }
            throw new IllegalArgumentException("filter must not be null");
        }

        @NonNull
        public Builder addControlFilters(@NonNull Collection<IntentFilter> collection) {
            if (collection != null) {
                if (!collection.isEmpty()) {
                    for (IntentFilter next : collection) {
                        if (next != null) {
                            addControlFilter(next);
                        }
                    }
                }
                return this;
            }
            throw new IllegalArgumentException("filters must not be null");
        }

        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public Builder addGroupMemberId(@NonNull String str) {
            if (!TextUtils.isEmpty(str)) {
                if (this.mGroupMemberIds == null) {
                    this.mGroupMemberIds = new ArrayList<>();
                }
                if (!this.mGroupMemberIds.contains(str)) {
                    this.mGroupMemberIds.add(str);
                }
                return this;
            }
            throw new IllegalArgumentException("groupMemberId must not be empty");
        }

        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public Builder addGroupMemberIds(@NonNull Collection<String> collection) {
            if (collection != null) {
                if (!collection.isEmpty()) {
                    for (String addGroupMemberId : collection) {
                        addGroupMemberId(addGroupMemberId);
                    }
                }
                return this;
            }
            throw new IllegalArgumentException("groupMemberIds must not be null");
        }

        @NonNull
        public MediaRouteDescriptor build() {
            ArrayList<IntentFilter> arrayList = this.mControlFilters;
            if (arrayList != null) {
                this.mBundle.putParcelableArrayList(MediaRouteDescriptor.KEY_CONTROL_FILTERS, arrayList);
            }
            ArrayList<String> arrayList2 = this.mGroupMemberIds;
            if (arrayList2 != null) {
                this.mBundle.putStringArrayList(MediaRouteDescriptor.KEY_GROUP_MEMBER_IDS, arrayList2);
            }
            return new MediaRouteDescriptor(this.mBundle);
        }

        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public Builder clearGroupMemberIds() {
            ArrayList<String> arrayList = this.mGroupMemberIds;
            if (arrayList == null) {
                this.mGroupMemberIds = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            return this;
        }

        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public Builder removeGroupMemberId(@NonNull String str) {
            if (!TextUtils.isEmpty(str)) {
                ArrayList<String> arrayList = this.mGroupMemberIds;
                if (arrayList != null) {
                    arrayList.remove(str);
                }
                return this;
            }
            throw new IllegalArgumentException("memberRouteId must not be empty");
        }

        @NonNull
        public Builder setCanDisconnect(boolean z) {
            this.mBundle.putBoolean(MediaRouteDescriptor.KEY_CAN_DISCONNECT, z);
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setConnecting(boolean z) {
            this.mBundle.putBoolean(MediaRouteDescriptor.KEY_CONNECTING, z);
            return this;
        }

        @NonNull
        public Builder setConnectionState(int i) {
            this.mBundle.putInt(MediaRouteDescriptor.KEY_CONNECTION_STATE, i);
            return this;
        }

        @NonNull
        public Builder setDescription(@Nullable String str) {
            this.mBundle.putString("status", str);
            return this;
        }

        @NonNull
        public Builder setDeviceType(int i) {
            this.mBundle.putInt(MediaRouteDescriptor.KEY_DEVICE_TYPE, i);
            return this;
        }

        @NonNull
        public Builder setEnabled(boolean z) {
            this.mBundle.putBoolean(MediaRouteDescriptor.KEY_ENABLED, z);
            return this;
        }

        @NonNull
        public Builder setExtras(@Nullable Bundle bundle) {
            if (bundle == null) {
                this.mBundle.putBundle("extras", (Bundle) null);
            } else {
                this.mBundle.putBundle("extras", new Bundle(bundle));
            }
            return this;
        }

        @NonNull
        public Builder setIconUri(@NonNull Uri uri) {
            if (uri != null) {
                this.mBundle.putString(MediaRouteDescriptor.KEY_ICON_URI, uri.toString());
                return this;
            }
            throw new IllegalArgumentException("iconUri must not be null");
        }

        @NonNull
        public Builder setId(@NonNull String str) {
            if (str != null) {
                this.mBundle.putString("id", str);
                return this;
            }
            throw new NullPointerException("id must not be null");
        }

        @NonNull
        public Builder setIsDynamicGroupRoute(boolean z) {
            this.mBundle.putBoolean(MediaRouteDescriptor.IS_DYNAMIC_GROUP_ROUTE, z);
            return this;
        }

        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public Builder setMaxClientVersion(int i) {
            this.mBundle.putInt(MediaRouteDescriptor.KEY_MAX_CLIENT_VERSION, i);
            return this;
        }

        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public Builder setMinClientVersion(int i) {
            this.mBundle.putInt(MediaRouteDescriptor.KEY_MIN_CLIENT_VERSION, i);
            return this;
        }

        @NonNull
        public Builder setName(@NonNull String str) {
            if (str != null) {
                this.mBundle.putString("name", str);
                return this;
            }
            throw new NullPointerException("name must not be null");
        }

        @NonNull
        public Builder setPlaybackStream(int i) {
            this.mBundle.putInt(MediaRouteDescriptor.KEY_PLAYBACK_STREAM, i);
            return this;
        }

        @NonNull
        public Builder setPlaybackType(int i) {
            this.mBundle.putInt(MediaRouteDescriptor.KEY_PLAYBACK_TYPE, i);
            return this;
        }

        @NonNull
        public Builder setPresentationDisplayId(int i) {
            this.mBundle.putInt(MediaRouteDescriptor.KEY_PRESENTATION_DISPLAY_ID, i);
            return this;
        }

        @NonNull
        public Builder setSettingsActivity(@Nullable IntentSender intentSender) {
            this.mBundle.putParcelable(MediaRouteDescriptor.KEY_SETTINGS_INTENT, intentSender);
            return this;
        }

        @NonNull
        public Builder setVolume(int i) {
            this.mBundle.putInt("volume", i);
            return this;
        }

        @NonNull
        public Builder setVolumeHandling(int i) {
            this.mBundle.putInt(MediaRouteDescriptor.KEY_VOLUME_HANDLING, i);
            return this;
        }

        @NonNull
        public Builder setVolumeMax(int i) {
            this.mBundle.putInt(MediaRouteDescriptor.KEY_VOLUME_MAX, i);
            return this;
        }

        public Builder(@NonNull MediaRouteDescriptor mediaRouteDescriptor) {
            if (mediaRouteDescriptor != null) {
                this.mBundle = new Bundle(mediaRouteDescriptor.mBundle);
                if (!mediaRouteDescriptor.getGroupMemberIds().isEmpty()) {
                    this.mGroupMemberIds = new ArrayList<>(mediaRouteDescriptor.getGroupMemberIds());
                }
                if (!mediaRouteDescriptor.getControlFilters().isEmpty()) {
                    this.mControlFilters = new ArrayList<>(mediaRouteDescriptor.mControlFilters);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("descriptor must not be null");
        }
    }
}
