package p331dg;

import kotlin.jvm.internal.C12775o;
import p355hf.C12079g;
import p466yf.C14043v2;

/* renamed from: dg.o0 */
/* compiled from: ThreadContext.kt */
final class C11848o0 {

    /* renamed from: a */
    public final C12079g f18503a;

    /* renamed from: b */
    private final Object[] f18504b;

    /* renamed from: c */
    private final C14043v2<Object>[] f18505c;

    /* renamed from: d */
    private int f18506d;

    public C11848o0(C12079g gVar, int i) {
        this.f18503a = gVar;
        this.f18504b = new Object[i];
        this.f18505c = new C14043v2[i];
    }

    /* renamed from: a */
    public final void mo49029a(C14043v2<?> v2Var, Object obj) {
        Object[] objArr = this.f18504b;
        int i = this.f18506d;
        objArr[i] = obj;
        C14043v2<Object>[] v2VarArr = this.f18505c;
        this.f18506d = i + 1;
        C12775o.m28637g(v2Var, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        v2VarArr[i] = v2Var;
    }

    /* renamed from: b */
    public final void mo49030b(C12079g gVar) {
        int length = this.f18505c.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                C14043v2<Object> v2Var = this.f18505c[length];
                C12775o.m28636f(v2Var);
                v2Var.restoreThreadContext(gVar, this.f18504b[length]);
                if (i >= 0) {
                    length = i;
                } else {
                    return;
                }
            }
        }
    }
}
