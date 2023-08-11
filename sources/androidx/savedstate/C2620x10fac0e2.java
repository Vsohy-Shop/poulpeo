package androidx.savedstate;

import android.view.View;
import android.view.ViewParent;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;

/* renamed from: androidx.savedstate.ViewTreeSavedStateRegistryOwner$findViewTreeSavedStateRegistryOwner$1 */
/* compiled from: ViewTreeSavedStateRegistryOwner.kt */
final class C2620x10fac0e2 extends C12777p implements Function1<View, View> {
    public static final C2620x10fac0e2 INSTANCE = new C2620x10fac0e2();

    C2620x10fac0e2() {
        super(1);
    }

    public final View invoke(View view) {
        C12775o.m28639i(view, "view");
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }
}
