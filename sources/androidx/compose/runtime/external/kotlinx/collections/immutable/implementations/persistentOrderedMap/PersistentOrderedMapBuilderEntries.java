package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.AbstractMapBuilderEntries;
import com.rmn.api.p322v2.cloud.general.CloudMethodReturns;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nPersistentOrderedMapBuilderContentViews.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentOrderedMapBuilderContentViews.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapBuilderEntries\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,85:1\n1#2:86\n*E\n"})
/* compiled from: PersistentOrderedMapBuilderContentViews.kt */
public final class PersistentOrderedMapBuilderEntries<K, V> extends AbstractMapBuilderEntries<Map.Entry<K, V>, K, V> {
    private final PersistentOrderedMapBuilder<K, V> builder;

    public PersistentOrderedMapBuilderEntries(PersistentOrderedMapBuilder<K, V> persistentOrderedMapBuilder) {
        C12775o.m28639i(persistentOrderedMapBuilder, "builder");
        this.builder = persistentOrderedMapBuilder;
    }

    public void clear() {
        this.builder.clear();
    }

    public boolean containsEntry(Map.Entry<? extends K, ? extends V> entry) {
        C12775o.m28639i(entry, CloudMethodReturns.RETURN_KEYNAME_ELEMENT);
        V v = this.builder.get(entry.getKey());
        if (v != null) {
            return C12775o.m28634d(v, entry.getValue());
        }
        if (entry.getValue() != null || !this.builder.containsKey(entry.getKey())) {
            return false;
        }
        return true;
    }

    public int getSize() {
        return this.builder.size();
    }

    public Iterator<Map.Entry<K, V>> iterator() {
        return new PersistentOrderedMapBuilderEntriesIterator(this.builder);
    }

    public boolean removeEntry(Map.Entry<? extends K, ? extends V> entry) {
        C12775o.m28639i(entry, CloudMethodReturns.RETURN_KEYNAME_ELEMENT);
        return this.builder.remove(entry.getKey(), entry.getValue());
    }

    public boolean add(Map.Entry<K, V> entry) {
        C12775o.m28639i(entry, CloudMethodReturns.RETURN_KEYNAME_ELEMENT);
        throw new UnsupportedOperationException();
    }
}
