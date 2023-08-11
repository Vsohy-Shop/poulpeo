package androidx.compose.p002ui.geometry;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.C12763h;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Immutable
@SourceDebugExtension({"SMAP\nSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,225:1\n34#2:226\n41#2:227\n152#3:228\n*S KotlinDebug\n*F\n+ 1 Size.kt\nandroidx/compose/ui/geometry/Size\n*L\n51#1:226\n61#1:227\n138#1:228\n*E\n"})
/* renamed from: androidx.compose.ui.geometry.Size */
/* compiled from: Size.kt */
public final class Size {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final long Unspecified = SizeKt.Size(Float.NaN, Float.NaN);
    /* access modifiers changed from: private */
    public static final long Zero = SizeKt.Size(0.0f, 0.0f);
    private final long packedValue;

    private /* synthetic */ Size(long j) {
        this.packedValue = j;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ Size m35479boximpl(long j) {
        return new Size(j);
    }

    @Stable
    /* renamed from: component1-impl  reason: not valid java name */
    public static final float m35480component1impl(long j) {
        return m35491getWidthimpl(j);
    }

    @Stable
    /* renamed from: component2-impl  reason: not valid java name */
    public static final float m35481component2impl(long j) {
        return m35488getHeightimpl(j);
    }

    /* renamed from: copy-xjbvk4A  reason: not valid java name */
    public static final long m35483copyxjbvk4A(long j, float f, float f2) {
        return SizeKt.Size(f, f2);
    }

    /* renamed from: copy-xjbvk4A$default  reason: not valid java name */
    public static /* synthetic */ long m35484copyxjbvk4A$default(long j, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = m35491getWidthimpl(j);
        }
        if ((i & 2) != 0) {
            f2 = m35488getHeightimpl(j);
        }
        return m35483copyxjbvk4A(j, f, f2);
    }

    @Stable
    /* renamed from: div-7Ah8Wj8  reason: not valid java name */
    public static final long m35485div7Ah8Wj8(long j, float f) {
        return SizeKt.Size(m35491getWidthimpl(j) / f, m35488getHeightimpl(j) / f);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m35486equalsimpl(long j, Object obj) {
        if ((obj instanceof Size) && j == ((Size) obj).m35496unboximpl()) {
            return true;
        }
        return false;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m35487equalsimpl0(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    /* renamed from: getHeight-impl  reason: not valid java name */
    public static final float m35488getHeightimpl(long j) {
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
        throw new IllegalStateException("Size is unspecified".toString());
    }

    /* renamed from: getMaxDimension-impl  reason: not valid java name */
    public static final float m35489getMaxDimensionimpl(long j) {
        return Math.max(Math.abs(m35491getWidthimpl(j)), Math.abs(m35488getHeightimpl(j)));
    }

    /* renamed from: getMinDimension-impl  reason: not valid java name */
    public static final float m35490getMinDimensionimpl(long j) {
        return Math.min(Math.abs(m35491getWidthimpl(j)), Math.abs(m35488getHeightimpl(j)));
    }

    /* renamed from: getWidth-impl  reason: not valid java name */
    public static final float m35491getWidthimpl(long j) {
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
        throw new IllegalStateException("Size is unspecified".toString());
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m35492hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    @Stable
    /* renamed from: isEmpty-impl  reason: not valid java name */
    public static final boolean m35493isEmptyimpl(long j) {
        if (m35491getWidthimpl(j) <= 0.0f || m35488getHeightimpl(j) <= 0.0f) {
            return true;
        }
        return false;
    }

    @Stable
    /* renamed from: times-7Ah8Wj8  reason: not valid java name */
    public static final long m35494times7Ah8Wj8(long j, float f) {
        return SizeKt.Size(m35491getWidthimpl(j) * f, m35488getHeightimpl(j) * f);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m35495toStringimpl(long j) {
        boolean z;
        if (j != Companion.m35499getUnspecifiedNHjbRc()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return "Size.Unspecified";
        }
        return "Size(" + GeometryUtilsKt.toStringAsFixed(m35491getWidthimpl(j), 1) + ", " + GeometryUtilsKt.toStringAsFixed(m35488getHeightimpl(j), 1) + ')';
    }

    public boolean equals(Object obj) {
        return m35486equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m35492hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m35495toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m35496unboximpl() {
        return this.packedValue;
    }

    /* renamed from: androidx.compose.ui.geometry.Size$Companion */
    /* compiled from: Size.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getUnspecified-NH-jbRc  reason: not valid java name */
        public final long m35499getUnspecifiedNHjbRc() {
            return Size.Unspecified;
        }

        /* renamed from: getZero-NH-jbRc  reason: not valid java name */
        public final long m35500getZeroNHjbRc() {
            return Size.Zero;
        }

        @Stable
        /* renamed from: getUnspecified-NH-jbRc$annotations  reason: not valid java name */
        public static /* synthetic */ void m35497getUnspecifiedNHjbRc$annotations() {
        }

        @Stable
        /* renamed from: getZero-NH-jbRc$annotations  reason: not valid java name */
        public static /* synthetic */ void m35498getZeroNHjbRc$annotations() {
        }
    }

    @Stable
    public static /* synthetic */ void getHeight$annotations() {
    }

    @Stable
    public static /* synthetic */ void getMaxDimension$annotations() {
    }

    @Stable
    public static /* synthetic */ void getMinDimension$annotations() {
    }

    public static /* synthetic */ void getPackedValue$annotations() {
    }

    @Stable
    public static /* synthetic */ void getWidth$annotations() {
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m35482constructorimpl(long j) {
        return j;
    }
}
