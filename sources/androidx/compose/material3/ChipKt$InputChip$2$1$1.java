package androidx.compose.material3;

import androidx.compose.p002ui.graphics.GraphicsLayerScope;
import androidx.compose.p002ui.graphics.Shape;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: Chip.kt */
final class ChipKt$InputChip$2$1$1 extends C12777p implements Function1<GraphicsLayerScope, C11921v> {
    final /* synthetic */ float $avatarOpacity;
    final /* synthetic */ Shape $avatarShape;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ChipKt$InputChip$2$1$1(float f, Shape shape) {
        super(1);
        this.$avatarOpacity = f;
        this.$avatarShape = shape;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((GraphicsLayerScope) obj);
        return C11921v.f18618a;
    }

    public final void invoke(GraphicsLayerScope graphicsLayerScope) {
        C12775o.m28639i(graphicsLayerScope, "$this$graphicsLayer");
        graphicsLayerScope.setAlpha(this.$avatarOpacity);
        graphicsLayerScope.setShape(this.$avatarShape);
        graphicsLayerScope.setClip(true);
    }
}
