package androidx.collection;

import java.util.Iterator;
import java.util.NoSuchElementException;

abstract class IndexBasedArrayIterator<T> implements Iterator<T> {
    private boolean mCanRemove;
    private int mIndex;
    private int mSize;

    IndexBasedArrayIterator(int i) {
        this.mSize = i;
    }

    /* access modifiers changed from: protected */
    public abstract T elementAt(int i);

    public final boolean hasNext() {
        if (this.mIndex < this.mSize) {
            return true;
        }
        return false;
    }

    public T next() {
        if (hasNext()) {
            T elementAt = elementAt(this.mIndex);
            this.mIndex++;
            this.mCanRemove = true;
            return elementAt;
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        if (this.mCanRemove) {
            int i = this.mIndex - 1;
            this.mIndex = i;
            removeAt(i);
            this.mSize--;
            this.mCanRemove = false;
            return;
        }
        throw new IllegalStateException();
    }

    /* access modifiers changed from: protected */
    public abstract void removeAt(int i);
}
