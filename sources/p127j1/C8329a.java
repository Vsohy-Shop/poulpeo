package p127j1;

import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.rmn.apiclient.impl.api.call.APIParams;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: j1.a */
/* compiled from: GlideExecutor */
public final class C8329a implements ExecutorService {

    /* renamed from: c */
    private static final long f11724c = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: d */
    private static volatile int f11725d;

    /* renamed from: b */
    private final ExecutorService f11726b;

    /* renamed from: j1.a$a */
    /* compiled from: GlideExecutor */
    public static final class C8330a {

        /* renamed from: a */
        private final boolean f11727a;

        /* renamed from: b */
        private int f11728b;

        /* renamed from: c */
        private int f11729c;
        @NonNull

        /* renamed from: d */
        private C8333c f11730d = C8333c.f11741d;

        /* renamed from: e */
        private String f11731e;

        /* renamed from: f */
        private long f11732f;

        C8330a(boolean z) {
            this.f11727a = z;
        }

        /* renamed from: a */
        public C8329a mo42283a() {
            if (!TextUtils.isEmpty(this.f11731e)) {
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(this.f11728b, this.f11729c, this.f11732f, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new C8331b(this.f11731e, this.f11730d, this.f11727a));
                if (this.f11732f != 0) {
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                }
                return new C8329a(threadPoolExecutor);
            }
            throw new IllegalArgumentException("Name must be non-null and non-empty, but given: " + this.f11731e);
        }

        /* renamed from: b */
        public C8330a mo42284b(String str) {
            this.f11731e = str;
            return this;
        }

        /* renamed from: c */
        public C8330a mo42285c(@IntRange(from = 1) int i) {
            this.f11728b = i;
            this.f11729c = i;
            return this;
        }
    }

    /* renamed from: j1.a$b */
    /* compiled from: GlideExecutor */
    private static final class C8331b implements ThreadFactory {

        /* renamed from: b */
        private final String f11733b;

        /* renamed from: c */
        final C8333c f11734c;

        /* renamed from: d */
        final boolean f11735d;

        /* renamed from: e */
        private int f11736e;

        /* renamed from: j1.a$b$a */
        /* compiled from: GlideExecutor */
        class C8332a extends Thread {
            C8332a(Runnable runnable, String str) {
                super(runnable, str);
            }

            public void run() {
                Process.setThreadPriority(9);
                if (C8331b.this.f11735d) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    super.run();
                } catch (Throwable th) {
                    C8331b.this.f11734c.mo42288a(th);
                }
            }
        }

        C8331b(String str, C8333c cVar, boolean z) {
            this.f11733b = str;
            this.f11734c = cVar;
            this.f11735d = z;
        }

        public synchronized Thread newThread(@NonNull Runnable runnable) {
            C8332a aVar;
            aVar = new C8332a(runnable, "glide-" + this.f11733b + "-thread-" + this.f11736e);
            this.f11736e = this.f11736e + 1;
            return aVar;
        }
    }

    @VisibleForTesting
    C8329a(ExecutorService executorService) {
        this.f11726b = executorService;
    }

    /* renamed from: a */
    public static int m16534a() {
        if (f11725d == 0) {
            f11725d = Math.min(4, C8337b.m16549a());
        }
        return f11725d;
    }

    /* renamed from: b */
    public static C8330a m16535b() {
        int i;
        if (m16534a() >= 4) {
            i = 2;
        } else {
            i = 1;
        }
        return new C8330a(true).mo42285c(i).mo42284b("animation");
    }

    /* renamed from: c */
    public static C8329a m16536c() {
        return m16535b().mo42283a();
    }

    /* renamed from: d */
    public static C8330a m16537d() {
        return new C8330a(true).mo42285c(1).mo42284b("disk-cache");
    }

    /* renamed from: e */
    public static C8329a m16538e() {
        return m16537d().mo42283a();
    }

    /* renamed from: f */
    public static C8330a m16539f() {
        return new C8330a(false).mo42285c(m16534a()).mo42284b(APIParams.SOURCE);
    }

    /* renamed from: g */
    public static C8329a m16540g() {
        return m16539f().mo42283a();
    }

    /* renamed from: h */
    public static C8329a m16541h() {
        return new C8329a(new ThreadPoolExecutor(0, Integer.MAX_VALUE, f11724c, TimeUnit.MILLISECONDS, new SynchronousQueue(), new C8331b("source-unlimited", C8333c.f11741d, false)));
    }

    public boolean awaitTermination(long j, @NonNull TimeUnit timeUnit) {
        return this.f11726b.awaitTermination(j, timeUnit);
    }

    public void execute(@NonNull Runnable runnable) {
        this.f11726b.execute(runnable);
    }

    @NonNull
    public <T> List<Future<T>> invokeAll(@NonNull Collection<? extends Callable<T>> collection) {
        return this.f11726b.invokeAll(collection);
    }

    @NonNull
    public <T> T invokeAny(@NonNull Collection<? extends Callable<T>> collection) {
        return this.f11726b.invokeAny(collection);
    }

    public boolean isShutdown() {
        return this.f11726b.isShutdown();
    }

    public boolean isTerminated() {
        return this.f11726b.isTerminated();
    }

    public void shutdown() {
        this.f11726b.shutdown();
    }

    @NonNull
    public List<Runnable> shutdownNow() {
        return this.f11726b.shutdownNow();
    }

    @NonNull
    public Future<?> submit(@NonNull Runnable runnable) {
        return this.f11726b.submit(runnable);
    }

    public String toString() {
        return this.f11726b.toString();
    }

    @NonNull
    public <T> List<Future<T>> invokeAll(@NonNull Collection<? extends Callable<T>> collection, long j, @NonNull TimeUnit timeUnit) {
        return this.f11726b.invokeAll(collection, j, timeUnit);
    }

    public <T> T invokeAny(@NonNull Collection<? extends Callable<T>> collection, long j, @NonNull TimeUnit timeUnit) {
        return this.f11726b.invokeAny(collection, j, timeUnit);
    }

    @NonNull
    public <T> Future<T> submit(@NonNull Runnable runnable, T t) {
        return this.f11726b.submit(runnable, t);
    }

    public <T> Future<T> submit(@NonNull Callable<T> callable) {
        return this.f11726b.submit(callable);
    }

    /* renamed from: j1.a$c */
    /* compiled from: GlideExecutor */
    public interface C8333c {

        /* renamed from: a */
        public static final C8333c f11738a = new C8334a();

        /* renamed from: b */
        public static final C8333c f11739b;

        /* renamed from: c */
        public static final C8333c f11740c = new C8336c();

        /* renamed from: d */
        public static final C8333c f11741d;

        /* renamed from: j1.a$c$b */
        /* compiled from: GlideExecutor */
        class C8335b implements C8333c {
            C8335b() {
            }

            /* renamed from: a */
            public void mo42288a(Throwable th) {
                if (th != null && Log.isLoggable("GlideExecutor", 6)) {
                    Log.e("GlideExecutor", "Request threw uncaught throwable", th);
                }
            }
        }

        /* renamed from: j1.a$c$c */
        /* compiled from: GlideExecutor */
        class C8336c implements C8333c {
            C8336c() {
            }

            /* renamed from: a */
            public void mo42288a(Throwable th) {
                if (th != null) {
                    throw new RuntimeException("Request threw uncaught throwable", th);
                }
            }
        }

        static {
            C8335b bVar = new C8335b();
            f11739b = bVar;
            f11741d = bVar;
        }

        /* renamed from: a */
        void mo42288a(Throwable th);

        /* renamed from: j1.a$c$a */
        /* compiled from: GlideExecutor */
        class C8334a implements C8333c {
            C8334a() {
            }

            /* renamed from: a */
            public void mo42288a(Throwable th) {
            }
        }
    }
}
