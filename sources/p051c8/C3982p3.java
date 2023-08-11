package p051c8;

import p245u7.C9896b;
import p330df.C11814a;
import p341fe.C11962r;

/* renamed from: c8.p3 */
/* compiled from: Schedulers_Factory */
public final class C3982p3 implements C9896b<C3977o3> {

    /* renamed from: a */
    private final C11814a<C11962r> f3141a;

    /* renamed from: b */
    private final C11814a<C11962r> f3142b;

    /* renamed from: c */
    private final C11814a<C11962r> f3143c;

    public C3982p3(C11814a<C11962r> aVar, C11814a<C11962r> aVar2, C11814a<C11962r> aVar3) {
        this.f3141a = aVar;
        this.f3142b = aVar2;
        this.f3143c = aVar3;
    }

    /* renamed from: a */
    public static C3982p3 m4649a(C11814a<C11962r> aVar, C11814a<C11962r> aVar2, C11814a<C11962r> aVar3) {
        return new C3982p3(aVar, aVar2, aVar3);
    }

    /* renamed from: c */
    public static C3977o3 m4650c(C11962r rVar, C11962r rVar2, C11962r rVar3) {
        return new C3977o3(rVar, rVar2, rVar3);
    }

    /* renamed from: b */
    public C3977o3 get() {
        return m4650c(this.f3141a.get(), this.f3142b.get(), this.f3143c.get());
    }
}
