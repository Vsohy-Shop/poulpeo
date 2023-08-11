package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain;
import java.util.Iterator;
import kotlin.collections.C12692h;
import kotlin.jvm.internal.C12775o;

/* compiled from: PersistentOrderedSetBuilder.kt */
public final class PersistentOrderedSetBuilder<E> extends C12692h<E> implements PersistentSet.Builder<E> {
    private Object firstElement;
    private final PersistentHashMapBuilder<E, Links> hashMapBuilder = this.set.getHashMap$runtime_release().builder();
    private Object lastElement = this.set.getLastElement$runtime_release();
    private PersistentOrderedSet<E> set;

    public PersistentOrderedSetBuilder(PersistentOrderedSet<E> persistentOrderedSet) {
        C12775o.m28639i(persistentOrderedSet, "set");
        this.set = persistentOrderedSet;
        this.firstElement = persistentOrderedSet.getFirstElement$runtime_release();
    }

    public boolean add(E e) {
        if (this.hashMapBuilder.containsKey(e)) {
            return false;
        }
        if (isEmpty()) {
            this.firstElement = e;
            this.lastElement = e;
            this.hashMapBuilder.put(e, new Links());
            return true;
        }
        Links links = this.hashMapBuilder.get(this.lastElement);
        C12775o.m28636f(links);
        this.hashMapBuilder.put(this.lastElement, links.withNext(e));
        this.hashMapBuilder.put(e, new Links(this.lastElement));
        this.lastElement = e;
        return true;
    }

    public void clear() {
        this.hashMapBuilder.clear();
        EndOfChain endOfChain = EndOfChain.INSTANCE;
        this.firstElement = endOfChain;
        this.lastElement = endOfChain;
    }

    public boolean contains(Object obj) {
        return this.hashMapBuilder.containsKey(obj);
    }

    public final Object getFirstElement$runtime_release() {
        return this.firstElement;
    }

    public final PersistentHashMapBuilder<E, Links> getHashMapBuilder$runtime_release() {
        return this.hashMapBuilder;
    }

    public int getSize() {
        return this.hashMapBuilder.size();
    }

    public Iterator<E> iterator() {
        return new PersistentOrderedSetMutableIterator(this);
    }

    public boolean remove(Object obj) {
        Links remove = this.hashMapBuilder.remove(obj);
        if (remove == null) {
            return false;
        }
        if (remove.getHasPrevious()) {
            Links links = this.hashMapBuilder.get(remove.getPrevious());
            C12775o.m28636f(links);
            this.hashMapBuilder.put(remove.getPrevious(), links.withNext(remove.getNext()));
        } else {
            this.firstElement = remove.getNext();
        }
        if (remove.getHasNext()) {
            Links links2 = this.hashMapBuilder.get(remove.getNext());
            C12775o.m28636f(links2);
            this.hashMapBuilder.put(remove.getNext(), links2.withPrevious(remove.getPrevious()));
            return true;
        }
        this.lastElement = remove.getPrevious();
        return true;
    }

    public final void setFirstElement$runtime_release(Object obj) {
        this.firstElement = obj;
    }

    public PersistentSet<E> build() {
        PersistentOrderedSet<E> persistentOrderedSet;
        PersistentHashMap<E, Links> build = this.hashMapBuilder.build();
        if (build == this.set.getHashMap$runtime_release()) {
            boolean z = true;
            CommonFunctionsKt.m35307assert(this.firstElement == this.set.getFirstElement$runtime_release());
            if (this.lastElement != this.set.getLastElement$runtime_release()) {
                z = false;
            }
            CommonFunctionsKt.m35307assert(z);
            persistentOrderedSet = this.set;
        } else {
            persistentOrderedSet = new PersistentOrderedSet<>(this.firstElement, this.lastElement, build);
        }
        this.set = persistentOrderedSet;
        return persistentOrderedSet;
    }
}
