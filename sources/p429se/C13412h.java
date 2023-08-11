package p429se;

import java.util.concurrent.atomic.AtomicReference;
import p341fe.C11955l;
import p341fe.C11957n;
import p361ie.C12141b;
import p369je.C12620a;
import p384le.C12854e;
import p391me.C12936b;
import p397ne.C13016b;

/* renamed from: se.h */
/* compiled from: MaybeFlatten */
public final class C13412h<T, R> extends C13401a<T, R> {

    /* renamed from: c */
    final C12854e<? super T, ? extends C11957n<? extends R>> f21494c;

    /* renamed from: se.h$a */
    /* compiled from: MaybeFlatten */
    static final class C13413a<T, R> extends AtomicReference<C12141b> implements C11955l<T>, C12141b {
        private static final long serialVersionUID = 4375739915521278546L;

        /* renamed from: b */
        final C11955l<? super R> f21495b;

        /* renamed from: c */
        final C12854e<? super T, ? extends C11957n<? extends R>> f21496c;

        /* renamed from: d */
        C12141b f21497d;

        /* renamed from: se.h$a$a */
        /* compiled from: MaybeFlatten */
        final class C13414a implements C11955l<R> {
            C13414a() {
            }

            /* renamed from: a */
            public void mo49245a(R r) {
                C13413a.this.f21495b.mo49245a(r);
            }

            /* renamed from: b */
            public void mo49246b() {
                C13413a.this.f21495b.mo49246b();
            }

            /* renamed from: c */
            public void mo49247c(C12141b bVar) {
                C12936b.m29226f(C13413a.this, bVar);
            }

            public void onError(Throwable th) {
                C13413a.this.f21495b.onError(th);
            }
        }

        C13413a(C11955l<? super R> lVar, C12854e<? super T, ? extends C11957n<? extends R>> eVar) {
            this.f21495b = lVar;
            this.f21496c = eVar;
        }

        /* renamed from: a */
        public void mo49245a(T t) {
            try {
                C11957n nVar = (C11957n) C13016b.m29390d(this.f21496c.apply(t), "The mapper returned a null MaybeSource");
                if (!isDisposed()) {
                    nVar.mo49221a(new C13414a());
                }
            } catch (Exception e) {
                C12620a.m28007b(e);
                this.f21495b.onError(e);
            }
        }

        /* renamed from: b */
        public void mo49246b() {
            this.f21495b.mo49246b();
        }

        /* renamed from: c */
        public void mo49247c(C12141b bVar) {
            if (C12936b.m29227g(this.f21497d, bVar)) {
                this.f21497d = bVar;
                this.f21495b.mo49247c(this);
            }
        }

        public void dispose() {
            C12936b.m29221a(this);
            this.f21497d.dispose();
        }

        public boolean isDisposed() {
            return C12936b.m29222b((C12141b) get());
        }

        public void onError(Throwable th) {
            this.f21495b.onError(th);
        }
    }

    public C13412h(C11957n<T> nVar, C12854e<? super T, ? extends C11957n<? extends R>> eVar) {
        super(nVar);
        this.f21494c = eVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo49236u(C11955l<? super R> lVar) {
        this.f21474b.mo49221a(new C13413a(lVar, this.f21494c));
    }
}
