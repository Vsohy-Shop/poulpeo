package p429se;

import java.util.concurrent.atomic.AtomicReference;
import p341fe.C11955l;
import p341fe.C11957n;
import p341fe.C11962r;
import p361ie.C12141b;
import p391me.C12936b;
import p391me.C12939e;

/* renamed from: se.r */
/* compiled from: MaybeSubscribeOn */
public final class C13432r<T> extends C13401a<T, T> {

    /* renamed from: c */
    final C11962r f21534c;

    /* renamed from: se.r$a */
    /* compiled from: MaybeSubscribeOn */
    static final class C13433a<T> extends AtomicReference<C12141b> implements C11955l<T>, C12141b {
        private static final long serialVersionUID = 8571289934935992137L;

        /* renamed from: b */
        final C12939e f21535b = new C12939e();

        /* renamed from: c */
        final C11955l<? super T> f21536c;

        C13433a(C11955l<? super T> lVar) {
            this.f21536c = lVar;
        }

        /* renamed from: a */
        public void mo49245a(T t) {
            this.f21536c.mo49245a(t);
        }

        /* renamed from: b */
        public void mo49246b() {
            this.f21536c.mo49246b();
        }

        /* renamed from: c */
        public void mo49247c(C12141b bVar) {
            C12936b.m29226f(this, bVar);
        }

        public void dispose() {
            C12936b.m29221a(this);
            this.f21535b.dispose();
        }

        public boolean isDisposed() {
            return C12936b.m29222b((C12141b) get());
        }

        public void onError(Throwable th) {
            this.f21536c.onError(th);
        }
    }

    /* renamed from: se.r$b */
    /* compiled from: MaybeSubscribeOn */
    static final class C13434b<T> implements Runnable {

        /* renamed from: b */
        final C11955l<? super T> f21537b;

        /* renamed from: c */
        final C11957n<T> f21538c;

        C13434b(C11955l<? super T> lVar, C11957n<T> nVar) {
            this.f21537b = lVar;
            this.f21538c = nVar;
        }

        public void run() {
            this.f21538c.mo49221a(this.f21537b);
        }
    }

    public C13432r(C11957n<T> nVar, C11962r rVar) {
        super(nVar);
        this.f21534c = rVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo49236u(C11955l<? super T> lVar) {
        C13433a aVar = new C13433a(lVar);
        lVar.mo49247c(aVar);
        aVar.f21535b.mo50867a(this.f21534c.mo49263b(new C13434b(aVar, this.f21474b)));
    }
}
