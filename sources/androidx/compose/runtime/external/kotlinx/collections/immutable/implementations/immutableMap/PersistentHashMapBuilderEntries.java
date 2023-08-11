package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import com.rmn.api.p322v2.cloud.general.CloudMethodReturns;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nPersistentHashMapBuilderContentViews.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentHashMapBuilderContentViews.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilderEntries\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,103:1\n1#2:104\n*E\n"})
/* compiled from: PersistentHashMapBuilderContentViews.kt */
public final class PersistentHashMapBuilderEntries<K, V> extends AbstractMapBuilderEntries<Map.Entry<K, V>, K, V> {
    private final PersistentHashMapBuilder<K, V> builder;

    public PersistentHashMapBuilderEntries(PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        C12775o.m28639i(persistentHashMapBuilder, "builder");
        this.builder = persistentHashMapBuilder;
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
        return new PersistentHashMapBuilderEntriesIterator(this.builder);
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
