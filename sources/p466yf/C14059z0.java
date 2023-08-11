package p466yf;

import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p331dg.C11831i;
import p331dg.C11836k0;
import p336ef.C11907m;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p355hf.C12079g;

@SourceDebugExtension({"SMAP\nDispatchedTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTaskKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 DispatchedContinuation.kt\nkotlinx/coroutines/internal/DispatchedContinuation\n+ 4 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n+ 5 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n1#1,220:1\n198#1,17:238\n1#2:221\n253#3:222\n254#3,2:233\n256#3:237\n107#4,10:223\n118#4,2:235\n61#5,2:255\n*S KotlinDebug\n*F\n+ 1 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTaskKt\n*L\n188#1:238,17\n176#1:222\n176#1:233,2\n176#1:237\n176#1:223,10\n176#1:235,2\n218#1:255,2\n*E\n"})
/* renamed from: yf.z0 */
/* compiled from: DispatchedTask.kt */
public final class C14059z0 {
    /* renamed from: a */
    public static final <T> void m32608a(C14053y0<? super T> y0Var, int i) {
        boolean z;
        C12074d<? super T> e = y0Var.mo48997e();
        if (i == 4) {
            z = true;
        } else {
            z = false;
        }
        if (z || !(e instanceof C11831i) || m32609b(i) != m32609b(y0Var.f22969d)) {
            m32611d(y0Var, e, z);
            return;
        }
        C13971h0 h0Var = ((C11831i) e).f18477e;
        C12079g context = e.getContext();
        if (h0Var.isDispatchNeeded(context)) {
            h0Var.dispatch(context, y0Var);
        } else {
            m32612e(y0Var);
        }
    }

    /* renamed from: b */
    public static final boolean m32609b(int i) {
        if (i == 1 || i == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static final boolean m32610c(int i) {
        if (i == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static final <T> void m32611d(C14053y0<? super T> y0Var, C12074d<? super T> dVar, boolean z) {
        Object obj;
        C13935b3<?> b3Var;
        Object m = y0Var.mo48998m();
        Throwable g = y0Var.mo53791g(m);
        if (g != null) {
            C11907m.C11908a aVar = C11907m.f18600b;
            obj = C11910n.m25700a(g);
        } else {
            C11907m.C11908a aVar2 = C11907m.f18600b;
            obj = y0Var.mo53792k(m);
        }
        Object a = C11907m.m25696a(obj);
        if (z) {
            C12775o.m28637g(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
            C11831i iVar = (C11831i) dVar;
            C12074d<T> dVar2 = iVar.f18478f;
            Object obj2 = iVar.f18480h;
            C12079g context = dVar2.getContext();
            Object c = C11836k0.m25499c(context, obj2);
            if (c != C11836k0.f18485a) {
                b3Var = C13964g0.m32358g(dVar2, context, c);
            } else {
                b3Var = null;
            }
            try {
                iVar.f18478f.resumeWith(a);
                C11921v vVar = C11921v.f18618a;
            } finally {
                if (b3Var == null || b3Var.mo53684L0()) {
                    C11836k0.m25497a(context, c);
                }
            }
        } else {
            dVar.resumeWith(a);
        }
    }

    /* renamed from: e */
    private static final void m32612e(C14053y0<?> y0Var) {
        C13974h1 b = C14047w2.f22961a.mo53812b();
        if (b.mo53749A0()) {
            b.mo53756w0(y0Var);
            return;
        }
        b.mo53758y0(true);
        try {
            m32611d(y0Var, y0Var.mo48997e(), true);
            do {
            } while (b.mo53752D0());
        } catch (Throwable th) {
            b.mo53755t0(true);
            throw th;
        }
        b.mo53755t0(true);
    }
}
