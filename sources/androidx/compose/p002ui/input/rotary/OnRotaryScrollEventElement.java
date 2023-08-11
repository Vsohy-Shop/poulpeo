package androidx.compose.p002ui.input.rotary;

import androidx.compose.p002ui.node.ModifierNodeElement;
import androidx.compose.p002ui.platform.InspectorInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.input.rotary.OnRotaryScrollEventElement */
/* compiled from: RotaryInputModifierNode.kt */
public final class OnRotaryScrollEventElement extends ModifierNodeElement<RotaryInputModifierNodeImpl> {
    private final Function1<RotaryScrollEvent, Boolean> onRotaryScrollEvent;

    public OnRotaryScrollEventElement(Function1<? super RotaryScrollEvent, Boolean> function1) {
        C12775o.m28639i(function1, "onRotaryScrollEvent");
        this.onRotaryScrollEvent = function1;
    }

    public static /* synthetic */ OnRotaryScrollEventElement copy$default(OnRotaryScrollEventElement onRotaryScrollEventElement, Function1<RotaryScrollEvent, Boolean> function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = onRotaryScrollEventElement.onRotaryScrollEvent;
        }
        return onRotaryScrollEventElement.copy(function1);
    }

    public final Function1<RotaryScrollEvent, Boolean> component1() {
        return this.onRotaryScrollEvent;
    }

    public final OnRotaryScrollEventElement copy(Function1<? super RotaryScrollEvent, Boolean> function1) {
        C12775o.m28639i(function1, "onRotaryScrollEvent");
        return new OnRotaryScrollEventElement(function1);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof OnRotaryScrollEventElement) && C12775o.m28634d(this.onRotaryScrollEvent, ((OnRotaryScrollEventElement) obj).onRotaryScrollEvent)) {
            return true;
        }
        return false;
    }

    public final Function1<RotaryScrollEvent, Boolean> getOnRotaryScrollEvent() {
        return this.onRotaryScrollEvent;
    }

    public int hashCode() {
        return this.onRotaryScrollEvent.hashCode();
    }

    public void inspectableProperties(InspectorInfo inspectorInfo) {
        C12775o.m28639i(inspectorInfo, "<this>");
        inspectorInfo.setName("onRotaryScrollEvent");
        inspectorInfo.getProperties().set("onRotaryScrollEvent", this.onRotaryScrollEvent);
    }

    public String toString() {
        return "OnRotaryScrollEventElement(onRotaryScrollEvent=" + this.onRotaryScrollEvent + ')';
    }

    public RotaryInputModifierNodeImpl create() {
        return new RotaryInputModifierNodeImpl(this.onRotaryScrollEvent, (Function1<? super RotaryScrollEvent, Boolean>) null);
    }

    public RotaryInputModifierNodeImpl update(RotaryInputModifierNodeImpl rotaryInputModifierNodeImpl) {
        C12775o.m28639i(rotaryInputModifierNodeImpl, "node");
        rotaryInputModifierNodeImpl.setOnEvent(this.onRotaryScrollEvent);
        rotaryInputModifierNodeImpl.setOnPreEvent((Function1<? super RotaryScrollEvent, Boolean>) null);
        return rotaryInputModifierNodeImpl;
    }
}
