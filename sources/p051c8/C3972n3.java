package p051c8;

import p089f8.C7611a;
import p245u7.C9896b;
import p330df.C11814a;

/* renamed from: c8.n3 */
/* compiled from: RateLimiterClient_Factory */
public final class C3972n3 implements C9896b<C3967m3> {

    /* renamed from: a */
    private final C11814a<C4013u2> f3120a;

    /* renamed from: b */
    private final C11814a<C7611a> f3121b;

    public C3972n3(C11814a<C4013u2> aVar, C11814a<C7611a> aVar2) {
        this.f3120a = aVar;
        this.f3121b = aVar2;
    }

    /* renamed from: a */
    public static C3972n3 m4642a(C11814a<C4013u2> aVar, C11814a<C7611a> aVar2) {
        return new C3972n3(aVar, aVar2);
    }

    /* renamed from: c */
    public static C3967m3 m4643c(C4013u2 u2Var, C7611a aVar) {
        return new C3967m3(u2Var, aVar);
    }

    /* renamed from: b */
    public C3967m3 get() {
        return m4643c(this.f3120a.get(), this.f3121b.get());
    }
}
