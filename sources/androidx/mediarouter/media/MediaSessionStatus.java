package androidx.mediarouter.media;

import android.os.Bundle;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.TimeUtils;

public final class MediaSessionStatus {
    static final String KEY_EXTRAS = "extras";
    static final String KEY_QUEUE_PAUSED = "queuePaused";
    static final String KEY_SESSION_STATE = "sessionState";
    static final String KEY_TIMESTAMP = "timestamp";
    public static final int SESSION_STATE_ACTIVE = 0;
    public static final int SESSION_STATE_ENDED = 1;
    public static final int SESSION_STATE_INVALIDATED = 2;
    final Bundle mBundle;

    MediaSessionStatus(Bundle bundle) {
        this.mBundle = bundle;
    }

    @Nullable
    public static MediaSessionStatus fromBundle(@Nullable Bundle bundle) {
        if (bundle != null) {
            return new MediaSessionStatus(bundle);
        }
        return null;
    }

    private static String sessionStateToString(int i) {
        if (i == 0) {
            return "active";
        }
        if (i == 1) {
            return "ended";
        }
        if (i != 2) {
            return Integer.toString(i);
        }
        return "invalidated";
    }

    @NonNull
    public Bundle asBundle() {
        return this.mBundle;
    }

    @Nullable
    public Bundle getExtras() {
        return this.mBundle.getBundle("extras");
    }

    public int getSessionState() {
        return this.mBundle.getInt(KEY_SESSION_STATE, 2);
    }

    public long getTimestamp() {
        return this.mBundle.getLong(KEY_TIMESTAMP);
    }

    public boolean isQueuePaused() {
        return this.mBundle.getBoolean(KEY_QUEUE_PAUSED);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MediaSessionStatus{ ");
        sb.append("timestamp=");
        TimeUtils.formatDuration(SystemClock.elapsedRealtime() - getTimestamp(), sb);
        sb.append(" ms ago");
        sb.append(", sessionState=");
        sb.append(sessionStateToString(getSessionState()));
        sb.append(", queuePaused=");
        sb.append(isQueuePaused());
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
            setSessionState(i);
        }

        @NonNull
        public MediaSessionStatus build() {
            return new MediaSessionStatus(this.mBundle);
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
        public Builder setQueuePaused(boolean z) {
            this.mBundle.putBoolean(MediaSessionStatus.KEY_QUEUE_PAUSED, z);
            return this;
        }

        @NonNull
        public Builder setSessionState(int i) {
            this.mBundle.putInt(MediaSessionStatus.KEY_SESSION_STATE, i);
            return this;
        }

        @NonNull
        public Builder setTimestamp(long j) {
            this.mBundle.putLong(MediaSessionStatus.KEY_TIMESTAMP, j);
            return this;
        }

        public Builder(@NonNull MediaSessionStatus mediaSessionStatus) {
            if (mediaSessionStatus != null) {
                this.mBundle = new Bundle(mediaSessionStatus.mBundle);
                return;
            }
            throw new IllegalArgumentException("status must not be null");
        }
    }
}
