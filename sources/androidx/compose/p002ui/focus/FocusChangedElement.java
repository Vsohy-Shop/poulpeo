package androidx.compose.p002ui.focus;

import androidx.compose.p002ui.node.ModifierNodeElement;
import androidx.compose.p002ui.platform.InspectorInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;

/* renamed from: androidx.compose.ui.focus.FocusChangedElement */
/* compiled from: FocusChangedModifier.kt */
final class FocusChangedElement extends ModifierNodeElement<FocusChangedModifierNode> {
    private final Function1<FocusState, C11921v> onFocusChanged;

    public FocusChangedElement(Function1<? super FocusState, C11921v> function1) {
        C12775o.m28639i(function1, "onFocusChanged");
        this.onFocusChanged = function1;
    }

    public static /* synthetic */ FocusChangedElement copy$default(FocusChangedElement focusChangedElement, Function1<FocusState, C11921v> function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = focusChangedElement.onFocusChanged;
        }
        return focusChangedElement.copy(function1);
    }

    public final Function1<FocusState, C11921v> component1() {
        return this.onFocusChanged;
    }

    public final FocusChangedElement copy(Function1<? super FocusState, C11921v> function1) {
        C12775o.m28639i(function1, "onFocusChanged");
        return new FocusChangedElement(function1);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof FocusChangedElement) && C12775o.m28634d(this.onFocusChanged, ((FocusChangedElement) obj).onFocusChanged)) {
            return true;
        }
        return false;
    }

    public final Function1<FocusState, C11921v> getOnFocusChanged() {
        return this.onFocusChanged;
    }

    public int hashCode() {
        return this.onFocusChanged.hashCode();
    }

    public void inspectableProperties(InspectorInfo inspectorInfo) {
        C12775o.m28639i(inspectorInfo, "<this>");
        inspectorInfo.setName("onFocusChanged");
        inspectorInfo.getProperties().set("onFocusChanged", this.onFocusChanged);
    }

    public String toString() {
        return "FocusChangedElement(onFocusChanged=" + this.onFocusChanged + ')';
    }

    public FocusChangedModifierNode create() {
        return new FocusChangedModifierNode(this.onFocusChanged);
    }

    public FocusChangedModifierNode update(FocusChangedModifierNode focusChangedModifierNode) {
        C12775o.m28639i(focusChangedModifierNode, "node");
        focusChangedModifierNode.setOnFocusChanged(this.onFocusChanged);
        return focusChangedModifierNode;
    }
}
