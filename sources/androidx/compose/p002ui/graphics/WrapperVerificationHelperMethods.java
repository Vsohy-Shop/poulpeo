package androidx.compose.p002ui.graphics;

import android.graphics.Paint;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.C12775o;

@RequiresApi(29)
/* renamed from: androidx.compose.ui.graphics.WrapperVerificationHelperMethods */
/* compiled from: AndroidPaint.android.kt */
public final class WrapperVerificationHelperMethods {
    public static final WrapperVerificationHelperMethods INSTANCE = new WrapperVerificationHelperMethods();

    private WrapperVerificationHelperMethods() {
    }

    @DoNotInline
    /* renamed from: setBlendMode-GB0RdKg  reason: not valid java name */
    public final void m36105setBlendModeGB0RdKg(Paint paint, int i) {
        C12775o.m28639i(paint, "paint");
        paint.setBlendMode(AndroidBlendMode_androidKt.m35514toAndroidBlendModes9anfk8(i));
    }
}
