package p441ue;

import p341fe.C11965s;
import p341fe.C11966t;
import p341fe.C11967u;
import p361ie.C12141b;
import p369je.C12620a;
import p384le.C12853d;

/* renamed from: ue.b */
/* compiled from: SingleDoOnSuccess */
public final class C13582b<T> extends C11965s<T> {

    /* renamed from: b */
    final C11967u<T> f21842b;

    /* renamed from: c */
    final C12853d<? super T> f21843c;

    /* renamed from: ue.b$a */
    /* compiled from: SingleDoOnSuccess */
    final class C13583a implements C11966t<T> {

        /* renamed from: b */
        private final C11966t<? super T> f21844b;

        C13583a(C11966t<? super T> tVar) {
            this.f21844b = tVar;
        }

        /* renamed from: a */
        public void mo49277a(T t) {
            try {
                C13582b.this.f21843c.accept(t);
                this.f21844b.mo49277a(t);
            } catch (Throwable th) {
                C12620a.m28007b(th);
                this.f21844b.onError(th);
            }
        }

        /* renamed from: c */
        public void mo49278c(C12141b bVar) {
            this.f21844b.mo49278c(bVar);
        }

        public void onError(Throwable th) {
            this.f21844b.onError(th);
        }
    }

    public C13582b(C11967u<T> uVar, C12853d<? super T> dVar) {
        this.f21842b = uVar;
        this.f21843c = dVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo49275k(C11966t<? super T> tVar) {
        this.f21842b.mo49269a(new C13583a(tVar));
    }
}
