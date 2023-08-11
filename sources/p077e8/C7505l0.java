package p077e8;

import p245u7.C9896b;
import p245u7.C9898d;
import p341fe.C11962r;

/* renamed from: e8.l0 */
/* compiled from: SchedulerModule_ProvidesIOSchedulerFactory */
public final class C7505l0 implements C9896b<C11962r> {

    /* renamed from: a */
    private final C7501j0 f10397a;

    public C7505l0(C7501j0 j0Var) {
        this.f10397a = j0Var;
    }

    /* renamed from: a */
    public static C7505l0 m14733a(C7501j0 j0Var) {
        return new C7505l0(j0Var);
    }

    /* renamed from: c */
    public static C11962r m14734c(C7501j0 j0Var) {
        return (C11962r) C9898d.m20567c(j0Var.mo41220b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public C11962r get() {
        return m14734c(this.f10397a);
    }
}
