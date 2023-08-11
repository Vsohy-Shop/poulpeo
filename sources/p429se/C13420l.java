package p429se;

import p307af.C10885a;
import p341fe.C11953j;
import p341fe.C11955l;
import p341fe.C11957n;
import p341fe.C11965s;
import p341fe.C11966t;
import p361ie.C12141b;
import p391me.C12936b;
import p403oe.C13066c;

/* renamed from: se.l */
/* compiled from: MaybeIsEmptySingle */
public final class C13420l<T> extends C11965s<Boolean> implements C13066c<Boolean> {

    /* renamed from: b */
    final C11957n<T> f21505b;

    /* renamed from: se.l$a */
    /* compiled from: MaybeIsEmptySingle */
    static final class C13421a<T> implements C11955l<T>, C12141b {

        /* renamed from: b */
        final C11966t<? super Boolean> f21506b;

        /* renamed from: c */
        C12141b f21507c;

        C13421a(C11966t<? super Boolean> tVar) {
            this.f21506b = tVar;
        }

        /* renamed from: a */
        public void mo49245a(T t) {
            this.f21507c = C12936b.DISPOSED;
            this.f21506b.mo49277a(Boolean.FALSE);
        }

        /* renamed from: b */
        public void mo49246b() {
            this.f21507c = C12936b.DISPOSED;
            this.f21506b.mo49277a(Boolean.TRUE);
        }

        /* renamed from: c */
        public void mo49247c(C12141b bVar) {
            if (C12936b.m29227g(this.f21507c, bVar)) {
                this.f21507c = bVar;
                this.f21506b.mo49278c(this);
            }
        }

        public void dispose() {
            this.f21507c.dispose();
            this.f21507c = C12936b.DISPOSED;
        }

        public boolean isDisposed() {
            return this.f21507c.isDisposed();
        }

        public void onError(Throwable th) {
            this.f21507c = C12936b.DISPOSED;
            this.f21506b.onError(th);
        }
    }

    public C13420l(C11957n<T> nVar) {
        this.f21505b = nVar;
    }

    /* renamed from: c */
    public C11953j<Boolean> mo50967c() {
        return C10885a.m23265l(new C13418k(this.f21505b));
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo49275k(C11966t<? super Boolean> tVar) {
        this.f21505b.mo49221a(new C13421a(tVar));
    }
}
