package p255v6;

import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import p222s6.C9511f;

/* renamed from: v6.u */
/* compiled from: ExecutorUtils */
public final class C10021u {

    /* renamed from: v6.u$a */
    /* compiled from: ExecutorUtils */
    class C10022a implements ThreadFactory {

        /* renamed from: b */
        final /* synthetic */ String f15084b;

        /* renamed from: c */
        final /* synthetic */ AtomicLong f15085c;

        /* renamed from: v6.u$a$a */
        /* compiled from: ExecutorUtils */
        class C10023a extends C9964c {

            /* renamed from: b */
            final /* synthetic */ Runnable f15086b;

            C10023a(Runnable runnable) {
                this.f15086b = runnable;
            }

            /* renamed from: a */
            public void mo44516a() {
                this.f15086b.run();
            }
        }

        C10022a(String str, AtomicLong atomicLong) {
            this.f15084b = str;
            this.f15085c = atomicLong;
        }

        public Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(new C10023a(runnable));
            newThread.setName(this.f15084b + this.f15085c.getAndIncrement());
            return newThread;
        }
    }

    /* renamed from: v6.u$b */
    /* compiled from: ExecutorUtils */
    class C10024b extends C9964c {

        /* renamed from: b */
        final /* synthetic */ String f15088b;

        /* renamed from: c */
        final /* synthetic */ ExecutorService f15089c;

        /* renamed from: d */
        final /* synthetic */ long f15090d;

        /* renamed from: e */
        final /* synthetic */ TimeUnit f15091e;

        C10024b(String str, ExecutorService executorService, long j, TimeUnit timeUnit) {
            this.f15088b = str;
            this.f15089c = executorService;
            this.f15090d = j;
            this.f15091e = timeUnit;
        }

        /* renamed from: a */
        public void mo44516a() {
            try {
                C9511f f = C9511f.m19696f();
                f.mo43965b("Executing shutdown hook for " + this.f15088b);
                this.f15089c.shutdown();
                if (!this.f15089c.awaitTermination(this.f15090d, this.f15091e)) {
                    C9511f f2 = C9511f.m19696f();
                    f2.mo43965b(this.f15088b + " did not shut down in the allocated time. Requesting immediate shutdown.");
                    this.f15089c.shutdownNow();
                }
            } catch (InterruptedException unused) {
                C9511f.m19696f().mo43965b(String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", new Object[]{this.f15088b}));
                this.f15089c.shutdownNow();
            }
        }
    }

    /* renamed from: a */
    private static void m21018a(String str, ExecutorService executorService) {
        m21019b(str, executorService, 2, TimeUnit.SECONDS);
    }

    /* renamed from: b */
    private static void m21019b(String str, ExecutorService executorService, long j, TimeUnit timeUnit) {
        Runtime runtime = Runtime.getRuntime();
        C10024b bVar = new C10024b(str, executorService, j, timeUnit);
        runtime.addShutdownHook(new Thread(bVar, "Crashlytics Shutdown Hook for " + str));
    }

    /* renamed from: c */
    public static ExecutorService m21020c(String str) {
        ExecutorService e = m21022e(m21021d(str), new ThreadPoolExecutor.DiscardPolicy());
        m21018a(str, e);
        return e;
    }

    /* renamed from: d */
    public static ThreadFactory m21021d(String str) {
        return new C10022a(str, new AtomicLong(1));
    }

    /* renamed from: e */
    private static ExecutorService m21022e(ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        return Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactory, rejectedExecutionHandler));
    }
}
