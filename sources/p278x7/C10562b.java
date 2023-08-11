package p278x7;

import android.app.Application;
import p330df.C11814a;

/* renamed from: x7.b */
/* compiled from: BindingWrapperFactory_Factory */
public final class C10562b implements C11814a {

    /* renamed from: a */
    private final C11814a<Application> f16073a;

    public C10562b(C11814a<Application> aVar) {
        this.f16073a = aVar;
    }

    /* renamed from: a */
    public static C10562b m22423a(C11814a<Application> aVar) {
        return new C10562b(aVar);
    }

    /* renamed from: c */
    public static C10561a m22424c(Application application) {
        return new C10561a(application);
    }

    /* renamed from: b */
    public C10561a get() {
        return m22424c(this.f16073a.get());
    }
}
