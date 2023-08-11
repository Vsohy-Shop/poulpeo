package p027a9;

/* renamed from: a9.a */
/* compiled from: CharsUtils.kt */
public final class C2239a {

    /* renamed from: a */
    public static final C2239a f1041a = new C2239a();

    private C2239a() {
    }

    /* renamed from: a */
    private final char m1928a(int i) {
        return (char) ((i >>> 10) + 55232);
    }

    /* renamed from: b */
    private final boolean m1929b(int i) {
        if ((i >>> 16) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private final boolean m1930c(int i) {
        if ((i >>> 16) < 1) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private final char m1931d(int i) {
        return (char) ((i & 1023) + 56320);
    }

    /* renamed from: f */
    private final void m1932f(int i, char[] cArr, int i2) {
        cArr[i2 + 1] = m1931d(i);
        cArr[i2] = m1928a(i);
    }

    /* renamed from: e */
    public final char[] mo23595e(int i) {
        if (m1929b(i)) {
            return new char[]{(char) i};
        } else if (m1930c(i)) {
            char[] cArr = new char[2];
            m1932f(i, cArr, 0);
            return cArr;
        } else {
            throw new IllegalArgumentException();
        }
    }
}
