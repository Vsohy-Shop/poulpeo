package androidx.lifecycle;

import android.view.View;
import androidx.lifecycle.runtime.C2349R;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;

/* compiled from: ViewTreeLifecycleOwner.kt */
final class ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$2 extends C12777p implements Function1<View, LifecycleOwner> {
    public static final ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$2 INSTANCE = new ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$2();

    ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$2() {
        super(1);
    }

    public final LifecycleOwner invoke(View view) {
        C12775o.m28639i(view, "viewParent");
        Object tag = view.getTag(C2349R.C2350id.view_tree_lifecycle_owner);
        if (tag instanceof LifecycleOwner) {
            return (LifecycleOwner) tag;
        }
        return null;
    }
}
