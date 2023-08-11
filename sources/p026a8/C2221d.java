package p026a8;

import android.app.Application;
import com.bumptech.glide.C4371h;
import p267w7.C10133d;
import p278x7.C10579j;
import p330df.C11814a;

/* renamed from: a8.d */
/* compiled from: GlideModule_ProvidesGlideRequestManagerFactory */
public final class C2221d implements C11814a {

    /* renamed from: a */
    private final C2220c f1008a;

    /* renamed from: b */
    private final C11814a<Application> f1009b;

    /* renamed from: c */
    private final C11814a<C10579j> f1010c;

    public C2221d(C2220c cVar, C11814a<Application> aVar, C11814a<C10579j> aVar2) {
        this.f1008a = cVar;
        this.f1009b = aVar;
        this.f1010c = aVar2;
    }

    /* renamed from: a */
    public static C2221d m1872a(C2220c cVar, C11814a<Application> aVar, C11814a<C10579j> aVar2) {
        return new C2221d(cVar, aVar, aVar2);
    }

    /* renamed from: c */
    public static C4371h m1873c(C2220c cVar, Application application, C10579j jVar) {
        return (C4371h) C10133d.m21326c(cVar.mo23567a(application, jVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public C4371h get() {
        return m1873c(this.f1008a, this.f1009b.get(), this.f1010c.get());
    }
}
