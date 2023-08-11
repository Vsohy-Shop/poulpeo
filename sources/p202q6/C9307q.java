package p202q6;

/* renamed from: q6.q */
/* compiled from: Dependency */
public final class C9307q {

    /* renamed from: a */
    private final Class<?> f13666a;

    /* renamed from: b */
    private final int f13667b;

    /* renamed from: c */
    private final int f13668c;

    private C9307q(Class<?> cls, int i, int i2) {
        this.f13666a = (Class) C9316z.m19177c(cls, "Null dependency anInterface.");
        this.f13667b = i;
        this.f13668c = i2;
    }

    /* renamed from: a */
    public static C9307q m19140a(Class<?> cls) {
        return new C9307q(cls, 0, 2);
    }

    /* renamed from: b */
    private static String m19141b(int i) {
        if (i == 0) {
            return "direct";
        }
        if (i == 1) {
            return "provider";
        }
        if (i == 2) {
            return "deferred";
        }
        throw new AssertionError("Unsupported injection: " + i);
    }

    @Deprecated
    /* renamed from: h */
    public static C9307q m19142h(Class<?> cls) {
        return new C9307q(cls, 0, 0);
    }

    /* renamed from: i */
    public static C9307q m19143i(Class<?> cls) {
        return new C9307q(cls, 0, 1);
    }

    /* renamed from: j */
    public static C9307q m19144j(Class<?> cls) {
        return new C9307q(cls, 1, 0);
    }

    /* renamed from: k */
    public static C9307q m19145k(Class<?> cls) {
        return new C9307q(cls, 2, 0);
    }

    /* renamed from: c */
    public Class<?> mo43596c() {
        return this.f13666a;
    }

    /* renamed from: d */
    public boolean mo43597d() {
        if (this.f13668c == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public boolean mo43598e() {
        if (this.f13668c == 0) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C9307q)) {
            return false;
        }
        C9307q qVar = (C9307q) obj;
        if (this.f13666a == qVar.f13666a && this.f13667b == qVar.f13667b && this.f13668c == qVar.f13668c) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo43600f() {
        if (this.f13667b == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public boolean mo43601g() {
        if (this.f13667b == 2) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f13666a.hashCode() ^ 1000003) * 1000003) ^ this.f13667b) * 1000003) ^ this.f13668c;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f13666a);
        sb.append(", type=");
        int i = this.f13667b;
        if (i == 1) {
            str = "required";
        } else if (i == 0) {
            str = "optional";
        } else {
            str = "set";
        }
        sb.append(str);
        sb.append(", injection=");
        sb.append(m19141b(this.f13668c));
        sb.append("}");
        return sb.toString();
    }
}
