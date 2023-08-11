package com.google.android.gms.internal.gtm;

import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.android.gms.internal.gtm.g5 */
final class C5352g5 implements ThreadFactory {
    C5352g5() {
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "google-tag-manager-background-thread");
    }
}
