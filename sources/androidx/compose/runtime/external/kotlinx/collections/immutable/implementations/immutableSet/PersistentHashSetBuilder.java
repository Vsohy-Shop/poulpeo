package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.C12692h;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: PersistentHashSetBuilder.kt */
public final class PersistentHashSetBuilder<E> extends C12692h<E> implements PersistentSet.Builder<E> {
    private int modCount;
    private TrieNode<E> node = this.set.getNode$runtime_release();
    private MutabilityOwnership ownership = new MutabilityOwnership();
    private PersistentHashSet<E> set;
    private int size = this.set.size();

    public PersistentHashSetBuilder(PersistentHashSet<E> persistentHashSet) {
        C12775o.m28639i(persistentHashSet, "set");
        this.set = persistentHashSet;
    }

    public boolean add(E e) {
        int i;
        int size2 = size();
        TrieNode<E> trieNode = this.node;
        if (e != null) {
            i = e.hashCode();
        } else {
            i = 0;
        }
        this.node = trieNode.mutableAdd(i, e, 0, this);
        if (size2 != size()) {
            return true;
        }
        return false;
    }

    public boolean addAll(Collection<? extends E> collection) {
        PersistentHashSet persistentHashSet;
        PersistentHashSetBuilder persistentHashSetBuilder;
        C12775o.m28639i(collection, "elements");
        if (collection instanceof PersistentHashSet) {
            persistentHashSet = (PersistentHashSet) collection;
        } else {
            persistentHashSet = null;
        }
        if (persistentHashSet == null) {
            if (collection instanceof PersistentHashSetBuilder) {
                persistentHashSetBuilder = (PersistentHashSetBuilder) collection;
            } else {
                persistentHashSetBuilder = null;
            }
            if (persistentHashSetBuilder != null) {
                persistentHashSet = persistentHashSetBuilder.build();
            } else {
                persistentHashSet = null;
            }
        }
        if (persistentHashSet == null) {
            return super.addAll(collection);
        }
        DeltaCounter deltaCounter = new DeltaCounter(0, 1, (DefaultConstructorMarker) null);
        int size2 = size();
        TrieNode<E> mutableAddAll = this.node.mutableAddAll(persistentHashSet.getNode$runtime_release(), 0, deltaCounter, this);
        int size3 = (collection.size() + size2) - deltaCounter.getCount();
        if (size2 != size3) {
            this.node = mutableAddAll;
            setSize(size3);
        }
        if (size2 != size()) {
            return true;
        }
        return false;
    }

    public void clear() {
        TrieNode<E> eMPTY$runtime_release = TrieNode.Companion.getEMPTY$runtime_release();
        C12775o.m28637g(eMPTY$runtime_release, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder>");
        this.node = eMPTY$runtime_release;
        setSize(0);
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
            return this.node.containsAll(((PersistentHashSet) collection).getNode$runtime_release(), 0);
        }
        if (collection instanceof PersistentHashSetBuilder) {
            return this.node.containsAll(((PersistentHashSetBuilder) collection).node, 0);
        }
        return super.containsAll(collection);
    }

    public final int getModCount$runtime_release() {
        return this.modCount;
    }

    public final TrieNode<E> getNode$runtime_release() {
        return this.node;
    }

    public final MutabilityOwnership getOwnership$runtime_release() {
        return this.ownership;
    }

    public int getSize() {
        return this.size;
    }

    public Iterator<E> iterator() {
        return new PersistentHashSetMutableIterator(this);
    }

    public boolean remove(Object obj) {
        int i;
        int size2 = size();
        TrieNode<E> trieNode = this.node;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        this.node = trieNode.mutableRemove(i, obj, 0, this);
        if (size2 != size()) {
            return true;
        }
        return false;
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        PersistentHashSet persistentHashSet;
        PersistentHashSetBuilder persistentHashSetBuilder;
        C12775o.m28639i(collection, "elements");
        if (collection instanceof PersistentHashSet) {
            persistentHashSet = (PersistentHashSet) collection;
        } else {
            persistentHashSet = null;
        }
        if (persistentHashSet == null) {
            if (collection instanceof PersistentHashSetBuilder) {
                persistentHashSetBuilder = (PersistentHashSetBuilder) collection;
            } else {
                persistentHashSetBuilder = null;
            }
            if (persistentHashSetBuilder != null) {
                persistentHashSet = persistentHashSetBuilder.build();
            } else {
                persistentHashSet = null;
            }
        }
        if (persistentHashSet == null) {
            return super.removeAll(collection);
        }
        DeltaCounter deltaCounter = new DeltaCounter(0, 1, (DefaultConstructorMarker) null);
        int size2 = size();
        Object mutableRemoveAll = this.node.mutableRemoveAll(persistentHashSet.getNode$runtime_release(), 0, deltaCounter, this);
        int count = size2 - deltaCounter.getCount();
        if (count == 0) {
            clear();
        } else if (count != size2) {
            C12775o.m28637g(mutableRemoveAll, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder>");
            this.node = (TrieNode) mutableRemoveAll;
            setSize(count);
        }
        if (size2 != size()) {
            return true;
        }
        return false;
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        PersistentHashSet persistentHashSet;
        PersistentHashSetBuilder persistentHashSetBuilder;
        C12775o.m28639i(collection, "elements");
        if (collection instanceof PersistentHashSet) {
            persistentHashSet = (PersistentHashSet) collection;
        } else {
            persistentHashSet = null;
        }
        if (persistentHashSet == null) {
            if (collection instanceof PersistentHashSetBuilder) {
                persistentHashSetBuilder = (PersistentHashSetBuilder) collection;
            } else {
                persistentHashSetBuilder = null;
            }
            if (persistentHashSetBuilder != null) {
                persistentHashSet = persistentHashSetBuilder.build();
            } else {
                persistentHashSet = null;
            }
        }
        if (persistentHashSet == null) {
            return super.retainAll(collection);
        }
        DeltaCounter deltaCounter = new DeltaCounter(0, 1, (DefaultConstructorMarker) null);
        int size2 = size();
        Object mutableRetainAll = this.node.mutableRetainAll(persistentHashSet.getNode$runtime_release(), 0, deltaCounter, this);
        int count = deltaCounter.getCount();
        if (count == 0) {
            clear();
        } else if (count != size2) {
            C12775o.m28637g(mutableRetainAll, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder>");
            this.node = (TrieNode) mutableRetainAll;
            setSize(count);
        }
        if (size2 != size()) {
            return true;
        }
        return false;
    }

    public void setSize(int i) {
        this.size = i;
        this.modCount++;
    }

    public PersistentHashSet<E> build() {
        PersistentHashSet<E> persistentHashSet;
        if (this.node == this.set.getNode$runtime_release()) {
            persistentHashSet = this.set;
        } else {
            this.ownership = new MutabilityOwnership();
            persistentHashSet = new PersistentHashSet<>(this.node, size());
        }
        this.set = persistentHashSet;
        return persistentHashSet;
    }
}
