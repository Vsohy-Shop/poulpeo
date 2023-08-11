package p466yf;

import androidx.concurrent.futures.C1248a;
import androidx.core.location.LocationRequestCompat;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p331dg.C11843m0;
import p331dg.C11846n0;
import p331dg.C11855t;
import p336ef.C11921v;
import p355hf.C12079g;
import p466yf.C14035u0;

@SourceDebugExtension({"SMAP\nEventLoop.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoopImplBase\n+ 2 ThreadSafeHeap.kt\nkotlinx/coroutines/internal/ThreadSafeHeap\n+ 3 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 4 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 5 EventLoop.kt\nkotlinx/coroutines/EventLoopKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,543:1\n60#2:544\n61#2,7:550\n28#3,4:545\n20#4:549\n56#5:557\n1#6:558\n*S KotlinDebug\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoopImplBase\n*L\n269#1:544\n269#1:550,7\n269#1:545,4\n269#1:549\n280#1:557\n*E\n"})
/* renamed from: yf.i1 */
/* compiled from: EventLoop.common.kt */
public abstract class C13979i1 extends C13987j1 implements C14035u0 {

    /* renamed from: e */
    private static final AtomicReferenceFieldUpdater f22909e;

    /* renamed from: f */
    private static final AtomicReferenceFieldUpdater f22910f;

    /* renamed from: g */
    private static final AtomicIntegerFieldUpdater f22911g;
    private volatile Object _delayed;
    private volatile int _isCompleted = 0;
    private volatile Object _queue;

    @SourceDebugExtension({"SMAP\nEventLoop.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoopImplBase$DelayedResumeTask\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,543:1\n1#2:544\n*E\n"})
    /* renamed from: yf.i1$a */
    /* compiled from: EventLoop.common.kt */
    private final class C13980a extends C13982c {

        /* renamed from: d */
        private final C14002n<C11921v> f22912d;

        public C13980a(long j, C14002n<? super C11921v> nVar) {
            super(j);
            this.f22912d = nVar;
        }

        public void run() {
            this.f22912d.mo49523c(C13979i1.this, C11921v.f18618a);
        }

        public String toString() {
            return super.toString() + this.f22912d;
        }
    }

    /* renamed from: yf.i1$b */
    /* compiled from: EventLoop.common.kt */
    private static final class C13981b extends C13982c {

        /* renamed from: d */
        private final Runnable f22914d;

        public C13981b(long j, Runnable runnable) {
            super(j);
            this.f22914d = runnable;
        }

        public void run() {
            this.f22914d.run();
        }

        public String toString() {
            return super.toString() + this.f22914d;
        }
    }

    @SourceDebugExtension({"SMAP\nEventLoop.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoopImplBase$DelayedTask\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 4 ThreadSafeHeap.kt\nkotlinx/coroutines/internal/ThreadSafeHeap\n*L\n1#1,543:1\n28#2,4:544\n28#2,4:550\n28#2,4:562\n20#3:548\n20#3:554\n20#3:566\n72#4:549\n73#4,7:555\n*S KotlinDebug\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoopImplBase$DelayedTask\n*L\n437#1:544,4\n439#1:550,4\n479#1:562,4\n437#1:548\n439#1:554\n479#1:566\n439#1:549\n439#1:555,7\n*E\n"})
    /* renamed from: yf.i1$c */
    /* compiled from: EventLoop.common.kt */
    public static abstract class C13982c implements Runnable, Comparable<C13982c>, C13943d1, C11846n0 {
        private volatile Object _heap;

        /* renamed from: b */
        public long f22915b;

        /* renamed from: c */
        private int f22916c = -1;

        public C13982c(long j) {
            this.f22915b = j;
        }

        /* renamed from: a */
        public void mo49025a(C11843m0<?> m0Var) {
            boolean z;
            if (this._heap != C13996l1.f22922a) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this._heap = m0Var;
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        /* renamed from: c */
        public C11843m0<?> mo49026c() {
            Object obj = this._heap;
            if (obj instanceof C11843m0) {
                return (C11843m0) obj;
            }
            return null;
        }

        /* renamed from: d */
        public int compareTo(C13982c cVar) {
            int i = ((this.f22915b - cVar.f22915b) > 0 ? 1 : ((this.f22915b - cVar.f22915b) == 0 ? 0 : -1));
            if (i > 0) {
                return 1;
            }
            if (i < 0) {
                return -1;
            }
            return 0;
        }

        public final void dispose() {
            C13983d dVar;
            synchronized (this) {
                Object obj = this._heap;
                if (obj != C13996l1.f22922a) {
                    if (obj instanceof C13983d) {
                        dVar = (C13983d) obj;
                    } else {
                        dVar = null;
                    }
                    if (dVar != null) {
                        dVar.mo49017g(this);
                    }
                    this._heap = C13996l1.f22922a;
                    C11921v vVar = C11921v.f18618a;
                }
            }
        }

        /* renamed from: e */
        public final int mo53769e(long j, C13983d dVar, C13979i1 i1Var) {
            synchronized (this) {
                if (this._heap == C13996l1.f22922a) {
                    return 2;
                }
                synchronized (dVar) {
                    C13982c cVar = (C13982c) dVar.mo49013b();
                    if (i1Var.m32403j0()) {
                        return 1;
                    }
                    if (cVar == null) {
                        dVar.f22917c = j;
                    } else {
                        long j2 = cVar.f22915b;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        if (j - dVar.f22917c > 0) {
                            dVar.f22917c = j;
                        }
                    }
                    long j3 = this.f22915b;
                    long j4 = dVar.f22917c;
                    if (j3 - j4 < 0) {
                        this.f22915b = j4;
                    }
                    dVar.mo49012a(this);
                    return 0;
                }
            }
        }

        /* renamed from: f */
        public final boolean mo53770f(long j) {
            if (j - this.f22915b >= 0) {
                return true;
            }
            return false;
        }

        public int getIndex() {
            return this.f22916c;
        }

        public void setIndex(int i) {
            this.f22916c = i;
        }

        public String toString() {
            return "Delayed[nanos=" + this.f22915b + ']';
        }
    }

    /* renamed from: yf.i1$d */
    /* compiled from: EventLoop.common.kt */
    public static final class C13983d extends C11843m0<C13982c> {

        /* renamed from: c */
        public long f22917c;

        public C13983d(long j) {
            this.f22917c = j;
        }
    }

    static {
        Class<C13979i1> cls = C13979i1.class;
        Class<Object> cls2 = Object.class;
        f22909e = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_queue");
        f22910f = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_delayed");
        f22911g = AtomicIntegerFieldUpdater.newUpdater(cls, "_isCompleted");
    }

    /* renamed from: J0 */
    private final void m32396J0() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f22909e;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                if (C1248a.m719a(f22909e, this, (Object) null, C13996l1.f22923b)) {
                    return;
                }
            } else if (obj instanceof C11855t) {
                ((C11855t) obj).mo49047d();
                return;
            } else if (obj != C13996l1.f22923b) {
                C11855t tVar = new C11855t(8, true);
                C12775o.m28637g(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                tVar.mo49046a((Runnable) obj);
                if (C1248a.m719a(f22909e, this, obj, tVar)) {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: K0 */
    private final Runnable m32397K0() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f22909e;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return null;
            }
            if (obj instanceof C11855t) {
                C12775o.m28637g(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                C11855t tVar = (C11855t) obj;
                Object j = tVar.mo49051j();
                if (j != C11855t.f18517h) {
                    return (Runnable) j;
                }
                C1248a.m719a(f22909e, this, obj, tVar.mo49050i());
            } else if (obj == C13996l1.f22923b) {
                return null;
            } else {
                if (C1248a.m719a(f22909e, this, obj, (Object) null)) {
                    C12775o.m28637g(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                    return (Runnable) obj;
                }
            }
        }
    }

    /* renamed from: M0 */
    private final boolean m32398M0(Runnable runnable) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f22909e;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (m32403j0()) {
                return false;
            }
            if (obj == null) {
                if (C1248a.m719a(f22909e, this, (Object) null, runnable)) {
                    return true;
                }
            } else if (obj instanceof C11855t) {
                C12775o.m28637g(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                C11855t tVar = (C11855t) obj;
                int a = tVar.mo49046a(runnable);
                if (a == 0) {
                    return true;
                }
                if (a == 1) {
                    C1248a.m719a(f22909e, this, obj, tVar.mo49050i());
                } else if (a == 2) {
                    return false;
                }
            } else if (obj == C13996l1.f22923b) {
                return false;
            } else {
                C11855t tVar2 = new C11855t(8, true);
                C12775o.m28637g(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                tVar2.mo49046a((Runnable) obj);
                tVar2.mo49046a(runnable);
                if (C1248a.m719a(f22909e, this, obj, tVar2)) {
                    return true;
                }
            }
        }
    }

    /* renamed from: O0 */
    private final void m32399O0() {
        C13982c cVar;
        C13936c.m32231a();
        long nanoTime = System.nanoTime();
        while (true) {
            C13983d dVar = (C13983d) f22910f.get(this);
            if (dVar != null && (cVar = (C13982c) dVar.mo49019i()) != null) {
                mo53771G0(nanoTime, cVar);
            } else {
                return;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: yf.i1$d} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: R0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m32400R0(long r4, p466yf.C13979i1.C13982c r6) {
        /*
            r3 = this;
            boolean r0 = r3.m32403j0()
            if (r0 == 0) goto L_0x0008
            r4 = 1
            return r4
        L_0x0008:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f22910f
            java.lang.Object r1 = r0.get(r3)
            yf.i1$d r1 = (p466yf.C13979i1.C13983d) r1
            if (r1 != 0) goto L_0x0025
            yf.i1$d r1 = new yf.i1$d
            r1.<init>(r4)
            r2 = 0
            androidx.concurrent.futures.C1248a.m719a(r0, r3, r2, r1)
            java.lang.Object r0 = r0.get(r3)
            kotlin.jvm.internal.C12775o.m28636f(r0)
            r1 = r0
            yf.i1$d r1 = (p466yf.C13979i1.C13983d) r1
        L_0x0025:
            int r4 = r6.mo53769e(r4, r1, r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p466yf.C13979i1.m32400R0(long, yf.i1$c):int");
    }

    /* renamed from: T0 */
    private final void m32401T0(boolean z) {
        f22911g.set(this, z ? 1 : 0);
    }

    /* renamed from: U0 */
    private final boolean m32402U0(C13982c cVar) {
        C13982c cVar2;
        C13983d dVar = (C13983d) f22910f.get(this);
        if (dVar != null) {
            cVar2 = (C13982c) dVar.mo49016e();
        } else {
            cVar2 = null;
        }
        if (cVar2 == cVar) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: j0 */
    public final boolean m32403j0() {
        if (f22911g.get(this) != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0053  */
    /* renamed from: C0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo53751C0() {
        /*
            r9 = this;
            boolean r0 = r9.mo53752D0()
            r1 = 0
            if (r0 == 0) goto L_0x0009
            return r1
        L_0x0009:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f22910f
            java.lang.Object r0 = r0.get(r9)
            yf.i1$d r0 = (p466yf.C13979i1.C13983d) r0
            if (r0 == 0) goto L_0x0049
            boolean r3 = r0.mo49015d()
            if (r3 != 0) goto L_0x0049
            p466yf.C13936c.m32231a()
            long r3 = java.lang.System.nanoTime()
        L_0x0020:
            monitor-enter(r0)
            dg.n0 r5 = r0.mo49013b()     // Catch:{ all -> 0x0046 }
            r6 = 0
            if (r5 != 0) goto L_0x002a
            monitor-exit(r0)
            goto L_0x0041
        L_0x002a:
            yf.i1$c r5 = (p466yf.C13979i1.C13982c) r5     // Catch:{ all -> 0x0046 }
            boolean r7 = r5.mo53770f(r3)     // Catch:{ all -> 0x0046 }
            r8 = 0
            if (r7 == 0) goto L_0x0038
            boolean r5 = r9.m32398M0(r5)     // Catch:{ all -> 0x0046 }
            goto L_0x0039
        L_0x0038:
            r5 = r8
        L_0x0039:
            if (r5 == 0) goto L_0x0040
            dg.n0 r5 = r0.mo49018h(r8)     // Catch:{ all -> 0x0046 }
            r6 = r5
        L_0x0040:
            monitor-exit(r0)
        L_0x0041:
            yf.i1$c r6 = (p466yf.C13979i1.C13982c) r6
            if (r6 != 0) goto L_0x0020
            goto L_0x0049
        L_0x0046:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x0049:
            java.lang.Runnable r0 = r9.m32397K0()
            if (r0 == 0) goto L_0x0053
            r0.run()
            return r1
        L_0x0053:
            long r0 = r9.mo53757x0()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p466yf.C13979i1.mo53751C0():long");
    }

    /* renamed from: L0 */
    public void mo53759L0(Runnable runnable) {
        if (m32398M0(runnable)) {
            mo53772H0();
        } else {
            C14019q0.f22942h.mo53759L0(runnable);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: N0 */
    public boolean mo53760N0() {
        if (!mo53750B0()) {
            return false;
        }
        C13983d dVar = (C13983d) f22910f.get(this);
        if (dVar != null && !dVar.mo49015d()) {
            return false;
        }
        Object obj = f22909e.get(this);
        if (obj != null) {
            if (obj instanceof C11855t) {
                return ((C11855t) obj).mo49049g();
            }
            if (obj != C13996l1.f22923b) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: P0 */
    public final void mo53761P0() {
        f22909e.set(this, (Object) null);
        f22910f.set(this, (Object) null);
    }

    /* renamed from: Q0 */
    public final void mo53762Q0(long j, C13982c cVar) {
        int R0 = m32400R0(j, cVar);
        if (R0 != 0) {
            if (R0 == 1) {
                mo53771G0(j, cVar);
            } else if (R0 != 2) {
                throw new IllegalStateException("unexpected result".toString());
            }
        } else if (m32402U0(cVar)) {
            mo53772H0();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: S0 */
    public final C13943d1 mo53763S0(long j, Runnable runnable) {
        long c = C13996l1.m32438c(j);
        if (c >= 4611686018427387903L) {
            return C14001m2.f22925b;
        }
        C13936c.m32231a();
        long nanoTime = System.nanoTime();
        C13981b bVar = new C13981b(c + nanoTime, runnable);
        mo53762Q0(nanoTime, bVar);
        return bVar;
    }

    /* renamed from: b */
    public void mo49020b(long j, C14002n<? super C11921v> nVar) {
        long c = C13996l1.m32438c(j);
        if (c < 4611686018427387903L) {
            C13936c.m32231a();
            long nanoTime = System.nanoTime();
            C13980a aVar = new C13980a(c + nanoTime, nVar);
            mo53762Q0(nanoTime, aVar);
            C14018q.m32524a(nVar, aVar);
        }
    }

    /* renamed from: c */
    public C13943d1 mo49021c(long j, Runnable runnable, C12079g gVar) {
        return C14035u0.C14036a.m32555a(this, j, runnable, gVar);
    }

    public final void dispatch(C12079g gVar, Runnable runnable) {
        mo53759L0(runnable);
    }

    public void shutdown() {
        C14047w2.f22961a.mo53813c();
        m32401T0(true);
        m32396J0();
        do {
        } while (mo53751C0() <= 0);
        m32399O0();
    }

    /* access modifiers changed from: protected */
    /* renamed from: x0 */
    public long mo53757x0() {
        C13982c cVar;
        if (super.mo53757x0() == 0) {
            return 0;
        }
        Object obj = f22909e.get(this);
        if (obj != null) {
            if (obj instanceof C11855t) {
                if (!((C11855t) obj).mo49049g()) {
                    return 0;
                }
            } else if (obj == C13996l1.f22923b) {
                return LocationRequestCompat.PASSIVE_INTERVAL;
            } else {
                return 0;
            }
        }
        C13983d dVar = (C13983d) f22910f.get(this);
        if (dVar == null || (cVar = (C13982c) dVar.mo49016e()) == null) {
            return LocationRequestCompat.PASSIVE_INTERVAL;
        }
        long j = cVar.f22915b;
        C13936c.m32231a();
        return C13537l.m30878e(j - System.nanoTime(), 0);
    }
}
