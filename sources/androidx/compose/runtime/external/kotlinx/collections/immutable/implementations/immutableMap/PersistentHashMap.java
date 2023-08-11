package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableCollection;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode;
import java.util.Map;
import java.util.Set;
import kotlin.collections.C12677d;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nPersistentHashMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentHashMap.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap\n+ 2 extensions.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/ExtensionsKt\n*L\n1#1,85:1\n53#2:86\n*S KotlinDebug\n*F\n+ 1 PersistentHashMap.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap\n*L\n69#1:86\n*E\n"})
/* compiled from: PersistentHashMap.kt */
public final class PersistentHashMap<K, V> extends C12677d<K, V> implements PersistentMap<K, V> {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final PersistentHashMap EMPTY = new PersistentHashMap(TrieNode.Companion.getEMPTY$runtime_release(), 0);
    private final TrieNode<K, V> node;
    private final int size;

    /* compiled from: PersistentHashMap.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <K, V> PersistentHashMap<K, V> emptyOf$runtime_release() {
            PersistentHashMap<K, V> access$getEMPTY$cp = PersistentHashMap.EMPTY;
            C12775o.m28637g(access$getEMPTY$cp, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>");
            return access$getEMPTY$cp;
        }
    }

    public PersistentHashMap(TrieNode<K, V> trieNode, int i) {
        C12775o.m28639i(trieNode, "node");
        this.node = trieNode;
        this.size = i;
    }

    private final ImmutableSet<Map.Entry<K, V>> createEntries() {
        return new PersistentHashMapEntries(this);
    }

    public PersistentMap<K, V> clear() {
        return Companion.emptyOf$runtime_release();
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

    public final /* bridge */ ImmutableSet<Map.Entry<K, V>> entrySet() {
        return getEntries();
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

    public ImmutableSet<Map.Entry<K, V>> getEntries() {
        return createEntries();
    }

    public final TrieNode<K, V> getNode$runtime_release() {
        return this.node;
    }

    public int getSize() {
        return this.size;
    }

    public final /* bridge */ ImmutableSet<K> keySet() {
        return getKeys();
    }

    public PersistentMap<K, V> putAll(Map<? extends K, ? extends V> map) {
        C12775o.m28639i(map, "m");
        C12775o.m28637g(this, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        PersistentMap.Builder builder = builder();
        builder.putAll(map);
        return builder.build();
    }

    public final /* bridge */ ImmutableCollection<V> values() {
        return getValues();
    }

    public PersistentHashMapBuilder<K, V> builder() {
        return new PersistentHashMapBuilder<>(this);
    }

    /* renamed from: getEntries  reason: collision with other method in class */
    public final Set<Map.Entry<K, V>> m35305getEntries() {
        return createEntries();
    }

    public ImmutableSet<K> getKeys() {
        return new PersistentHashMapKeys(this);
    }

    public ImmutableCollection<V> getValues() {
        return new PersistentHashMapValues(this);
    }

    public PersistentHashMap<K, V> put(K k, V v) {
        TrieNode.ModificationResult<K, V> put = this.node.put(k != null ? k.hashCode() : 0, k, v, 0);
        if (put == null) {
            return this;
        }
        return new PersistentHashMap<>(put.getNode(), size() + put.getSizeDelta());
    }

    public PersistentHashMap<K, V> remove(K k) {
        TrieNode<K, V> remove = this.node.remove(k != null ? k.hashCode() : 0, k, 0);
        if (this.node == remove) {
            return this;
        }
        if (remove == null) {
            return Companion.emptyOf$runtime_release();
        }
        return new PersistentHashMap<>(remove, size() - 1);
    }

    public PersistentHashMap<K, V> remove(K k, V v) {
        TrieNode<K, V> remove = this.node.remove(k != null ? k.hashCode() : 0, k, v, 0);
        if (this.node == remove) {
            return this;
        }
        if (remove == null) {
            return Companion.emptyOf$runtime_release();
        }
        return new PersistentHashMap<>(remove, size() - 1);
    }
}
