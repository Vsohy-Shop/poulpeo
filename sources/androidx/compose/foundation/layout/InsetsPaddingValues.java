package androidx.compose.foundation.layout;

import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.C12775o;

@Stable
/* compiled from: WindowInsets.kt */
final class InsetsPaddingValues implements PaddingValues {
    private final Density density;
    private final WindowInsets insets;

    public InsetsPaddingValues(WindowInsets windowInsets, Density density2) {
        C12775o.m28639i(windowInsets, "insets");
        C12775o.m28639i(density2, "density");
        this.insets = windowInsets;
        this.density = density2;
    }

    /* renamed from: calculateBottomPadding-D9Ej5fM  reason: not valid java name */
    public float m33241calculateBottomPaddingD9Ej5fM() {
        Density density2 = this.density;
        return density2.m38446toDpu2uoSUM(this.insets.getBottom(density2));
    }

    /* renamed from: calculateLeftPadding-u2uoSUM  reason: not valid java name */
    public float m33242calculateLeftPaddingu2uoSUM(LayoutDirection layoutDirection) {
        C12775o.m28639i(layoutDirection, "layoutDirection");
        Density density2 = this.density;
        return density2.m38446toDpu2uoSUM(this.insets.getLeft(density2, layoutDirection));
    }

    /* renamed from: calculateRightPadding-u2uoSUM  reason: not valid java name */
    public float m33243calculateRightPaddingu2uoSUM(LayoutDirection layoutDirection) {
        C12775o.m28639i(layoutDirection, "layoutDirection");
        Density density2 = this.density;
        return density2.m38446toDpu2uoSUM(this.insets.getRight(density2, layoutDirection));
    }

    /* renamed from: calculateTopPadding-D9Ej5fM  reason: not valid java name */
    public float m33244calculateTopPaddingD9Ej5fM() {
        Density density2 = this.density;
        return density2.m38446toDpu2uoSUM(this.insets.getTop(density2));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InsetsPaddingValues)) {
            return false;
        }
        InsetsPaddingValues insetsPaddingValues = (InsetsPaddingValues) obj;
        if (!C12775o.m28634d(this.insets, insetsPaddingValues.insets) || !C12775o.m28634d(this.density, insetsPaddingValues.density)) {
            return false;
        }
        return true;
    }

    public final WindowInsets getInsets() {
        return this.insets;
    }

    public int hashCode() {
        return (this.insets.hashCode() * 31) + this.density.hashCode();
    }

    public String toString() {
        return "InsetsPaddingValues(insets=" + this.insets + ", density=" + this.density + ')';
    }
}
