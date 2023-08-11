package androidx.core.util;

import android.util.SparseArray;
import java.util.Iterator;
import p412pf.C13212a;

/* compiled from: SparseArray.kt */
public final class SparseArrayKt$valueIterator$1 implements Iterator<T>, C13212a {
    final /* synthetic */ SparseArray<T> $this_valueIterator;
    private int index;

    SparseArrayKt$valueIterator$1(SparseArray<T> sparseArray) {
        this.$this_valueIterator = sparseArray;
    }

    public final int getIndex() {
        return this.index;
    }

    public boolean hasNext() {
        if (this.index < this.$this_valueIterator.size()) {
            return true;
        }
        return false;
    }

    public T next() {
        SparseArray<T> sparseArray = this.$this_valueIterator;
        int i = this.index;
        this.index = i + 1;
        return sparseArray.valueAt(i);
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setIndex(int i) {
        this.index = i;
    }
}
