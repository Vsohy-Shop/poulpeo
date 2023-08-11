package androidx.compose.p002ui.graphics;

import androidx.compose.p002ui.node.ModifierNodeElement;
import androidx.compose.p002ui.platform.InspectorInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;

/* renamed from: androidx.compose.ui.graphics.BlockGraphicsLayerElement */
/* compiled from: GraphicsLayerModifier.kt */
final class BlockGraphicsLayerElement extends ModifierNodeElement<BlockGraphicsLayerModifier> {
    private final Function1<GraphicsLayerScope, C11921v> block;

    public BlockGraphicsLayerElement(Function1<? super GraphicsLayerScope, C11921v> function1) {
        C12775o.m28639i(function1, "block");
        this.block = function1;
    }

    public static /* synthetic */ BlockGraphicsLayerElement copy$default(BlockGraphicsLayerElement blockGraphicsLayerElement, Function1<GraphicsLayerScope, C11921v> function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = blockGraphicsLayerElement.block;
        }
        return blockGraphicsLayerElement.copy(function1);
    }

    public final Function1<GraphicsLayerScope, C11921v> component1() {
        return this.block;
    }

    public final BlockGraphicsLayerElement copy(Function1<? super GraphicsLayerScope, C11921v> function1) {
        C12775o.m28639i(function1, "block");
        return new BlockGraphicsLayerElement(function1);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof BlockGraphicsLayerElement) && C12775o.m28634d(this.block, ((BlockGraphicsLayerElement) obj).block)) {
            return true;
        }
        return false;
    }

    public final Function1<GraphicsLayerScope, C11921v> getBlock() {
        return this.block;
    }

    public int hashCode() {
        return this.block.hashCode();
    }

    public void inspectableProperties(InspectorInfo inspectorInfo) {
        C12775o.m28639i(inspectorInfo, "<this>");
        inspectorInfo.setName("graphicsLayer");
        inspectorInfo.getProperties().set("block", this.block);
    }

    public String toString() {
        return "BlockGraphicsLayerElement(block=" + this.block + ')';
    }

    public BlockGraphicsLayerModifier create() {
        return new BlockGraphicsLayerModifier(this.block);
    }

    public BlockGraphicsLayerModifier update(BlockGraphicsLayerModifier blockGraphicsLayerModifier) {
        C12775o.m28639i(blockGraphicsLayerModifier, "node");
        blockGraphicsLayerModifier.setLayerBlock(this.block);
        return blockGraphicsLayerModifier;
    }
}
