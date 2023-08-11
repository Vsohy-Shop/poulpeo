package kotlin.collections;

import java.util.Iterator;
import kotlin.jvm.internal.C12775o;
import p412pf.C13212a;

/* renamed from: kotlin.collections.k0 */
/* compiled from: Iterators.kt */
public final class C12701k0<T> implements Iterator<C12698j0<? extends T>>, C13212a {

    /* renamed from: b */
    private final Iterator<T> f20378b;

    /* renamed from: c */
    private int f20379c;

    public C12701k0(Iterator<? extends T> it) {
        C12775o.m28639i(it, "iterator");
        this.f20378b = it;
    }

    /* renamed from: a */
    public final C12698j0<T> next() {
        int i = this.f20379c;
        this.f20379c = i + 1;
        if (i < 0) {
            C12726w.m28534u();
        }
        return new C12698j0<>(i, this.f20378b.next());
    }

    public final boolean hasNext() {
        return this.f20378b.hasNext();
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
