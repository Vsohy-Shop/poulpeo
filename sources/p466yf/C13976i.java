package p466yf;

import kotlin.jvm.internal.SourceDebugExtension;
import p355hf.C12074d;
import p355hf.C12075e;
import p355hf.C12079g;
import p355hf.C12085h;
import p404of.C13088o;

@SourceDebugExtension({"SMAP\nBuilders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/BuildersKt__BuildersKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,102:1\n1#2:103\n*E\n"})
/* renamed from: yf.i */
/* compiled from: Builders.kt */
final /* synthetic */ class C13976i {
    /* renamed from: a */
    public static final <T> T m32393a(C12079g gVar, C13088o<? super C13995l0, ? super C12074d<? super T>, ? extends Object> oVar) {
        C12079g gVar2;
        C13974h1 h1Var;
        C13974h1 h1Var2;
        Thread currentThread = Thread.currentThread();
        C12075e eVar = (C12075e) gVar.get(C12075e.f18913W);
        if (eVar == null) {
            h1Var = C14047w2.f22961a.mo53812b();
            gVar2 = C13964g0.m32356e(C14020q1.f22944b, gVar.plus(h1Var));
        } else {
            C13974h1 h1Var3 = null;
            if (eVar instanceof C13974h1) {
                h1Var2 = (C13974h1) eVar;
            } else {
                h1Var2 = null;
            }
            if (h1Var2 != null) {
                if (h1Var2.mo53753E0()) {
                    h1Var3 = h1Var2;
                }
                if (h1Var3 != null) {
                    h1Var = h1Var3;
                    gVar2 = C13964g0.m32356e(C14020q1.f22944b, gVar);
                }
            }
            h1Var = C14047w2.f22961a.mo53811a();
            gVar2 = C13964g0.m32356e(C14020q1.f22944b, gVar);
        }
        C13953f fVar = new C13953f(gVar2, currentThread, h1Var);
        fVar.mo53665K0(C14004n0.DEFAULT, fVar, oVar);
        return fVar.mo53697L0();
    }

    /* renamed from: b */
    public static /* synthetic */ Object m32394b(C12079g gVar, C13088o oVar, int i, Object obj) {
        if ((i & 1) != 0) {
            gVar = C12085h.f18916b;
        }
        return C13970h.m32376e(gVar, oVar);
    }
}
