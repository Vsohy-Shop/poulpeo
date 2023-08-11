package p342ff;

import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.C12692h;
import kotlin.jvm.internal.C12775o;

/* renamed from: ff.f */
/* compiled from: MapBuilder.kt */
public final class C11980f<E> extends C12692h<E> {

    /* renamed from: b */
    private final C11972d<E, ?> f18705b;

    public C11980f(C11972d<E, ?> dVar) {
        C12775o.m28639i(dVar, "backing");
        this.f18705b = dVar;
    }

    public boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    public boolean addAll(Collection<? extends E> collection) {
        C12775o.m28639i(collection, "elements");
        throw new UnsupportedOperationException();
    }

    public void clear() {
        this.f18705b.clear();
    }

    public boolean contains(Object obj) {
        return this.f18705b.containsKey(obj);
    }

    public int getSize() {
        return this.f18705b.size();
    }

    public boolean isEmpty() {
        return this.f18705b.isEmpty();
    }

    public Iterator<E> iterator() {
        return this.f18705b.mo49316C();
    }

    public boolean remove(Object obj) {
        if (this.f18705b.mo49318J(obj) >= 0) {
            return true;
        }
        return false;
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        C12775o.m28639i(collection, "elements");
        this.f18705b.mo49331k();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        C12775o.m28639i(collection, "elements");
        this.f18705b.mo49331k();
        return super.retainAll(collection);
    }
}
