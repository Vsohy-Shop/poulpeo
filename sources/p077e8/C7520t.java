package p077e8;

import p245u7.C9896b;
import p245u7.C9898d;
import p330df.C11814a;
import p458xd.C13777b;

/* renamed from: e8.t */
/* compiled from: GrpcChannelModule_ProvidesGrpcChannelFactory */
public final class C7520t implements C9896b<C13777b> {

    /* renamed from: a */
    private final C7518s f10413a;

    /* renamed from: b */
    private final C11814a<String> f10414b;

    public C7520t(C7518s sVar, C11814a<String> aVar) {
        this.f10413a = sVar;
        this.f10414b = aVar;
    }

    /* renamed from: a */
    public static C7520t m14769a(C7518s sVar, C11814a<String> aVar) {
        return new C7520t(sVar, aVar);
    }

    /* renamed from: c */
    public static C13777b m14770c(C7518s sVar, String str) {
        return (C13777b) C9898d.m20567c(sVar.mo41237a(str), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public C13777b get() {
        return m14770c(this.f10413a, this.f10414b.get());
    }
}
