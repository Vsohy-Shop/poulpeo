package p111h6;

/* renamed from: h6.b */
/* compiled from: CharMatcher */
public abstract class C7988b {

    /* renamed from: h6.b$a */
    /* compiled from: CharMatcher */
    static abstract class C7989a extends C7988b {
        C7989a() {
        }
    }

    /* renamed from: h6.b$b */
    /* compiled from: CharMatcher */
    private static final class C7990b extends C7989a {

        /* renamed from: a */
        private final char f11222a;

        C7990b(char c) {
            this.f11222a = c;
        }

        public String toString() {
            String a = C7988b.m15700d(this.f11222a);
            StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 18);
            sb.append("CharMatcher.is('");
            sb.append(a);
            sb.append("')");
            return sb.toString();
        }
    }

    /* renamed from: h6.b$c */
    /* compiled from: CharMatcher */
    static abstract class C7991c extends C7989a {

        /* renamed from: a */
        private final String f11223a;

        C7991c(String str) {
            this.f11223a = (String) C8012n.m15755n(str);
        }

        public final String toString() {
            return this.f11223a;
        }
    }

    /* renamed from: h6.b$d */
    /* compiled from: CharMatcher */
    private static final class C7992d extends C7991c {

        /* renamed from: b */
        static final C7992d f11224b = new C7992d();

        private C7992d() {
            super("CharMatcher.none()");
        }
    }

    /* renamed from: h6.b$e */
    /* compiled from: CharMatcher */
    static final class C7993e extends C7991c {

        /* renamed from: b */
        static final int f11225b = Integer.numberOfLeadingZeros(31);

        /* renamed from: c */
        static final C7993e f11226c = new C7993e();

        C7993e() {
            super("CharMatcher.whitespace()");
        }
    }

    protected C7988b() {
    }

    /* renamed from: b */
    public static C7988b m15698b(char c) {
        return new C7990b(c);
    }

    /* renamed from: c */
    public static C7988b m15699c() {
        return C7992d.f11224b;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static String m15700d(char c) {
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(c & 15);
            c = (char) (c >> 4);
        }
        return String.copyValueOf(cArr);
    }

    /* renamed from: e */
    public static C7988b m15701e() {
        return C7993e.f11226c;
    }
}
