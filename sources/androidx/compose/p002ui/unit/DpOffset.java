package androidx.compose.p002ui.unit;

import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.C12763h;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Immutable
@SourceDebugExtension({"SMAP\nDp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpOffset\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,557:1\n34#2:558\n41#2:560\n174#3:559\n174#3:561\n337#3:564\n154#3:565\n58#4:562\n51#4:563\n*S KotlinDebug\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpOffset\n*L\n273#1:558\n286#1:560\n273#1:559\n286#1:561\n311#1:564\n321#1:565\n300#1:562\n307#1:563\n*E\n"})
/* renamed from: androidx.compose.ui.unit.DpOffset */
/* compiled from: Dp.kt */
public final class DpOffset {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final long Unspecified;
    /* access modifiers changed from: private */
    public static final long Zero;
    private final long packedValue;

    /* renamed from: androidx.compose.ui.unit.DpOffset$Companion */
    /* compiled from: Dp.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getUnspecified-RKDOV3M  reason: not valid java name */
        public final long m38538getUnspecifiedRKDOV3M() {
            return DpOffset.Unspecified;
        }

        /* renamed from: getZero-RKDOV3M  reason: not valid java name */
        public final long m38539getZeroRKDOV3M() {
            return DpOffset.Zero;
        }
    }

    static {
        float f = (float) 0;
        Zero = DpKt.m38489DpOffsetYgX7TsA(C1232Dp.m38468constructorimpl(f), C1232Dp.m38468constructorimpl(f));
        C1232Dp.Companion companion = C1232Dp.Companion;
        Unspecified = DpKt.m38489DpOffsetYgX7TsA(companion.m38488getUnspecifiedD9Ej5fM(), companion.m38488getUnspecifiedD9Ej5fM());
    }

    private /* synthetic */ DpOffset(long j) {
        this.packedValue = j;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ DpOffset m38523boximpl(long j) {
        return new DpOffset(j);
    }

    /* renamed from: copy-tPigGR8  reason: not valid java name */
    public static final long m38525copytPigGR8(long j, float f, float f2) {
        return DpKt.m38489DpOffsetYgX7TsA(f, f2);
    }

    /* renamed from: copy-tPigGR8$default  reason: not valid java name */
    public static /* synthetic */ long m38526copytPigGR8$default(long j, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = m38529getXD9Ej5fM(j);
        }
        if ((i & 2) != 0) {
            f2 = m38531getYD9Ej5fM(j);
        }
        return m38525copytPigGR8(j, f, f2);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m38527equalsimpl(long j, Object obj) {
        if ((obj instanceof DpOffset) && j == ((DpOffset) obj).m38537unboximpl()) {
            return true;
        }
        return false;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m38528equalsimpl0(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    /* renamed from: getX-D9Ej5fM  reason: not valid java name */
    public static final float m38529getXD9Ej5fM(long j) {
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
        throw new IllegalStateException("DpOffset is unspecified".toString());
    }

    /* renamed from: getY-D9Ej5fM  reason: not valid java name */
    public static final float m38531getYD9Ej5fM(long j) {
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
        throw new IllegalStateException("DpOffset is unspecified".toString());
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m38533hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    @Stable
    /* renamed from: minus-CB-Mgk4  reason: not valid java name */
    public static final long m38534minusCBMgk4(long j, long j2) {
        return DpKt.m38489DpOffsetYgX7TsA(C1232Dp.m38468constructorimpl(m38529getXD9Ej5fM(j) - m38529getXD9Ej5fM(j2)), C1232Dp.m38468constructorimpl(m38531getYD9Ej5fM(j) - m38531getYD9Ej5fM(j2)));
    }

    @Stable
    /* renamed from: plus-CB-Mgk4  reason: not valid java name */
    public static final long m38535plusCBMgk4(long j, long j2) {
        return DpKt.m38489DpOffsetYgX7TsA(C1232Dp.m38468constructorimpl(m38529getXD9Ej5fM(j) + m38529getXD9Ej5fM(j2)), C1232Dp.m38468constructorimpl(m38531getYD9Ej5fM(j) + m38531getYD9Ej5fM(j2)));
    }

    @Stable
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m38536toStringimpl(long j) {
        boolean z;
        if (j != Companion.m38538getUnspecifiedRKDOV3M()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return "DpOffset.Unspecified";
        }
        return '(' + C1232Dp.m38479toStringimpl(m38529getXD9Ej5fM(j)) + ", " + C1232Dp.m38479toStringimpl(m38531getYD9Ej5fM(j)) + ')';
    }

    public boolean equals(Object obj) {
        return m38527equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m38533hashCodeimpl(this.packedValue);
    }

    @Stable
    public String toString() {
        return m38536toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m38537unboximpl() {
        return this.packedValue;
    }

    public static /* synthetic */ void getPackedValue$annotations() {
    }

    @Stable
    /* renamed from: getX-D9Ej5fM$annotations  reason: not valid java name */
    public static /* synthetic */ void m38530getXD9Ej5fM$annotations() {
    }

    @Stable
    /* renamed from: getY-D9Ej5fM$annotations  reason: not valid java name */
    public static /* synthetic */ void m38532getYD9Ej5fM$annotations() {
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m38524constructorimpl(long j) {
        return j;
    }
}
