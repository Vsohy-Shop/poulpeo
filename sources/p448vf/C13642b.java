package p448vf;

import java.util.Iterator;
import kotlin.jvm.internal.C12775o;
import p412pf.C13212a;

/* renamed from: vf.b */
/* compiled from: Sequences.kt */
public final class C13642b<T> implements C13650g<T>, C13644c<T> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C13650g<T> f21978a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final int f21979b;

    /* renamed from: vf.b$a */
    /* compiled from: Sequences.kt */
    public static final class C13643a implements Iterator<T>, C13212a {

        /* renamed from: b */
        private final Iterator<T> f21980b;

        /* renamed from: c */
        private int f21981c;

        C13643a(C13642b<T> bVar) {
            this.f21980b = bVar.f21978a.iterator();
            this.f21981c = bVar.f21979b;
        }

        /* renamed from: a */
        private final void m31225a() {
            while (this.f21981c > 0 && this.f21980b.hasNext()) {
                this.f21980b.next();
                this.f21981c--;
            }
        }

        public boolean hasNext() {
            m31225a();
            return this.f21980b.hasNext();
        }

        public T next() {
            m31225a();
            return this.f21980b.next();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C13642b(C13650g<? extends T> gVar, int i) {
        boolean z;
        C12775o.m28639i(gVar, "sequence");
        this.f21978a = gVar;
        this.f21979b = i;
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
        int i2 = this.f21979b;
        int i3 = i2 + i;
        if (i3 < 0) {
            return new C13667q(this, i);
        }
        return new C13665p(this.f21978a, i2, i3);
    }

    /* renamed from: b */
    public C13650g<T> mo53315b(int i) {
        int i2 = this.f21979b + i;
        if (i2 < 0) {
            return new C13642b(this, i);
        }
        return new C13642b(this.f21978a, i2);
    }

    public Iterator<T> iterator() {
        return new C13643a(this);
    }
}
