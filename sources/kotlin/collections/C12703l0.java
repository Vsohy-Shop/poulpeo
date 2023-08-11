package kotlin.collections;

import java.util.Iterator;
import p412pf.C13212a;

/* renamed from: kotlin.collections.l0 */
/* compiled from: PrimitiveIterators.kt */
public abstract class C12703l0 implements Iterator<Integer>, C13212a {
    public abstract int nextInt();

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Integer next() {
        return Integer.valueOf(nextInt());
    }
}
