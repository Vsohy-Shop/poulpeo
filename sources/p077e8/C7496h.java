package p077e8;

import p124i8.C8213d;
import p245u7.C9896b;
import p245u7.C9898d;

/* renamed from: e8.h */
/* compiled from: ApiClientModule_ProvidesFirebaseInstallationsFactory */
public final class C7496h implements C9896b<C8213d> {

    /* renamed from: a */
    private final C7488d f10389a;

    public C7496h(C7488d dVar) {
        this.f10389a = dVar;
    }

    /* renamed from: a */
    public static C7496h m14711a(C7488d dVar) {
        return new C7496h(dVar);
    }

    /* renamed from: c */
    public static C8213d m14712c(C7488d dVar) {
        return (C8213d) C9898d.m20567c(dVar.mo41203d(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public C8213d get() {
        return m14712c(this.f10389a);
    }
}
