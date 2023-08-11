package p077e8;

import p245u7.C9896b;
import p245u7.C9898d;

/* renamed from: e8.u */
/* compiled from: GrpcChannelModule_ProvidesServiceHostFactory */
public final class C7521u implements C9896b<String> {

    /* renamed from: a */
    private final C7518s f10415a;

    public C7521u(C7518s sVar) {
        this.f10415a = sVar;
    }

    /* renamed from: a */
    public static C7521u m14772a(C7518s sVar) {
        return new C7521u(sVar);
    }

    /* renamed from: c */
    public static String m14773c(C7518s sVar) {
        return (String) C9898d.m20567c(sVar.mo41238b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public String get() {
        return m14773c(this.f10415a);
    }
}
