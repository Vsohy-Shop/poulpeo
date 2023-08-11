package p453we;

import androidx.compose.animation.core.C0344a;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p341fe.C11962r;
import p361ie.C12140a;
import p361ie.C12141b;
import p391me.C12937c;
import p391me.C12938d;

/* renamed from: we.b */
/* compiled from: ComputationScheduler */
public final class C13699b extends C11962r {

    /* renamed from: d */
    static final C13701b f22080d;

    /* renamed from: e */
    static final C13709f f22081e;

    /* renamed from: f */
    static final int f22082f = m31368d(Runtime.getRuntime().availableProcessors(), Integer.getInteger("rx2.computation-threads", 0).intValue());

    /* renamed from: g */
    static final C13702c f22083g;

    /* renamed from: b */
    final ThreadFactory f22084b;

    /* renamed from: c */
    final AtomicReference<C13701b> f22085c;

    /* renamed from: we.b$a */
    /* compiled from: ComputationScheduler */
    static final class C13700a extends C11962r.C11964b {

        /* renamed from: b */
        private final C12938d f22086b;

        /* renamed from: c */
        private final C12140a f22087c;

        /* renamed from: d */
        private final C12938d f22088d;

        /* renamed from: e */
        private final C13702c f22089e;

        /* renamed from: f */
        volatile boolean f22090f;

        C13700a(C13702c cVar) {
            this.f22089e = cVar;
            C12938d dVar = new C12938d();
            this.f22086b = dVar;
            C12140a aVar = new C12140a();
            this.f22087c = aVar;
            C12938d dVar2 = new C12938d();
            this.f22088d = dVar2;
            dVar2.mo49583c(dVar);
            dVar2.mo49583c(aVar);
        }

        /* renamed from: b */
        public C12141b mo49267b(Runnable runnable) {
            if (this.f22090f) {
                return C12937c.INSTANCE;
            }
            return this.f22089e.mo53378d(runnable, 0, TimeUnit.MILLISECONDS, this.f22086b);
        }

        /* renamed from: c */
        public C12141b mo49268c(Runnable runnable, long j, TimeUnit timeUnit) {
            if (this.f22090f) {
                return C12937c.INSTANCE;
            }
            return this.f22089e.mo53378d(runnable, j, timeUnit, this.f22087c);
        }

        public void dispose() {
            if (!this.f22090f) {
                this.f22090f = true;
                this.f22088d.dispose();
            }
        }

        public boolean isDisposed() {
            return this.f22090f;
        }
    }

    /* renamed from: we.b$b */
    /* compiled from: ComputationScheduler */
    static final class C13701b {

        /* renamed from: a */
        final int f22091a;

        /* renamed from: b */
        final C13702c[] f22092b;

        /* renamed from: c */
        long f22093c;

        C13701b(int i, ThreadFactory threadFactory) {
            this.f22091a = i;
            this.f22092b = new C13702c[i];
            for (int i2 = 0; i2 < i; i2++) {
                this.f22092b[i2] = new C13702c(threadFactory);
            }
        }

        /* renamed from: a */
        public C13702c mo53367a() {
            int i = this.f22091a;
            if (i == 0) {
                return C13699b.f22083g;
            }
            C13702c[] cVarArr = this.f22092b;
            long j = this.f22093c;
            this.f22093c = 1 + j;
            return cVarArr[(int) (j % ((long) i))];
        }

        /* renamed from: b */
        public void mo53368b() {
            for (C13702c dispose : this.f22092b) {
                dispose.dispose();
            }
        }
    }

    /* renamed from: we.b$c */
    /* compiled from: ComputationScheduler */
    static final class C13702c extends C13708e {
        C13702c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    static {
        C13702c cVar = new C13702c(new C13709f("RxComputationShutdown"));
        f22083g = cVar;
        cVar.dispose();
        C13709f fVar = new C13709f("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())), true);
        f22081e = fVar;
        C13701b bVar = new C13701b(0, fVar);
        f22080d = bVar;
        bVar.mo53368b();
    }

    public C13699b() {
        this(f22081e);
    }

    /* renamed from: d */
    static int m31368d(int i, int i2) {
        if (i2 <= 0 || i2 > i) {
            return i;
        }
        return i2;
    }

    /* renamed from: a */
    public C11962r.C11964b mo49262a() {
        return new C13700a(this.f22085c.get().mo53367a());
    }

    /* renamed from: c */
    public C12141b mo49264c(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.f22085c.get().mo53367a().mo53379e(runnable, j, timeUnit);
    }

    /* renamed from: e */
    public void mo53366e() {
        C13701b bVar = new C13701b(f22082f, this.f22084b);
        if (!C0344a.m496a(this.f22085c, f22080d, bVar)) {
            bVar.mo53368b();
        }
    }

    public C13699b(ThreadFactory threadFactory) {
        this.f22084b = threadFactory;
        this.f22085c = new AtomicReference<>(f22080d);
        mo53366e();
    }
}
