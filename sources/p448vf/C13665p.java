package p448vf;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C12775o;
import p412pf.C13212a;

/* renamed from: vf.p */
/* compiled from: Sequences.kt */
public final class C13665p<T> implements C13650g<T>, C13644c<T> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C13650g<T> f22005a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final int f22006b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final int f22007c;

    /* renamed from: vf.p$a */
    /* compiled from: Sequences.kt */
    public static final class C13666a implements Iterator<T>, C13212a {

        /* renamed from: b */
        private final Iterator<T> f22008b;

        /* renamed from: c */
        private int f22009c;

        /* renamed from: d */
        final /* synthetic */ C13665p<T> f22010d;

        C13666a(C13665p<T> pVar) {
            this.f22010d = pVar;
            this.f22008b = pVar.f22005a.iterator();
        }

        /* renamed from: a */
        private final void m31300a() {
            while (this.f22009c < this.f22010d.f22006b && this.f22008b.hasNext()) {
                this.f22008b.next();
                this.f22009c++;
            }
        }

        public boolean hasNext() {
            m31300a();
            if (this.f22009c >= this.f22010d.f22007c || !this.f22008b.hasNext()) {
                return false;
            }
            return true;
        }

        public T next() {
            m31300a();
            if (this.f22009c < this.f22010d.f22007c) {
                this.f22009c++;
                return this.f22008b.next();
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C13665p(C13650g<? extends T> gVar, int i, int i2) {
        boolean z;
        boolean z2;
        C12775o.m28639i(gVar, "sequence");
        this.f22005a = gVar;
        this.f22006b = i;
        this.f22007c = i2;
        boolean z3 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i2 >= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (!(i2 < i ? false : z3)) {
                    throw new IllegalArgumentException(("endIndex should be not less than startIndex, but was " + i2 + " < " + i).toString());
                }
                return;
            }
            throw new IllegalArgumentException(("endIndex should be non-negative, but is " + i2).toString());
        }
        throw new IllegalArgumentException(("startIndex should be non-negative, but is " + i).toString());
    }

    /* renamed from: f */
    private final int m31297f() {
        return this.f22007c - this.f22006b;
    }

    /* renamed from: a */
    public C13650g<T> mo53314a(int i) {
        if (i >= m31297f()) {
            return this;
        }
        C13650g<T> gVar = this.f22005a;
        int i2 = this.f22006b;
        return new C13665p(gVar, i2, i + i2);
    }

    /* renamed from: b */
    public C13650g<T> mo53315b(int i) {
        if (i >= m31297f()) {
            return C13657m.m31271e();
        }
        return new C13665p(this.f22005a, this.f22006b + i, this.f22007c);
    }

    public Iterator<T> iterator() {
        return new C13666a(this);
    }
}
