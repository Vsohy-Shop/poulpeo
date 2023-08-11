package p320cg;

import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.internal.C12775o;
import p308ag.C10886a;
import p308ag.C10912p;
import p314bg.C10962f;
import p314bg.C10967g;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p355hf.C12075e;
import p355hf.C12079g;
import p404of.C13088o;

/* renamed from: cg.f */
/* compiled from: ChannelFlow.kt */
public abstract class C11067f<S, T> extends C11063d<T> {

    /* renamed from: e */
    protected final C10962f<S> f17175e;

    @C12739f(mo50609c = "kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2", mo50610f = "ChannelFlow.kt", mo50611l = {152}, mo50612m = "invokeSuspend")
    /* renamed from: cg.f$a */
    /* compiled from: ChannelFlow.kt */
    static final class C11068a extends C12746l implements C13088o<C10967g<? super T>, C12074d<? super C11921v>, Object> {

        /* renamed from: h */
        int f17176h;

        /* renamed from: i */
        /* synthetic */ Object f17177i;

        /* renamed from: j */
        final /* synthetic */ C11067f<S, T> f17178j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11068a(C11067f<S, T> fVar, C12074d<? super C11068a> dVar) {
            super(2, dVar);
            this.f17178j = fVar;
        }

        public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
            C11068a aVar = new C11068a(this.f17178j, dVar);
            aVar.f17177i = obj;
            return aVar;
        }

        public final Object invoke(C10967g<? super T> gVar, C12074d<? super C11921v> dVar) {
            return ((C11068a) create(gVar, dVar)).invokeSuspend(C11921v.f18618a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C12150d.m26492c();
            int i = this.f17176h;
            if (i == 0) {
                C11910n.m25701b(obj);
                C11067f<S, T> fVar = this.f17178j;
                this.f17176h = 1;
                if (fVar.mo46165q((C10967g) this.f17177i, this) == c) {
                    return c;
                }
            } else if (i == 1) {
                C11910n.m25701b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C11921v.f18618a;
        }
    }

    public C11067f(C10962f<? extends S> fVar, C12079g gVar, int i, C10886a aVar) {
        super(gVar, i, aVar);
        this.f17175e = fVar;
    }

    /* renamed from: n */
    static /* synthetic */ <S, T> Object m23886n(C11067f<S, T> fVar, C10967g<? super T> gVar, C12074d<? super C11921v> dVar) {
        if (fVar.f17166c == -3) {
            C12079g context = dVar.getContext();
            C12079g plus = context.plus(fVar.f17165b);
            if (C12775o.m28634d(plus, context)) {
                Object q = fVar.mo46165q(gVar, dVar);
                if (q == C12150d.m26492c()) {
                    return q;
                }
                return C11921v.f18618a;
            }
            C12075e.C12077b bVar = C12075e.f18913W;
            if (C12775o.m28634d(plus.get(bVar), context.get(bVar))) {
                Object p = fVar.m23888p(gVar, plus, dVar);
                if (p == C12150d.m26492c()) {
                    return p;
                }
                return C11921v.f18618a;
            }
        }
        Object collect = super.collect(gVar, dVar);
        if (collect == C12150d.m26492c()) {
            return collect;
        }
        return C11921v.f18618a;
    }

    /* renamed from: o */
    static /* synthetic */ <S, T> Object m23887o(C11067f<S, T> fVar, C10912p<? super T> pVar, C12074d<? super C11921v> dVar) {
        Object q = fVar.mo46165q(new C11088r(pVar), dVar);
        if (q == C12150d.m26492c()) {
            return q;
        }
        return C11921v.f18618a;
    }

    /* renamed from: p */
    private final Object m23888p(C10967g<? super T> gVar, C12079g gVar2, C12074d<? super C11921v> dVar) {
        Object c = C11066e.m23884c(gVar2, C11066e.m23885d(gVar, dVar.getContext()), (Object) null, new C11068a(this, (C12074d<? super C11068a>) null), dVar, 4, (Object) null);
        if (c == C12150d.m26492c()) {
            return c;
        }
        return C11921v.f18618a;
    }

    public Object collect(C10967g<? super T> gVar, C12074d<? super C11921v> dVar) {
        return m23886n(this, gVar, dVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public Object mo46021h(C10912p<? super T> pVar, C12074d<? super C11921v> dVar) {
        return m23887o(this, pVar, dVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public abstract Object mo46165q(C10967g<? super T> gVar, C12074d<? super C11921v> dVar);

    public String toString() {
        return this.f17175e + " -> " + super.toString();
    }
}
