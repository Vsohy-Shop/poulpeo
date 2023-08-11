package androidx.compose.material.ripple;

import androidx.compose.runtime.Immutable;

@Immutable
/* compiled from: RippleTheme.kt */
public final class RippleAlpha {
    public static final int $stable = 0;
    private final float draggedAlpha;
    private final float focusedAlpha;
    private final float hoveredAlpha;
    private final float pressedAlpha;

    public RippleAlpha(float f, float f2, float f3, float f4) {
        this.draggedAlpha = f;
        this.focusedAlpha = f2;
        this.hoveredAlpha = f3;
        this.pressedAlpha = f4;
    }

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RippleAlpha)) {
            return false;
        }
        RippleAlpha rippleAlpha = (RippleAlpha) obj;
        if (this.draggedAlpha == rippleAlpha.draggedAlpha) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        if (this.focusedAlpha == rippleAlpha.focusedAlpha) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            return false;
        }
        if (this.hoveredAlpha == rippleAlpha.hoveredAlpha) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3) {
            return false;
        }
        if (this.pressedAlpha == rippleAlpha.pressedAlpha) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            return false;
        }
        return true;
    }

    public final float getDraggedAlpha() {
        return this.draggedAlpha;
    }

    public final float getFocusedAlpha() {
        return this.focusedAlpha;
    }

    public final float getHoveredAlpha() {
        return this.hoveredAlpha;
    }

    public final float getPressedAlpha() {
        return this.pressedAlpha;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.draggedAlpha) * 31) + Float.hashCode(this.focusedAlpha)) * 31) + Float.hashCode(this.hoveredAlpha)) * 31) + Float.hashCode(this.pressedAlpha);
    }

    public String toString() {
        return "RippleAlpha(draggedAlpha=" + this.draggedAlpha + ", focusedAlpha=" + this.focusedAlpha + ", hoveredAlpha=" + this.hoveredAlpha + ", pressedAlpha=" + this.pressedAlpha + ')';
    }
}
