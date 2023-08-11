package com.google.android.gms.internal.gtm;

import androidx.annotation.WorkerThread;

/* renamed from: com.google.android.gms.internal.gtm.h2 */
final class C5365h2 implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ C5349g2 f6027b;

    C5365h2(C5349g2 g2Var) {
        this.f6027b = g2Var;
    }

    @WorkerThread
    public final void run() {
        if (this.f6027b.f6006m == 2) {
            this.f6027b.f6005l.mo33577a();
        }
    }
}
