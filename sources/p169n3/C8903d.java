package p169n3;

/* renamed from: n3.d */
/* compiled from: Preconditions */
public final class C8903d {
    /* renamed from: a */
    public static <T> void m18033a(T t, Class<T> cls) {
        if (t == null) {
            throw new IllegalStateException(cls.getCanonicalName() + " must be set");
        }
    }

    /* renamed from: b */
    public static <T> T m18034b(T t) {
        t.getClass();
        return t;
    }

    /* renamed from: c */
    public static <T> T m18035c(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }
}
