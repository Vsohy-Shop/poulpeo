package p429se;

import java.util.concurrent.atomic.AtomicReference;
import p341fe.C11955l;
import p341fe.C11957n;
import p341fe.C11962r;
import p361ie.C12141b;
import p391me.C12936b;

/* renamed from: se.o */
/* compiled from: MaybeObserveOn */
public final class C13425o<T> extends C13401a<T, T> {

    /* renamed from: c */
    final C11962r f21513c;

    /* renamed from: se.o$a */
    /* compiled from: MaybeObserveOn */
    static final class C13426a<T> extends AtomicReference<C12141b> implements C11955l<T>, C12141b, Runnable {
        private static final long serialVersionUID = 8571289934935992137L;

        /* renamed from: b */
        final C11955l<? super T> f21514b;

        /* renamed from: c */
        final C11962r f21515c;

        /* renamed from: d */
        T f21516d;

        /* renamed from: e */
        Throwable f21517e;

        C13426a(C11955l<? super T> lVar, C11962r rVar) {
            this.f21514b = lVar;
            this.f21515c = rVar;
        }

        /* renamed from: a */
        public void mo49245a(T t) {
            this.f21516d = t;
            C12936b.m29223c(this, this.f21515c.mo49263b(this));
        }

        /* renamed from: b */
        public void mo49246b() {
            C12936b.m29223c(this, this.f21515c.mo49263b(this));
        }

        /* renamed from: c */
        public void mo49247c(C12141b bVar) {
            if (C12936b.m29226f(this, bVar)) {
                this.f21514b.mo49247c(this);
            }
        }

        public void dispose() {
            C12936b.m29221a(this);
        }

        public boolean isDisposed() {
            return C12936b.m29222b((C12141b) get());
        }

        public void onError(Throwable th) {
            this.f21517e = th;
            C12936b.m29223c(this, this.f21515c.mo49263b(this));
        }

        public void run() {
            Throwable th = this.f21517e;
            if (th != null) {
                this.f21517e = null;
                this.f21514b.onError(th);
                return;
            }
            T t = this.f21516d;
            if (t != null) {
                this.f21516d = null;
                this.f21514b.mo49245a(t);
                return;
            }
            this.f21514b.mo49246b();
        }
    }

    public C13425o(C11957n<T> nVar, C11962r rVar) {
        super(nVar);
        this.f21513c = rVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo49236u(C11955l<? super T> lVar) {
        this.f21474b.mo49221a(new C13426a(lVar, this.f21513c));
    }
}
