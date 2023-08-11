package p417qe;

import p341fe.C11945b;
import p341fe.C11946c;
import p361ie.C12141b;
import p361ie.C12142c;
import p369je.C12620a;
import p384le.C12850a;

/* renamed from: qe.c */
/* compiled from: CompletableFromAction */
public final class C13253c extends C11945b {

    /* renamed from: b */
    final C12850a f21137b;

    public C13253c(C12850a aVar) {
        this.f21137b = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo49186p(C11946c cVar) {
        C12141b b = C12142c.m26481b();
        cVar.mo49189c(b);
        try {
            this.f21137b.run();
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
