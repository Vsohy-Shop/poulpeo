package androidx.compose.p002ui.focus;

import androidx.compose.p002ui.node.ModifierNodeElement;
import androidx.compose.p002ui.platform.InspectorInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;

/* renamed from: androidx.compose.ui.focus.FocusEventElement */
/* compiled from: FocusEventModifier.kt */
final class FocusEventElement extends ModifierNodeElement<FocusEventModifierNodeImpl> {
    private final Function1<FocusState, C11921v> onFocusEvent;

    public FocusEventElement(Function1<? super FocusState, C11921v> function1) {
        C12775o.m28639i(function1, "onFocusEvent");
        this.onFocusEvent = function1;
    }

    public static /* synthetic */ FocusEventElement copy$default(FocusEventElement focusEventElement, Function1<FocusState, C11921v> function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = focusEventElement.onFocusEvent;
        }
        return focusEventElement.copy(function1);
    }

    public final Function1<FocusState, C11921v> component1() {
        return this.onFocusEvent;
    }

    public final FocusEventElement copy(Function1<? super FocusState, C11921v> function1) {
        C12775o.m28639i(function1, "onFocusEvent");
        return new FocusEventElement(function1);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof FocusEventElement) && C12775o.m28634d(this.onFocusEvent, ((FocusEventElement) obj).onFocusEvent)) {
            return true;
        }
        return false;
    }

    public final Function1<FocusState, C11921v> getOnFocusEvent() {
        return this.onFocusEvent;
    }

    public int hashCode() {
        return this.onFocusEvent.hashCode();
    }

    public void inspectableProperties(InspectorInfo inspectorInfo) {
        C12775o.m28639i(inspectorInfo, "<this>");
        inspectorInfo.setName("onFocusEvent");
        inspectorInfo.getProperties().set("onFocusEvent", this.onFocusEvent);
    }

    public String toString() {
        return "FocusEventElement(onFocusEvent=" + this.onFocusEvent + ')';
    }

    public FocusEventModifierNodeImpl create() {
        return new FocusEventModifierNodeImpl(this.onFocusEvent);
    }

    public FocusEventModifierNodeImpl update(FocusEventModifierNodeImpl focusEventModifierNodeImpl) {
        C12775o.m28639i(focusEventModifierNodeImpl, "node");
        focusEventModifierNodeImpl.setOnFocusEvent(this.onFocusEvent);
        return focusEventModifierNodeImpl;
    }
}
