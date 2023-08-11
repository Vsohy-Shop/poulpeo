package androidx.compose.p002ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Immutable
@SourceDebugExtension({"SMAP\nIntSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,111:1\n55#2:112\n62#2:113\n*S KotlinDebug\n*F\n+ 1 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n*L\n46#1:112\n53#1:113\n*E\n"})
/* renamed from: androidx.compose.ui.unit.IntSize */
/* compiled from: IntSize.kt */
public final class IntSize {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final long Zero = m38623constructorimpl(0);
    private final long packedValue;

    /* renamed from: androidx.compose.ui.unit.IntSize$Companion */
    /* compiled from: IntSize.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getZero-YbymL2g  reason: not valid java name */
        public final long m38633getZeroYbymL2g() {
            return IntSize.Zero;
        }
    }

    private /* synthetic */ IntSize(long j) {
        this.packedValue = j;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ IntSize m38620boximpl(long j) {
        return new IntSize(j);
    }

    @Stable
    /* renamed from: component1-impl  reason: not valid java name */
    public static final int m38621component1impl(long j) {
        return m38628getWidthimpl(j);
    }

    @Stable
    /* renamed from: component2-impl  reason: not valid java name */
    public static final int m38622component2impl(long j) {
        return m38627getHeightimpl(j);
    }

    @Stable
    /* renamed from: div-YEO4UFw  reason: not valid java name */
    public static final long m38624divYEO4UFw(long j, int i) {
        return IntSizeKt.IntSize(m38628getWidthimpl(j) / i, m38627getHeightimpl(j) / i);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m38625equalsimpl(long j, Object obj) {
        if ((obj instanceof IntSize) && j == ((IntSize) obj).m38632unboximpl()) {
            return true;
        }
        return false;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m38626equalsimpl0(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    /* renamed from: getHeight-impl  reason: not valid java name */
    public static final int m38627getHeightimpl(long j) {
        return (int) (j & 4294967295L);
    }

    /* renamed from: getWidth-impl  reason: not valid java name */
    public static final int m38628getWidthimpl(long j) {
        return (int) (j >> 32);
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m38629hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    @Stable
    /* renamed from: times-YEO4UFw  reason: not valid java name */
    public static final long m38630timesYEO4UFw(long j, int i) {
        return IntSizeKt.IntSize(m38628getWidthimpl(j) * i, m38627getHeightimpl(j) * i);
    }

    @Stable
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m38631toStringimpl(long j) {
        return m38628getWidthimpl(j) + " x " + m38627getHeightimpl(j);
    }

    public boolean equals(Object obj) {
        return m38625equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m38629hashCodeimpl(this.packedValue);
    }

    @Stable
    public String toString() {
        return m38631toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m38632unboximpl() {
        return this.packedValue;
    }

    @Stable
    public static /* synthetic */ void getHeight$annotations() {
    }

    public static /* synthetic */ void getPackedValue$annotations() {
    }

    @Stable
    public static /* synthetic */ void getWidth$annotations() {
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m38623constructorimpl(long j) {
        return j;
    }
}
