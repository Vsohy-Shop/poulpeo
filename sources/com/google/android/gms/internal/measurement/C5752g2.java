package com.google.android.gms.internal.measurement;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.android.gms.internal.measurement.g2 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@20.0.0 */
final class C5752g2 implements ThreadFactory {

    /* renamed from: b */
    private final ThreadFactory f6954b = Executors.defaultThreadFactory();

    C5752g2(C6061z2 z2Var) {
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f6954b.newThread(runnable);
        newThread.setName("ScionFrontendApi");
        return newThread;
    }
}
