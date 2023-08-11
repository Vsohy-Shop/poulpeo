package androidx.compose.p002ui.layout;

import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.node.LayoutAwareModifierNode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;

/* renamed from: androidx.compose.ui.layout.OnPlacedModifierImpl */
/* compiled from: OnPlacedModifier.kt */
final class OnPlacedModifierImpl extends Modifier.Node implements LayoutAwareModifierNode {
    private Function1<? super LayoutCoordinates, C11921v> callback;

    public OnPlacedModifierImpl(Function1<? super LayoutCoordinates, C11921v> function1) {
        C12775o.m28639i(function1, "callback");
        this.callback = function1;
    }

    public final Function1<LayoutCoordinates, C11921v> getCallback() {
        return this.callback;
    }

    public void onPlaced(LayoutCoordinates layoutCoordinates) {
        C12775o.m28639i(layoutCoordinates, "coordinates");
        this.callback.invoke(layoutCoordinates);
    }

    public final void setCallback(Function1<? super LayoutCoordinates, C11921v> function1) {
        C12775o.m28639i(function1, "<set-?>");
        this.callback = function1;
    }
}
