package androidx.compose.animation.core;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: VectorizedAnimationSpec.kt */
public final class VectorizedAnimationSpecKt$createSpringAnimations$2 implements Animations {
    private final FloatSpringSpec anim;

    VectorizedAnimationSpecKt$createSpringAnimations$2(float f, float f2) {
        this.anim = new FloatSpringSpec(f, f2, 0.0f, 4, (DefaultConstructorMarker) null);
    }

    public FloatSpringSpec get(int i) {
        return this.anim;
    }
}
