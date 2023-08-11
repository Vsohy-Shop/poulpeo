package p466yf;

import kotlin.jvm.internal.SourceDebugExtension;
import p331dg.C11831i;
import p355hf.C12074d;

@SourceDebugExtension({"SMAP\nCancellableContinuation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CompletionHandler.kt\nkotlinx/coroutines/CompletionHandlerKt\n*L\n1#1,386:1\n1#2:387\n19#3:388\n*S KotlinDebug\n*F\n+ 1 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n380#1:388\n*E\n"})
/* renamed from: yf.q */
/* compiled from: CancellableContinuation.kt */
public final class C14018q {
    /* renamed from: a */
    public static final void m32524a(C14002n<?> nVar, C13943d1 d1Var) {
        nVar.mo49526f(new C13949e1(d1Var));
    }

    /* renamed from: b */
    public static final <T> C14010o<T> m32525b(C12074d<? super T> dVar) {
        if (!(dVar instanceof C11831i)) {
            return new C14010o<>(dVar, 1);
        }
        C14010o<T> p = ((C11831i) dVar).mo49000p();
        if (p != null) {
            if (!p.mo53790L()) {
                p = null;
            }
            if (p != null) {
                return p;
            }
        }
        return new C14010o<>(dVar, 2);
    }
}
