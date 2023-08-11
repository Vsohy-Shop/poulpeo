package p331dg;

import kotlin.jvm.internal.C12775o;

/* renamed from: dg.q */
/* compiled from: LockFreeLinkedList.kt */
public final class C11850q {

    /* renamed from: a */
    private static final Object f18507a = new C11828g0("CONDITION_FALSE");

    /* renamed from: a */
    public static final Object m25533a() {
        return f18507a;
    }

    /* renamed from: b */
    public static final C11851r m25534b(Object obj) {
        C11816a0 a0Var;
        C11851r rVar;
        if (obj instanceof C11816a0) {
            a0Var = (C11816a0) obj;
        } else {
            a0Var = null;
        }
        if (a0Var != null && (rVar = a0Var.f18461a) != null) {
            return rVar;
        }
        C12775o.m28637g(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        return (C11851r) obj;
    }
}
