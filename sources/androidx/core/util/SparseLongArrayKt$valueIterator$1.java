package androidx.core.util;

import android.util.SparseLongArray;
import kotlin.collections.C12705m0;

/* compiled from: SparseLongArray.kt */
public final class SparseLongArrayKt$valueIterator$1 extends C12705m0 {
    final /* synthetic */ SparseLongArray $this_valueIterator;
    private int index;

    SparseLongArrayKt$valueIterator$1(SparseLongArray sparseLongArray) {
        this.$this_valueIterator = sparseLongArray;
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

    public long nextLong() {
        SparseLongArray sparseLongArray = this.$this_valueIterator;
        int i = this.index;
        this.index = i + 1;
        return sparseLongArray.valueAt(i);
    }

    public final void setIndex(int i) {
        this.index = i;
    }
}
