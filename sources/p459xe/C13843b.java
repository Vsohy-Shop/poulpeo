package p459xe;

import p307af.C10885a;
import p341fe.C11952i;
import p369je.C12620a;
import p386lg.C12860b;
import p386lg.C12861c;
import p403oe.C13070g;
import p465ye.C13925g;

/* renamed from: xe.b */
/* compiled from: BasicFuseableSubscriber */
public abstract class C13843b<T, R> implements C11952i<T>, C13070g<R> {

    /* renamed from: b */
    protected final C12860b<? super R> f22340b;

    /* renamed from: c */
    protected C12861c f22341c;

    /* renamed from: d */
    protected C13070g<T> f22342d;

    /* renamed from: e */
    protected boolean f22343e;

    /* renamed from: f */
    protected int f22344f;

    public C13843b(C12860b<? super R> bVar) {
        this.f22340b = bVar;
    }

    /* renamed from: b */
    public void mo50772b() {
        if (!this.f22343e) {
            this.f22343e = true;
            this.f22340b.mo50772b();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo53530c() {
        return true;
    }

    public void cancel() {
        this.f22341c.cancel();
    }

    public void clear() {
        this.f22342d.clear();
    }

    /* renamed from: e */
    public final void mo49220e(C12861c cVar) {
        if (C13925g.m32189i(this.f22341c, cVar)) {
            this.f22341c = cVar;
            if (cVar instanceof C13070g) {
                this.f22342d = (C13070g) cVar;
            }
            if (mo53530c()) {
                this.f22340b.mo49220e(this);
                mo53529a();
            }
        }
    }

    /* renamed from: h */
    public void mo50776h(long j) {
        this.f22341c.mo50776h(j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo53531i(Throwable th) {
        C12620a.m28007b(th);
        this.f22341c.cancel();
        onError(th);
    }

    public boolean isEmpty() {
        return this.f22342d.isEmpty();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final int mo53532j(int i) {
        C13070g<T> gVar = this.f22342d;
        if (gVar == null || (i & 4) != 0) {
            return 0;
        }
        int g = gVar.mo50862g(i);
        if (g != 0) {
            this.f22344f = g;
        }
        return g;
    }

    public final boolean offer(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public void onError(Throwable th) {
        if (this.f22343e) {
            C10885a.m23270q(th);
            return;
        }
        this.f22343e = true;
        this.f22340b.onError(th);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo53529a() {
    }
}
