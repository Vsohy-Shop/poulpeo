package p355hf;

import java.io.Serializable;
import kotlin.jvm.internal.C12775o;
import p355hf.C12079g;
import p404of.C13088o;

/* renamed from: hf.h */
/* compiled from: CoroutineContextImpl.kt */
public final class C12085h implements C12079g, Serializable {

    /* renamed from: b */
    public static final C12085h f18916b = new C12085h();
    private static final long serialVersionUID = 0;

    private C12085h() {
    }

    private final Object readResolve() {
        return f18916b;
    }

    public <R> R fold(R r, C13088o<? super R, ? super C12079g.C12082b, ? extends R> oVar) {
        C12775o.m28639i(oVar, "operation");
        return r;
    }

    public <E extends C12079g.C12082b> E get(C12079g.C12084c<E> cVar) {
        C12775o.m28639i(cVar, "key");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    public C12079g minusKey(C12079g.C12084c<?> cVar) {
        C12775o.m28639i(cVar, "key");
        return this;
    }

    public C12079g plus(C12079g gVar) {
        C12775o.m28639i(gVar, "context");
        return gVar;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }
}
