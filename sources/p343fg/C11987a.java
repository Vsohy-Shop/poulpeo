package p343fg;

import androidx.core.location.LocationRequestCompat;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.SourceDebugExtension;
import p331dg.C11818b0;
import p331dg.C11828g0;
import p336ef.C11921v;
import p424rf.C13364c;
import p466yf.C13936c;
import p466yf.C14015p0;

@SourceDebugExtension({"SMAP\nCoroutineScheduler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler\n+ 2 Tasks.kt\nkotlinx/coroutines/scheduling/TasksKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 5 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 6 Tasks.kt\nkotlinx/coroutines/scheduling/Task\n+ 7 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler$Worker\n*L\n1#1,1033:1\n285#1:1036\n283#1:1037\n283#1:1038\n285#1:1039\n280#1:1045\n281#1,5:1046\n291#1:1052\n283#1:1053\n284#1:1054\n283#1:1060\n284#1:1061\n280#1:1062\n288#1:1063\n283#1:1064\n283#1:1067\n284#1:1068\n285#1:1069\n90#2:1034\n90#2:1051\n1#3:1035\n28#4,4:1040\n28#4,4:1055\n20#5:1044\n20#5:1059\n87#6:1065\n610#7:1066\n*S KotlinDebug\n*F\n+ 1 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler\n*L\n281#1:1036\n288#1:1037\n289#1:1038\n298#1:1039\n347#1:1045\n375#1:1046,5\n398#1:1052\n445#1:1053\n446#1:1054\n482#1:1060\n483#1:1061\n489#1:1062\n498#1:1063\n498#1:1064\n576#1:1067\n577#1:1068\n578#1:1069\n119#1:1034\n395#1:1051\n347#1:1040,4\n478#1:1055,4\n347#1:1044\n478#1:1059\n515#1:1065\n522#1:1066\n*E\n"})
/* renamed from: fg.a */
/* compiled from: CoroutineScheduler.kt */
public final class C11987a implements Executor, Closeable {

    /* renamed from: i */
    public static final C11988a f18713i = new C11988a((DefaultConstructorMarker) null);

    /* renamed from: j */
    private static final AtomicLongFieldUpdater f18714j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final AtomicLongFieldUpdater f18715k;

    /* renamed from: l */
    private static final AtomicIntegerFieldUpdater f18716l;

    /* renamed from: m */
    public static final C11828g0 f18717m = new C11828g0("NOT_IN_STACK");
    private volatile int _isTerminated;

    /* renamed from: b */
    public final int f18718b;

    /* renamed from: c */
    public final int f18719c;
    private volatile long controlState;

    /* renamed from: d */
    public final long f18720d;

    /* renamed from: e */
    public final String f18721e;

    /* renamed from: f */
    public final C11994d f18722f;

    /* renamed from: g */
    public final C11994d f18723g;

    /* renamed from: h */
    public final C11818b0<C11990c> f18724h;
    private volatile long parkedWorkersStack;

    /* renamed from: fg.a$a */
    /* compiled from: CoroutineScheduler.kt */
    public static final class C11988a {
        private C11988a() {
        }

        public /* synthetic */ C11988a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: fg.a$b */
    /* compiled from: CoroutineScheduler.kt */
    public /* synthetic */ class C11989b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f18725a;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|11|13) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                fg.a$d[] r0 = p343fg.C11987a.C11991d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                fg.a$d r1 = p343fg.C11987a.C11991d.PARKING     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                fg.a$d r1 = p343fg.C11987a.C11991d.BLOCKING     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                fg.a$d r1 = p343fg.C11987a.C11991d.CPU_ACQUIRED     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                fg.a$d r1 = p343fg.C11987a.C11991d.DORMANT     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                fg.a$d r1 = p343fg.C11987a.C11991d.TERMINATED     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                f18725a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p343fg.C11987a.C11989b.<clinit>():void");
        }
    }

    /* renamed from: fg.a$d */
    /* compiled from: CoroutineScheduler.kt */
    public enum C11991d {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    static {
        Class<C11987a> cls = C11987a.class;
        f18714j = AtomicLongFieldUpdater.newUpdater(cls, "parkedWorkersStack");
        f18715k = AtomicLongFieldUpdater.newUpdater(cls, "controlState");
        f18716l = AtomicIntegerFieldUpdater.newUpdater(cls, "_isTerminated");
    }

    public C11987a(int i, int i2, long j, String str) {
        boolean z;
        boolean z2;
        boolean z3;
        this.f18718b = i;
        this.f18719c = i2;
        this.f18720d = j;
        this.f18721e = str;
        boolean z4 = true;
        if (i >= 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i2 >= i) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (i2 <= 2097150) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    if (j <= 0 ? false : z4) {
                        this.f18722f = new C11994d();
                        this.f18723g = new C11994d();
                        this.f18724h = new C11818b0<>((i + 1) * 2);
                        this.controlState = ((long) i) << 42;
                        this._isTerminated = 0;
                        return;
                    }
                    throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
                }
                throw new IllegalArgumentException(("Max pool size " + i2 + " should not exceed maximal supported number of threads 2097150").toString());
            }
            throw new IllegalArgumentException(("Max pool size " + i2 + " should be greater than or equals to core pool size " + i).toString());
        }
        throw new IllegalArgumentException(("Core pool size " + i + " should be at least 1").toString());
    }

    /* renamed from: A */
    private final C11990c m26014A() {
        C11990c cVar;
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof C11990c) {
            cVar = (C11990c) currentThread;
        } else {
            cVar = null;
        }
        if (cVar == null || !C12775o.m28634d(C11987a.this, this)) {
            return null;
        }
        return cVar;
    }

    /* renamed from: O */
    public static /* synthetic */ void m26015O(C11987a aVar, Runnable runnable, C11999i iVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            iVar = C12002l.f18760g;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        aVar.mo49403G(runnable, iVar, z);
    }

    /* renamed from: Q */
    private final int m26016Q(C11990c cVar) {
        Object i = cVar.mo49416i();
        while (i != f18717m) {
            if (i == null) {
                return 0;
            }
            C11990c cVar2 = (C11990c) i;
            int h = cVar2.mo49415h();
            if (h != 0) {
                return h;
            }
            i = cVar2.mo49416i();
        }
        return -1;
    }

    /* renamed from: R */
    private final C11990c m26017R() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f18714j;
        while (true) {
            long j = atomicLongFieldUpdater.get(this);
            C11990c b = this.f18724h.mo48978b((int) (2097151 & j));
            if (b == null) {
                return null;
            }
            long j2 = (2097152 + j) & -2097152;
            int Q = m26016Q(b);
            if (Q >= 0) {
                if (f18714j.compareAndSet(this, j, ((long) Q) | j2)) {
                    b.mo49419r(f18717m);
                    return b;
                }
            }
        }
    }

    /* renamed from: b */
    private final boolean m26019b(C11998h hVar) {
        boolean z = true;
        if (hVar.f18751c.mo49429b() != 1) {
            z = false;
        }
        if (z) {
            return this.f18723g.mo49042a(hVar);
        }
        return this.f18722f.mo49042a(hVar);
    }

    /* renamed from: c */
    private final int m26020c() {
        boolean z;
        synchronized (this.f18724h) {
            if (isTerminated()) {
                return -1;
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater = f18715k;
            long j = atomicLongFieldUpdater.get(this);
            int i = (int) (j & 2097151);
            boolean z2 = false;
            int d = C13537l.m30877d(i - ((int) ((j & 4398044413952L) >> 21)), 0);
            if (d >= this.f18718b) {
                return 0;
            }
            if (i >= this.f18719c) {
                return 0;
            }
            int i2 = ((int) (f18715k.get(this) & 2097151)) + 1;
            if (i2 <= 0 || this.f18724h.mo48978b(i2) != null) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                C11990c cVar = new C11990c(this, i2);
                this.f18724h.mo48979c(i2, cVar);
                if (i2 == ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    z2 = true;
                }
                if (z2) {
                    int i3 = d + 1;
                    cVar.start();
                    return i3;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    /* renamed from: c0 */
    private final void m26021c0(long j, boolean z) {
        if (!z && !m26025u0() && !m26023p0(j)) {
            m26025u0();
        }
    }

    /* renamed from: k0 */
    private final C11998h m26022k0(C11990c cVar, C11998h hVar, boolean z) {
        if (cVar == null || cVar.f18729d == C11991d.TERMINATED) {
            return hVar;
        }
        if (hVar.f18751c.mo49429b() == 0 && cVar.f18729d == C11991d.BLOCKING) {
            return hVar;
        }
        cVar.f18733h = true;
        return cVar.f18727b.mo49432a(hVar, z);
    }

    /* renamed from: p0 */
    private final boolean m26023p0(long j) {
        if (C13537l.m30877d(((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21)), 0) < this.f18718b) {
            int c = m26020c();
            if (c == 1 && this.f18718b > 1) {
                m26020c();
            }
            if (c > 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: t0 */
    static /* synthetic */ boolean m26024t0(C11987a aVar, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = f18715k.get(aVar);
        }
        return aVar.m26023p0(j);
    }

    /* renamed from: u0 */
    private final boolean m26025u0() {
        C11990c R;
        do {
            R = m26017R();
            if (R == null) {
                return false;
            }
        } while (!C11990c.m26039j().compareAndSet(R, -1, 0));
        LockSupport.unpark(R);
        return true;
    }

    /* renamed from: G */
    public final void mo49403G(Runnable runnable, C11999i iVar, boolean z) {
        boolean z2;
        long j;
        C13936c.m32231a();
        C11998h k = mo49412k(runnable, iVar);
        boolean z3 = false;
        if (k.f18751c.mo49429b() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            j = f18715k.addAndGet(this, 2097152);
        } else {
            j = 0;
        }
        C11990c A = m26014A();
        C11998h k0 = m26022k0(A, k, z);
        if (k0 == null || m26019b(k0)) {
            if (z && A != null) {
                z3 = true;
            }
            if (z2) {
                m26021c0(j, z3);
            } else if (!z3) {
                mo49411j0();
            }
        } else {
            throw new RejectedExecutionException(this.f18721e + " was terminated");
        }
    }

    /* renamed from: V */
    public final boolean mo49404V(C11990c cVar) {
        long j;
        int h;
        if (cVar.mo49416i() != f18717m) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f18714j;
        do {
            j = atomicLongFieldUpdater.get(this);
            h = cVar.mo49415h();
            cVar.mo49419r(this.f18724h.mo48978b((int) (2097151 & j)));
        } while (!f18714j.compareAndSet(this, j, ((2097152 + j) & -2097152) | ((long) h)));
        return true;
    }

    /* renamed from: X */
    public final void mo49405X(C11990c cVar, int i, int i2) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f18714j;
        while (true) {
            long j = atomicLongFieldUpdater.get(this);
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & -2097152;
            if (i3 == i) {
                if (i2 == 0) {
                    i3 = m26016Q(cVar);
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0) {
                if (f18714j.compareAndSet(this, j, j2 | ((long) i3))) {
                    return;
                }
            }
        }
    }

    /* renamed from: Y */
    public final void mo49406Y(C11998h hVar) {
        try {
            hVar.run();
        } catch (Throwable th) {
            C13936c.m32231a();
            throw th;
        }
        C13936c.m32231a();
    }

    /* renamed from: a0 */
    public final void mo49407a0(long j) {
        int i;
        C11998h hVar;
        if (f18716l.compareAndSet(this, 0, 1)) {
            C11990c A = m26014A();
            synchronized (this.f18724h) {
                i = (int) (f18715k.get(this) & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    C11990c b = this.f18724h.mo48978b(i2);
                    C12775o.m28636f(b);
                    C11990c cVar = b;
                    if (cVar != A) {
                        while (cVar.isAlive()) {
                            LockSupport.unpark(cVar);
                            cVar.join(j);
                        }
                        cVar.f18727b.mo49434f(this.f18723g);
                    }
                    if (i2 == i) {
                        break;
                    }
                    i2++;
                }
            }
            this.f18723g.mo49043b();
            this.f18722f.mo49043b();
            while (true) {
                if (A != null) {
                    hVar = A.mo49414g(true);
                    if (hVar != null) {
                        continue;
                        mo49406Y(hVar);
                    }
                }
                hVar = (C11998h) this.f18722f.mo49045d();
                if (hVar == null && (hVar = (C11998h) this.f18723g.mo49045d()) == null) {
                    break;
                }
                mo49406Y(hVar);
            }
            if (A != null) {
                A.mo49421u(C11991d.TERMINATED);
            }
            f18714j.set(this, 0);
            f18715k.set(this, 0);
        }
    }

    public void close() {
        mo49407a0(10000);
    }

    public void execute(Runnable runnable) {
        m26015O(this, runnable, (C11999i) null, false, 6, (Object) null);
    }

    public final boolean isTerminated() {
        if (f18716l.get(this) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: j0 */
    public final void mo49411j0() {
        if (!m26025u0() && !m26024t0(this, 0, 1, (Object) null)) {
            m26025u0();
        }
    }

    /* renamed from: k */
    public final C11998h mo49412k(Runnable runnable, C11999i iVar) {
        long a = C12002l.f18759f.mo49426a();
        if (!(runnable instanceof C11998h)) {
            return new C12001k(runnable, a, iVar);
        }
        C11998h hVar = (C11998h) runnable;
        hVar.f18750b = a;
        hVar.f18751c = iVar;
        return hVar;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        int a = this.f18724h.mo48977a();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < a; i6++) {
            C11990c b = this.f18724h.mo48978b(i6);
            if (b != null) {
                int e = b.f18727b.mo49433e();
                int i7 = C11989b.f18725a[b.f18729d.ordinal()];
                if (i7 == 1) {
                    i3++;
                } else if (i7 == 2) {
                    i2++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(e);
                    sb.append('b');
                    arrayList.add(sb.toString());
                } else if (i7 == 3) {
                    i++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(e);
                    sb2.append('c');
                    arrayList.add(sb2.toString());
                } else if (i7 == 4) {
                    i4++;
                    if (e > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(e);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else if (i7 == 5) {
                    i5++;
                }
            }
        }
        long j = f18715k.get(this);
        return this.f18721e + '@' + C14015p0.m32519b(this) + "[Pool Size {core = " + this.f18718b + ", max = " + this.f18719c + "}, Worker States {CPU = " + i + ", blocking = " + i2 + ", parked = " + i3 + ", dormant = " + i4 + ", terminated = " + i5 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f18722f.mo49044c() + ", global blocking queue size = " + this.f18723g.mo49044c() + ", Control State {created workers= " + ((int) (2097151 & j)) + ", blocking tasks = " + ((int) ((4398044413952L & j) >> 21)) + ", CPUs acquired = " + (this.f18718b - ((int) ((9223367638808264704L & j) >> 42))) + "}]";
    }

    @SourceDebugExtension({"SMAP\nCoroutineScheduler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler$Worker\n+ 2 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Tasks.kt\nkotlinx/coroutines/scheduling/Task\n+ 5 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 6 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n*L\n1#1,1033:1\n298#2:1034\n285#2:1035\n299#2,4:1036\n304#2:1040\n294#2,2:1041\n294#2,2:1045\n280#2:1052\n289#2:1053\n283#2:1054\n280#2:1055\n1#3:1043\n87#4:1044\n28#5,4:1047\n20#6:1051\n*S KotlinDebug\n*F\n+ 1 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler$Worker\n*L\n665#1:1034\n665#1:1035\n665#1:1036,4\n679#1:1040\n753#1:1041,2\n807#1:1045,2\n855#1:1052\n881#1:1053\n881#1:1054\n963#1:1055\n790#1:1044\n851#1:1047,4\n851#1:1051\n*E\n"})
    /* renamed from: fg.a$c */
    /* compiled from: CoroutineScheduler.kt */
    public final class C11990c extends Thread {

        /* renamed from: j */
        private static final AtomicIntegerFieldUpdater f18726j = AtomicIntegerFieldUpdater.newUpdater(C11990c.class, "workerCtl");

        /* renamed from: b */
        public final C12004n f18727b;

        /* renamed from: c */
        private final Ref$ObjectRef<C11998h> f18728c;

        /* renamed from: d */
        public C11991d f18729d;

        /* renamed from: e */
        private long f18730e;

        /* renamed from: f */
        private long f18731f;

        /* renamed from: g */
        private int f18732g;

        /* renamed from: h */
        public boolean f18733h;
        private volatile int indexInArray;
        private volatile Object nextParkedWorker;
        private volatile int workerCtl;

        private C11990c() {
            setDaemon(true);
            this.f18727b = new C12004n();
            this.f18728c = new Ref$ObjectRef<>();
            this.f18729d = C11991d.DORMANT;
            this.nextParkedWorker = C11987a.f18717m;
            this.f18732g = C13364c.f21412b.mo52982b();
        }

        /* renamed from: b */
        private final void m26034b(int i) {
            if (i != 0) {
                C11987a.f18715k.addAndGet(C11987a.this, -2097152);
                if (this.f18729d != C11991d.TERMINATED) {
                    this.f18729d = C11991d.DORMANT;
                }
            }
        }

        /* renamed from: c */
        private final void m26035c(int i) {
            if (i != 0 && mo49421u(C11991d.BLOCKING)) {
                C11987a.this.mo49411j0();
            }
        }

        /* renamed from: d */
        private final void m26036d(C11998h hVar) {
            int b = hVar.f18751c.mo49429b();
            m26040k(b);
            m26035c(b);
            C11987a.this.mo49406Y(hVar);
            m26034b(b);
        }

        /* renamed from: e */
        private final C11998h m26037e(boolean z) {
            boolean z2;
            C11998h o;
            C11998h o2;
            if (z) {
                if (mo49417m(C11987a.this.f18718b * 2) == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2 && (o2 = m26043o()) != null) {
                    return o2;
                }
                C11998h g = this.f18727b.mo49435g();
                if (g != null) {
                    return g;
                }
                if (!z2 && (o = m26043o()) != null) {
                    return o;
                }
            } else {
                C11998h o3 = m26043o();
                if (o3 != null) {
                    return o3;
                }
            }
            return m26047v(3);
        }

        /* renamed from: f */
        private final C11998h m26038f() {
            C11998h h = this.f18727b.mo49436h();
            if (h != null) {
                return h;
            }
            C11998h hVar = (C11998h) C11987a.this.f18723g.mo49045d();
            if (hVar == null) {
                return m26047v(1);
            }
            return hVar;
        }

        /* renamed from: j */
        public static final AtomicIntegerFieldUpdater m26039j() {
            return f18726j;
        }

        /* renamed from: k */
        private final void m26040k(int i) {
            this.f18730e = 0;
            if (this.f18729d == C11991d.PARKING) {
                this.f18729d = C11991d.BLOCKING;
            }
        }

        /* renamed from: l */
        private final boolean m26041l() {
            if (this.nextParkedWorker != C11987a.f18717m) {
                return true;
            }
            return false;
        }

        /* renamed from: n */
        private final void m26042n() {
            if (this.f18730e == 0) {
                this.f18730e = System.nanoTime() + C11987a.this.f18720d;
            }
            LockSupport.parkNanos(C11987a.this.f18720d);
            if (System.nanoTime() - this.f18730e >= 0) {
                this.f18730e = 0;
                m26048w();
            }
        }

        /* renamed from: o */
        private final C11998h m26043o() {
            if (mo49417m(2) == 0) {
                C11998h hVar = (C11998h) C11987a.this.f18722f.mo49045d();
                if (hVar != null) {
                    return hVar;
                }
                return (C11998h) C11987a.this.f18723g.mo49045d();
            }
            C11998h hVar2 = (C11998h) C11987a.this.f18723g.mo49045d();
            if (hVar2 != null) {
                return hVar2;
            }
            return (C11998h) C11987a.this.f18722f.mo49045d();
        }

        /* renamed from: p */
        private final void m26044p() {
            loop0:
            while (true) {
                boolean z = false;
                while (!C11987a.this.isTerminated() && this.f18729d != C11991d.TERMINATED) {
                    C11998h g = mo49414g(this.f18733h);
                    if (g != null) {
                        this.f18731f = 0;
                        m26036d(g);
                    } else {
                        this.f18733h = false;
                        if (this.f18731f == 0) {
                            m26046t();
                        } else if (!z) {
                            z = true;
                        } else {
                            mo49421u(C11991d.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f18731f);
                            this.f18731f = 0;
                        }
                    }
                }
            }
            mo49421u(C11991d.TERMINATED);
        }

        /* renamed from: s */
        private final boolean m26045s() {
            boolean z;
            if (this.f18729d == C11991d.CPU_ACQUIRED) {
                return true;
            }
            C11987a aVar = C11987a.this;
            AtomicLongFieldUpdater a = C11987a.f18715k;
            while (true) {
                long j = a.get(aVar);
                if (((int) ((9223367638808264704L & j) >> 42)) != 0) {
                    if (C11987a.f18715k.compareAndSet(aVar, j, j - 4398046511104L)) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            if (!z) {
                return false;
            }
            this.f18729d = C11991d.CPU_ACQUIRED;
            return true;
        }

        /* renamed from: t */
        private final void m26046t() {
            if (!m26041l()) {
                C11987a.this.mo49404V(this);
                return;
            }
            f18726j.set(this, -1);
            while (m26041l() && f18726j.get(this) == -1 && !C11987a.this.isTerminated() && this.f18729d != C11991d.TERMINATED) {
                mo49421u(C11991d.PARKING);
                Thread.interrupted();
                m26042n();
            }
        }

        /* renamed from: v */
        private final C11998h m26047v(int i) {
            int i2 = (int) (C11987a.f18715k.get(C11987a.this) & 2097151);
            if (i2 < 2) {
                return null;
            }
            int m = mo49417m(i2);
            C11987a aVar = C11987a.this;
            long j = Long.MAX_VALUE;
            for (int i3 = 0; i3 < i2; i3++) {
                m++;
                if (m > i2) {
                    m = 1;
                }
                C11990c b = aVar.f18724h.mo48978b(m);
                if (b == null || b == this) {
                    int i4 = i;
                } else {
                    long n = b.f18727b.mo49437n(i, this.f18728c);
                    if (n == -1) {
                        Ref$ObjectRef<C11998h> ref$ObjectRef = this.f18728c;
                        C11998h hVar = (C11998h) ref$ObjectRef.f20403b;
                        ref$ObjectRef.f20403b = null;
                        return hVar;
                    } else if (n > 0) {
                        j = Math.min(j, n);
                    }
                }
            }
            if (j == LocationRequestCompat.PASSIVE_INTERVAL) {
                j = 0;
            }
            this.f18731f = j;
            return null;
        }

        /* renamed from: w */
        private final void m26048w() {
            C11987a aVar = C11987a.this;
            synchronized (aVar.f18724h) {
                if (!aVar.isTerminated()) {
                    if (((int) (C11987a.f18715k.get(aVar) & 2097151)) > aVar.f18718b) {
                        if (f18726j.compareAndSet(this, -1, 1)) {
                            int i = this.indexInArray;
                            mo49418q(0);
                            aVar.mo49405X(this, i, 0);
                            int andDecrement = (int) (C11987a.f18715k.getAndDecrement(aVar) & 2097151);
                            if (andDecrement != i) {
                                C11990c b = aVar.f18724h.mo48978b(andDecrement);
                                C12775o.m28636f(b);
                                C11990c cVar = b;
                                aVar.f18724h.mo48979c(i, cVar);
                                cVar.mo49418q(i);
                                aVar.mo49405X(cVar, andDecrement, i);
                            }
                            aVar.f18724h.mo48979c(andDecrement, null);
                            C11921v vVar = C11921v.f18618a;
                            this.f18729d = C11991d.TERMINATED;
                        }
                    }
                }
            }
        }

        /* renamed from: g */
        public final C11998h mo49414g(boolean z) {
            if (m26045s()) {
                return m26037e(z);
            }
            return m26038f();
        }

        /* renamed from: h */
        public final int mo49415h() {
            return this.indexInArray;
        }

        /* renamed from: i */
        public final Object mo49416i() {
            return this.nextParkedWorker;
        }

        /* renamed from: m */
        public final int mo49417m(int i) {
            int i2 = this.f18732g;
            int i3 = i2 ^ (i2 << 13);
            int i4 = i3 ^ (i3 >> 17);
            int i5 = i4 ^ (i4 << 5);
            this.f18732g = i5;
            int i6 = i - 1;
            if ((i6 & i) == 0) {
                return i5 & i6;
            }
            return (i5 & Integer.MAX_VALUE) % i;
        }

        /* renamed from: q */
        public final void mo49418q(int i) {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append(C11987a.this.f18721e);
            sb.append("-worker-");
            if (i == 0) {
                str = "TERMINATED";
            } else {
                str = String.valueOf(i);
            }
            sb.append(str);
            setName(sb.toString());
            this.indexInArray = i;
        }

        /* renamed from: r */
        public final void mo49419r(Object obj) {
            this.nextParkedWorker = obj;
        }

        public void run() {
            m26044p();
        }

        /* renamed from: u */
        public final boolean mo49421u(C11991d dVar) {
            boolean z;
            C11991d dVar2 = this.f18729d;
            if (dVar2 == C11991d.CPU_ACQUIRED) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C11987a.f18715k.addAndGet(C11987a.this, 4398046511104L);
            }
            if (dVar2 != dVar) {
                this.f18729d = dVar;
            }
            return z;
        }

        public C11990c(C11987a aVar, int i) {
            this();
            mo49418q(i);
        }
    }
}
