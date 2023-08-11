package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.DefaultConstructorMarker;

@StabilityInferred(parameters = 0)
/* compiled from: AnimationVectors.kt */
public final class AnimationVector1D extends AnimationVector {
    public static final int $stable = 8;
    private final int size = 1;
    private float value;

    public AnimationVector1D(float f) {
        super((DefaultConstructorMarker) null);
        this.value = f;
    }

    public boolean equals(Object obj) {
        boolean z;
        if (!(obj instanceof AnimationVector1D)) {
            return false;
        }
        if (((AnimationVector1D) obj).value == this.value) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        return false;
    }

    public float get$animation_core_release(int i) {
        if (i == 0) {
            return this.value;
        }
        return 0.0f;
    }

    public int getSize$animation_core_release() {
        return this.size;
    }

    public final float getValue() {
        return this.value;
    }

    public int hashCode() {
        return Float.hashCode(this.value);
    }

    public void reset$animation_core_release() {
        this.value = 0.0f;
    }

    public void set$animation_core_release(int i, float f) {
        if (i == 0) {
            this.value = f;
        }
    }

    public final void setValue$animation_core_release(float f) {
        this.value = f;
    }

    public String toString() {
        return "AnimationVector1D: value = " + this.value;
    }

    public AnimationVector1D newVector$animation_core_release() {
        return new AnimationVector1D(0.0f);
    }
}
