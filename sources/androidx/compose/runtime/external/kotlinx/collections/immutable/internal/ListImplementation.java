package androidx.compose.runtime.external.kotlinx.collections.immutable.internal;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.C12775o;

/* compiled from: ListImplementation.kt */
public final class ListImplementation {
    public static final ListImplementation INSTANCE = new ListImplementation();

    private ListImplementation() {
    }

    public static final void checkElementIndex$runtime_release(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
        }
    }

    public static final void checkPositionIndex$runtime_release(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
        }
    }

    public static final void checkRangeIndexes$runtime_release(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2 + ", size: " + i3);
        } else if (i > i2) {
            throw new IllegalArgumentException("fromIndex: " + i + " > toIndex: " + i2);
        }
    }

    public static final boolean orderedEquals$runtime_release(Collection<?> collection, Collection<?> collection2) {
        C12775o.m28639i(collection, "c");
        C12775o.m28639i(collection2, "other");
        if (collection.size() != collection2.size()) {
            return false;
        }
        Iterator<?> it = collection2.iterator();
        for (Object d : collection) {
            if (!C12775o.m28634d(d, it.next())) {
                return false;
            }
        }
        return true;
    }

    public static final int orderedHashCode$runtime_release(Collection<?> collection) {
        int i;
        C12775o.m28639i(collection, "c");
        int i2 = 1;
        for (Object next : collection) {
            int i3 = i2 * 31;
            if (next != null) {
                i = next.hashCode();
            } else {
                i = 0;
            }
            i2 = i3 + i;
        }
        return i2;
    }
}
