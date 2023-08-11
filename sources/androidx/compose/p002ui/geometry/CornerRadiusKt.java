package androidx.compose.p002ui.geometry;

import androidx.compose.p002ui.util.MathHelpersKt;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nCornerRadius.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadiusKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,164:1\n25#2,3:165\n*S KotlinDebug\n*F\n+ 1 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadiusKt\n*L\n33#1:165,3\n*E\n"})
/* renamed from: androidx.compose.ui.geometry.CornerRadiusKt */
/* compiled from: CornerRadius.kt */
public final class CornerRadiusKt {
    @Stable
    public static final long CornerRadius(float f, float f2) {
        long floatToIntBits = (long) Float.floatToIntBits(f);
        return CornerRadius.m35391constructorimpl((((long) Float.floatToIntBits(f2)) & 4294967295L) | (floatToIntBits << 32));
    }

    public static /* synthetic */ long CornerRadius$default(float f, float f2, int i, Object obj) {
        if ((i & 2) != 0) {
            f2 = f;
        }
        return CornerRadius(f, f2);
    }

    @Stable
    /* renamed from: lerp-3Ry4LBc  reason: not valid java name */
    public static final long m35408lerp3Ry4LBc(long j, long j2, float f) {
        return CornerRadius(MathHelpersKt.lerp(CornerRadius.m35397getXimpl(j), CornerRadius.m35397getXimpl(j2), f), MathHelpersKt.lerp(CornerRadius.m35398getYimpl(j), CornerRadius.m35398getYimpl(j2), f));
    }
}
