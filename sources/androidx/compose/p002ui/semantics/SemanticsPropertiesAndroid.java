package androidx.compose.p002ui.semantics;

import androidx.compose.p002ui.ExperimentalComposeUiApi;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 0)
@ExperimentalComposeUiApi
/* renamed from: androidx.compose.ui.semantics.SemanticsPropertiesAndroid */
/* compiled from: SemanticsProperties.android.kt */
public final class SemanticsPropertiesAndroid {
    public static final int $stable = 0;
    public static final SemanticsPropertiesAndroid INSTANCE = new SemanticsPropertiesAndroid();
    private static final SemanticsPropertyKey<Boolean> TestTagsAsResourceId = new SemanticsPropertyKey<>("TestTagsAsResourceId", SemanticsPropertiesAndroid$TestTagsAsResourceId$1.INSTANCE);

    private SemanticsPropertiesAndroid() {
    }

    @ExperimentalComposeUiApi
    public final SemanticsPropertyKey<Boolean> getTestTagsAsResourceId() {
        return TestTagsAsResourceId;
    }

    @ExperimentalComposeUiApi
    public static /* synthetic */ void getTestTagsAsResourceId$annotations() {
    }
}
