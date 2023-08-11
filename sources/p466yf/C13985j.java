package p466yf;

import kotlin.coroutines.jvm.internal.C12741h;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p331dg.C11820c0;
import p331dg.C11836k0;
import p336ef.C11921v;
import p337eg.C11924a;
import p337eg.C11925b;
import p355hf.C12074d;
import p355hf.C12075e;
import p355hf.C12079g;
import p355hf.C12085h;
import p404of.C13088o;

@SourceDebugExtension({"SMAP\nBuilders.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Builders.common.kt\nkotlinx/coroutines/BuildersKt__Builders_commonKt\n+ 2 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n*L\n1#1,270:1\n95#2,5:271\n*S KotlinDebug\n*F\n+ 1 Builders.common.kt\nkotlinx/coroutines/BuildersKt__Builders_commonKt\n*L\n166#1:271,5\n*E\n"})
/* renamed from: yf.j */
/* compiled from: Builders.common.kt */
final /* synthetic */ class C13985j {
    /* renamed from: a */
    public static final <T> C14027s0<T> m32419a(C13995l0 l0Var, C12079g gVar, C14004n0 n0Var, C13088o<? super C13995l0, ? super C12074d<? super T>, ? extends Object> oVar) {
        C14031t0 t0Var;
        C12079g e = C13964g0.m32356e(l0Var, gVar);
        if (n0Var.mo53784c()) {
            t0Var = new C13975h2(e, oVar);
        } else {
            t0Var = new C14031t0(e, true);
        }
        t0Var.mo53665K0(n0Var, t0Var, oVar);
        return t0Var;
    }

    /* renamed from: b */
    public static /* synthetic */ C14027s0 m32420b(C13995l0 l0Var, C12079g gVar, C14004n0 n0Var, C13088o oVar, int i, Object obj) {
        if ((i & 1) != 0) {
            gVar = C12085h.f18916b;
        }
        if ((i & 2) != 0) {
            n0Var = C14004n0.DEFAULT;
        }
        return C13970h.m32372a(l0Var, gVar, n0Var, oVar);
    }

    /* renamed from: c */
    public static final C14054y1 m32421c(C13995l0 l0Var, C12079g gVar, C14004n0 n0Var, C13088o<? super C13995l0, ? super C12074d<? super C11921v>, ? extends Object> oVar) {
        C13926a aVar;
        C12079g e = C13964g0.m32356e(l0Var, gVar);
        if (n0Var.mo53784c()) {
            aVar = new C13984i2(e, oVar);
        } else {
            aVar = new C14029s2(e, true);
        }
        aVar.mo53665K0(n0Var, aVar, oVar);
        return aVar;
    }

    /* renamed from: d */
    public static /* synthetic */ C14054y1 m32422d(C13995l0 l0Var, C12079g gVar, C14004n0 n0Var, C13088o oVar, int i, Object obj) {
        if ((i & 1) != 0) {
            gVar = C12085h.f18916b;
        }
        if ((i & 2) != 0) {
            n0Var = C14004n0.DEFAULT;
        }
        return C13970h.m32374c(l0Var, gVar, n0Var, oVar);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: e */
    public static final <T> Object m32423e(C12079g gVar, C13088o<? super C13995l0, ? super C12074d<? super T>, ? extends Object> oVar, C12074d<? super T> dVar) {
        Object obj;
        C12079g context = dVar.getContext();
        C12079g d = C13964g0.m32355d(context, gVar);
        C13934b2.m32224l(d);
        if (d == context) {
            C11820c0 c0Var = new C11820c0(d, dVar);
            obj = C11925b.m25730b(c0Var, c0Var, oVar);
        } else {
            C12075e.C12077b bVar = C12075e.f18913W;
            if (C12775o.m28634d(d.get(bVar), context.get(bVar))) {
                C13935b3 b3Var = new C13935b3(d, dVar);
                C12079g context2 = b3Var.getContext();
                Object c = C11836k0.m25499c(context2, (Object) null);
                try {
                    Object b = C11925b.m25730b(b3Var, b3Var, oVar);
                    C11836k0.m25497a(context2, c);
                    obj = b;
                } catch (Throwable th) {
                    C11836k0.m25497a(context2, c);
                    throw th;
                }
            } else {
                C14049x0 x0Var = new C14049x0(d, dVar);
                C11924a.m25728d(oVar, x0Var, x0Var, (Function1) null, 4, (Object) null);
                obj = x0Var.mo53815L0();
            }
        }
        if (obj == C12150d.m26492c()) {
            C12741h.m28573c(dVar);
        }
        return obj;
    }
}
