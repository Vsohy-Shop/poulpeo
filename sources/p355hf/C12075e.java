package p355hf;

import kotlin.jvm.internal.C12775o;
import p355hf.C12079g;

/* renamed from: hf.e */
/* compiled from: ContinuationInterceptor.kt */
public interface C12075e extends C12079g.C12082b {

    /* renamed from: W */
    public static final C12077b f18913W = C12077b.f18914b;

    /* renamed from: hf.e$a */
    /* compiled from: ContinuationInterceptor.kt */
    public static final class C12076a {
        /* renamed from: a */
        public static <E extends C12079g.C12082b> E m26256a(C12075e eVar, C12079g.C12084c<E> cVar) {
            C12775o.m28639i(cVar, "key");
            if (cVar instanceof C12068b) {
                C12068b bVar = (C12068b) cVar;
                if (!bVar.mo49502a(eVar.getKey())) {
                    return null;
                }
                E b = bVar.mo49503b(eVar);
                if (b instanceof C12079g.C12082b) {
                    return b;
                }
                return null;
            } else if (C12075e.f18913W != cVar) {
                return null;
            } else {
                C12775o.m28637g(eVar, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return eVar;
            }
        }

        /* renamed from: b */
        public static C12079g m26257b(C12075e eVar, C12079g.C12084c<?> cVar) {
            C12775o.m28639i(cVar, "key");
            if (cVar instanceof C12068b) {
                C12068b bVar = (C12068b) cVar;
                if (!bVar.mo49502a(eVar.getKey()) || bVar.mo49503b(eVar) == null) {
                    return eVar;
                }
                return C12085h.f18916b;
            } else if (C12075e.f18913W == cVar) {
                return C12085h.f18916b;
            } else {
                return eVar;
            }
        }
    }

    /* renamed from: hf.e$b */
    /* compiled from: ContinuationInterceptor.kt */
    public static final class C12077b implements C12079g.C12084c<C12075e> {

        /* renamed from: b */
        static final /* synthetic */ C12077b f18914b = new C12077b();

        private C12077b() {
        }
    }

    <T> C12074d<T> interceptContinuation(C12074d<? super T> dVar);

    void releaseInterceptedContinuation(C12074d<?> dVar);
}
