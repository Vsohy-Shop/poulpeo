package androidx.compose.animation.core;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;

/* compiled from: VectorConverters.kt */
final class VectorConvertersKt$IntToVector$2 extends C12777p implements Function1<AnimationVector1D, Integer> {
    public static final VectorConvertersKt$IntToVector$2 INSTANCE = new VectorConvertersKt$IntToVector$2();

    VectorConvertersKt$IntToVector$2() {
        super(1);
    }

    public final Integer invoke(AnimationVector1D animationVector1D) {
        C12775o.m28639i(animationVector1D, "it");
        return Integer.valueOf((int) animationVector1D.getValue());
    }
}
