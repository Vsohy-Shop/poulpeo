package p111h6;

/* renamed from: h6.n */
/* compiled from: Preconditions */
public final class C8012n {
    /* renamed from: a */
    private static String m15742a(int i, int i2, String str) {
        if (i < 0) {
            return C8018q.m15778c("%s (%s) must not be negative", str, Integer.valueOf(i));
        } else if (i2 >= 0) {
            return C8018q.m15778c("%s (%s) must be less than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            StringBuilder sb = new StringBuilder(26);
            sb.append("negative size: ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: b */
    private static String m15743b(int i, int i2, String str) {
        if (i < 0) {
            return C8018q.m15778c("%s (%s) must not be negative", str, Integer.valueOf(i));
        } else if (i2 >= 0) {
            return C8018q.m15778c("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            StringBuilder sb = new StringBuilder(26);
            sb.append("negative size: ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: c */
    private static String m15744c(int i, int i2, int i3) {
        if (i < 0 || i > i3) {
            return m15743b(i, i3, "start index");
        }
        if (i2 < 0 || i2 > i3) {
            return m15743b(i2, i3, "end index");
        }
        return C8018q.m15778c("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
    }

    /* renamed from: d */
    public static void m15745d(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: e */
    public static void m15746e(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: f */
    public static void m15747f(boolean z, String str, char c) {
        if (!z) {
            throw new IllegalArgumentException(C8018q.m15778c(str, Character.valueOf(c)));
        }
    }

    /* renamed from: g */
    public static void m15748g(boolean z, String str, char c, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(C8018q.m15778c(str, Character.valueOf(c), obj));
        }
    }

    /* renamed from: h */
    public static void m15749h(boolean z, String str, int i) {
        if (!z) {
            throw new IllegalArgumentException(C8018q.m15778c(str, Integer.valueOf(i)));
        }
    }

    /* renamed from: i */
    public static void m15750i(boolean z, String str, long j) {
        if (!z) {
            throw new IllegalArgumentException(C8018q.m15778c(str, Long.valueOf(j)));
        }
    }

    /* renamed from: j */
    public static void m15751j(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(C8018q.m15778c(str, obj));
        }
    }

    /* renamed from: k */
    public static void m15752k(boolean z, String str, Object obj, Object obj2) {
        if (!z) {
            throw new IllegalArgumentException(C8018q.m15778c(str, obj, obj2));
        }
    }

    /* renamed from: l */
    public static int m15753l(int i, int i2) {
        return m15754m(i, i2, "index");
    }

    /* renamed from: m */
    public static int m15754m(int i, int i2, String str) {
        if (i >= 0 && i < i2) {
            return i;
        }
        throw new IndexOutOfBoundsException(m15742a(i, i2, str));
    }

    /* renamed from: n */
    public static <T> T m15755n(T t) {
        t.getClass();
        return t;
    }

    /* renamed from: o */
    public static <T> T m15756o(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: p */
    public static <T> T m15757p(T t, String str, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(C8018q.m15778c(str, obj));
    }

    /* renamed from: q */
    public static int m15758q(int i, int i2) {
        return m15759r(i, i2, "index");
    }

    /* renamed from: r */
    public static int m15759r(int i, int i2, String str) {
        if (i >= 0 && i <= i2) {
            return i;
        }
        throw new IndexOutOfBoundsException(m15743b(i, i2, str));
    }

    /* renamed from: s */
    public static void m15760s(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException(m15744c(i, i2, i3));
        }
    }

    /* renamed from: t */
    public static void m15761t(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: u */
    public static void m15762u(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    /* renamed from: v */
    public static void m15763v(boolean z, String str, int i) {
        if (!z) {
            throw new IllegalStateException(C8018q.m15778c(str, Integer.valueOf(i)));
        }
    }

    /* renamed from: w */
    public static void m15764w(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalStateException(C8018q.m15778c(str, obj));
        }
    }
}
