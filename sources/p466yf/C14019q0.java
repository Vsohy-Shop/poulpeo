package p466yf;

import androidx.core.location.LocationRequestCompat;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p355hf.C12079g;
import p466yf.C13979i1;

@SourceDebugExtension({"SMAP\nDefaultExecutor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultExecutor.kt\nkotlinx/coroutines/DefaultExecutor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,186:1\n1#2:187\n*E\n"})
/* renamed from: yf.q0 */
/* compiled from: DefaultExecutor.kt */
public final class C14019q0 extends C13979i1 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: h */
    public static final C14019q0 f22942h;

    /* renamed from: i */
    private static final long f22943i;

    static {
        Long l;
        C14019q0 q0Var = new C14019q0();
        f22942h = q0Var;
        C13974h1.m32382z0(q0Var, false, 1, (Object) null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        f22943i = timeUnit.toNanos(l.longValue());
    }

    private C14019q0() {
    }

    /* renamed from: V0 */
    private final synchronized void m32526V0() {
        if (m32529Y0()) {
            debugStatus = 3;
            mo53761P0();
            C12775o.m28637g(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    /* renamed from: W0 */
    private final synchronized Thread m32527W0() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    /* renamed from: X0 */
    private final boolean m32528X0() {
        if (debugStatus == 4) {
            return true;
        }
        return false;
    }

    /* renamed from: Y0 */
    private final boolean m32529Y0() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: Z0 */
    private final synchronized boolean m32530Z0() {
        if (m32529Y0()) {
            return false;
        }
        debugStatus = 1;
        C12775o.m28637g(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return true;
    }

    /* renamed from: a1 */
    private final void m32531a1() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    /* access modifiers changed from: protected */
    /* renamed from: F0 */
    public Thread mo53742F0() {
        Thread thread = _thread;
        if (thread == null) {
            return m32527W0();
        }
        return thread;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G0 */
    public void mo53771G0(long j, C13979i1.C13982c cVar) {
        m32531a1();
    }

    /* renamed from: L0 */
    public void mo53759L0(Runnable runnable) {
        if (m32528X0()) {
            m32531a1();
        }
        super.mo53759L0(runnable);
    }

    /* renamed from: c */
    public C13943d1 mo49021c(long j, Runnable runnable, C12079g gVar) {
        return mo53763S0(j, runnable);
    }

    public void run() {
        C14047w2.f22961a.mo53814d(this);
        C13936c.m32231a();
        try {
            if (m32530Z0()) {
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long C0 = mo53751C0();
                    if (C0 == LocationRequestCompat.PASSIVE_INTERVAL) {
                        C13936c.m32231a();
                        long nanoTime = System.nanoTime();
                        if (j == LocationRequestCompat.PASSIVE_INTERVAL) {
                            j = f22943i + nanoTime;
                        }
                        long j2 = j - nanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            m32526V0();
                            C13936c.m32231a();
                            if (!mo53760N0()) {
                                mo53742F0();
                                return;
                            }
                            return;
                        }
                        C0 = C13537l.m30883j(C0, j2);
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (C0 > 0) {
                        if (m32529Y0()) {
                            _thread = null;
                            m32526V0();
                            C13936c.m32231a();
                            if (!mo53760N0()) {
                                mo53742F0();
                                return;
                            }
                            return;
                        }
                        C13936c.m32231a();
                        LockSupport.parkNanos(this, C0);
                    }
                }
            }
        } finally {
            _thread = null;
            m32526V0();
            C13936c.m32231a();
            if (!mo53760N0()) {
                mo53742F0();
            }
        }
    }

    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }
}
