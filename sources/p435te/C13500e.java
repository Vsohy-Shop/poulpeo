package p435te;

import p341fe.C11960p;
import p341fe.C11961q;
import p384le.C12856g;
import p411pe.C13206a;

/* renamed from: te.e */
/* compiled from: ObservableFilter */
public final class C13500e<T> extends C13494a<T, T> {

    /* renamed from: c */
    final C12856g<? super T> f21695c;

    /* renamed from: te.e$a */
    /* compiled from: ObservableFilter */
    static final class C13501a<T> extends C13206a<T, T> {

        /* renamed from: g */
        final C12856g<? super T> f21696g;

        C13501a(C11961q<? super T> qVar, C12856g<? super T> gVar) {
            super(qVar);
            this.f21696g = gVar;
        }

        /* renamed from: d */
        public void mo46141d(T t) {
            if (this.f21017f == 0) {
                try {
                    if (this.f21696g.test(t)) {
                        this.f21013b.mo46141d(t);
                    }
                } catch (Throwable th) {
                    mo52859f(th);
                }
            } else {
                this.f21013b.mo46141d(null);
            }
        }

        /* renamed from: g */
        public int mo50862g(int i) {
            return mo52860h(i);
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        public T poll() {
            /*
                r2 = this;
            L_0x0000:
                oe.e<T> r0 = r2.f21015d
                java.lang.Object r0 = r0.poll()
                if (r0 == 0) goto L_0x0010
                le.g<? super T> r1 = r2.f21696g
                boolean r1 = r1.test(r0)
                if (r1 == 0) goto L_0x0000
            L_0x0010:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p435te.C13500e.C13501a.poll():java.lang.Object");
        }
    }

    public C13500e(C11960p<T> pVar, C12856g<? super T> gVar) {
        super(pVar);
        this.f21695c = gVar;
    }

    /* renamed from: s */
    public void mo46143s(C11961q<? super T> qVar) {
        this.f21682b.mo49249a(new C13501a(qVar, this.f21695c));
    }
}
