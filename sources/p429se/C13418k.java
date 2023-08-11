package p429se;

import p341fe.C11955l;
import p341fe.C11957n;
import p361ie.C12141b;
import p391me.C12936b;

/* renamed from: se.k */
/* compiled from: MaybeIsEmpty */
public final class C13418k<T> extends C13401a<T, Boolean> {

    /* renamed from: se.k$a */
    /* compiled from: MaybeIsEmpty */
    static final class C13419a<T> implements C11955l<T>, C12141b {

        /* renamed from: b */
        final C11955l<? super Boolean> f21503b;

        /* renamed from: c */
        C12141b f21504c;

        C13419a(C11955l<? super Boolean> lVar) {
            this.f21503b = lVar;
        }

        /* renamed from: a */
        public void mo49245a(T t) {
            this.f21503b.mo49245a(Boolean.FALSE);
        }

        /* renamed from: b */
        public void mo49246b() {
            this.f21503b.mo49245a(Boolean.TRUE);
        }

        /* renamed from: c */
        public void mo49247c(C12141b bVar) {
            if (C12936b.m29227g(this.f21504c, bVar)) {
                this.f21504c = bVar;
                this.f21503b.mo49247c(this);
            }
        }

        public void dispose() {
            this.f21504c.dispose();
        }

        public boolean isDisposed() {
            return this.f21504c.isDisposed();
        }

        public void onError(Throwable th) {
            this.f21503b.onError(th);
        }
    }

    public C13418k(C11957n<T> nVar) {
        super(nVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo49236u(C11955l<? super Boolean> lVar) {
        this.f21474b.mo49221a(new C13419a(lVar));
    }
}
