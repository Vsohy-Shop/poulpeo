package androidx.compose.animation;

import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.p002ui.graphics.TransformOrigin;
import androidx.compose.p002ui.graphics.TransformOriginKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;

/* compiled from: EnterExitTransition.kt */
final class EnterExitTransitionKt$TransformOriginVectorConverter$2 extends C12777p implements Function1<AnimationVector2D, TransformOrigin> {
    public static final EnterExitTransitionKt$TransformOriginVectorConverter$2 INSTANCE = new EnterExitTransitionKt$TransformOriginVectorConverter$2();

    EnterExitTransitionKt$TransformOriginVectorConverter$2() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return TransformOrigin.m36080boximpl(m32847invokeLIALnN8((AnimationVector2D) obj));
    }

    /* renamed from: invoke-LIALnN8  reason: not valid java name */
    public final long m32847invokeLIALnN8(AnimationVector2D animationVector2D) {
        C12775o.m28639i(animationVector2D, "it");
        return TransformOriginKt.TransformOrigin(animationVector2D.getV1(), animationVector2D.getV2());
    }
}
