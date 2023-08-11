package androidx.lifecycle;

import android.view.View;
import androidx.lifecycle.runtime.C2349R;
import kotlin.jvm.internal.C12775o;

/* compiled from: ViewTreeLifecycleOwner.kt */
public final class ViewTreeLifecycleOwner {
    public static final LifecycleOwner get(View view) {
        C12775o.m28639i(view, "<this>");
        return (LifecycleOwner) C13662o.m31283p(C13662o.m31288u(C13657m.m31272f(view, ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$1.INSTANCE), ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$2.INSTANCE));
    }

    public static final void set(View view, LifecycleOwner lifecycleOwner) {
        C12775o.m28639i(view, "<this>");
        view.setTag(C2349R.C2350id.view_tree_lifecycle_owner, lifecycleOwner);
    }
}
