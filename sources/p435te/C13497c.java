package p435te;

import p307af.C10885a;
import p341fe.C11958o;
import p341fe.C11960p;
import p341fe.C11961q;
import p341fe.C11965s;
import p341fe.C11966t;
import p361ie.C12141b;
import p369je.C12620a;
import p384le.C12856g;
import p391me.C12936b;
import p403oe.C13067d;

/* renamed from: te.c */
/* compiled from: ObservableAnySingle */
public final class C13497c<T> extends C11965s<Boolean> implements C13067d<Boolean> {

    /* renamed from: b */
    final C11960p<T> f21688b;

    /* renamed from: c */
    final C12856g<? super T> f21689c;

    /* renamed from: te.c$a */
    /* compiled from: ObservableAnySingle */
    static final class C13498a<T> implements C11961q<T>, C12141b {

        /* renamed from: b */
        final C11966t<? super Boolean> f21690b;

        /* renamed from: c */
        final C12856g<? super T> f21691c;

        /* renamed from: d */
        C12141b f21692d;

        /* renamed from: e */
        boolean f21693e;

        C13498a(C11966t<? super Boolean> tVar, C12856g<? super T> gVar) {
            this.f21690b = tVar;
            this.f21691c = gVar;
        }

        /* renamed from: b */
        public void mo46139b() {
            if (!this.f21693e) {
                this.f21693e = true;
                this.f21690b.mo49277a(Boolean.FALSE);
            }
        }

        /* renamed from: c */
        public void mo46140c(C12141b bVar) {
            if (C12936b.m29227g(this.f21692d, bVar)) {
                this.f21692d = bVar;
                this.f21690b.mo49278c(this);
            }
        }

        /* renamed from: d */
        public void mo46141d(T t) {
            if (!this.f21693e) {
                try {
                    if (this.f21691c.test(t)) {
                        this.f21693e = true;
                        this.f21692d.dispose();
                        this.f21690b.mo49277a(Boolean.TRUE);
                    }
                } catch (Throwable th) {
                    C12620a.m28007b(th);
                    this.f21692d.dispose();
                    onError(th);
                }
            }
        }

        public void dispose() {
            this.f21692d.dispose();
        }

        public boolean isDisposed() {
            return this.f21692d.isDisposed();
        }

        public void onError(Throwable th) {
            if (this.f21693e) {
                C10885a.m23270q(th);
                return;
            }
            this.f21693e = true;
            this.f21690b.onError(th);
        }
    }

    public C13497c(C11960p<T> pVar, C12856g<? super T> gVar) {
        this.f21688b = pVar;
        this.f21689c = gVar;
    }

    /* renamed from: b */
    public C11958o<Boolean> mo50968b() {
        return C10885a.m23266m(new C13495b(this.f21688b, this.f21689c));
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo49275k(C11966t<? super Boolean> tVar) {
        this.f21688b.mo49249a(new C13498a(tVar, this.f21689c));
    }
}
