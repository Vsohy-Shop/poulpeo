package okhttp3.internal.concurrent;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.C12770k0;
import kotlin.jvm.internal.C12773m;
import kotlin.jvm.internal.C12775o;
import okhttp3.internal.http2.Http2Connection;
import p404of.C13074a;

/* compiled from: TaskLogger.kt */
public final class TaskLoggerKt {
    public static final String formatDuration(long j) {
        String str;
        if (j <= -999500000) {
            str = ((j - ((long) 500000000)) / ((long) Http2Connection.DEGRADED_PONG_TIMEOUT_NS)) + " s ";
        } else if (j <= -999500) {
            str = ((j - ((long) 500000)) / ((long) 1000000)) + " ms";
        } else if (j <= 0) {
            str = ((j - ((long) 500)) / ((long) 1000)) + " µs";
        } else if (j < 999500) {
            str = ((j + ((long) 500)) / ((long) 1000)) + " µs";
        } else if (j < 999500000) {
            str = ((j + ((long) 500000)) / ((long) 1000000)) + " ms";
        } else {
            str = ((j + ((long) 500000000)) / ((long) Http2Connection.DEGRADED_PONG_TIMEOUT_NS)) + " s ";
        }
        C12770k0 k0Var = C12770k0.f20423a;
        String format = String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
        C12775o.m28638h(format, "format(format, *args)");
        return format;
    }

    /* access modifiers changed from: private */
    public static final void log(Task task, TaskQueue taskQueue, String str) {
        Logger logger = TaskRunner.Companion.getLogger();
        StringBuilder sb = new StringBuilder();
        sb.append(taskQueue.getName$okhttp());
        sb.append(' ');
        C12770k0 k0Var = C12770k0.f20423a;
        String format = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        C12775o.m28638h(format, "format(format, *args)");
        sb.append(format);
        sb.append(": ");
        sb.append(task.getName());
        logger.fine(sb.toString());
    }

    public static final <T> T logElapsed(Task task, TaskQueue taskQueue, C13074a<? extends T> aVar) {
        long j;
        C12775o.m28639i(task, "task");
        C12775o.m28639i(taskQueue, "queue");
        C12775o.m28639i(aVar, "block");
        boolean isLoggable = TaskRunner.Companion.getLogger().isLoggable(Level.FINE);
        if (isLoggable) {
            j = taskQueue.getTaskRunner$okhttp().getBackend().nanoTime();
            log(task, taskQueue, "starting");
        } else {
            j = -1;
        }
        try {
            T invoke = aVar.invoke();
            C12773m.m28629b(1);
            if (isLoggable) {
                log(task, taskQueue, C12775o.m28647q("finished run in ", formatDuration(taskQueue.getTaskRunner$okhttp().getBackend().nanoTime() - j)));
            }
            C12773m.m28628a(1);
            return invoke;
        } catch (Throwable th) {
            C12773m.m28629b(1);
            if (isLoggable) {
                log(task, taskQueue, C12775o.m28647q("failed a run in ", formatDuration(taskQueue.getTaskRunner$okhttp().getBackend().nanoTime() - j)));
            }
            C12773m.m28628a(1);
            throw th;
        }
    }

    public static final void taskLog(Task task, TaskQueue taskQueue, C13074a<String> aVar) {
        C12775o.m28639i(task, "task");
        C12775o.m28639i(taskQueue, "queue");
        C12775o.m28639i(aVar, "messageBlock");
        if (TaskRunner.Companion.getLogger().isLoggable(Level.FINE)) {
            log(task, taskQueue, aVar.invoke());
        }
    }
}
