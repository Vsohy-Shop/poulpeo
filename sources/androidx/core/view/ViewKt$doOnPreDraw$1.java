package androidx.core.view;

import android.view.View;
import kotlin.jvm.functions.Function1;
import p336ef.C11921v;

/* compiled from: View.kt */
public final class ViewKt$doOnPreDraw$1 implements Runnable {
    final /* synthetic */ Function1<View, C11921v> $action;
    final /* synthetic */ View $this_doOnPreDraw;

    public ViewKt$doOnPreDraw$1(Function1<? super View, C11921v> function1, View view) {
        this.$action = function1;
        this.$this_doOnPreDraw = view;
    }

    public final void run() {
        this.$action.invoke(this.$this_doOnPreDraw);
    }
}
