package kotlin.collections;

import java.util.Iterator;
import p412pf.C13212a;

/* renamed from: kotlin.collections.r */
/* compiled from: PrimitiveIterators.kt */
public abstract class C12715r implements Iterator<Boolean>, C13212a {
    public abstract boolean nextBoolean();

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Boolean next() {
        return Boolean.valueOf(nextBoolean());
    }
}
