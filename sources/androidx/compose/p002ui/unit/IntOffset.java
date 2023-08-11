package androidx.compose.p002ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Immutable
@SourceDebugExtension({"SMAP\nIntOffset.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,179:1\n55#2:180\n62#2:181\n*S KotlinDebug\n*F\n+ 1 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n53#1:180\n60#1:181\n*E\n"})
/* renamed from: androidx.compose.ui.unit.IntOffset */
/* compiled from: IntOffset.kt */
public final class IntOffset {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final long Zero = IntOffsetKt.IntOffset(0, 0);
    private final long packedValue;

    /* renamed from: androidx.compose.ui.unit.IntOffset$Companion */
    /* compiled from: IntOffset.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getZero-nOcc-ac  reason: not valid java name */
        public final long m38596getZeronOccac() {
            return IntOffset.Zero;
        }
    }

    private /* synthetic */ IntOffset(long j) {
        this.packedValue = j;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ IntOffset m38577boximpl(long j) {
        return new IntOffset(j);
    }

    @Stable
    /* renamed from: component1-impl  reason: not valid java name */
    public static final int m38578component1impl(long j) {
        return m38586getXimpl(j);
    }

    @Stable
    /* renamed from: component2-impl  reason: not valid java name */
    public static final int m38579component2impl(long j) {
        return m38587getYimpl(j);
    }

    /* renamed from: copy-iSbpLlY  reason: not valid java name */
    public static final long m38581copyiSbpLlY(long j, int i, int i2) {
        return IntOffsetKt.IntOffset(i, i2);
    }

    /* renamed from: copy-iSbpLlY$default  reason: not valid java name */
    public static /* synthetic */ long m38582copyiSbpLlY$default(long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = m38586getXimpl(j);
        }
        if ((i3 & 2) != 0) {
            i2 = m38587getYimpl(j);
        }
        return m38581copyiSbpLlY(j, i, i2);
    }

    @Stable
    /* renamed from: div-Bjo55l4  reason: not valid java name */
    public static final long m38583divBjo55l4(long j, float f) {
        return IntOffsetKt.IntOffset(C13265c.m30134c(((float) m38586getXimpl(j)) / f), C13265c.m30134c(((float) m38587getYimpl(j)) / f));
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m38584equalsimpl(long j, Object obj) {
        if ((obj instanceof IntOffset) && j == ((IntOffset) obj).m38595unboximpl()) {
            return true;
        }
        return false;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m38585equalsimpl0(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    /* renamed from: getX-impl  reason: not valid java name */
    public static final int m38586getXimpl(long j) {
        return (int) (j >> 32);
    }

    /* renamed from: getY-impl  reason: not valid java name */
    public static final int m38587getYimpl(long j) {
        return (int) (j & 4294967295L);
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m38588hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    @Stable
    /* renamed from: minus-qkQi6aY  reason: not valid java name */
    public static final long m38589minusqkQi6aY(long j, long j2) {
        return IntOffsetKt.IntOffset(m38586getXimpl(j) - m38586getXimpl(j2), m38587getYimpl(j) - m38587getYimpl(j2));
    }

    @Stable
    /* renamed from: plus-qkQi6aY  reason: not valid java name */
    public static final long m38590plusqkQi6aY(long j, long j2) {
        return IntOffsetKt.IntOffset(m38586getXimpl(j) + m38586getXimpl(j2), m38587getYimpl(j) + m38587getYimpl(j2));
    }

    @Stable
    /* renamed from: rem-Bjo55l4  reason: not valid java name */
    public static final long m38591remBjo55l4(long j, int i) {
        return IntOffsetKt.IntOffset(m38586getXimpl(j) % i, m38587getYimpl(j) % i);
    }

    @Stable
    /* renamed from: times-Bjo55l4  reason: not valid java name */
    public static final long m38592timesBjo55l4(long j, float f) {
        return IntOffsetKt.IntOffset(C13265c.m30134c(((float) m38586getXimpl(j)) * f), C13265c.m30134c(((float) m38587getYimpl(j)) * f));
    }

    @Stable
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m38593toStringimpl(long j) {
        return '(' + m38586getXimpl(j) + ", " + m38587getYimpl(j) + ')';
    }

    @Stable
    /* renamed from: unaryMinus-nOcc-ac  reason: not valid java name */
    public static final long m38594unaryMinusnOccac(long j) {
        return IntOffsetKt.IntOffset(-m38586getXimpl(j), -m38587getYimpl(j));
    }

    public boolean equals(Object obj) {
        return m38584equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m38588hashCodeimpl(this.packedValue);
    }

    @Stable
    public String toString() {
        return m38593toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m38595unboximpl() {
        return this.packedValue;
    }

    public static /* synthetic */ void getPackedValue$annotations() {
    }

    @Stable
    public static /* synthetic */ void getX$annotations() {
    }

    @Stable
    public static /* synthetic */ void getY$annotations() {
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m38580constructorimpl(long j) {
        return j;
    }
}
