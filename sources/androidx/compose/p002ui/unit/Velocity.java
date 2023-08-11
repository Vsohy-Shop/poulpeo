package androidx.compose.p002ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.C12763h;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Immutable
@SourceDebugExtension({"SMAP\nVelocity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Velocity.kt\nandroidx/compose/ui/unit/Velocity\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,144:1\n34#2:145\n41#2:146\n*S KotlinDebug\n*F\n+ 1 Velocity.kt\nandroidx/compose/ui/unit/Velocity\n*L\n45#1:145\n52#1:146\n*E\n"})
/* renamed from: androidx.compose.ui.unit.Velocity */
/* compiled from: Velocity.kt */
public final class Velocity {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final long Zero = VelocityKt.Velocity(0.0f, 0.0f);
    private final long packedValue;

    private /* synthetic */ Velocity(long j) {
        this.packedValue = j;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ Velocity m38684boximpl(long j) {
        return new Velocity(j);
    }

    @Stable
    /* renamed from: component1-impl  reason: not valid java name */
    public static final float m38685component1impl(long j) {
        return m38693getXimpl(j);
    }

    @Stable
    /* renamed from: component2-impl  reason: not valid java name */
    public static final float m38686component2impl(long j) {
        return m38694getYimpl(j);
    }

    /* renamed from: copy-OhffZ5M  reason: not valid java name */
    public static final long m38688copyOhffZ5M(long j, float f, float f2) {
        return VelocityKt.Velocity(f, f2);
    }

    /* renamed from: copy-OhffZ5M$default  reason: not valid java name */
    public static /* synthetic */ long m38689copyOhffZ5M$default(long j, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = m38693getXimpl(j);
        }
        if ((i & 2) != 0) {
            f2 = m38694getYimpl(j);
        }
        return m38688copyOhffZ5M(j, f, f2);
    }

    @Stable
    /* renamed from: div-adjELrA  reason: not valid java name */
    public static final long m38690divadjELrA(long j, float f) {
        return VelocityKt.Velocity(m38693getXimpl(j) / f, m38694getYimpl(j) / f);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m38691equalsimpl(long j, Object obj) {
        if ((obj instanceof Velocity) && j == ((Velocity) obj).m38702unboximpl()) {
            return true;
        }
        return false;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m38692equalsimpl0(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    /* renamed from: getX-impl  reason: not valid java name */
    public static final float m38693getXimpl(long j) {
        C12763h hVar = C12763h.f20419a;
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* renamed from: getY-impl  reason: not valid java name */
    public static final float m38694getYimpl(long j) {
        C12763h hVar = C12763h.f20419a;
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m38695hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    @Stable
    /* renamed from: minus-AH228Gc  reason: not valid java name */
    public static final long m38696minusAH228Gc(long j, long j2) {
        return VelocityKt.Velocity(m38693getXimpl(j) - m38693getXimpl(j2), m38694getYimpl(j) - m38694getYimpl(j2));
    }

    @Stable
    /* renamed from: plus-AH228Gc  reason: not valid java name */
    public static final long m38697plusAH228Gc(long j, long j2) {
        return VelocityKt.Velocity(m38693getXimpl(j) + m38693getXimpl(j2), m38694getYimpl(j) + m38694getYimpl(j2));
    }

    @Stable
    /* renamed from: rem-adjELrA  reason: not valid java name */
    public static final long m38698remadjELrA(long j, float f) {
        return VelocityKt.Velocity(m38693getXimpl(j) % f, m38694getYimpl(j) % f);
    }

    @Stable
    /* renamed from: times-adjELrA  reason: not valid java name */
    public static final long m38699timesadjELrA(long j, float f) {
        return VelocityKt.Velocity(m38693getXimpl(j) * f, m38694getYimpl(j) * f);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m38700toStringimpl(long j) {
        return '(' + m38693getXimpl(j) + ", " + m38694getYimpl(j) + ") px/sec";
    }

    @Stable
    /* renamed from: unaryMinus-9UxMQ8M  reason: not valid java name */
    public static final long m38701unaryMinus9UxMQ8M(long j) {
        return VelocityKt.Velocity(-m38693getXimpl(j), -m38694getYimpl(j));
    }

    public boolean equals(Object obj) {
        return m38691equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m38695hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m38700toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m38702unboximpl() {
        return this.packedValue;
    }

    /* renamed from: androidx.compose.ui.unit.Velocity$Companion */
    /* compiled from: Velocity.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getZero-9UxMQ8M  reason: not valid java name */
        public final long m38704getZero9UxMQ8M() {
            return Velocity.Zero;
        }

        @Stable
        /* renamed from: getZero-9UxMQ8M$annotations  reason: not valid java name */
        public static /* synthetic */ void m38703getZero9UxMQ8M$annotations() {
        }
    }

    @Stable
    public static /* synthetic */ void getX$annotations() {
    }

    @Stable
    public static /* synthetic */ void getY$annotations() {
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m38687constructorimpl(long j) {
        return j;
    }
}
