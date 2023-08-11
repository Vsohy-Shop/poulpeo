package androidx.compose.p002ui.unit;

import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nVelocity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Velocity.kt\nandroidx/compose/ui/unit/VelocityKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,144:1\n25#2,3:145\n*S KotlinDebug\n*F\n+ 1 Velocity.kt\nandroidx/compose/ui/unit/VelocityKt\n*L\n32#1:145,3\n*E\n"})
/* renamed from: androidx.compose.ui.unit.VelocityKt */
/* compiled from: Velocity.kt */
public final class VelocityKt {
    @Stable
    public static final long Velocity(float f, float f2) {
        long floatToIntBits = (long) Float.floatToIntBits(f);
        return Velocity.m38687constructorimpl((((long) Float.floatToIntBits(f2)) & 4294967295L) | (floatToIntBits << 32));
    }
}
