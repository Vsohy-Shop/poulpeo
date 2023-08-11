package androidx.compose.runtime.external.kotlinx.collections.immutable;

import java.util.Map;
import p412pf.C13216e;

/* compiled from: ImmutableMap.kt */
public interface PersistentMap<K, V> extends ImmutableMap<K, V> {

    /* compiled from: ImmutableMap.kt */
    public interface Builder<K, V> extends Map<K, V>, C13216e {
        PersistentMap<K, V> build();
    }

    Builder<K, V> builder();

    PersistentMap<K, V> clear();

    PersistentMap<K, V> put(K k, V v);

    PersistentMap<K, V> putAll(Map<? extends K, ? extends V> map);

    PersistentMap<K, V> remove(K k);

    PersistentMap<K, V> remove(K k, V v);
}
