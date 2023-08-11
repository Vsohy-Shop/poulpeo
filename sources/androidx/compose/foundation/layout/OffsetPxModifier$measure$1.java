package androidx.compose.foundation.layout;

import androidx.compose.p002ui.layout.MeasureScope;
import androidx.compose.p002ui.layout.Placeable;
import androidx.compose.p002ui.unit.IntOffset;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: Offset.kt */
final class OffsetPxModifier$measure$1 extends C12777p implements Function1<Placeable.PlacementScope, C11921v> {
    final /* synthetic */ Placeable $placeable;
    final /* synthetic */ MeasureScope $this_measure;
    final /* synthetic */ OffsetPxModifier this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    OffsetPxModifier$measure$1(OffsetPxModifier offsetPxModifier, MeasureScope measureScope, Placeable placeable) {
        super(1);
        this.this$0 = offsetPxModifier;
        this.$this_measure = measureScope;
        this.$placeable = placeable;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return C11921v.f18618a;
    }

    public final void invoke(Placeable.PlacementScope placementScope) {
        C12775o.m28639i(placementScope, "$this$layout");
        long r2 = this.this$0.getOffset().invoke(this.$this_measure).m38595unboximpl();
        if (this.this$0.getRtlAware()) {
            Placeable.PlacementScope.placeRelativeWithLayer$default(placementScope, this.$placeable, IntOffset.m38586getXimpl(r2), IntOffset.m38587getYimpl(r2), 0.0f, (Function1) null, 12, (Object) null);
            return;
        }
        Placeable.PlacementScope.placeWithLayer$default(placementScope, this.$placeable, IntOffset.m38586getXimpl(r2), IntOffset.m38587getYimpl(r2), 0.0f, (Function1) null, 12, (Object) null);
    }
}
