package com.adjust.sdk.scheduler;

import com.adjust.sdk.AdjustFactory;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class SingleThreadFutureScheduler implements FutureScheduler {
    private ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;

    public SingleThreadFutureScheduler(final String str, boolean z) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new ThreadFactoryWrapper(str), new RejectedExecutionHandler() {
            public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                AdjustFactory.getLogger().warn("Runnable [%s] rejected from [%s] ", runnable.toString(), str);
            }
        });
        this.scheduledThreadPoolExecutor = scheduledThreadPoolExecutor2;
        if (!z) {
            scheduledThreadPoolExecutor2.setKeepAliveTime(10, TimeUnit.MILLISECONDS);
            this.scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        }
    }

    public ScheduledFuture<?> scheduleFuture(Runnable runnable, long j) {
        return this.scheduledThreadPoolExecutor.schedule(new RunnableWrapper(runnable), j, TimeUnit.MILLISECONDS);
    }

    public ScheduledFuture<?> scheduleFutureWithFixedDelay(Runnable runnable, long j, long j2) {
        return this.scheduledThreadPoolExecutor.scheduleWithFixedDelay(new RunnableWrapper(runnable), j, j2, TimeUnit.MILLISECONDS);
    }

    public <V> ScheduledFuture<V> scheduleFutureWithReturn(final Callable<V> callable, long j) {
        return this.scheduledThreadPoolExecutor.schedule(new Callable<V>() {
            public V call() {
                try {
                    return callable.call();
                } catch (Throwable th) {
                    AdjustFactory.getLogger().error("Callable error [%s] of type [%s]", th.getMessage(), th.getClass().getCanonicalName());
                    return null;
                }
            }
        }, j, TimeUnit.MILLISECONDS);
    }

    public void teardown() {
        this.scheduledThreadPoolExecutor.shutdownNow();
    }
}
