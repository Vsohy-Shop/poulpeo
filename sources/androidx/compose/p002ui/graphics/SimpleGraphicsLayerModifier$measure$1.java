package androidx.compose.p002ui.graphics;

import androidx.compose.p002ui.layout.Placeable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* renamed from: androidx.compose.ui.graphics.SimpleGraphicsLayerModifier$measure$1 */
/* compiled from: GraphicsLayerModifier.kt */
final class SimpleGraphicsLayerModifier$measure$1 extends C12777p implements Function1<Placeable.PlacementScope, C11921v> {
    final /* synthetic */ Placeable $placeable;
    final /* synthetic */ SimpleGraphicsLayerModifier this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SimpleGraphicsLayerModifier$measure$1(Placeable placeable, SimpleGraphicsLayerModifier simpleGraphicsLayerModifier) {
        super(1);
        this.$placeable = placeable;
        this.this$0 = simpleGraphicsLayerModifier;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return C11921v.f18618a;
    }

    public final void invoke(Placeable.PlacementScope placementScope) {
        C12775o.m28639i(placementScope, "$this$layout");
        Placeable.PlacementScope.placeWithLayer$default(placementScope, this.$placeable, 0, 0, 0.0f, this.this$0.layerBlock, 4, (Object) null);
    }
}
