package androidx.compose.p002ui.graphics;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* renamed from: androidx.compose.ui.graphics.SimpleGraphicsLayerModifier$layerBlock$1 */
/* compiled from: GraphicsLayerModifier.kt */
final class SimpleGraphicsLayerModifier$layerBlock$1 extends C12777p implements Function1<GraphicsLayerScope, C11921v> {
    final /* synthetic */ SimpleGraphicsLayerModifier this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SimpleGraphicsLayerModifier$layerBlock$1(SimpleGraphicsLayerModifier simpleGraphicsLayerModifier) {
        super(1);
        this.this$0 = simpleGraphicsLayerModifier;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((GraphicsLayerScope) obj);
        return C11921v.f18618a;
    }

    public final void invoke(GraphicsLayerScope graphicsLayerScope) {
        C12775o.m28639i(graphicsLayerScope, "$this$null");
        graphicsLayerScope.setScaleX(this.this$0.getScaleX());
        graphicsLayerScope.setScaleY(this.this$0.getScaleY());
        graphicsLayerScope.setAlpha(this.this$0.getAlpha());
        graphicsLayerScope.setTranslationX(this.this$0.getTranslationX());
        graphicsLayerScope.setTranslationY(this.this$0.getTranslationY());
        graphicsLayerScope.setShadowElevation(this.this$0.getShadowElevation());
        graphicsLayerScope.setRotationX(this.this$0.getRotationX());
        graphicsLayerScope.setRotationY(this.this$0.getRotationY());
        graphicsLayerScope.setRotationZ(this.this$0.getRotationZ());
        graphicsLayerScope.setCameraDistance(this.this$0.getCameraDistance());
        graphicsLayerScope.m35859setTransformOrigin__ExYCQ(this.this$0.m36029getTransformOriginSzJe1aQ());
        graphicsLayerScope.setShape(this.this$0.getShape());
        graphicsLayerScope.setClip(this.this$0.getClip());
        graphicsLayerScope.setRenderEffect(this.this$0.getRenderEffect());
        graphicsLayerScope.m35856setAmbientShadowColor8_81llA(this.this$0.m36026getAmbientShadowColor0d7_KjU());
        graphicsLayerScope.m35858setSpotShadowColor8_81llA(this.this$0.m36028getSpotShadowColor0d7_KjU());
        graphicsLayerScope.m35857setCompositingStrategyaDBOjCE(this.this$0.m36027getCompositingStrategyNrFUSI());
    }
}
