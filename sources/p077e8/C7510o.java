package p077e8;

import p051c8.C3996s;
import p245u7.C9896b;
import p245u7.C9898d;

/* renamed from: e8.o */
/* compiled from: ApplicationModule_DeveloperListenerManagerFactory */
public final class C7510o implements C9896b<C3996s> {

    /* renamed from: a */
    private final C7508n f10401a;

    public C7510o(C7508n nVar) {
        this.f10401a = nVar;
    }

    /* renamed from: a */
    public static C7510o m14745a(C7508n nVar) {
        return new C7510o(nVar);
    }

    /* renamed from: b */
    public static C3996s m14746b(C7508n nVar) {
        return (C3996s) C9898d.m20567c(nVar.mo41229a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: c */
    public C3996s get() {
        return m14746b(this.f10401a);
    }
}
