package androidx.compose.runtime.collection;

import android.util.SparseArray;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: ActualIntMap.android.kt */
public final class IntMap<E> {
    private final SparseArray<E> sparseArray;

    private IntMap(SparseArray<E> sparseArray2) {
        this.sparseArray = sparseArray2;
    }

    public final void clear() {
        this.sparseArray.clear();
    }

    public final boolean contains(int i) {
        if (this.sparseArray.indexOfKey(i) >= 0) {
            return true;
        }
        return false;
    }

    public final E get(int i) {
        return this.sparseArray.get(i);
    }

    public final int getSize() {
        return this.sparseArray.size();
    }

    public final void remove(int i) {
        this.sparseArray.remove(i);
    }

    public final void set(int i, E e) {
        this.sparseArray.put(i, e);
    }

    public final E get(int i, E e) {
        return this.sparseArray.get(i, e);
    }

    public IntMap(int i) {
        this(new SparseArray(i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ IntMap(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 10 : i);
    }
}
