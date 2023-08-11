package androidx.activity;

import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;

/* compiled from: OnBackPressedDispatcher.kt */
public final class OnBackPressedDispatcherKt {
    public static final OnBackPressedCallback addCallback(OnBackPressedDispatcher onBackPressedDispatcher, LifecycleOwner lifecycleOwner, boolean z, Function1<? super OnBackPressedCallback, C11921v> function1) {
        C12775o.m28639i(onBackPressedDispatcher, "<this>");
        C12775o.m28639i(function1, "onBackPressed");
        OnBackPressedDispatcherKt$addCallback$callback$1 onBackPressedDispatcherKt$addCallback$callback$1 = new OnBackPressedDispatcherKt$addCallback$callback$1(z, function1);
        if (lifecycleOwner != null) {
            onBackPressedDispatcher.addCallback(lifecycleOwner, onBackPressedDispatcherKt$addCallback$callback$1);
        } else {
            onBackPressedDispatcher.addCallback(onBackPressedDispatcherKt$addCallback$callback$1);
        }
        return onBackPressedDispatcherKt$addCallback$callback$1;
    }

    public static /* synthetic */ OnBackPressedCallback addCallback$default(OnBackPressedDispatcher onBackPressedDispatcher, LifecycleOwner lifecycleOwner, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            lifecycleOwner = null;
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return addCallback(onBackPressedDispatcher, lifecycleOwner, z, function1);
    }
}
