package androidx.compose.p002ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Immutable
@SourceDebugExtension({"SMAP\nDp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpRect\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,557:1\n51#2:558\n*S KotlinDebug\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpRect\n*L\n535#1:558\n*E\n"})
/* renamed from: androidx.compose.ui.unit.DpRect */
/* compiled from: Dp.kt */
public final class DpRect {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final float bottom;
    private final float left;
    private final float right;
    private final float top;

    /* renamed from: androidx.compose.ui.unit.DpRect$Companion */
    /* compiled from: Dp.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ DpRect(float f, float f2, float f3, float f4, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4);
    }

    /* renamed from: copy-a9UjIt4$default  reason: not valid java name */
    public static /* synthetic */ DpRect m38540copya9UjIt4$default(DpRect dpRect, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = dpRect.left;
        }
        if ((i & 2) != 0) {
            f2 = dpRect.top;
        }
        if ((i & 4) != 0) {
            f3 = dpRect.right;
        }
        if ((i & 8) != 0) {
            f4 = dpRect.bottom;
        }
        return dpRect.m38549copya9UjIt4(f, f2, f3, f4);
    }

    /* renamed from: component1-D9Ej5fM  reason: not valid java name */
    public final float m38545component1D9Ej5fM() {
        return this.left;
    }

    /* renamed from: component2-D9Ej5fM  reason: not valid java name */
    public final float m38546component2D9Ej5fM() {
        return this.top;
    }

    /* renamed from: component3-D9Ej5fM  reason: not valid java name */
    public final float m38547component3D9Ej5fM() {
        return this.right;
    }

    /* renamed from: component4-D9Ej5fM  reason: not valid java name */
    public final float m38548component4D9Ej5fM() {
        return this.bottom;
    }

    /* renamed from: copy-a9UjIt4  reason: not valid java name */
    public final DpRect m38549copya9UjIt4(float f, float f2, float f3, float f4) {
        return new DpRect(f, f2, f3, f4, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DpRect)) {
            return false;
        }
        DpRect dpRect = (DpRect) obj;
        if (C1232Dp.m38473equalsimpl0(this.left, dpRect.left) && C1232Dp.m38473equalsimpl0(this.top, dpRect.top) && C1232Dp.m38473equalsimpl0(this.right, dpRect.right) && C1232Dp.m38473equalsimpl0(this.bottom, dpRect.bottom)) {
            return true;
        }
        return false;
    }

    /* renamed from: getBottom-D9Ej5fM  reason: not valid java name */
    public final float m38550getBottomD9Ej5fM() {
        return this.bottom;
    }

    /* renamed from: getLeft-D9Ej5fM  reason: not valid java name */
    public final float m38551getLeftD9Ej5fM() {
        return this.left;
    }

    /* renamed from: getRight-D9Ej5fM  reason: not valid java name */
    public final float m38552getRightD9Ej5fM() {
        return this.right;
    }

    /* renamed from: getTop-D9Ej5fM  reason: not valid java name */
    public final float m38553getTopD9Ej5fM() {
        return this.top;
    }

    public int hashCode() {
        return (((((C1232Dp.m38474hashCodeimpl(this.left) * 31) + C1232Dp.m38474hashCodeimpl(this.top)) * 31) + C1232Dp.m38474hashCodeimpl(this.right)) * 31) + C1232Dp.m38474hashCodeimpl(this.bottom);
    }

    public String toString() {
        return "DpRect(left=" + C1232Dp.m38479toStringimpl(this.left) + ", top=" + C1232Dp.m38479toStringimpl(this.top) + ", right=" + C1232Dp.m38479toStringimpl(this.right) + ", bottom=" + C1232Dp.m38479toStringimpl(this.bottom) + ')';
    }

    public /* synthetic */ DpRect(long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2);
    }

    private DpRect(float f, float f2, float f3, float f4) {
        this.left = f;
        this.top = f2;
        this.right = f3;
        this.bottom = f4;
    }

    private DpRect(long j, long j2) {
        this(DpOffset.m38529getXD9Ej5fM(j), DpOffset.m38531getYD9Ej5fM(j), C1232Dp.m38468constructorimpl(DpOffset.m38529getXD9Ej5fM(j) + DpSize.m38566getWidthD9Ej5fM(j2)), C1232Dp.m38468constructorimpl(DpOffset.m38531getYD9Ej5fM(j) + DpSize.m38564getHeightD9Ej5fM(j2)), (DefaultConstructorMarker) null);
    }

    @Stable
    /* renamed from: getBottom-D9Ej5fM$annotations  reason: not valid java name */
    public static /* synthetic */ void m38541getBottomD9Ej5fM$annotations() {
    }

    @Stable
    /* renamed from: getLeft-D9Ej5fM$annotations  reason: not valid java name */
    public static /* synthetic */ void m38542getLeftD9Ej5fM$annotations() {
    }

    @Stable
    /* renamed from: getRight-D9Ej5fM$annotations  reason: not valid java name */
    public static /* synthetic */ void m38543getRightD9Ej5fM$annotations() {
    }

    @Stable
    /* renamed from: getTop-D9Ej5fM$annotations  reason: not valid java name */
    public static /* synthetic */ void m38544getTopD9Ej5fM$annotations() {
    }
}
