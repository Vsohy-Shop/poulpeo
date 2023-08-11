package p435te;

import p341fe.C11960p;
import p341fe.C11961q;
import p361ie.C12141b;
import p391me.C12939e;

/* renamed from: te.m */
/* compiled from: ObservableSwitchIfEmpty */
public final class C13519m<T> extends C13494a<T, T> {

    /* renamed from: c */
    final C11960p<? extends T> f21759c;

    /* renamed from: te.m$a */
    /* compiled from: ObservableSwitchIfEmpty */
    static final class C13520a<T> implements C11961q<T> {

        /* renamed from: b */
        final C11961q<? super T> f21760b;

        /* renamed from: c */
        final C11960p<? extends T> f21761c;

        /* renamed from: d */
        final C12939e f21762d = new C12939e();

        /* renamed from: e */
        boolean f21763e = true;

        C13520a(C11961q<? super T> qVar, C11960p<? extends T> pVar) {
            this.f21760b = qVar;
            this.f21761c = pVar;
        }

        /* renamed from: b */
        public void mo46139b() {
            if (this.f21763e) {
                this.f21763e = false;
                this.f21761c.mo49249a(this);
                return;
            }
            this.f21760b.mo46139b();
        }

        /* renamed from: c */
        public void mo46140c(C12141b bVar) {
            this.f21762d.mo50868b(bVar);
        }

        /* renamed from: d */
        public void mo46141d(T t) {
            if (this.f21763e) {
                this.f21763e = false;
            }
            this.f21760b.mo46141d(t);
        }

        public void onError(Throwable th) {
            this.f21760b.onError(th);
        }
    }

    public C13519m(C11960p<T> pVar, C11960p<? extends T> pVar2) {
        super(pVar);
        this.f21759c = pVar2;
    }

    /* renamed from: s */
    public void mo46143s(C11961q<? super T> qVar) {
        C13520a aVar = new C13520a(qVar, this.f21759c);
        qVar.mo46140c(aVar.f21762d);
        this.f21682b.mo49249a(aVar);
    }
}
