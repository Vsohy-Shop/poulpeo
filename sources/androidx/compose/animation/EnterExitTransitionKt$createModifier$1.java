package androidx.compose.animation;

import androidx.compose.p002ui.graphics.GraphicsLayerScope;
import androidx.compose.p002ui.graphics.TransformOrigin;
import androidx.compose.runtime.State;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: EnterExitTransition.kt */
final class EnterExitTransitionKt$createModifier$1 extends C12777p implements Function1<GraphicsLayerScope, C11921v> {
    final /* synthetic */ State<Float> $alpha$delegate;
    final /* synthetic */ State<Float> $scale$delegate;
    final /* synthetic */ State<TransformOrigin> $transformOrigin$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    EnterExitTransitionKt$createModifier$1(State<Float> state, State<Float> state2, State<TransformOrigin> state3) {
        super(1);
        this.$alpha$delegate = state;
        this.$scale$delegate = state2;
        this.$transformOrigin$delegate = state3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((GraphicsLayerScope) obj);
        return C11921v.f18618a;
    }

    public final void invoke(GraphicsLayerScope graphicsLayerScope) {
        C12775o.m28639i(graphicsLayerScope, "$this$graphicsLayer");
        graphicsLayerScope.setAlpha(EnterExitTransitionKt.m32841createModifier$lambda8(this.$alpha$delegate));
        graphicsLayerScope.setScaleX(EnterExitTransitionKt.m32836createModifier$lambda11(this.$scale$delegate));
        graphicsLayerScope.setScaleY(EnterExitTransitionKt.m32836createModifier$lambda11(this.$scale$delegate));
        graphicsLayerScope.m35859setTransformOrigin__ExYCQ(EnterExitTransitionKt.m32837createModifier$lambda13(this.$transformOrigin$delegate));
    }
}
