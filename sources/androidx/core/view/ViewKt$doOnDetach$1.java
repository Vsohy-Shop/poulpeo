package androidx.core.view;

import android.view.View;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;

/* compiled from: View.kt */
public final class ViewKt$doOnDetach$1 implements View.OnAttachStateChangeListener {
    final /* synthetic */ Function1<View, C11921v> $action;
    final /* synthetic */ View $this_doOnDetach;

    public ViewKt$doOnDetach$1(View view, Function1<? super View, C11921v> function1) {
        this.$this_doOnDetach = view;
        this.$action = function1;
    }

    public void onViewAttachedToWindow(View view) {
        C12775o.m28639i(view, "view");
    }

    public void onViewDetachedFromWindow(View view) {
        C12775o.m28639i(view, "view");
        this.$this_doOnDetach.removeOnAttachStateChangeListener(this);
        this.$action.invoke(view);
    }
}
