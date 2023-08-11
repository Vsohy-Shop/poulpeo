package p465ye;

import java.util.concurrent.atomic.AtomicInteger;
import p386lg.C12860b;
import p403oe.C13070g;

/* renamed from: ye.e */
/* compiled from: ScalarSubscription */
public final class C13923e<T> extends AtomicInteger implements C13070g<T> {
    private static final long serialVersionUID = -3830916580126663321L;

    /* renamed from: b */
    final T f22829b;

    /* renamed from: c */
    final C12860b<? super T> f22830c;

    public C13923e(C12860b<? super T> bVar, T t) {
        this.f22830c = bVar;
        this.f22829b = t;
    }

    public void cancel() {
        lazySet(2);
    }

    public void clear() {
        lazySet(1);
    }

    /* renamed from: g */
    public int mo50862g(int i) {
        return i & 1;
    }

    /* renamed from: h */
    public void mo50776h(long j) {
        if (C13925g.m32188g(j) && compareAndSet(0, 1)) {
            C12860b<? super T> bVar = this.f22830c;
            bVar.mo50773d(this.f22829b);
            if (get() != 2) {
                bVar.mo50772b();
            }
        }
    }

    public boolean isEmpty() {
        if (get() != 0) {
            return true;
        }
        return false;
    }

    public boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public T poll() {
        if (get() != 0) {
            return null;
        }
        lazySet(1);
        return this.f22829b;
    }
}
