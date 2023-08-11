package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import kotlin.jvm.internal.C12775o;

/* compiled from: PersistentVectorIterator.kt */
public final class PersistentVectorIterator<T> extends AbstractListIterator<T> {
    private final T[] tail;
    private final TrieIterator<T> trieIterator;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PersistentVectorIterator(Object[] objArr, T[] tArr, int i, int i2, int i3) {
        super(i, i2);
        C12775o.m28639i(objArr, "root");
        C12775o.m28639i(tArr, "tail");
        this.tail = tArr;
        int rootSize = UtilsKt.rootSize(i2);
        this.trieIterator = new TrieIterator<>(objArr, C13537l.m30882i(i, rootSize), rootSize, i3);
    }

    public T next() {
        checkHasNext$runtime_release();
        if (this.trieIterator.hasNext()) {
            setIndex(getIndex() + 1);
            return this.trieIterator.next();
        }
        T[] tArr = this.tail;
        int index = getIndex();
        setIndex(index + 1);
        return tArr[index - this.trieIterator.getSize()];
    }

    public T previous() {
        checkHasPrevious$runtime_release();
        if (getIndex() > this.trieIterator.getSize()) {
            T[] tArr = this.tail;
            setIndex(getIndex() - 1);
            return tArr[getIndex() - this.trieIterator.getSize()];
        }
        setIndex(getIndex() - 1);
        return this.trieIterator.previous();
    }
}
