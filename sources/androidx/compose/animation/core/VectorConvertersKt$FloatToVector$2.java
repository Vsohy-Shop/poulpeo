package androidx.compose.animation.core;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;

/* compiled from: VectorConverters.kt */
final class VectorConvertersKt$FloatToVector$2 extends C12777p implements Function1<AnimationVector1D, Float> {
    public static final VectorConvertersKt$FloatToVector$2 INSTANCE = new VectorConvertersKt$FloatToVector$2();

    VectorConvertersKt$FloatToVector$2() {
        super(1);
    }

    public final Float invoke(AnimationVector1D animationVector1D) {
        C12775o.m28639i(animationVector1D, "it");
        return Float.valueOf(animationVector1D.getValue());
    }
}
