package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain;

/* compiled from: PersistentOrderedSet.kt */
public final class Links {
    private final Object next;
    private final Object previous;

    public Links(Object obj, Object obj2) {
        this.previous = obj;
        this.next = obj2;
    }

    public final boolean getHasNext() {
        if (this.next != EndOfChain.INSTANCE) {
            return true;
        }
        return false;
    }

    public final boolean getHasPrevious() {
        if (this.previous != EndOfChain.INSTANCE) {
            return true;
        }
        return false;
    }

    public final Object getNext() {
        return this.next;
    }

    public final Object getPrevious() {
        return this.previous;
    }

    public final Links withNext(Object obj) {
        return new Links(this.previous, obj);
    }

    public final Links withPrevious(Object obj) {
        return new Links(obj, this.next);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Links() {
        /*
            r1 = this;
            androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain r0 = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain.INSTANCE
            r1.<init>(r0, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.Links.<init>():void");
    }

    public Links(Object obj) {
        this(obj, EndOfChain.INSTANCE);
    }
}
