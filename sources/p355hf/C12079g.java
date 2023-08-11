package p355hf;

import com.rmn.api.p322v2.cloud.general.CloudMethodReturns;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p355hf.C12075e;
import p404of.C13088o;

/* renamed from: hf.g */
/* compiled from: CoroutineContext.kt */
public interface C12079g {

    /* renamed from: hf.g$a */
    /* compiled from: CoroutineContext.kt */
    public static final class C12080a {

        /* renamed from: hf.g$a$a */
        /* compiled from: CoroutineContext.kt */
        static final class C12081a extends C12777p implements C13088o<C12079g, C12082b, C12079g> {

            /* renamed from: g */
            public static final C12081a f18915g = new C12081a();

            C12081a() {
                super(2);
            }

            /* renamed from: a */
            public final C12079g invoke(C12079g gVar, C12082b bVar) {
                C12069c cVar;
                C12775o.m28639i(gVar, "acc");
                C12775o.m28639i(bVar, CloudMethodReturns.RETURN_KEYNAME_ELEMENT);
                C12079g minusKey = gVar.minusKey(bVar.getKey());
                C12085h hVar = C12085h.f18916b;
                if (minusKey == hVar) {
                    return bVar;
                }
                C12075e.C12077b bVar2 = C12075e.f18913W;
                C12075e eVar = (C12075e) minusKey.get(bVar2);
                if (eVar == null) {
                    cVar = new C12069c(minusKey, bVar);
                } else {
                    C12079g minusKey2 = minusKey.minusKey(bVar2);
                    if (minusKey2 == hVar) {
                        return new C12069c(bVar, eVar);
                    }
                    cVar = new C12069c(new C12069c(minusKey2, bVar), eVar);
                }
                return cVar;
            }
        }

        /* renamed from: a */
        public static C12079g m26260a(C12079g gVar, C12079g gVar2) {
            C12775o.m28639i(gVar2, "context");
            if (gVar2 == C12085h.f18916b) {
                return gVar;
            }
            return (C12079g) gVar2.fold(gVar, C12081a.f18915g);
        }
    }

    /* renamed from: hf.g$b */
    /* compiled from: CoroutineContext.kt */
    public interface C12082b extends C12079g {

        /* renamed from: hf.g$b$a */
        /* compiled from: CoroutineContext.kt */
        public static final class C12083a {
            /* renamed from: a */
            public static <R> R m26262a(C12082b bVar, R r, C13088o<? super R, ? super C12082b, ? extends R> oVar) {
                C12775o.m28639i(oVar, "operation");
                return oVar.invoke(r, bVar);
            }

            /* renamed from: b */
            public static <E extends C12082b> E m26263b(C12082b bVar, C12084c<E> cVar) {
                C12775o.m28639i(cVar, "key");
                if (!C12775o.m28634d(bVar.getKey(), cVar)) {
                    return null;
                }
                C12775o.m28637g(bVar, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                return bVar;
            }

            /* renamed from: c */
            public static C12079g m26264c(C12082b bVar, C12084c<?> cVar) {
                C12775o.m28639i(cVar, "key");
                if (C12775o.m28634d(bVar.getKey(), cVar)) {
                    return C12085h.f18916b;
                }
                return bVar;
            }

            /* renamed from: d */
            public static C12079g m26265d(C12082b bVar, C12079g gVar) {
                C12775o.m28639i(gVar, "context");
                return C12080a.m26260a(bVar, gVar);
            }
        }

        <E extends C12082b> E get(C12084c<E> cVar);

        C12084c<?> getKey();
    }

    /* renamed from: hf.g$c */
    /* compiled from: CoroutineContext.kt */
    public interface C12084c<E extends C12082b> {
    }

    <R> R fold(R r, C13088o<? super R, ? super C12082b, ? extends R> oVar);

    <E extends C12082b> E get(C12084c<E> cVar);

    C12079g minusKey(C12084c<?> cVar);

    C12079g plus(C12079g gVar);
}
