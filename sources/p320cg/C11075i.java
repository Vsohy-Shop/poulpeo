package p320cg;

import p355hf.C12079g;
import p404of.C13088o;

/* renamed from: cg.i */
/* compiled from: SafeCollector.kt */
public final class C11075i implements C12079g {

    /* renamed from: b */
    public final Throwable f17198b;

    /* renamed from: c */
    private final /* synthetic */ C12079g f17199c;

    public C11075i(Throwable th, C12079g gVar) {
        this.f17198b = th;
        this.f17199c = gVar;
    }

    public <R> R fold(R r, C13088o<? super R, ? super C12079g.C12082b, ? extends R> oVar) {
        return this.f17199c.fold(r, oVar);
    }

    public <E extends C12079g.C12082b> E get(C12079g.C12084c<E> cVar) {
        return this.f17199c.get(cVar);
    }

    public C12079g minusKey(C12079g.C12084c<?> cVar) {
        return this.f17199c.minusKey(cVar);
    }

    public C12079g plus(C12079g gVar) {
        return this.f17199c.plus(gVar);
    }
}
