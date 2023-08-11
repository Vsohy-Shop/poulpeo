package androidx.compose.p002ui.geometry;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.C12763h;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Immutable
@SourceDebugExtension({"SMAP\nOffset.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,266:1\n34#2:267\n41#2:268\n*S KotlinDebug\n*F\n+ 1 Offset.kt\nandroidx/compose/ui/geometry/Offset\n*L\n70#1:267\n80#1:268\n*E\n"})
/* renamed from: androidx.compose.ui.geometry.Offset */
/* compiled from: Offset.kt */
public final class Offset {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final long Infinite = OffsetKt.Offset(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    /* access modifiers changed from: private */
    public static final long Unspecified = OffsetKt.Offset(Float.NaN, Float.NaN);
    /* access modifiers changed from: private */
    public static final long Zero = OffsetKt.Offset(0.0f, 0.0f);
    private final long packedValue;

    private /* synthetic */ Offset(long j) {
        this.packedValue = j;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ Offset m35411boximpl(long j) {
        return new Offset(j);
    }

    @Stable
    /* renamed from: component1-impl  reason: not valid java name */
    public static final float m35412component1impl(long j) {
        return m35422getXimpl(j);
    }

    @Stable
    /* renamed from: component2-impl  reason: not valid java name */
    public static final float m35413component2impl(long j) {
        return m35423getYimpl(j);
    }

    /* renamed from: copy-dBAh8RU  reason: not valid java name */
    public static final long m35415copydBAh8RU(long j, float f, float f2) {
        return OffsetKt.Offset(f, f2);
    }

    /* renamed from: copy-dBAh8RU$default  reason: not valid java name */
    public static /* synthetic */ long m35416copydBAh8RU$default(long j, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = m35422getXimpl(j);
        }
        if ((i & 2) != 0) {
            f2 = m35423getYimpl(j);
        }
        return m35415copydBAh8RU(j, f, f2);
    }

    @Stable
    /* renamed from: div-tuRUvjQ  reason: not valid java name */
    public static final long m35417divtuRUvjQ(long j, float f) {
        return OffsetKt.Offset(m35422getXimpl(j) / f, m35423getYimpl(j) / f);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m35418equalsimpl(long j, Object obj) {
        if ((obj instanceof Offset) && j == ((Offset) obj).m35432unboximpl()) {
            return true;
        }
        return false;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m35419equalsimpl0(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    @Stable
    /* renamed from: getDistance-impl  reason: not valid java name */
    public static final float m35420getDistanceimpl(long j) {
        return (float) Math.sqrt((double) ((m35422getXimpl(j) * m35422getXimpl(j)) + (m35423getYimpl(j) * m35423getYimpl(j))));
    }

    @Stable
    /* renamed from: getDistanceSquared-impl  reason: not valid java name */
    public static final float m35421getDistanceSquaredimpl(long j) {
        return (m35422getXimpl(j) * m35422getXimpl(j)) + (m35423getYimpl(j) * m35423getYimpl(j));
    }

    /* renamed from: getX-impl  reason: not valid java name */
    public static final float m35422getXimpl(long j) {
        boolean z;
        if (j != Unspecified) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C12763h hVar = C12763h.f20419a;
            return Float.intBitsToFloat((int) (j >> 32));
        }
        throw new IllegalStateException("Offset is unspecified".toString());
    }

    /* renamed from: getY-impl  reason: not valid java name */
    public static final float m35423getYimpl(long j) {
        boolean z;
        if (j != Unspecified) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C12763h hVar = C12763h.f20419a;
            return Float.intBitsToFloat((int) (j & 4294967295L));
        }
        throw new IllegalStateException("Offset is unspecified".toString());
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m35424hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    @Stable
    /* renamed from: isValid-impl  reason: not valid java name */
    public static final boolean m35425isValidimpl(long j) {
        boolean z;
        if (Float.isNaN(m35422getXimpl(j)) || Float.isNaN(m35423getYimpl(j))) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return true;
        }
        throw new IllegalStateException("Offset argument contained a NaN value.".toString());
    }

    @Stable
    /* renamed from: minus-MK-Hz9U  reason: not valid java name */
    public static final long m35426minusMKHz9U(long j, long j2) {
        return OffsetKt.Offset(m35422getXimpl(j) - m35422getXimpl(j2), m35423getYimpl(j) - m35423getYimpl(j2));
    }

    @Stable
    /* renamed from: plus-MK-Hz9U  reason: not valid java name */
    public static final long m35427plusMKHz9U(long j, long j2) {
        return OffsetKt.Offset(m35422getXimpl(j) + m35422getXimpl(j2), m35423getYimpl(j) + m35423getYimpl(j2));
    }

    @Stable
    /* renamed from: rem-tuRUvjQ  reason: not valid java name */
    public static final long m35428remtuRUvjQ(long j, float f) {
        return OffsetKt.Offset(m35422getXimpl(j) % f, m35423getYimpl(j) % f);
    }

    @Stable
    /* renamed from: times-tuRUvjQ  reason: not valid java name */
    public static final long m35429timestuRUvjQ(long j, float f) {
        return OffsetKt.Offset(m35422getXimpl(j) * f, m35423getYimpl(j) * f);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m35430toStringimpl(long j) {
        if (!OffsetKt.m35441isSpecifiedk4lQ0M(j)) {
            return "Offset.Unspecified";
        }
        return "Offset(" + GeometryUtilsKt.toStringAsFixed(m35422getXimpl(j), 1) + ", " + GeometryUtilsKt.toStringAsFixed(m35423getYimpl(j), 1) + ')';
    }

    @Stable
    /* renamed from: unaryMinus-F1C5BW0  reason: not valid java name */
    public static final long m35431unaryMinusF1C5BW0(long j) {
        return OffsetKt.Offset(-m35422getXimpl(j), -m35423getYimpl(j));
    }

    public boolean equals(Object obj) {
        return m35418equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m35424hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m35430toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m35432unboximpl() {
        return this.packedValue;
    }

    /* renamed from: androidx.compose.ui.geometry.Offset$Companion */
    /* compiled from: Offset.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getInfinite-F1C5BW0  reason: not valid java name */
        public final long m35436getInfiniteF1C5BW0() {
            return Offset.Infinite;
        }

        /* renamed from: getUnspecified-F1C5BW0  reason: not valid java name */
        public final long m35437getUnspecifiedF1C5BW0() {
            return Offset.Unspecified;
        }

        /* renamed from: getZero-F1C5BW0  reason: not valid java name */
        public final long m35438getZeroF1C5BW0() {
            return Offset.Zero;
        }

        @Stable
        /* renamed from: getInfinite-F1C5BW0$annotations  reason: not valid java name */
        public static /* synthetic */ void m35433getInfiniteF1C5BW0$annotations() {
        }

        @Stable
        /* renamed from: getUnspecified-F1C5BW0$annotations  reason: not valid java name */
        public static /* synthetic */ void m35434getUnspecifiedF1C5BW0$annotations() {
        }

        @Stable
        /* renamed from: getZero-F1C5BW0$annotations  reason: not valid java name */
        public static /* synthetic */ void m35435getZeroF1C5BW0$annotations() {
        }
    }

    @Stable
    public static /* synthetic */ void getX$annotations() {
    }

    @Stable
    public static /* synthetic */ void getY$annotations() {
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m35414constructorimpl(long j) {
        return j;
    }
}
