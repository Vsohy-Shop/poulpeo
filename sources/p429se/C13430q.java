package p429se;

import p307af.C10885a;
import p341fe.C11955l;
import p341fe.C11957n;
import p361ie.C12141b;
import p364io.reactivex.exceptions.CompositeException;
import p369je.C12620a;
import p384le.C12850a;
import p384le.C12853d;
import p391me.C12936b;
import p391me.C12937c;

/* renamed from: se.q */
/* compiled from: MaybePeek */
public final class C13430q<T> extends C13401a<T, T> {

    /* renamed from: c */
    final C12853d<? super C12141b> f21525c;

    /* renamed from: d */
    final C12853d<? super T> f21526d;

    /* renamed from: e */
    final C12853d<? super Throwable> f21527e;

    /* renamed from: f */
    final C12850a f21528f;

    /* renamed from: g */
    final C12850a f21529g;

    /* renamed from: h */
    final C12850a f21530h;

    /* renamed from: se.q$a */
    /* compiled from: MaybePeek */
    static final class C13431a<T> implements C11955l<T>, C12141b {

        /* renamed from: b */
        final C11955l<? super T> f21531b;

        /* renamed from: c */
        final C13430q<T> f21532c;

        /* renamed from: d */
        C12141b f21533d;

        C13431a(C11955l<? super T> lVar, C13430q<T> qVar) {
            this.f21531b = lVar;
            this.f21532c = qVar;
        }

        /* renamed from: a */
        public void mo49245a(T t) {
            C12141b bVar = this.f21533d;
            C12936b bVar2 = C12936b.DISPOSED;
            if (bVar != bVar2) {
                try {
                    this.f21532c.f21526d.accept(t);
                    this.f21533d = bVar2;
                    this.f21531b.mo49245a(t);
                    mo53015d();
                } catch (Throwable th) {
                    C12620a.m28007b(th);
                    mo53016e(th);
                }
            }
        }

        /* renamed from: b */
        public void mo49246b() {
            C12141b bVar = this.f21533d;
            C12936b bVar2 = C12936b.DISPOSED;
            if (bVar != bVar2) {
                try {
                    this.f21532c.f21528f.run();
                    this.f21533d = bVar2;
                    this.f21531b.mo49246b();
                    mo53015d();
                } catch (Throwable th) {
                    C12620a.m28007b(th);
                    mo53016e(th);
                }
            }
        }

        /* renamed from: c */
        public void mo49247c(C12141b bVar) {
            if (C12936b.m29227g(this.f21533d, bVar)) {
                try {
                    this.f21532c.f21525c.accept(bVar);
                    this.f21533d = bVar;
                    this.f21531b.mo49247c(this);
                } catch (Throwable th) {
                    C12620a.m28007b(th);
                    bVar.dispose();
                    this.f21533d = C12936b.DISPOSED;
                    C12937c.m29232e(th, this.f21531b);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo53015d() {
            try {
                this.f21532c.f21529g.run();
            } catch (Throwable th) {
                C12620a.m28007b(th);
                C10885a.m23270q(th);
            }
        }

        public void dispose() {
            try {
                this.f21532c.f21530h.run();
            } catch (Throwable th) {
                C12620a.m28007b(th);
                C10885a.m23270q(th);
            }
            this.f21533d.dispose();
            this.f21533d = C12936b.DISPOSED;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo53016e(Throwable th) {
            try {
                this.f21532c.f21527e.accept(th);
            } catch (Throwable th2) {
                C12620a.m28007b(th2);
                th = new CompositeException(th, th2);
            }
            this.f21533d = C12936b.DISPOSED;
            this.f21531b.onError(th);
            mo53015d();
        }

        public boolean isDisposed() {
            return this.f21533d.isDisposed();
        }

        public void onError(Throwable th) {
            if (this.f21533d == C12936b.DISPOSED) {
                C10885a.m23270q(th);
            } else {
                mo53016e(th);
            }
        }
    }

    public C13430q(C11957n<T> nVar, C12853d<? super C12141b> dVar, C12853d<? super T> dVar2, C12853d<? super Throwable> dVar3, C12850a aVar, C12850a aVar2, C12850a aVar3) {
        super(nVar);
        this.f21525c = dVar;
        this.f21526d = dVar2;
        this.f21527e = dVar3;
        this.f21528f = aVar;
        this.f21529g = aVar2;
        this.f21530h = aVar3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo49236u(C11955l<? super T> lVar) {
        this.f21474b.mo49221a(new C13431a(lVar, this));
    }
}
