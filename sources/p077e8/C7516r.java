package p077e8;

import android.app.Application;
import p245u7.C9896b;
import p245u7.C9898d;
import p330df.C11814a;
import p376ke.C12657a;

/* renamed from: e8.r */
/* compiled from: ForegroundFlowableModule_ProvidesAppForegroundEventStreamFactory */
public final class C7516r implements C9896b<C12657a<String>> {

    /* renamed from: a */
    private final C7514q f10405a;

    /* renamed from: b */
    private final C11814a<Application> f10406b;

    public C7516r(C7514q qVar, C11814a<Application> aVar) {
        this.f10405a = qVar;
        this.f10406b = aVar;
    }

    /* renamed from: a */
    public static C7516r m14756a(C7514q qVar, C11814a<Application> aVar) {
        return new C7516r(qVar, aVar);
    }

    /* renamed from: c */
    public static C12657a<String> m14757c(C7514q qVar, Application application) {
        return (C12657a) C9898d.m20567c(qVar.mo41235a(application), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public C12657a<String> get() {
        return m14757c(this.f10405a, this.f10406b.get());
    }
}
