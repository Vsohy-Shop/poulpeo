package com.google.android.gms.internal.gtm;

import java.lang.Thread;

/* renamed from: com.google.android.gms.internal.gtm.n */
final class C5452n implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    private final /* synthetic */ C5437m f6136a;

    C5452n(C5437m mVar) {
        this.f6136a = mVar;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        C5348g1 o = this.f6136a.mo33340o();
        if (o != null) {
            o.mo33265H0("Job execution failed", th);
        }
    }
}
