package p077e8;

import android.app.Application;
import p051c8.C3917d;
import p051c8.C3959l0;
import p051c8.C4017v2;
import p234t7.C9763a;
import p245u7.C9895a;
import p245u7.C9896b;
import p245u7.C9898d;
import p330df.C11814a;

/* renamed from: e8.e */
/* compiled from: ApiClientModule_ProvidesApiClientFactory */
public final class C7490e implements C9896b<C3917d> {

    /* renamed from: a */
    private final C7488d f10375a;

    /* renamed from: b */
    private final C11814a<C3959l0> f10376b;

    /* renamed from: c */
    private final C11814a<Application> f10377c;

    /* renamed from: d */
    private final C11814a<C4017v2> f10378d;

    public C7490e(C7488d dVar, C11814a<C3959l0> aVar, C11814a<Application> aVar2, C11814a<C4017v2> aVar3) {
        this.f10375a = dVar;
        this.f10376b = aVar;
        this.f10377c = aVar2;
        this.f10378d = aVar3;
    }

    /* renamed from: a */
    public static C7490e m14693a(C7488d dVar, C11814a<C3959l0> aVar, C11814a<Application> aVar2, C11814a<C4017v2> aVar3) {
        return new C7490e(dVar, aVar, aVar2, aVar3);
    }

    /* renamed from: c */
    public static C3917d m14694c(C7488d dVar, C9763a<C3959l0> aVar, Application application, C4017v2 v2Var) {
        return (C3917d) C9898d.m20567c(dVar.mo41200a(aVar, application, v2Var), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public C3917d get() {
        return m14694c(this.f10375a, C9895a.m20561a(this.f10376b), this.f10377c.get(), this.f10378d.get());
    }
}
