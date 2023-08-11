package androidx.compose.animation;

import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.p002ui.graphics.TransformOrigin;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;

/* compiled from: EnterExitTransition.kt */
final class EnterExitTransitionKt$TransformOriginVectorConverter$1 extends C12777p implements Function1<TransformOrigin, AnimationVector2D> {
    public static final EnterExitTransitionKt$TransformOriginVectorConverter$1 INSTANCE = new EnterExitTransitionKt$TransformOriginVectorConverter$1();

    EnterExitTransitionKt$TransformOriginVectorConverter$1() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return m32846invoke__ExYCQ(((TransformOrigin) obj).m36092unboximpl());
    }

    /* renamed from: invoke-__ExYCQ  reason: not valid java name */
    public final AnimationVector2D m32846invoke__ExYCQ(long j) {
        return new AnimationVector2D(TransformOrigin.m36088getPivotFractionXimpl(j), TransformOrigin.m36089getPivotFractionYimpl(j));
    }
}
