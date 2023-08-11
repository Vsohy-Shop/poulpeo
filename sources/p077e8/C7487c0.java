package p077e8;

import p051c8.C3993r2;
import p245u7.C9896b;
import p245u7.C9898d;

/* renamed from: e8.c0 */
/* compiled from: ProgrammaticContextualTriggerFlowableModule_ProvidesProgramaticContextualTriggersFactory */
public final class C7487c0 implements C9896b<C3993r2> {

    /* renamed from: a */
    private final C7483a0 f10371a;

    public C7487c0(C7483a0 a0Var) {
        this.f10371a = a0Var;
    }

    /* renamed from: a */
    public static C7487c0 m14681a(C7483a0 a0Var) {
        return new C7487c0(a0Var);
    }

    /* renamed from: c */
    public static C3993r2 m14682c(C7483a0 a0Var) {
        return (C3993r2) C9898d.m20567c(a0Var.mo41195d(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public C3993r2 get() {
        return m14682c(this.f10371a);
    }
}
