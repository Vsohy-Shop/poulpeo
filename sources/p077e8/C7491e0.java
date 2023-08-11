package p077e8;

import android.app.Application;
import p051c8.C4013u2;
import p245u7.C9896b;
import p245u7.C9898d;
import p330df.C11814a;

/* renamed from: e8.e0 */
/* compiled from: ProtoStorageClientModule_ProvidesProtoStorageClientForCampaignFactory */
public final class C7491e0 implements C9896b<C4013u2> {

    /* renamed from: a */
    private final C7489d0 f10379a;

    /* renamed from: b */
    private final C11814a<Application> f10380b;

    public C7491e0(C7489d0 d0Var, C11814a<Application> aVar) {
        this.f10379a = d0Var;
        this.f10380b = aVar;
    }

    /* renamed from: a */
    public static C7491e0 m14696a(C7489d0 d0Var, C11814a<Application> aVar) {
        return new C7491e0(d0Var, aVar);
    }

    /* renamed from: c */
    public static C4013u2 m14697c(C7489d0 d0Var, Application application) {
        return (C4013u2) C9898d.m20567c(d0Var.mo41206a(application), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public C4013u2 get() {
        return m14697c(this.f10379a, this.f10380b.get());
    }
}
