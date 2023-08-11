package com.google.android.gms.internal.measurement;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.measurement.ta */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
class C5973ta<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: b */
    private final int f7395b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public List<C5925qa> f7396c = Collections.emptyList();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Map<K, V> f7397d = Collections.emptyMap();

    /* renamed from: e */
    private boolean f7398e;

    /* renamed from: f */
    private volatile C5957sa f7399f;

    /* renamed from: g */
    private Map<K, V> f7400g = Collections.emptyMap();

    /* synthetic */ C5973ta(int i, C5861ma maVar) {
        this.f7395b = i;
    }

    /* renamed from: l */
    private final int m9975l(K k) {
        int size = this.f7396c.size() - 1;
        int i = 0;
        if (size >= 0) {
            int compareTo = k.compareTo(this.f7396c.get(size).mo34292a());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = k.compareTo(this.f7396c.get(i2).mo34292a());
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
    public final V m9976m(int i) {
        m9978o();
        V value = this.f7396c.remove(i).getValue();
        if (!this.f7397d.isEmpty()) {
            Iterator it = m9977n().entrySet().iterator();
            List<C5925qa> list = this.f7396c;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new C5925qa(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return value;
    }

    /* renamed from: n */
    private final SortedMap<K, V> m9977n() {
        m9978o();
        if (this.f7397d.isEmpty() && !(this.f7397d instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f7397d = treeMap;
            this.f7400g = treeMap.descendingMap();
        }
        return (SortedMap) this.f7397d;
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public final void m9978o() {
        if (this.f7398e) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: a */
    public void mo34188a() {
        Map<K, V> map;
        Map<K, V> map2;
        if (!this.f7398e) {
            if (this.f7397d.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(this.f7397d);
            }
            this.f7397d = map;
            if (this.f7400g.isEmpty()) {
                map2 = Collections.emptyMap();
            } else {
                map2 = Collections.unmodifiableMap(this.f7400g);
            }
            this.f7400g = map2;
            this.f7398e = true;
        }
    }

    /* renamed from: b */
    public final int mo34440b() {
        return this.f7396c.size();
    }

    /* renamed from: c */
    public final Iterable<Map.Entry<K, V>> mo34441c() {
        if (this.f7397d.isEmpty()) {
            return C5909pa.m9758a();
        }
        return this.f7397d.entrySet();
    }

    public final void clear() {
        m9978o();
        if (!this.f7396c.isEmpty()) {
            this.f7396c.clear();
        }
        if (!this.f7397d.isEmpty()) {
            this.f7397d.clear();
        }
    }

    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (m9975l(comparable) >= 0 || this.f7397d.containsKey(comparable)) {
            return true;
        }
        return false;
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.f7399f == null) {
            this.f7399f = new C5957sa(this, (C5861ma) null);
        }
        return this.f7399f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5973ta)) {
            return super.equals(obj);
        }
        C5973ta taVar = (C5973ta) obj;
        int size = size();
        if (size != taVar.size()) {
            return false;
        }
        int b = mo34440b();
        if (b != taVar.mo34440b()) {
            return entrySet().equals(taVar.entrySet());
        }
        for (int i = 0; i < b; i++) {
            if (!mo34448h(i).equals(taVar.mo34448h(i))) {
                return false;
            }
        }
        if (b != size) {
            return this.f7397d.equals(taVar.f7397d);
        }
        return true;
    }

    /* renamed from: f */
    public final V put(K k, V v) {
        m9978o();
        int l = m9975l(k);
        if (l >= 0) {
            return this.f7396c.get(l).setValue(v);
        }
        m9978o();
        if (this.f7396c.isEmpty() && !(this.f7396c instanceof ArrayList)) {
            this.f7396c = new ArrayList(this.f7395b);
        }
        int i = -(l + 1);
        if (i >= this.f7395b) {
            return m9977n().put(k, v);
        }
        int size = this.f7396c.size();
        int i2 = this.f7395b;
        if (size == i2) {
            C5925qa remove = this.f7396c.remove(i2 - 1);
            m9977n().put(remove.mo34292a(), remove.getValue());
        }
        this.f7396c.add(i, new C5925qa(this, k, v));
        return null;
    }

    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int l = m9975l(comparable);
        if (l >= 0) {
            return this.f7396c.get(l).getValue();
        }
        return this.f7397d.get(comparable);
    }

    /* renamed from: h */
    public final Map.Entry<K, V> mo34448h(int i) {
        return this.f7396c.get(i);
    }

    public final int hashCode() {
        int b = mo34440b();
        int i = 0;
        for (int i2 = 0; i2 < b; i2++) {
            i += this.f7396c.get(i2).hashCode();
        }
        if (this.f7397d.size() > 0) {
            return i + this.f7397d.hashCode();
        }
        return i;
    }

    /* renamed from: k */
    public final boolean mo34450k() {
        return this.f7398e;
    }

    public final V remove(Object obj) {
        m9978o();
        Comparable comparable = (Comparable) obj;
        int l = m9975l(comparable);
        if (l >= 0) {
            return m9976m(l);
        }
        if (this.f7397d.isEmpty()) {
            return null;
        }
        return this.f7397d.remove(comparable);
    }

    public final int size() {
        return this.f7396c.size() + this.f7397d.size();
    }
}
