package androidx.compose.p002ui.focus;

import androidx.compose.p002ui.node.ModifierNodeElement;
import androidx.compose.p002ui.platform.InspectorInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;

/* renamed from: androidx.compose.ui.focus.FocusPropertiesElement */
/* compiled from: FocusProperties.kt */
final class FocusPropertiesElement extends ModifierNodeElement<FocusPropertiesModifierNodeImpl> {
    private final Function1<FocusProperties, C11921v> scope;

    public FocusPropertiesElement(Function1<? super FocusProperties, C11921v> function1) {
        C12775o.m28639i(function1, "scope");
        this.scope = function1;
    }

    public static /* synthetic */ FocusPropertiesElement copy$default(FocusPropertiesElement focusPropertiesElement, Function1<FocusProperties, C11921v> function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = focusPropertiesElement.scope;
        }
        return focusPropertiesElement.copy(function1);
    }

    public final Function1<FocusProperties, C11921v> component1() {
        return this.scope;
    }

    public final FocusPropertiesElement copy(Function1<? super FocusProperties, C11921v> function1) {
        C12775o.m28639i(function1, "scope");
        return new FocusPropertiesElement(function1);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof FocusPropertiesElement) && C12775o.m28634d(this.scope, ((FocusPropertiesElement) obj).scope)) {
            return true;
        }
        return false;
    }

    public final Function1<FocusProperties, C11921v> getScope() {
        return this.scope;
    }

    public int hashCode() {
        return this.scope.hashCode();
    }

    public void inspectableProperties(InspectorInfo inspectorInfo) {
        C12775o.m28639i(inspectorInfo, "<this>");
        inspectorInfo.setName("focusProperties");
        inspectorInfo.getProperties().set("scope", this.scope);
    }

    public String toString() {
        return "FocusPropertiesElement(scope=" + this.scope + ')';
    }

    public FocusPropertiesModifierNodeImpl create() {
        return new FocusPropertiesModifierNodeImpl(this.scope);
    }

    public FocusPropertiesModifierNodeImpl update(FocusPropertiesModifierNodeImpl focusPropertiesModifierNodeImpl) {
        C12775o.m28639i(focusPropertiesModifierNodeImpl, "node");
        focusPropertiesModifierNodeImpl.setFocusPropertiesScope(this.scope);
        return focusPropertiesModifierNodeImpl;
    }
}
