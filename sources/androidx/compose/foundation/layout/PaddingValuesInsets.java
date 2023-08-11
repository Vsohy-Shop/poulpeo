package androidx.compose.foundation.layout;

import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.C12775o;

@Stable
/* compiled from: WindowInsets.kt */
final class PaddingValuesInsets implements WindowInsets {
    private final PaddingValues paddingValues;

    public PaddingValuesInsets(PaddingValues paddingValues2) {
        C12775o.m28639i(paddingValues2, "paddingValues");
        this.paddingValues = paddingValues2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaddingValuesInsets)) {
            return false;
        }
        return C12775o.m28634d(((PaddingValuesInsets) obj).paddingValues, this.paddingValues);
    }

    public int getBottom(Density density) {
        C12775o.m28639i(density, "density");
        return density.m38443roundToPx0680j_4(this.paddingValues.m33278calculateBottomPaddingD9Ej5fM());
    }

    public int getLeft(Density density, LayoutDirection layoutDirection) {
        C12775o.m28639i(density, "density");
        C12775o.m28639i(layoutDirection, "layoutDirection");
        return density.m38443roundToPx0680j_4(this.paddingValues.m33279calculateLeftPaddingu2uoSUM(layoutDirection));
    }

    public int getRight(Density density, LayoutDirection layoutDirection) {
        C12775o.m28639i(density, "density");
        C12775o.m28639i(layoutDirection, "layoutDirection");
        return density.m38443roundToPx0680j_4(this.paddingValues.m33280calculateRightPaddingu2uoSUM(layoutDirection));
    }

    public int getTop(Density density) {
        C12775o.m28639i(density, "density");
        return density.m38443roundToPx0680j_4(this.paddingValues.m33281calculateTopPaddingD9Ej5fM());
    }

    public int hashCode() {
        return this.paddingValues.hashCode();
    }

    public String toString() {
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
        float r1 = this.paddingValues.m33279calculateLeftPaddingu2uoSUM(layoutDirection);
        float r2 = this.paddingValues.m33281calculateTopPaddingD9Ej5fM();
        float r0 = this.paddingValues.m33280calculateRightPaddingu2uoSUM(layoutDirection);
        float r3 = this.paddingValues.m33278calculateBottomPaddingD9Ej5fM();
        return "PaddingValues(" + C1232Dp.m38479toStringimpl(r1) + ", " + C1232Dp.m38479toStringimpl(r2) + ", " + C1232Dp.m38479toStringimpl(r0) + ", " + C1232Dp.m38479toStringimpl(r3) + ')';
    }
}
