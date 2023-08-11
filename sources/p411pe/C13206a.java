package p411pe;

import p307af.C10885a;
import p341fe.C11961q;
import p361ie.C12141b;
import p369je.C12620a;
import p391me.C12936b;
import p403oe.C13068e;

/* renamed from: pe.a */
/* compiled from: BasicFuseableObserver */
public abstract class C13206a<T, R> implements C11961q<T>, C13068e<R> {

    /* renamed from: b */
    protected final C11961q<? super R> f21013b;

    /* renamed from: c */
    protected C12141b f21014c;

    /* renamed from: d */
    protected C13068e<T> f21015d;

    /* renamed from: e */
    protected boolean f21016e;

    /* renamed from: f */
    protected int f21017f;

    public C13206a(C11961q<? super R> qVar) {
        this.f21013b = qVar;
    }

    /* renamed from: b */
    public void mo46139b() {
        if (!this.f21016e) {
            this.f21016e = true;
            this.f21013b.mo46139b();
        }
    }

    /* renamed from: c */
    public final void mo46140c(C12141b bVar) {
        if (C12936b.m29227g(this.f21014c, bVar)) {
            this.f21014c = bVar;
            if (bVar instanceof C13068e) {
                this.f21015d = (C13068e) bVar;
            }
            if (mo52858e()) {
                this.f21013b.mo46140c(this);
                mo52857a();
            }
        }
    }

    public void clear() {
        this.f21015d.clear();
    }

    public void dispose() {
        this.f21014c.dispose();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo52858e() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo52859f(Throwable th) {
        C12620a.m28007b(th);
        this.f21014c.dispose();
        onError(th);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final int mo52860h(int i) {
        C13068e<T> eVar = this.f21015d;
        if (eVar == null || (i & 4) != 0) {
            return 0;
        }
        int g = eVar.mo50862g(i);
        if (g != 0) {
            this.f21017f = g;
        }
        return g;
    }

    public boolean isDisposed() {
        return this.f21014c.isDisposed();
    }

    public boolean isEmpty() {
        return this.f21015d.isEmpty();
    }

    public final boolean offer(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public void onError(Throwable th) {
        if (this.f21016e) {
            C10885a.m23270q(th);
            return;
        }
        this.f21016e = true;
        this.f21013b.onError(th);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo52857a() {
    }
}
