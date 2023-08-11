package androidx.compose.animation;

import androidx.compose.p002ui.graphics.GraphicsLayerScope;
import androidx.compose.runtime.State;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: Crossfade.kt */
final class CrossfadeKt$Crossfade$4$1$1$1 extends C12777p implements Function1<GraphicsLayerScope, C11921v> {
    final /* synthetic */ State<Float> $alpha$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CrossfadeKt$Crossfade$4$1$1$1(State<Float> state) {
        super(1);
        this.$alpha$delegate = state;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((GraphicsLayerScope) obj);
        return C11921v.f18618a;
    }

    public final void invoke(GraphicsLayerScope graphicsLayerScope) {
        C12775o.m28639i(graphicsLayerScope, "$this$graphicsLayer");
        graphicsLayerScope.setAlpha(CrossfadeKt$Crossfade$4$1.m32831invoke$lambda1(this.$alpha$delegate));
    }
}
