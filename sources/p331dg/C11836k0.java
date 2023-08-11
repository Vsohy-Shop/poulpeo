package p331dg;

import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p355hf.C12079g;
import p404of.C13088o;
import p466yf.C14043v2;

/* renamed from: dg.k0 */
/* compiled from: ThreadContext.kt */
public final class C11836k0 {

    /* renamed from: a */
    public static final C11828g0 f18485a = new C11828g0("NO_THREAD_ELEMENTS");

    /* renamed from: b */
    private static final C13088o<Object, C12079g.C12082b, Object> f18486b = C11837a.f18489g;

    /* renamed from: c */
    private static final C13088o<C14043v2<?>, C12079g.C12082b, C14043v2<?>> f18487c = C11838b.f18490g;

    /* renamed from: d */
    private static final C13088o<C11848o0, C12079g.C12082b, C11848o0> f18488d = C11839c.f18491g;

    /* renamed from: dg.k0$a */
    /* compiled from: ThreadContext.kt */
    static final class C11837a extends C12777p implements C13088o<Object, C12079g.C12082b, Object> {

        /* renamed from: g */
        public static final C11837a f18489g = new C11837a();

        C11837a() {
            super(2);
        }

        /* renamed from: a */
        public final Object invoke(Object obj, C12079g.C12082b bVar) {
            Integer num;
            int i;
            if (!(bVar instanceof C14043v2)) {
                return obj;
            }
            if (obj instanceof Integer) {
                num = (Integer) obj;
            } else {
                num = null;
            }
            if (num != null) {
                i = num.intValue();
            } else {
                i = 1;
            }
            if (i == 0) {
                return bVar;
            }
            return Integer.valueOf(i + 1);
        }
    }

    /* renamed from: dg.k0$b */
    /* compiled from: ThreadContext.kt */
    static final class C11838b extends C12777p implements C13088o<C14043v2<?>, C12079g.C12082b, C14043v2<?>> {

        /* renamed from: g */
        public static final C11838b f18490g = new C11838b();

        C11838b() {
            super(2);
        }

        /* renamed from: a */
        public final C14043v2<?> invoke(C14043v2<?> v2Var, C12079g.C12082b bVar) {
            if (v2Var != null) {
                return v2Var;
            }
            if (bVar instanceof C14043v2) {
                return (C14043v2) bVar;
            }
            return null;
        }
    }

    /* renamed from: dg.k0$c */
    /* compiled from: ThreadContext.kt */
    static final class C11839c extends C12777p implements C13088o<C11848o0, C12079g.C12082b, C11848o0> {

        /* renamed from: g */
        public static final C11839c f18491g = new C11839c();

        C11839c() {
            super(2);
        }

        /* renamed from: a */
        public final C11848o0 invoke(C11848o0 o0Var, C12079g.C12082b bVar) {
            if (bVar instanceof C14043v2) {
                C14043v2 v2Var = (C14043v2) bVar;
                o0Var.mo49029a(v2Var, v2Var.updateThreadContext(o0Var.f18503a));
            }
            return o0Var;
        }
    }

    /* renamed from: a */
    public static final void m25497a(C12079g gVar, Object obj) {
        if (obj != f18485a) {
            if (obj instanceof C11848o0) {
                ((C11848o0) obj).mo49030b(gVar);
                return;
            }
            Object fold = gVar.fold(null, f18487c);
            C12775o.m28637g(fold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            ((C14043v2) fold).restoreThreadContext(gVar, obj);
        }
    }

    /* renamed from: b */
    public static final Object m25498b(C12079g gVar) {
        Object fold = gVar.fold(0, f18486b);
        C12775o.m28636f(fold);
        return fold;
    }

    /* renamed from: c */
    public static final Object m25499c(C12079g gVar, Object obj) {
        if (obj == null) {
            obj = m25498b(gVar);
        }
        if (obj == 0) {
            return f18485a;
        }
        if (obj instanceof Integer) {
            return gVar.fold(new C11848o0(gVar, ((Number) obj).intValue()), f18488d);
        }
        C12775o.m28637g(obj, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        return ((C14043v2) obj).updateThreadContext(gVar);
    }
}
