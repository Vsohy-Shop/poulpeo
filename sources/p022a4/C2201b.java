package p022a4;

import java.util.HashMap;
import java.util.Map;
import p231t4.C9713p;
import p296z3.C10810n;

/* renamed from: a4.b */
public class C2201b {

    /* renamed from: a */
    private Map<String, String> f980a = new HashMap();

    public C2201b(String str) {
        m1778b("&pa", str);
    }

    /* renamed from: b */
    private final void m1778b(String str, String str2) {
        C9713p.m20276k(str, "Name should be non-null");
        this.f980a.put(str, str2);
    }

    /* renamed from: a */
    public final Map<String, String> mo23509a() {
        return new HashMap(this.f980a);
    }

    /* renamed from: c */
    public C2201b mo23510c(String str) {
        m1778b("&col", str);
        return this;
    }

    /* renamed from: d */
    public C2201b mo23511d(int i) {
        m1778b("&cos", Integer.toString(i));
        return this;
    }

    /* renamed from: e */
    public C2201b mo23512e(String str) {
        m1778b("&pal", str);
        return this;
    }

    /* renamed from: f */
    public C2201b mo23513f(String str) {
        m1778b("&ta", str);
        return this;
    }

    /* renamed from: g */
    public C2201b mo23514g(String str) {
        m1778b("&tcc", str);
        return this;
    }

    /* renamed from: h */
    public C2201b mo23515h(String str) {
        m1778b("&ti", str);
        return this;
    }

    /* renamed from: i */
    public C2201b mo23516i(double d) {
        m1778b("&tr", Double.toString(d));
        return this;
    }

    /* renamed from: j */
    public C2201b mo23517j(double d) {
        m1778b("&ts", Double.toString(d));
        return this;
    }

    /* renamed from: k */
    public C2201b mo23518k(double d) {
        m1778b("&tt", Double.toString(d));
        return this;
    }

    public String toString() {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.f980a.entrySet()) {
            if (((String) next.getKey()).startsWith("&")) {
                hashMap.put(((String) next.getKey()).substring(1), (String) next.getValue());
            } else {
                hashMap.put((String) next.getKey(), (String) next.getValue());
            }
        }
        return C10810n.m23057c(hashMap);
    }
}
