package androidx.compose.foundation.layout;

import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Immutable
@SourceDebugExtension({"SMAP\nWindowInsets.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsets.kt\nandroidx/compose/foundation/layout/FixedDpInsets\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,674:1\n1#2:675\n*E\n"})
/* compiled from: WindowInsets.kt */
final class FixedDpInsets implements WindowInsets {
    private final float bottomDp;
    private final float leftDp;
    private final float rightDp;
    private final float topDp;

    public /* synthetic */ FixedDpInsets(float f, float f2, float f3, float f4, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FixedDpInsets)) {
            return false;
        }
        FixedDpInsets fixedDpInsets = (FixedDpInsets) obj;
        if (!C1232Dp.m38473equalsimpl0(this.leftDp, fixedDpInsets.leftDp) || !C1232Dp.m38473equalsimpl0(this.topDp, fixedDpInsets.topDp) || !C1232Dp.m38473equalsimpl0(this.rightDp, fixedDpInsets.rightDp) || !C1232Dp.m38473equalsimpl0(this.bottomDp, fixedDpInsets.bottomDp)) {
            return false;
        }
        return true;
    }

    public int getBottom(Density density) {
        C12775o.m28639i(density, "density");
        return density.m38443roundToPx0680j_4(this.bottomDp);
    }

    public int getLeft(Density density, LayoutDirection layoutDirection) {
        C12775o.m28639i(density, "density");
        C12775o.m28639i(layoutDirection, "layoutDirection");
        return density.m38443roundToPx0680j_4(this.leftDp);
    }

    public int getRight(Density density, LayoutDirection layoutDirection) {
        C12775o.m28639i(density, "density");
        C12775o.m28639i(layoutDirection, "layoutDirection");
        return density.m38443roundToPx0680j_4(this.rightDp);
    }

    public int getTop(Density density) {
        C12775o.m28639i(density, "density");
        return density.m38443roundToPx0680j_4(this.topDp);
    }

    public int hashCode() {
        return (((((C1232Dp.m38474hashCodeimpl(this.leftDp) * 31) + C1232Dp.m38474hashCodeimpl(this.topDp)) * 31) + C1232Dp.m38474hashCodeimpl(this.rightDp)) * 31) + C1232Dp.m38474hashCodeimpl(this.bottomDp);
    }

    public String toString() {
        return "Insets(left=" + C1232Dp.m38479toStringimpl(this.leftDp) + ", top=" + C1232Dp.m38479toStringimpl(this.topDp) + ", right=" + C1232Dp.m38479toStringimpl(this.rightDp) + ", bottom=" + C1232Dp.m38479toStringimpl(this.bottomDp) + ')';
    }

    private FixedDpInsets(float f, float f2, float f3, float f4) {
        this.leftDp = f;
        this.topDp = f2;
        this.rightDp = f3;
        this.bottomDp = f4;
    }
}
