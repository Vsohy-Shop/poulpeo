package p077e8;

import p051c8.C3989q3;
import p245u7.C9896b;
import p245u7.C9898d;

/* renamed from: e8.i */
/* compiled from: ApiClientModule_ProvidesSharedPreferencesUtilsFactory */
public final class C7498i implements C9896b<C3989q3> {

    /* renamed from: a */
    private final C7488d f10390a;

    public C7498i(C7488d dVar) {
        this.f10390a = dVar;
    }

    /* renamed from: a */
    public static C7498i m14715a(C7488d dVar) {
        return new C7498i(dVar);
    }

    /* renamed from: c */
    public static C3989q3 m14716c(C7488d dVar) {
        return (C3989q3) C9898d.m20567c(dVar.mo41204e(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public C3989q3 get() {
        return m14716c(this.f10390a);
    }
}
