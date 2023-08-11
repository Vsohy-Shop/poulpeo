package p429se;

import java.util.concurrent.Callable;
import p307af.C10885a;
import p341fe.C11953j;
import p341fe.C11955l;
import p361ie.C12141b;
import p361ie.C12142c;
import p369je.C12620a;

/* renamed from: se.i */
/* compiled from: MaybeFromCallable */
public final class C13415i<T> extends C11953j<T> implements Callable<T> {

    /* renamed from: b */
    final Callable<? extends T> f21499b;

    public C13415i(Callable<? extends T> callable) {
        this.f21499b = callable;
    }

    public T call() {
        return this.f21499b.call();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo49236u(C11955l<? super T> lVar) {
        C12141b b = C12142c.m26481b();
        lVar.mo49247c(b);
        if (!b.isDisposed()) {
            try {
                Object call = this.f21499b.call();
                if (b.isDisposed()) {
                    return;
                }
                if (call == null) {
                    lVar.mo49246b();
                } else {
                    lVar.mo49245a(call);
                }
            } catch (Throwable th) {
                C12620a.m28007b(th);
                if (!b.isDisposed()) {
                    lVar.onError(th);
                } else {
                    C10885a.m23270q(th);
                }
            }
        }
    }
}
