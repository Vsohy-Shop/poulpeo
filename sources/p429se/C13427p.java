package p429se;

import java.util.concurrent.atomic.AtomicReference;
import p341fe.C11955l;
import p341fe.C11957n;
import p361ie.C12141b;
import p364io.reactivex.exceptions.CompositeException;
import p369je.C12620a;
import p384le.C12854e;
import p391me.C12936b;
import p397ne.C13016b;

/* renamed from: se.p */
/* compiled from: MaybeOnErrorNext */
public final class C13427p<T> extends C13401a<T, T> {

    /* renamed from: c */
    final C12854e<? super Throwable, ? extends C11957n<? extends T>> f21518c;

    /* renamed from: d */
    final boolean f21519d;

    /* renamed from: se.p$a */
    /* compiled from: MaybeOnErrorNext */
    static final class C13428a<T> extends AtomicReference<C12141b> implements C11955l<T>, C12141b {
        private static final long serialVersionUID = 2026620218879969836L;

        /* renamed from: b */
        final C11955l<? super T> f21520b;

        /* renamed from: c */
        final C12854e<? super Throwable, ? extends C11957n<? extends T>> f21521c;

        /* renamed from: d */
        final boolean f21522d;

        /* renamed from: se.p$a$a */
        /* compiled from: MaybeOnErrorNext */
        static final class C13429a<T> implements C11955l<T> {

            /* renamed from: b */
            final C11955l<? super T> f21523b;

            /* renamed from: c */
            final AtomicReference<C12141b> f21524c;

            C13429a(C11955l<? super T> lVar, AtomicReference<C12141b> atomicReference) {
                this.f21523b = lVar;
                this.f21524c = atomicReference;
            }

            /* renamed from: a */
            public void mo49245a(T t) {
                this.f21523b.mo49245a(t);
            }

            /* renamed from: b */
            public void mo49246b() {
                this.f21523b.mo49246b();
            }

            /* renamed from: c */
            public void mo49247c(C12141b bVar) {
                C12936b.m29226f(this.f21524c, bVar);
            }

            public void onError(Throwable th) {
                this.f21523b.onError(th);
            }
        }

        C13428a(C11955l<? super T> lVar, C12854e<? super Throwable, ? extends C11957n<? extends T>> eVar, boolean z) {
            this.f21520b = lVar;
            this.f21521c = eVar;
            this.f21522d = z;
        }

        /* renamed from: a */
        public void mo49245a(T t) {
            this.f21520b.mo49245a(t);
        }

        /* renamed from: b */
        public void mo49246b() {
            this.f21520b.mo49246b();
        }

        /* renamed from: c */
        public void mo49247c(C12141b bVar) {
            if (C12936b.m29226f(this, bVar)) {
                this.f21520b.mo49247c(this);
            }
        }

        public void dispose() {
            C12936b.m29221a(this);
        }

        public boolean isDisposed() {
            return C12936b.m29222b((C12141b) get());
        }

        public void onError(Throwable th) {
            if (this.f21522d || (th instanceof Exception)) {
                try {
                    C11957n nVar = (C11957n) C13016b.m29390d(this.f21521c.apply(th), "The resumeFunction returned a null MaybeSource");
                    C12936b.m29223c(this, (C12141b) null);
                    nVar.mo49221a(new C13429a(this.f21520b, this));
                } catch (Throwable th2) {
                    C12620a.m28007b(th2);
                    this.f21520b.onError(new CompositeException(th, th2));
                }
            } else {
                this.f21520b.onError(th);
            }
        }
    }

    public C13427p(C11957n<T> nVar, C12854e<? super Throwable, ? extends C11957n<? extends T>> eVar, boolean z) {
        super(nVar);
        this.f21518c = eVar;
        this.f21519d = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo49236u(C11955l<? super T> lVar) {
        this.f21474b.mo49221a(new C13428a(lVar, this.f21518c, this.f21519d));
    }
}
