package com.google.firebase.messaging;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.messaging.r */
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
public final /* synthetic */ class C7008r implements Executor {
    @NonNull

    /* renamed from: b */
    public static final /* synthetic */ C7008r f9349b = new C7008r();

    private /* synthetic */ C7008r() {
    }

    public final void execute(@NonNull Runnable runnable) {
        runnable.run();
    }
}
