package p077e8;

import p051c8.C3909c;
import p192p6.C9063a;
import p245u7.C9896b;
import p245u7.C9898d;
import p330df.C11814a;

/* renamed from: e8.c */
/* compiled from: AnalyticsEventsModule_ProvidesAnalyticsEventsManagerFactory */
public final class C7486c implements C9896b<C3909c> {

    /* renamed from: a */
    private final C7482a f10369a;

    /* renamed from: b */
    private final C11814a<C9063a> f10370b;

    public C7486c(C7482a aVar, C11814a<C9063a> aVar2) {
        this.f10369a = aVar;
        this.f10370b = aVar2;
    }

    /* renamed from: a */
    public static C7486c m14678a(C7482a aVar, C11814a<C9063a> aVar2) {
        return new C7486c(aVar, aVar2);
    }

    /* renamed from: c */
    public static C3909c m14679c(C7482a aVar, C9063a aVar2) {
        return (C3909c) C9898d.m20567c(aVar.mo41193b(aVar2), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public C3909c get() {
        return m14679c(this.f10369a, this.f10370b.get());
    }
}
