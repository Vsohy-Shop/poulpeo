package androidx.compose.p002ui.node;

import androidx.compose.p002ui.graphics.GraphicsLayerScope;
import androidx.compose.p002ui.layout.Placeable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13074a;

/* renamed from: androidx.compose.ui.node.LayoutNodeLayoutDelegate$MeasurePassDelegate$placeOuterCoordinator$1 */
/* compiled from: LayoutNodeLayoutDelegate.kt */
final class C1060x14fd4410 extends C12777p implements C13074a<C11921v> {
    final /* synthetic */ Function1<GraphicsLayerScope, C11921v> $layerBlock;
    final /* synthetic */ long $position;
    final /* synthetic */ float $zIndex;
    final /* synthetic */ LayoutNodeLayoutDelegate this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C1060x14fd4410(Function1<? super GraphicsLayerScope, C11921v> function1, LayoutNodeLayoutDelegate layoutNodeLayoutDelegate, long j, float f) {
        super(0);
        this.$layerBlock = function1;
        this.this$0 = layoutNodeLayoutDelegate;
        this.$position = j;
        this.$zIndex = f;
    }

    public final void invoke() {
        Placeable.PlacementScope.Companion companion = Placeable.PlacementScope.Companion;
        Function1<GraphicsLayerScope, C11921v> function1 = this.$layerBlock;
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.this$0;
        long j = this.$position;
        float f = this.$zIndex;
        if (function1 == null) {
            companion.m37409place70tqf50(layoutNodeLayoutDelegate.getOuterCoordinator(), j, f);
        } else {
            companion.m37414placeWithLayeraW9wM(layoutNodeLayoutDelegate.getOuterCoordinator(), j, f, function1);
        }
    }
}
