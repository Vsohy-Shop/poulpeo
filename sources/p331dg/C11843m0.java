package p331dg;

import java.lang.Comparable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p331dg.C11846n0;

@SourceDebugExtension({"SMAP\nThreadSafeHeap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadSafeHeap.kt\nkotlinx/coroutines/internal/ThreadSafeHeap\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,168:1\n28#2,4:169\n28#2,4:174\n28#2,4:179\n28#2,4:184\n28#2,4:189\n28#2,4:194\n28#2,4:199\n28#2,4:204\n20#3:173\n20#3:178\n20#3:183\n20#3:188\n20#3:193\n20#3:198\n20#3:203\n20#3:208\n1#4:209\n*S KotlinDebug\n*F\n+ 1 ThreadSafeHeap.kt\nkotlinx/coroutines/internal/ThreadSafeHeap\n*L\n35#1:169,4\n42#1:174,4\n50#1:179,4\n52#1:184,4\n60#1:189,4\n69#1:194,4\n72#1:199,4\n81#1:204,4\n35#1:173\n42#1:178\n50#1:183\n52#1:188\n60#1:193\n69#1:198\n72#1:203\n81#1:208\n*E\n"})
/* renamed from: dg.m0 */
/* compiled from: ThreadSafeHeap.kt */
public class C11843m0<T extends C11846n0 & Comparable<? super T>> {

    /* renamed from: b */
    private static final AtomicIntegerFieldUpdater f18493b = AtomicIntegerFieldUpdater.newUpdater(C11843m0.class, "_size");
    private volatile int _size;

    /* renamed from: a */
    private T[] f18494a;

    /* renamed from: f */
    private final T[] m25508f() {
        T[] tArr = this.f18494a;
        if (tArr == null) {
            T[] tArr2 = new C11846n0[4];
            this.f18494a = tArr2;
            return tArr2;
        } else if (mo49014c() < tArr.length) {
            return tArr;
        } else {
            T[] copyOf = Arrays.copyOf(tArr, mo49014c() * 2);
            C12775o.m28638h(copyOf, "copyOf(this, newSize)");
            T[] tArr3 = (C11846n0[]) copyOf;
            this.f18494a = tArr3;
            return tArr3;
        }
    }

    /* renamed from: j */
    private final void m25509j(int i) {
        f18493b.set(this, i);
    }

    /* renamed from: k */
    private final void m25510k(int i) {
        while (true) {
            int i2 = (i * 2) + 1;
            if (i2 < mo49014c()) {
                T[] tArr = this.f18494a;
                C12775o.m28636f(tArr);
                int i3 = i2 + 1;
                if (i3 < mo49014c()) {
                    T t = tArr[i3];
                    C12775o.m28636f(t);
                    T t2 = tArr[i2];
                    C12775o.m28636f(t2);
                    if (((Comparable) t).compareTo(t2) < 0) {
                        i2 = i3;
                    }
                }
                T t3 = tArr[i];
                C12775o.m28636f(t3);
                T t4 = tArr[i2];
                C12775o.m28636f(t4);
                if (((Comparable) t3).compareTo(t4) > 0) {
                    m25512m(i, i2);
                    i = i2;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: l */
    private final void m25511l(int i) {
        while (i > 0) {
            T[] tArr = this.f18494a;
            C12775o.m28636f(tArr);
            int i2 = (i - 1) / 2;
            T t = tArr[i2];
            C12775o.m28636f(t);
            T t2 = tArr[i];
            C12775o.m28636f(t2);
            if (((Comparable) t).compareTo(t2) > 0) {
                m25512m(i, i2);
                i = i2;
            } else {
                return;
            }
        }
    }

    /* renamed from: m */
    private final void m25512m(int i, int i2) {
        T[] tArr = this.f18494a;
        C12775o.m28636f(tArr);
        T t = tArr[i2];
        C12775o.m28636f(t);
        T t2 = tArr[i];
        C12775o.m28636f(t2);
        tArr[i] = t;
        tArr[i2] = t2;
        t.setIndex(i);
        t2.setIndex(i2);
    }

    /* renamed from: a */
    public final void mo49012a(T t) {
        t.mo49025a(this);
        C11846n0[] f = m25508f();
        int c = mo49014c();
        m25509j(c + 1);
        f[c] = t;
        t.setIndex(c);
        m25511l(c);
    }

    /* renamed from: b */
    public final T mo49013b() {
        T[] tArr = this.f18494a;
        if (tArr != null) {
            return tArr[0];
        }
        return null;
    }

    /* renamed from: c */
    public final int mo49014c() {
        return f18493b.get(this);
    }

    /* renamed from: d */
    public final boolean mo49015d() {
        if (mo49014c() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final T mo49016e() {
        T b;
        synchronized (this) {
            b = mo49013b();
        }
        return b;
    }

    /* renamed from: g */
    public final boolean mo49017g(T t) {
        boolean z;
        synchronized (this) {
            if (t.mo49026c() == null) {
                z = false;
            } else {
                mo49018h(t.getIndex());
                z = true;
            }
        }
        return z;
    }

    /* renamed from: h */
    public final T mo49018h(int i) {
        T[] tArr = this.f18494a;
        C12775o.m28636f(tArr);
        m25509j(mo49014c() - 1);
        if (i < mo49014c()) {
            m25512m(i, mo49014c());
            int i2 = (i - 1) / 2;
            if (i > 0) {
                T t = tArr[i];
                C12775o.m28636f(t);
                T t2 = tArr[i2];
                C12775o.m28636f(t2);
                if (((Comparable) t).compareTo(t2) < 0) {
                    m25512m(i, i2);
                    m25511l(i2);
                }
            }
            m25510k(i);
        }
        T t3 = tArr[mo49014c()];
        C12775o.m28636f(t3);
        t3.mo49025a((C11843m0<?>) null);
        t3.setIndex(-1);
        tArr[mo49014c()] = null;
        return t3;
    }

    /* renamed from: i */
    public final T mo49019i() {
        T t;
        synchronized (this) {
            if (mo49014c() > 0) {
                t = mo49018h(0);
            } else {
                t = null;
            }
        }
        return t;
    }
}
