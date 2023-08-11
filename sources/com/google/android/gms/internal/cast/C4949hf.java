package com.google.android.gms.internal.cast;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.cast.hf */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
class C4949hf extends AbstractMap {

    /* renamed from: b */
    private final int f5243b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public List f5244c = Collections.emptyList();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Map f5245d = Collections.emptyMap();

    /* renamed from: e */
    private boolean f5246e;

    /* renamed from: f */
    private volatile C4915ff f5247f;

    /* renamed from: g */
    private Map f5248g = Collections.emptyMap();

    /* synthetic */ C4949hf(int i, C4932gf gfVar) {
        this.f5243b = i;
    }

    /* renamed from: l */
    private final int m7049l(Comparable comparable) {
        int size = this.f5244c.size() - 1;
        int i = 0;
        if (size >= 0) {
            int compareTo = comparable.compareTo(((C4844bf) this.f5244c.get(size)).mo32649a());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = comparable.compareTo(((C4844bf) this.f5244c.get(i2)).mo32649a());
            if (compareTo2 < 0) {
                size = i2 - 1;
            } else if (compareTo2 <= 0) {
                return i2;
            } else {
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public final Object m7050m(int i) {
        m7052o();
        Object value = ((C4844bf) this.f5244c.remove(i)).getValue();
        if (!this.f5245d.isEmpty()) {
            Iterator it = m7051n().entrySet().iterator();
            List list = this.f5244c;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new C4844bf(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return value;
    }

    /* renamed from: n */
    private final SortedMap m7051n() {
        m7052o();
        if (this.f5245d.isEmpty() && !(this.f5245d instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f5245d = treeMap;
            this.f5248g = treeMap.descendingMap();
        }
        return (SortedMap) this.f5245d;
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public final void m7052o() {
        if (this.f5246e) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: a */
    public void mo32824a() {
        Map map;
        Map map2;
        if (!this.f5246e) {
            if (this.f5245d.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(this.f5245d);
            }
            this.f5245d = map;
            if (this.f5248g.isEmpty()) {
                map2 = Collections.emptyMap();
            } else {
                map2 = Collections.unmodifiableMap(this.f5248g);
            }
            this.f5248g = map2;
            this.f5246e = true;
        }
    }

    /* renamed from: b */
    public final int mo32825b() {
        return this.f5244c.size();
    }

    /* renamed from: c */
    public final Iterable mo32826c() {
        if (this.f5245d.isEmpty()) {
            return C4826af.m6790a();
        }
        return this.f5245d.entrySet();
    }

    public final void clear() {
        m7052o();
        if (!this.f5244c.isEmpty()) {
            this.f5244c.clear();
        }
        if (!this.f5245d.isEmpty()) {
            this.f5245d.clear();
        }
    }

    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (m7049l(comparable) >= 0 || this.f5245d.containsKey(comparable)) {
            return true;
        }
        return false;
    }

    public final Set entrySet() {
        if (this.f5247f == null) {
            this.f5247f = new C4915ff(this, (C4898ef) null);
        }
        return this.f5247f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4949hf)) {
            return super.equals(obj);
        }
        C4949hf hfVar = (C4949hf) obj;
        int size = size();
        if (size != hfVar.size()) {
            return false;
        }
        int b = mo32825b();
        if (b != hfVar.mo32825b()) {
            return entrySet().equals(hfVar.entrySet());
        }
        for (int i = 0; i < b; i++) {
            if (!mo32833h(i).equals(hfVar.mo32833h(i))) {
                return false;
            }
        }
        if (b != size) {
            return this.f5245d.equals(hfVar.f5245d);
        }
        return true;
    }

    /* renamed from: f */
    public final Object put(Comparable comparable, Object obj) {
        m7052o();
        int l = m7049l(comparable);
        if (l >= 0) {
            return ((C4844bf) this.f5244c.get(l)).setValue(obj);
        }
        m7052o();
        if (this.f5244c.isEmpty() && !(this.f5244c instanceof ArrayList)) {
            this.f5244c = new ArrayList(this.f5243b);
        }
        int i = -(l + 1);
        if (i >= this.f5243b) {
            return m7051n().put(comparable, obj);
        }
        int size = this.f5244c.size();
        int i2 = this.f5243b;
        if (size == i2) {
            C4844bf bfVar = (C4844bf) this.f5244c.remove(i2 - 1);
            m7051n().put(bfVar.mo32649a(), bfVar.getValue());
        }
        this.f5244c.add(i, new C4844bf(this, comparable, obj));
        return null;
    }

    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int l = m7049l(comparable);
        if (l >= 0) {
            return ((C4844bf) this.f5244c.get(l)).getValue();
        }
        return this.f5245d.get(comparable);
    }

    /* renamed from: h */
    public final Map.Entry mo32833h(int i) {
        return (Map.Entry) this.f5244c.get(i);
    }

    public final int hashCode() {
        int b = mo32825b();
        int i = 0;
        for (int i2 = 0; i2 < b; i2++) {
            i += ((C4844bf) this.f5244c.get(i2)).hashCode();
        }
        if (this.f5245d.size() > 0) {
            return i + this.f5245d.hashCode();
        }
        return i;
    }

    /* renamed from: k */
    public final boolean mo32835k() {
        return this.f5246e;
    }

    public final Object remove(Object obj) {
        m7052o();
        Comparable comparable = (Comparable) obj;
        int l = m7049l(comparable);
        if (l >= 0) {
            return m7050m(l);
        }
        if (this.f5245d.isEmpty()) {
            return null;
        }
        return this.f5245d.remove(comparable);
    }

    public final int size() {
        return this.f5244c.size() + this.f5245d.size();
    }
}
