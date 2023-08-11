package kotlin.collections;

import java.util.AbstractSet;
import java.util.Set;
import p412pf.C13218f;

/* renamed from: kotlin.collections.h */
/* compiled from: AbstractMutableSet.kt */
public abstract class C12692h<E> extends AbstractSet<E> implements Set<E>, C13218f {
    protected C12692h() {
    }

    public abstract boolean add(E e);

    public abstract int getSize();

    public final /* bridge */ int size() {
        return getSize();
    }
}
