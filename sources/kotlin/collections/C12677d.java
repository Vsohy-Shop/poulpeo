package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p412pf.C13212a;

/* renamed from: kotlin.collections.d */
/* compiled from: AbstractMap.kt */
public abstract class C12677d<K, V> implements Map<K, V>, C13212a {
    public static final C12678a Companion = new C12678a((DefaultConstructorMarker) null);
    private volatile Set<? extends K> _keys;
    private volatile Collection<? extends V> _values;

    /* renamed from: kotlin.collections.d$a */
    /* compiled from: AbstractMap.kt */
    public static final class C12678a {
        private C12678a() {
        }

        public /* synthetic */ C12678a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: kotlin.collections.d$b */
    /* compiled from: AbstractMap.kt */
    public static final class C12679b extends C12694i<K> {

        /* renamed from: b */
        final /* synthetic */ C12677d<K, V> f20359b;

        /* renamed from: kotlin.collections.d$b$a */
        /* compiled from: AbstractMap.kt */
        public static final class C12680a implements Iterator<K>, C13212a {

            /* renamed from: b */
            final /* synthetic */ Iterator<Map.Entry<K, V>> f20360b;

            C12680a(Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
                this.f20360b = it;
            }

            public boolean hasNext() {
                return this.f20360b.hasNext();
            }

            public K next() {
                return this.f20360b.next().getKey();
            }

            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        }

        C12679b(C12677d<K, ? extends V> dVar) {
            this.f20359b = dVar;
        }

        public boolean contains(Object obj) {
            return this.f20359b.containsKey(obj);
        }

        public int getSize() {
            return this.f20359b.size();
        }

        public Iterator<K> iterator() {
            return new C12680a(this.f20359b.entrySet().iterator());
        }
    }

    /* renamed from: kotlin.collections.d$c */
    /* compiled from: AbstractMap.kt */
    static final class C12681c extends C12777p implements Function1<Map.Entry<? extends K, ? extends V>, CharSequence> {

        /* renamed from: g */
        final /* synthetic */ C12677d<K, V> f20361g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12681c(C12677d<K, ? extends V> dVar) {
            super(1);
            this.f20361g = dVar;
        }

        /* renamed from: a */
        public final CharSequence invoke(Map.Entry<? extends K, ? extends V> entry) {
            C12775o.m28639i(entry, "it");
            return this.f20361g.toString(entry);
        }
    }

    /* renamed from: kotlin.collections.d$d */
    /* compiled from: AbstractMap.kt */
    public static final class C12682d extends C12662a<V> {

        /* renamed from: b */
        final /* synthetic */ C12677d<K, V> f20362b;

        /* renamed from: kotlin.collections.d$d$a */
        /* compiled from: AbstractMap.kt */
        public static final class C12683a implements Iterator<V>, C13212a {

            /* renamed from: b */
            final /* synthetic */ Iterator<Map.Entry<K, V>> f20363b;

            C12683a(Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
                this.f20363b = it;
            }

            public boolean hasNext() {
                return this.f20363b.hasNext();
            }

            public V next() {
                return this.f20363b.next().getValue();
            }

            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        }

        C12682d(C12677d<K, ? extends V> dVar) {
            this.f20362b = dVar;
        }

        public boolean contains(Object obj) {
            return this.f20362b.containsValue(obj);
        }

        public int getSize() {
            return this.f20362b.size();
        }

        public Iterator<V> iterator() {
            return new C12683a(this.f20362b.entrySet().iterator());
        }
    }

    protected C12677d() {
    }

    private final Map.Entry<K, V> implFindEntry(K k) {
        Object obj;
        Iterator it = entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C12775o.m28634d(((Map.Entry) obj).getKey(), k)) {
                break;
            }
        }
        return (Map.Entry) obj;
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean containsEntry$kotlin_stdlib(Map.Entry<?, ?> entry) {
        if (entry == null) {
            return false;
        }
        Object key = entry.getKey();
        Object value = entry.getValue();
        C12775o.m28637g(this, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Object obj = get(key);
        if (!C12775o.m28634d(value, obj)) {
            return false;
        }
        if (obj != null) {
            return true;
        }
        C12775o.m28637g(this, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.containsKey, *>");
        if (!containsKey(key)) {
            return false;
        }
        return true;
    }

    public boolean containsKey(Object obj) {
        if (implFindEntry(obj) != null) {
            return true;
        }
        return false;
    }

    public boolean containsValue(Object obj) {
        Set<Map.Entry> entrySet = entrySet();
        if ((entrySet instanceof Collection) && entrySet.isEmpty()) {
            return false;
        }
        for (Map.Entry value : entrySet) {
            if (C12775o.m28634d(value.getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return getEntries();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (size() != map.size()) {
            return false;
        }
        Set<Map.Entry> entrySet = map.entrySet();
        if ((entrySet instanceof Collection) && entrySet.isEmpty()) {
            return true;
        }
        for (Map.Entry containsEntry$kotlin_stdlib : entrySet) {
            if (!containsEntry$kotlin_stdlib(containsEntry$kotlin_stdlib)) {
                return false;
            }
        }
        return true;
    }

    public V get(Object obj) {
        Map.Entry implFindEntry = implFindEntry(obj);
        if (implFindEntry != null) {
            return implFindEntry.getValue();
        }
        return null;
    }

    public abstract Set getEntries();

    public Set<K> getKeys() {
        if (this._keys == null) {
            this._keys = new C12679b(this);
        }
        Set<? extends K> set = this._keys;
        C12775o.m28636f(set);
        return set;
    }

    public int getSize() {
        return entrySet().size();
    }

    public Collection<V> getValues() {
        if (this._values == null) {
            this._values = new C12682d(this);
        }
        Collection<? extends V> collection = this._values;
        C12775o.m28636f(collection);
        return collection;
    }

    public int hashCode() {
        return entrySet().hashCode();
    }

    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public final /* bridge */ Set<K> keySet() {
        return getKeys();
    }

    public V put(K k, V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public V remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return getSize();
    }

    public String toString() {
        return C12686e0.m28229h0(entrySet(), ", ", "{", "}", 0, (CharSequence) null, new C12681c(this), 24, (Object) null);
    }

    public final /* bridge */ Collection<V> values() {
        return getValues();
    }

    /* access modifiers changed from: private */
    public final String toString(Map.Entry<? extends K, ? extends V> entry) {
        return toString((Object) entry.getKey()) + '=' + toString((Object) entry.getValue());
    }

    private final String toString(Object obj) {
        return obj == this ? "(this Map)" : String.valueOf(obj);
    }
}
