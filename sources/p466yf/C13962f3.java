package p466yf;

import kotlin.coroutines.jvm.internal.C12741h;
import p331dg.C11831i;
import p331dg.C11833j;
import p336ef.C11921v;
import p355hf.C12074d;
import p355hf.C12079g;

/* renamed from: yf.f3 */
/* compiled from: Yield.kt */
public final class C13962f3 {
    /* renamed from: a */
    public static final Object m32350a(C12074d<? super C11921v> dVar) {
        C11831i iVar;
        Object obj;
        C12079g context = dVar.getContext();
        C13934b2.m32224l(context);
        C12074d b = C12147c.m26491b(dVar);
        if (b instanceof C11831i) {
            iVar = (C11831i) b;
        } else {
            iVar = null;
        }
        if (iVar == null) {
            obj = C11921v.f18618a;
        } else {
            if (iVar.f18477e.isDispatchNeeded(context)) {
                iVar.mo49001q(context, C11921v.f18618a);
            } else {
                C13951e3 e3Var = new C13951e3();
                C12079g plus = context.plus(e3Var);
                C11921v vVar = C11921v.f18618a;
                iVar.mo49001q(plus, vVar);
                if (e3Var.f22867b) {
                    if (C11833j.m25484d(iVar)) {
                        obj = C12150d.m26492c();
                    } else {
                        obj = vVar;
                    }
                }
            }
            obj = C12150d.m26492c();
        }
        if (obj == C12150d.m26492c()) {
            C12741h.m28573c(dVar);
        }
        if (obj == C12150d.m26492c()) {
            return obj;
        }
        return C11921v.f18618a;
    }
}
