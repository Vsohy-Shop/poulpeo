package com.google.firebase.messaging;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.messaging.l */
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
public final /* synthetic */ class C6993l implements Executor {
    @NonNull

    /* renamed from: b */
    public static final /* synthetic */ C6993l f9326b = new C6993l();

    private /* synthetic */ C6993l() {
    }

    public final void execute(@NonNull Runnable runnable) {
        runnable.run();
    }
}
