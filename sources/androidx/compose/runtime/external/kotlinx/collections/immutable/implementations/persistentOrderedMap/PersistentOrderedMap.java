package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableCollection;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain;
import java.util.Map;
import java.util.Set;
import kotlin.collections.C12677d;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nPersistentOrderedMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentOrderedMap.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMap\n+ 2 extensions.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/ExtensionsKt\n*L\n1#1,135:1\n53#2:136\n*S KotlinDebug\n*F\n+ 1 PersistentOrderedMap.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMap\n*L\n119#1:136\n*E\n"})
/* compiled from: PersistentOrderedMap.kt */
public final class PersistentOrderedMap<K, V> extends C12677d<K, V> implements PersistentMap<K, V> {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final PersistentOrderedMap EMPTY;
    private final Object firstKey;
    private final PersistentHashMap<K, LinkedValue<V>> hashMap;
    private final Object lastKey;

    /* compiled from: PersistentOrderedMap.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <K, V> PersistentOrderedMap<K, V> emptyOf$runtime_release() {
            PersistentOrderedMap<K, V> access$getEMPTY$cp = PersistentOrderedMap.EMPTY;
            C12775o.m28637g(access$getEMPTY$cp, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap.Companion.emptyOf>");
            return access$getEMPTY$cp;
        }
    }

    static {
        EndOfChain endOfChain = EndOfChain.INSTANCE;
        EMPTY = new PersistentOrderedMap(endOfChain, endOfChain, PersistentHashMap.Companion.emptyOf$runtime_release());
    }

    public PersistentOrderedMap(Object obj, Object obj2, PersistentHashMap<K, LinkedValue<V>> persistentHashMap) {
        C12775o.m28639i(persistentHashMap, "hashMap");
        this.firstKey = obj;
        this.lastKey = obj2;
        this.hashMap = persistentHashMap;
    }

    private final ImmutableSet<Map.Entry<K, V>> createEntries() {
        return new PersistentOrderedMapEntries(this);
    }

    public PersistentMap.Builder<K, V> builder() {
        return new PersistentOrderedMapBuilder(this);
    }

    public PersistentMap<K, V> clear() {
        return Companion.emptyOf$runtime_release();
    }

    public boolean containsKey(Object obj) {
        return this.hashMap.containsKey(obj);
    }

    public final /* bridge */ ImmutableSet<Map.Entry<K, V>> entrySet() {
        return getEntries();
    }

    public V get(Object obj) {
        LinkedValue linkedValue = this.hashMap.get(obj);
        if (linkedValue != null) {
            return linkedValue.getValue();
        }
        return null;
    }

    public ImmutableSet<Map.Entry<K, V>> getEntries() {
        return createEntries();
    }

    public final Object getFirstKey$runtime_release() {
        return this.firstKey;
    }

    public final PersistentHashMap<K, LinkedValue<V>> getHashMap$runtime_release() {
        return this.hashMap;
    }

    public final Object getLastKey$runtime_release() {
        return this.lastKey;
    }

    public int getSize() {
        return this.hashMap.size();
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

    /* renamed from: getEntries  reason: collision with other method in class */
    public final Set<Map.Entry<K, V>> m35306getEntries() {
        return createEntries();
    }

    public ImmutableSet<K> getKeys() {
        return new PersistentOrderedMapKeys(this);
    }

    public ImmutableCollection<V> getValues() {
        return new PersistentOrderedMapValues(this);
    }

    public PersistentOrderedMap<K, V> put(K k, V v) {
        if (isEmpty()) {
            return new PersistentOrderedMap<>(k, k, this.hashMap.put((Object) k, (Object) new LinkedValue(v)));
        }
        LinkedValue linkedValue = this.hashMap.get(k);
        if (linkedValue == null) {
            Object obj = this.lastKey;
            LinkedValue<V> linkedValue2 = this.hashMap.get(obj);
            C12775o.m28636f(linkedValue2);
            return new PersistentOrderedMap<>(this.firstKey, k, this.hashMap.put(obj, (Object) linkedValue2.withNext(k)).put((Object) k, (Object) new LinkedValue(v, obj)));
        } else if (linkedValue.getValue() == v) {
            return this;
        } else {
            return new PersistentOrderedMap<>(this.firstKey, this.lastKey, this.hashMap.put((Object) k, (Object) linkedValue.withValue(v)));
        }
    }

    public PersistentOrderedMap<K, V> remove(K k) {
        LinkedValue linkedValue = this.hashMap.get(k);
        if (linkedValue == null) {
            return this;
        }
        PersistentHashMap remove = this.hashMap.remove((Object) k);
        if (linkedValue.getHasPrevious()) {
            Object obj = remove.get(linkedValue.getPrevious());
            C12775o.m28636f(obj);
            remove = remove.put(linkedValue.getPrevious(), (Object) ((LinkedValue) obj).withNext(linkedValue.getNext()));
        }
        if (linkedValue.getHasNext()) {
            Object obj2 = remove.get(linkedValue.getNext());
            C12775o.m28636f(obj2);
            remove = remove.put(linkedValue.getNext(), (Object) ((LinkedValue) obj2).withPrevious(linkedValue.getPrevious()));
        }
        return new PersistentOrderedMap<>(!linkedValue.getHasPrevious() ? linkedValue.getNext() : this.firstKey, !linkedValue.getHasNext() ? linkedValue.getPrevious() : this.lastKey, remove);
    }

    public PersistentOrderedMap<K, V> remove(K k, V v) {
        LinkedValue linkedValue = this.hashMap.get(k);
        if (linkedValue == null) {
            return this;
        }
        return C12775o.m28634d(linkedValue.getValue(), v) ? remove((Object) k) : this;
    }
}
