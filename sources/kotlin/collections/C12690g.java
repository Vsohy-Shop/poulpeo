package kotlin.collections;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import p412pf.C13216e;

/* renamed from: kotlin.collections.g */
/* compiled from: AbstractMutableMap.kt */
public abstract class C12690g<K, V> extends AbstractMap<K, V> implements Map<K, V>, C13216e {
    protected C12690g() {
    }

    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return getEntries();
    }

    public abstract Set getEntries();

    public /* bridge */ Set<Object> getKeys() {
        return super.keySet();
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ Collection<Object> getValues() {
        return super.values();
    }

    public final /* bridge */ Set<K> keySet() {
        return getKeys();
    }

    public abstract V put(K k, V v);

    public final /* bridge */ int size() {
        return getSize();
    }

    public final /* bridge */ Collection<V> values() {
        return getValues();
    }
}
