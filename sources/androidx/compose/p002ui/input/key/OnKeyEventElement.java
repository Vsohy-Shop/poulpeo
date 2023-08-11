package androidx.compose.p002ui.input.key;

import androidx.compose.p002ui.node.ModifierNodeElement;
import androidx.compose.p002ui.platform.InspectorInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.input.key.OnKeyEventElement */
/* compiled from: KeyInputModifierNode.kt */
public final class OnKeyEventElement extends ModifierNodeElement<KeyInputInputModifierNodeImpl> {
    private final Function1<KeyEvent, Boolean> onKeyEvent;

    public OnKeyEventElement(Function1<? super KeyEvent, Boolean> function1) {
        C12775o.m28639i(function1, "onKeyEvent");
        this.onKeyEvent = function1;
    }

    public static /* synthetic */ OnKeyEventElement copy$default(OnKeyEventElement onKeyEventElement, Function1<KeyEvent, Boolean> function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = onKeyEventElement.onKeyEvent;
        }
        return onKeyEventElement.copy(function1);
    }

    public final Function1<KeyEvent, Boolean> component1() {
        return this.onKeyEvent;
    }

    public final OnKeyEventElement copy(Function1<? super KeyEvent, Boolean> function1) {
        C12775o.m28639i(function1, "onKeyEvent");
        return new OnKeyEventElement(function1);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof OnKeyEventElement) && C12775o.m28634d(this.onKeyEvent, ((OnKeyEventElement) obj).onKeyEvent)) {
            return true;
        }
        return false;
    }

    public final Function1<KeyEvent, Boolean> getOnKeyEvent() {
        return this.onKeyEvent;
    }

    public int hashCode() {
        return this.onKeyEvent.hashCode();
    }

    public void inspectableProperties(InspectorInfo inspectorInfo) {
        C12775o.m28639i(inspectorInfo, "<this>");
        inspectorInfo.setName("onKeyEvent");
        inspectorInfo.getProperties().set("onKeyEvent", this.onKeyEvent);
    }

    public String toString() {
        return "OnKeyEventElement(onKeyEvent=" + this.onKeyEvent + ')';
    }

    public KeyInputInputModifierNodeImpl create() {
        return new KeyInputInputModifierNodeImpl(this.onKeyEvent, (Function1<? super KeyEvent, Boolean>) null);
    }

    public KeyInputInputModifierNodeImpl update(KeyInputInputModifierNodeImpl keyInputInputModifierNodeImpl) {
        C12775o.m28639i(keyInputInputModifierNodeImpl, "node");
        keyInputInputModifierNodeImpl.setOnEvent(this.onKeyEvent);
        keyInputInputModifierNodeImpl.setOnPreEvent((Function1<? super KeyEvent, Boolean>) null);
        return keyInputInputModifierNodeImpl;
    }
}
