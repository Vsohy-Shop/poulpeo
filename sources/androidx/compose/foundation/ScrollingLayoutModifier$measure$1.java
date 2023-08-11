package androidx.compose.foundation;

import androidx.compose.p002ui.layout.Placeable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: Scroll.kt */
final class ScrollingLayoutModifier$measure$1 extends C12777p implements Function1<Placeable.PlacementScope, C11921v> {
    final /* synthetic */ Placeable $placeable;
    final /* synthetic */ int $side;
    final /* synthetic */ ScrollingLayoutModifier this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ScrollingLayoutModifier$measure$1(ScrollingLayoutModifier scrollingLayoutModifier, int i, Placeable placeable) {
        super(1);
        this.this$0 = scrollingLayoutModifier;
        this.$side = i;
        this.$placeable = placeable;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return C11921v.f18618a;
    }

    public final void invoke(Placeable.PlacementScope placementScope) {
        C12775o.m28639i(placementScope, "$this$layout");
        int m = C13537l.m30886m(this.this$0.getScrollerState().getValue(), 0, this.$side);
        int i = this.this$0.isReversed() ? m - this.$side : -m;
        Placeable.PlacementScope.placeRelativeWithLayer$default(placementScope, this.$placeable, this.this$0.isVertical() ? 0 : i, this.this$0.isVertical() ? i : 0, 0.0f, (Function1) null, 12, (Object) null);
    }
}
