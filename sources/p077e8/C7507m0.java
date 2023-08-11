package p077e8;

import p245u7.C9896b;
import p245u7.C9898d;
import p341fe.C11962r;

/* renamed from: e8.m0 */
/* compiled from: SchedulerModule_ProvidesMainThreadSchedulerFactory */
public final class C7507m0 implements C9896b<C11962r> {

    /* renamed from: a */
    private final C7501j0 f10399a;

    public C7507m0(C7501j0 j0Var) {
        this.f10399a = j0Var;
    }

    /* renamed from: a */
    public static C7507m0 m14739a(C7501j0 j0Var) {
        return new C7507m0(j0Var);
    }

    /* renamed from: c */
    public static C11962r m14740c(C7501j0 j0Var) {
        return (C11962r) C9898d.m20567c(j0Var.mo41221c(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public C11962r get() {
        return m14740c(this.f10399a);
    }
}
