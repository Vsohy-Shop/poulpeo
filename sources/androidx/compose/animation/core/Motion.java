package androidx.compose.animation.core;

import kotlin.jvm.internal.C12763h;

/* compiled from: SpringSimulation.kt */
public final class Motion {
    private final long packedValue;

    private /* synthetic */ Motion(long j) {
        this.packedValue = j;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ Motion m32900boximpl(long j) {
        return new Motion(j);
    }

    /* renamed from: copy-XB9eQnU  reason: not valid java name */
    public static final long m32902copyXB9eQnU(long j, float f, float f2) {
        return SpringSimulationKt.Motion(f, f2);
    }

    /* renamed from: copy-XB9eQnU$default  reason: not valid java name */
    public static /* synthetic */ long m32903copyXB9eQnU$default(long j, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = m32906getValueimpl(j);
        }
        if ((i & 2) != 0) {
            f2 = m32907getVelocityimpl(j);
        }
        return m32902copyXB9eQnU(j, f, f2);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m32904equalsimpl(long j, Object obj) {
        if ((obj instanceof Motion) && j == ((Motion) obj).m32910unboximpl()) {
            return true;
        }
        return false;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m32905equalsimpl0(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    /* renamed from: getValue-impl  reason: not valid java name */
    public static final float m32906getValueimpl(long j) {
        C12763h hVar = C12763h.f20419a;
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* renamed from: getVelocity-impl  reason: not valid java name */
    public static final float m32907getVelocityimpl(long j) {
        C12763h hVar = C12763h.f20419a;
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m32908hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m32909toStringimpl(long j) {
        return "Motion(packedValue=" + j + ')';
    }

    public boolean equals(Object obj) {
        return m32904equalsimpl(this.packedValue, obj);
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return m32908hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m32909toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m32910unboximpl() {
        return this.packedValue;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m32901constructorimpl(long j) {
        return j;
    }
}
