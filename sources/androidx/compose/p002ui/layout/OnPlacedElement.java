package androidx.compose.p002ui.layout;

import androidx.compose.p002ui.node.ModifierNodeElement;
import androidx.compose.p002ui.platform.InspectorInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;

/* renamed from: androidx.compose.ui.layout.OnPlacedElement */
/* compiled from: OnPlacedModifier.kt */
final class OnPlacedElement extends ModifierNodeElement<OnPlacedModifierImpl> {
    private final Function1<LayoutCoordinates, C11921v> onPlaced;

    public OnPlacedElement(Function1<? super LayoutCoordinates, C11921v> function1) {
        C12775o.m28639i(function1, "onPlaced");
        this.onPlaced = function1;
    }

    public static /* synthetic */ OnPlacedElement copy$default(OnPlacedElement onPlacedElement, Function1<LayoutCoordinates, C11921v> function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = onPlacedElement.onPlaced;
        }
        return onPlacedElement.copy(function1);
    }

    public final Function1<LayoutCoordinates, C11921v> component1() {
        return this.onPlaced;
    }

    public final OnPlacedElement copy(Function1<? super LayoutCoordinates, C11921v> function1) {
        C12775o.m28639i(function1, "onPlaced");
        return new OnPlacedElement(function1);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof OnPlacedElement) && C12775o.m28634d(this.onPlaced, ((OnPlacedElement) obj).onPlaced)) {
            return true;
        }
        return false;
    }

    public final Function1<LayoutCoordinates, C11921v> getOnPlaced() {
        return this.onPlaced;
    }

    public int hashCode() {
        return this.onPlaced.hashCode();
    }

    public void inspectableProperties(InspectorInfo inspectorInfo) {
        C12775o.m28639i(inspectorInfo, "<this>");
        inspectorInfo.setName("onPlaced");
        inspectorInfo.getProperties().set("onPlaced", this.onPlaced);
    }

    public String toString() {
        return "OnPlacedElement(onPlaced=" + this.onPlaced + ')';
    }

    public OnPlacedModifierImpl create() {
        return new OnPlacedModifierImpl(this.onPlaced);
    }

    public OnPlacedModifierImpl update(OnPlacedModifierImpl onPlacedModifierImpl) {
        C12775o.m28639i(onPlacedModifierImpl, "node");
        onPlacedModifierImpl.setCallback(this.onPlaced);
        return onPlacedModifierImpl;
    }
}
