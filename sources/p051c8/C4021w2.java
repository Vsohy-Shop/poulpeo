package p051c8;

import android.app.Application;
import p245u7.C9896b;
import p330df.C11814a;

/* renamed from: c8.w2 */
/* compiled from: ProviderInstaller_Factory */
public final class C4021w2 implements C9896b<C4017v2> {

    /* renamed from: a */
    private final C11814a<Application> f3212a;

    public C4021w2(C11814a<Application> aVar) {
        this.f3212a = aVar;
    }

    /* renamed from: a */
    public static C4021w2 m4736a(C11814a<Application> aVar) {
        return new C4021w2(aVar);
    }

    /* renamed from: c */
    public static C4017v2 m4737c(Application application) {
        return new C4017v2(application);
    }

    /* renamed from: b */
    public C4017v2 get() {
        return m4737c(this.f3212a.get());
    }
}
