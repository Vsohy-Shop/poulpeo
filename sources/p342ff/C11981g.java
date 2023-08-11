package p342ff;

import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.C12685e;
import kotlin.jvm.internal.C12775o;

/* renamed from: ff.g */
/* compiled from: MapBuilder.kt */
public final class C11981g<V> extends C12685e<V> {

    /* renamed from: b */
    private final C11972d<?, V> f18706b;

    public C11981g(C11972d<?, V> dVar) {
        C12775o.m28639i(dVar, "backing");
        this.f18706b = dVar;
    }

    public boolean add(V v) {
        throw new UnsupportedOperationException();
    }

    public boolean addAll(Collection<? extends V> collection) {
        C12775o.m28639i(collection, "elements");
        throw new UnsupportedOperationException();
    }

    public void clear() {
        this.f18706b.clear();
    }

    public boolean contains(Object obj) {
        return this.f18706b.containsValue(obj);
    }

    public int getSize() {
        return this.f18706b.size();
    }

    public boolean isEmpty() {
        return this.f18706b.isEmpty();
    }

    public Iterator<V> iterator() {
        return this.f18706b.mo49320M();
    }

    public boolean remove(Object obj) {
        return this.f18706b.mo49319L(obj);
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        C12775o.m28639i(collection, "elements");
        this.f18706b.mo49331k();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        C12775o.m28639i(collection, "elements");
        this.f18706b.mo49331k();
        return super.retainAll(collection);
    }
}
