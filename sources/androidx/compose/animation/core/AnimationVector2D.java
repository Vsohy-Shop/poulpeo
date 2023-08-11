package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.DefaultConstructorMarker;

@StabilityInferred(parameters = 0)
/* compiled from: AnimationVectors.kt */
public final class AnimationVector2D extends AnimationVector {
    public static final int $stable = 8;
    private final int size = 2;

    /* renamed from: v1 */
    private float f214v1;

    /* renamed from: v2 */
    private float f215v2;

    public AnimationVector2D(float f, float f2) {
        super((DefaultConstructorMarker) null);
        this.f214v1 = f;
        this.f215v2 = f2;
    }

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (!(obj instanceof AnimationVector2D)) {
            return false;
        }
        AnimationVector2D animationVector2D = (AnimationVector2D) obj;
        if (animationVector2D.f214v1 == this.f214v1) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        if (animationVector2D.f215v2 == this.f215v2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            return true;
        }
        return false;
    }

    public float get$animation_core_release(int i) {
        if (i == 0) {
            return this.f214v1;
        }
        if (i != 1) {
            return 0.0f;
        }
        return this.f215v2;
    }

    public int getSize$animation_core_release() {
        return this.size;
    }

    public final float getV1() {
        return this.f214v1;
    }

    public final float getV2() {
        return this.f215v2;
    }

    public int hashCode() {
        return (Float.hashCode(this.f214v1) * 31) + Float.hashCode(this.f215v2);
    }

    public void reset$animation_core_release() {
        this.f214v1 = 0.0f;
        this.f215v2 = 0.0f;
    }

    public void set$animation_core_release(int i, float f) {
        if (i == 0) {
            this.f214v1 = f;
        } else if (i == 1) {
            this.f215v2 = f;
        }
    }

    public final void setV1$animation_core_release(float f) {
        this.f214v1 = f;
    }

    public final void setV2$animation_core_release(float f) {
        this.f215v2 = f;
    }

    public String toString() {
        return "AnimationVector2D: v1 = " + this.f214v1 + ", v2 = " + this.f215v2;
    }

    public AnimationVector2D newVector$animation_core_release() {
        return new AnimationVector2D(0.0f, 0.0f);
    }
}
