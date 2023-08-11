package p022a4;

import java.util.HashMap;
import java.util.Map;
import p231t4.C9713p;
import p296z3.C10810n;

/* renamed from: a4.c */
public class C2202c {

    /* renamed from: a */
    private Map<String, String> f981a = new HashMap();

    /* renamed from: a */
    private final void m1789a(String str, String str2) {
        C9713p.m20276k(str, "Name should be non-null");
        this.f981a.put(str, str2);
    }

    /* renamed from: b */
    public C2202c mo23520b(String str) {
        m1789a("cr", str);
        return this;
    }

    /* renamed from: c */
    public C2202c mo23521c(String str) {
        m1789a("id", str);
        return this;
    }

    /* renamed from: d */
    public C2202c mo23522d(String str) {
        m1789a("nm", str);
        return this;
    }

    /* renamed from: e */
    public C2202c mo23523e(String str) {
        m1789a("ps", str);
        return this;
    }

    /* renamed from: f */
    public final Map<String, String> mo23524f(String str) {
        String str2;
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.f981a.entrySet()) {
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
        return C10810n.m23057c(this.f981a);
    }
}
