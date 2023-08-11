package p337eg;

import kotlin.coroutines.jvm.internal.C12741h;
import kotlin.jvm.internal.C12772l0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.TimeoutCancellationException;
import p331dg.C11820c0;
import p331dg.C11836k0;
import p336ef.C11907m;
import p336ef.C11910n;
import p355hf.C12074d;
import p355hf.C12079g;
import p404of.C13088o;
import p466yf.C13932b0;
import p466yf.C13969g2;

@SourceDebugExtension({"SMAP\nUndispatched.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Undispatched.kt\nkotlinx/coroutines/intrinsics/UndispatchedKt\n+ 2 ProbesSupport.kt\nkotlinx/coroutines/internal/ProbesSupportKt\n+ 3 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n+ 4 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n1#1,127:1\n55#1:128\n56#1,11:130\n55#1:141\n56#1,2:143\n58#1,9:150\n55#1:159\n56#1,2:161\n58#1,9:168\n97#1,4:178\n114#1,6:182\n120#1,5:190\n97#1,4:195\n114#1,6:199\n120#1,5:207\n11#2:129\n11#2:142\n11#2:160\n11#2:177\n95#3,5:145\n95#3,5:163\n61#4,2:188\n61#4,2:205\n61#4,2:212\n61#4,2:214\n*S KotlinDebug\n*F\n+ 1 Undispatched.kt\nkotlinx/coroutines/intrinsics/UndispatchedKt\n*L\n18#1:128\n18#1:130,11\n29#1:141\n29#1:143,2\n29#1:150,9\n42#1:159\n42#1:161,2\n42#1:168,9\n77#1:178,4\n77#1:182,6\n77#1:190,5\n88#1:195,4\n88#1:199,6\n88#1:207,5\n18#1:129\n29#1:142\n42#1:160\n55#1:177\n30#1:145,5\n43#1:163,5\n77#1:188,2\n88#1:205,2\n119#1:212,2\n120#1:214,2\n*E\n"})
/* renamed from: eg.b */
/* compiled from: Undispatched.kt */
public final class C11925b {
    /* renamed from: a */
    public static final <R, T> void m25729a(C13088o<? super R, ? super C12074d<? super T>, ? extends Object> oVar, R r, C12074d<? super T> dVar) {
        C12079g context;
        Object c;
        C12074d<? super T> a = C12741h.m28571a(dVar);
        try {
            context = dVar.getContext();
            c = C11836k0.m25499c(context, (Object) null);
            Object invoke = ((C13088o) C12772l0.m28614f(oVar, 2)).invoke(r, a);
            C11836k0.m25497a(context, c);
            if (invoke != C12150d.m26492c()) {
                a.resumeWith(C11907m.m25696a(invoke));
            }
        } catch (Throwable th) {
            C11907m.C11908a aVar = C11907m.f18600b;
            a.resumeWith(C11907m.m25696a(C11910n.m25700a(th)));
        }
    }

    /* renamed from: b */
    public static final <T, R> Object m25730b(C11820c0<? super T> c0Var, R r, C13088o<? super R, ? super C12074d<? super T>, ? extends Object> oVar) {
        Object obj;
        try {
            obj = ((C13088o) C12772l0.m28614f(oVar, 2)).invoke(r, c0Var);
        } catch (Throwable th) {
            obj = new C13932b0(th, false, 2, (DefaultConstructorMarker) null);
        }
        if (obj == C12150d.m26492c()) {
            return C12150d.m26492c();
        }
        Object h0 = c0Var.mo53715h0(obj);
        if (h0 == C13969g2.f22896b) {
            return C12150d.m26492c();
        }
        if (!(h0 instanceof C13932b0)) {
            return C13969g2.m32371h(h0);
        }
        throw ((C13932b0) h0).f22850a;
    }

    /* renamed from: c */
    public static final <T, R> Object m25731c(C11820c0<? super T> c0Var, R r, C13088o<? super R, ? super C12074d<? super T>, ? extends Object> oVar) {
        Object obj;
        boolean z = false;
        try {
            obj = ((C13088o) C12772l0.m28614f(oVar, 2)).invoke(r, c0Var);
        } catch (Throwable th) {
            obj = new C13932b0(th, false, 2, (DefaultConstructorMarker) null);
        }
        if (obj == C12150d.m26492c()) {
            return C12150d.m26492c();
        }
        Object h0 = c0Var.mo53715h0(obj);
        if (h0 == C13969g2.f22896b) {
            return C12150d.m26492c();
        }
        if (h0 instanceof C13932b0) {
            Throwable th2 = ((C13932b0) h0).f22850a;
            if (!(th2 instanceof TimeoutCancellationException) || ((TimeoutCancellationException) th2).f20428b != c0Var) {
                z = true;
            }
            if (z) {
                throw th2;
            } else if (obj instanceof C13932b0) {
                throw ((C13932b0) obj).f22850a;
            }
        } else {
            obj = C13969g2.m32371h(h0);
        }
        return obj;
    }
}
