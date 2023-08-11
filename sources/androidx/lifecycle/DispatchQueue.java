package androidx.lifecycle;

import androidx.annotation.AnyThread;
import androidx.annotation.MainThread;
import java.util.ArrayDeque;
import java.util.Queue;
import kotlin.jvm.internal.C12775o;
import p355hf.C12079g;
import p466yf.C13933b1;
import p466yf.C13988j2;

/* compiled from: DispatchQueue.kt */
public final class DispatchQueue {
    private boolean finished;
    private boolean isDraining;
    private boolean paused = true;
    private final Queue<Runnable> queue = new ArrayDeque();

    /* access modifiers changed from: private */
    public static final void dispatchAndEnqueue$lambda$2$lambda$1(DispatchQueue dispatchQueue, Runnable runnable) {
        C12775o.m28639i(dispatchQueue, "this$0");
        C12775o.m28639i(runnable, "$runnable");
        dispatchQueue.enqueue(runnable);
    }

    @MainThread
    private final void enqueue(Runnable runnable) {
        if (this.queue.offer(runnable)) {
            drainQueue();
            return;
        }
        throw new IllegalStateException("cannot enqueue any more runnables".toString());
    }

    @MainThread
    public final boolean canRun() {
        if (this.finished || !this.paused) {
            return true;
        }
        return false;
    }

    @AnyThread
    public final void dispatchAndEnqueue(C12079g gVar, Runnable runnable) {
        C12775o.m28639i(gVar, "context");
        C12775o.m28639i(runnable, "runnable");
        C13988j2 t0 = C13933b1.m32212c().mo49059t0();
        if (t0.isDispatchNeeded(gVar) || canRun()) {
            t0.dispatch(gVar, new C2340c(this, runnable));
        } else {
            enqueue(runnable);
        }
    }

    @MainThread
    public final void drainQueue() {
        if (!this.isDraining) {
            boolean z = false;
            z = true;
            try {
                while (true) {
                    if (!(this.queue.isEmpty() ^ z)) {
                        break;
                    } else if (!canRun()) {
                        break;
                    } else {
                        Runnable poll = this.queue.poll();
                        if (poll != null) {
                            poll.run();
                        }
                    }
                }
                this.isDraining = z;
            } finally {
                this.isDraining = z;
            }
        }
    }

    @MainThread
    public final void finish() {
        this.finished = true;
        drainQueue();
    }

    @MainThread
    public final void pause() {
        this.paused = true;
    }

    @MainThread
    public final void resume() {
        if (this.paused) {
            if (!this.finished) {
                this.paused = false;
                drainQueue();
                return;
            }
            throw new IllegalStateException("Cannot resume a finished dispatcher".toString());
        }
    }
}
