package androidx.compose.p002ui.node;

import kotlin.jvm.internal.C12763h;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nHitTestResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HitTestResult.kt\nandroidx/compose/ui/node/DistanceAndInLayer\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,340:1\n34#2:341\n62#2:342\n*S KotlinDebug\n*F\n+ 1 HitTestResult.kt\nandroidx/compose/ui/node/DistanceAndInLayer\n*L\n319#1:341\n322#1:342\n*E\n"})
/* renamed from: androidx.compose.ui.node.DistanceAndInLayer */
/* compiled from: HitTestResult.kt */
final class DistanceAndInLayer {
    private final long packedValue;

    private /* synthetic */ DistanceAndInLayer(long j) {
        this.packedValue = j;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ DistanceAndInLayer m37474boximpl(long j) {
        return new DistanceAndInLayer(j);
    }

    /* renamed from: compareTo-S_HNhKs  reason: not valid java name */
    public static final int m37475compareToS_HNhKs(long j, long j2) {
        boolean r0 = m37481isInLayerimpl(j);
        if (r0 == m37481isInLayerimpl(j2)) {
            return (int) Math.signum(m37479getDistanceimpl(j) - m37479getDistanceimpl(j2));
        }
        if (r0) {
            return -1;
        }
        return 1;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m37477equalsimpl(long j, Object obj) {
        if ((obj instanceof DistanceAndInLayer) && j == ((DistanceAndInLayer) obj).m37483unboximpl()) {
            return true;
        }
        return false;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m37478equalsimpl0(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    /* renamed from: getDistance-impl  reason: not valid java name */
    public static final float m37479getDistanceimpl(long j) {
        C12763h hVar = C12763h.f20419a;
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m37480hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: isInLayer-impl  reason: not valid java name */
    public static final boolean m37481isInLayerimpl(long j) {
        if (((int) (j & 4294967295L)) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m37482toStringimpl(long j) {
        return "DistanceAndInLayer(packedValue=" + j + ')';
    }

    public boolean equals(Object obj) {
        return m37477equalsimpl(this.packedValue, obj);
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return m37480hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m37482toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m37483unboximpl() {
        return this.packedValue;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m37476constructorimpl(long j) {
        return j;
    }
}
