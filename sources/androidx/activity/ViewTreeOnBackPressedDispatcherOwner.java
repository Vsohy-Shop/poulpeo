package androidx.activity;

import android.view.View;
import kotlin.jvm.internal.C12775o;

/* compiled from: ViewTreeOnBackPressedDispatcherOwner.kt */
public final class ViewTreeOnBackPressedDispatcherOwner {
    public static final OnBackPressedDispatcherOwner get(View view) {
        C12775o.m28639i(view, "<this>");
        return (OnBackPressedDispatcherOwner) C13662o.m31283p(C13662o.m31288u(C13657m.m31272f(view, C0104x8c7c000a.INSTANCE), C0105x8c7c000b.INSTANCE));
    }

    public static final void set(View view, OnBackPressedDispatcherOwner onBackPressedDispatcherOwner) {
        C12775o.m28639i(view, "<this>");
        C12775o.m28639i(onBackPressedDispatcherOwner, "onBackPressedDispatcherOwner");
        view.setTag(C0100R.C0101id.view_tree_on_back_pressed_dispatcher_owner, onBackPressedDispatcherOwner);
    }
}
