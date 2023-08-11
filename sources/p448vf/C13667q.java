package p448vf;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C12775o;
import p412pf.C13212a;

/* renamed from: vf.q */
/* compiled from: Sequences.kt */
public final class C13667q<T> implements C13650g<T>, C13644c<T> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C13650g<T> f22011a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final int f22012b;

    /* renamed from: vf.q$a */
    /* compiled from: Sequences.kt */
    public static final class C13668a implements Iterator<T>, C13212a {

        /* renamed from: b */
        private int f22013b;

        /* renamed from: c */
        private final Iterator<T> f22014c;

        C13668a(C13667q<T> qVar) {
            this.f22013b = qVar.f22012b;
            this.f22014c = qVar.f22011a.iterator();
        }

        public boolean hasNext() {
            if (this.f22013b <= 0 || !this.f22014c.hasNext()) {
                return false;
            }
            return true;
        }

        public T next() {
            int i = this.f22013b;
            if (i != 0) {
                this.f22013b = i - 1;
                return this.f22014c.next();
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C13667q(C13650g<? extends T> gVar, int i) {
        boolean z;
        C12775o.m28639i(gVar, "sequence");
        this.f22011a = gVar;
        this.f22012b = i;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
        }
    }

    /* renamed from: a */
    public C13650g<T> mo53314a(int i) {
        if (i >= this.f22012b) {
            return this;
        }
        return new C13667q(this.f22011a, i);
    }

    /* renamed from: b */
    public C13650g<T> mo53315b(int i) {
        int i2 = this.f22012b;
        if (i >= i2) {
            return C13657m.m31271e();
        }
        return new C13665p(this.f22011a, i, i2);
    }

    public Iterator<T> iterator() {
        return new C13668a(this);
    }
}
