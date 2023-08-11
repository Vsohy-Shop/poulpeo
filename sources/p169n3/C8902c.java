package p169n3;

import p159m3.C8821a;

/* renamed from: n3.c */
/* compiled from: InstanceFactory */
public final class C8902c<T> implements C8901b<T>, C8821a<T> {

    /* renamed from: b */
    private static final C8902c<Object> f12916b = new C8902c<>((Object) null);

    /* renamed from: a */
    private final T f12917a;

    private C8902c(T t) {
        this.f12917a = t;
    }

    /* renamed from: a */
    public static <T> C8901b<T> m18032a(T t) {
        return new C8902c(C8903d.m18035c(t, "instance cannot be null"));
    }

    public T get() {
        return this.f12917a;
    }
}
