package kotlin.collections;

import java.util.Iterator;
import p412pf.C13212a;

/* renamed from: kotlin.collections.m0 */
/* compiled from: PrimitiveIterators.kt */
public abstract class C12705m0 implements Iterator<Long>, C13212a {
    public abstract long nextLong();

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Long next() {
        return Long.valueOf(nextLong());
    }
}
