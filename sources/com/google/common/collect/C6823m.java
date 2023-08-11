package com.google.common.collect;

import com.google.common.collect.C6817k;
import com.google.j2objc.annotations.RetainedWith;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;

/* renamed from: com.google.common.collect.m */
/* compiled from: ImmutableMap */
public abstract class C6823m<K, V> implements Map<K, V>, Serializable {

    /* renamed from: e */
    static final Map.Entry<?, ?>[] f8934e = new Map.Entry[0];
    @RetainedWith

    /* renamed from: b */
    private transient C6826n<Map.Entry<K, V>> f8935b;
    @RetainedWith

    /* renamed from: c */
    private transient C6826n<K> f8936c;
    @RetainedWith

    /* renamed from: d */
    private transient C6817k<V> f8937d;

    /* renamed from: com.google.common.collect.m$a */
    /* compiled from: ImmutableMap */
    public static class C6824a<K, V> {

        /* renamed from: a */
        Comparator<? super V> f8938a;

        /* renamed from: b */
        Object[] f8939b;

        /* renamed from: c */
        int f8940c = 0;

        /* renamed from: d */
        boolean f8941d = false;

        C6824a(int i) {
            this.f8939b = new Object[(i * 2)];
        }

        /* renamed from: b */
        private void m11659b(int i) {
            int i2 = i * 2;
            Object[] objArr = this.f8939b;
            if (i2 > objArr.length) {
                this.f8939b = Arrays.copyOf(objArr, C6817k.C6818a.m11631a(objArr.length, i2));
                this.f8941d = false;
            }
        }

        /* renamed from: a */
        public C6823m<K, V> mo39514a() {
            mo39518f();
            this.f8941d = true;
            return C6878y.m11871l(this.f8940c, this.f8939b);
        }

        /* renamed from: c */
        public C6824a<K, V> mo39515c(K k, V v) {
            m11659b(this.f8940c + 1);
            C6808d.m11616a(k, v);
            Object[] objArr = this.f8939b;
            int i = this.f8940c;
            objArr[i * 2] = k;
            objArr[(i * 2) + 1] = v;
            this.f8940c = i + 1;
            return this;
        }

        /* renamed from: d */
        public C6824a<K, V> mo39516d(Map.Entry<? extends K, ? extends V> entry) {
            return mo39515c(entry.getKey(), entry.getValue());
        }

        /* renamed from: e */
        public C6824a<K, V> mo39517e(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            if (iterable instanceof Collection) {
                m11659b(this.f8940c + ((Collection) iterable).size());
            }
            for (Map.Entry d : iterable) {
                mo39516d(d);
            }
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo39518f() {
            int i;
            if (this.f8938a != null) {
                if (this.f8941d) {
                    this.f8939b = Arrays.copyOf(this.f8939b, this.f8940c * 2);
                }
                Map.Entry[] entryArr = new Map.Entry[this.f8940c];
                int i2 = 0;
                while (true) {
                    i = this.f8940c;
                    if (i2 >= i) {
                        break;
                    }
                    Object[] objArr = this.f8939b;
                    int i3 = i2 * 2;
                    entryArr[i2] = new AbstractMap.SimpleImmutableEntry(objArr[i3], objArr[i3 + 1]);
                    i2++;
                }
                Arrays.sort(entryArr, 0, i, C6875v.m11863a(this.f8938a).mo39684b(C6870t.m11855c()));
                for (int i4 = 0; i4 < this.f8940c; i4++) {
                    int i5 = i4 * 2;
                    this.f8939b[i5] = entryArr[i4].getKey();
                    this.f8939b[i5 + 1] = entryArr[i4].getValue();
                }
            }
        }
    }

    /* renamed from: com.google.common.collect.m$b */
    /* compiled from: ImmutableMap */
    static class C6825b<K, V> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: b */
        private final Object f8942b;

        /* renamed from: c */
        private final Object f8943c;

        C6825b(C6823m<K, V> mVar) {
            Object[] objArr = new Object[mVar.size()];
            Object[] objArr2 = new Object[mVar.size()];
            C6809d0<Map.Entry<K, V>> r = mVar.entrySet().iterator();
            int i = 0;
            while (r.hasNext()) {
                Map.Entry next = r.next();
                objArr[i] = next.getKey();
                objArr2[i] = next.getValue();
                i++;
            }
            this.f8942b = objArr;
            this.f8943c = objArr2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final Object mo39519a() {
            Object[] objArr = (Object[]) this.f8942b;
            Object[] objArr2 = (Object[]) this.f8943c;
            C6824a b = mo39520b(objArr.length);
            for (int i = 0; i < objArr.length; i++) {
                b.mo39515c(objArr[i], objArr2[i]);
            }
            return b.mo39514a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C6824a<K, V> mo39520b(int i) {
            return new C6824a<>(i);
        }

        /* access modifiers changed from: package-private */
        public final Object readResolve() {
            Object obj = this.f8942b;
            if (!(obj instanceof C6826n)) {
                return mo39519a();
            }
            C6826n nVar = (C6826n) obj;
            C6824a b = mo39520b(nVar.size());
            C6809d0 r = nVar.iterator();
            C6809d0 r2 = ((C6817k) this.f8943c).iterator();
            while (r.hasNext()) {
                b.mo39515c(r.next(), r2.next());
            }
            return b.mo39514a();
        }
    }

    C6823m() {
    }

    /* renamed from: a */
    public static <K, V> C6823m<K, V> m11649a(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        int i;
        if (iterable instanceof Collection) {
            i = ((Collection) iterable).size();
        } else {
            i = 4;
        }
        C6824a aVar = new C6824a(i);
        aVar.mo39517e(iterable);
        return aVar.mo39514a();
    }

    /* renamed from: b */
    public static <K, V> C6823m<K, V> m11650b(Map<? extends K, ? extends V> map) {
        if ((map instanceof C6823m) && !(map instanceof SortedMap)) {
            C6823m<K, V> mVar = (C6823m) map;
            if (!mVar.mo39502h()) {
                return mVar;
            }
        }
        return m11649a(map.entrySet());
    }

    /* renamed from: j */
    public static <K, V> C6823m<K, V> m11651j() {
        return C6878y.f9018i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract C6826n<Map.Entry<K, V>> mo39491c();

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public boolean containsKey(Object obj) {
        if (get(obj) != null) {
            return true;
        }
        return false;
    }

    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract C6826n<K> mo39495e();

    public boolean equals(Object obj) {
        return C6870t.m11853a(this, obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public abstract C6817k<V> mo39498f();

    /* renamed from: g */
    public C6826n<Map.Entry<K, V>> entrySet() {
        C6826n<Map.Entry<K, V>> nVar = this.f8935b;
        if (nVar != null) {
            return nVar;
        }
        C6826n<Map.Entry<K, V>> c = mo39491c();
        this.f8935b = c;
        return c;
    }

    public abstract V get(Object obj);

    public final V getOrDefault(Object obj, V v) {
        V v2 = get(obj);
        if (v2 != null) {
            return v2;
        }
        return v;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public abstract boolean mo39502h();

    public int hashCode() {
        return C6803a0.m11610b(entrySet());
    }

    /* renamed from: i */
    public C6826n<K> keySet() {
        C6826n<K> nVar = this.f8936c;
        if (nVar != null) {
            return nVar;
        }
        C6826n<K> e = mo39495e();
        this.f8936c = e;
        return e;
    }

    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public C6817k<V> values() {
        C6817k<V> kVar = this.f8937d;
        if (kVar != null) {
            return kVar;
        }
        C6817k<V> f = mo39498f();
        this.f8937d = f;
        return f;
    }

    @Deprecated
    public final V put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return C6870t.m11854b(this);
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new C6825b(this);
    }
}
