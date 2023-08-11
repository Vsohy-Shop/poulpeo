package p077e8;

import p245u7.C9896b;
import p245u7.C9898d;
import p268w8.C10150g;
import p330df.C11814a;
import p364io.grpc.C12564o;
import p458xd.C13777b;

/* renamed from: e8.x */
/* compiled from: GrpcClientModule_ProvidesInAppMessagingSdkServingStubFactory */
public final class C7524x implements C9896b<C10150g.C10152b> {

    /* renamed from: a */
    private final C7522v f10418a;

    /* renamed from: b */
    private final C11814a<C13777b> f10419b;

    /* renamed from: c */
    private final C11814a<C12564o> f10420c;

    public C7524x(C7522v vVar, C11814a<C13777b> aVar, C11814a<C12564o> aVar2) {
        this.f10418a = vVar;
        this.f10419b = aVar;
        this.f10420c = aVar2;
    }

    /* renamed from: a */
    public static C7524x m14782a(C7522v vVar, C11814a<C13777b> aVar, C11814a<C12564o> aVar2) {
        return new C7524x(vVar, aVar, aVar2);
    }

    /* renamed from: c */
    public static C10150g.C10152b m14783c(C7522v vVar, C13777b bVar, C12564o oVar) {
        return (C10150g.C10152b) C9898d.m20567c(vVar.mo41243c(bVar, oVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public C10150g.C10152b get() {
        return m14783c(this.f10418a, this.f10419b.get(), this.f10420c.get());
    }
}
