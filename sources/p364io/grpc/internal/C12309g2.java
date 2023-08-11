package p364io.grpc.internal;

import p364io.grpc.internal.C12259f2;

/* renamed from: io.grpc.internal.g2 */
/* compiled from: SharedResourcePool */
public final class C12309g2<T> implements C12396p1<T> {

    /* renamed from: a */
    private final C12259f2.C12263d<T> f19492a;

    private C12309g2(C12259f2.C12263d<T> dVar) {
        this.f19492a = dVar;
    }

    /* renamed from: c */
    public static <T> C12309g2<T> m27009c(C12259f2.C12263d<T> dVar) {
        return new C12309g2<>(dVar);
    }

    /* renamed from: a */
    public T mo49922a() {
        return C12259f2.m26841d(this.f19492a);
    }

    /* renamed from: b */
    public T mo49923b(Object obj) {
        C12259f2.m26842f(this.f19492a, obj);
        return null;
    }
}
