package p355hf;

import com.rmn.api.p322v2.cloud.general.CloudMethodReturns;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p355hf.C12079g;
import p355hf.C12079g.C12082b;

/* renamed from: hf.b */
/* compiled from: CoroutineContextImpl.kt */
public abstract class C12068b<B extends C12079g.C12082b, E extends B> implements C12079g.C12084c<E> {

    /* renamed from: b */
    private final Function1<C12079g.C12082b, E> f18904b;

    /* renamed from: c */
    private final C12079g.C12084c<?> f18905c;

    public C12068b(C12079g.C12084c<B> cVar, Function1<? super C12079g.C12082b, ? extends E> function1) {
        C12775o.m28639i(cVar, "baseKey");
        C12775o.m28639i(function1, "safeCast");
        this.f18904b = function1;
        this.f18905c = cVar instanceof C12068b ? ((C12068b) cVar).f18905c : cVar;
    }

    /* renamed from: a */
    public final boolean mo49502a(C12079g.C12084c<?> cVar) {
        C12775o.m28639i(cVar, "key");
        if (cVar == this || this.f18905c == cVar) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final E mo49503b(C12079g.C12082b bVar) {
        C12775o.m28639i(bVar, CloudMethodReturns.RETURN_KEYNAME_ELEMENT);
        return (C12079g.C12082b) this.f18904b.invoke(bVar);
    }
}
