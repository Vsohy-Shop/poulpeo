package p077e8;

import p051c8.C3989q3;
import p051c8.C3995r3;
import p245u7.C9896b;
import p245u7.C9898d;
import p330df.C11814a;

/* renamed from: e8.j */
/* compiled from: ApiClientModule_ProvidesTestDeviceHelperFactory */
public final class C7500j implements C9896b<C3995r3> {

    /* renamed from: a */
    private final C7488d f10391a;

    /* renamed from: b */
    private final C11814a<C3989q3> f10392b;

    public C7500j(C7488d dVar, C11814a<C3989q3> aVar) {
        this.f10391a = dVar;
        this.f10392b = aVar;
    }

    /* renamed from: a */
    public static C7500j m14719a(C7488d dVar, C11814a<C3989q3> aVar) {
        return new C7500j(dVar, aVar);
    }

    /* renamed from: c */
    public static C3995r3 m14720c(C7488d dVar, C3989q3 q3Var) {
        return (C3995r3) C9898d.m20567c(dVar.mo41205f(q3Var), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public C3995r3 get() {
        return m14720c(this.f10391a, this.f10392b.get());
    }
}
