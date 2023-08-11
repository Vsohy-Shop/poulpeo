package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.C12694i;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nPersistentHashSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentHashSet.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSet\n+ 2 extensions.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/ExtensionsKt\n*L\n1#1,72:1\n31#2:73\n31#2:74\n31#2:75\n31#2:76\n*S KotlinDebug\n*F\n+ 1 PersistentHashSet.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSet\n*L\n24#1:73\n34#1:74\n38#1:75\n42#1:76\n*E\n"})
/* compiled from: PersistentHashSet.kt */
public final class PersistentHashSet<E> extends C12694i<E> implements PersistentSet<E> {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final PersistentHashSet EMPTY = new PersistentHashSet(TrieNode.Companion.getEMPTY$runtime_release(), 0);
    private final TrieNode<E> node;
    private final int size;

    /* compiled from: PersistentHashSet.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <E> PersistentSet<E> emptyOf$runtime_release() {
            return PersistentHashSet.EMPTY;
        }
    }

    public PersistentHashSet(TrieNode<E> trieNode, int i) {
        C12775o.m28639i(trieNode, "node");
        this.node = trieNode;
        this.size = i;
    }

    public boolean contains(Object obj) {
        int i;
        TrieNode<E> trieNode = this.node;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        return trieNode.contains(i, obj, 0);
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        C12775o.m28639i(collection, "elements");
        if (collection instanceof PersistentHashSet) {
            return this.node.containsAll(((PersistentHashSet) collection).node, 0);
        }
        if (collection instanceof PersistentHashSetBuilder) {
            return this.node.containsAll(((PersistentHashSetBuilder) collection).getNode$runtime_release(), 0);
        }
        return super.containsAll(collection);
    }

    public final TrieNode<E> getNode$runtime_release() {
        return this.node;
    }

    public int getSize() {
        return this.size;
    }

    public Iterator<E> iterator() {
        return new PersistentHashSetIterator(this.node);
    }

    public PersistentSet<E> add(E e) {
        TrieNode<E> add = this.node.add(e != null ? e.hashCode() : 0, e, 0);
        if (this.node == add) {
            return this;
        }
        return new PersistentHashSet(add, size() + 1);
    }

    public PersistentSet<E> addAll(Collection<? extends E> collection) {
        C12775o.m28639i(collection, "elements");
        PersistentSet.Builder builder = builder();
        builder.addAll(collection);
        return builder.build();
    }

    public PersistentSet.Builder<E> builder() {
        return new PersistentHashSetBuilder(this);
    }

    public PersistentSet<E> clear() {
        return Companion.emptyOf$runtime_release();
    }

    public PersistentSet<E> remove(E e) {
        TrieNode<E> remove = this.node.remove(e != null ? e.hashCode() : 0, e, 0);
        if (this.node == remove) {
            return this;
        }
        return new PersistentHashSet(remove, size() - 1);
    }

    public PersistentSet<E> retainAll(Collection<? extends E> collection) {
        C12775o.m28639i(collection, "elements");
        PersistentSet.Builder builder = builder();
        builder.retainAll(collection);
        return builder.build();
    }

    public PersistentSet<E> removeAll(Collection<? extends E> collection) {
        C12775o.m28639i(collection, "elements");
        PersistentSet.Builder builder = builder();
        builder.removeAll(collection);
        return builder.build();
    }

    public PersistentSet<E> removeAll(Function1<? super E, Boolean> function1) {
        C12775o.m28639i(function1, "predicate");
        PersistentSet.Builder builder = builder();
        boolean unused = C12669b0.m28183G(builder, function1);
        return builder.build();
    }
}
