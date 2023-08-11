package p458xd;

import androidx.compose.animation.core.C0344a;
import java.lang.Thread;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p111h6.C8012n;

/* renamed from: xd.j0 */
/* compiled from: SynchronizationContext */
public final class C13805j0 implements Executor {

    /* renamed from: b */
    private final Thread.UncaughtExceptionHandler f22252b;

    /* renamed from: c */
    private final Queue<Runnable> f22253c = new ConcurrentLinkedQueue();

    /* renamed from: d */
    private final AtomicReference<Thread> f22254d = new AtomicReference<>();

    /* renamed from: xd.j0$a */
    /* compiled from: SynchronizationContext */
    class C13806a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ C13807b f22255b;

        /* renamed from: c */
        final /* synthetic */ Runnable f22256c;

        C13806a(C13807b bVar, Runnable runnable) {
            this.f22255b = bVar;
            this.f22256c = runnable;
        }

        public void run() {
            C13805j0.this.execute(this.f22255b);
        }

        public String toString() {
            return this.f22256c.toString() + "(scheduled in SynchronizationContext)";
        }
    }

    /* renamed from: xd.j0$b */
    /* compiled from: SynchronizationContext */
    private static class C13807b implements Runnable {

        /* renamed from: b */
        final Runnable f22258b;

        /* renamed from: c */
        boolean f22259c;

        /* renamed from: d */
        boolean f22260d;

        C13807b(Runnable runnable) {
            this.f22258b = (Runnable) C8012n.m15756o(runnable, "task");
        }

        public void run() {
            if (!this.f22259c) {
                this.f22260d = true;
                this.f22258b.run();
            }
        }
    }

    /* renamed from: xd.j0$c */
    /* compiled from: SynchronizationContext */
    public static final class C13808c {

        /* renamed from: a */
        private final C13807b f22261a;

        /* renamed from: b */
        private final ScheduledFuture<?> f22262b;

        /* synthetic */ C13808c(C13807b bVar, ScheduledFuture scheduledFuture, C13806a aVar) {
            this(bVar, scheduledFuture);
        }

        /* renamed from: a */
        public void mo53463a() {
            this.f22261a.f22259c = true;
            this.f22262b.cancel(false);
        }

        /* renamed from: b */
        public boolean mo53464b() {
            C13807b bVar = this.f22261a;
            if (bVar.f22260d || bVar.f22259c) {
                return false;
            }
            return true;
        }

        private C13808c(C13807b bVar, ScheduledFuture<?> scheduledFuture) {
            this.f22261a = (C13807b) C8012n.m15756o(bVar, "runnable");
            this.f22262b = (ScheduledFuture) C8012n.m15756o(scheduledFuture, "future");
        }
    }

    public C13805j0(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f22252b = (Thread.UncaughtExceptionHandler) C8012n.m15756o(uncaughtExceptionHandler, "uncaughtExceptionHandler");
    }

    /* renamed from: a */
    public final void mo53455a() {
        while (C0344a.m496a(this.f22254d, (Object) null, Thread.currentThread())) {
            while (true) {
                try {
                    Runnable poll = this.f22253c.poll();
                    if (poll != null) {
                        poll.run();
                    } else {
                        this.f22254d.set((Object) null);
                        if (this.f22253c.isEmpty()) {
                            return;
                        }
                    }
                } catch (Throwable th) {
                    this.f22254d.set((Object) null);
                    throw th;
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo53456b(Runnable runnable) {
        this.f22253c.add(C8012n.m15756o(runnable, "runnable is null"));
    }

    /* renamed from: c */
    public final C13808c mo53457c(Runnable runnable, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        C13807b bVar = new C13807b(runnable);
        return new C13808c(bVar, scheduledExecutorService.schedule(new C13806a(bVar, runnable), j, timeUnit), (C13806a) null);
    }

    /* renamed from: d */
    public void mo53458d() {
        boolean z;
        if (Thread.currentThread() == this.f22254d.get()) {
            z = true;
        } else {
            z = false;
        }
        C8012n.m15762u(z, "Not called from the SynchronizationContext");
    }

    public final void execute(Runnable runnable) {
        mo53456b(runnable);
        mo53455a();
    }
}
