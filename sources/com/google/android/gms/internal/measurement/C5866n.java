package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.n */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
public class C5866n implements C5914q, C5850m {

    /* renamed from: b */
    final Map<String, C5914q> f7074b = new HashMap();

    /* renamed from: a */
    public final List<String> mo34191a() {
        return new ArrayList(this.f7074b.keySet());
    }

    /* renamed from: b */
    public final String mo33956b() {
        return "[object Object]";
    }

    /* renamed from: c */
    public final C5914q mo33957c() {
        C5866n nVar = new C5866n();
        for (Map.Entry next : this.f7074b.entrySet()) {
            if (next.getValue() instanceof C5850m) {
                nVar.f7074b.put((String) next.getKey(), (C5914q) next.getValue());
            } else {
                nVar.f7074b.put((String) next.getKey(), ((C5914q) next.getValue()).mo33957c());
            }
        }
        return nVar;
    }

    /* renamed from: d */
    public final Boolean mo33958d() {
        return Boolean.TRUE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5866n)) {
            return false;
        }
        return this.f7074b.equals(((C5866n) obj).f7074b);
    }

    public final int hashCode() {
        return this.f7074b.hashCode();
    }

    /* renamed from: j */
    public final boolean mo33962j(String str) {
        return this.f7074b.containsKey(str);
    }

    /* renamed from: k */
    public final void mo33963k(String str, C5914q qVar) {
        if (qVar == null) {
            this.f7074b.remove(str);
        } else {
            this.f7074b.put(str, qVar);
        }
    }

    /* renamed from: q */
    public final C5914q mo33964q(String str) {
        if (this.f7074b.containsKey(str)) {
            return this.f7074b.get(str);
        }
        return C5914q.f7289O;
    }

    /* renamed from: r */
    public C5914q mo33965r(String str, C6015w4 w4Var, List<C5914q> list) {
        if ("toString".equals(str)) {
            return new C5978u(toString());
        }
        return C5817k.m9474a(this, new C5978u(str), w4Var, list);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (!this.f7074b.isEmpty()) {
            for (String next : this.f7074b.keySet()) {
                sb.append(String.format("%s: %s,", new Object[]{next, this.f7074b.get(next)}));
            }
            sb.deleteCharAt(sb.lastIndexOf(","));
        }
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: y */
    public final Double mo33971y() {
        return Double.valueOf(Double.NaN);
    }

    /* renamed from: z */
    public final Iterator<C5914q> mo33972z() {
        return C5817k.m9475b(this.f7074b);
    }
}
