package p077e8;

import p051c8.C3968n;
import p051c8.C3989q3;
import p193p7.C9074d;
import p245u7.C9896b;
import p245u7.C9898d;
import p330df.C11814a;

/* renamed from: e8.f */
/* compiled from: ApiClientModule_ProvidesDataCollectionHelperFactory */
public final class C7492f implements C9896b<C3968n> {

    /* renamed from: a */
    private final C7488d f10381a;

    /* renamed from: b */
    private final C11814a<C3989q3> f10382b;

    /* renamed from: c */
    private final C11814a<C9074d> f10383c;

    public C7492f(C7488d dVar, C11814a<C3989q3> aVar, C11814a<C9074d> aVar2) {
        this.f10381a = dVar;
        this.f10382b = aVar;
        this.f10383c = aVar2;
    }

    /* renamed from: a */
    public static C7492f m14699a(C7488d dVar, C11814a<C3989q3> aVar, C11814a<C9074d> aVar2) {
        return new C7492f(dVar, aVar, aVar2);
    }

    /* renamed from: c */
    public static C3968n m14700c(C7488d dVar, C3989q3 q3Var, C9074d dVar2) {
        return (C3968n) C9898d.m20567c(dVar.mo41201b(q3Var, dVar2), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public C3968n get() {
        return m14700c(this.f10381a, this.f10382b.get(), this.f10383c.get());
    }
}
