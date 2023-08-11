package p314bg;

import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import p308ag.C10886a;
import p320cg.C11080m;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p355hf.C12079g;
import p404of.C13088o;
import p466yf.C13995l0;
import p466yf.C14004n0;
import p466yf.C14054y1;

/* renamed from: bg.k */
/* compiled from: Collect.kt */
final /* synthetic */ class C10980k {

    @C12739f(mo50609c = "kotlinx.coroutines.flow.FlowKt__CollectKt$launchIn$1", mo50610f = "Collect.kt", mo50611l = {50}, mo50612m = "invokeSuspend")
    /* renamed from: bg.k$a */
    /* compiled from: Collect.kt */
    static final class C10981a extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {

        /* renamed from: h */
        int f16955h;

        /* renamed from: i */
        final /* synthetic */ C10962f<T> f16956i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10981a(C10962f<? extends T> fVar, C12074d<? super C10981a> dVar) {
            super(2, dVar);
            this.f16956i = fVar;
        }

        public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
            return new C10981a(this.f16956i, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C12150d.m26492c();
            int i = this.f16955h;
            if (i == 0) {
                C11910n.m25701b(obj);
                C10962f<T> fVar = this.f16956i;
                this.f16955h = 1;
                if (C10971h.m23598e(fVar, this) == c) {
                    return c;
                }
            } else if (i == 1) {
                C11910n.m25701b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C11921v.f18618a;
        }

        public final Object invoke(C13995l0 l0Var, C12074d<? super C11921v> dVar) {
            return ((C10981a) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
        }
    }

    /* renamed from: a */
    public static final Object m23637a(C10962f<?> fVar, C12074d<? super C11921v> dVar) {
        Object collect = fVar.collect(C11080m.f17202b, dVar);
        if (collect == C12150d.m26492c()) {
            return collect;
        }
        return C11921v.f18618a;
    }

    /* renamed from: b */
    public static final <T> Object m23638b(C10962f<? extends T> fVar, C13088o<? super T, ? super C12074d<? super C11921v>, ? extends Object> oVar, C12074d<? super C11921v> dVar) {
        Object e = C10971h.m23598e(C10983l.m23649b(C10971h.m23611r(fVar, oVar), 0, (C10886a) null, 2, (Object) null), dVar);
        if (e == C12150d.m26492c()) {
            return e;
        }
        return C11921v.f18618a;
    }

    /* renamed from: c */
    public static final <T> C14054y1 m23639c(C10962f<? extends T> fVar, C13995l0 l0Var) {
        return C13985j.m32422d(l0Var, (C12079g) null, (C14004n0) null, new C10981a(fVar, (C12074d<? super C10981a>) null), 3, (Object) null);
    }
}
