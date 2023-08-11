package p051c8;

import android.app.Application;
import p089f8.C7611a;
import p245u7.C9896b;
import p330df.C11814a;

/* renamed from: c8.l */
/* compiled from: CampaignCacheClient_Factory */
public final class C3958l implements C9896b<C3953k> {

    /* renamed from: a */
    private final C11814a<C4013u2> f3101a;

    /* renamed from: b */
    private final C11814a<Application> f3102b;

    /* renamed from: c */
    private final C11814a<C7611a> f3103c;

    public C3958l(C11814a<C4013u2> aVar, C11814a<Application> aVar2, C11814a<C7611a> aVar3) {
        this.f3101a = aVar;
        this.f3102b = aVar2;
        this.f3103c = aVar3;
    }

    /* renamed from: a */
    public static C3958l m4598a(C11814a<C4013u2> aVar, C11814a<Application> aVar2, C11814a<C7611a> aVar3) {
        return new C3958l(aVar, aVar2, aVar3);
    }

    /* renamed from: c */
    public static C3953k m4599c(C4013u2 u2Var, Application application, C7611a aVar) {
        return new C3953k(u2Var, application, aVar);
    }

    /* renamed from: b */
    public C3953k get() {
        return m4599c(this.f3101a.get(), this.f3102b.get(), this.f3103c.get());
    }
}
