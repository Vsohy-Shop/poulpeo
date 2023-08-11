package p417qe;

import java.util.concurrent.Callable;
import p341fe.C11945b;
import p341fe.C11946c;
import p361ie.C12141b;
import p361ie.C12142c;
import p369je.C12620a;

/* renamed from: qe.d */
/* compiled from: CompletableFromCallable */
public final class C13254d extends C11945b {

    /* renamed from: b */
    final Callable<?> f21138b;

    public C13254d(Callable<?> callable) {
        this.f21138b = callable;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo49186p(C11946c cVar) {
        C12141b b = C12142c.m26481b();
        cVar.mo49189c(b);
        try {
            this.f21138b.call();
            if (!b.isDisposed()) {
                cVar.mo49188b();
            }
        } catch (Throwable th) {
            C12620a.m28007b(th);
            if (!b.isDisposed()) {
                cVar.onError(th);
            }
        }
    }
}
