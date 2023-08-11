package androidx.compose.p002ui.layout;

import androidx.compose.p002ui.Modifier;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.layout.LayoutIdKt */
/* compiled from: LayoutId.kt */
public final class LayoutIdKt {
    public static final Object getLayoutId(Measurable measurable) {
        LayoutIdParentData layoutIdParentData;
        C12775o.m28639i(measurable, "<this>");
        Object parentData = measurable.getParentData();
        if (parentData instanceof LayoutIdParentData) {
            layoutIdParentData = (LayoutIdParentData) parentData;
        } else {
            layoutIdParentData = null;
        }
        if (layoutIdParentData != null) {
            return layoutIdParentData.getLayoutId();
        }
        return null;
    }

    @Stable
    public static final Modifier layoutId(Modifier modifier, Object obj) {
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(obj, "layoutId");
        return modifier.then(new LayoutIdModifierElement(obj));
    }
}
