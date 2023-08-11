package p453we;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p307af.C10885a;
import p341fe.C11962r;
import p361ie.C12141b;
import p361ie.C12142c;
import p391me.C12937c;
import p397ne.C13016b;

/* renamed from: we.k */
/* compiled from: TrampolineScheduler */
public final class C13718k extends C11962r {

    /* renamed from: b */
    private static final C13718k f22137b = new C13718k();

    /* renamed from: we.k$a */
    /* compiled from: TrampolineScheduler */
    static final class C13719a implements Runnable {

        /* renamed from: b */
        private final Runnable f22138b;

        /* renamed from: c */
        private final C13721c f22139c;

        /* renamed from: d */
        private final long f22140d;

        C13719a(Runnable runnable, C13721c cVar, long j) {
            this.f22138b = runnable;
            this.f22139c = cVar;
            this.f22140d = j;
        }

        public void run() {
            if (!this.f22139c.f22148e) {
                long a = this.f22139c.mo49266a(TimeUnit.MILLISECONDS);
                long j = this.f22140d;
                if (j > a) {
                    try {
                        Thread.sleep(j - a);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        C10885a.m23270q(e);
                        return;
                    }
                }
                if (!this.f22139c.f22148e) {
                    this.f22138b.run();
                }
            }
        }
    }

    /* renamed from: we.k$b */
    /* compiled from: TrampolineScheduler */
    static final class C13720b implements Comparable<C13720b> {

        /* renamed from: b */
        final Runnable f22141b;

        /* renamed from: c */
        final long f22142c;

        /* renamed from: d */
        final int f22143d;

        /* renamed from: e */
        volatile boolean f22144e;

        C13720b(Runnable runnable, Long l, int i) {
            this.f22141b = runnable;
            this.f22142c = l.longValue();
            this.f22143d = i;
        }

        /* renamed from: a */
        public int compareTo(C13720b bVar) {
            int b = C13016b.m29388b(this.f22142c, bVar.f22142c);
            if (b == 0) {
                return C13016b.m29387a(this.f22143d, bVar.f22143d);
            }
            return b;
        }
    }

    /* renamed from: we.k$c */
    /* compiled from: TrampolineScheduler */
    static final class C13721c extends C11962r.C11964b {

        /* renamed from: b */
        final PriorityBlockingQueue<C13720b> f22145b = new PriorityBlockingQueue<>();

        /* renamed from: c */
        private final AtomicInteger f22146c = new AtomicInteger();

        /* renamed from: d */
        final AtomicInteger f22147d = new AtomicInteger();

        /* renamed from: e */
        volatile boolean f22148e;

        /* renamed from: we.k$c$a */
        /* compiled from: TrampolineScheduler */
        final class C13722a implements Runnable {

            /* renamed from: b */
            final C13720b f22149b;

            C13722a(C13720b bVar) {
                this.f22149b = bVar;
            }

            public void run() {
                this.f22149b.f22144e = true;
                C13721c.this.f22145b.remove(this.f22149b);
            }
        }

        C13721c() {
        }

        /* renamed from: b */
        public C12141b mo49267b(Runnable runnable) {
            return mo53393d(runnable, mo49266a(TimeUnit.MILLISECONDS));
        }

        /* renamed from: c */
        public C12141b mo49268c(Runnable runnable, long j, TimeUnit timeUnit) {
            long a = mo49266a(TimeUnit.MILLISECONDS) + timeUnit.toMillis(j);
            return mo53393d(new C13719a(runnable, this, a), a);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public C12141b mo53393d(Runnable runnable, long j) {
            if (this.f22148e) {
                return C12937c.INSTANCE;
            }
            C13720b bVar = new C13720b(runnable, Long.valueOf(j), this.f22147d.incrementAndGet());
            this.f22145b.add(bVar);
            if (this.f22146c.getAndIncrement() != 0) {
                return C12142c.m26482c(new C13722a(bVar));
            }
            int i = 1;
            while (!this.f22148e) {
                C13720b poll = this.f22145b.poll();
                if (poll == null) {
                    i = this.f22146c.addAndGet(-i);
                    if (i == 0) {
                        return C12937c.INSTANCE;
                    }
                } else if (!poll.f22144e) {
                    poll.f22141b.run();
                }
            }
            this.f22145b.clear();
            return C12937c.INSTANCE;
        }

        public void dispose() {
            this.f22148e = true;
        }

        public boolean isDisposed() {
            return this.f22148e;
        }
    }

    C13718k() {
    }

    /* renamed from: d */
    public static C13718k m31403d() {
        return f22137b;
    }

    /* renamed from: a */
    public C11962r.C11964b mo49262a() {
        return new C13721c();
    }

    /* renamed from: b */
    public C12141b mo49263b(Runnable runnable) {
        C10885a.m23272s(runnable).run();
        return C12937c.INSTANCE;
    }

    /* renamed from: c */
    public C12141b mo49264c(Runnable runnable, long j, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(j);
            C10885a.m23272s(runnable).run();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            C10885a.m23270q(e);
        }
        return C12937c.INSTANCE;
    }
}
