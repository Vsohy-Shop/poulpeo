package androidx.core.view;

import p336ef.C11921v;
import p404of.C13074a;

/* compiled from: View.kt */
public final class ViewKt$postDelayed$runnable$1 implements Runnable {
    final /* synthetic */ C13074a<C11921v> $action;

    public ViewKt$postDelayed$runnable$1(C13074a<C11921v> aVar) {
        this.$action = aVar;
    }

    public final void run() {
        this.$action.invoke();
    }
}
