package androidx.compose.p002ui.input.rotary;

import androidx.compose.p002ui.node.ModifierNodeElement;
import androidx.compose.p002ui.platform.InspectorInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.input.rotary.OnPreRotaryScrollEventElement */
/* compiled from: RotaryInputModifierNode.kt */
public final class OnPreRotaryScrollEventElement extends ModifierNodeElement<RotaryInputModifierNodeImpl> {
    private final Function1<RotaryScrollEvent, Boolean> onPreRotaryScrollEvent;

    public OnPreRotaryScrollEventElement(Function1<? super RotaryScrollEvent, Boolean> function1) {
        C12775o.m28639i(function1, "onPreRotaryScrollEvent");
        this.onPreRotaryScrollEvent = function1;
    }

    public static /* synthetic */ OnPreRotaryScrollEventElement copy$default(OnPreRotaryScrollEventElement onPreRotaryScrollEventElement, Function1<RotaryScrollEvent, Boolean> function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = onPreRotaryScrollEventElement.onPreRotaryScrollEvent;
        }
        return onPreRotaryScrollEventElement.copy(function1);
    }

    public final Function1<RotaryScrollEvent, Boolean> component1() {
        return this.onPreRotaryScrollEvent;
    }

    public final OnPreRotaryScrollEventElement copy(Function1<? super RotaryScrollEvent, Boolean> function1) {
        C12775o.m28639i(function1, "onPreRotaryScrollEvent");
        return new OnPreRotaryScrollEventElement(function1);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof OnPreRotaryScrollEventElement) && C12775o.m28634d(this.onPreRotaryScrollEvent, ((OnPreRotaryScrollEventElement) obj).onPreRotaryScrollEvent)) {
            return true;
        }
        return false;
    }

    public final Function1<RotaryScrollEvent, Boolean> getOnPreRotaryScrollEvent() {
        return this.onPreRotaryScrollEvent;
    }

    public int hashCode() {
        return this.onPreRotaryScrollEvent.hashCode();
    }

    public void inspectableProperties(InspectorInfo inspectorInfo) {
        C12775o.m28639i(inspectorInfo, "<this>");
        inspectorInfo.setName("onPreRotaryScrollEvent");
        inspectorInfo.getProperties().set("onPreRotaryScrollEvent", this.onPreRotaryScrollEvent);
    }

    public String toString() {
        return "OnPreRotaryScrollEventElement(onPreRotaryScrollEvent=" + this.onPreRotaryScrollEvent + ')';
    }

    public RotaryInputModifierNodeImpl create() {
        return new RotaryInputModifierNodeImpl((Function1<? super RotaryScrollEvent, Boolean>) null, this.onPreRotaryScrollEvent);
    }

    public RotaryInputModifierNodeImpl update(RotaryInputModifierNodeImpl rotaryInputModifierNodeImpl) {
        C12775o.m28639i(rotaryInputModifierNodeImpl, "node");
        rotaryInputModifierNodeImpl.setOnPreEvent(this.onPreRotaryScrollEvent);
        rotaryInputModifierNodeImpl.setOnEvent((Function1<? super RotaryScrollEvent, Boolean>) null);
        return rotaryInputModifierNodeImpl;
    }
}
