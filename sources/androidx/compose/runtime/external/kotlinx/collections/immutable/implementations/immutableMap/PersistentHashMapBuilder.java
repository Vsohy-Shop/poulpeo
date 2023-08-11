package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.collections.C12690g;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: PersistentHashMapBuilder.kt */
public final class PersistentHashMapBuilder<K, V> extends C12690g<K, V> implements PersistentMap.Builder<K, V> {
    private PersistentHashMap<K, V> map;
    private int modCount;
    private TrieNode<K, V> node = this.map.getNode$runtime_release();
    private V operationResult;
    private MutabilityOwnership ownership = new MutabilityOwnership();
    private int size = this.map.size();

    public PersistentHashMapBuilder(PersistentHashMap<K, V> persistentHashMap) {
        C12775o.m28639i(persistentHashMap, "map");
        this.map = persistentHashMap;
    }

    public void clear() {
        TrieNode<K, V> eMPTY$runtime_release = TrieNode.Companion.getEMPTY$runtime_release();
        C12775o.m28637g(eMPTY$runtime_release, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.node = eMPTY$runtime_release;
        setSize(0);
    }

    public boolean containsKey(Object obj) {
        int i;
        TrieNode<K, V> trieNode = this.node;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        return trieNode.containsKey(i, obj, 0);
    }

    public V get(Object obj) {
        int i;
        TrieNode<K, V> trieNode = this.node;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        return trieNode.get(i, obj, 0);
    }

    public Set<Map.Entry<K, V>> getEntries() {
        return new PersistentHashMapBuilderEntries(this);
    }

    public Set<K> getKeys() {
        return new PersistentHashMapBuilderKeys(this);
    }

    public final int getModCount$runtime_release() {
        return this.modCount;
    }

    public final TrieNode<K, V> getNode$runtime_release() {
        return this.node;
    }

    public final V getOperationResult$runtime_release() {
        return this.operationResult;
    }

    public final MutabilityOwnership getOwnership$runtime_release() {
        return this.ownership;
    }

    public int getSize() {
        return this.size;
    }

    public Collection<V> getValues() {
        return new PersistentHashMapBuilderValues(this);
    }

    public V put(K k, V v) {
        int i;
        this.operationResult = null;
        TrieNode<K, V> trieNode = this.node;
        if (k != null) {
            i = k.hashCode();
        } else {
            i = 0;
        }
        this.node = trieNode.mutablePut(i, k, v, 0, this);
        return this.operationResult;
    }

    public void putAll(Map<? extends K, ? extends V> map2) {
        PersistentHashMap persistentHashMap;
        PersistentHashMapBuilder persistentHashMapBuilder;
        C12775o.m28639i(map2, TypedValues.TransitionType.S_FROM);
        if (map2 instanceof PersistentHashMap) {
            persistentHashMap = (PersistentHashMap) map2;
        } else {
            persistentHashMap = null;
        }
        if (persistentHashMap == null) {
            if (map2 instanceof PersistentHashMapBuilder) {
                persistentHashMapBuilder = (PersistentHashMapBuilder) map2;
            } else {
                persistentHashMapBuilder = null;
            }
            if (persistentHashMapBuilder != null) {
                persistentHashMap = persistentHashMapBuilder.build();
            } else {
                persistentHashMap = null;
            }
        }
        if (persistentHashMap != null) {
            DeltaCounter deltaCounter = new DeltaCounter(0, 1, (DefaultConstructorMarker) null);
            int size2 = size();
            TrieNode<K, V> trieNode = this.node;
            TrieNode node$runtime_release = persistentHashMap.getNode$runtime_release();
            C12775o.m28637g(node$runtime_release, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
            this.node = trieNode.mutablePutAll(node$runtime_release, 0, deltaCounter, this);
            int size3 = (persistentHashMap.size() + size2) - deltaCounter.getCount();
            if (size2 != size3) {
                setSize(size3);
                return;
            }
            return;
        }
        super.putAll(map2);
    }

    public V remove(Object obj) {
        this.operationResult = null;
        TrieNode<K, V> mutableRemove = this.node.mutableRemove(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (mutableRemove == null) {
            mutableRemove = TrieNode.Companion.getEMPTY$runtime_release();
            C12775o.m28637g(mutableRemove, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        }
        this.node = mutableRemove;
        return this.operationResult;
    }

    public final void setModCount$runtime_release(int i) {
        this.modCount = i;
    }

    public final void setNode$runtime_release(TrieNode<K, V> trieNode) {
        C12775o.m28639i(trieNode, "<set-?>");
        this.node = trieNode;
    }

    public final void setOperationResult$runtime_release(V v) {
        this.operationResult = v;
    }

    public void setSize(int i) {
        this.size = i;
        this.modCount++;
    }

    public PersistentHashMap<K, V> build() {
        PersistentHashMap<K, V> persistentHashMap;
        if (this.node == this.map.getNode$runtime_release()) {
            persistentHashMap = this.map;
        } else {
            this.ownership = new MutabilityOwnership();
            persistentHashMap = new PersistentHashMap<>(this.node, size());
        }
        this.map = persistentHashMap;
        return persistentHashMap;
    }

    public final boolean remove(Object obj, Object obj2) {
        int size2 = size();
        TrieNode<K, V> mutableRemove = this.node.mutableRemove(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (mutableRemove == null) {
            mutableRemove = TrieNode.Companion.getEMPTY$runtime_release();
            C12775o.m28637g(mutableRemove, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        }
        this.node = mutableRemove;
        if (size2 != size()) {
            return true;
        }
        return false;
    }
}
