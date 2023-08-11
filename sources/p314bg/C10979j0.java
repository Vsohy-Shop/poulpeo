package p314bg;

import kotlin.jvm.internal.SourceDebugExtension;
import p308ag.C10886a;
import p320cg.C11081n;
import p331dg.C11828g0;
import p355hf.C12079g;

@SourceDebugExtension({"SMAP\nStateFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,428:1\n1#2:429\n*E\n"})
/* renamed from: bg.j0 */
/* compiled from: StateFlow.kt */
public final class C10979j0 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final C11828g0 f16953a = new C11828g0("NONE");
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final C11828g0 f16954b = new C11828g0("PENDING");

    /* renamed from: a */
    public static final <T> C11025u<T> m23633a(T t) {
        if (t == null) {
            t = C11081n.f17203a;
        }
        return new C10975i0(t);
    }

    /* renamed from: d */
    public static final <T> C10962f<T> m23636d(C10972h0<? extends T> h0Var, C12079g gVar, int i, C10886a aVar) {
        boolean z = false;
        if (i >= 0 && i < 2) {
            z = true;
        }
        if ((z || i == -2) && aVar == C10886a.DROP_OLDEST) {
            return h0Var;
        }
        return C11033z.m23725e(h0Var, gVar, i, aVar);
    }
}
