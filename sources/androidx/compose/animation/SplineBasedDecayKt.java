package androidx.compose.animation;

import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.p002ui.unit.Density;
import kotlin.jvm.internal.C12775o;

/* compiled from: SplineBasedDecay.kt */
public final class SplineBasedDecayKt {
    private static final float EndTension = 1.0f;
    private static final float Inflection = 0.35f;

    /* renamed from: P1 */
    private static final float f212P1 = 0.175f;

    /* renamed from: P2 */
    private static final float f213P2 = 0.35000002f;
    private static final float StartTension = 0.5f;

    /* access modifiers changed from: private */
    public static final void computeSplineInfo(float[] fArr, float[] fArr2, int i) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        int i2 = i;
        float f9 = 0.0f;
        float f10 = 0.0f;
        for (int i3 = 0; i3 < i2; i3++) {
            float f11 = ((float) i3) / ((float) i2);
            float f12 = 1.0f;
            while (true) {
                f = ((f12 - f9) / 2.0f) + f9;
                f2 = 1.0f - f;
                f3 = f * 3.0f * f2;
                f4 = f * f * f;
                float f13 = (((f2 * f212P1) + (f * f213P2)) * f3) + f4;
                if (((double) Math.abs(f13 - f11)) < 1.0E-5d) {
                    break;
                } else if (f13 > f11) {
                    f12 = f;
                } else {
                    f9 = f;
                }
            }
            float f14 = 0.5f;
            fArr[i3] = (f3 * ((f2 * 0.5f) + f)) + f4;
            float f15 = 1.0f;
            while (true) {
                f5 = ((f15 - f10) / 2.0f) + f10;
                f6 = 1.0f - f5;
                f7 = f5 * 3.0f * f6;
                f8 = f5 * f5 * f5;
                float f16 = (((f6 * f14) + f5) * f7) + f8;
                if (((double) Math.abs(f16 - f11)) < 1.0E-5d) {
                    break;
                }
                if (f16 > f11) {
                    f15 = f5;
                } else {
                    f10 = f5;
                }
                f14 = 0.5f;
            }
            fArr2[i3] = (f7 * ((f6 * f212P1) + (f5 * f213P2))) + f8;
        }
        fArr2[i2] = 1.0f;
        fArr[i2] = 1.0f;
    }

    public static final <T> DecayAnimationSpec<T> splineBasedDecay(Density density) {
        C12775o.m28639i(density, "density");
        return DecayAnimationSpecKt.generateDecayAnimationSpec(new SplineBasedFloatDecayAnimationSpec(density));
    }
}
