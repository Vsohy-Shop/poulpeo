package p417qe;

import p341fe.C11945b;
import p341fe.C11946c;
import p341fe.C11947d;
import p361ie.C12141b;
import p364io.reactivex.exceptions.CompositeException;
import p369je.C12620a;
import p384le.C12856g;

/* renamed from: qe.f */
/* compiled from: CompletableOnErrorComplete */
public final class C13256f extends C11945b {

    /* renamed from: b */
    final C11947d f21140b;

    /* renamed from: c */
    final C12856g<? super Throwable> f21141c;

    /* renamed from: qe.f$a */
    /* compiled from: CompletableOnErrorComplete */
    final class C13257a implements C11946c {

        /* renamed from: b */
        private final C11946c f21142b;

        C13257a(C11946c cVar) {
            this.f21142b = cVar;
        }

        /* renamed from: b */
        public void mo49188b() {
            this.f21142b.mo49188b();
        }

        /* renamed from: c */
        public void mo49189c(C12141b bVar) {
            this.f21142b.mo49189c(bVar);
        }

        public void onError(Throwable th) {
            try {
                if (C13256f.this.f21141c.test(th)) {
                    this.f21142b.mo49188b();
                } else {
                    this.f21142b.onError(th);
                }
            } catch (Throwable th2) {
                C12620a.m28007b(th2);
                this.f21142b.onError(new CompositeException(th, th2));
            }
        }
    }

    public C13256f(C11947d dVar, C12856g<? super Throwable> gVar) {
        this.f21140b = dVar;
        this.f21141c = gVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo49186p(C11946c cVar) {
        this.f21140b.mo49177a(new C13257a(cVar));
    }
}
