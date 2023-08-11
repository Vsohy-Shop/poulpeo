package androidx.compose.foundation.layout;

import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.C12775o;

@Stable
/* compiled from: WindowInsets.kt */
final class ExcludeInsets implements WindowInsets {
    private final WindowInsets excluded;
    private final WindowInsets included;

    public ExcludeInsets(WindowInsets windowInsets, WindowInsets windowInsets2) {
        C12775o.m28639i(windowInsets, "included");
        C12775o.m28639i(windowInsets2, "excluded");
        this.included = windowInsets;
        this.excluded = windowInsets2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExcludeInsets)) {
            return false;
        }
        ExcludeInsets excludeInsets = (ExcludeInsets) obj;
        if (!C12775o.m28634d(excludeInsets.included, this.included) || !C12775o.m28634d(excludeInsets.excluded, this.excluded)) {
            return false;
        }
        return true;
    }

    public int getBottom(Density density) {
        C12775o.m28639i(density, "density");
        return C13537l.m30877d(this.included.getBottom(density) - this.excluded.getBottom(density), 0);
    }

    public int getLeft(Density density, LayoutDirection layoutDirection) {
        C12775o.m28639i(density, "density");
        C12775o.m28639i(layoutDirection, "layoutDirection");
        return C13537l.m30877d(this.included.getLeft(density, layoutDirection) - this.excluded.getLeft(density, layoutDirection), 0);
    }

    public int getRight(Density density, LayoutDirection layoutDirection) {
        C12775o.m28639i(density, "density");
        C12775o.m28639i(layoutDirection, "layoutDirection");
        return C13537l.m30877d(this.included.getRight(density, layoutDirection) - this.excluded.getRight(density, layoutDirection), 0);
    }

    public int getTop(Density density) {
        C12775o.m28639i(density, "density");
        return C13537l.m30877d(this.included.getTop(density) - this.excluded.getTop(density), 0);
    }

    public int hashCode() {
        return (this.included.hashCode() * 31) + this.excluded.hashCode();
    }

    public String toString() {
        return '(' + this.included + " - " + this.excluded + ')';
    }
}
