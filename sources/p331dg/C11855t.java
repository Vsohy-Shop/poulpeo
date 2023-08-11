package p331dg;

import androidx.concurrent.futures.C1248a;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nLockFreeTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LockFreeTaskQueue.kt\nkotlinx/coroutines/internal/LockFreeTaskQueueCore\n+ 2 LockFreeTaskQueue.kt\nkotlinx/coroutines/internal/LockFreeTaskQueueCore$Companion\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,308:1\n299#2,3:309\n299#2,3:312\n299#2,3:315\n299#2,3:318\n299#2,3:321\n299#2,3:325\n299#2,3:328\n1#3:324\n*S KotlinDebug\n*F\n+ 1 LockFreeTaskQueue.kt\nkotlinx/coroutines/internal/LockFreeTaskQueueCore\n*L\n91#1:309,3\n92#1:312,3\n107#1:315,3\n167#1:318,3\n200#1:321,3\n231#1:325,3\n247#1:328,3\n*E\n"})
/* renamed from: dg.t */
/* compiled from: LockFreeTaskQueue.kt */
public final class C11855t<E> {

    /* renamed from: e */
    public static final C11856a f18514e = new C11856a((DefaultConstructorMarker) null);

    /* renamed from: f */
    private static final AtomicReferenceFieldUpdater f18515f;

    /* renamed from: g */
    private static final AtomicLongFieldUpdater f18516g;

    /* renamed from: h */
    public static final C11828g0 f18517h = new C11828g0("REMOVE_FROZEN");
    private volatile Object _next;
    private volatile long _state;

    /* renamed from: a */
    private final int f18518a;

    /* renamed from: b */
    private final boolean f18519b;

    /* renamed from: c */
    private final int f18520c;

    /* renamed from: d */
    private final AtomicReferenceArray f18521d;

    /* renamed from: dg.t$a */
    /* compiled from: LockFreeTaskQueue.kt */
    public static final class C11856a {
        private C11856a() {
        }

        public /* synthetic */ C11856a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int mo49052a(long j) {
            if ((j & 2305843009213693952L) != 0) {
                return 2;
            }
            return 1;
        }

        /* renamed from: b */
        public final long mo49053b(long j, int i) {
            return mo49055d(j, 1073741823) | (((long) i) << 0);
        }

        /* renamed from: c */
        public final long mo49054c(long j, int i) {
            return mo49055d(j, 1152921503533105152L) | (((long) i) << 30);
        }

        /* renamed from: d */
        public final long mo49055d(long j, long j2) {
            return j & (~j2);
        }
    }

    /* renamed from: dg.t$b */
    /* compiled from: LockFreeTaskQueue.kt */
    public static final class C11857b {

        /* renamed from: a */
        public final int f18522a;

        public C11857b(int i) {
            this.f18522a = i;
        }
    }

    static {
        Class<C11855t> cls = C11855t.class;
        f18515f = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "_next");
        f18516g = AtomicLongFieldUpdater.newUpdater(cls, "_state");
    }

    public C11855t(int i, boolean z) {
        boolean z2;
        this.f18518a = i;
        this.f18519b = z;
        int i2 = i - 1;
        this.f18520c = i2;
        this.f18521d = new AtomicReferenceArray(i);
        boolean z3 = false;
        if (i2 <= 1073741823) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (!((i & i2) == 0 ? true : z3)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: b */
    private final C11855t<E> m25555b(long j) {
        C11855t<E> tVar = new C11855t<>(this.f18518a * 2, this.f18519b);
        int i = (int) ((1073741823 & j) >> 0);
        int i2 = (int) ((1152921503533105152L & j) >> 30);
        while (true) {
            int i3 = this.f18520c;
            if ((i & i3) != (i2 & i3)) {
                Object obj = this.f18521d.get(i3 & i);
                if (obj == null) {
                    obj = new C11857b(i);
                }
                tVar.f18521d.set(tVar.f18520c & i, obj);
                i++;
            } else {
                f18516g.set(tVar, f18514e.mo49055d(j, 1152921504606846976L));
                return tVar;
            }
        }
    }

    /* renamed from: c */
    private final C11855t<E> m25556c(long j) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f18515f;
        while (true) {
            C11855t<E> tVar = (C11855t) atomicReferenceFieldUpdater.get(this);
            if (tVar != null) {
                return tVar;
            }
            C1248a.m719a(f18515f, this, (Object) null, m25555b(j));
        }
    }

    /* renamed from: e */
    private final C11855t<E> m25557e(int i, E e) {
        Object obj = this.f18521d.get(this.f18520c & i);
        if (!(obj instanceof C11857b) || ((C11857b) obj).f18522a != i) {
            return null;
        }
        this.f18521d.set(i & this.f18520c, e);
        return this;
    }

    /* renamed from: h */
    private final long m25558h() {
        long j;
        long j2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f18516g;
        do {
            j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                return j;
            }
            j2 = j | 1152921504606846976L;
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, j2));
        return j2;
    }

    /* renamed from: k */
    private final C11855t<E> m25559k(int i, int i2) {
        long j;
        int i3;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f18516g;
        do {
            j = atomicLongFieldUpdater.get(this);
            i3 = (int) ((1073741823 & j) >> 0);
            if ((1152921504606846976L & j) != 0) {
                return mo49050i();
            }
        } while (!f18516g.compareAndSet(this, j, f18514e.mo49053b(j, i2)));
        this.f18521d.set(this.f18520c & i3, (Object) null);
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x006c A[LOOP:1: B:20:0x006c->B:23:0x0081, LOOP_START, PHI: r0 
      PHI: (r0v3 dg.t) = (r0v2 dg.t), (r0v5 dg.t) binds: [B:19:0x0064, B:23:0x0081] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo49046a(E r14) {
        /*
            r13 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = f18516g
        L_0x0002:
            long r3 = r0.get(r13)
            r1 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r1 = r1 & r3
            r7 = 0
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x0016
            dg.t$a r14 = f18514e
            int r14 = r14.mo49052a(r3)
            return r14
        L_0x0016:
            r1 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r1 = r1 & r3
            r9 = 0
            long r1 = r1 >> r9
            int r1 = (int) r1
            r5 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r5 = r5 & r3
            r2 = 30
            long r5 = r5 >> r2
            int r10 = (int) r5
            int r11 = r13.f18520c
            int r2 = r10 + 2
            r2 = r2 & r11
            r5 = r1 & r11
            r6 = 1
            if (r2 != r5) goto L_0x0032
            return r6
        L_0x0032:
            boolean r2 = r13.f18519b
            r5 = 1073741823(0x3fffffff, float:1.9999999)
            if (r2 != 0) goto L_0x0051
            java.util.concurrent.atomic.AtomicReferenceArray r2 = r13.f18521d
            r12 = r10 & r11
            java.lang.Object r2 = r2.get(r12)
            if (r2 == 0) goto L_0x0051
            int r2 = r13.f18518a
            r3 = 1024(0x400, float:1.435E-42)
            if (r2 < r3) goto L_0x0050
            int r10 = r10 - r1
            r1 = r10 & r5
            int r2 = r2 >> 1
            if (r1 <= r2) goto L_0x0002
        L_0x0050:
            return r6
        L_0x0051:
            int r1 = r10 + 1
            r1 = r1 & r5
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = f18516g
            dg.t$a r5 = f18514e
            long r5 = r5.mo49054c(r3, r1)
            r1 = r2
            r2 = r13
            boolean r1 = r1.compareAndSet(r2, r3, r5)
            if (r1 == 0) goto L_0x0002
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r13.f18521d
            r1 = r10 & r11
            r0.set(r1, r14)
            r0 = r13
        L_0x006c:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = f18516g
            long r1 = r1.get(r0)
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x0083
            dg.t r0 = r0.mo49050i()
            dg.t r0 = r0.m25557e(r10, r14)
            if (r0 != 0) goto L_0x006c
        L_0x0083:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p331dg.C11855t.mo49046a(java.lang.Object):int");
    }

    /* renamed from: d */
    public final boolean mo49047d() {
        long j;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f18516g;
        do {
            j = atomicLongFieldUpdater.get(this);
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, j | 2305843009213693952L));
        return true;
    }

    /* renamed from: f */
    public final int mo49048f() {
        long j = f18516g.get(this);
        return (((int) ((j & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j) >> 0))) & 1073741823;
    }

    /* renamed from: g */
    public final boolean mo49049g() {
        long j = f18516g.get(this);
        if (((int) ((1073741823 & j) >> 0)) == ((int) ((j & 1152921503533105152L) >> 30))) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final C11855t<E> mo49050i() {
        return m25556c(m25558h());
    }

    /* renamed from: j */
    public final Object mo49051j() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f18516g;
        while (true) {
            long j = atomicLongFieldUpdater.get(this);
            if ((1152921504606846976L & j) != 0) {
                return f18517h;
            }
            int i = (int) ((1073741823 & j) >> 0);
            int i2 = this.f18520c;
            if ((((int) ((1152921503533105152L & j) >> 30)) & i2) == (i & i2)) {
                return null;
            }
            Object obj = this.f18521d.get(i2 & i);
            if (obj == null) {
                if (this.f18519b) {
                    return null;
                }
            } else if (obj instanceof C11857b) {
                return null;
            } else {
                int i3 = (i + 1) & 1073741823;
                if (f18516g.compareAndSet(this, j, f18514e.mo49053b(j, i3))) {
                    this.f18521d.set(this.f18520c & i, (Object) null);
                    return obj;
                } else if (this.f18519b) {
                    C11855t tVar = this;
                    do {
                        tVar = tVar.m25559k(i, i3);
                    } while (tVar != null);
                    return obj;
                }
            }
        }
    }
}
