package androidx.compose.p002ui.graphics;

import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.layout.Measurable;
import androidx.compose.p002ui.layout.MeasureResult;
import androidx.compose.p002ui.layout.MeasureScope;
import androidx.compose.p002ui.layout.Placeable;
import androidx.compose.p002ui.node.LayoutModifierNode;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;

/* renamed from: androidx.compose.ui.graphics.BlockGraphicsLayerModifier */
/* compiled from: GraphicsLayerModifier.kt */
final class BlockGraphicsLayerModifier extends Modifier.Node implements LayoutModifierNode {
    private Function1<? super GraphicsLayerScope, C11921v> layerBlock;

    public BlockGraphicsLayerModifier(Function1<? super GraphicsLayerScope, C11921v> function1) {
        C12775o.m28639i(function1, "layerBlock");
        this.layerBlock = function1;
    }

    public final Function1<GraphicsLayerScope, C11921v> getLayerBlock() {
        return this.layerBlock;
    }

    /* renamed from: measure-3p2s80s  reason: not valid java name */
    public MeasureResult m35607measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        C12775o.m28639i(measureScope, "$this$measure");
        C12775o.m28639i(measurable, "measurable");
        Placeable r9 = measurable.m37365measureBRTryo0(j);
        return MeasureScope.layout$default(measureScope, r9.getWidth(), r9.getHeight(), (Map) null, new BlockGraphicsLayerModifier$measure$1(r9, this), 4, (Object) null);
    }

    public final void setLayerBlock(Function1<? super GraphicsLayerScope, C11921v> function1) {
        C12775o.m28639i(function1, "<set-?>");
        this.layerBlock = function1;
    }

    public String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.layerBlock + ')';
    }
}
