package p341fe;

import java.util.concurrent.TimeUnit;
import p307af.C10885a;
import p361ie.C12141b;
import p453we.C13708e;

/* renamed from: fe.r */
/* compiled from: Scheduler */
public abstract class C11962r {

    /* renamed from: a */
    static final long f18673a = TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15).longValue());

    /* renamed from: fe.r$a */
    /* compiled from: Scheduler */
    static final class C11963a implements C12141b, Runnable {

        /* renamed from: b */
        final Runnable f18674b;

        /* renamed from: c */
        final C11964b f18675c;

        /* renamed from: d */
        Thread f18676d;

        C11963a(Runnable runnable, C11964b bVar) {
            this.f18674b = runnable;
            this.f18675c = bVar;
        }

        public void dispose() {
            if (this.f18676d == Thread.currentThread()) {
                C11964b bVar = this.f18675c;
                if (bVar instanceof C13708e) {
                    ((C13708e) bVar).mo53380f();
                    return;
                }
            }
            this.f18675c.dispose();
        }

        public boolean isDisposed() {
            return this.f18675c.isDisposed();
        }

        public void run() {
            this.f18676d = Thread.currentThread();
            try {
                this.f18674b.run();
            } finally {
                dispose();
                this.f18676d = null;
            }
        }
    }

    /* renamed from: fe.r$b */
    /* compiled from: Scheduler */
    public static abstract class C11964b implements C12141b {
        /* renamed from: a */
        public long mo49266a(TimeUnit timeUnit) {
            return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        /* renamed from: b */
        public C12141b mo49267b(Runnable runnable) {
            return mo49268c(runnable, 0, TimeUnit.NANOSECONDS);
        }

        /* renamed from: c */
        public abstract C12141b mo49268c(Runnable runnable, long j, TimeUnit timeUnit);
    }

    /* renamed from: a */
    public abstract C11964b mo49262a();

    /* renamed from: b */
    public C12141b mo49263b(Runnable runnable) {
        return mo49264c(runnable, 0, TimeUnit.NANOSECONDS);
    }

    /* renamed from: c */
    public C12141b mo49264c(Runnable runnable, long j, TimeUnit timeUnit) {
        C11964b a = mo49262a();
        C11963a aVar = new C11963a(C10885a.m23272s(runnable), a);
        a.mo49268c(aVar, j, timeUnit);
        return aVar;
    }
}
