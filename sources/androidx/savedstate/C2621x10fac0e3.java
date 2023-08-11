package androidx.savedstate;

import android.view.View;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;

/* renamed from: androidx.savedstate.ViewTreeSavedStateRegistryOwner$findViewTreeSavedStateRegistryOwner$2 */
/* compiled from: ViewTreeSavedStateRegistryOwner.kt */
final class C2621x10fac0e3 extends C12777p implements Function1<View, SavedStateRegistryOwner> {
    public static final C2621x10fac0e3 INSTANCE = new C2621x10fac0e3();

    C2621x10fac0e3() {
        super(1);
    }

    public final SavedStateRegistryOwner invoke(View view) {
        C12775o.m28639i(view, "view");
        Object tag = view.getTag(C2618R.C2619id.view_tree_saved_state_registry_owner);
        if (tag instanceof SavedStateRegistryOwner) {
            return (SavedStateRegistryOwner) tag;
        }
        return null;
    }
}
