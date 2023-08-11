package p417qe;

import java.util.concurrent.atomic.AtomicInteger;
import p341fe.C11945b;
import p341fe.C11946c;
import p341fe.C11947d;
import p361ie.C12141b;
import p391me.C12939e;

/* renamed from: qe.a */
/* compiled from: CompletableConcatArray */
public final class C13250a extends C11945b {

    /* renamed from: b */
    final C11947d[] f21131b;

    /* renamed from: qe.a$a */
    /* compiled from: CompletableConcatArray */
    static final class C13251a extends AtomicInteger implements C11946c {
        private static final long serialVersionUID = -7965400327305809232L;

        /* renamed from: b */
        final C11946c f21132b;

        /* renamed from: c */
        final C11947d[] f21133c;

        /* renamed from: d */
        int f21134d;

        /* renamed from: e */
        final C12939e f21135e = new C12939e();

        C13251a(C11946c cVar, C11947d[] dVarArr) {
            this.f21132b = cVar;
            this.f21133c = dVarArr;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo52906a() {
            if (!this.f21135e.isDisposed() && getAndIncrement() == 0) {
                C11947d[] dVarArr = this.f21133c;
                while (!this.f21135e.isDisposed()) {
                    int i = this.f21134d;
                    this.f21134d = i + 1;
                    if (i == dVarArr.length) {
                        this.f21132b.mo49188b();
                        return;
                    }
                    dVarArr[i].mo49177a(this);
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        /* renamed from: b */
        public void mo49188b() {
            mo52906a();
        }

        /* renamed from: c */
        public void mo49189c(C12141b bVar) {
            this.f21135e.mo50867a(bVar);
        }

        public void onError(Throwable th) {
            this.f21132b.onError(th);
        }
    }

    public C13250a(C11947d[] dVarArr) {
        this.f21131b = dVarArr;
    }

    /* renamed from: p */
    public void mo49186p(C11946c cVar) {
        C13251a aVar = new C13251a(cVar, this.f21131b);
        cVar.mo49189c(aVar.f21135e);
        aVar.mo52906a();
    }
}
