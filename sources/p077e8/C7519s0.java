package p077e8;

import com.google.firebase.C6922c;
import p051c8.C3986q2;
import p051c8.C3996s;
import p089f8.C7611a;
import p119i3.C8114g;
import p124i8.C8213d;
import p192p6.C9063a;
import p245u7.C9896b;
import p245u7.C9898d;
import p330df.C11814a;

/* renamed from: e8.s0 */
/* compiled from: TransportClientModule_ProvidesMetricsLoggerClientFactory */
public final class C7519s0 implements C9896b<C3986q2> {

    /* renamed from: a */
    private final C11814a<C6922c> f10407a;

    /* renamed from: b */
    private final C11814a<C8114g> f10408b;

    /* renamed from: c */
    private final C11814a<C9063a> f10409c;

    /* renamed from: d */
    private final C11814a<C8213d> f10410d;

    /* renamed from: e */
    private final C11814a<C7611a> f10411e;

    /* renamed from: f */
    private final C11814a<C3996s> f10412f;

    public C7519s0(C11814a<C6922c> aVar, C11814a<C8114g> aVar2, C11814a<C9063a> aVar3, C11814a<C8213d> aVar4, C11814a<C7611a> aVar5, C11814a<C3996s> aVar6) {
        this.f10407a = aVar;
        this.f10408b = aVar2;
        this.f10409c = aVar3;
        this.f10410d = aVar4;
        this.f10411e = aVar5;
        this.f10412f = aVar6;
    }

    /* renamed from: a */
    public static C7519s0 m14766a(C11814a<C6922c> aVar, C11814a<C8114g> aVar2, C11814a<C9063a> aVar3, C11814a<C8213d> aVar4, C11814a<C7611a> aVar5, C11814a<C3996s> aVar6) {
        return new C7519s0(aVar, aVar2, aVar3, aVar4, aVar5, aVar6);
    }

    /* renamed from: c */
    public static C3986q2 m14767c(C6922c cVar, C8114g gVar, C9063a aVar, C8213d dVar, C7611a aVar2, C3996s sVar) {
        return (C3986q2) C9898d.m20567c(C7517r0.m14763e(cVar, gVar, aVar, dVar, aVar2, sVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public C3986q2 get() {
        return m14767c(this.f10407a.get(), this.f10408b.get(), this.f10409c.get(), this.f10410d.get(), this.f10411e.get(), this.f10412f.get());
    }
}
