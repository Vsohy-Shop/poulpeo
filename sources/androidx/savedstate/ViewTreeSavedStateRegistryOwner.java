package androidx.savedstate;

import android.view.View;
import kotlin.jvm.internal.C12775o;

/* compiled from: ViewTreeSavedStateRegistryOwner.kt */
public final class ViewTreeSavedStateRegistryOwner {
    public static final SavedStateRegistryOwner get(View view) {
        C12775o.m28639i(view, "<this>");
        return (SavedStateRegistryOwner) C13662o.m31283p(C13662o.m31288u(C13657m.m31272f(view, C2620x10fac0e2.INSTANCE), C2621x10fac0e3.INSTANCE));
    }

    public static final void set(View view, SavedStateRegistryOwner savedStateRegistryOwner) {
        C12775o.m28639i(view, "<this>");
        view.setTag(C2618R.C2619id.view_tree_saved_state_registry_owner, savedStateRegistryOwner);
    }
}
