package p077e8;

import p245u7.C9896b;
import p245u7.C9898d;
import p341fe.C11962r;

/* renamed from: e8.k0 */
/* compiled from: SchedulerModule_ProvidesComputeSchedulerFactory */
public final class C7503k0 implements C9896b<C11962r> {

    /* renamed from: a */
    private final C7501j0 f10395a;

    public C7503k0(C7501j0 j0Var) {
        this.f10395a = j0Var;
    }

    /* renamed from: a */
    public static C7503k0 m14727a(C7501j0 j0Var) {
        return new C7503k0(j0Var);
    }

    /* renamed from: c */
    public static C11962r m14728c(C7501j0 j0Var) {
        return (C11962r) C9898d.m20567c(j0Var.mo41219a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public C11962r get() {
        return m14728c(this.f10395a);
    }
}
