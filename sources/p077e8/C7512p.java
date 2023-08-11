package p077e8;

import android.app.Application;
import p245u7.C9896b;
import p245u7.C9898d;

/* renamed from: e8.p */
/* compiled from: ApplicationModule_ProvidesApplicationFactory */
public final class C7512p implements C9896b<Application> {

    /* renamed from: a */
    private final C7508n f10403a;

    public C7512p(C7508n nVar) {
        this.f10403a = nVar;
    }

    /* renamed from: a */
    public static C7512p m14751a(C7508n nVar) {
        return new C7512p(nVar);
    }

    /* renamed from: c */
    public static Application m14752c(C7508n nVar) {
        return (Application) C9898d.m20567c(nVar.mo41230b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public Application get() {
        return m14752c(this.f10403a);
    }
}
