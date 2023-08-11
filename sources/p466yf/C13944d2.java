package p466yf;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p355hf.C12074d;
import p355hf.C12079g;
import p448vf.C13650g;
import p466yf.C14054y1;

@SourceDebugExtension({"SMAP\nJob.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Job.kt\nkotlinx/coroutines/JobKt__JobKt\n+ 2 CompletionHandler.kt\nkotlinx/coroutines/CompletionHandlerKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,685:1\n13#2:686\n1295#3,2:687\n1295#3,2:689\n1295#3,2:691\n1295#3,2:693\n*S KotlinDebug\n*F\n+ 1 Job.kt\nkotlinx/coroutines/JobKt__JobKt\n*L\n494#1:686\n521#1:687,2\n535#1:689,2\n629#1:691,2\n653#1:693,2\n*E\n"})
/* renamed from: yf.d2 */
/* compiled from: Job.kt */
final /* synthetic */ class C13944d2 {
    /* renamed from: a */
    public static final C14058z m32234a(C14054y1 y1Var) {
        return new C13929a2(y1Var);
    }

    /* renamed from: b */
    public static /* synthetic */ C14058z m32235b(C14054y1 y1Var, int i, Object obj) {
        if ((i & 1) != 0) {
            y1Var = null;
        }
        return C13934b2.m32213a(y1Var);
    }

    /* renamed from: c */
    public static final void m32236c(C12079g gVar, CancellationException cancellationException) {
        C14054y1 y1Var = (C14054y1) gVar.get(C14054y1.f22970b0);
        if (y1Var != null) {
            y1Var.cancel(cancellationException);
        }
    }

    /* renamed from: d */
    public static final void m32237d(C14054y1 y1Var, String str, Throwable th) {
        y1Var.cancel(C14000m1.m32454a(str, th));
    }

    /* renamed from: e */
    public static /* synthetic */ void m32238e(C12079g gVar, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        C13934b2.m32215c(gVar, cancellationException);
    }

    /* renamed from: f */
    public static /* synthetic */ void m32239f(C14054y1 y1Var, String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        C13934b2.m32216d(y1Var, str, th);
    }

    /* renamed from: g */
    public static final Object m32240g(C14054y1 y1Var, C12074d<? super C11921v> dVar) {
        C14054y1.C14055a.m32600a(y1Var, (CancellationException) null, 1, (Object) null);
        Object G = y1Var.mo53703G(dVar);
        if (G == C12150d.m26492c()) {
            return G;
        }
        return C11921v.f18618a;
    }

    /* renamed from: h */
    public static final void m32241h(C12079g gVar, CancellationException cancellationException) {
        C13650g<C14054y1> children;
        C14054y1 y1Var = (C14054y1) gVar.get(C14054y1.f22970b0);
        if (y1Var != null && (children = y1Var.getChildren()) != null) {
            for (C14054y1 cancel : children) {
                cancel.cancel(cancellationException);
            }
        }
    }

    /* renamed from: i */
    public static /* synthetic */ void m32242i(C12079g gVar, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        C13934b2.m32220h(gVar, cancellationException);
    }

    /* renamed from: j */
    public static final C13943d1 m32243j(C14054y1 y1Var, C13943d1 d1Var) {
        return y1Var.mo53704O(new C13955f1(d1Var));
    }

    /* renamed from: k */
    public static final void m32244k(C12079g gVar) {
        C14054y1 y1Var = (C14054y1) gVar.get(C14054y1.f22970b0);
        if (y1Var != null) {
            C13934b2.m32225m(y1Var);
        }
    }

    /* renamed from: l */
    public static final void m32245l(C14054y1 y1Var) {
        if (!y1Var.mo45937a()) {
            throw y1Var.mo53700A();
        }
    }

    /* renamed from: m */
    public static final C14054y1 m32246m(C12079g gVar) {
        C14054y1 y1Var = (C14054y1) gVar.get(C14054y1.f22970b0);
        if (y1Var != null) {
            return y1Var;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + gVar).toString());
    }

    /* renamed from: n */
    public static final boolean m32247n(C12079g gVar) {
        C14054y1 y1Var = (C14054y1) gVar.get(C14054y1.f22970b0);
        if (y1Var != null) {
            return y1Var.mo45937a();
        }
        return true;
    }
}
