package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.C12775o;

/* compiled from: BufferIterator.kt */
public final class BufferIterator<T> extends AbstractListIterator<T> {
    private final T[] buffer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BufferIterator(T[] tArr, int i, int i2) {
        super(i, i2);
        C12775o.m28639i(tArr, "buffer");
        this.buffer = tArr;
    }

    public T next() {
        if (hasNext()) {
            T[] tArr = this.buffer;
            int index = getIndex();
            setIndex(index + 1);
            return tArr[index];
        }
        throw new NoSuchElementException();
    }

    public T previous() {
        if (hasPrevious()) {
            T[] tArr = this.buffer;
            setIndex(getIndex() - 1);
            return tArr[getIndex()];
        }
        throw new NoSuchElementException();
    }
}
