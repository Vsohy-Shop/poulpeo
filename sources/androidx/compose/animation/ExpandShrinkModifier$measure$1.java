package androidx.compose.animation;

import androidx.compose.p002ui.layout.Placeable;
import androidx.compose.p002ui.unit.IntOffset;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: EnterExitTransition.kt */
final class ExpandShrinkModifier$measure$1 extends C12777p implements Function1<Placeable.PlacementScope, C11921v> {
    final /* synthetic */ long $offset;
    final /* synthetic */ long $offsetDelta;
    final /* synthetic */ Placeable $placeable;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ExpandShrinkModifier$measure$1(Placeable placeable, long j, long j2) {
        super(1);
        this.$placeable = placeable;
        this.$offset = j;
        this.$offsetDelta = j2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return C11921v.f18618a;
    }

    public final void invoke(Placeable.PlacementScope placementScope) {
        C12775o.m28639i(placementScope, "$this$layout");
        Placeable.PlacementScope.place$default(placementScope, this.$placeable, IntOffset.m38586getXimpl(this.$offset) + IntOffset.m38586getXimpl(this.$offsetDelta), IntOffset.m38587getYimpl(this.$offset) + IntOffset.m38587getYimpl(this.$offsetDelta), 0.0f, 4, (Object) null);
    }
}
