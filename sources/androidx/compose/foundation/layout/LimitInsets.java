package androidx.compose.foundation.layout;

import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Stable
/* compiled from: WindowInsets.kt */
final class LimitInsets implements WindowInsets {
    private final WindowInsets insets;
    private final int sides;

    public /* synthetic */ LimitInsets(WindowInsets windowInsets, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(windowInsets, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LimitInsets)) {
            return false;
        }
        LimitInsets limitInsets = (LimitInsets) obj;
        if (!C12775o.m28634d(this.insets, limitInsets.insets) || !WindowInsetsSides.m33369equalsimpl0(this.sides, limitInsets.sides)) {
            return false;
        }
        return true;
    }

    public int getBottom(Density density) {
        C12775o.m28639i(density, "density");
        if (WindowInsetsSides.m33370hasAnybkgdKaI$foundation_layout_release(this.sides, WindowInsetsSides.Companion.m33380getBottomJoeWqyM())) {
            return this.insets.getBottom(density);
        }
        return 0;
    }

    public final WindowInsets getInsets() {
        return this.insets;
    }

    public int getLeft(Density density, LayoutDirection layoutDirection) {
        int i;
        C12775o.m28639i(density, "density");
        C12775o.m28639i(layoutDirection, "layoutDirection");
        if (layoutDirection == LayoutDirection.Ltr) {
            i = WindowInsetsSides.Companion.m33376getAllowLeftInLtrJoeWqyM$foundation_layout_release();
        } else {
            i = WindowInsetsSides.Companion.m33377getAllowLeftInRtlJoeWqyM$foundation_layout_release();
        }
        if (WindowInsetsSides.m33370hasAnybkgdKaI$foundation_layout_release(this.sides, i)) {
            return this.insets.getLeft(density, layoutDirection);
        }
        return 0;
    }

    public int getRight(Density density, LayoutDirection layoutDirection) {
        int i;
        C12775o.m28639i(density, "density");
        C12775o.m28639i(layoutDirection, "layoutDirection");
        if (layoutDirection == LayoutDirection.Ltr) {
            i = WindowInsetsSides.Companion.m33378getAllowRightInLtrJoeWqyM$foundation_layout_release();
        } else {
            i = WindowInsetsSides.Companion.m33379getAllowRightInRtlJoeWqyM$foundation_layout_release();
        }
        if (WindowInsetsSides.m33370hasAnybkgdKaI$foundation_layout_release(this.sides, i)) {
            return this.insets.getRight(density, layoutDirection);
        }
        return 0;
    }

    /* renamed from: getSides-JoeWqyM  reason: not valid java name */
    public final int m33247getSidesJoeWqyM() {
        return this.sides;
    }

    public int getTop(Density density) {
        C12775o.m28639i(density, "density");
        if (WindowInsetsSides.m33370hasAnybkgdKaI$foundation_layout_release(this.sides, WindowInsetsSides.Companion.m33386getTopJoeWqyM())) {
            return this.insets.getTop(density);
        }
        return 0;
    }

    public int hashCode() {
        return (this.insets.hashCode() * 31) + WindowInsetsSides.m33371hashCodeimpl(this.sides);
    }

    public String toString() {
        return '(' + this.insets + " only " + WindowInsetsSides.m33373toStringimpl(this.sides) + ')';
    }

    private LimitInsets(WindowInsets windowInsets, int i) {
        this.insets = windowInsets;
        this.sides = i;
    }
}
