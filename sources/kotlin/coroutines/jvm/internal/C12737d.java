package kotlin.coroutines.jvm.internal;

import kotlin.jvm.internal.C12775o;
import p355hf.C12074d;
import p355hf.C12075e;
import p355hf.C12079g;

/* renamed from: kotlin.coroutines.jvm.internal.d */
/* compiled from: ContinuationImpl.kt */
public abstract class C12737d extends C12734a {
    private final C12079g _context;
    private transient C12074d<Object> intercepted;

    public C12737d(C12074d<Object> dVar, C12079g gVar) {
        super(dVar);
        this._context = gVar;
    }

    public C12079g getContext() {
        C12079g gVar = this._context;
        C12775o.m28636f(gVar);
        return gVar;
    }

    public final C12074d<Object> intercepted() {
        C12074d<Object> dVar = this.intercepted;
        if (dVar == null) {
            C12075e eVar = (C12075e) getContext().get(C12075e.f18913W);
            if (eVar == null || (dVar = eVar.interceptContinuation(this)) == null) {
                dVar = this;
            }
            this.intercepted = dVar;
        }
        return dVar;
    }

    /* access modifiers changed from: protected */
    public void releaseIntercepted() {
        C12074d<Object> dVar = this.intercepted;
        if (!(dVar == null || dVar == this)) {
            C12079g.C12082b bVar = getContext().get(C12075e.f18913W);
            C12775o.m28636f(bVar);
            ((C12075e) bVar).releaseInterceptedContinuation(dVar);
        }
        this.intercepted = C12736c.f20393b;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C12737d(C12074d<Object> dVar) {
        this(dVar, dVar != null ? dVar.getContext() : null);
    }
}
