package p429se;

import java.util.concurrent.atomic.AtomicReference;
import p341fe.C11945b;
import p341fe.C11946c;
import p341fe.C11947d;
import p341fe.C11955l;
import p341fe.C11957n;
import p361ie.C12141b;
import p369je.C12620a;
import p384le.C12854e;
import p391me.C12936b;
import p397ne.C13016b;

/* renamed from: se.g */
/* compiled from: MaybeFlatMapCompletable */
public final class C13410g<T> extends C11945b {

    /* renamed from: b */
    final C11957n<T> f21490b;

    /* renamed from: c */
    final C12854e<? super T, ? extends C11947d> f21491c;

    /* renamed from: se.g$a */
    /* compiled from: MaybeFlatMapCompletable */
    static final class C13411a<T> extends AtomicReference<C12141b> implements C11955l<T>, C11946c, C12141b {
        private static final long serialVersionUID = -2177128922851101253L;

        /* renamed from: b */
        final C11946c f21492b;

        /* renamed from: c */
        final C12854e<? super T, ? extends C11947d> f21493c;

        C13411a(C11946c cVar, C12854e<? super T, ? extends C11947d> eVar) {
            this.f21492b = cVar;
            this.f21493c = eVar;
        }

        /* renamed from: a */
        public void mo49245a(T t) {
            try {
                C11947d dVar = (C11947d) C13016b.m29390d(this.f21493c.apply(t), "The mapper returned a null CompletableSource");
                if (!isDisposed()) {
                    dVar.mo49177a(this);
                }
            } catch (Throwable th) {
                C12620a.m28007b(th);
                onError(th);
            }
        }

        /* renamed from: b */
        public void mo49246b() {
            this.f21492b.mo49188b();
        }

        /* renamed from: c */
        public void mo49247c(C12141b bVar) {
            C12936b.m29223c(this, bVar);
        }

        public void dispose() {
            C12936b.m29221a(this);
        }

        public boolean isDisposed() {
            return C12936b.m29222b((C12141b) get());
        }

        public void onError(Throwable th) {
            this.f21492b.onError(th);
        }
    }

    public C13410g(C11957n<T> nVar, C12854e<? super T, ? extends C11947d> eVar) {
        this.f21490b = nVar;
        this.f21491c = eVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo49186p(C11946c cVar) {
        C13411a aVar = new C13411a(cVar, this.f21491c);
        cVar.mo49189c(aVar);
        this.f21490b.mo49221a(aVar);
    }
}
