package p417qe;

import p341fe.C11945b;
import p341fe.C11946c;
import p341fe.C11947d;
import p361ie.C12141b;
import p364io.reactivex.exceptions.CompositeException;
import p369je.C12620a;
import p384le.C12854e;
import p391me.C12939e;

/* renamed from: qe.h */
/* compiled from: CompletableResumeNext */
public final class C13260h extends C11945b {

    /* renamed from: b */
    final C11947d f21154b;

    /* renamed from: c */
    final C12854e<? super Throwable, ? extends C11947d> f21155c;

    /* renamed from: qe.h$a */
    /* compiled from: CompletableResumeNext */
    final class C13261a implements C11946c {

        /* renamed from: b */
        final C11946c f21156b;

        /* renamed from: c */
        final C12939e f21157c;

        /* renamed from: qe.h$a$a */
        /* compiled from: CompletableResumeNext */
        final class C13262a implements C11946c {
            C13262a() {
            }

            /* renamed from: b */
            public void mo49188b() {
                C13261a.this.f21156b.mo49188b();
            }

            /* renamed from: c */
            public void mo49189c(C12141b bVar) {
                C13261a.this.f21157c.mo50868b(bVar);
            }

            public void onError(Throwable th) {
                C13261a.this.f21156b.onError(th);
            }
        }

        C13261a(C11946c cVar, C12939e eVar) {
            this.f21156b = cVar;
            this.f21157c = eVar;
        }

        /* renamed from: b */
        public void mo49188b() {
            this.f21156b.mo49188b();
        }

        /* renamed from: c */
        public void mo49189c(C12141b bVar) {
            this.f21157c.mo50868b(bVar);
        }

        public void onError(Throwable th) {
            try {
                C11947d dVar = (C11947d) C13260h.this.f21155c.apply(th);
                if (dVar == null) {
                    NullPointerException nullPointerException = new NullPointerException("The CompletableConsumable returned is null");
                    nullPointerException.initCause(th);
                    this.f21156b.onError(nullPointerException);
                    return;
                }
                dVar.mo49177a(new C13262a());
            } catch (Throwable th2) {
                C12620a.m28007b(th2);
                this.f21156b.onError(new CompositeException(th2, th));
            }
        }
    }

    public C13260h(C11947d dVar, C12854e<? super Throwable, ? extends C11947d> eVar) {
        this.f21154b = dVar;
        this.f21155c = eVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo49186p(C11946c cVar) {
        C12939e eVar = new C12939e();
        cVar.mo49189c(eVar);
        this.f21154b.mo49177a(new C13261a(cVar, eVar));
    }
}
