package androidx.activity;

import android.view.View;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;

/* renamed from: androidx.activity.ViewTreeOnBackPressedDispatcherOwner$findViewTreeOnBackPressedDispatcherOwner$2 */
/* compiled from: ViewTreeOnBackPressedDispatcherOwner.kt */
final class C0105x8c7c000b extends C12777p implements Function1<View, OnBackPressedDispatcherOwner> {
    public static final C0105x8c7c000b INSTANCE = new C0105x8c7c000b();

    C0105x8c7c000b() {
        super(1);
    }

    public final OnBackPressedDispatcherOwner invoke(View view) {
        C12775o.m28639i(view, "it");
        Object tag = view.getTag(C0100R.C0101id.view_tree_on_back_pressed_dispatcher_owner);
        if (tag instanceof OnBackPressedDispatcherOwner) {
            return (OnBackPressedDispatcherOwner) tag;
        }
        return null;
    }
}
