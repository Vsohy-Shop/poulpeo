package androidx.lifecycle;

import android.view.View;
import android.view.ViewParent;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;

/* compiled from: ViewTreeLifecycleOwner.kt */
final class ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$1 extends C12777p implements Function1<View, View> {
    public static final ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$1 INSTANCE = new ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$1();

    ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$1() {
        super(1);
    }

    public final View invoke(View view) {
        C12775o.m28639i(view, "currentView");
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }
}
