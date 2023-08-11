package p267w7;

/* renamed from: w7.d */
/* compiled from: Preconditions */
public final class C10133d {
    /* renamed from: a */
    public static <T> void m21324a(T t, Class<T> cls) {
        if (t == null) {
            throw new IllegalStateException(cls.getCanonicalName() + " must be set");
        }
    }

    /* renamed from: b */
    public static <T> T m21325b(T t) {
        t.getClass();
        return t;
    }

    /* renamed from: c */
    public static <T> T m21326c(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }
}
