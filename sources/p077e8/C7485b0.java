package p077e8;

import p245u7.C9896b;
import p245u7.C9898d;
import p376ke.C12657a;

/* renamed from: e8.b0 */
/* compiled from: ProgrammaticContextualTriggerFlowableModule_ProvidesProgramaticContextualTriggerStreamFactory */
public final class C7485b0 implements C9896b<C12657a<String>> {

    /* renamed from: a */
    private final C7483a0 f10368a;

    public C7485b0(C7483a0 a0Var) {
        this.f10368a = a0Var;
    }

    /* renamed from: a */
    public static C7485b0 m14675a(C7483a0 a0Var) {
        return new C7485b0(a0Var);
    }

    /* renamed from: c */
    public static C12657a<String> m14676c(C7483a0 a0Var) {
        return (C12657a) C9898d.m20567c(a0Var.mo41194c(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public C12657a<String> get() {
        return m14676c(this.f10368a);
    }
}
