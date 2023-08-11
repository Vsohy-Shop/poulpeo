package p026a8;

import android.app.Application;
import p267w7.C10133d;
import p330df.C11814a;

/* renamed from: a8.b */
/* compiled from: ApplicationModule_ProvidesApplicationFactory */
public final class C2219b implements C11814a {

    /* renamed from: a */
    private final C2218a f1007a;

    public C2219b(C2218a aVar) {
        this.f1007a = aVar;
    }

    /* renamed from: a */
    public static C2219b m1868a(C2218a aVar) {
        return new C2219b(aVar);
    }

    /* renamed from: c */
    public static Application m1869c(C2218a aVar) {
        return (Application) C10133d.m21326c(aVar.mo23564a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public Application get() {
        return m1869c(this.f1007a);
    }
}
