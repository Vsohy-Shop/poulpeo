package androidx.compose.foundation.layout;

import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.C12775o;

@Stable
/* compiled from: WindowInsets.kt */
final class AddedInsets implements WindowInsets {
    private final WindowInsets first;
    private final WindowInsets second;

    public AddedInsets(WindowInsets windowInsets, WindowInsets windowInsets2) {
        C12775o.m28639i(windowInsets, "first");
        C12775o.m28639i(windowInsets2, "second");
        this.first = windowInsets;
        this.second = windowInsets2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddedInsets)) {
            return false;
        }
        AddedInsets addedInsets = (AddedInsets) obj;
        if (!C12775o.m28634d(addedInsets.first, this.first) || !C12775o.m28634d(addedInsets.second, this.second)) {
            return false;
        }
        return true;
    }

    public int getBottom(Density density) {
        C12775o.m28639i(density, "density");
        return this.first.getBottom(density) + this.second.getBottom(density);
    }

    public int getLeft(Density density, LayoutDirection layoutDirection) {
        C12775o.m28639i(density, "density");
        C12775o.m28639i(layoutDirection, "layoutDirection");
        return this.first.getLeft(density, layoutDirection) + this.second.getLeft(density, layoutDirection);
    }

    public int getRight(Density density, LayoutDirection layoutDirection) {
        C12775o.m28639i(density, "density");
        C12775o.m28639i(layoutDirection, "layoutDirection");
        return this.first.getRight(density, layoutDirection) + this.second.getRight(density, layoutDirection);
    }

    public int getTop(Density density) {
        C12775o.m28639i(density, "density");
        return this.first.getTop(density) + this.second.getTop(density);
    }

    public int hashCode() {
        return this.first.hashCode() + (this.second.hashCode() * 31);
    }

    public String toString() {
        return '(' + this.first + " + " + this.second + ')';
    }
}
