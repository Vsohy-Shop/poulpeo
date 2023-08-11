package p429se;

import p341fe.C11955l;
import p341fe.C11957n;
import p361ie.C12141b;
import p369je.C12620a;
import p384le.C12856g;
import p391me.C12936b;

/* renamed from: se.e */
/* compiled from: MaybeFilter */
public final class C13406e<T> extends C13401a<T, T> {

    /* renamed from: c */
    final C12856g<? super T> f21481c;

    /* renamed from: se.e$a */
    /* compiled from: MaybeFilter */
    static final class C13407a<T> implements C11955l<T>, C12141b {

        /* renamed from: b */
        final C11955l<? super T> f21482b;

        /* renamed from: c */
        final C12856g<? super T> f21483c;

        /* renamed from: d */
        C12141b f21484d;

        C13407a(C11955l<? super T> lVar, C12856g<? super T> gVar) {
            this.f21482b = lVar;
            this.f21483c = gVar;
        }

        /* renamed from: a */
        public void mo49245a(T t) {
            try {
                if (this.f21483c.test(t)) {
                    this.f21482b.mo49245a(t);
                } else {
                    this.f21482b.mo49246b();
                }
            } catch (Throwable th) {
                C12620a.m28007b(th);
                this.f21482b.onError(th);
            }
        }

        /* renamed from: b */
        public void mo49246b() {
            this.f21482b.mo49246b();
        }

        /* renamed from: c */
        public void mo49247c(C12141b bVar) {
            if (C12936b.m29227g(this.f21484d, bVar)) {
                this.f21484d = bVar;
                this.f21482b.mo49247c(this);
            }
        }

        public void dispose() {
            C12141b bVar = this.f21484d;
            this.f21484d = C12936b.DISPOSED;
            bVar.dispose();
        }

        public boolean isDisposed() {
            return this.f21484d.isDisposed();
        }

        public void onError(Throwable th) {
            this.f21482b.onError(th);
        }
    }

    public C13406e(C11957n<T> nVar, C12856g<? super T> gVar) {
        super(nVar);
        this.f21481c = gVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo49236u(C11955l<? super T> lVar) {
        this.f21474b.mo49221a(new C13407a(lVar, this.f21481c));
    }
}
