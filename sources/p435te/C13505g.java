package p435te;

import java.util.concurrent.atomic.AtomicReference;
import p307af.C10885a;
import p341fe.C11946c;
import p341fe.C11947d;
import p341fe.C11960p;
import p341fe.C11961q;
import p361ie.C12140a;
import p361ie.C12141b;
import p369je.C12620a;
import p384le.C12854e;
import p391me.C12936b;
import p397ne.C13016b;
import p411pe.C13207b;
import p471ze.C14108c;

/* renamed from: te.g */
/* compiled from: ObservableFlatMapCompletable */
public final class C13505g<T> extends C13494a<T, T> {

    /* renamed from: c */
    final C12854e<? super T, ? extends C11947d> f21724c;

    /* renamed from: d */
    final boolean f21725d;

    public C13505g(C11960p<T> pVar, C12854e<? super T, ? extends C11947d> eVar, boolean z) {
        super(pVar);
        this.f21724c = eVar;
        this.f21725d = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo46143s(C11961q<? super T> qVar) {
        this.f21682b.mo49249a(new C13506a(qVar, this.f21724c, this.f21725d));
    }

    /* renamed from: te.g$a */
    /* compiled from: ObservableFlatMapCompletable */
    static final class C13506a<T> extends C13207b<T> implements C11961q<T> {
        private static final long serialVersionUID = 8443155186132538303L;

        /* renamed from: b */
        final C11961q<? super T> f21726b;

        /* renamed from: c */
        final C14108c f21727c = new C14108c();

        /* renamed from: d */
        final C12854e<? super T, ? extends C11947d> f21728d;

        /* renamed from: e */
        final boolean f21729e;

        /* renamed from: f */
        final C12140a f21730f = new C12140a();

        /* renamed from: g */
        C12141b f21731g;

        /* renamed from: h */
        volatile boolean f21732h;

        /* renamed from: te.g$a$a */
        /* compiled from: ObservableFlatMapCompletable */
        final class C13507a extends AtomicReference<C12141b> implements C11946c, C12141b {
            private static final long serialVersionUID = 8606673141535671828L;

            C13507a() {
            }

            /* renamed from: b */
            public void mo49188b() {
                C13506a.this.mo53128e(this);
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
                C13506a.this.mo53129f(this, th);
            }
        }

        C13506a(C11961q<? super T> qVar, C12854e<? super T, ? extends C11947d> eVar, boolean z) {
            this.f21726b = qVar;
            this.f21728d = eVar;
            this.f21729e = z;
            lazySet(1);
        }

        /* renamed from: b */
        public void mo46139b() {
            if (decrementAndGet() == 0) {
                Throwable b = this.f21727c.mo53885b();
                if (b != null) {
                    this.f21726b.onError(b);
                } else {
                    this.f21726b.mo46139b();
                }
            }
        }

        /* renamed from: c */
        public void mo46140c(C12141b bVar) {
            if (C12936b.m29227g(this.f21731g, bVar)) {
                this.f21731g = bVar;
                this.f21726b.mo46140c(this);
            }
        }

        /* renamed from: d */
        public void mo46141d(T t) {
            try {
                C11947d dVar = (C11947d) C13016b.m29390d(this.f21728d.apply(t), "The mapper returned a null CompletableSource");
                getAndIncrement();
                C13507a aVar = new C13507a();
                if (!this.f21732h && this.f21730f.mo49583c(aVar)) {
                    dVar.mo49177a(aVar);
                }
            } catch (Throwable th) {
                C12620a.m28007b(th);
                this.f21731g.dispose();
                onError(th);
            }
        }

        public void dispose() {
            this.f21732h = true;
            this.f21731g.dispose();
            this.f21730f.dispose();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo53128e(C13506a<T>.a aVar) {
            this.f21730f.mo49581a(aVar);
            mo46139b();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo53129f(C13506a<T>.a aVar, Throwable th) {
            this.f21730f.mo49581a(aVar);
            onError(th);
        }

        /* renamed from: g */
        public int mo50862g(int i) {
            return i & 2;
        }

        public boolean isDisposed() {
            return this.f21731g.isDisposed();
        }

        public boolean isEmpty() {
            return true;
        }

        public void onError(Throwable th) {
            if (!this.f21727c.mo53884a(th)) {
                C10885a.m23270q(th);
            } else if (!this.f21729e) {
                dispose();
                if (getAndSet(0) > 0) {
                    this.f21726b.onError(this.f21727c.mo53885b());
                }
            } else if (decrementAndGet() == 0) {
                this.f21726b.onError(this.f21727c.mo53885b());
            }
        }

        public T poll() {
            return null;
        }

        public void clear() {
        }
    }
}
