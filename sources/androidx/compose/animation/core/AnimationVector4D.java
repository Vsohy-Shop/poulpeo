package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.DefaultConstructorMarker;

@StabilityInferred(parameters = 0)
/* compiled from: AnimationVectors.kt */
public final class AnimationVector4D extends AnimationVector {
    public static final int $stable = 8;
    private final int size = 4;

    /* renamed from: v1 */
    private float f219v1;

    /* renamed from: v2 */
    private float f220v2;

    /* renamed from: v3 */
    private float f221v3;

    /* renamed from: v4 */
    private float f222v4;

    public AnimationVector4D(float f, float f2, float f3, float f4) {
        super((DefaultConstructorMarker) null);
        this.f219v1 = f;
        this.f220v2 = f2;
        this.f221v3 = f3;
        this.f222v4 = f4;
    }

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (!(obj instanceof AnimationVector4D)) {
            return false;
        }
        AnimationVector4D animationVector4D = (AnimationVector4D) obj;
        if (animationVector4D.f219v1 == this.f219v1) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        if (animationVector4D.f220v2 == this.f220v2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            return false;
        }
        if (animationVector4D.f221v3 == this.f221v3) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3) {
            return false;
        }
        if (animationVector4D.f222v4 == this.f222v4) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            return true;
        }
        return false;
    }

    public float get$animation_core_release(int i) {
        if (i == 0) {
            return this.f219v1;
        }
        if (i == 1) {
            return this.f220v2;
        }
        if (i == 2) {
            return this.f221v3;
        }
        if (i != 3) {
            return 0.0f;
        }
        return this.f222v4;
    }

    public int getSize$animation_core_release() {
        return this.size;
    }

    public final float getV1() {
        return this.f219v1;
    }

    public final float getV2() {
        return this.f220v2;
    }

    public final float getV3() {
        return this.f221v3;
    }

    public final float getV4() {
        return this.f222v4;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f219v1) * 31) + Float.hashCode(this.f220v2)) * 31) + Float.hashCode(this.f221v3)) * 31) + Float.hashCode(this.f222v4);
    }

    public void reset$animation_core_release() {
        this.f219v1 = 0.0f;
        this.f220v2 = 0.0f;
        this.f221v3 = 0.0f;
        this.f222v4 = 0.0f;
    }

    public void set$animation_core_release(int i, float f) {
        if (i == 0) {
            this.f219v1 = f;
        } else if (i == 1) {
            this.f220v2 = f;
        } else if (i == 2) {
            this.f221v3 = f;
        } else if (i == 3) {
            this.f222v4 = f;
        }
    }

    public final void setV1$animation_core_release(float f) {
        this.f219v1 = f;
    }

    public final void setV2$animation_core_release(float f) {
        this.f220v2 = f;
    }

    public final void setV3$animation_core_release(float f) {
        this.f221v3 = f;
    }

    public final void setV4$animation_core_release(float f) {
        this.f222v4 = f;
    }

    public String toString() {
        return "AnimationVector4D: v1 = " + this.f219v1 + ", v2 = " + this.f220v2 + ", v3 = " + this.f221v3 + ", v4 = " + this.f222v4;
    }

    public AnimationVector4D newVector$animation_core_release() {
        return new AnimationVector4D(0.0f, 0.0f, 0.0f, 0.0f);
    }
}
