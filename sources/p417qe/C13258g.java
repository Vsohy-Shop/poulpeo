package p417qe;

import p307af.C10885a;
import p341fe.C11945b;
import p341fe.C11946c;
import p341fe.C11947d;
import p361ie.C12141b;
import p364io.reactivex.exceptions.CompositeException;
import p369je.C12620a;
import p384le.C12850a;
import p384le.C12853d;
import p391me.C12936b;
import p391me.C12937c;

/* renamed from: qe.g */
/* compiled from: CompletablePeek */
public final class C13258g extends C11945b {

    /* renamed from: b */
    final C11947d f21144b;

    /* renamed from: c */
    final C12853d<? super C12141b> f21145c;

    /* renamed from: d */
    final C12853d<? super Throwable> f21146d;

    /* renamed from: e */
    final C12850a f21147e;

    /* renamed from: f */
    final C12850a f21148f;

    /* renamed from: g */
    final C12850a f21149g;

    /* renamed from: h */
    final C12850a f21150h;

    /* renamed from: qe.g$a */
    /* compiled from: CompletablePeek */
    final class C13259a implements C11946c, C12141b {

        /* renamed from: b */
        final C11946c f21151b;

        /* renamed from: c */
        C12141b f21152c;

        C13259a(C11946c cVar) {
            this.f21151b = cVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo52907a() {
            try {
                C13258g.this.f21149g.run();
            } catch (Throwable th) {
                C12620a.m28007b(th);
                C10885a.m23270q(th);
            }
        }

        /* renamed from: b */
        public void mo49188b() {
            if (this.f21152c != C12936b.DISPOSED) {
                try {
                    C13258g.this.f21147e.run();
                    C13258g.this.f21148f.run();
                    this.f21151b.mo49188b();
                    mo52907a();
                } catch (Throwable th) {
                    C12620a.m28007b(th);
                    this.f21151b.onError(th);
                }
            }
        }

        /* renamed from: c */
        public void mo49189c(C12141b bVar) {
            try {
                C13258g.this.f21145c.accept(bVar);
                if (C12936b.m29227g(this.f21152c, bVar)) {
                    this.f21152c = bVar;
                    this.f21151b.mo49189c(this);
                }
            } catch (Throwable th) {
                C12620a.m28007b(th);
                bVar.dispose();
                this.f21152c = C12936b.DISPOSED;
                C12937c.m29231d(th, this.f21151b);
            }
        }

        public void dispose() {
            try {
                C13258g.this.f21150h.run();
            } catch (Throwable th) {
                C12620a.m28007b(th);
                C10885a.m23270q(th);
            }
            this.f21152c.dispose();
        }

        public boolean isDisposed() {
            return this.f21152c.isDisposed();
        }

        public void onError(Throwable th) {
            if (this.f21152c == C12936b.DISPOSED) {
                C10885a.m23270q(th);
                return;
            }
            try {
                C13258g.this.f21146d.accept(th);
                C13258g.this.f21148f.run();
            } catch (Throwable th2) {
                C12620a.m28007b(th2);
                th = new CompositeException(th, th2);
            }
            this.f21151b.onError(th);
            mo52907a();
        }
    }

    public C13258g(C11947d dVar, C12853d<? super C12141b> dVar2, C12853d<? super Throwable> dVar3, C12850a aVar, C12850a aVar2, C12850a aVar3, C12850a aVar4) {
        this.f21144b = dVar;
        this.f21145c = dVar2;
        this.f21146d = dVar3;
        this.f21147e = aVar;
        this.f21148f = aVar2;
        this.f21149g = aVar3;
        this.f21150h = aVar4;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo49186p(C11946c cVar) {
        this.f21144b.mo49177a(new C13259a(cVar));
    }
}
