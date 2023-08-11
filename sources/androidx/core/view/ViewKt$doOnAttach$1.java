package androidx.core.view;

import android.view.View;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;

/* compiled from: View.kt */
public final class ViewKt$doOnAttach$1 implements View.OnAttachStateChangeListener {
    final /* synthetic */ Function1<View, C11921v> $action;
    final /* synthetic */ View $this_doOnAttach;

    public ViewKt$doOnAttach$1(View view, Function1<? super View, C11921v> function1) {
        this.$this_doOnAttach = view;
        this.$action = function1;
    }

    public void onViewAttachedToWindow(View view) {
        C12775o.m28639i(view, "view");
        this.$this_doOnAttach.removeOnAttachStateChangeListener(this);
        this.$action.invoke(view);
    }

    public void onViewDetachedFromWindow(View view) {
        C12775o.m28639i(view, "view");
    }
}
