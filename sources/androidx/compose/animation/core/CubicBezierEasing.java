package androidx.compose.animation.core;

import androidx.compose.runtime.Immutable;

@Immutable
/* compiled from: Easing.kt */
public final class CubicBezierEasing implements Easing {

    /* renamed from: a */
    private final float f223a;

    /* renamed from: b */
    private final float f224b;

    /* renamed from: c */
    private final float f225c;

    /* renamed from: d */
    private final float f226d;

    public CubicBezierEasing(float f, float f2, float f3, float f4) {
        this.f223a = f;
        this.f224b = f2;
        this.f225c = f3;
        this.f226d = f4;
    }

    private final float evaluateCubic(float f, float f2, float f3) {
        float f4 = (float) 3;
        float f5 = ((float) 1) - f3;
        return (f * f4 * f5 * f5 * f3) + (f4 * f2 * f5 * f3 * f3) + (f3 * f3 * f3);
    }

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (!(obj instanceof CubicBezierEasing)) {
            return false;
        }
        CubicBezierEasing cubicBezierEasing = (CubicBezierEasing) obj;
        if (this.f223a == cubicBezierEasing.f223a) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        if (this.f224b == cubicBezierEasing.f224b) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            return false;
        }
        if (this.f225c == cubicBezierEasing.f225c) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3) {
            return false;
        }
        if (this.f226d == cubicBezierEasing.f226d) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f223a) * 31) + Float.hashCode(this.f224b)) * 31) + Float.hashCode(this.f225c)) * 31) + Float.hashCode(this.f226d);
    }

    public float transform(float f) {
        float f2 = 0.0f;
        if (f > 0.0f) {
            float f3 = 1.0f;
            if (f < 1.0f) {
                while (true) {
                    float f4 = (f2 + f3) / ((float) 2);
                    float evaluateCubic = evaluateCubic(this.f223a, this.f225c, f4);
                    if (Math.abs(f - evaluateCubic) < 0.001f) {
                        return evaluateCubic(this.f224b, this.f226d, f4);
                    }
                    if (evaluateCubic < f) {
                        f2 = f4;
                    } else {
                        f3 = f4;
                    }
                }
            }
        }
        return f;
    }
}
