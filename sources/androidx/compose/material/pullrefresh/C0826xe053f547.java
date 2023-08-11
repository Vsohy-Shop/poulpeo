package androidx.compose.material.pullrefresh;

import androidx.compose.animation.core.EasingKt;
import androidx.compose.p002ui.geometry.Size;
import androidx.compose.p002ui.graphics.GraphicsLayerScope;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* renamed from: androidx.compose.material.pullrefresh.PullRefreshIndicatorTransformKt$pullRefreshIndicatorTransform$2$2 */
/* compiled from: PullRefreshIndicatorTransform.kt */
final class C0826xe053f547 extends C12777p implements Function1<GraphicsLayerScope, C11921v> {
    final /* synthetic */ boolean $scale;
    final /* synthetic */ PullRefreshState $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0826xe053f547(PullRefreshState pullRefreshState, boolean z) {
        super(1);
        this.$state = pullRefreshState;
        this.$scale = z;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((GraphicsLayerScope) obj);
        return C11921v.f18618a;
    }

    public final void invoke(GraphicsLayerScope graphicsLayerScope) {
        C12775o.m28639i(graphicsLayerScope, "$this$graphicsLayer");
        graphicsLayerScope.setTranslationY(this.$state.getPosition$material_release() - Size.m35488getHeightimpl(graphicsLayerScope.m35853getSizeNHjbRc()));
        if (this.$scale && !this.$state.getRefreshing$material_release()) {
            float l = C13537l.m30885l(EasingKt.getLinearOutSlowInEasing().transform(this.$state.getPosition$material_release() / this.$state.getThreshold$material_release()), 0.0f, 1.0f);
            graphicsLayerScope.setScaleX(l);
            graphicsLayerScope.setScaleY(l);
        }
    }
}
