package androidx.webkit;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class TracingConfig {
    public static final int CATEGORIES_ALL = 1;
    public static final int CATEGORIES_ANDROID_WEBVIEW = 2;
    public static final int CATEGORIES_FRAME_VIEWER = 64;
    public static final int CATEGORIES_INPUT_LATENCY = 8;
    public static final int CATEGORIES_JAVASCRIPT_AND_RENDERING = 32;
    public static final int CATEGORIES_NONE = 0;
    public static final int CATEGORIES_RENDERING = 16;
    public static final int CATEGORIES_WEB_DEVELOPER = 4;
    public static final int RECORD_CONTINUOUSLY = 1;
    public static final int RECORD_UNTIL_FULL = 0;
    private final List<String> mCustomIncludedCategories;
    private int mPredefinedCategories;
    private int mTracingMode;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    public @interface PredefinedCategories {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    public @interface TracingMode {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public TracingConfig(int i, @NonNull List<String> list, int i2) {
        ArrayList arrayList = new ArrayList();
        this.mCustomIncludedCategories = arrayList;
        this.mPredefinedCategories = i;
        arrayList.addAll(list);
        this.mTracingMode = i2;
    }

    @NonNull
    public List<String> getCustomIncludedCategories() {
        return this.mCustomIncludedCategories;
    }

    public int getPredefinedCategories() {
        return this.mPredefinedCategories;
    }

    public int getTracingMode() {
        return this.mTracingMode;
    }

    public static class Builder {
        private final List<String> mCustomIncludedCategories = new ArrayList();
        private int mPredefinedCategories = 0;
        private int mTracingMode = 1;

        @NonNull
        public Builder addCategories(@NonNull int... iArr) {
            for (int i : iArr) {
                this.mPredefinedCategories = i | this.mPredefinedCategories;
            }
            return this;
        }

        @NonNull
        public TracingConfig build() {
            return new TracingConfig(this.mPredefinedCategories, this.mCustomIncludedCategories, this.mTracingMode);
        }

        @NonNull
        public Builder setTracingMode(int i) {
            this.mTracingMode = i;
            return this;
        }

        @NonNull
        public Builder addCategories(@NonNull String... strArr) {
            this.mCustomIncludedCategories.addAll(Arrays.asList(strArr));
            return this;
        }

        @NonNull
        public Builder addCategories(@NonNull Collection<String> collection) {
            this.mCustomIncludedCategories.addAll(collection);
            return this;
        }
    }
}
