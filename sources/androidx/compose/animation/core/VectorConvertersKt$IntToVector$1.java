package androidx.compose.animation.core;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;

/* compiled from: VectorConverters.kt */
final class VectorConvertersKt$IntToVector$1 extends C12777p implements Function1<Integer, AnimationVector1D> {
    public static final VectorConvertersKt$IntToVector$1 INSTANCE = new VectorConvertersKt$IntToVector$1();

    VectorConvertersKt$IntToVector$1() {
        super(1);
    }

    public final AnimationVector1D invoke(int i) {
        return new AnimationVector1D((float) i);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }
}
