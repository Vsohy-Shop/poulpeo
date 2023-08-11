package p354he;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.TimeUnit;
import p307af.C10885a;
import p341fe.C11962r;
import p361ie.C12141b;
import p361ie.C12142c;

/* renamed from: he.b */
/* compiled from: HandlerScheduler */
final class C12064b extends C11962r {

    /* renamed from: b */
    private final Handler f18898b;

    /* renamed from: he.b$a */
    /* compiled from: HandlerScheduler */
    private static final class C12065a extends C11962r.C11964b {

        /* renamed from: b */
        private final Handler f18899b;

        /* renamed from: c */
        private volatile boolean f18900c;

        C12065a(Handler handler) {
            this.f18899b = handler;
        }

        /* renamed from: c */
        public C12141b mo49268c(Runnable runnable, long j, TimeUnit timeUnit) {
            if (runnable == null) {
                throw new NullPointerException("run == null");
            } else if (timeUnit == null) {
                throw new NullPointerException("unit == null");
            } else if (this.f18900c) {
                return C12142c.m26480a();
            } else {
                C12066b bVar = new C12066b(this.f18899b, C10885a.m23272s(runnable));
                Message obtain = Message.obtain(this.f18899b, bVar);
                obtain.obj = this;
                this.f18899b.sendMessageDelayed(obtain, timeUnit.toMillis(j));
                if (!this.f18900c) {
                    return bVar;
                }
                this.f18899b.removeCallbacks(bVar);
                return C12142c.m26480a();
            }
        }

        public void dispose() {
            this.f18900c = true;
            this.f18899b.removeCallbacksAndMessages(this);
        }

        public boolean isDisposed() {
            return this.f18900c;
        }
    }

    /* renamed from: he.b$b */
    /* compiled from: HandlerScheduler */
    private static final class C12066b implements Runnable, C12141b {

        /* renamed from: b */
        private final Handler f18901b;

        /* renamed from: c */
        private final Runnable f18902c;

        /* renamed from: d */
        private volatile boolean f18903d;

        C12066b(Handler handler, Runnable runnable) {
            this.f18901b = handler;
            this.f18902c = runnable;
        }

        public void dispose() {
            this.f18903d = true;
            this.f18901b.removeCallbacks(this);
        }

        public boolean isDisposed() {
            return this.f18903d;
        }

        public void run() {
            try {
                this.f18902c.run();
            } catch (Throwable th) {
                C10885a.m23270q(th);
            }
        }
    }

    C12064b(Handler handler) {
        this.f18898b = handler;
    }

    /* renamed from: a */
    public C11962r.C11964b mo49262a() {
        return new C12065a(this.f18898b);
    }

    /* renamed from: c */
    public C12141b mo49264c(Runnable runnable, long j, TimeUnit timeUnit) {
        if (runnable == null) {
            throw new NullPointerException("run == null");
        } else if (timeUnit != null) {
            C12066b bVar = new C12066b(this.f18898b, C10885a.m23272s(runnable));
            this.f18898b.postDelayed(bVar, timeUnit.toMillis(j));
            return bVar;
        } else {
            throw new NullPointerException("unit == null");
        }
    }
}
