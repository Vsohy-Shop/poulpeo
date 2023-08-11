package com.google.android.gms.internal.measurement;

import com.adjust.sdk.Constants;
import com.rmn.apiclient.impl.api.call.APIParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* renamed from: com.google.android.gms.internal.measurement.f */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
public final class C5732f implements Iterable<C5914q>, C5914q, C5850m {

    /* renamed from: b */
    final SortedMap<Integer, C5914q> f6930b;

    /* renamed from: c */
    final Map<String, C5914q> f6931c;

    public C5732f() {
        this.f6930b = new TreeMap();
        this.f6931c = new TreeMap();
    }

    /* renamed from: A */
    public final Iterator<Integer> mo33949A() {
        return this.f6930b.keySet().iterator();
    }

    /* renamed from: B */
    public final List<C5914q> mo33950B() {
        ArrayList arrayList = new ArrayList(mo33967t());
        for (int i = 0; i < mo33967t(); i++) {
            arrayList.add(mo33969u(i));
        }
        return arrayList;
    }

    /* renamed from: F */
    public final void mo33951F() {
        this.f6930b.clear();
    }

    /* renamed from: G */
    public final void mo33952G(int i, C5914q qVar) {
        if (i < 0) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Invalid value index: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        } else if (i >= mo33967t()) {
            mo33954I(i, qVar);
        } else {
            for (int intValue = this.f6930b.lastKey().intValue(); intValue >= i; intValue--) {
                SortedMap<Integer, C5914q> sortedMap = this.f6930b;
                Integer valueOf = Integer.valueOf(intValue);
                C5914q qVar2 = sortedMap.get(valueOf);
                if (qVar2 != null) {
                    mo33954I(intValue + 1, qVar2);
                    this.f6930b.remove(valueOf);
                }
            }
            mo33954I(i, qVar);
        }
    }

    /* renamed from: H */
    public final void mo33953H(int i) {
        int intValue = this.f6930b.lastKey().intValue();
        if (i <= intValue && i >= 0) {
            this.f6930b.remove(Integer.valueOf(i));
            if (i == intValue) {
                SortedMap<Integer, C5914q> sortedMap = this.f6930b;
                int i2 = i - 1;
                Integer valueOf = Integer.valueOf(i2);
                if (!sortedMap.containsKey(valueOf) && i2 >= 0) {
                    this.f6930b.put(valueOf, C5914q.f7289O);
                    return;
                }
                return;
            }
            while (true) {
                i++;
                if (i <= this.f6930b.lastKey().intValue()) {
                    SortedMap<Integer, C5914q> sortedMap2 = this.f6930b;
                    Integer valueOf2 = Integer.valueOf(i);
                    C5914q qVar = sortedMap2.get(valueOf2);
                    if (qVar != null) {
                        this.f6930b.put(Integer.valueOf(i - 1), qVar);
                        this.f6930b.remove(valueOf2);
                    }
                } else {
                    return;
                }
            }
        }
    }

    @RequiresNonNull({"elements"})
    /* renamed from: I */
    public final void mo33954I(int i, C5914q qVar) {
        if (i > 32468) {
            throw new IllegalStateException("Array too large");
        } else if (i < 0) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Out of bounds index: ");
            sb.append(i);
            throw new IndexOutOfBoundsException(sb.toString());
        } else if (qVar == null) {
            this.f6930b.remove(Integer.valueOf(i));
        } else {
            this.f6930b.put(Integer.valueOf(i), qVar);
        }
    }

    /* renamed from: J */
    public final boolean mo33955J(int i) {
        if (i >= 0 && i <= this.f6930b.lastKey().intValue()) {
            return this.f6930b.containsKey(Integer.valueOf(i));
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("Out of bounds index: ");
        sb.append(i);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    /* renamed from: b */
    public final String mo33956b() {
        return mo33970v(",");
    }

    /* renamed from: c */
    public final C5914q mo33957c() {
        C5732f fVar = new C5732f();
        for (Map.Entry next : this.f6930b.entrySet()) {
            if (next.getValue() instanceof C5850m) {
                fVar.f6930b.put((Integer) next.getKey(), (C5914q) next.getValue());
            } else {
                fVar.f6930b.put((Integer) next.getKey(), ((C5914q) next.getValue()).mo33957c());
            }
        }
        return fVar;
    }

    /* renamed from: d */
    public final Boolean mo33958d() {
        return Boolean.TRUE;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5732f)) {
            return false;
        }
        C5732f fVar = (C5732f) obj;
        if (mo33967t() != fVar.mo33967t()) {
            return false;
        }
        if (this.f6930b.isEmpty()) {
            return fVar.f6930b.isEmpty();
        }
        for (int intValue = this.f6930b.firstKey().intValue(); intValue <= this.f6930b.lastKey().intValue(); intValue++) {
            if (!mo33969u(intValue).equals(fVar.mo33969u(intValue))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f6930b.hashCode() * 31;
    }

    public final Iterator<C5914q> iterator() {
        return new C5715e(this);
    }

    /* renamed from: j */
    public final boolean mo33962j(String str) {
        if ("length".equals(str) || this.f6931c.containsKey(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public final void mo33963k(String str, C5914q qVar) {
        if (qVar == null) {
            this.f6931c.remove(str);
        } else {
            this.f6931c.put(str, qVar);
        }
    }

    /* renamed from: q */
    public final C5914q mo33964q(String str) {
        C5914q qVar;
        if ("length".equals(str)) {
            return new C5783i(Double.valueOf((double) mo33967t()));
        }
        if (!mo33962j(str) || (qVar = this.f6931c.get(str)) == null) {
            return C5914q.f7289O;
        }
        return qVar;
    }

    /* renamed from: r */
    public final C5914q mo33965r(String str, C6015w4 w4Var, List<C5914q> list) {
        if ("concat".equals(str) || "every".equals(str) || "filter".equals(str) || "forEach".equals(str) || "indexOf".equals(str) || "join".equals(str) || "lastIndexOf".equals(str) || "map".equals(str) || "pop".equals(str) || Constants.PUSH.equals(str) || "reduce".equals(str) || "reduceRight".equals(str) || "reverse".equals(str) || "shift".equals(str) || "slice".equals(str) || "some".equals(str) || APIParams.SORT.equals(str) || "splice".equals(str) || "toString".equals(str) || "unshift".equals(str)) {
            return C5699d0.m8966a(str, this, w4Var, list);
        }
        return C5817k.m9474a(this, new C5978u(str), w4Var, list);
    }

    /* renamed from: s */
    public final int mo33966s() {
        return this.f6930b.size();
    }

    /* renamed from: t */
    public final int mo33967t() {
        if (this.f6930b.isEmpty()) {
            return 0;
        }
        return this.f6930b.lastKey().intValue() + 1;
    }

    public final String toString() {
        return mo33970v(",");
    }

    /* renamed from: u */
    public final C5914q mo33969u(int i) {
        C5914q qVar;
        if (i >= mo33967t()) {
            throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
        } else if (!mo33955J(i) || (qVar = this.f6930b.get(Integer.valueOf(i))) == null) {
            return C5914q.f7289O;
        } else {
            return qVar;
        }
    }

    /* renamed from: v */
    public final String mo33970v(String str) {
        if (str == null) {
            str = "";
        }
        StringBuilder sb = new StringBuilder();
        if (!this.f6930b.isEmpty()) {
            for (int i = 0; i < mo33967t(); i++) {
                C5914q u = mo33969u(i);
                sb.append(str);
                if (!(u instanceof C5994v) && !(u instanceof C5882o)) {
                    sb.append(u.mo33956b());
                }
            }
            sb.delete(0, str.length());
        }
        return sb.toString();
    }

    /* renamed from: y */
    public final Double mo33971y() {
        if (this.f6930b.size() == 1) {
            return mo33969u(0).mo33971y();
        }
        if (this.f6930b.size() <= 0) {
            return Double.valueOf(0.0d);
        }
        return Double.valueOf(Double.NaN);
    }

    /* renamed from: z */
    public final Iterator<C5914q> mo33972z() {
        return new C5698d(this, this.f6930b.keySet().iterator(), this.f6931c.keySet().iterator());
    }

    public C5732f(List<C5914q> list) {
        this();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                mo33954I(i, list.get(i));
            }
        }
    }
}
