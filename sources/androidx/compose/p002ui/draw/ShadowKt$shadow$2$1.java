package androidx.compose.p002ui.draw;

import androidx.compose.p002ui.graphics.GraphicsLayerScope;
import androidx.compose.p002ui.graphics.Shape;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* renamed from: androidx.compose.ui.draw.ShadowKt$shadow$2$1 */
/* compiled from: Shadow.kt */
final class ShadowKt$shadow$2$1 extends C12777p implements Function1<GraphicsLayerScope, C11921v> {
    final /* synthetic */ long $ambientColor;
    final /* synthetic */ boolean $clip;
    final /* synthetic */ float $elevation;
    final /* synthetic */ Shape $shape;
    final /* synthetic */ long $spotColor;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ShadowKt$shadow$2$1(float f, Shape shape, boolean z, long j, long j2) {
        super(1);
        this.$elevation = f;
        this.$shape = shape;
        this.$clip = z;
        this.$ambientColor = j;
        this.$spotColor = j2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((GraphicsLayerScope) obj);
        return C11921v.f18618a;
    }

    public final void invoke(GraphicsLayerScope graphicsLayerScope) {
        C12775o.m28639i(graphicsLayerScope, "$this$graphicsLayer");
        graphicsLayerScope.setShadowElevation(graphicsLayerScope.m38449toPx0680j_4(this.$elevation));
        graphicsLayerScope.setShape(this.$shape);
        graphicsLayerScope.setClip(this.$clip);
        graphicsLayerScope.m35856setAmbientShadowColor8_81llA(this.$ambientColor);
        graphicsLayerScope.m35858setSpotShadowColor8_81llA(this.$spotColor);
    }
}
