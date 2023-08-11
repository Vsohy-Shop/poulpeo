package p342ff;

import com.rmn.api.p322v2.cloud.general.CloudMethodReturns;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.C12775o;

/* renamed from: ff.e */
/* compiled from: MapBuilder.kt */
public final class C11979e<K, V> extends C11968a<Map.Entry<K, V>, K, V> {

    /* renamed from: b */
    private final C11972d<K, V> f18704b;

    public C11979e(C11972d<K, V> dVar) {
        C12775o.m28639i(dVar, "backing");
        this.f18704b = dVar;
    }

    public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
        C12775o.m28639i(collection, "elements");
        throw new UnsupportedOperationException();
    }

    public void clear() {
        this.f18704b.clear();
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        C12775o.m28639i(collection, "elements");
        return this.f18704b.mo49333m(collection);
    }

    public boolean containsEntry(Map.Entry<? extends K, ? extends V> entry) {
        C12775o.m28639i(entry, CloudMethodReturns.RETURN_KEYNAME_ELEMENT);
        return this.f18704b.mo49334n(entry);
    }

    public int getSize() {
        return this.f18704b.size();
    }

    public boolean isEmpty() {
        return this.f18704b.isEmpty();
    }

    public Iterator<Map.Entry<K, V>> iterator() {
        return this.f18704b.mo49337r();
    }

    public boolean remove(Map.Entry entry) {
        C12775o.m28639i(entry, CloudMethodReturns.RETURN_KEYNAME_ELEMENT);
        return this.f18704b.mo49317H(entry);
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        C12775o.m28639i(collection, "elements");
        this.f18704b.mo49331k();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        C12775o.m28639i(collection, "elements");
        this.f18704b.mo49331k();
        return super.retainAll(collection);
    }

    public boolean add(Map.Entry<K, V> entry) {
        C12775o.m28639i(entry, CloudMethodReturns.RETURN_KEYNAME_ELEMENT);
        throw new UnsupportedOperationException();
    }
}
