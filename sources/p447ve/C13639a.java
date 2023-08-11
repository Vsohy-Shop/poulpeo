package p447ve;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p403oe.C13072i;
import p471ze.C14118k;

/* renamed from: ve.a */
/* compiled from: SpscArrayQueue */
public final class C13639a<E> extends AtomicReferenceArray<E> implements C13072i<E> {

    /* renamed from: g */
    private static final Integer f21961g = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
    private static final long serialVersionUID = -1296597691183856449L;

    /* renamed from: b */
    final int f21962b = (length() - 1);

    /* renamed from: c */
    final AtomicLong f21963c = new AtomicLong();

    /* renamed from: d */
    long f21964d;

    /* renamed from: e */
    final AtomicLong f21965e = new AtomicLong();

    /* renamed from: f */
    final int f21966f;

    public C13639a(int i) {
        super(C14118k.m32776a(i));
        this.f21966f = Math.min(i / 4, f21961g.intValue());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo53308a(long j) {
        return ((int) j) & this.f21962b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo53309b(long j, int i) {
        return ((int) j) & i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public E mo53310c(int i) {
        return get(i);
    }

    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo53311d(long j) {
        this.f21965e.lazySet(j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo53312e(int i, E e) {
        lazySet(i, e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo53313f(long j) {
        this.f21963c.lazySet(j);
    }

    public boolean isEmpty() {
        if (this.f21963c.get() == this.f21965e.get()) {
            return true;
        }
        return false;
    }

    public boolean offer(E e) {
        if (e != null) {
            int i = this.f21962b;
            long j = this.f21963c.get();
            int b = mo53309b(j, i);
            if (j >= this.f21964d) {
                long j2 = ((long) this.f21966f) + j;
                if (mo53310c(mo53309b(j2, i)) == null) {
                    this.f21964d = j2;
                } else if (mo53310c(b) != null) {
                    return false;
                }
            }
            mo53312e(b, e);
            mo53313f(j + 1);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    public E poll() {
        long j = this.f21965e.get();
        int a = mo53308a(j);
        E c = mo53310c(a);
        if (c == null) {
            return null;
        }
        mo53311d(j + 1);
        mo53312e(a, (Object) null);
        return c;
    }
}
