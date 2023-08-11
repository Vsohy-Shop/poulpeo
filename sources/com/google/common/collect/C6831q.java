package com.google.common.collect;

import com.google.common.collect.C6832r;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import p111h6.C7987a;
import p111h6.C7995d;
import p111h6.C8003j;
import p111h6.C8012n;

/* renamed from: com.google.common.collect.q */
/* compiled from: MapMaker */
public final class C6831q {

    /* renamed from: a */
    boolean f8948a;

    /* renamed from: b */
    int f8949b = -1;

    /* renamed from: c */
    int f8950c = -1;

    /* renamed from: d */
    C6832r.C6852p f8951d;

    /* renamed from: e */
    C6832r.C6852p f8952e;

    /* renamed from: f */
    C7995d<Object> f8953f;

    /* renamed from: a */
    public C6831q mo39527a(int i) {
        boolean z;
        int i2 = this.f8950c;
        boolean z2 = true;
        if (i2 == -1) {
            z = true;
        } else {
            z = false;
        }
        C8012n.m15763v(z, "concurrency level was already set to %s", i2);
        if (i <= 0) {
            z2 = false;
        }
        C8012n.m15745d(z2);
        this.f8950c = i;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo39528b() {
        int i = this.f8950c;
        if (i == -1) {
            return 4;
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo39529c() {
        int i = this.f8949b;
        if (i == -1) {
            return 16;
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C7995d<Object> mo39530d() {
        return (C7995d) C8003j.m15721a(this.f8953f, mo39531e().mo39644b());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C6832r.C6852p mo39531e() {
        return (C6832r.C6852p) C8003j.m15721a(this.f8951d, C6832r.C6852p.STRONG);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C6832r.C6852p mo39532f() {
        return (C6832r.C6852p) C8003j.m15721a(this.f8952e, C6832r.C6852p.STRONG);
    }

    /* renamed from: g */
    public C6831q mo39533g(int i) {
        boolean z;
        int i2 = this.f8949b;
        boolean z2 = true;
        if (i2 == -1) {
            z = true;
        } else {
            z = false;
        }
        C8012n.m15763v(z, "initial capacity was already set to %s", i2);
        if (i < 0) {
            z2 = false;
        }
        C8012n.m15745d(z2);
        this.f8949b = i;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public C6831q mo39534h(C7995d<Object> dVar) {
        boolean z;
        C7995d<Object> dVar2 = this.f8953f;
        if (dVar2 == null) {
            z = true;
        } else {
            z = false;
        }
        C8012n.m15764w(z, "key equivalence was already set to %s", dVar2);
        this.f8953f = (C7995d) C8012n.m15755n(dVar);
        this.f8948a = true;
        return this;
    }

    /* renamed from: i */
    public <K, V> ConcurrentMap<K, V> mo39535i() {
        if (!this.f8948a) {
            return new ConcurrentHashMap(mo39529c(), 0.75f, mo39528b());
        }
        return C6832r.m11701b(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public C6831q mo39536j(C6832r.C6852p pVar) {
        boolean z;
        C6832r.C6852p pVar2 = this.f8951d;
        if (pVar2 == null) {
            z = true;
        } else {
            z = false;
        }
        C8012n.m15764w(z, "Key strength was already set to %s", pVar2);
        this.f8951d = (C6832r.C6852p) C8012n.m15755n(pVar);
        if (pVar != C6832r.C6852p.STRONG) {
            this.f8948a = true;
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public C6831q mo39537k(C6832r.C6852p pVar) {
        boolean z;
        C6832r.C6852p pVar2 = this.f8952e;
        if (pVar2 == null) {
            z = true;
        } else {
            z = false;
        }
        C8012n.m15764w(z, "Value strength was already set to %s", pVar2);
        this.f8952e = (C6832r.C6852p) C8012n.m15755n(pVar);
        if (pVar != C6832r.C6852p.STRONG) {
            this.f8948a = true;
        }
        return this;
    }

    /* renamed from: l */
    public C6831q mo39538l() {
        return mo39536j(C6832r.C6852p.WEAK);
    }

    public String toString() {
        C8003j.C8005b c = C8003j.m15723c(this);
        int i = this.f8949b;
        if (i != -1) {
            c.mo41838b("initialCapacity", i);
        }
        int i2 = this.f8950c;
        if (i2 != -1) {
            c.mo41838b("concurrencyLevel", i2);
        }
        C6832r.C6852p pVar = this.f8951d;
        if (pVar != null) {
            c.mo41840d("keyStrength", C7987a.m15695c(pVar.toString()));
        }
        C6832r.C6852p pVar2 = this.f8952e;
        if (pVar2 != null) {
            c.mo41840d("valueStrength", C7987a.m15695c(pVar2.toString()));
        }
        if (this.f8953f != null) {
            c.mo41842i("keyEquivalence");
        }
        return c.toString();
    }
}
