package p364io.grpc.internal;

import com.appboy.Constants;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;
import p111h6.C8012n;

/* renamed from: io.grpc.internal.d2 */
/* compiled from: SerializingExecutor */
public final class C12236d2 implements Executor, Runnable {

    /* renamed from: e */
    private static final Logger f19274e = Logger.getLogger(C12236d2.class.getName());

    /* renamed from: f */
    private static final C12238b f19275f = m26788c();

    /* renamed from: b */
    private Executor f19276b;

    /* renamed from: c */
    private final Queue<Runnable> f19277c = new ConcurrentLinkedQueue();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public volatile int f19278d = 0;

    /* renamed from: io.grpc.internal.d2$b */
    /* compiled from: SerializingExecutor */
    private static abstract class C12238b {
        private C12238b() {
        }

        /* renamed from: a */
        public abstract boolean mo49800a(C12236d2 d2Var, int i, int i2);

        /* renamed from: b */
        public abstract void mo49801b(C12236d2 d2Var, int i);
    }

    /* renamed from: io.grpc.internal.d2$c */
    /* compiled from: SerializingExecutor */
    private static final class C12239c extends C12238b {

        /* renamed from: a */
        private final AtomicIntegerFieldUpdater<C12236d2> f19279a;

        /* renamed from: a */
        public boolean mo49800a(C12236d2 d2Var, int i, int i2) {
            return this.f19279a.compareAndSet(d2Var, i, i2);
        }

        /* renamed from: b */
        public void mo49801b(C12236d2 d2Var, int i) {
            this.f19279a.set(d2Var, i);
        }

        private C12239c(AtomicIntegerFieldUpdater<C12236d2> atomicIntegerFieldUpdater) {
            super();
            this.f19279a = atomicIntegerFieldUpdater;
        }
    }

    /* renamed from: io.grpc.internal.d2$d */
    /* compiled from: SerializingExecutor */
    private static final class C12240d extends C12238b {
        private C12240d() {
            super();
        }

        /* renamed from: a */
        public boolean mo49800a(C12236d2 d2Var, int i, int i2) {
            synchronized (d2Var) {
                if (d2Var.f19278d != i) {
                    return false;
                }
                int unused = d2Var.f19278d = i2;
                return true;
            }
        }

        /* renamed from: b */
        public void mo49801b(C12236d2 d2Var, int i) {
            synchronized (d2Var) {
                int unused = d2Var.f19278d = i;
            }
        }
    }

    public C12236d2(Executor executor) {
        C8012n.m15756o(executor, "'executor' must not be null.");
        this.f19276b = executor;
    }

    /* renamed from: c */
    private static C12238b m26788c() {
        try {
            return new C12239c(AtomicIntegerFieldUpdater.newUpdater(C12236d2.class, Constants.APPBOY_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE));
        } catch (Throwable th) {
            f19274e.log(Level.SEVERE, "FieldUpdaterAtomicHelper failed", th);
            return new C12240d();
        }
    }

    /* renamed from: d */
    private void m26789d(Runnable runnable) {
        if (f19275f.mo49800a(this, 0, -1)) {
            try {
                this.f19276b.execute(this);
            } catch (Throwable th) {
                if (runnable != null) {
                    this.f19277c.remove(runnable);
                }
                f19275f.mo49801b(this, 0);
                throw th;
            }
        }
    }

    public void execute(Runnable runnable) {
        this.f19277c.add(C8012n.m15756o(runnable, "'r' must not be null."));
        m26789d(runnable);
    }

    public void run() {
        Runnable poll;
        try {
            Executor executor = this.f19276b;
            while (executor == this.f19276b && (poll = this.f19277c.poll()) != null) {
                poll.run();
            }
            f19275f.mo49801b(this, 0);
            if (!this.f19277c.isEmpty()) {
                m26789d((Runnable) null);
            }
        } catch (RuntimeException e) {
            Logger logger = f19274e;
            Level level = Level.SEVERE;
            logger.log(level, "Exception while executing runnable " + poll, e);
        } catch (Throwable th) {
            f19275f.mo49801b(this, 0);
            throw th;
        }
    }
}
