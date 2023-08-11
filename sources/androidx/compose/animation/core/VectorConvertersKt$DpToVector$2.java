package androidx.compose.animation.core;

import androidx.compose.p002ui.unit.C1232Dp;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;

/* compiled from: VectorConverters.kt */
final class VectorConvertersKt$DpToVector$2 extends C12777p implements Function1<AnimationVector1D, C1232Dp> {
    public static final VectorConvertersKt$DpToVector$2 INSTANCE = new VectorConvertersKt$DpToVector$2();

    VectorConvertersKt$DpToVector$2() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return C1232Dp.m38466boximpl(m32937invokeu2uoSUM((AnimationVector1D) obj));
    }

    /* renamed from: invoke-u2uoSUM  reason: not valid java name */
    public final float m32937invokeu2uoSUM(AnimationVector1D animationVector1D) {
        C12775o.m28639i(animationVector1D, "it");
        return C1232Dp.m38468constructorimpl(animationVector1D.getValue());
    }
}
