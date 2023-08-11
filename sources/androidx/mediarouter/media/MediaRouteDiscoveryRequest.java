package androidx.mediarouter.media;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public final class MediaRouteDiscoveryRequest {
    private static final String KEY_ACTIVE_SCAN = "activeScan";
    private static final String KEY_SELECTOR = "selector";
    private final Bundle mBundle;
    private MediaRouteSelector mSelector;

    public MediaRouteDiscoveryRequest(@NonNull MediaRouteSelector mediaRouteSelector, boolean z) {
        if (mediaRouteSelector != null) {
            Bundle bundle = new Bundle();
            this.mBundle = bundle;
            this.mSelector = mediaRouteSelector;
            bundle.putBundle(KEY_SELECTOR, mediaRouteSelector.asBundle());
            bundle.putBoolean(KEY_ACTIVE_SCAN, z);
            return;
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    private void ensureSelector() {
        if (this.mSelector == null) {
            MediaRouteSelector fromBundle = MediaRouteSelector.fromBundle(this.mBundle.getBundle(KEY_SELECTOR));
            this.mSelector = fromBundle;
            if (fromBundle == null) {
                this.mSelector = MediaRouteSelector.EMPTY;
            }
        }
    }

    @Nullable
    public static MediaRouteDiscoveryRequest fromBundle(@Nullable Bundle bundle) {
        if (bundle != null) {
            return new MediaRouteDiscoveryRequest(bundle);
        }
        return null;
    }

    @NonNull
    public Bundle asBundle() {
        return this.mBundle;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof MediaRouteDiscoveryRequest)) {
            return false;
        }
        MediaRouteDiscoveryRequest mediaRouteDiscoveryRequest = (MediaRouteDiscoveryRequest) obj;
        if (!getSelector().equals(mediaRouteDiscoveryRequest.getSelector()) || isActiveScan() != mediaRouteDiscoveryRequest.isActiveScan()) {
            return false;
        }
        return true;
    }

    @NonNull
    public MediaRouteSelector getSelector() {
        ensureSelector();
        return this.mSelector;
    }

    public int hashCode() {
        return getSelector().hashCode() ^ isActiveScan() ? 1 : 0;
    }

    public boolean isActiveScan() {
        return this.mBundle.getBoolean(KEY_ACTIVE_SCAN);
    }

    public boolean isValid() {
        ensureSelector();
        return this.mSelector.isValid();
    }

    public String toString() {
        return "DiscoveryRequest{ selector=" + getSelector() + ", activeScan=" + isActiveScan() + ", isValid=" + isValid() + " }";
    }

    private MediaRouteDiscoveryRequest(Bundle bundle) {
        this.mBundle = bundle;
    }
}
