package p435te;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p307af.C10885a;
import p341fe.C11945b;
import p341fe.C11946c;
import p341fe.C11947d;
import p341fe.C11958o;
import p341fe.C11960p;
import p341fe.C11961q;
import p361ie.C12140a;
import p361ie.C12141b;
import p369je.C12620a;
import p384le.C12854e;
import p391me.C12936b;
import p397ne.C13016b;
import p403oe.C13067d;
import p471ze.C14108c;

/* renamed from: te.h */
/* compiled from: ObservableFlatMapCompletableCompletable */
public final class C13508h<T> extends C11945b implements C13067d<T> {

    /* renamed from: b */
    final C11960p<T> f21734b;

    /* renamed from: c */
    final C12854e<? super T, ? extends C11947d> f21735c;

    /* renamed from: d */
    final boolean f21736d;

    /* renamed from: te.h$a */
    /* compiled from: ObservableFlatMapCompletableCompletable */
    static final class C13509a<T> extends AtomicInteger implements C12141b, C11961q<T> {
        private static final long serialVersionUID = 8443155186132538303L;

        /* renamed from: b */
        final C11946c f21737b;

        /* renamed from: c */
        final C14108c f21738c = new C14108c();

        /* renamed from: d */
        final C12854e<? super T, ? extends C11947d> f21739d;

        /* renamed from: e */
        final boolean f21740e;

        /* renamed from: f */
        final C12140a f21741f = new C12140a();

        /* renamed from: g */
        C12141b f21742g;

        /* renamed from: h */
        volatile boolean f21743h;

        /* renamed from: te.h$a$a */
        /* compiled from: ObservableFlatMapCompletableCompletable */
        final class C13510a extends AtomicReference<C12141b> implements C11946c, C12141b {
            private static final long serialVersionUID = 8606673141535671828L;

            C13510a() {
            }

            /* renamed from: b */
            public void mo49188b() {
                C13509a.this.mo53130a(this);
            }

            /* renamed from: c */
            public void mo49189c(C12141b bVar) {
                C12936b.m29226f(this, bVar);
            }

            public void dispose() {
                C12936b.m29221a(this);
            }

            public boolean isDisposed() {
                return C12936b.m29222b((C12141b) get());
            }

            public void onError(Throwable th) {
                C13509a.this.mo53131e(this, th);
            }
        }

        C13509a(C11946c cVar, C12854e<? super T, ? extends C11947d> eVar, boolean z) {
            this.f21737b = cVar;
            this.f21739d = eVar;
            this.f21740e = z;
            lazySet(1);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo53130a(C13509a<T>.a aVar) {
            this.f21741f.mo49581a(aVar);
            mo46139b();
        }

        /* renamed from: b */
        public void mo46139b() {
            if (decrementAndGet() == 0) {
                Throwable b = this.f21738c.mo53885b();
                if (b != null) {
                    this.f21737b.onError(b);
                } else {
                    this.f21737b.mo49188b();
                }
            }
        }

        /* renamed from: c */
        public void mo46140c(C12141b bVar) {
            if (C12936b.m29227g(this.f21742g, bVar)) {
                this.f21742g = bVar;
                this.f21737b.mo49189c(this);
            }
        }

        /* renamed from: d */
        public void mo46141d(T t) {
            try {
                C11947d dVar = (C11947d) C13016b.m29390d(this.f21739d.apply(t), "The mapper returned a null CompletableSource");
                getAndIncrement();
                C13510a aVar = new C13510a();
                if (!this.f21743h && this.f21741f.mo49583c(aVar)) {
                    dVar.mo49177a(aVar);
                }
            } catch (Throwable th) {
                C12620a.m28007b(th);
                this.f21742g.dispose();
                onError(th);
            }
        }

        public void dispose() {
            this.f21743h = true;
            this.f21742g.dispose();
            this.f21741f.dispose();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo53131e(C13509a<T>.a aVar, Throwable th) {
            this.f21741f.mo49581a(aVar);
            onError(th);
        }

        public boolean isDisposed() {
            return this.f21742g.isDisposed();
        }

        public void onError(Throwable th) {
            if (!this.f21738c.mo53884a(th)) {
                C10885a.m23270q(th);
            } else if (!this.f21740e) {
                dispose();
                if (getAndSet(0) > 0) {
                    this.f21737b.onError(this.f21738c.mo53885b());
                }
            } else if (decrementAndGet() == 0) {
                this.f21737b.onError(this.f21738c.mo53885b());
            }
        }
    }

    public C13508h(C11960p<T> pVar, C12854e<? super T, ? extends C11947d> eVar, boolean z) {
        this.f21734b = pVar;
        this.f21735c = eVar;
        this.f21736d = z;
    }

    /* renamed from: b */
    public C11958o<T> mo50968b() {
        return C10885a.m23266m(new C13505g(this.f21734b, this.f21735c, this.f21736d));
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo49186p(C11946c cVar) {
        this.f21734b.mo49249a(new C13509a(cVar, this.f21735c, this.f21736d));
    }
}
