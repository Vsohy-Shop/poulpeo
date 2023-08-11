package androidx.compose.p002ui.layout;

import androidx.compose.p002ui.node.ModifierNodeElement;
import androidx.compose.p002ui.platform.InspectorInfo;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.layout.LayoutIdModifierElement */
/* compiled from: LayoutId.kt */
final class LayoutIdModifierElement extends ModifierNodeElement<LayoutIdModifier> {
    private final Object layoutId;

    public LayoutIdModifierElement(Object obj) {
        C12775o.m28639i(obj, "layoutId");
        this.layoutId = obj;
    }

    private final Object component1() {
        return this.layoutId;
    }

    public static /* synthetic */ LayoutIdModifierElement copy$default(LayoutIdModifierElement layoutIdModifierElement, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = layoutIdModifierElement.layoutId;
        }
        return layoutIdModifierElement.copy(obj);
    }

    public final LayoutIdModifierElement copy(Object obj) {
        C12775o.m28639i(obj, "layoutId");
        return new LayoutIdModifierElement(obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof LayoutIdModifierElement) && C12775o.m28634d(this.layoutId, ((LayoutIdModifierElement) obj).layoutId)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.layoutId.hashCode();
    }

    public void inspectableProperties(InspectorInfo inspectorInfo) {
        C12775o.m28639i(inspectorInfo, "<this>");
        inspectorInfo.setName("layoutId");
        inspectorInfo.setValue(this.layoutId);
    }

    public String toString() {
        return "LayoutIdModifierElement(layoutId=" + this.layoutId + ')';
    }

    public LayoutIdModifier create() {
        return new LayoutIdModifier(this.layoutId);
    }

    public LayoutIdModifier update(LayoutIdModifier layoutIdModifier) {
        C12775o.m28639i(layoutIdModifier, "node");
        layoutIdModifier.setLayoutId$ui_release(this.layoutId);
        return layoutIdModifier;
    }
}
