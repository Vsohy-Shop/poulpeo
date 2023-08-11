package androidx.compose.animation;

import androidx.compose.p002ui.layout.Placeable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: EnterExitTransition.kt */
final class SlideModifier$measure$1 extends C12777p implements Function1<Placeable.PlacementScope, C11921v> {
    final /* synthetic */ long $measuredSize;
    final /* synthetic */ Placeable $placeable;
    final /* synthetic */ SlideModifier this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SlideModifier$measure$1(SlideModifier slideModifier, Placeable placeable, long j) {
        super(1);
        this.this$0 = slideModifier;
        this.$placeable = placeable;
        this.$measuredSize = j;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return C11921v.f18618a;
    }

    public final void invoke(Placeable.PlacementScope placementScope) {
        C12775o.m28639i(placementScope, "$this$layout");
        Placeable.PlacementScope placementScope2 = placementScope;
        Placeable.PlacementScope.m37408placeWithLayeraW9wM$default(placementScope2, this.$placeable, this.this$0.getLazyAnimation().animate(this.this$0.getTransitionSpec(), new SlideModifier$measure$1$slideOffset$1(this.this$0, this.$measuredSize)).getValue().m38595unboximpl(), 0.0f, (Function1) null, 6, (Object) null);
    }
}
