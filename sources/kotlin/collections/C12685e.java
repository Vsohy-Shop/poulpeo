package kotlin.collections;

import java.util.AbstractCollection;
import java.util.Collection;
import p412pf.C13213b;

/* renamed from: kotlin.collections.e */
/* compiled from: AbstractMutableCollection.kt */
public abstract class C12685e<E> extends AbstractCollection<E> implements Collection<E>, C13213b {
    protected C12685e() {
    }

    public abstract boolean add(E e);

    public abstract int getSize();

    public final /* bridge */ int size() {
        return getSize();
    }
}
