package p429se;

import p341fe.C11953j;
import p341fe.C11955l;
import p341fe.C11966t;
import p341fe.C11967u;
import p361ie.C12141b;
import p369je.C12620a;
import p384le.C12856g;
import p391me.C12936b;

/* renamed from: se.f */
/* compiled from: MaybeFilterSingle */
public final class C13408f<T> extends C11953j<T> {

    /* renamed from: b */
    final C11967u<T> f21485b;

    /* renamed from: c */
    final C12856g<? super T> f21486c;

    /* renamed from: se.f$a */
    /* compiled from: MaybeFilterSingle */
    static final class C13409a<T> implements C11966t<T>, C12141b {

        /* renamed from: b */
        final C11955l<? super T> f21487b;

        /* renamed from: c */
        final C12856g<? super T> f21488c;

        /* renamed from: d */
        C12141b f21489d;

        C13409a(C11955l<? super T> lVar, C12856g<? super T> gVar) {
            this.f21487b = lVar;
            this.f21488c = gVar;
        }

        /* renamed from: a */
        public void mo49277a(T t) {
            try {
                if (this.f21488c.test(t)) {
                    this.f21487b.mo49245a(t);
                } else {
                    this.f21487b.mo49246b();
                }
            } catch (Throwable th) {
                C12620a.m28007b(th);
                this.f21487b.onError(th);
            }
        }

        /* renamed from: c */
        public void mo49278c(C12141b bVar) {
            if (C12936b.m29227g(this.f21489d, bVar)) {
                this.f21489d = bVar;
                this.f21487b.mo49247c(this);
            }
        }

        public void dispose() {
            C12141b bVar = this.f21489d;
            this.f21489d = C12936b.DISPOSED;
            bVar.dispose();
        }

        public boolean isDisposed() {
            return this.f21489d.isDisposed();
        }

        public void onError(Throwable th) {
            this.f21487b.onError(th);
        }
    }

    public C13408f(C11967u<T> uVar, C12856g<? super T> gVar) {
        this.f21485b = uVar;
        this.f21486c = gVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo49236u(C11955l<? super T> lVar) {
        this.f21485b.mo49269a(new C13409a(lVar, this.f21486c));
    }
}
