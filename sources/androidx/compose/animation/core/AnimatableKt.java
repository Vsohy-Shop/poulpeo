package androidx.compose.animation.core;

import kotlin.jvm.internal.C12763h;

/* compiled from: Animatable.kt */
public final class AnimatableKt {
    public static final Animatable<Float, AnimationVector1D> Animatable(float f, float f2) {
        return new Animatable<>(Float.valueOf(f), VectorConvertersKt.getVectorConverter(C12763h.f20419a), Float.valueOf(f2));
    }

    public static /* synthetic */ Animatable Animatable$default(float f, float f2, int i, Object obj) {
        if ((i & 2) != 0) {
            f2 = 0.01f;
        }
        return Animatable(f, f2);
    }
}
