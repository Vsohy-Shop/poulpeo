package p466yf;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.C12741h;
import p331dg.C11820c0;
import p331dg.C11825f;
import p337eg.C11925b;
import p355hf.C12074d;
import p355hf.C12079g;
import p404of.C13088o;

/* renamed from: yf.m0 */
/* compiled from: CoroutineScope.kt */
public final class C13999m0 {
    /* renamed from: a */
    public static final C13995l0 m32447a(C12079g gVar) {
        if (gVar.get(C14054y1.f22970b0) == null) {
            gVar = gVar.plus(C13944d2.m32235b((C14054y1) null, 1, (Object) null));
        }
        return new C11825f(gVar);
    }

    /* renamed from: b */
    public static final C13995l0 m32448b() {
        return new C11825f(C14039u2.m32561b((C14054y1) null, 1, (Object) null).plus(C13933b1.m32212c()));
    }

    /* renamed from: c */
    public static final void m32449c(C13995l0 l0Var, CancellationException cancellationException) {
        C14054y1 y1Var = (C14054y1) l0Var.getCoroutineContext().get(C14054y1.f22970b0);
        if (y1Var != null) {
            y1Var.cancel(cancellationException);
            return;
        }
        throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + l0Var).toString());
    }

    /* renamed from: d */
    public static /* synthetic */ void m32450d(C13995l0 l0Var, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        m32449c(l0Var, cancellationException);
    }

    /* renamed from: e */
    public static final <R> Object m32451e(C13088o<? super C13995l0, ? super C12074d<? super R>, ? extends Object> oVar, C12074d<? super R> dVar) {
        C11820c0 c0Var = new C11820c0(dVar.getContext(), dVar);
        Object b = C11925b.m25730b(c0Var, c0Var, oVar);
        if (b == C12150d.m26492c()) {
            C12741h.m28573c(dVar);
        }
        return b;
    }

    /* renamed from: f */
    public static final void m32452f(C13995l0 l0Var) {
        C13934b2.m32224l(l0Var.getCoroutineContext());
    }

    /* renamed from: g */
    public static final boolean m32453g(C13995l0 l0Var) {
        C14054y1 y1Var = (C14054y1) l0Var.getCoroutineContext().get(C14054y1.f22970b0);
        if (y1Var != null) {
            return y1Var.mo45937a();
        }
        return true;
    }
}
