package androidx.compose.material;

import androidx.compose.p002ui.graphics.GraphicsLayerScope;
import androidx.compose.p002ui.graphics.TransformOrigin;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: Menu.kt */
final class MenuKt$DropdownMenuContent$1$1 extends C12777p implements Function1<GraphicsLayerScope, C11921v> {
    final /* synthetic */ State<Float> $alpha$delegate;
    final /* synthetic */ State<Float> $scale$delegate;
    final /* synthetic */ MutableState<TransformOrigin> $transformOriginState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    MenuKt$DropdownMenuContent$1$1(MutableState<TransformOrigin> mutableState, State<Float> state, State<Float> state2) {
        super(1);
        this.$transformOriginState = mutableState;
        this.$scale$delegate = state;
        this.$alpha$delegate = state2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((GraphicsLayerScope) obj);
        return C11921v.f18618a;
    }

    public final void invoke(GraphicsLayerScope graphicsLayerScope) {
        C12775o.m28639i(graphicsLayerScope, "$this$graphicsLayer");
        graphicsLayerScope.setScaleX(MenuKt.DropdownMenuContent$lambda$1(this.$scale$delegate));
        graphicsLayerScope.setScaleY(MenuKt.DropdownMenuContent$lambda$1(this.$scale$delegate));
        graphicsLayerScope.setAlpha(MenuKt.DropdownMenuContent$lambda$3(this.$alpha$delegate));
        graphicsLayerScope.m35859setTransformOrigin__ExYCQ(this.$transformOriginState.getValue().m36092unboximpl());
    }
}
