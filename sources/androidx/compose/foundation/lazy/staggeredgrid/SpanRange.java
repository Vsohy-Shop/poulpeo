package androidx.compose.foundation.lazy.staggeredgrid;

import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nLazyStaggeredGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/SpanRange\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,1097:1\n879#1:1101\n878#1:1103\n48#2:1098\n55#2:1099\n62#2:1100\n62#2:1102\n55#2:1104\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/SpanRange\n*L\n880#1:1101\n880#1:1103\n876#1:1098\n878#1:1099\n879#1:1100\n880#1:1102\n880#1:1104\n*E\n"})
/* compiled from: LazyStaggeredGridMeasure.kt */
final class SpanRange {
    private final long packedValue;

    private /* synthetic */ SpanRange(long j) {
        this.packedValue = j;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ SpanRange m33568boximpl(long j) {
        return new SpanRange(j);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    private static long m33570constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m33571equalsimpl(long j, Object obj) {
        if ((obj instanceof SpanRange) && j == ((SpanRange) obj).m33578unboximpl()) {
            return true;
        }
        return false;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m33572equalsimpl0(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    /* renamed from: getEnd-impl  reason: not valid java name */
    public static final int m33573getEndimpl(long j) {
        return (int) (j & 4294967295L);
    }

    /* renamed from: getSize-impl  reason: not valid java name */
    public static final int m33574getSizeimpl(long j) {
        return ((int) (4294967295L & j)) - ((int) (j >> 32));
    }

    /* renamed from: getStart-impl  reason: not valid java name */
    public static final int m33575getStartimpl(long j) {
        return (int) (j >> 32);
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m33576hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m33577toStringimpl(long j) {
        return "SpanRange(packedValue=" + j + ')';
    }

    public boolean equals(Object obj) {
        return m33571equalsimpl(this.packedValue, obj);
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return m33576hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m33577toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m33578unboximpl() {
        return this.packedValue;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m33569constructorimpl(int i, int i2) {
        return m33570constructorimpl((((long) (i2 + i)) & 4294967295L) | (((long) i) << 32));
    }
}
