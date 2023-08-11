package kotlin.jvm.internal;

import com.rmn.api.p322v2.cloud.general.CloudMethodReturns;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p412pf.C13212a;

/* renamed from: kotlin.jvm.internal.b */
/* compiled from: ArrayIterator.kt */
final class C12749b<T> implements Iterator<T>, C13212a {

    /* renamed from: b */
    private final T[] f20404b;

    /* renamed from: c */
    private int f20405c;

    public C12749b(T[] tArr) {
        C12775o.m28639i(tArr, CloudMethodReturns.RETURN_KEYNAME_ARRAY);
        this.f20404b = tArr;
    }

    public boolean hasNext() {
        if (this.f20405c < this.f20404b.length) {
            return true;
        }
        return false;
    }

    public T next() {
        try {
            T[] tArr = this.f20404b;
            int i = this.f20405c;
            this.f20405c = i + 1;
            return tArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f20405c--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
