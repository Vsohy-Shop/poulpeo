package androidx.compose.runtime.external.kotlinx.collections.immutable;

import java.util.Map;
import p412pf.C13212a;

/* compiled from: ImmutableMap.kt */
public interface ImmutableMap<K, V> extends Map<K, V>, C13212a {
    ImmutableSet<Map.Entry<K, V>> getEntries();

    ImmutableSet<K> getKeys();

    ImmutableCollection<V> getValues();
}
