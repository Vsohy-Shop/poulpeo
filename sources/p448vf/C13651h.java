package p448vf;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.coroutines.jvm.internal.C12741h;
import kotlin.jvm.internal.C12775o;
import p336ef.C11907m;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p355hf.C12079g;
import p355hf.C12085h;
import p412pf.C13212a;

/* renamed from: vf.h */
/* compiled from: SequenceBuilder.kt */
final class C13651h<T> extends C13652i<T> implements Iterator<T>, C12074d<C11921v>, C13212a {

    /* renamed from: b */
    private int f21995b;

    /* renamed from: c */
    private T f21996c;

    /* renamed from: d */
    private Iterator<? extends T> f21997d;

    /* renamed from: e */
    private C12074d<? super C11921v> f21998e;

    /* renamed from: l */
    private final Throwable m31239l() {
        int i = this.f21995b;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f21995b);
    }

    /* renamed from: m */
    private final T m31240m() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    /* renamed from: e */
    public Object mo53327e(T t, C12074d<? super C11921v> dVar) {
        this.f21996c = t;
        this.f21995b = 3;
        this.f21998e = dVar;
        Object c = C12150d.m26492c();
        if (c == C12150d.m26492c()) {
            C12741h.m28573c(dVar);
        }
        if (c == C12150d.m26492c()) {
            return c;
        }
        return C11921v.f18618a;
    }

    /* renamed from: g */
    public Object mo53328g(Iterator<? extends T> it, C12074d<? super C11921v> dVar) {
        if (!it.hasNext()) {
            return C11921v.f18618a;
        }
        this.f21997d = it;
        this.f21995b = 2;
        this.f21998e = dVar;
        Object c = C12150d.m26492c();
        if (c == C12150d.m26492c()) {
            C12741h.m28573c(dVar);
        }
        if (c == C12150d.m26492c()) {
            return c;
        }
        return C11921v.f18618a;
    }

    public C12079g getContext() {
        return C12085h.f18916b;
    }

    public boolean hasNext() {
        while (true) {
            int i = this.f21995b;
            if (i != 0) {
                if (i == 1) {
                    Iterator<? extends T> it = this.f21997d;
                    C12775o.m28636f(it);
                    if (it.hasNext()) {
                        this.f21995b = 2;
                        return true;
                    }
                    this.f21997d = null;
                } else if (i == 2 || i == 3) {
                    return true;
                } else {
                    if (i == 4) {
                        return false;
                    }
                    throw m31239l();
                }
            }
            this.f21995b = 5;
            C12074d<? super C11921v> dVar = this.f21998e;
            C12775o.m28636f(dVar);
            this.f21998e = null;
            C11907m.C11908a aVar = C11907m.f18600b;
            dVar.resumeWith(C11907m.m25696a(C11921v.f18618a));
        }
    }

    /* renamed from: n */
    public final void mo53330n(C12074d<? super C11921v> dVar) {
        this.f21998e = dVar;
    }

    public T next() {
        int i = this.f21995b;
        if (i == 0 || i == 1) {
            return m31240m();
        }
        if (i == 2) {
            this.f21995b = 1;
            Iterator<? extends T> it = this.f21997d;
            C12775o.m28636f(it);
            return it.next();
        } else if (i == 3) {
            this.f21995b = 0;
            T t = this.f21996c;
            this.f21996c = null;
            return t;
        } else {
            throw m31239l();
        }
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void resumeWith(Object obj) {
        C11910n.m25701b(obj);
        this.f21995b = 4;
    }
}
