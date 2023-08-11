package p355hf;

import kotlin.jvm.internal.C12775o;
import p355hf.C12079g;
import p404of.C13088o;

/* renamed from: hf.a */
/* compiled from: CoroutineContextImpl.kt */
public abstract class C12067a implements C12079g.C12082b {
    private final C12079g.C12084c<?> key;

    public C12067a(C12079g.C12084c<?> cVar) {
        C12775o.m28639i(cVar, "key");
        this.key = cVar;
    }

    public <R> R fold(R r, C13088o<? super R, ? super C12079g.C12082b, ? extends R> oVar) {
        return C12079g.C12082b.C12083a.m26262a(this, r, oVar);
    }

    public <E extends C12079g.C12082b> E get(C12079g.C12084c<E> cVar) {
        return C12079g.C12082b.C12083a.m26263b(this, cVar);
    }

    public C12079g.C12084c<?> getKey() {
        return this.key;
    }

    public C12079g minusKey(C12079g.C12084c<?> cVar) {
        return C12079g.C12082b.C12083a.m26264c(this, cVar);
    }

    public C12079g plus(C12079g gVar) {
        return C12079g.C12082b.C12083a.m26265d(this, gVar);
    }
}
