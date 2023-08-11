package androidx.compose.p002ui.layout;

import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.node.ParentDataModifierNode;
import androidx.compose.p002ui.unit.Density;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.layout.LayoutIdModifier */
/* compiled from: LayoutId.kt */
final class LayoutIdModifier extends Modifier.Node implements ParentDataModifierNode, LayoutIdParentData {
    private Object layoutId;

    public LayoutIdModifier(Object obj) {
        C12775o.m28639i(obj, "layoutId");
        this.layoutId = obj;
    }

    public Object getLayoutId() {
        return this.layoutId;
    }

    public Object modifyParentData(Density density, Object obj) {
        C12775o.m28639i(density, "<this>");
        return this;
    }

    public void setLayoutId$ui_release(Object obj) {
        C12775o.m28639i(obj, "<set-?>");
        this.layoutId = obj;
    }
}
