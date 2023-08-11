package p077e8;

import p051c8.C3909c;
import p245u7.C9896b;
import p245u7.C9898d;
import p330df.C11814a;
import p376ke.C12657a;

/* renamed from: e8.b */
/* compiled from: AnalyticsEventsModule_ProvidesAnalyticsConnectorEventsFactory */
public final class C7484b implements C9896b<C12657a<String>> {

    /* renamed from: a */
    private final C7482a f10366a;

    /* renamed from: b */
    private final C11814a<C3909c> f10367b;

    public C7484b(C7482a aVar, C11814a<C3909c> aVar2) {
        this.f10366a = aVar;
        this.f10367b = aVar2;
    }

    /* renamed from: a */
    public static C7484b m14672a(C7482a aVar, C11814a<C3909c> aVar2) {
        return new C7484b(aVar, aVar2);
    }

    /* renamed from: c */
    public static C12657a<String> m14673c(C7482a aVar, C3909c cVar) {
        return (C12657a) C9898d.m20567c(aVar.mo41192a(cVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public C12657a<String> get() {
        return m14673c(this.f10366a, this.f10367b.get());
    }
}
