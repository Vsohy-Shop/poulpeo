package p447ve;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p403oe.C13072i;
import p471ze.C14118k;

/* renamed from: ve.b */
/* compiled from: SpscLinkedArrayQueue */
public final class C13640b<T> implements C13072i<T> {

    /* renamed from: j */
    static final int f21967j = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();

    /* renamed from: k */
    private static final Object f21968k = new Object();

    /* renamed from: b */
    final AtomicLong f21969b = new AtomicLong();

    /* renamed from: c */
    int f21970c;

    /* renamed from: d */
    long f21971d;

    /* renamed from: e */
    final int f21972e;

    /* renamed from: f */
    AtomicReferenceArray<Object> f21973f;

    /* renamed from: g */
    final int f21974g;

    /* renamed from: h */
    AtomicReferenceArray<Object> f21975h;

    /* renamed from: i */
    final AtomicLong f21976i = new AtomicLong();

    public C13640b(int i) {
        int a = C14118k.m32776a(Math.max(8, i));
        int i2 = a - 1;
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(a + 1);
        this.f21973f = atomicReferenceArray;
        this.f21972e = i2;
        m31205a(a);
        this.f21975h = atomicReferenceArray;
        this.f21974g = i2;
        this.f21971d = (long) (i2 - 1);
        m31219p(0);
    }

    /* renamed from: a */
    private void m31205a(int i) {
        this.f21970c = Math.min(i / 4, f21967j);
    }

    /* renamed from: c */
    private static int m31207c(long j, int i) {
        return m31206b(((int) j) & i);
    }

    /* renamed from: d */
    private long m31208d() {
        return this.f21976i.get();
    }

    /* renamed from: e */
    private long m31209e() {
        return this.f21969b.get();
    }

    /* renamed from: f */
    private long m31210f() {
        return this.f21976i.get();
    }

    /* renamed from: h */
    private static <E> Object m31211h(AtomicReferenceArray<Object> atomicReferenceArray, int i) {
        return atomicReferenceArray.get(i);
    }

    /* renamed from: i */
    private AtomicReferenceArray<Object> m31212i(AtomicReferenceArray<Object> atomicReferenceArray, int i) {
        int b = m31206b(i);
        AtomicReferenceArray<Object> atomicReferenceArray2 = (AtomicReferenceArray) m31211h(atomicReferenceArray, b);
        m31217n(atomicReferenceArray, b, (Object) null);
        return atomicReferenceArray2;
    }

    /* renamed from: j */
    private long m31213j() {
        return this.f21969b.get();
    }

    /* renamed from: k */
    private T m31214k(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i) {
        this.f21975h = atomicReferenceArray;
        int c = m31207c(j, i);
        T h = m31211h(atomicReferenceArray, c);
        if (h != null) {
            m31217n(atomicReferenceArray, c, (Object) null);
            m31216m(j + 1);
        }
        return h;
    }

    /* renamed from: l */
    private void m31215l(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i, T t, long j2) {
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.f21973f = atomicReferenceArray2;
        this.f21971d = (j2 + j) - 1;
        m31217n(atomicReferenceArray2, i, t);
        m31218o(atomicReferenceArray, atomicReferenceArray2);
        m31217n(atomicReferenceArray, i, f21968k);
        m31219p(j + 1);
    }

    /* renamed from: m */
    private void m31216m(long j) {
        this.f21976i.lazySet(j);
    }

    /* renamed from: n */
    private static void m31217n(AtomicReferenceArray<Object> atomicReferenceArray, int i, Object obj) {
        atomicReferenceArray.lazySet(i, obj);
    }

    /* renamed from: o */
    private void m31218o(AtomicReferenceArray<Object> atomicReferenceArray, AtomicReferenceArray<Object> atomicReferenceArray2) {
        m31217n(atomicReferenceArray, m31206b(atomicReferenceArray.length() - 1), atomicReferenceArray2);
    }

    /* renamed from: p */
    private void m31219p(long j) {
        this.f21969b.lazySet(j);
    }

    /* renamed from: q */
    private boolean m31220q(AtomicReferenceArray<Object> atomicReferenceArray, T t, long j, int i) {
        m31217n(atomicReferenceArray, i, t);
        m31219p(j + 1);
        return true;
    }

    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    public boolean isEmpty() {
        if (m31213j() == m31210f()) {
            return true;
        }
        return false;
    }

    public boolean offer(T t) {
        if (t != null) {
            AtomicReferenceArray<Object> atomicReferenceArray = this.f21973f;
            long e = m31209e();
            int i = this.f21972e;
            int c = m31207c(e, i);
            if (e < this.f21971d) {
                return m31220q(atomicReferenceArray, t, e, c);
            }
            long j = ((long) this.f21970c) + e;
            if (m31211h(atomicReferenceArray, m31207c(j, i)) == null) {
                this.f21971d = j - 1;
                return m31220q(atomicReferenceArray, t, e, c);
            } else if (m31211h(atomicReferenceArray, m31207c(1 + e, i)) == null) {
                return m31220q(atomicReferenceArray, t, e, c);
            } else {
                m31215l(atomicReferenceArray, e, c, t, (long) i);
                return true;
            }
        } else {
            throw new NullPointerException("Null is not a valid element");
        }
    }

    public T poll() {
        boolean z;
        AtomicReferenceArray<Object> atomicReferenceArray = this.f21975h;
        long d = m31208d();
        int i = this.f21974g;
        int c = m31207c(d, i);
        T h = m31211h(atomicReferenceArray, c);
        if (h == f21968k) {
            z = true;
        } else {
            z = false;
        }
        if (h != null && !z) {
            m31217n(atomicReferenceArray, c, (Object) null);
            m31216m(d + 1);
            return h;
        } else if (z) {
            return m31214k(m31212i(atomicReferenceArray, i + 1), d, i);
        } else {
            return null;
        }
    }

    /* renamed from: b */
    private static int m31206b(int i) {
        return i;
    }
}
