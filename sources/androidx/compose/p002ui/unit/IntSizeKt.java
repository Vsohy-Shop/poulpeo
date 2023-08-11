package androidx.compose.p002ui.unit;

import androidx.compose.p002ui.geometry.SizeKt;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nIntSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,111:1\n48#2:112\n*S KotlinDebug\n*F\n+ 1 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n*L\n32#1:112\n*E\n"})
/* renamed from: androidx.compose.ui.unit.IntSizeKt */
/* compiled from: IntSize.kt */
public final class IntSizeKt {
    @Stable
    public static final long IntSize(int i, int i2) {
        return IntSize.m38623constructorimpl((((long) i2) & 4294967295L) | (((long) i) << 32));
    }

    /* renamed from: getCenter-ozmzZPI  reason: not valid java name */
    public static final long m38634getCenterozmzZPI(long j) {
        return IntOffsetKt.IntOffset(IntSize.m38628getWidthimpl(j) / 2, IntSize.m38627getHeightimpl(j) / 2);
    }

    @Stable
    /* renamed from: times-O0kMr_c  reason: not valid java name */
    public static final long m38636timesO0kMr_c(int i, long j) {
        return IntSize.m38630timesYEO4UFw(j, i);
    }

    @Stable
    /* renamed from: toIntRect-ozmzZPI  reason: not valid java name */
    public static final IntRect m38637toIntRectozmzZPI(long j) {
        return IntRectKt.m38618IntRectVbeCjmY(IntOffset.Companion.m38596getZeronOccac(), j);
    }

    @Stable
    /* renamed from: toSize-ozmzZPI  reason: not valid java name */
    public static final long m38638toSizeozmzZPI(long j) {
        return SizeKt.Size((float) IntSize.m38628getWidthimpl(j), (float) IntSize.m38627getHeightimpl(j));
    }

    @Stable
    /* renamed from: getCenter-ozmzZPI$annotations  reason: not valid java name */
    public static /* synthetic */ void m38635getCenterozmzZPI$annotations(long j) {
    }
}
