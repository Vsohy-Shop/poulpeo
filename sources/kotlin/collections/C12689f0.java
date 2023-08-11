package kotlin.collections;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import p412pf.C13212a;

/* renamed from: kotlin.collections.f0 */
/* compiled from: Collections.kt */
public final class C12689f0 implements ListIterator, C13212a {

    /* renamed from: b */
    public static final C12689f0 f20365b = new C12689f0();

    private C12689f0() {
    }

    /* renamed from: a */
    public Void next() {
        throw new NoSuchElementException();
    }

    public /* bridge */ /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: c */
    public Void previous() {
        throw new NoSuchElementException();
    }

    public boolean hasNext() {
        return false;
    }

    public boolean hasPrevious() {
        return false;
    }

    public int nextIndex() {
        return 0;
    }

    public int previousIndex() {
        return -1;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
