package com.google.android.gms.internal.gtm;

import android.content.Context;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.gtm.v2 */
public final class C5579v2 extends ThreadPoolExecutor {

    /* renamed from: b */
    private final Context f6373b;

    public C5579v2(Context context, int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory) {
        super(1, 1, 0, timeUnit, blockingQueue, threadFactory);
        this.f6373b = context;
    }

    /* access modifiers changed from: protected */
    public final void afterExecute(Runnable runnable, Throwable th) {
        if (th != null) {
            C5503q2.m8409b("Uncaught exception: ", th, this.f6373b);
        }
    }
}
