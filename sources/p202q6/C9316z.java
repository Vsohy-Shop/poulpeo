package p202q6;

/* renamed from: q6.z */
/* compiled from: Preconditions */
public final class C9316z {
    /* renamed from: a */
    public static void m19175a(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: b */
    public static <T> T m19176b(T t) {
        t.getClass();
        return t;
    }

    /* renamed from: c */
    public static <T> T m19177c(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: d */
    public static void m19178d(boolean z, String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }
}
