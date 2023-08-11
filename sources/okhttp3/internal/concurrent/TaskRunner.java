package okhttp3.internal.concurrent;

import androidx.compose.animation.core.AnimationKt;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.Util;
import p336ef.C11921v;

/* compiled from: TaskRunner.kt */
public final class TaskRunner {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final TaskRunner INSTANCE = new TaskRunner(new RealBackend(Util.threadFactory(C12775o.m28647q(Util.okHttpName, " TaskRunner"), true)));
    /* access modifiers changed from: private */
    public static final Logger logger;
    private final Backend backend;
    private final List<TaskQueue> busyQueues = new ArrayList();
    private boolean coordinatorWaiting;
    private long coordinatorWakeUpAt;
    private int nextQueueName = 10000;
    private final List<TaskQueue> readyQueues = new ArrayList();
    private final Runnable runnable = new TaskRunner$runnable$1(this);

    /* compiled from: TaskRunner.kt */
    public interface Backend {
        void beforeTask(TaskRunner taskRunner);

        void coordinatorNotify(TaskRunner taskRunner);

        void coordinatorWait(TaskRunner taskRunner, long j);

        void execute(Runnable runnable);

        long nanoTime();
    }

    /* compiled from: TaskRunner.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Logger getLogger() {
            return TaskRunner.logger;
        }
    }

    /* compiled from: TaskRunner.kt */
    public static final class RealBackend implements Backend {
        private final ThreadPoolExecutor executor;

        public RealBackend(ThreadFactory threadFactory) {
            C12775o.m28639i(threadFactory, "threadFactory");
            this.executor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        public void beforeTask(TaskRunner taskRunner) {
            C12775o.m28639i(taskRunner, "taskRunner");
        }

        public void coordinatorNotify(TaskRunner taskRunner) {
            C12775o.m28639i(taskRunner, "taskRunner");
            taskRunner.notify();
        }

        public void coordinatorWait(TaskRunner taskRunner, long j) {
            C12775o.m28639i(taskRunner, "taskRunner");
            long j2 = j / AnimationKt.MillisToNanos;
            long j3 = j - (AnimationKt.MillisToNanos * j2);
            if (j2 > 0 || j > 0) {
                taskRunner.wait(j2, (int) j3);
            }
        }

        public void execute(Runnable runnable) {
            C12775o.m28639i(runnable, "runnable");
            this.executor.execute(runnable);
        }

        public long nanoTime() {
            return System.nanoTime();
        }

        public final void shutdown() {
            this.executor.shutdown();
        }
    }

    static {
        Logger logger2 = Logger.getLogger(TaskRunner.class.getName());
        C12775o.m28638h(logger2, "getLogger(TaskRunner::class.java.name)");
        logger = logger2;
    }

    public TaskRunner(Backend backend2) {
        C12775o.m28639i(backend2, "backend");
        this.backend = backend2;
    }

    private final void afterRun(Task task, long j) {
        boolean z;
        if (!Util.assertionsEnabled || Thread.holdsLock(this)) {
            TaskQueue queue$okhttp = task.getQueue$okhttp();
            C12775o.m28636f(queue$okhttp);
            if (queue$okhttp.getActiveTask$okhttp() == task) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                boolean cancelActiveTask$okhttp = queue$okhttp.getCancelActiveTask$okhttp();
                queue$okhttp.setCancelActiveTask$okhttp(false);
                queue$okhttp.setActiveTask$okhttp((Task) null);
                this.busyQueues.remove(queue$okhttp);
                if (j != -1 && !cancelActiveTask$okhttp && !queue$okhttp.getShutdown$okhttp()) {
                    queue$okhttp.scheduleAndDecide$okhttp(task, j, true);
                }
                if (!queue$okhttp.getFutureTasks$okhttp().isEmpty()) {
                    this.readyQueues.add(queue$okhttp);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
    }

    private final void beforeRun(Task task) {
        if (!Util.assertionsEnabled || Thread.holdsLock(this)) {
            task.setNextExecuteNanoTime$okhttp(-1);
            TaskQueue queue$okhttp = task.getQueue$okhttp();
            C12775o.m28636f(queue$okhttp);
            queue$okhttp.getFutureTasks$okhttp().remove(task);
            this.readyQueues.remove(queue$okhttp);
            queue$okhttp.setActiveTask$okhttp(task);
            this.busyQueues.add(queue$okhttp);
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
    }

    /* access modifiers changed from: private */
    public final void runTask(Task task) {
        if (!Util.assertionsEnabled || !Thread.holdsLock(this)) {
            Thread currentThread = Thread.currentThread();
            String name = currentThread.getName();
            currentThread.setName(task.getName());
            try {
                long runOnce = task.runOnce();
                synchronized (this) {
                    afterRun(task, runOnce);
                    C11921v vVar = C11921v.f18618a;
                }
                currentThread.setName(name);
            } catch (Throwable th) {
                synchronized (this) {
                    afterRun(task, -1);
                    C11921v vVar2 = C11921v.f18618a;
                    currentThread.setName(name);
                    throw th;
                }
            }
        } else {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
    }

    public final List<TaskQueue> activeQueues() {
        List<TaskQueue> o0;
        synchronized (this) {
            o0 = C12686e0.m28236o0(this.busyQueues, this.readyQueues);
        }
        return o0;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00c0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final okhttp3.internal.concurrent.Task awaitTaskToRun() {
        /*
            r14 = this;
            boolean r0 = okhttp3.internal.Util.assertionsEnabled
            if (r0 == 0) goto L_0x0032
            boolean r0 = java.lang.Thread.holdsLock(r14)
            if (r0 == 0) goto L_0x000b
            goto L_0x0032
        L_0x000b:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Thread "
            r1.append(r2)
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            java.lang.String r2 = " MUST hold lock on "
            r1.append(r2)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0032:
            java.util.List<okhttp3.internal.concurrent.TaskQueue> r0 = r14.readyQueues
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 == 0) goto L_0x003c
            return r1
        L_0x003c:
            okhttp3.internal.concurrent.TaskRunner$Backend r0 = r14.backend
            long r2 = r0.nanoTime()
            java.util.List<okhttp3.internal.concurrent.TaskQueue> r0 = r14.readyQueues
            java.util.Iterator r0 = r0.iterator()
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r6 = r1
        L_0x004e:
            boolean r7 = r0.hasNext()
            r8 = 1
            r9 = 0
            if (r7 == 0) goto L_0x0080
            java.lang.Object r7 = r0.next()
            okhttp3.internal.concurrent.TaskQueue r7 = (okhttp3.internal.concurrent.TaskQueue) r7
            java.util.List r7 = r7.getFutureTasks$okhttp()
            java.lang.Object r7 = r7.get(r9)
            okhttp3.internal.concurrent.Task r7 = (okhttp3.internal.concurrent.Task) r7
            long r10 = r7.getNextExecuteNanoTime$okhttp()
            long r10 = r10 - r2
            r12 = 0
            long r10 = java.lang.Math.max(r12, r10)
            int r12 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r12 <= 0) goto L_0x007a
            long r4 = java.lang.Math.min(r10, r4)
            goto L_0x004e
        L_0x007a:
            if (r6 == 0) goto L_0x007e
            r0 = r8
            goto L_0x0081
        L_0x007e:
            r6 = r7
            goto L_0x004e
        L_0x0080:
            r0 = r9
        L_0x0081:
            if (r6 == 0) goto L_0x009f
            r14.beforeRun(r6)
            if (r0 != 0) goto L_0x0097
            boolean r0 = r14.coordinatorWaiting
            if (r0 != 0) goto L_0x009e
            java.util.List<okhttp3.internal.concurrent.TaskQueue> r0 = r14.readyQueues
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r8
            if (r0 == 0) goto L_0x009e
        L_0x0097:
            okhttp3.internal.concurrent.TaskRunner$Backend r0 = r14.backend
            java.lang.Runnable r1 = r14.runnable
            r0.execute(r1)
        L_0x009e:
            return r6
        L_0x009f:
            boolean r0 = r14.coordinatorWaiting
            if (r0 == 0) goto L_0x00b0
            long r6 = r14.coordinatorWakeUpAt
            long r6 = r6 - r2
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x00af
            okhttp3.internal.concurrent.TaskRunner$Backend r0 = r14.backend
            r0.coordinatorNotify(r14)
        L_0x00af:
            return r1
        L_0x00b0:
            r14.coordinatorWaiting = r8
            long r2 = r2 + r4
            r14.coordinatorWakeUpAt = r2
            okhttp3.internal.concurrent.TaskRunner$Backend r0 = r14.backend     // Catch:{ InterruptedException -> 0x00c0 }
            r0.coordinatorWait(r14, r4)     // Catch:{ InterruptedException -> 0x00c0 }
        L_0x00ba:
            r14.coordinatorWaiting = r9
            goto L_0x0032
        L_0x00be:
            r0 = move-exception
            goto L_0x00c4
        L_0x00c0:
            r14.cancelAll()     // Catch:{ all -> 0x00be }
            goto L_0x00ba
        L_0x00c4:
            r14.coordinatorWaiting = r9
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.concurrent.TaskRunner.awaitTaskToRun():okhttp3.internal.concurrent.Task");
    }

    public final void cancelAll() {
        int size = this.busyQueues.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                this.busyQueues.get(size).cancelAllAndDecide$okhttp();
                if (i < 0) {
                    break;
                }
                size = i;
            }
        }
        int size2 = this.readyQueues.size() - 1;
        if (size2 >= 0) {
            while (true) {
                int i2 = size2 - 1;
                TaskQueue taskQueue = this.readyQueues.get(size2);
                taskQueue.cancelAllAndDecide$okhttp();
                if (taskQueue.getFutureTasks$okhttp().isEmpty()) {
                    this.readyQueues.remove(size2);
                }
                if (i2 >= 0) {
                    size2 = i2;
                } else {
                    return;
                }
            }
        }
    }

    public final Backend getBackend() {
        return this.backend;
    }

    public final void kickCoordinator$okhttp(TaskQueue taskQueue) {
        C12775o.m28639i(taskQueue, "taskQueue");
        if (!Util.assertionsEnabled || Thread.holdsLock(this)) {
            if (taskQueue.getActiveTask$okhttp() == null) {
                if (!taskQueue.getFutureTasks$okhttp().isEmpty()) {
                    Util.addIfAbsent(this.readyQueues, taskQueue);
                } else {
                    this.readyQueues.remove(taskQueue);
                }
            }
            if (this.coordinatorWaiting) {
                this.backend.coordinatorNotify(this);
            } else {
                this.backend.execute(this.runnable);
            }
        } else {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
    }

    public final TaskQueue newQueue() {
        int i;
        synchronized (this) {
            i = this.nextQueueName;
            this.nextQueueName = i + 1;
        }
        return new TaskQueue(this, C12775o.m28647q("Q", Integer.valueOf(i)));
    }
}
