package androidx.compose.p002ui.unit;

import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.geometry.OffsetKt;
import androidx.compose.p002ui.util.MathHelpersKt;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nIntOffset.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,179:1\n48#2:180\n*S KotlinDebug\n*F\n+ 1 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n*L\n39#1:180\n*E\n"})
/* renamed from: androidx.compose.ui.unit.IntOffsetKt */
/* compiled from: IntOffset.kt */
public final class IntOffsetKt {
    @Stable
    public static final long IntOffset(int i, int i2) {
        return IntOffset.m38580constructorimpl((((long) i2) & 4294967295L) | (((long) i) << 32));
    }

    @Stable
    /* renamed from: lerp-81ZRxRo  reason: not valid java name */
    public static final long m38597lerp81ZRxRo(long j, long j2, float f) {
        return IntOffset(MathHelpersKt.lerp(IntOffset.m38586getXimpl(j), IntOffset.m38586getXimpl(j2), f), MathHelpersKt.lerp(IntOffset.m38587getYimpl(j), IntOffset.m38587getYimpl(j2), f));
    }

    @Stable
    /* renamed from: minus-Nv-tHpc  reason: not valid java name */
    public static final long m38598minusNvtHpc(long j, long j2) {
        return OffsetKt.Offset(Offset.m35422getXimpl(j) - ((float) IntOffset.m38586getXimpl(j2)), Offset.m35423getYimpl(j) - ((float) IntOffset.m38587getYimpl(j2)));
    }

    @Stable
    /* renamed from: minus-oCl6YwE  reason: not valid java name */
    public static final long m38599minusoCl6YwE(long j, long j2) {
        return OffsetKt.Offset(((float) IntOffset.m38586getXimpl(j)) - Offset.m35422getXimpl(j2), ((float) IntOffset.m38587getYimpl(j)) - Offset.m35423getYimpl(j2));
    }

    @Stable
    /* renamed from: plus-Nv-tHpc  reason: not valid java name */
    public static final long m38600plusNvtHpc(long j, long j2) {
        return OffsetKt.Offset(Offset.m35422getXimpl(j) + ((float) IntOffset.m38586getXimpl(j2)), Offset.m35423getYimpl(j) + ((float) IntOffset.m38587getYimpl(j2)));
    }

    @Stable
    /* renamed from: plus-oCl6YwE  reason: not valid java name */
    public static final long m38601plusoCl6YwE(long j, long j2) {
        return OffsetKt.Offset(((float) IntOffset.m38586getXimpl(j)) + Offset.m35422getXimpl(j2), ((float) IntOffset.m38587getYimpl(j)) + Offset.m35423getYimpl(j2));
    }

    @Stable
    /* renamed from: round-k-4lQ0M  reason: not valid java name */
    public static final long m38602roundk4lQ0M(long j) {
        return IntOffset(C13265c.m30134c(Offset.m35422getXimpl(j)), C13265c.m30134c(Offset.m35423getYimpl(j)));
    }

    @Stable
    /* renamed from: toOffset--gyyYBs  reason: not valid java name */
    public static final long m38603toOffsetgyyYBs(long j) {
        return OffsetKt.Offset((float) IntOffset.m38586getXimpl(j), (float) IntOffset.m38587getYimpl(j));
    }
}
