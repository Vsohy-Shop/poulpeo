package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.DefaultConstructorMarker;

@StabilityInferred(parameters = 0)
/* compiled from: AnimationVectors.kt */
public final class AnimationVector3D extends AnimationVector {
    public static final int $stable = 8;
    private final int size = 3;

    /* renamed from: v1 */
    private float f216v1;

    /* renamed from: v2 */
    private float f217v2;

    /* renamed from: v3 */
    private float f218v3;

    public AnimationVector3D(float f, float f2, float f3) {
        super((DefaultConstructorMarker) null);
        this.f216v1 = f;
        this.f217v2 = f2;
        this.f218v3 = f3;
    }

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        if (!(obj instanceof AnimationVector3D)) {
            return false;
        }
        AnimationVector3D animationVector3D = (AnimationVector3D) obj;
        if (animationVector3D.f216v1 == this.f216v1) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        if (animationVector3D.f217v2 == this.f217v2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            return false;
        }
        if (animationVector3D.f218v3 == this.f218v3) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            return true;
        }
        return false;
    }

    public float get$animation_core_release(int i) {
        if (i == 0) {
            return this.f216v1;
        }
        if (i == 1) {
            return this.f217v2;
        }
        if (i != 2) {
            return 0.0f;
        }
        return this.f218v3;
    }

    public int getSize$animation_core_release() {
        return this.size;
    }

    public final float getV1() {
        return this.f216v1;
    }

    public final float getV2() {
        return this.f217v2;
    }

    public final float getV3() {
        return this.f218v3;
    }

    public int hashCode() {
        return (((Float.hashCode(this.f216v1) * 31) + Float.hashCode(this.f217v2)) * 31) + Float.hashCode(this.f218v3);
    }

    public void reset$animation_core_release() {
        this.f216v1 = 0.0f;
        this.f217v2 = 0.0f;
        this.f218v3 = 0.0f;
    }

    public void set$animation_core_release(int i, float f) {
        if (i == 0) {
            this.f216v1 = f;
        } else if (i == 1) {
            this.f217v2 = f;
        } else if (i == 2) {
            this.f218v3 = f;
        }
    }

    public final void setV1$animation_core_release(float f) {
        this.f216v1 = f;
    }

    public final void setV2$animation_core_release(float f) {
        this.f217v2 = f;
    }

    public final void setV3$animation_core_release(float f) {
        this.f218v3 = f;
    }

    public String toString() {
        return "AnimationVector3D: v1 = " + this.f216v1 + ", v2 = " + this.f217v2 + ", v3 = " + this.f218v3;
    }

    public AnimationVector3D newVector$animation_core_release() {
        return new AnimationVector3D(0.0f, 0.0f, 0.0f);
    }
}
