package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.j */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
public abstract class C5800j implements C5914q, C5850m {

    /* renamed from: b */
    protected final String f7017b;

    /* renamed from: c */
    protected final Map<String, C5914q> f7018c = new HashMap();

    public C5800j(String str) {
        this.f7017b = str;
    }

    /* renamed from: a */
    public abstract C5914q mo33875a(C6015w4 w4Var, List<C5914q> list);

    /* renamed from: b */
    public final String mo33956b() {
        return this.f7017b;
    }

    /* renamed from: d */
    public final Boolean mo33958d() {
        return Boolean.TRUE;
    }

    /* renamed from: e */
    public final String mo34099e() {
        return this.f7017b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5800j)) {
            return false;
        }
        C5800j jVar = (C5800j) obj;
        String str = this.f7017b;
        if (str != null) {
            return str.equals(jVar.f7017b);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f7017b;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    /* renamed from: j */
    public final boolean mo33962j(String str) {
        return this.f7018c.containsKey(str);
    }

    /* renamed from: k */
    public final void mo33963k(String str, C5914q qVar) {
        if (qVar == null) {
            this.f7018c.remove(str);
        } else {
            this.f7018c.put(str, qVar);
        }
    }

    /* renamed from: q */
    public final C5914q mo33964q(String str) {
        if (this.f7018c.containsKey(str)) {
            return this.f7018c.get(str);
        }
        return C5914q.f7289O;
    }

    /* renamed from: r */
    public final C5914q mo33965r(String str, C6015w4 w4Var, List<C5914q> list) {
        if ("toString".equals(str)) {
            return new C5978u(this.f7017b);
        }
        return C5817k.m9474a(this, new C5978u(str), w4Var, list);
    }

    /* renamed from: y */
    public final Double mo33971y() {
        return Double.valueOf(Double.NaN);
    }

    /* renamed from: z */
    public final Iterator<C5914q> mo33972z() {
        return C5817k.m9475b(this.f7018c);
    }

    /* renamed from: c */
    public C5914q mo33957c() {
        return this;
    }
}
