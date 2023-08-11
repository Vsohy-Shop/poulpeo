package androidx.compose.p002ui.graphics;

import android.graphics.BlendModeColorFilter;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(29)
/* renamed from: androidx.compose.ui.graphics.BlendModeColorFilterHelper */
/* compiled from: AndroidColorFilter.android.kt */
final class BlendModeColorFilterHelper {
    public static final BlendModeColorFilterHelper INSTANCE = new BlendModeColorFilterHelper();

    private BlendModeColorFilterHelper() {
    }

    @DoNotInline
    /* renamed from: BlendModeColorFilter-xETnrds  reason: not valid java name */
    public final BlendModeColorFilter m35606BlendModeColorFilterxETnrds(long j, int i) {
        return new BlendModeColorFilter(ColorKt.m35725toArgb8_81llA(j), AndroidBlendMode_androidKt.m35514toAndroidBlendModes9anfk8(i));
    }
}
