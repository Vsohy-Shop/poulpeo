package p077e8;

import android.app.Application;
import p051c8.C4013u2;
import p245u7.C9896b;
import p245u7.C9898d;
import p330df.C11814a;

/* renamed from: e8.g0 */
/* compiled from: ProtoStorageClientModule_ProvidesProtoStorageClientForLimiterStoreFactory */
public final class C7495g0 implements C9896b<C4013u2> {

    /* renamed from: a */
    private final C7489d0 f10387a;

    /* renamed from: b */
    private final C11814a<Application> f10388b;

    public C7495g0(C7489d0 d0Var, C11814a<Application> aVar) {
        this.f10387a = d0Var;
        this.f10388b = aVar;
    }

    /* renamed from: a */
    public static C7495g0 m14708a(C7489d0 d0Var, C11814a<Application> aVar) {
        return new C7495g0(d0Var, aVar);
    }

    /* renamed from: c */
    public static C4013u2 m14709c(C7489d0 d0Var, Application application) {
        return (C4013u2) C9898d.m20567c(d0Var.mo41208c(application), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public C4013u2 get() {
        return m14709c(this.f10387a, this.f10388b.get());
    }
}
