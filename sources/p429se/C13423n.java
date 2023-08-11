package p429se;

import p341fe.C11955l;
import p341fe.C11957n;
import p361ie.C12141b;
import p369je.C12620a;
import p384le.C12854e;
import p391me.C12936b;
import p397ne.C13016b;

/* renamed from: se.n */
/* compiled from: MaybeMap */
public final class C13423n<T, R> extends C13401a<T, R> {

    /* renamed from: c */
    final C12854e<? super T, ? extends R> f21509c;

    /* renamed from: se.n$a */
    /* compiled from: MaybeMap */
    static final class C13424a<T, R> implements C11955l<T>, C12141b {

        /* renamed from: b */
        final C11955l<? super R> f21510b;

        /* renamed from: c */
        final C12854e<? super T, ? extends R> f21511c;

        /* renamed from: d */
        C12141b f21512d;

        C13424a(C11955l<? super R> lVar, C12854e<? super T, ? extends R> eVar) {
            this.f21510b = lVar;
            this.f21511c = eVar;
        }

        /* renamed from: a */
        public void mo49245a(T t) {
            try {
                this.f21510b.mo49245a(C13016b.m29390d(this.f21511c.apply(t), "The mapper returned a null item"));
            } catch (Throwable th) {
                C12620a.m28007b(th);
                this.f21510b.onError(th);
            }
        }

        /* renamed from: b */
        public void mo49246b() {
            this.f21510b.mo49246b();
        }

        /* renamed from: c */
        public void mo49247c(C12141b bVar) {
            if (C12936b.m29227g(this.f21512d, bVar)) {
                this.f21512d = bVar;
                this.f21510b.mo49247c(this);
            }
        }

        public void dispose() {
            C12141b bVar = this.f21512d;
            this.f21512d = C12936b.DISPOSED;
            bVar.dispose();
        }

        public boolean isDisposed() {
            return this.f21512d.isDisposed();
        }

        public void onError(Throwable th) {
            this.f21510b.onError(th);
        }
    }

    public C13423n(C11957n<T> nVar, C12854e<? super T, ? extends R> eVar) {
        super(nVar);
        this.f21509c = eVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo49236u(C11955l<? super R> lVar) {
        this.f21474b.mo49221a(new C13424a(lVar, this.f21509c));
    }
}
