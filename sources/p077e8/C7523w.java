package p077e8;

import p245u7.C9896b;
import p245u7.C9898d;
import p364io.grpc.C12564o;

/* renamed from: e8.w */
/* compiled from: GrpcClientModule_ProvidesApiKeyHeadersFactory */
public final class C7523w implements C9896b<C12564o> {

    /* renamed from: a */
    private final C7522v f10417a;

    public C7523w(C7522v vVar) {
        this.f10417a = vVar;
    }

    /* renamed from: a */
    public static C7523w m14779a(C7522v vVar) {
        return new C7523w(vVar);
    }

    /* renamed from: c */
    public static C12564o m14780c(C7522v vVar) {
        return (C12564o) C9898d.m20567c(vVar.mo41242b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public C12564o get() {
        return m14780c(this.f10417a);
    }
}
