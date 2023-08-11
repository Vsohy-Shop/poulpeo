package p429se;

import java.util.concurrent.atomic.AtomicReference;
import p341fe.C11955l;
import p341fe.C11957n;
import p361ie.C12141b;
import p391me.C12936b;

/* renamed from: se.s */
/* compiled from: MaybeSwitchIfEmpty */
public final class C13435s<T> extends C13401a<T, T> {

    /* renamed from: c */
    final C11957n<? extends T> f21539c;

    /* renamed from: se.s$a */
    /* compiled from: MaybeSwitchIfEmpty */
    static final class C13436a<T> extends AtomicReference<C12141b> implements C11955l<T>, C12141b {
        private static final long serialVersionUID = -2223459372976438024L;

        /* renamed from: b */
        final C11955l<? super T> f21540b;

        /* renamed from: c */
        final C11957n<? extends T> f21541c;

        /* renamed from: se.s$a$a */
        /* compiled from: MaybeSwitchIfEmpty */
        static final class C13437a<T> implements C11955l<T> {

            /* renamed from: b */
            final C11955l<? super T> f21542b;

            /* renamed from: c */
            final AtomicReference<C12141b> f21543c;

            C13437a(C11955l<? super T> lVar, AtomicReference<C12141b> atomicReference) {
                this.f21542b = lVar;
                this.f21543c = atomicReference;
            }

            /* renamed from: a */
            public void mo49245a(T t) {
                this.f21542b.mo49245a(t);
            }

            /* renamed from: b */
            public void mo49246b() {
                this.f21542b.mo49246b();
            }

            /* renamed from: c */
            public void mo49247c(C12141b bVar) {
                C12936b.m29226f(this.f21543c, bVar);
            }

            public void onError(Throwable th) {
                this.f21542b.onError(th);
            }
        }

        C13436a(C11955l<? super T> lVar, C11957n<? extends T> nVar) {
            this.f21540b = lVar;
            this.f21541c = nVar;
        }

        /* renamed from: a */
        public void mo49245a(T t) {
            this.f21540b.mo49245a(t);
        }

        /* renamed from: b */
        public void mo49246b() {
            C12141b bVar = (C12141b) get();
            if (bVar != C12936b.DISPOSED && compareAndSet(bVar, (Object) null)) {
                this.f21541c.mo49221a(new C13437a(this.f21540b, this));
            }
        }

        /* renamed from: c */
        public void mo49247c(C12141b bVar) {
            if (C12936b.m29226f(this, bVar)) {
                this.f21540b.mo49247c(this);
            }
        }

        public void dispose() {
            C12936b.m29221a(this);
        }

        public boolean isDisposed() {
            return C12936b.m29222b((C12141b) get());
        }

        public void onError(Throwable th) {
            this.f21540b.onError(th);
        }
    }

    public C13435s(C11957n<T> nVar, C11957n<? extends T> nVar2) {
        super(nVar);
        this.f21539c = nVar2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo49236u(C11955l<? super T> lVar) {
        this.f21474b.mo49221a(new C13436a(lVar, this.f21539c));
    }
}
