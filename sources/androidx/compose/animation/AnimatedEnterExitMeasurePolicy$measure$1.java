package androidx.compose.animation;

import androidx.compose.p002ui.layout.Placeable;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: AnimatedVisibility.kt */
final class AnimatedEnterExitMeasurePolicy$measure$1 extends C12777p implements Function1<Placeable.PlacementScope, C11921v> {
    final /* synthetic */ List<Placeable> $placeables;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AnimatedEnterExitMeasurePolicy$measure$1(List<? extends Placeable> list) {
        super(1);
        this.$placeables = list;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return C11921v.f18618a;
    }

    public final void invoke(Placeable.PlacementScope placementScope) {
        C12775o.m28639i(placementScope, "$this$layout");
        List<Placeable> list = this.$placeables;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Placeable.PlacementScope.place$default(placementScope, list.get(i), 0, 0, 0.0f, 4, (Object) null);
        }
    }
}
