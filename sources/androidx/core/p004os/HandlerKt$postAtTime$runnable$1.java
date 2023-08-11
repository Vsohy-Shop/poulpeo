package androidx.core.p004os;

import p336ef.C11921v;
import p404of.C13074a;

/* renamed from: androidx.core.os.HandlerKt$postAtTime$runnable$1 */
/* compiled from: Handler.kt */
public final class HandlerKt$postAtTime$runnable$1 implements Runnable {
    final /* synthetic */ C13074a<C11921v> $action;

    public HandlerKt$postAtTime$runnable$1(C13074a<C11921v> aVar) {
        this.$action = aVar;
    }

    public final void run() {
        this.$action.invoke();
    }
}
