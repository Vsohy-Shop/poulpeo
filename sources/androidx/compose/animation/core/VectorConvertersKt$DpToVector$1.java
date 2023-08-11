package androidx.compose.animation.core;

import androidx.compose.p002ui.unit.C1232Dp;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;

/* compiled from: VectorConverters.kt */
final class VectorConvertersKt$DpToVector$1 extends C12777p implements Function1<C1232Dp, AnimationVector1D> {
    public static final VectorConvertersKt$DpToVector$1 INSTANCE = new VectorConvertersKt$DpToVector$1();

    VectorConvertersKt$DpToVector$1() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return m32936invoke0680j_4(((C1232Dp) obj).m38482unboximpl());
    }

    /* renamed from: invoke-0680j_4  reason: not valid java name */
    public final AnimationVector1D m32936invoke0680j_4(float f) {
        return new AnimationVector1D(f);
    }
}
