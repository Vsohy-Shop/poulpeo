package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import java.util.ConcurrentModificationException;
import kotlin.jvm.internal.C12775o;

/* compiled from: PersistentVectorMutableIterator.kt */
public final class PersistentVectorMutableIterator<T> extends AbstractListIterator<T> {
    private final PersistentVectorBuilder<T> builder;
    private int expectedModCount;
    private int lastIteratedIndex = -1;
    private TrieIterator<? extends T> trieIterator;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PersistentVectorMutableIterator(PersistentVectorBuilder<T> persistentVectorBuilder, int i) {
        super(i, persistentVectorBuilder.size());
        C12775o.m28639i(persistentVectorBuilder, "builder");
        this.builder = persistentVectorBuilder;
        this.expectedModCount = persistentVectorBuilder.getModCount$runtime_release();
        setupTrieIterator();
    }

    private final void checkForComodification() {
        if (this.expectedModCount != this.builder.getModCount$runtime_release()) {
            throw new ConcurrentModificationException();
        }
    }

    private final void checkHasIterated() {
        if (this.lastIteratedIndex == -1) {
            throw new IllegalStateException();
        }
    }

    private final void reset() {
        setSize(this.builder.size());
        this.expectedModCount = this.builder.getModCount$runtime_release();
        this.lastIteratedIndex = -1;
        setupTrieIterator();
    }

    private final void setupTrieIterator() {
        Object[] root$runtime_release = this.builder.getRoot$runtime_release();
        if (root$runtime_release == null) {
            this.trieIterator = null;
            return;
        }
        int rootSize = UtilsKt.rootSize(this.builder.size());
        int i = C13537l.m30882i(getIndex(), rootSize);
        int rootShift$runtime_release = (this.builder.getRootShift$runtime_release() / 5) + 1;
        TrieIterator<? extends T> trieIterator2 = this.trieIterator;
        if (trieIterator2 == null) {
            this.trieIterator = new TrieIterator<>(root$runtime_release, i, rootSize, rootShift$runtime_release);
            return;
        }
        C12775o.m28636f(trieIterator2);
        trieIterator2.reset$runtime_release(root$runtime_release, i, rootSize, rootShift$runtime_release);
    }

    public void add(T t) {
        checkForComodification();
        this.builder.add(getIndex(), t);
        setIndex(getIndex() + 1);
        reset();
    }

    public T next() {
        checkForComodification();
        checkHasNext$runtime_release();
        this.lastIteratedIndex = getIndex();
        TrieIterator<? extends T> trieIterator2 = this.trieIterator;
        if (trieIterator2 == null) {
            T[] tail$runtime_release = this.builder.getTail$runtime_release();
            int index = getIndex();
            setIndex(index + 1);
            return tail$runtime_release[index];
        } else if (trieIterator2.hasNext()) {
            setIndex(getIndex() + 1);
            return trieIterator2.next();
        } else {
            T[] tail$runtime_release2 = this.builder.getTail$runtime_release();
            int index2 = getIndex();
            setIndex(index2 + 1);
            return tail$runtime_release2[index2 - trieIterator2.getSize()];
        }
    }

    public T previous() {
        checkForComodification();
        checkHasPrevious$runtime_release();
        this.lastIteratedIndex = getIndex() - 1;
        TrieIterator<? extends T> trieIterator2 = this.trieIterator;
        if (trieIterator2 == null) {
            T[] tail$runtime_release = this.builder.getTail$runtime_release();
            setIndex(getIndex() - 1);
            return tail$runtime_release[getIndex()];
        } else if (getIndex() > trieIterator2.getSize()) {
            T[] tail$runtime_release2 = this.builder.getTail$runtime_release();
            setIndex(getIndex() - 1);
            return tail$runtime_release2[getIndex() - trieIterator2.getSize()];
        } else {
            setIndex(getIndex() - 1);
            return trieIterator2.previous();
        }
    }

    public void remove() {
        checkForComodification();
        checkHasIterated();
        this.builder.remove(this.lastIteratedIndex);
        if (this.lastIteratedIndex < getIndex()) {
            setIndex(this.lastIteratedIndex);
        }
        reset();
    }

    public void set(T t) {
        checkForComodification();
        checkHasIterated();
        this.builder.set(this.lastIteratedIndex, t);
        this.expectedModCount = this.builder.getModCount$runtime_release();
        setupTrieIterator();
    }
}
