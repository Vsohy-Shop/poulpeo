package androidx.activity;

import android.view.View;
import android.view.ViewParent;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;

/* renamed from: androidx.activity.ViewTreeOnBackPressedDispatcherOwner$findViewTreeOnBackPressedDispatcherOwner$1 */
/* compiled from: ViewTreeOnBackPressedDispatcherOwner.kt */
final class C0104x8c7c000a extends C12777p implements Function1<View, View> {
    public static final C0104x8c7c000a INSTANCE = new C0104x8c7c000a();

    C0104x8c7c000a() {
        super(1);
    }

    public final View invoke(View view) {
        C12775o.m28639i(view, "it");
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }
}
