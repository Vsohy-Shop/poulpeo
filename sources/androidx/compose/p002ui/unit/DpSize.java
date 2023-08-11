package androidx.compose.p002ui.unit;

import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.C12763h;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Immutable
@SourceDebugExtension({"SMAP\nDp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpSize\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,557:1\n34#2:558\n41#2:560\n174#3:559\n174#3:561\n473#3:568\n154#3:569\n58#4:562\n51#4:563\n92#4:564\n88#4:565\n75#4:566\n71#4:567\n*S KotlinDebug\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpSize\n*L\n391#1:558\n404#1:560\n391#1:559\n404#1:561\n447#1:568\n457#1:569\n418#1:562\n425#1:563\n434#1:564\n437#1:565\n440#1:566\n443#1:567\n*E\n"})
/* renamed from: androidx.compose.ui.unit.DpSize */
/* compiled from: Dp.kt */
public final class DpSize {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final long Unspecified;
    /* access modifiers changed from: private */
    public static final long Zero;
    private final long packedValue;

    /* renamed from: androidx.compose.ui.unit.DpSize$Companion */
    /* compiled from: Dp.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getUnspecified-MYxV2XQ  reason: not valid java name */
        public final long m38575getUnspecifiedMYxV2XQ() {
            return DpSize.Unspecified;
        }

        /* renamed from: getZero-MYxV2XQ  reason: not valid java name */
        public final long m38576getZeroMYxV2XQ() {
            return DpSize.Zero;
        }
    }

    static {
        float f = (float) 0;
        Zero = DpKt.m38490DpSizeYgX7TsA(C1232Dp.m38468constructorimpl(f), C1232Dp.m38468constructorimpl(f));
        C1232Dp.Companion companion = C1232Dp.Companion;
        Unspecified = DpKt.m38490DpSizeYgX7TsA(companion.m38488getUnspecifiedD9Ej5fM(), companion.m38488getUnspecifiedD9Ej5fM());
    }

    private /* synthetic */ DpSize(long j) {
        this.packedValue = j;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ DpSize m38554boximpl(long j) {
        return new DpSize(j);
    }

    @Stable
    /* renamed from: component1-D9Ej5fM  reason: not valid java name */
    public static final float m38555component1D9Ej5fM(long j) {
        return m38566getWidthD9Ej5fM(j);
    }

    @Stable
    /* renamed from: component2-D9Ej5fM  reason: not valid java name */
    public static final float m38556component2D9Ej5fM(long j) {
        return m38564getHeightD9Ej5fM(j);
    }

    /* renamed from: copy-DwJknco  reason: not valid java name */
    public static final long m38558copyDwJknco(long j, float f, float f2) {
        return DpKt.m38490DpSizeYgX7TsA(f, f2);
    }

    /* renamed from: copy-DwJknco$default  reason: not valid java name */
    public static /* synthetic */ long m38559copyDwJknco$default(long j, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = m38566getWidthD9Ej5fM(j);
        }
        if ((i & 2) != 0) {
            f2 = m38564getHeightD9Ej5fM(j);
        }
        return m38558copyDwJknco(j, f, f2);
    }

    @Stable
    /* renamed from: div-Gh9hcWk  reason: not valid java name */
    public static final long m38561divGh9hcWk(long j, int i) {
        float f = (float) i;
        return DpKt.m38490DpSizeYgX7TsA(C1232Dp.m38468constructorimpl(m38566getWidthD9Ej5fM(j) / f), C1232Dp.m38468constructorimpl(m38564getHeightD9Ej5fM(j) / f));
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m38562equalsimpl(long j, Object obj) {
        if ((obj instanceof DpSize) && j == ((DpSize) obj).m38574unboximpl()) {
            return true;
        }
        return false;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m38563equalsimpl0(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    /* renamed from: getHeight-D9Ej5fM  reason: not valid java name */
    public static final float m38564getHeightD9Ej5fM(long j) {
        boolean z;
        if (j != Unspecified) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C12763h hVar = C12763h.f20419a;
            return C1232Dp.m38468constructorimpl(Float.intBitsToFloat((int) (j & 4294967295L)));
        }
        throw new IllegalStateException("DpSize is unspecified".toString());
    }

    /* renamed from: getWidth-D9Ej5fM  reason: not valid java name */
    public static final float m38566getWidthD9Ej5fM(long j) {
        boolean z;
        if (j != Unspecified) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C12763h hVar = C12763h.f20419a;
            return C1232Dp.m38468constructorimpl(Float.intBitsToFloat((int) (j >> 32)));
        }
        throw new IllegalStateException("DpSize is unspecified".toString());
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m38568hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    @Stable
    /* renamed from: minus-e_xh8Ic  reason: not valid java name */
    public static final long m38569minuse_xh8Ic(long j, long j2) {
        return DpKt.m38490DpSizeYgX7TsA(C1232Dp.m38468constructorimpl(m38566getWidthD9Ej5fM(j) - m38566getWidthD9Ej5fM(j2)), C1232Dp.m38468constructorimpl(m38564getHeightD9Ej5fM(j) - m38564getHeightD9Ej5fM(j2)));
    }

    @Stable
    /* renamed from: plus-e_xh8Ic  reason: not valid java name */
    public static final long m38570pluse_xh8Ic(long j, long j2) {
        return DpKt.m38490DpSizeYgX7TsA(C1232Dp.m38468constructorimpl(m38566getWidthD9Ej5fM(j) + m38566getWidthD9Ej5fM(j2)), C1232Dp.m38468constructorimpl(m38564getHeightD9Ej5fM(j) + m38564getHeightD9Ej5fM(j2)));
    }

    @Stable
    /* renamed from: times-Gh9hcWk  reason: not valid java name */
    public static final long m38572timesGh9hcWk(long j, int i) {
        float f = (float) i;
        return DpKt.m38490DpSizeYgX7TsA(C1232Dp.m38468constructorimpl(m38566getWidthD9Ej5fM(j) * f), C1232Dp.m38468constructorimpl(m38564getHeightD9Ej5fM(j) * f));
    }

    @Stable
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m38573toStringimpl(long j) {
        boolean z;
        if (j != Companion.m38575getUnspecifiedMYxV2XQ()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return "DpSize.Unspecified";
        }
        return C1232Dp.m38479toStringimpl(m38566getWidthD9Ej5fM(j)) + " x " + C1232Dp.m38479toStringimpl(m38564getHeightD9Ej5fM(j));
    }

    public boolean equals(Object obj) {
        return m38562equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m38568hashCodeimpl(this.packedValue);
    }

    @Stable
    public String toString() {
        return m38573toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m38574unboximpl() {
        return this.packedValue;
    }

    @Stable
    /* renamed from: div-Gh9hcWk  reason: not valid java name */
    public static final long m38560divGh9hcWk(long j, float f) {
        return DpKt.m38490DpSizeYgX7TsA(C1232Dp.m38468constructorimpl(m38566getWidthD9Ej5fM(j) / f), C1232Dp.m38468constructorimpl(m38564getHeightD9Ej5fM(j) / f));
    }

    @Stable
    /* renamed from: times-Gh9hcWk  reason: not valid java name */
    public static final long m38571timesGh9hcWk(long j, float f) {
        return DpKt.m38490DpSizeYgX7TsA(C1232Dp.m38468constructorimpl(m38566getWidthD9Ej5fM(j) * f), C1232Dp.m38468constructorimpl(m38564getHeightD9Ej5fM(j) * f));
    }

    @Stable
    /* renamed from: getHeight-D9Ej5fM$annotations  reason: not valid java name */
    public static /* synthetic */ void m38565getHeightD9Ej5fM$annotations() {
    }

    public static /* synthetic */ void getPackedValue$annotations() {
    }

    @Stable
    /* renamed from: getWidth-D9Ej5fM$annotations  reason: not valid java name */
    public static /* synthetic */ void m38567getWidthD9Ej5fM$annotations() {
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m38557constructorimpl(long j) {
        return j;
    }
}
