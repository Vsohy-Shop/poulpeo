package p342ff;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.C12692h;
import kotlin.jvm.internal.C12775o;

/* renamed from: ff.j */
/* compiled from: SetBuilder.kt */
public final class C11986j<E> extends C12692h<E> implements Serializable {

    /* renamed from: b */
    private final C11972d<E, ?> f18712b;

    public C11986j(C11972d<E, ?> dVar) {
        C12775o.m28639i(dVar, "backing");
        this.f18712b = dVar;
    }

    private final Object writeReplace() {
        if (this.f18712b.mo49315B()) {
            return new C11982h(this, 1);
        }
        throw new NotSerializableException("The set cannot be serialized while it is being built.");
    }

    public boolean add(E e) {
        if (this.f18712b.mo49327h(e) >= 0) {
            return true;
        }
        return false;
    }

    public boolean addAll(Collection<? extends E> collection) {
        C12775o.m28639i(collection, "elements");
        this.f18712b.mo49331k();
        return super.addAll(collection);
    }

    /* renamed from: b */
    public final Set<E> mo49395b() {
        this.f18712b.mo49330j();
        return this;
    }

    public void clear() {
        this.f18712b.clear();
    }

    public boolean contains(Object obj) {
        return this.f18712b.containsKey(obj);
    }

    public int getSize() {
        return this.f18712b.size();
    }

    public boolean isEmpty() {
        return this.f18712b.isEmpty();
    }

    public Iterator<E> iterator() {
        return this.f18712b.mo49316C();
    }

    public boolean remove(Object obj) {
        if (this.f18712b.mo49318J(obj) >= 0) {
            return true;
        }
        return false;
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        C12775o.m28639i(collection, "elements");
        this.f18712b.mo49331k();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        C12775o.m28639i(collection, "elements");
        this.f18712b.mo49331k();
        return super.retainAll(collection);
    }

    public C11986j() {
        this(new C11972d());
    }

    public C11986j(int i) {
        this(new C11972d(i));
    }
}
