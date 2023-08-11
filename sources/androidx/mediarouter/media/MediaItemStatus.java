package androidx.mediarouter.media;

import android.os.Bundle;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.TimeUtils;

public final class MediaItemStatus {
    public static final String EXTRA_HTTP_RESPONSE_HEADERS = "android.media.status.extra.HTTP_RESPONSE_HEADERS";
    public static final String EXTRA_HTTP_STATUS_CODE = "android.media.status.extra.HTTP_STATUS_CODE";
    static final String KEY_CONTENT_DURATION = "contentDuration";
    static final String KEY_CONTENT_POSITION = "contentPosition";
    static final String KEY_EXTRAS = "extras";
    static final String KEY_PLAYBACK_STATE = "playbackState";
    static final String KEY_TIMESTAMP = "timestamp";
    public static final int PLAYBACK_STATE_BUFFERING = 3;
    public static final int PLAYBACK_STATE_CANCELED = 5;
    public static final int PLAYBACK_STATE_ERROR = 7;
    public static final int PLAYBACK_STATE_FINISHED = 4;
    public static final int PLAYBACK_STATE_INVALIDATED = 6;
    public static final int PLAYBACK_STATE_PAUSED = 2;
    public static final int PLAYBACK_STATE_PENDING = 0;
    public static final int PLAYBACK_STATE_PLAYING = 1;
    final Bundle mBundle;

    MediaItemStatus(Bundle bundle) {
        this.mBundle = bundle;
    }

    @Nullable
    public static MediaItemStatus fromBundle(@Nullable Bundle bundle) {
        if (bundle != null) {
            return new MediaItemStatus(bundle);
        }
        return null;
    }

    private static String playbackStateToString(int i) {
        switch (i) {
            case 0:
                return "pending";
            case 1:
                return "playing";
            case 2:
                return "paused";
            case 3:
                return "buffering";
            case 4:
                return "finished";
            case 5:
                return "canceled";
            case 6:
                return "invalidated";
            case 7:
                return MediaRouteProviderProtocol.SERVICE_DATA_ERROR;
            default:
                return Integer.toString(i);
        }
    }

    @NonNull
    public Bundle asBundle() {
        return this.mBundle;
    }

    public long getContentDuration() {
        return this.mBundle.getLong(KEY_CONTENT_DURATION, -1);
    }

    public long getContentPosition() {
        return this.mBundle.getLong(KEY_CONTENT_POSITION, -1);
    }

    @Nullable
    public Bundle getExtras() {
        return this.mBundle.getBundle("extras");
    }

    public int getPlaybackState() {
        return this.mBundle.getInt(KEY_PLAYBACK_STATE, 7);
    }

    public long getTimestamp() {
        return this.mBundle.getLong(KEY_TIMESTAMP);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MediaItemStatus{ ");
        sb.append("timestamp=");
        TimeUtils.formatDuration(SystemClock.elapsedRealtime() - getTimestamp(), sb);
        sb.append(" ms ago");
        sb.append(", playbackState=");
        sb.append(playbackStateToString(getPlaybackState()));
        sb.append(", contentPosition=");
        sb.append(getContentPosition());
        sb.append(", contentDuration=");
        sb.append(getContentDuration());
        sb.append(", extras=");
        sb.append(getExtras());
        sb.append(" }");
        return sb.toString();
    }

    public static final class Builder {
        private final Bundle mBundle;

        public Builder(int i) {
            this.mBundle = new Bundle();
            setTimestamp(SystemClock.elapsedRealtime());
            setPlaybackState(i);
        }

        @NonNull
        public MediaItemStatus build() {
            return new MediaItemStatus(this.mBundle);
        }

        @NonNull
        public Builder setContentDuration(long j) {
            this.mBundle.putLong(MediaItemStatus.KEY_CONTENT_DURATION, j);
            return this;
        }

        @NonNull
        public Builder setContentPosition(long j) {
            this.mBundle.putLong(MediaItemStatus.KEY_CONTENT_POSITION, j);
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
        public Builder setPlaybackState(int i) {
            this.mBundle.putInt(MediaItemStatus.KEY_PLAYBACK_STATE, i);
            return this;
        }

        @NonNull
        public Builder setTimestamp(long j) {
            this.mBundle.putLong(MediaItemStatus.KEY_TIMESTAMP, j);
            return this;
        }

        public Builder(@NonNull MediaItemStatus mediaItemStatus) {
            if (mediaItemStatus != null) {
                this.mBundle = new Bundle(mediaItemStatus.mBundle);
                return;
            }
            throw new IllegalArgumentException("status must not be null");
        }
    }
}
