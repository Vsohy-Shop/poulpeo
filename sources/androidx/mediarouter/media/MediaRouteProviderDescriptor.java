package androidx.mediarouter.media;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public final class MediaRouteProviderDescriptor {
    private static final String KEY_ROUTES = "routes";
    private static final String KEY_SUPPORTS_DYNAMIC_GROUP_ROUTE = "supportsDynamicGroupRoute";
    Bundle mBundle;
    final List<MediaRouteDescriptor> mRoutes;
    final boolean mSupportsDynamicGroupRoute;

    MediaRouteProviderDescriptor(List<MediaRouteDescriptor> list, boolean z) {
        this.mRoutes = list == null ? Collections.emptyList() : list;
        this.mSupportsDynamicGroupRoute = z;
    }

    @Nullable
    public static MediaRouteProviderDescriptor fromBundle(@Nullable Bundle bundle) {
        ArrayList arrayList = null;
        if (bundle == null) {
            return null;
        }
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(KEY_ROUTES);
        if (parcelableArrayList != null && !parcelableArrayList.isEmpty()) {
            int size = parcelableArrayList.size();
            ArrayList arrayList2 = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                arrayList2.add(MediaRouteDescriptor.fromBundle((Bundle) parcelableArrayList.get(i)));
            }
            arrayList = arrayList2;
        }
        return new MediaRouteProviderDescriptor(arrayList, bundle.getBoolean(KEY_SUPPORTS_DYNAMIC_GROUP_ROUTE, false));
    }

    @NonNull
    public Bundle asBundle() {
        Bundle bundle = this.mBundle;
        if (bundle != null) {
            return bundle;
        }
        this.mBundle = new Bundle();
        List<MediaRouteDescriptor> list = this.mRoutes;
        if (list != null && !list.isEmpty()) {
            int size = this.mRoutes.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                arrayList.add(this.mRoutes.get(i).asBundle());
            }
            this.mBundle.putParcelableArrayList(KEY_ROUTES, arrayList);
        }
        this.mBundle.putBoolean(KEY_SUPPORTS_DYNAMIC_GROUP_ROUTE, this.mSupportsDynamicGroupRoute);
        return this.mBundle;
    }

    @NonNull
    public List<MediaRouteDescriptor> getRoutes() {
        return this.mRoutes;
    }

    public boolean isValid() {
        int size = getRoutes().size();
        for (int i = 0; i < size; i++) {
            MediaRouteDescriptor mediaRouteDescriptor = this.mRoutes.get(i);
            if (mediaRouteDescriptor == null || !mediaRouteDescriptor.isValid()) {
                return false;
            }
        }
        return true;
    }

    public boolean supportsDynamicGroupRoute() {
        return this.mSupportsDynamicGroupRoute;
    }

    public String toString() {
        return "MediaRouteProviderDescriptor{ " + "routes=" + Arrays.toString(getRoutes().toArray()) + ", isValid=" + isValid() + " }";
    }

    public static final class Builder {
        private List<MediaRouteDescriptor> mRoutes;
        private boolean mSupportsDynamicGroupRoute = false;

        public Builder() {
        }

        @NonNull
        public Builder addRoute(@NonNull MediaRouteDescriptor mediaRouteDescriptor) {
            if (mediaRouteDescriptor != null) {
                List<MediaRouteDescriptor> list = this.mRoutes;
                if (list == null) {
                    this.mRoutes = new ArrayList();
                } else if (list.contains(mediaRouteDescriptor)) {
                    throw new IllegalArgumentException("route descriptor already added");
                }
                this.mRoutes.add(mediaRouteDescriptor);
                return this;
            }
            throw new IllegalArgumentException("route must not be null");
        }

        @NonNull
        public Builder addRoutes(@NonNull Collection<MediaRouteDescriptor> collection) {
            if (collection != null) {
                if (!collection.isEmpty()) {
                    for (MediaRouteDescriptor addRoute : collection) {
                        addRoute(addRoute);
                    }
                }
                return this;
            }
            throw new IllegalArgumentException("routes must not be null");
        }

        @NonNull
        public MediaRouteProviderDescriptor build() {
            return new MediaRouteProviderDescriptor(this.mRoutes, this.mSupportsDynamicGroupRoute);
        }

        /* access modifiers changed from: package-private */
        @NonNull
        public Builder setRoutes(@Nullable Collection<MediaRouteDescriptor> collection) {
            if (collection == null || collection.isEmpty()) {
                this.mRoutes = null;
            } else {
                this.mRoutes = new ArrayList(collection);
            }
            return this;
        }

        @NonNull
        public Builder setSupportsDynamicGroupRoute(boolean z) {
            this.mSupportsDynamicGroupRoute = z;
            return this;
        }

        public Builder(@NonNull MediaRouteProviderDescriptor mediaRouteProviderDescriptor) {
            if (mediaRouteProviderDescriptor != null) {
                this.mRoutes = mediaRouteProviderDescriptor.mRoutes;
                this.mSupportsDynamicGroupRoute = mediaRouteProviderDescriptor.mSupportsDynamicGroupRoute;
                return;
            }
            throw new IllegalArgumentException("descriptor must not be null");
        }
    }
}
