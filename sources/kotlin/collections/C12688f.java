package kotlin.collections;

import java.util.AbstractList;
import java.util.List;
import p412pf.C13215d;

/* renamed from: kotlin.collections.f */
/* compiled from: AbstractMutableList.kt */
public abstract class C12688f<E> extends AbstractList<E> implements List<E>, C13215d {
    protected C12688f() {
    }

    public abstract void add(int i, E e);

    public abstract int getSize();

    public final /* bridge */ E remove(int i) {
        return removeAt(i);
    }

    public abstract E removeAt(int i);

    public abstract E set(int i, E e);

    public final /* bridge */ int size() {
        return getSize();
    }
}
