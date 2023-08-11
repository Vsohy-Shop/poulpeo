package p077e8;

import android.app.Application;
import p051c8.C4013u2;
import p245u7.C9896b;
import p245u7.C9898d;
import p330df.C11814a;

/* renamed from: e8.f0 */
/* compiled from: ProtoStorageClientModule_ProvidesProtoStorageClientForImpressionStoreFactory */
public final class C7493f0 implements C9896b<C4013u2> {

    /* renamed from: a */
    private final C7489d0 f10384a;

    /* renamed from: b */
    private final C11814a<Application> f10385b;

    public C7493f0(C7489d0 d0Var, C11814a<Application> aVar) {
        this.f10384a = d0Var;
        this.f10385b = aVar;
    }

    /* renamed from: a */
    public static C7493f0 m14702a(C7489d0 d0Var, C11814a<Application> aVar) {
        return new C7493f0(d0Var, aVar);
    }

    /* renamed from: c */
    public static C4013u2 m14703c(C7489d0 d0Var, Application application) {
        return (C4013u2) C9898d.m20567c(d0Var.mo41207b(application), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public C4013u2 get() {
        return m14703c(this.f10384a, this.f10385b.get());
    }
}
