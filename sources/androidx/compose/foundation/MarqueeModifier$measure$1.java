package androidx.compose.foundation;

import androidx.compose.p002ui.layout.Placeable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: BasicMarquee.kt */
final class MarqueeModifier$measure$1 extends C12777p implements Function1<Placeable.PlacementScope, C11921v> {
    final /* synthetic */ Placeable $placeable;
    final /* synthetic */ MarqueeModifier this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    MarqueeModifier$measure$1(Placeable placeable, MarqueeModifier marqueeModifier) {
        super(1);
        this.$placeable = placeable;
        this.this$0 = marqueeModifier;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return C11921v.f18618a;
    }

    public final void invoke(Placeable.PlacementScope placementScope) {
        C12775o.m28639i(placementScope, "$this$layout");
        Placeable.PlacementScope.placeWithLayer$default(placementScope, this.$placeable, C13265c.m30134c((-((Number) this.this$0.offset.getValue()).floatValue()) * this.this$0.direction), 0, 0.0f, (Function1) null, 12, (Object) null);
    }
}
