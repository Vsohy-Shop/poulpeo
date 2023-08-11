package androidx.compose.p002ui.graphics;

import androidx.compose.p002ui.geometry.OffsetKt;
import androidx.compose.p002ui.util.MathHelpersKt;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: androidx.compose.ui.graphics.ShadowKt */
/* compiled from: Shadow.kt */
public final class ShadowKt {
    @Stable
    public static final Shadow lerp(Shadow shadow, Shadow shadow2, float f) {
        C12775o.m28639i(shadow, "start");
        C12775o.m28639i(shadow2, "stop");
        return new Shadow(ColorKt.m35722lerpjxsXWHM(shadow.m36023getColor0d7_KjU(), shadow2.m36023getColor0d7_KjU(), f), OffsetKt.m35445lerpWko1d7g(shadow.m36024getOffsetF1C5BW0(), shadow2.m36024getOffsetF1C5BW0(), f), MathHelpersKt.lerp(shadow.getBlurRadius(), shadow2.getBlurRadius(), f), (DefaultConstructorMarker) null);
    }
}
