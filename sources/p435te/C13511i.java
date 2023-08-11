package p435te;

import java.util.Iterator;
import p341fe.C11958o;
import p341fe.C11961q;
import p369je.C12620a;
import p391me.C12937c;
import p397ne.C13016b;
import p411pe.C13208c;

/* renamed from: te.i */
/* compiled from: ObservableFromIterable */
public final class C13511i<T> extends C11958o<T> {

    /* renamed from: b */
    final Iterable<? extends T> f21745b;

    /* renamed from: te.i$a */
    /* compiled from: ObservableFromIterable */
    static final class C13512a<T> extends C13208c<T> {

        /* renamed from: b */
        final C11961q<? super T> f21746b;

        /* renamed from: c */
        final Iterator<? extends T> f21747c;

        /* renamed from: d */
        volatile boolean f21748d;

        /* renamed from: e */
        boolean f21749e;

        /* renamed from: f */
        boolean f21750f;

        /* renamed from: g */
        boolean f21751g;

        C13512a(C11961q<? super T> qVar, Iterator<? extends T> it) {
            this.f21746b = qVar;
            this.f21747c = it;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo53132a() {
            while (!isDisposed()) {
                try {
                    this.f21746b.mo46141d(C13016b.m29390d(this.f21747c.next(), "The iterator returned a null value"));
                    if (!isDisposed()) {
                        try {
                            if (!this.f21747c.hasNext()) {
                                if (!isDisposed()) {
                                    this.f21746b.mo46139b();
                                    return;
                                }
                                return;
                            }
                        } catch (Throwable th) {
                            C12620a.m28007b(th);
                            this.f21746b.onError(th);
                            return;
                        }
                    } else {
                        return;
                    }
                } catch (Throwable th2) {
                    C12620a.m28007b(th2);
                    this.f21746b.onError(th2);
                    return;
                }
            }
        }

        public void clear() {
            this.f21750f = true;
        }

        public void dispose() {
            this.f21748d = true;
        }

        /* renamed from: g */
        public int mo50862g(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            this.f21749e = true;
            return 1;
        }

        public boolean isDisposed() {
            return this.f21748d;
        }

        public boolean isEmpty() {
            return this.f21750f;
        }

        public T poll() {
            if (this.f21750f) {
                return null;
            }
            if (!this.f21751g) {
                this.f21751g = true;
            } else if (!this.f21747c.hasNext()) {
                this.f21750f = true;
                return null;
            }
            return C13016b.m29390d(this.f21747c.next(), "The iterator returned a null value");
        }
    }

    public C13511i(Iterable<? extends T> iterable) {
        this.f21745b = iterable;
    }

    /* renamed from: s */
    public void mo46143s(C11961q<? super T> qVar) {
        try {
            Iterator<? extends T> it = this.f21745b.iterator();
            try {
                if (!it.hasNext()) {
                    C12937c.m29230c(qVar);
                    return;
                }
                C13512a aVar = new C13512a(qVar, it);
                qVar.mo46140c(aVar);
                if (!aVar.f21749e) {
                    aVar.mo53132a();
                }
            } catch (Throwable th) {
                C12620a.m28007b(th);
                C12937c.m29233f(th, qVar);
            }
        } catch (Throwable th2) {
            C12620a.m28007b(th2);
            C12937c.m29233f(th2, qVar);
        }
    }
}
