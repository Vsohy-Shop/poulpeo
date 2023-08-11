package androidx.compose.p002ui.focus;

import androidx.compose.p002ui.node.ModifierNodeElement;
import androidx.compose.p002ui.platform.InspectorInfo;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nFocusRequesterModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusRequesterModifier.kt\nandroidx/compose/ui/focus/FocusRequesterElement\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,84:1\n735#2,2:85\n728#2,2:87\n*S KotlinDebug\n*F\n+ 1 FocusRequesterModifier.kt\nandroidx/compose/ui/focus/FocusRequesterElement\n*L\n59#1:85,2\n61#1:87,2\n*E\n"})
/* renamed from: androidx.compose.ui.focus.FocusRequesterElement */
/* compiled from: FocusRequesterModifier.kt */
final class FocusRequesterElement extends ModifierNodeElement<FocusRequesterModifierNodeImpl> {
    private final FocusRequester focusRequester;

    public FocusRequesterElement(FocusRequester focusRequester2) {
        C12775o.m28639i(focusRequester2, "focusRequester");
        this.focusRequester = focusRequester2;
    }

    public static /* synthetic */ FocusRequesterElement copy$default(FocusRequesterElement focusRequesterElement, FocusRequester focusRequester2, int i, Object obj) {
        if ((i & 1) != 0) {
            focusRequester2 = focusRequesterElement.focusRequester;
        }
        return focusRequesterElement.copy(focusRequester2);
    }

    public final FocusRequester component1() {
        return this.focusRequester;
    }

    public final FocusRequesterElement copy(FocusRequester focusRequester2) {
        C12775o.m28639i(focusRequester2, "focusRequester");
        return new FocusRequesterElement(focusRequester2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof FocusRequesterElement) && C12775o.m28634d(this.focusRequester, ((FocusRequesterElement) obj).focusRequester)) {
            return true;
        }
        return false;
    }

    public final FocusRequester getFocusRequester() {
        return this.focusRequester;
    }

    public int hashCode() {
        return this.focusRequester.hashCode();
    }

    public void inspectableProperties(InspectorInfo inspectorInfo) {
        C12775o.m28639i(inspectorInfo, "<this>");
        inspectorInfo.setName("focusRequester");
        inspectorInfo.getProperties().set("focusRequester", this.focusRequester);
    }

    public String toString() {
        return "FocusRequesterElement(focusRequester=" + this.focusRequester + ')';
    }

    public FocusRequesterModifierNodeImpl create() {
        return new FocusRequesterModifierNodeImpl(this.focusRequester);
    }

    public FocusRequesterModifierNodeImpl update(FocusRequesterModifierNodeImpl focusRequesterModifierNodeImpl) {
        C12775o.m28639i(focusRequesterModifierNodeImpl, "node");
        focusRequesterModifierNodeImpl.getFocusRequester().getFocusRequesterNodes$ui_release().remove(focusRequesterModifierNodeImpl);
        focusRequesterModifierNodeImpl.setFocusRequester(this.focusRequester);
        focusRequesterModifierNodeImpl.getFocusRequester().getFocusRequesterNodes$ui_release().add(focusRequesterModifierNodeImpl);
        return focusRequesterModifierNodeImpl;
    }
}
