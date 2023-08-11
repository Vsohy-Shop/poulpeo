package androidx.compose.p002ui.geometry;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.C12763h;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Immutable
@SourceDebugExtension({"SMAP\nCornerRadius.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadius\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,164:1\n34#2:165\n41#2:166\n*S KotlinDebug\n*F\n+ 1 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadius\n*L\n49#1:165\n53#1:166\n*E\n"})
/* renamed from: androidx.compose.ui.geometry.CornerRadius */
/* compiled from: CornerRadius.kt */
public final class CornerRadius {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final long Zero = CornerRadiusKt.CornerRadius$default(0.0f, 0.0f, 2, (Object) null);
    private final long packedValue;

    private /* synthetic */ CornerRadius(long j) {
        this.packedValue = j;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ CornerRadius m35388boximpl(long j) {
        return new CornerRadius(j);
    }

    @Stable
    /* renamed from: component1-impl  reason: not valid java name */
    public static final float m35389component1impl(long j) {
        return m35397getXimpl(j);
    }

    @Stable
    /* renamed from: component2-impl  reason: not valid java name */
    public static final float m35390component2impl(long j) {
        return m35398getYimpl(j);
    }

    /* renamed from: copy-OHQCggk  reason: not valid java name */
    public static final long m35392copyOHQCggk(long j, float f, float f2) {
        return CornerRadiusKt.CornerRadius(f, f2);
    }

    /* renamed from: copy-OHQCggk$default  reason: not valid java name */
    public static /* synthetic */ long m35393copyOHQCggk$default(long j, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = m35397getXimpl(j);
        }
        if ((i & 2) != 0) {
            f2 = m35398getYimpl(j);
        }
        return m35392copyOHQCggk(j, f, f2);
    }

    @Stable
    /* renamed from: div-Bz7bX_o  reason: not valid java name */
    public static final long m35394divBz7bX_o(long j, float f) {
        return CornerRadiusKt.CornerRadius(m35397getXimpl(j) / f, m35398getYimpl(j) / f);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m35395equalsimpl(long j, Object obj) {
        if ((obj instanceof CornerRadius) && j == ((CornerRadius) obj).m35405unboximpl()) {
            return true;
        }
        return false;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m35396equalsimpl0(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    /* renamed from: getX-impl  reason: not valid java name */
    public static final float m35397getXimpl(long j) {
        C12763h hVar = C12763h.f20419a;
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* renamed from: getY-impl  reason: not valid java name */
    public static final float m35398getYimpl(long j) {
        C12763h hVar = C12763h.f20419a;
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m35399hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    @Stable
    /* renamed from: minus-vF7b-mM  reason: not valid java name */
    public static final long m35400minusvF7bmM(long j, long j2) {
        return CornerRadiusKt.CornerRadius(m35397getXimpl(j) - m35397getXimpl(j2), m35398getYimpl(j) - m35398getYimpl(j2));
    }

    @Stable
    /* renamed from: plus-vF7b-mM  reason: not valid java name */
    public static final long m35401plusvF7bmM(long j, long j2) {
        return CornerRadiusKt.CornerRadius(m35397getXimpl(j) + m35397getXimpl(j2), m35398getYimpl(j) + m35398getYimpl(j2));
    }

    @Stable
    /* renamed from: times-Bz7bX_o  reason: not valid java name */
    public static final long m35402timesBz7bX_o(long j, float f) {
        return CornerRadiusKt.CornerRadius(m35397getXimpl(j) * f, m35398getYimpl(j) * f);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m35403toStringimpl(long j) {
        boolean z;
        if (m35397getXimpl(j) == m35398getYimpl(j)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "CornerRadius.circular(" + GeometryUtilsKt.toStringAsFixed(m35397getXimpl(j), 1) + ')';
        }
        return "CornerRadius.elliptical(" + GeometryUtilsKt.toStringAsFixed(m35397getXimpl(j), 1) + ", " + GeometryUtilsKt.toStringAsFixed(m35398getYimpl(j), 1) + ')';
    }

    @Stable
    /* renamed from: unaryMinus-kKHJgLs  reason: not valid java name */
    public static final long m35404unaryMinuskKHJgLs(long j) {
        return CornerRadiusKt.CornerRadius(-m35397getXimpl(j), -m35398getYimpl(j));
    }

    public boolean equals(Object obj) {
        return m35395equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m35399hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m35403toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m35405unboximpl() {
        return this.packedValue;
    }

    /* renamed from: androidx.compose.ui.geometry.CornerRadius$Companion */
    /* compiled from: CornerRadius.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getZero-kKHJgLs  reason: not valid java name */
        public final long m35407getZerokKHJgLs() {
            return CornerRadius.Zero;
        }

        @Stable
        /* renamed from: getZero-kKHJgLs$annotations  reason: not valid java name */
        public static /* synthetic */ void m35406getZerokKHJgLs$annotations() {
        }
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
    public static long m35391constructorimpl(long j) {
        return j;
    }
}
