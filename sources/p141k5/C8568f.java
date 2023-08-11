package p141k5;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: k5.f */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
abstract class C8568f<T> implements Iterator<T> {

    /* renamed from: b */
    private T f12238b;

    /* renamed from: c */
    private int f12239c = 2;

    protected C8568f() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo42631a();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final T mo42632c() {
        this.f12239c = 3;
        return null;
    }

    public final boolean hasNext() {
        int i = this.f12239c;
        if (i != 4) {
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            } else if (i2 == 0) {
                return true;
            } else {
                if (i2 != 2) {
                    this.f12239c = 4;
                    this.f12238b = mo42631a();
                    if (this.f12239c != 3) {
                        this.f12239c = 1;
                        return true;
                    }
                }
                return false;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    public final T next() {
        if (hasNext()) {
            this.f12239c = 2;
            T t = this.f12238b;
            this.f12238b = null;
            return t;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
