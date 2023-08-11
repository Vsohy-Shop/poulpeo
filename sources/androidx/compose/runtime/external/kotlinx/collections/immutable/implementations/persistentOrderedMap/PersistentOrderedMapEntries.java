package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import com.rmn.api.p322v2.cloud.general.CloudMethodReturns;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.C12694i;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nPersistentOrderedMapContentViews.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentOrderedMapContentViews.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapEntries\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,51:1\n1#2:52\n*E\n"})
/* compiled from: PersistentOrderedMapContentViews.kt */
public final class PersistentOrderedMapEntries<K, V> extends C12694i<Map.Entry<? extends K, ? extends V>> implements ImmutableSet<Map.Entry<? extends K, ? extends V>> {
    private final PersistentOrderedMap<K, V> map;

    public PersistentOrderedMapEntries(PersistentOrderedMap<K, V> persistentOrderedMap) {
        C12775o.m28639i(persistentOrderedMap, "map");
        this.map = persistentOrderedMap;
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return contains((Map.Entry) obj);
    }

    public int getSize() {
        return this.map.size();
    }

    public Iterator<Map.Entry<K, V>> iterator() {
        return new PersistentOrderedMapEntriesIterator(this.map);
    }

    public boolean contains(Map.Entry<? extends K, ? extends V> entry) {
        C12775o.m28639i(entry, CloudMethodReturns.RETURN_KEYNAME_ELEMENT);
        V v = this.map.get(entry.getKey());
        if (v != null) {
            return C12775o.m28634d(v, entry.getValue());
        }
        return entry.getValue() == null && this.map.containsKey(entry.getKey());
    }
}
