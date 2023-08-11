package androidx.compose.p002ui.input.key;

import androidx.compose.p002ui.node.ModifierNodeElement;
import androidx.compose.p002ui.platform.InspectorInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.input.key.OnPreviewKeyEvent */
/* compiled from: KeyInputModifierNode.kt */
public final class OnPreviewKeyEvent extends ModifierNodeElement<KeyInputInputModifierNodeImpl> {
    private final Function1<KeyEvent, Boolean> onPreviewKeyEvent;

    public OnPreviewKeyEvent(Function1<? super KeyEvent, Boolean> function1) {
        C12775o.m28639i(function1, "onPreviewKeyEvent");
        this.onPreviewKeyEvent = function1;
    }

    public static /* synthetic */ OnPreviewKeyEvent copy$default(OnPreviewKeyEvent onPreviewKeyEvent2, Function1<KeyEvent, Boolean> function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = onPreviewKeyEvent2.onPreviewKeyEvent;
        }
        return onPreviewKeyEvent2.copy(function1);
    }

    public final Function1<KeyEvent, Boolean> component1() {
        return this.onPreviewKeyEvent;
    }

    public final OnPreviewKeyEvent copy(Function1<? super KeyEvent, Boolean> function1) {
        C12775o.m28639i(function1, "onPreviewKeyEvent");
        return new OnPreviewKeyEvent(function1);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof OnPreviewKeyEvent) && C12775o.m28634d(this.onPreviewKeyEvent, ((OnPreviewKeyEvent) obj).onPreviewKeyEvent)) {
            return true;
        }
        return false;
    }

    public final Function1<KeyEvent, Boolean> getOnPreviewKeyEvent() {
        return this.onPreviewKeyEvent;
    }

    public int hashCode() {
        return this.onPreviewKeyEvent.hashCode();
    }

    public void inspectableProperties(InspectorInfo inspectorInfo) {
        C12775o.m28639i(inspectorInfo, "<this>");
        inspectorInfo.setName("onPreviewKeyEvent");
        inspectorInfo.getProperties().set("onPreviewKeyEvent", this.onPreviewKeyEvent);
    }

    public String toString() {
        return "OnPreviewKeyEvent(onPreviewKeyEvent=" + this.onPreviewKeyEvent + ')';
    }

    public KeyInputInputModifierNodeImpl create() {
        return new KeyInputInputModifierNodeImpl((Function1<? super KeyEvent, Boolean>) null, this.onPreviewKeyEvent);
    }

    public KeyInputInputModifierNodeImpl update(KeyInputInputModifierNodeImpl keyInputInputModifierNodeImpl) {
        C12775o.m28639i(keyInputInputModifierNodeImpl, "node");
        keyInputInputModifierNodeImpl.setOnPreEvent(this.onPreviewKeyEvent);
        keyInputInputModifierNodeImpl.setOnEvent((Function1<? super KeyEvent, Boolean>) null);
        return keyInputInputModifierNodeImpl;
    }
}
