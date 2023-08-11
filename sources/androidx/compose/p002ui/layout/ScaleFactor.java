package androidx.compose.p002ui.layout;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.C12763h;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Immutable
@SourceDebugExtension({"SMAP\nScaleFactor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScaleFactor.kt\nandroidx/compose/ui/layout/ScaleFactor\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,197:1\n34#2:198\n41#2:199\n*S KotlinDebug\n*F\n+ 1 ScaleFactor.kt\nandroidx/compose/ui/layout/ScaleFactor\n*L\n51#1:198\n65#1:199\n*E\n"})
/* renamed from: androidx.compose.ui.layout.ScaleFactor */
/* compiled from: ScaleFactor.kt */
public final class ScaleFactor {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final long Unspecified = ScaleFactorKt.ScaleFactor(Float.NaN, Float.NaN);
    private final long packedValue;

    private /* synthetic */ ScaleFactor(long j) {
        this.packedValue = j;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ ScaleFactor m37416boximpl(long j) {
        return new ScaleFactor(j);
    }

    @Stable
    /* renamed from: component1-impl  reason: not valid java name */
    public static final float m37417component1impl(long j) {
        return m37425getScaleXimpl(j);
    }

    @Stable
    /* renamed from: component2-impl  reason: not valid java name */
    public static final float m37418component2impl(long j) {
        return m37426getScaleYimpl(j);
    }

    /* renamed from: copy-8GGzs04  reason: not valid java name */
    public static final long m37420copy8GGzs04(long j, float f, float f2) {
        return ScaleFactorKt.ScaleFactor(f, f2);
    }

    /* renamed from: copy-8GGzs04$default  reason: not valid java name */
    public static /* synthetic */ long m37421copy8GGzs04$default(long j, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = m37425getScaleXimpl(j);
        }
        if ((i & 2) != 0) {
            f2 = m37426getScaleYimpl(j);
        }
        return m37420copy8GGzs04(j, f, f2);
    }

    @Stable
    /* renamed from: div-44nBxM0  reason: not valid java name */
    public static final long m37422div44nBxM0(long j, float f) {
        return ScaleFactorKt.ScaleFactor(m37425getScaleXimpl(j) / f, m37426getScaleYimpl(j) / f);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m37423equalsimpl(long j, Object obj) {
        if ((obj instanceof ScaleFactor) && j == ((ScaleFactor) obj).m37430unboximpl()) {
            return true;
        }
        return false;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m37424equalsimpl0(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    /* renamed from: getScaleX-impl  reason: not valid java name */
    public static final float m37425getScaleXimpl(long j) {
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
        throw new IllegalStateException("ScaleFactor is unspecified".toString());
    }

    /* renamed from: getScaleY-impl  reason: not valid java name */
    public static final float m37426getScaleYimpl(long j) {
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
        throw new IllegalStateException("ScaleFactor is unspecified".toString());
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m37427hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    @Stable
    /* renamed from: times-44nBxM0  reason: not valid java name */
    public static final long m37428times44nBxM0(long j, float f) {
        return ScaleFactorKt.ScaleFactor(m37425getScaleXimpl(j) * f, m37426getScaleYimpl(j) * f);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m37429toStringimpl(long j) {
        return "ScaleFactor(" + ScaleFactorKt.roundToTenths(m37425getScaleXimpl(j)) + ", " + ScaleFactorKt.roundToTenths(m37426getScaleYimpl(j)) + ')';
    }

    public boolean equals(Object obj) {
        return m37423equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m37427hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m37429toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m37430unboximpl() {
        return this.packedValue;
    }

    /* renamed from: androidx.compose.ui.layout.ScaleFactor$Companion */
    /* compiled from: ScaleFactor.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getUnspecified-_hLwfpc  reason: not valid java name */
        public final long m37432getUnspecified_hLwfpc() {
            return ScaleFactor.Unspecified;
        }

        @Stable
        /* renamed from: getUnspecified-_hLwfpc$annotations  reason: not valid java name */
        public static /* synthetic */ void m37431getUnspecified_hLwfpc$annotations() {
        }
    }

    public static /* synthetic */ void getPackedValue$annotations() {
    }

    @Stable
    public static /* synthetic */ void getScaleX$annotations() {
    }

    @Stable
    public static /* synthetic */ void getScaleY$annotations() {
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m37419constructorimpl(long j) {
        return j;
    }
}
