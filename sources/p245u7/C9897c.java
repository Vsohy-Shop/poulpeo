package p245u7;

import p234t7.C9763a;

/* renamed from: u7.c */
/* compiled from: InstanceFactory */
public final class C9897c<T> implements C9896b<T>, C9763a<T> {

    /* renamed from: b */
    private static final C9897c<Object> f14800b = new C9897c<>((Object) null);

    /* renamed from: a */
    private final T f14801a;

    private C9897c(T t) {
        this.f14801a = t;
    }

    /* renamed from: a */
    public static <T> C9896b<T> m20564a(T t) {
        return new C9897c(C9898d.m20567c(t, "instance cannot be null"));
    }

    public T get() {
        return this.f14801a;
    }
}
