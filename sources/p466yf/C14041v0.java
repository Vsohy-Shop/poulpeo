package p466yf;

import androidx.core.location.LocationRequestCompat;
import kotlin.coroutines.jvm.internal.C12741h;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p355hf.C12074d;
import p355hf.C12075e;
import p355hf.C12079g;

@SourceDebugExtension({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/DelayKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,162:1\n314#2,11:163\n314#2,11:174\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/DelayKt\n*L\n106#1:163,11\n127#1:174,11\n*E\n"})
/* renamed from: yf.v0 */
/* compiled from: Delay.kt */
public final class C14041v0 {
    /* renamed from: a */
    public static final Object m32563a(long j, C12074d<? super C11921v> dVar) {
        if (j <= 0) {
            return C11921v.f18618a;
        }
        C14010o oVar = new C14010o(C12147c.m26491b(dVar), 1);
        oVar.mo53786B();
        if (j < LocationRequestCompat.PASSIVE_INTERVAL) {
            m32564b(oVar.getContext()).mo49020b(j, oVar);
        }
        Object y = oVar.mo53797y();
        if (y == C12150d.m26492c()) {
            C12741h.m28573c(dVar);
        }
        if (y == C12150d.m26492c()) {
            return y;
        }
        return C11921v.f18618a;
    }

    /* renamed from: b */
    public static final C14035u0 m32564b(C12079g gVar) {
        C14035u0 u0Var;
        C12079g.C12082b bVar = gVar.get(C12075e.f18913W);
        if (bVar instanceof C14035u0) {
            u0Var = (C14035u0) bVar;
        } else {
            u0Var = null;
        }
        if (u0Var == null) {
            return C14023r0.m32538a();
        }
        return u0Var;
    }
}
