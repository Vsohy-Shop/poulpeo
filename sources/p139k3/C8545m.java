package p139k3;

import java.util.concurrent.Executor;
import p189p3.C9050a;

/* renamed from: k3.m */
/* compiled from: SafeLoggingExecutor */
class C8545m implements Executor {

    /* renamed from: b */
    private final Executor f12204b;

    /* renamed from: k3.m$a */
    /* compiled from: SafeLoggingExecutor */
    static class C8546a implements Runnable {

        /* renamed from: b */
        private final Runnable f12205b;

        C8546a(Runnable runnable) {
            this.f12205b = runnable;
        }

        public void run() {
            try {
                this.f12205b.run();
            } catch (Exception e) {
                C9050a.m18382c("Executor", "Background execution failure.", e);
            }
        }
    }

    C8545m(Executor executor) {
        this.f12204b = executor;
    }

    public void execute(Runnable runnable) {
        this.f12204b.execute(new C8546a(runnable));
    }
}
