package p435te;

import p341fe.C11960p;
import p341fe.C11961q;
import p384le.C12854e;
import p397ne.C13016b;
import p411pe.C13206a;

/* renamed from: te.k */
/* compiled from: ObservableMap */
public final class C13514k<T, U> extends C13494a<T, U> {

    /* renamed from: c */
    final C12854e<? super T, ? extends U> f21753c;

    /* renamed from: te.k$a */
    /* compiled from: ObservableMap */
    static final class C13515a<T, U> extends C13206a<T, U> {

        /* renamed from: g */
        final C12854e<? super T, ? extends U> f21754g;

        C13515a(C11961q<? super U> qVar, C12854e<? super T, ? extends U> eVar) {
            super(qVar);
            this.f21754g = eVar;
        }

        /* renamed from: d */
        public void mo46141d(T t) {
            if (!this.f21016e) {
                if (this.f21017f != 0) {
                    this.f21013b.mo46141d(null);
                    return;
                }
                try {
                    this.f21013b.mo46141d(C13016b.m29390d(this.f21754g.apply(t), "The mapper function returned a null value."));
                } catch (Throwable th) {
                    mo52859f(th);
                }
            }
        }

        /* renamed from: g */
        public int mo50862g(int i) {
            return mo52860h(i);
        }

        public U poll() {
            T poll = this.f21015d.poll();
            if (poll != null) {
                return C13016b.m29390d(this.f21754g.apply(poll), "The mapper function returned a null value.");
            }
            return null;
        }
    }

    public C13514k(C11960p<T> pVar, C12854e<? super T, ? extends U> eVar) {
        super(pVar);
        this.f21753c = eVar;
    }

    /* renamed from: s */
    public void mo46143s(C11961q<? super U> qVar) {
        this.f21682b.mo49249a(new C13515a(qVar, this.f21753c));
    }
}
