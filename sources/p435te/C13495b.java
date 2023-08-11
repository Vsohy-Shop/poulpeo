package p435te;

import p307af.C10885a;
import p341fe.C11960p;
import p341fe.C11961q;
import p361ie.C12141b;
import p369je.C12620a;
import p384le.C12856g;
import p391me.C12936b;

/* renamed from: te.b */
/* compiled from: ObservableAny */
public final class C13495b<T> extends C13494a<T, Boolean> {

    /* renamed from: c */
    final C12856g<? super T> f21683c;

    /* renamed from: te.b$a */
    /* compiled from: ObservableAny */
    static final class C13496a<T> implements C11961q<T>, C12141b {

        /* renamed from: b */
        final C11961q<? super Boolean> f21684b;

        /* renamed from: c */
        final C12856g<? super T> f21685c;

        /* renamed from: d */
        C12141b f21686d;

        /* renamed from: e */
        boolean f21687e;

        C13496a(C11961q<? super Boolean> qVar, C12856g<? super T> gVar) {
            this.f21684b = qVar;
            this.f21685c = gVar;
        }

        /* renamed from: b */
        public void mo46139b() {
            if (!this.f21687e) {
                this.f21687e = true;
                this.f21684b.mo46141d(Boolean.FALSE);
                this.f21684b.mo46139b();
            }
        }

        /* renamed from: c */
        public void mo46140c(C12141b bVar) {
            if (C12936b.m29227g(this.f21686d, bVar)) {
                this.f21686d = bVar;
                this.f21684b.mo46140c(this);
            }
        }

        /* renamed from: d */
        public void mo46141d(T t) {
            if (!this.f21687e) {
                try {
                    if (this.f21685c.test(t)) {
                        this.f21687e = true;
                        this.f21686d.dispose();
                        this.f21684b.mo46141d(Boolean.TRUE);
                        this.f21684b.mo46139b();
                    }
                } catch (Throwable th) {
                    C12620a.m28007b(th);
                    this.f21686d.dispose();
                    onError(th);
                }
            }
        }

        public void dispose() {
            this.f21686d.dispose();
        }

        public boolean isDisposed() {
            return this.f21686d.isDisposed();
        }

        public void onError(Throwable th) {
            if (this.f21687e) {
                C10885a.m23270q(th);
                return;
            }
            this.f21687e = true;
            this.f21684b.onError(th);
        }
    }

    public C13495b(C11960p<T> pVar, C12856g<? super T> gVar) {
        super(pVar);
        this.f21683c = gVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo46143s(C11961q<? super Boolean> qVar) {
        this.f21682b.mo49249a(new C13496a(qVar, this.f21683c));
    }
}
