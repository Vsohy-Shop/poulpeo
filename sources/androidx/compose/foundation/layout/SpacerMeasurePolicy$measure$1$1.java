package androidx.compose.foundation.layout;

import androidx.compose.p002ui.layout.Placeable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: Spacer.kt */
final class SpacerMeasurePolicy$measure$1$1 extends C12777p implements Function1<Placeable.PlacementScope, C11921v> {
    public static final SpacerMeasurePolicy$measure$1$1 INSTANCE = new SpacerMeasurePolicy$measure$1$1();

    SpacerMeasurePolicy$measure$1$1() {
        super(1);
    }

    public final void invoke(Placeable.PlacementScope placementScope) {
        C12775o.m28639i(placementScope, "$this$layout");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return C11921v.f18618a;
    }
}
