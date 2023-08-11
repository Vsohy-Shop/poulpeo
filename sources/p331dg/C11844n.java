package p331dg;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p355hf.C12079g;
import p355hf.C12085h;
import p466yf.C13943d1;
import p466yf.C13971h0;
import p466yf.C13986j0;
import p466yf.C14002n;
import p466yf.C14023r0;
import p466yf.C14035u0;

@SourceDebugExtension({"SMAP\nLimitedDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LimitedDispatcher.kt\nkotlinx/coroutines/internal/LimitedDispatcher\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n*L\n1#1,134:1\n66#1,8:135\n66#1,8:143\n28#2,4:151\n28#2,4:156\n20#3:155\n20#3:160\n*S KotlinDebug\n*F\n+ 1 LimitedDispatcher.kt\nkotlinx/coroutines/internal/LimitedDispatcher\n*L\n48#1:135,8\n55#1:143,8\n79#1:151,4\n92#1:156,4\n79#1:155\n92#1:160\n*E\n"})
/* renamed from: dg.n */
/* compiled from: LimitedDispatcher.kt */
public final class C11844n extends C13971h0 implements C14035u0 {

    /* renamed from: g */
    private static final AtomicIntegerFieldUpdater f18495g = AtomicIntegerFieldUpdater.newUpdater(C11844n.class, "runningWorkers");
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C13971h0 f18496b;

    /* renamed from: c */
    private final int f18497c;

    /* renamed from: d */
    private final /* synthetic */ C14035u0 f18498d;

    /* renamed from: e */
    private final C11854s<Runnable> f18499e;

    /* renamed from: f */
    private final Object f18500f;
    private volatile int runningWorkers;

    /* renamed from: dg.n$a */
    /* compiled from: LimitedDispatcher.kt */
    private final class C11845a implements Runnable {

        /* renamed from: b */
        private Runnable f18501b;

        public C11845a(Runnable runnable) {
            this.f18501b = runnable;
        }

        public void run() {
            int i = 0;
            while (true) {
                try {
                    this.f18501b.run();
                } catch (Throwable th) {
                    C13986j0.m32424a(C12085h.f18916b, th);
                }
                Runnable u0 = C11844n.this.m25523v0();
                if (u0 != null) {
                    this.f18501b = u0;
                    i++;
                    if (i >= 16 && C11844n.this.f18496b.isDispatchNeeded(C11844n.this)) {
                        C11844n.this.f18496b.dispatch(C11844n.this, this);
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }

    public C11844n(C13971h0 h0Var, int i) {
        C14035u0 u0Var;
        this.f18496b = h0Var;
        this.f18497c = i;
        if (h0Var instanceof C14035u0) {
            u0Var = (C14035u0) h0Var;
        } else {
            u0Var = null;
        }
        this.f18498d = u0Var == null ? C14023r0.m32538a() : u0Var;
        this.f18499e = new C11854s<>(false);
        this.f18500f = new Object();
    }

    /* access modifiers changed from: private */
    /* renamed from: v0 */
    public final Runnable m25523v0() {
        while (true) {
            Runnable d = this.f18499e.mo49045d();
            if (d != null) {
                return d;
            }
            synchronized (this.f18500f) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f18495g;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f18499e.mo49044c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    /* renamed from: w0 */
    private final boolean m25524w0() {
        synchronized (this.f18500f) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f18495g;
            if (atomicIntegerFieldUpdater.get(this) >= this.f18497c) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    /* renamed from: b */
    public void mo49020b(long j, C14002n<? super C11921v> nVar) {
        this.f18498d.mo49020b(j, nVar);
    }

    /* renamed from: c */
    public C13943d1 mo49021c(long j, Runnable runnable, C12079g gVar) {
        return this.f18498d.mo49021c(j, runnable, gVar);
    }

    public void dispatch(C12079g gVar, Runnable runnable) {
        Runnable v0;
        this.f18499e.mo49042a(runnable);
        if (f18495g.get(this) < this.f18497c && m25524w0() && (v0 = m25523v0()) != null) {
            this.f18496b.dispatch(this, new C11845a(v0));
        }
    }

    public void dispatchYield(C12079g gVar, Runnable runnable) {
        Runnable v0;
        this.f18499e.mo49042a(runnable);
        if (f18495g.get(this) < this.f18497c && m25524w0() && (v0 = m25523v0()) != null) {
            this.f18496b.dispatchYield(this, new C11845a(v0));
        }
    }

    public C13971h0 limitedParallelism(int i) {
        C11847o.m25529a(i);
        if (i >= this.f18497c) {
            return this;
        }
        return super.limitedParallelism(i);
    }
}
