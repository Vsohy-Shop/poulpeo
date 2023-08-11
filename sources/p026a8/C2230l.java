package p026a8;

import android.app.Application;
import android.util.DisplayMetrics;
import p267w7.C10133d;
import p330df.C11814a;

/* renamed from: a8.l */
/* compiled from: InflaterConfigModule_ProvidesDisplayMetricsFactory */
public final class C2230l implements C11814a {

    /* renamed from: a */
    private final C2224g f1025a;

    /* renamed from: b */
    private final C11814a<Application> f1026b;

    public C2230l(C2224g gVar, C11814a<Application> aVar) {
        this.f1025a = gVar;
        this.f1026b = aVar;
    }

    /* renamed from: a */
    public static C2230l m1901a(C2224g gVar, C11814a<Application> aVar) {
        return new C2230l(gVar, aVar);
    }

    /* renamed from: c */
    public static DisplayMetrics m1902c(C2224g gVar, Application application) {
        return (DisplayMetrics) C10133d.m21326c(gVar.mo23575f(application), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public DisplayMetrics get() {
        return m1902c(this.f1025a, this.f1026b.get());
    }
}
