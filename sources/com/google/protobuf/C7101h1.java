package com.google.protobuf;

import com.google.protobuf.C7174t;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: com.google.protobuf.h1 */
/* compiled from: SmallSortedMap */
class C7101h1<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: b */
    private final int f9580b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public List<C7101h1<K, V>.e> f9581c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Map<K, V> f9582d;

    /* renamed from: e */
    private boolean f9583e;

    /* renamed from: f */
    private volatile C7101h1<K, V>.g f9584f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public Map<K, V> f9585g;

    /* renamed from: h */
    private volatile C7101h1<K, V>.c f9586h;

    /* renamed from: com.google.protobuf.h1$a */
    /* compiled from: SmallSortedMap */
    static class C7102a extends C7101h1<FieldDescriptorType, Object> {
        C7102a(int i) {
            super(i, (C7102a) null);
        }

        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return C7101h1.super.put((C7174t.C7176b) obj, obj2);
        }

        /* renamed from: q */
        public void mo40366q() {
            if (!mo40364p()) {
                for (int i = 0; i < mo40361l(); i++) {
                    Map.Entry k = mo40360k(i);
                    if (((C7174t.C7176b) k.getKey()).mo40661z()) {
                        k.setValue(Collections.unmodifiableList((List) k.getValue()));
                    }
                }
                for (Map.Entry entry : mo40363n()) {
                    if (((C7174t.C7176b) entry.getKey()).mo40661z()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            C7101h1.super.mo40366q();
        }
    }

    /* renamed from: com.google.protobuf.h1$c */
    /* compiled from: SmallSortedMap */
    private class C7104c extends C7101h1<K, V>.g {
        private C7104c() {
            super(C7101h1.this, (C7102a) null);
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new C7103b(C7101h1.this, (C7102a) null);
        }

        /* synthetic */ C7104c(C7101h1 h1Var, C7102a aVar) {
            this();
        }
    }

    /* renamed from: com.google.protobuf.h1$d */
    /* compiled from: SmallSortedMap */
    private static class C7105d {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final Iterator<Object> f9591a = new C7106a();

        /* renamed from: b */
        private static final Iterable<Object> f9592b = new C7107b();

        /* renamed from: com.google.protobuf.h1$d$a */
        /* compiled from: SmallSortedMap */
        static class C7106a implements Iterator<Object> {
            C7106a() {
            }

            public boolean hasNext() {
                return false;
            }

            public Object next() {
                throw new NoSuchElementException();
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        /* renamed from: com.google.protobuf.h1$d$b */
        /* compiled from: SmallSortedMap */
        static class C7107b implements Iterable<Object> {
            C7107b() {
            }

            public Iterator<Object> iterator() {
                return C7105d.f9591a;
            }
        }

        /* renamed from: b */
        static <T> Iterable<T> m13134b() {
            return f9592b;
        }
    }

    /* renamed from: com.google.protobuf.h1$e */
    /* compiled from: SmallSortedMap */
    private class C7108e implements Map.Entry<K, V>, Comparable<C7101h1<K, V>.e> {

        /* renamed from: b */
        private final K f9593b;

        /* renamed from: c */
        private V f9594c;

        C7108e(C7101h1 h1Var, Map.Entry<K, V> entry) {
            this((Comparable) entry.getKey(), entry.getValue());
        }

        /* renamed from: b */
        private boolean m13135b(Object obj, Object obj2) {
            if (obj != null) {
                return obj.equals(obj2);
            }
            if (obj2 == null) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public int compareTo(C7101h1<K, V>.e eVar) {
            return getKey().compareTo(eVar.getKey());
        }

        /* renamed from: c */
        public K getKey() {
            return this.f9593b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (!m13135b(this.f9593b, entry.getKey()) || !m13135b(this.f9594c, entry.getValue())) {
                return false;
            }
            return true;
        }

        public V getValue() {
            return this.f9594c;
        }

        public int hashCode() {
            int i;
            K k = this.f9593b;
            int i2 = 0;
            if (k == null) {
                i = 0;
            } else {
                i = k.hashCode();
            }
            V v = this.f9594c;
            if (v != null) {
                i2 = v.hashCode();
            }
            return i ^ i2;
        }

        public V setValue(V v) {
            C7101h1.this.m13117h();
            V v2 = this.f9594c;
            this.f9594c = v;
            return v2;
        }

        public String toString() {
            return this.f9593b + "=" + this.f9594c;
        }

        C7108e(K k, V v) {
            this.f9593b = k;
            this.f9594c = v;
        }
    }

    /* renamed from: com.google.protobuf.h1$g */
    /* compiled from: SmallSortedMap */
    private class C7110g extends AbstractSet<Map.Entry<K, V>> {
        private C7110g() {
        }

        /* renamed from: b */
        public boolean add(Map.Entry<K, V> entry) {
            if (contains(entry)) {
                return false;
            }
            C7101h1.this.put((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        public void clear() {
            C7101h1.this.clear();
        }

        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = C7101h1.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 == value || (obj2 != null && obj2.equals(value))) {
                return true;
            }
            return false;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new C7109f(C7101h1.this, (C7102a) null);
        }

        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            C7101h1.this.remove(entry.getKey());
            return true;
        }

        public int size() {
            return C7101h1.this.size();
        }

        /* synthetic */ C7110g(C7101h1 h1Var, C7102a aVar) {
            this();
        }
    }

    /* synthetic */ C7101h1(int i, C7102a aVar) {
        this(i);
    }

    /* renamed from: g */
    private int m13116g(K k) {
        int size = this.f9581c.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo(this.f9581c.get(size).getKey());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = k.compareTo(this.f9581c.get(i2).getKey());
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
    /* renamed from: h */
    public void m13117h() {
        if (this.f9583e) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: j */
    private void m13118j() {
        m13117h();
        if (this.f9581c.isEmpty() && !(this.f9581c instanceof ArrayList)) {
            this.f9581c = new ArrayList(this.f9580b);
        }
    }

    /* renamed from: o */
    private SortedMap<K, V> m13119o() {
        m13117h();
        if (this.f9582d.isEmpty() && !(this.f9582d instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f9582d = treeMap;
            this.f9585g = treeMap.descendingMap();
        }
        return (SortedMap) this.f9582d;
    }

    /* renamed from: r */
    static <FieldDescriptorType extends C7174t.C7176b<FieldDescriptorType>> C7101h1<FieldDescriptorType, Object> m13120r(int i) {
        return new C7102a(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public V m13121t(int i) {
        m13117h();
        V value = this.f9581c.remove(i).getValue();
        if (!this.f9582d.isEmpty()) {
            Iterator it = m13119o().entrySet().iterator();
            this.f9581c.add(new C7108e(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    public void clear() {
        m13117h();
        if (!this.f9581c.isEmpty()) {
            this.f9581c.clear();
        }
        if (!this.f9582d.isEmpty()) {
            this.f9582d.clear();
        }
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (m13116g(comparable) >= 0 || this.f9582d.containsKey(comparable)) {
            return true;
        }
        return false;
    }

    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f9584f == null) {
            this.f9584f = new C7110g(this, (C7102a) null);
        }
        return this.f9584f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7101h1)) {
            return super.equals(obj);
        }
        C7101h1 h1Var = (C7101h1) obj;
        int size = size();
        if (size != h1Var.size()) {
            return false;
        }
        int l = mo40361l();
        if (l != h1Var.mo40361l()) {
            return entrySet().equals(h1Var.entrySet());
        }
        for (int i = 0; i < l; i++) {
            if (!mo40360k(i).equals(h1Var.mo40360k(i))) {
                return false;
            }
        }
        if (l != size) {
            return this.f9582d.equals(h1Var.f9582d);
        }
        return true;
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int g = m13116g(comparable);
        if (g >= 0) {
            return this.f9581c.get(g).getValue();
        }
        return this.f9582d.get(comparable);
    }

    public int hashCode() {
        int l = mo40361l();
        int i = 0;
        for (int i2 = 0; i2 < l; i2++) {
            i += this.f9581c.get(i2).hashCode();
        }
        if (mo40362m() > 0) {
            return i + this.f9582d.hashCode();
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public Set<Map.Entry<K, V>> mo40359i() {
        if (this.f9586h == null) {
            this.f9586h = new C7104c(this, (C7102a) null);
        }
        return this.f9586h;
    }

    /* renamed from: k */
    public Map.Entry<K, V> mo40360k(int i) {
        return this.f9581c.get(i);
    }

    /* renamed from: l */
    public int mo40361l() {
        return this.f9581c.size();
    }

    /* renamed from: m */
    public int mo40362m() {
        return this.f9582d.size();
    }

    /* renamed from: n */
    public Iterable<Map.Entry<K, V>> mo40363n() {
        if (this.f9582d.isEmpty()) {
            return C7105d.m13134b();
        }
        return this.f9582d.entrySet();
    }

    /* renamed from: p */
    public boolean mo40364p() {
        return this.f9583e;
    }

    /* renamed from: q */
    public void mo40366q() {
        Map<K, V> map;
        Map<K, V> map2;
        if (!this.f9583e) {
            if (this.f9582d.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(this.f9582d);
            }
            this.f9582d = map;
            if (this.f9585g.isEmpty()) {
                map2 = Collections.emptyMap();
            } else {
                map2 = Collections.unmodifiableMap(this.f9585g);
            }
            this.f9585g = map2;
            this.f9583e = true;
        }
    }

    public V remove(Object obj) {
        m13117h();
        Comparable comparable = (Comparable) obj;
        int g = m13116g(comparable);
        if (g >= 0) {
            return m13121t(g);
        }
        if (this.f9582d.isEmpty()) {
            return null;
        }
        return this.f9582d.remove(comparable);
    }

    /* renamed from: s */
    public V put(K k, V v) {
        m13117h();
        int g = m13116g(k);
        if (g >= 0) {
            return this.f9581c.get(g).setValue(v);
        }
        m13118j();
        int i = -(g + 1);
        if (i >= this.f9580b) {
            return m13119o().put(k, v);
        }
        int size = this.f9581c.size();
        int i2 = this.f9580b;
        if (size == i2) {
            C7108e remove = this.f9581c.remove(i2 - 1);
            m13119o().put(remove.getKey(), remove.getValue());
        }
        this.f9581c.add(i, new C7108e(k, v));
        return null;
    }

    public int size() {
        return this.f9581c.size() + this.f9582d.size();
    }

    /* renamed from: com.google.protobuf.h1$b */
    /* compiled from: SmallSortedMap */
    private class C7103b implements Iterator<Map.Entry<K, V>> {

        /* renamed from: b */
        private int f9587b;

        /* renamed from: c */
        private Iterator<Map.Entry<K, V>> f9588c;

        private C7103b() {
            this.f9587b = C7101h1.this.f9581c.size();
        }

        /* renamed from: a */
        private Iterator<Map.Entry<K, V>> m13131a() {
            if (this.f9588c == null) {
                this.f9588c = C7101h1.this.f9585g.entrySet().iterator();
            }
            return this.f9588c;
        }

        /* renamed from: c */
        public Map.Entry<K, V> next() {
            if (m13131a().hasNext()) {
                return (Map.Entry) m13131a().next();
            }
            List b = C7101h1.this.f9581c;
            int i = this.f9587b - 1;
            this.f9587b = i;
            return (Map.Entry) b.get(i);
        }

        public boolean hasNext() {
            int i = this.f9587b;
            if ((i <= 0 || i > C7101h1.this.f9581c.size()) && !m13131a().hasNext()) {
                return false;
            }
            return true;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        /* synthetic */ C7103b(C7101h1 h1Var, C7102a aVar) {
            this();
        }
    }

    /* renamed from: com.google.protobuf.h1$f */
    /* compiled from: SmallSortedMap */
    private class C7109f implements Iterator<Map.Entry<K, V>> {

        /* renamed from: b */
        private int f9596b;

        /* renamed from: c */
        private boolean f9597c;

        /* renamed from: d */
        private Iterator<Map.Entry<K, V>> f9598d;

        private C7109f() {
            this.f9596b = -1;
        }

        /* renamed from: a */
        private Iterator<Map.Entry<K, V>> m13138a() {
            if (this.f9598d == null) {
                this.f9598d = C7101h1.this.f9582d.entrySet().iterator();
            }
            return this.f9598d;
        }

        /* renamed from: c */
        public Map.Entry<K, V> next() {
            this.f9597c = true;
            int i = this.f9596b + 1;
            this.f9596b = i;
            if (i < C7101h1.this.f9581c.size()) {
                return (Map.Entry) C7101h1.this.f9581c.get(this.f9596b);
            }
            return (Map.Entry) m13138a().next();
        }

        public boolean hasNext() {
            if (this.f9596b + 1 < C7101h1.this.f9581c.size()) {
                return true;
            }
            if (C7101h1.this.f9582d.isEmpty() || !m13138a().hasNext()) {
                return false;
            }
            return true;
        }

        public void remove() {
            if (this.f9597c) {
                this.f9597c = false;
                C7101h1.this.m13117h();
                if (this.f9596b < C7101h1.this.f9581c.size()) {
                    C7101h1 h1Var = C7101h1.this;
                    int i = this.f9596b;
                    this.f9596b = i - 1;
                    Object unused = h1Var.m13121t(i);
                    return;
                }
                m13138a().remove();
                return;
            }
            throw new IllegalStateException("remove() was called before next()");
        }

        /* synthetic */ C7109f(C7101h1 h1Var, C7102a aVar) {
            this();
        }
    }

    private C7101h1(int i) {
        this.f9580b = i;
        this.f9581c = Collections.emptyList();
        this.f9582d = Collections.emptyMap();
        this.f9585g = Collections.emptyMap();
    }
}
