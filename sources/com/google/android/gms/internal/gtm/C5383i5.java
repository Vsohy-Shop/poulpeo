package com.google.android.gms.internal.gtm;

import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.android.gms.internal.gtm.i5 */
final class C5383i5 implements ThreadFactory {
    C5383i5() {
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "google-tag-manager-scheduler-thread");
    }
}
