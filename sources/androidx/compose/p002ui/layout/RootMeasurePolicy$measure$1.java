package androidx.compose.p002ui.layout;

import androidx.compose.p002ui.layout.Placeable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* renamed from: androidx.compose.ui.layout.RootMeasurePolicy$measure$1 */
/* compiled from: RootMeasurePolicy.kt */
final class RootMeasurePolicy$measure$1 extends C12777p implements Function1<Placeable.PlacementScope, C11921v> {
    public static final RootMeasurePolicy$measure$1 INSTANCE = new RootMeasurePolicy$measure$1();

    RootMeasurePolicy$measure$1() {
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
