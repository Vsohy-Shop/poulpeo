package p245u7;

/* renamed from: u7.d */
/* compiled from: Preconditions */
public final class C9898d {
    /* renamed from: a */
    public static <T> void m20565a(T t, Class<T> cls) {
        if (t == null) {
            throw new IllegalStateException(cls.getCanonicalName() + " must be set");
        }
    }

    /* renamed from: b */
    public static <T> T m20566b(T t) {
        t.getClass();
        return t;
    }

    /* renamed from: c */
    public static <T> T m20567c(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }
}
