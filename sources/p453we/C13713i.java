package p453we;

import androidx.compose.animation.core.C0344a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: we.i */
/* compiled from: SchedulerPoolFactory */
public final class C13713i {

    /* renamed from: a */
    public static final boolean f22124a;

    /* renamed from: b */
    public static final int f22125b;

    /* renamed from: c */
    static final AtomicReference<ScheduledExecutorService> f22126c = new AtomicReference<>();

    /* renamed from: d */
    static final Map<ScheduledThreadPoolExecutor, Object> f22127d = new ConcurrentHashMap();

    /* renamed from: we.i$a */
    /* compiled from: SchedulerPoolFactory */
    static final class C13714a {

        /* renamed from: a */
        boolean f22128a;

        /* renamed from: b */
        int f22129b;

        C13714a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo53388a(Properties properties) {
            if (properties.containsKey("rx2.purge-enabled")) {
                this.f22128a = Boolean.parseBoolean(properties.getProperty("rx2.purge-enabled"));
            } else {
                this.f22128a = true;
            }
            if (!this.f22128a || !properties.containsKey("rx2.purge-period-seconds")) {
                this.f22129b = 1;
                return;
            }
            try {
                this.f22129b = Integer.parseInt(properties.getProperty("rx2.purge-period-seconds"));
            } catch (NumberFormatException unused) {
                this.f22129b = 1;
            }
        }
    }

    /* renamed from: we.i$b */
    /* compiled from: SchedulerPoolFactory */
    static final class C13715b implements Runnable {
        C13715b() {
        }

        public void run() {
            Iterator it = new ArrayList(C13713i.f22127d.keySet()).iterator();
            while (it.hasNext()) {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) it.next();
                if (scheduledThreadPoolExecutor.isShutdown()) {
                    C13713i.f22127d.remove(scheduledThreadPoolExecutor);
                } else {
                    scheduledThreadPoolExecutor.purge();
                }
            }
        }
    }

    static {
        Properties properties = System.getProperties();
        C13714a aVar = new C13714a();
        aVar.mo53388a(properties);
        f22124a = aVar.f22128a;
        f22125b = aVar.f22129b;
        m31395b();
    }

    /* renamed from: a */
    public static ScheduledExecutorService m31394a(ThreadFactory threadFactory) {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        m31396c(f22124a, newScheduledThreadPool);
        return newScheduledThreadPool;
    }

    /* renamed from: b */
    public static void m31395b() {
        m31397d(f22124a);
    }

    /* renamed from: c */
    static void m31396c(boolean z, ScheduledExecutorService scheduledExecutorService) {
        if (z && (scheduledExecutorService instanceof ScheduledThreadPoolExecutor)) {
            f22127d.put((ScheduledThreadPoolExecutor) scheduledExecutorService, scheduledExecutorService);
        }
    }

    /* renamed from: d */
    static void m31397d(boolean z) {
        if (z) {
            while (true) {
                AtomicReference<ScheduledExecutorService> atomicReference = f22126c;
                ScheduledExecutorService scheduledExecutorService = atomicReference.get();
                if (scheduledExecutorService == null) {
                    ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, new C13709f("RxSchedulerPurge"));
                    if (C0344a.m496a(atomicReference, scheduledExecutorService, newScheduledThreadPool)) {
                        C13715b bVar = new C13715b();
                        int i = f22125b;
                        newScheduledThreadPool.scheduleAtFixedRate(bVar, (long) i, (long) i, TimeUnit.SECONDS);
                        return;
                    }
                    newScheduledThreadPool.shutdownNow();
                } else {
                    return;
                }
            }
        }
    }
}
