package p429se;

import p341fe.C11955l;
import p341fe.C11957n;
import p341fe.C11958o;
import p341fe.C11961q;
import p361ie.C12141b;
import p391me.C12936b;
import p411pe.C13209d;

/* renamed from: se.u */
/* compiled from: MaybeToObservable */
public final class C13440u<T> extends C11958o<T> {

    /* renamed from: b */
    final C11957n<T> f21546b;

    /* renamed from: se.u$a */
    /* compiled from: MaybeToObservable */
    static final class C13441a<T> extends C13209d<T> implements C11955l<T> {
        private static final long serialVersionUID = 7603343402964826922L;

        /* renamed from: d */
        C12141b f21547d;

        C13441a(C11961q<? super T> qVar) {
            super(qVar);
        }

        /* renamed from: a */
        public void mo49245a(T t) {
            mo52862f(t);
        }

        /* renamed from: b */
        public void mo49246b() {
            mo52861e();
        }

        /* renamed from: c */
        public void mo49247c(C12141b bVar) {
            if (C12936b.m29227g(this.f21547d, bVar)) {
                this.f21547d = bVar;
                this.f21018b.mo46140c(this);
            }
        }

        public void dispose() {
            super.dispose();
            this.f21547d.dispose();
        }

        public void onError(Throwable th) {
            mo52863h(th);
        }
    }

    public C13440u(C11957n<T> nVar) {
        this.f21546b = nVar;
    }

    /* renamed from: v */
    public static <T> C11955l<T> m30552v(C11961q<? super T> qVar) {
        return new C13441a(qVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo46143s(C11961q<? super T> qVar) {
        this.f21546b.mo49221a(m30552v(qVar));
    }
}
