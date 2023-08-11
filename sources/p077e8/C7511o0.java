package p077e8;

import p089f8.C7611a;
import p245u7.C9896b;
import p245u7.C9898d;

/* renamed from: e8.o0 */
/* compiled from: SystemClockModule_ProvidesSystemClockModuleFactory */
public final class C7511o0 implements C9896b<C7611a> {

    /* renamed from: a */
    private final C7509n0 f10402a;

    public C7511o0(C7509n0 n0Var) {
        this.f10402a = n0Var;
    }

    /* renamed from: a */
    public static C7511o0 m14748a(C7509n0 n0Var) {
        return new C7511o0(n0Var);
    }

    /* renamed from: c */
    public static C7611a m14749c(C7509n0 n0Var) {
        return (C7611a) C9898d.m20567c(n0Var.mo41231a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public C7611a get() {
        return m14749c(this.f10402a);
    }
}
