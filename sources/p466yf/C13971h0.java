package p466yf;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p331dg.C11831i;
import p331dg.C11844n;
import p331dg.C11847o;
import p355hf.C12067a;
import p355hf.C12068b;
import p355hf.C12074d;
import p355hf.C12075e;
import p355hf.C12079g;

/* renamed from: yf.h0 */
/* compiled from: CoroutineDispatcher.kt */
public abstract class C13971h0 extends C12067a implements C12075e {
    public static final C13972a Key = new C13972a((DefaultConstructorMarker) null);

    /* renamed from: yf.h0$a */
    /* compiled from: CoroutineDispatcher.kt */
    public static final class C13972a extends C12068b<C12075e, C13971h0> {

        /* renamed from: yf.h0$a$a */
        /* compiled from: CoroutineDispatcher.kt */
        static final class C13973a extends C12777p implements Function1<C12079g.C12082b, C13971h0> {

            /* renamed from: g */
            public static final C13973a f22902g = new C13973a();

            C13973a() {
                super(1);
            }

            /* renamed from: a */
            public final C13971h0 invoke(C12079g.C12082b bVar) {
                if (bVar instanceof C13971h0) {
                    return (C13971h0) bVar;
                }
                return null;
            }
        }

        public /* synthetic */ C13972a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C13972a() {
            super(C12075e.f18913W, C13973a.f22902g);
        }
    }

    public C13971h0() {
        super(C12075e.f18913W);
    }

    public abstract void dispatch(C12079g gVar, Runnable runnable);

    public void dispatchYield(C12079g gVar, Runnable runnable) {
        dispatch(gVar, runnable);
    }

    public <E extends C12079g.C12082b> E get(C12079g.C12084c<E> cVar) {
        return C12075e.C12076a.m26256a(this, cVar);
    }

    public final <T> C12074d<T> interceptContinuation(C12074d<? super T> dVar) {
        return new C11831i(this, dVar);
    }

    public boolean isDispatchNeeded(C12079g gVar) {
        return true;
    }

    public C13971h0 limitedParallelism(int i) {
        C11847o.m25529a(i);
        return new C11844n(this, i);
    }

    public C12079g minusKey(C12079g.C12084c<?> cVar) {
        return C12075e.C12076a.m26257b(this, cVar);
    }

    public final void releaseInterceptedContinuation(C12074d<?> dVar) {
        C12775o.m28637g(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        ((C11831i) dVar).mo49005u();
    }

    public String toString() {
        return C14015p0.m32518a(this) + '@' + C14015p0.m32519b(this);
    }

    public final C13971h0 plus(C13971h0 h0Var) {
        return h0Var;
    }
}
