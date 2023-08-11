package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.collections.C12690g;
import kotlin.jvm.internal.C12775o;

/* compiled from: PersistentOrderedMapBuilder.kt */
public final class PersistentOrderedMapBuilder<K, V> extends C12690g<K, V> implements PersistentMap.Builder<K, V> {
    private Object firstKey;
    private final PersistentHashMapBuilder<K, LinkedValue<V>> hashMapBuilder = this.map.getHashMap$runtime_release().builder();
    private Object lastKey = this.map.getLastKey$runtime_release();
    private PersistentOrderedMap<K, V> map;

    public PersistentOrderedMapBuilder(PersistentOrderedMap<K, V> persistentOrderedMap) {
        C12775o.m28639i(persistentOrderedMap, "map");
        this.map = persistentOrderedMap;
        this.firstKey = persistentOrderedMap.getFirstKey$runtime_release();
    }

    public PersistentMap<K, V> build() {
        PersistentOrderedMap<K, V> persistentOrderedMap;
        boolean z;
        PersistentHashMap<K, LinkedValue<V>> build = this.hashMapBuilder.build();
        if (build == this.map.getHashMap$runtime_release()) {
            boolean z2 = true;
            if (this.firstKey == this.map.getFirstKey$runtime_release()) {
                z = true;
            } else {
                z = false;
            }
            CommonFunctionsKt.m35307assert(z);
            if (this.lastKey != this.map.getLastKey$runtime_release()) {
                z2 = false;
            }
            CommonFunctionsKt.m35307assert(z2);
            persistentOrderedMap = this.map;
        } else {
            persistentOrderedMap = new PersistentOrderedMap<>(this.firstKey, this.lastKey, build);
        }
        this.map = persistentOrderedMap;
        return persistentOrderedMap;
    }

    public void clear() {
        this.hashMapBuilder.clear();
        EndOfChain endOfChain = EndOfChain.INSTANCE;
        this.firstKey = endOfChain;
        this.lastKey = endOfChain;
    }

    public boolean containsKey(Object obj) {
        return this.hashMapBuilder.containsKey(obj);
    }

    public V get(Object obj) {
        LinkedValue linkedValue = this.hashMapBuilder.get(obj);
        if (linkedValue != null) {
            return linkedValue.getValue();
        }
        return null;
    }

    public Set<Map.Entry<K, V>> getEntries() {
        return new PersistentOrderedMapBuilderEntries(this);
    }

    public final Object getFirstKey$runtime_release() {
        return this.firstKey;
    }

    public final PersistentHashMapBuilder<K, LinkedValue<V>> getHashMapBuilder$runtime_release() {
        return this.hashMapBuilder;
    }

    public Set<K> getKeys() {
        return new PersistentOrderedMapBuilderKeys(this);
    }

    public int getSize() {
        return this.hashMapBuilder.size();
    }

    public Collection<V> getValues() {
        return new PersistentOrderedMapBuilderValues(this);
    }

    public V put(K k, V v) {
        LinkedValue linkedValue = this.hashMapBuilder.get(k);
        if (linkedValue != null) {
            if (linkedValue.getValue() == v) {
                return v;
            }
            this.hashMapBuilder.put(k, linkedValue.withValue(v));
            return linkedValue.getValue();
        } else if (isEmpty()) {
            this.firstKey = k;
            this.lastKey = k;
            this.hashMapBuilder.put(k, new LinkedValue(v));
            return null;
        } else {
            Object obj = this.lastKey;
            LinkedValue<V> linkedValue2 = this.hashMapBuilder.get(obj);
            C12775o.m28636f(linkedValue2);
            LinkedValue linkedValue3 = linkedValue2;
            CommonFunctionsKt.m35307assert(!linkedValue3.getHasNext());
            this.hashMapBuilder.put(obj, linkedValue3.withNext(k));
            this.hashMapBuilder.put(k, new LinkedValue(v, obj));
            this.lastKey = k;
            return null;
        }
    }

    public V remove(Object obj) {
        LinkedValue remove = this.hashMapBuilder.remove(obj);
        if (remove == null) {
            return null;
        }
        if (remove.getHasPrevious()) {
            LinkedValue<V> linkedValue = this.hashMapBuilder.get(remove.getPrevious());
            C12775o.m28636f(linkedValue);
            this.hashMapBuilder.put(remove.getPrevious(), linkedValue.withNext(remove.getNext()));
        } else {
            this.firstKey = remove.getNext();
        }
        if (remove.getHasNext()) {
            LinkedValue<V> linkedValue2 = this.hashMapBuilder.get(remove.getNext());
            C12775o.m28636f(linkedValue2);
            this.hashMapBuilder.put(remove.getNext(), linkedValue2.withPrevious(remove.getPrevious()));
        } else {
            this.lastKey = remove.getPrevious();
        }
        return remove.getValue();
    }

    public final boolean remove(Object obj, Object obj2) {
        LinkedValue linkedValue = this.hashMapBuilder.get(obj);
        if (linkedValue == null || !C12775o.m28634d(linkedValue.getValue(), obj2)) {
            return false;
        }
        remove(obj);
        return true;
    }
}
