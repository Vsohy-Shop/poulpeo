package p364io.grpc.internal;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import p458xd.C13780c0;

/* renamed from: io.grpc.internal.i1 */
/* compiled from: ManagedChannelOrphanWrapper */
final class C12322i1 extends C12361m0 {

    /* renamed from: c */
    private static final ReferenceQueue<C12322i1> f19539c = new ReferenceQueue<>();

    /* renamed from: d */
    private static final ConcurrentMap<C12323a, C12323a> f19540d = new ConcurrentHashMap();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final Logger f19541e = Logger.getLogger(C12322i1.class.getName());

    /* renamed from: b */
    private final C12323a f19542b;

    /* renamed from: io.grpc.internal.i1$a */
    /* compiled from: ManagedChannelOrphanWrapper */
    static final class C12323a extends WeakReference<C12322i1> {

        /* renamed from: f */
        private static final boolean f19543f = Boolean.parseBoolean(System.getProperty("io.grpc.ManagedChannel.enableAllocationTracking", "true"));

        /* renamed from: g */
        private static final RuntimeException f19544g = m27051c();

        /* renamed from: a */
        private final ReferenceQueue<C12322i1> f19545a;

        /* renamed from: b */
        private final ConcurrentMap<C12323a, C12323a> f19546b;

        /* renamed from: c */
        private final String f19547c;

        /* renamed from: d */
        private final Reference<RuntimeException> f19548d;

        /* renamed from: e */
        private final AtomicBoolean f19549e = new AtomicBoolean();

        C12323a(C12322i1 i1Var, C13780c0 c0Var, ReferenceQueue<C12322i1> referenceQueue, ConcurrentMap<C12323a, C12323a> concurrentMap) {
            super(i1Var, referenceQueue);
            RuntimeException runtimeException;
            if (f19543f) {
                runtimeException = new RuntimeException("ManagedChannel allocation site");
            } else {
                runtimeException = f19544g;
            }
            this.f19548d = new SoftReference(runtimeException);
            this.f19547c = c0Var.toString();
            this.f19545a = referenceQueue;
            this.f19546b = concurrentMap;
            concurrentMap.put(this, this);
            m27049a(referenceQueue);
        }

        /* renamed from: a */
        static int m27049a(ReferenceQueue<C12322i1> referenceQueue) {
            int i = 0;
            while (true) {
                C12323a aVar = (C12323a) referenceQueue.poll();
                if (aVar == null) {
                    return i;
                }
                RuntimeException runtimeException = aVar.f19548d.get();
                aVar.m27050b();
                if (!aVar.f19549e.get()) {
                    i++;
                    Level level = Level.SEVERE;
                    if (C12322i1.f19541e.isLoggable(level)) {
                        LogRecord logRecord = new LogRecord(level, "*~*~*~ Channel {0} was not shutdown properly!!! ~*~*~*" + System.getProperty("line.separator") + "    Make sure to call shutdown()/shutdownNow() and wait until awaitTermination() returns true.");
                        logRecord.setLoggerName(C12322i1.f19541e.getName());
                        logRecord.setParameters(new Object[]{aVar.f19547c});
                        logRecord.setThrown(runtimeException);
                        C12322i1.f19541e.log(logRecord);
                    }
                }
            }
        }

        /* renamed from: b */
        private void m27050b() {
            super.clear();
            this.f19546b.remove(this);
            this.f19548d.clear();
        }

        /* renamed from: c */
        private static RuntimeException m27051c() {
            RuntimeException runtimeException = new RuntimeException("ManagedChannel allocation site not recorded.  Set -Dio.grpc.ManagedChannel.enableAllocationTracking=true to enable it");
            runtimeException.setStackTrace(new StackTraceElement[0]);
            return runtimeException;
        }

        public void clear() {
            m27050b();
            m27049a(this.f19545a);
        }
    }

    C12322i1(C13780c0 c0Var) {
        this(c0Var, f19539c, f19540d);
    }

    C12322i1(C13780c0 c0Var, ReferenceQueue<C12322i1> referenceQueue, ConcurrentMap<C12323a, C12323a> concurrentMap) {
        super(c0Var);
        this.f19542b = new C12323a(this, c0Var, referenceQueue, concurrentMap);
    }
}
