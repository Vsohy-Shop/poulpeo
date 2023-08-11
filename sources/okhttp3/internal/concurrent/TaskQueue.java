package okhttp3.internal.concurrent;

import androidx.autofill.HintConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.logging.Level;
import kotlin.jvm.internal.C12775o;
import okhttp3.internal.Util;
import p336ef.C11921v;
import p404of.C13074a;

/* compiled from: TaskQueue.kt */
public final class TaskQueue {
    private Task activeTask;
    private boolean cancelActiveTask;
    private final List<Task> futureTasks = new ArrayList();
    private final String name;
    private boolean shutdown;
    private final TaskRunner taskRunner;

    /* compiled from: TaskQueue.kt */
    private static final class AwaitIdleTask extends Task {
        private final CountDownLatch latch = new CountDownLatch(1);

        public AwaitIdleTask() {
            super(C12775o.m28647q(Util.okHttpName, " awaitIdle"), false);
        }

        public final CountDownLatch getLatch() {
            return this.latch;
        }

        public long runOnce() {
            this.latch.countDown();
            return -1;
        }
    }

    public TaskQueue(TaskRunner taskRunner2, String str) {
        C12775o.m28639i(taskRunner2, "taskRunner");
        C12775o.m28639i(str, HintConstants.AUTOFILL_HINT_NAME);
        this.taskRunner = taskRunner2;
        this.name = str;
    }

    public static /* synthetic */ void execute$default(TaskQueue taskQueue, String str, long j, boolean z, C13074a aVar, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        if ((i & 4) != 0) {
            z = true;
        }
        C12775o.m28639i(str, HintConstants.AUTOFILL_HINT_NAME);
        C12775o.m28639i(aVar, "block");
        taskQueue.schedule(new TaskQueue$execute$1(str, z, aVar), j);
    }

    public static /* synthetic */ void schedule$default(TaskQueue taskQueue, Task task, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        taskQueue.schedule(task, j);
    }

    public final void cancelAll() {
        if (!Util.assertionsEnabled || !Thread.holdsLock(this)) {
            synchronized (this.taskRunner) {
                if (cancelAllAndDecide$okhttp()) {
                    getTaskRunner$okhttp().kickCoordinator$okhttp(this);
                }
                C11921v vVar = C11921v.f18618a;
            }
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
    }

    public final boolean cancelAllAndDecide$okhttp() {
        Task task = this.activeTask;
        if (task != null) {
            C12775o.m28636f(task);
            if (task.getCancelable()) {
                this.cancelActiveTask = true;
            }
        }
        int size = this.futureTasks.size() - 1;
        boolean z = false;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                if (this.futureTasks.get(size).getCancelable()) {
                    Task task2 = this.futureTasks.get(size);
                    if (TaskRunner.Companion.getLogger().isLoggable(Level.FINE)) {
                        TaskLoggerKt.log(task2, this, "canceled");
                    }
                    this.futureTasks.remove(size);
                    z = true;
                }
                if (i < 0) {
                    break;
                }
                size = i;
            }
        }
        return z;
    }

    public final void execute(String str, long j, boolean z, C13074a<C11921v> aVar) {
        C12775o.m28639i(str, HintConstants.AUTOFILL_HINT_NAME);
        C12775o.m28639i(aVar, "block");
        schedule(new TaskQueue$execute$1(str, z, aVar), j);
    }

    public final Task getActiveTask$okhttp() {
        return this.activeTask;
    }

    public final boolean getCancelActiveTask$okhttp() {
        return this.cancelActiveTask;
    }

    public final List<Task> getFutureTasks$okhttp() {
        return this.futureTasks;
    }

    public final String getName$okhttp() {
        return this.name;
    }

    public final List<Task> getScheduledTasks() {
        List<Task> B0;
        synchronized (this.taskRunner) {
            B0 = C12686e0.m28205B0(getFutureTasks$okhttp());
        }
        return B0;
    }

    public final boolean getShutdown$okhttp() {
        return this.shutdown;
    }

    public final TaskRunner getTaskRunner$okhttp() {
        return this.taskRunner;
    }

    public final CountDownLatch idleLatch() {
        synchronized (this.taskRunner) {
            if (getActiveTask$okhttp() != null || !getFutureTasks$okhttp().isEmpty()) {
                Task activeTask$okhttp = getActiveTask$okhttp();
                if (activeTask$okhttp instanceof AwaitIdleTask) {
                    CountDownLatch latch = ((AwaitIdleTask) activeTask$okhttp).getLatch();
                    return latch;
                }
                for (Task next : getFutureTasks$okhttp()) {
                    if (next instanceof AwaitIdleTask) {
                        CountDownLatch latch2 = ((AwaitIdleTask) next).getLatch();
                        return latch2;
                    }
                }
                AwaitIdleTask awaitIdleTask = new AwaitIdleTask();
                if (scheduleAndDecide$okhttp(awaitIdleTask, 0, false)) {
                    getTaskRunner$okhttp().kickCoordinator$okhttp(this);
                }
                CountDownLatch latch3 = awaitIdleTask.getLatch();
                return latch3;
            }
            CountDownLatch countDownLatch = new CountDownLatch(0);
            return countDownLatch;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void schedule(okhttp3.internal.concurrent.Task r3, long r4) {
        /*
            r2 = this;
            java.lang.String r0 = "task"
            kotlin.jvm.internal.C12775o.m28639i(r3, r0)
            okhttp3.internal.concurrent.TaskRunner r0 = r2.taskRunner
            monitor-enter(r0)
            boolean r1 = r2.getShutdown$okhttp()     // Catch:{ all -> 0x0054 }
            if (r1 == 0) goto L_0x0042
            boolean r4 = r3.getCancelable()     // Catch:{ all -> 0x0054 }
            if (r4 == 0) goto L_0x0029
            okhttp3.internal.concurrent.TaskRunner$Companion r4 = okhttp3.internal.concurrent.TaskRunner.Companion     // Catch:{ all -> 0x0054 }
            java.util.logging.Logger r4 = r4.getLogger()     // Catch:{ all -> 0x0054 }
            java.util.logging.Level r5 = java.util.logging.Level.FINE     // Catch:{ all -> 0x0054 }
            boolean r4 = r4.isLoggable(r5)     // Catch:{ all -> 0x0054 }
            if (r4 == 0) goto L_0x0027
            java.lang.String r4 = "schedule canceled (queue is shutdown)"
            okhttp3.internal.concurrent.TaskLoggerKt.log(r3, r2, r4)     // Catch:{ all -> 0x0054 }
        L_0x0027:
            monitor-exit(r0)
            return
        L_0x0029:
            okhttp3.internal.concurrent.TaskRunner$Companion r4 = okhttp3.internal.concurrent.TaskRunner.Companion     // Catch:{ all -> 0x0054 }
            java.util.logging.Logger r4 = r4.getLogger()     // Catch:{ all -> 0x0054 }
            java.util.logging.Level r5 = java.util.logging.Level.FINE     // Catch:{ all -> 0x0054 }
            boolean r4 = r4.isLoggable(r5)     // Catch:{ all -> 0x0054 }
            if (r4 == 0) goto L_0x003c
            java.lang.String r4 = "schedule failed (queue is shutdown)"
            okhttp3.internal.concurrent.TaskLoggerKt.log(r3, r2, r4)     // Catch:{ all -> 0x0054 }
        L_0x003c:
            java.util.concurrent.RejectedExecutionException r3 = new java.util.concurrent.RejectedExecutionException     // Catch:{ all -> 0x0054 }
            r3.<init>()     // Catch:{ all -> 0x0054 }
            throw r3     // Catch:{ all -> 0x0054 }
        L_0x0042:
            r1 = 0
            boolean r3 = r2.scheduleAndDecide$okhttp(r3, r4, r1)     // Catch:{ all -> 0x0054 }
            if (r3 == 0) goto L_0x0050
            okhttp3.internal.concurrent.TaskRunner r3 = r2.getTaskRunner$okhttp()     // Catch:{ all -> 0x0054 }
            r3.kickCoordinator$okhttp(r2)     // Catch:{ all -> 0x0054 }
        L_0x0050:
            ef.v r3 = p336ef.C11921v.f18618a     // Catch:{ all -> 0x0054 }
            monitor-exit(r0)
            return
        L_0x0054:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.concurrent.TaskQueue.schedule(okhttp3.internal.concurrent.Task, long):void");
    }

    public final boolean scheduleAndDecide$okhttp(Task task, long j, boolean z) {
        boolean z2;
        String str;
        C12775o.m28639i(task, "task");
        task.initQueue$okhttp(this);
        long nanoTime = this.taskRunner.getBackend().nanoTime();
        long j2 = nanoTime + j;
        int indexOf = this.futureTasks.indexOf(task);
        if (indexOf != -1) {
            if (task.getNextExecuteNanoTime$okhttp() <= j2) {
                if (TaskRunner.Companion.getLogger().isLoggable(Level.FINE)) {
                    TaskLoggerKt.log(task, this, "already scheduled");
                }
                return false;
            }
            this.futureTasks.remove(indexOf);
        }
        task.setNextExecuteNanoTime$okhttp(j2);
        if (TaskRunner.Companion.getLogger().isLoggable(Level.FINE)) {
            if (z) {
                str = C12775o.m28647q("run again after ", TaskLoggerKt.formatDuration(j2 - nanoTime));
            } else {
                str = C12775o.m28647q("scheduled after ", TaskLoggerKt.formatDuration(j2 - nanoTime));
            }
            TaskLoggerKt.log(task, this, str);
        }
        Iterator<Task> it = this.futureTasks.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (it.next().getNextExecuteNanoTime$okhttp() - nanoTime > j) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                break;
            }
            i++;
        }
        if (i == -1) {
            i = this.futureTasks.size();
        }
        this.futureTasks.add(i, task);
        if (i == 0) {
            return true;
        }
        return false;
    }

    public final void setActiveTask$okhttp(Task task) {
        this.activeTask = task;
    }

    public final void setCancelActiveTask$okhttp(boolean z) {
        this.cancelActiveTask = z;
    }

    public final void setShutdown$okhttp(boolean z) {
        this.shutdown = z;
    }

    public final void shutdown() {
        if (!Util.assertionsEnabled || !Thread.holdsLock(this)) {
            synchronized (this.taskRunner) {
                setShutdown$okhttp(true);
                if (cancelAllAndDecide$okhttp()) {
                    getTaskRunner$okhttp().kickCoordinator$okhttp(this);
                }
                C11921v vVar = C11921v.f18618a;
            }
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
    }

    public String toString() {
        return this.name;
    }

    public static /* synthetic */ void schedule$default(TaskQueue taskQueue, String str, long j, C13074a aVar, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        C12775o.m28639i(str, HintConstants.AUTOFILL_HINT_NAME);
        C12775o.m28639i(aVar, "block");
        taskQueue.schedule(new TaskQueue$schedule$2(str, aVar), j);
    }

    public final void schedule(String str, long j, C13074a<Long> aVar) {
        C12775o.m28639i(str, HintConstants.AUTOFILL_HINT_NAME);
        C12775o.m28639i(aVar, "block");
        schedule(new TaskQueue$schedule$2(str, aVar), j);
    }
}
