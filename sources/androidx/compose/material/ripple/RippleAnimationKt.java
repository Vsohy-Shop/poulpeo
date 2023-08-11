package androidx.compose.material.ripple;

import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.geometry.OffsetKt;
import androidx.compose.p002ui.geometry.Size;
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.p002ui.unit.Density;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nRippleAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RippleAnimation.kt\nandroidx/compose/material/ripple/RippleAnimationKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,194:1\n155#2:195\n*S KotlinDebug\n*F\n+ 1 RippleAnimation.kt\nandroidx/compose/material/ripple/RippleAnimationKt\n*L\n189#1:195\n*E\n"})
/* compiled from: RippleAnimation.kt */
public final class RippleAnimationKt {
    private static final float BoundedRippleExtraRadius = C1232Dp.m38468constructorimpl((float) 10);
    private static final int FadeInDuration = 75;
    private static final int FadeOutDuration = 150;
    private static final int RadiusDuration = 225;

    /* renamed from: getRippleEndRadius-cSwnlzA  reason: not valid java name */
    public static final float m34230getRippleEndRadiuscSwnlzA(Density density, boolean z, long j) {
        C12775o.m28639i(density, "$this$getRippleEndRadius");
        float r3 = Offset.m35420getDistanceimpl(OffsetKt.Offset(Size.m35491getWidthimpl(j), Size.m35488getHeightimpl(j))) / 2.0f;
        if (z) {
            return r3 + density.m38449toPx0680j_4(BoundedRippleExtraRadius);
        }
        return r3;
    }

    /* renamed from: getRippleStartRadius-uvyYCjk  reason: not valid java name */
    public static final float m34231getRippleStartRadiusuvyYCjk(long j) {
        return Math.max(Size.m35491getWidthimpl(j), Size.m35488getHeightimpl(j)) * 0.3f;
    }
}
