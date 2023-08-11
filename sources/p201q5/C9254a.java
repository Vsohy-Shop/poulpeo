package p201q5;

import android.os.Bundle;

/* renamed from: q5.a */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
public final class C9254a {

    /* renamed from: c */
    public static final C9254a f13600c = new C9254a((Boolean) null, (Boolean) null);

    /* renamed from: a */
    private final Boolean f13601a;

    /* renamed from: b */
    private final Boolean f13602b;

    public C9254a(Boolean bool, Boolean bool2) {
        this.f13601a = bool;
        this.f13602b = bool2;
    }

    /* renamed from: a */
    public static C9254a m18987a(Bundle bundle) {
        if (bundle == null) {
            return f13600c;
        }
        return new C9254a(m18993o(bundle.getString("ad_storage")), m18993o(bundle.getString("analytics_storage")));
    }

    /* renamed from: b */
    public static C9254a m18988b(String str) {
        Boolean bool;
        Boolean bool2;
        Boolean bool3 = null;
        if (str != null) {
            if (str.length() >= 3) {
                bool2 = m18994p(str.charAt(2));
            } else {
                bool2 = null;
            }
            if (str.length() >= 4) {
                bool3 = m18994p(str.charAt(3));
            }
            bool = bool3;
            bool3 = bool2;
        } else {
            bool = null;
        }
        return new C9254a(bool3, bool);
    }

    /* renamed from: g */
    static Boolean m18989g(Boolean bool, Boolean bool2) {
        if (bool == null) {
            return bool2;
        }
        if (bool2 == null) {
            return bool;
        }
        boolean z = false;
        if (bool.booleanValue() && bool2.booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: h */
    public static String m18990h(Bundle bundle) {
        String string = bundle.getString("ad_storage");
        if (string != null && m18993o(string) == null) {
            return string;
        }
        String string2 = bundle.getString("analytics_storage");
        if (string2 == null || m18993o(string2) != null) {
            return null;
        }
        return string2;
    }

    /* renamed from: l */
    public static boolean m18991l(int i, int i2) {
        if (i <= i2) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    static final int m18992n(Boolean bool) {
        if (bool == null) {
            return 0;
        }
        if (bool.booleanValue()) {
            return 1;
        }
        return 2;
    }

    /* renamed from: o */
    private static Boolean m18993o(String str) {
        if (str == null) {
            return null;
        }
        if (str.equals("granted")) {
            return Boolean.TRUE;
        }
        if (str.equals("denied")) {
            return Boolean.FALSE;
        }
        return null;
    }

    /* renamed from: p */
    private static Boolean m18994p(char c) {
        if (c == '0') {
            return Boolean.FALSE;
        }
        if (c != '1') {
            return null;
        }
        return Boolean.TRUE;
    }

    /* renamed from: q */
    private static final char m18995q(Boolean bool) {
        if (bool == null) {
            return '-';
        }
        if (bool.booleanValue()) {
            return '1';
        }
        return '0';
    }

    /* renamed from: c */
    public final C9254a mo43546c(C9254a aVar) {
        return new C9254a(m18989g(this.f13601a, aVar.f13601a), m18989g(this.f13602b, aVar.f13602b));
    }

    /* renamed from: d */
    public final C9254a mo43547d(C9254a aVar) {
        Boolean bool = this.f13601a;
        if (bool == null) {
            bool = aVar.f13601a;
        }
        Boolean bool2 = this.f13602b;
        if (bool2 == null) {
            bool2 = aVar.f13602b;
        }
        return new C9254a(bool, bool2);
    }

    /* renamed from: e */
    public final Boolean mo43548e() {
        return this.f13601a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C9254a)) {
            return false;
        }
        C9254a aVar = (C9254a) obj;
        if (m18992n(this.f13601a) == m18992n(aVar.f13601a) && m18992n(this.f13602b) == m18992n(aVar.f13602b)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final Boolean mo43550f() {
        return this.f13602b;
    }

    public final int hashCode() {
        return ((m18992n(this.f13601a) + 527) * 31) + m18992n(this.f13602b);
    }

    /* renamed from: i */
    public final String mo43552i() {
        return "G1" + m18995q(this.f13601a) + m18995q(this.f13602b);
    }

    /* renamed from: j */
    public final boolean mo43553j() {
        Boolean bool = this.f13601a;
        if (bool == null || bool.booleanValue()) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public final boolean mo43554k() {
        Boolean bool = this.f13602b;
        if (bool == null || bool.booleanValue()) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public final boolean mo43555m(C9254a aVar) {
        Boolean bool = this.f13601a;
        Boolean bool2 = Boolean.FALSE;
        if (bool == bool2 && aVar.f13601a != bool2) {
            return true;
        }
        if (this.f13602b != bool2) {
            return false;
        }
        if (aVar.f13602b != bool2) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ConsentSettings: ");
        sb.append("adStorage=");
        Boolean bool = this.f13601a;
        String str2 = "denied";
        if (bool == null) {
            sb.append("uninitialized");
        } else {
            if (true != bool.booleanValue()) {
                str = str2;
            } else {
                str = "granted";
            }
            sb.append(str);
        }
        sb.append(", analyticsStorage=");
        Boolean bool2 = this.f13602b;
        if (bool2 == null) {
            sb.append("uninitialized");
        } else {
            if (true == bool2.booleanValue()) {
                str2 = "granted";
            }
            sb.append(str2);
        }
        return sb.toString();
    }
}
