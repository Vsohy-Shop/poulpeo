package p294z1;

import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;

/* renamed from: z1.b */
/* compiled from: CachedHashCodeArrayMap */
public final class C10781b<K, V> extends ArrayMap<K, V> {

    /* renamed from: b */
    private int f16492b;

    public void clear() {
        this.f16492b = 0;
        super.clear();
    }

    public int hashCode() {
        if (this.f16492b == 0) {
            this.f16492b = super.hashCode();
        }
        return this.f16492b;
    }

    public V put(K k, V v) {
        this.f16492b = 0;
        return super.put(k, v);
    }

    public void putAll(SimpleArrayMap<? extends K, ? extends V> simpleArrayMap) {
        this.f16492b = 0;
        super.putAll(simpleArrayMap);
    }

    public V removeAt(int i) {
        this.f16492b = 0;
        return super.removeAt(i);
    }

    public V setValueAt(int i, V v) {
        this.f16492b = 0;
        return super.setValueAt(i, v);
    }
}
