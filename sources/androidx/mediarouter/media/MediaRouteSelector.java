package androidx.mediarouter.media;

import android.content.IntentFilter;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public final class MediaRouteSelector {
    public static final MediaRouteSelector EMPTY = new MediaRouteSelector(new Bundle(), (List<String>) null);
    static final String KEY_CONTROL_CATEGORIES = "controlCategories";
    private final Bundle mBundle;
    List<String> mControlCategories;

    public static final class Builder {
        private ArrayList<String> mControlCategories;

        public Builder() {
        }

        @NonNull
        public Builder addControlCategories(@NonNull Collection<String> collection) {
            if (collection != null) {
                if (!collection.isEmpty()) {
                    for (String addControlCategory : collection) {
                        addControlCategory(addControlCategory);
                    }
                }
                return this;
            }
            throw new IllegalArgumentException("categories must not be null");
        }

        @NonNull
        public Builder addControlCategory(@NonNull String str) {
            if (str != null) {
                if (this.mControlCategories == null) {
                    this.mControlCategories = new ArrayList<>();
                }
                if (!this.mControlCategories.contains(str)) {
                    this.mControlCategories.add(str);
                }
                return this;
            }
            throw new IllegalArgumentException("category must not be null");
        }

        @NonNull
        public Builder addSelector(@NonNull MediaRouteSelector mediaRouteSelector) {
            if (mediaRouteSelector != null) {
                addControlCategories(mediaRouteSelector.getControlCategories());
                return this;
            }
            throw new IllegalArgumentException("selector must not be null");
        }

        @NonNull
        public MediaRouteSelector build() {
            if (this.mControlCategories == null) {
                return MediaRouteSelector.EMPTY;
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList(MediaRouteSelector.KEY_CONTROL_CATEGORIES, this.mControlCategories);
            return new MediaRouteSelector(bundle, this.mControlCategories);
        }

        public Builder(@NonNull MediaRouteSelector mediaRouteSelector) {
            if (mediaRouteSelector != null) {
                mediaRouteSelector.ensureControlCategories();
                if (!mediaRouteSelector.mControlCategories.isEmpty()) {
                    this.mControlCategories = new ArrayList<>(mediaRouteSelector.mControlCategories);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("selector must not be null");
        }
    }

    MediaRouteSelector(Bundle bundle, List<String> list) {
        this.mBundle = bundle;
        this.mControlCategories = list;
    }

    @Nullable
    public static MediaRouteSelector fromBundle(@Nullable Bundle bundle) {
        if (bundle != null) {
            return new MediaRouteSelector(bundle, (List<String>) null);
        }
        return null;
    }

    @NonNull
    public Bundle asBundle() {
        return this.mBundle;
    }

    public boolean contains(@NonNull MediaRouteSelector mediaRouteSelector) {
        if (mediaRouteSelector == null) {
            return false;
        }
        ensureControlCategories();
        mediaRouteSelector.ensureControlCategories();
        return this.mControlCategories.containsAll(mediaRouteSelector.mControlCategories);
    }

    /* access modifiers changed from: package-private */
    public void ensureControlCategories() {
        if (this.mControlCategories == null) {
            ArrayList<String> stringArrayList = this.mBundle.getStringArrayList(KEY_CONTROL_CATEGORIES);
            this.mControlCategories = stringArrayList;
            if (stringArrayList == null || stringArrayList.isEmpty()) {
                this.mControlCategories = Collections.emptyList();
            }
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof MediaRouteSelector)) {
            return false;
        }
        MediaRouteSelector mediaRouteSelector = (MediaRouteSelector) obj;
        ensureControlCategories();
        mediaRouteSelector.ensureControlCategories();
        return this.mControlCategories.equals(mediaRouteSelector.mControlCategories);
    }

    @NonNull
    public List<String> getControlCategories() {
        ensureControlCategories();
        return new ArrayList(this.mControlCategories);
    }

    public boolean hasControlCategory(@Nullable String str) {
        if (str == null) {
            return false;
        }
        ensureControlCategories();
        int size = this.mControlCategories.size();
        for (int i = 0; i < size; i++) {
            if (this.mControlCategories.get(i).equals(str)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        ensureControlCategories();
        return this.mControlCategories.hashCode();
    }

    public boolean isEmpty() {
        ensureControlCategories();
        return this.mControlCategories.isEmpty();
    }

    public boolean isValid() {
        ensureControlCategories();
        if (this.mControlCategories.contains((Object) null)) {
            return false;
        }
        return true;
    }

    public boolean matchesControlFilters(@Nullable List<IntentFilter> list) {
        if (list == null) {
            return false;
        }
        ensureControlCategories();
        if (this.mControlCategories.isEmpty()) {
            return false;
        }
        for (IntentFilter next : list) {
            if (next != null) {
                for (String hasCategory : this.mControlCategories) {
                    if (next.hasCategory(hasCategory)) {
                        return true;
                    }
                }
                continue;
            }
        }
        return false;
    }

    public String toString() {
        return "MediaRouteSelector{ " + "controlCategories=" + Arrays.toString(getControlCategories().toArray()) + " }";
    }
}
