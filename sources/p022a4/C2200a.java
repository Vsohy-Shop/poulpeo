package p022a4;

import java.util.HashMap;
import java.util.Map;
import p231t4.C9713p;
import p296z3.C10805i;
import p296z3.C10810n;

/* renamed from: a4.a */
public class C2200a {

    /* renamed from: a */
    private Map<String, String> f979a = new HashMap();

    /* renamed from: a */
    private final void m1765a(String str, String str2) {
        C9713p.m20276k(str, "Name should be non-null");
        this.f979a.put(str, str2);
    }

    /* renamed from: b */
    public C2200a mo23496b(String str) {
        m1765a("br", str);
        return this;
    }

    /* renamed from: c */
    public C2200a mo23497c(String str) {
        m1765a("ca", str);
        return this;
    }

    /* renamed from: d */
    public C2200a mo23498d(String str) {
        m1765a("cc", str);
        return this;
    }

    /* renamed from: e */
    public C2200a mo23499e(int i, String str) {
        m1765a(C10805i.m23035k(i), str);
        return this;
    }

    /* renamed from: f */
    public C2200a mo23500f(int i, int i2) {
        m1765a(C10805i.m23036l(i), Integer.toString(i2));
        return this;
    }

    /* renamed from: g */
    public C2200a mo23501g(String str) {
        m1765a("id", str);
        return this;
    }

    /* renamed from: h */
    public C2200a mo23502h(String str) {
        m1765a("nm", str);
        return this;
    }

    /* renamed from: i */
    public C2200a mo23503i(int i) {
        m1765a("ps", Integer.toString(i));
        return this;
    }

    /* renamed from: j */
    public C2200a mo23504j(double d) {
        m1765a("pr", Double.toString(d));
        return this;
    }

    /* renamed from: k */
    public C2200a mo23505k(int i) {
        m1765a("qt", Integer.toString(i));
        return this;
    }

    /* renamed from: l */
    public C2200a mo23506l(String str) {
        m1765a("va", str);
        return this;
    }

    /* renamed from: m */
    public final Map<String, String> mo23507m(String str) {
        String str2;
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.f979a.entrySet()) {
            String valueOf = String.valueOf(str);
            String valueOf2 = String.valueOf((String) next.getKey());
            if (valueOf2.length() != 0) {
                str2 = valueOf.concat(valueOf2);
            } else {
                str2 = new String(valueOf);
            }
            hashMap.put(str2, (String) next.getValue());
        }
        return hashMap;
    }

    public String toString() {
        return C10810n.m23057c(this.f979a);
    }
}
