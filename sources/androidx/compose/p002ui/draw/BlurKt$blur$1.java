package androidx.compose.p002ui.draw;

import androidx.compose.p002ui.graphics.GraphicsLayerScope;
import androidx.compose.p002ui.graphics.RectangleShapeKt;
import androidx.compose.p002ui.graphics.RenderEffectKt;
import androidx.compose.p002ui.graphics.Shape;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* renamed from: androidx.compose.ui.draw.BlurKt$blur$1 */
/* compiled from: Blur.kt */
final class BlurKt$blur$1 extends C12777p implements Function1<GraphicsLayerScope, C11921v> {
    final /* synthetic */ boolean $clip;
    final /* synthetic */ Shape $edgeTreatment;
    final /* synthetic */ float $radiusX;
    final /* synthetic */ float $radiusY;
    final /* synthetic */ int $tileMode;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BlurKt$blur$1(float f, float f2, int i, Shape shape, boolean z) {
        super(1);
        this.$radiusX = f;
        this.$radiusY = f2;
        this.$tileMode = i;
        this.$edgeTreatment = shape;
        this.$clip = z;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((GraphicsLayerScope) obj);
        return C11921v.f18618a;
    }

    public final void invoke(GraphicsLayerScope graphicsLayerScope) {
        C12775o.m28639i(graphicsLayerScope, "$this$graphicsLayer");
        float r0 = graphicsLayerScope.m38449toPx0680j_4(this.$radiusX);
        float r1 = graphicsLayerScope.m38449toPx0680j_4(this.$radiusY);
        graphicsLayerScope.setRenderEffect((r0 <= 0.0f || r1 <= 0.0f) ? null : RenderEffectKt.m35995BlurEffect3YTHUZs(r0, r1, this.$tileMode));
        Shape shape = this.$edgeTreatment;
        if (shape == null) {
            shape = RectangleShapeKt.getRectangleShape();
        }
        graphicsLayerScope.setShape(shape);
        graphicsLayerScope.setClip(this.$clip);
    }
}
