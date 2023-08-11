package p459xe;

import p307af.C10885a;
import p369je.C12620a;
import p386lg.C12861c;
import p403oe.C13064a;
import p403oe.C13070g;
import p465ye.C13925g;

/* renamed from: xe.a */
/* compiled from: BasicFuseableConditionalSubscriber */
public abstract class C13842a<T, R> implements C13064a<T>, C13070g<R> {

    /* renamed from: b */
    protected final C13064a<? super R> f22335b;

    /* renamed from: c */
    protected C12861c f22336c;

    /* renamed from: d */
    protected C13070g<T> f22337d;

    /* renamed from: e */
    protected boolean f22338e;

    /* renamed from: f */
    protected int f22339f;

    public C13842a(C13064a<? super R> aVar) {
        this.f22335b = aVar;
    }

    /* renamed from: b */
    public void mo50772b() {
        if (!this.f22338e) {
            this.f22338e = true;
            this.f22335b.mo50772b();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo53526c() {
        return true;
    }

    public void cancel() {
        this.f22336c.cancel();
    }

    public void clear() {
        this.f22337d.clear();
    }

    /* renamed from: e */
    public final void mo49220e(C12861c cVar) {
        if (C13925g.m32189i(this.f22336c, cVar)) {
            this.f22336c = cVar;
            if (cVar instanceof C13070g) {
                this.f22337d = (C13070g) cVar;
            }
            if (mo53526c()) {
                this.f22335b.mo49220e(this);
                mo53525a();
            }
        }
    }

    /* renamed from: h */
    public void mo50776h(long j) {
        this.f22336c.mo50776h(j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo53527i(Throwable th) {
        C12620a.m28007b(th);
        this.f22336c.cancel();
        onError(th);
    }

    public boolean isEmpty() {
        return this.f22337d.isEmpty();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final int mo53528j(int i) {
        C13070g<T> gVar = this.f22337d;
        if (gVar == null || (i & 4) != 0) {
            return 0;
        }
        int g = gVar.mo50862g(i);
        if (g != 0) {
            this.f22339f = g;
        }
        return g;
    }

    public final boolean offer(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public void onError(Throwable th) {
        if (this.f22338e) {
            C10885a.m23270q(th);
            return;
        }
        this.f22338e = true;
        this.f22335b.onError(th);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo53525a() {
    }
}
