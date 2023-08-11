package com.google.firebase.messaging;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.messaging.f */
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
public final /* synthetic */ class C6972f implements Executor {
    @NonNull

    /* renamed from: b */
    public static final /* synthetic */ C6972f f9280b = new C6972f();

    private /* synthetic */ C6972f() {
    }

    public final void execute(@NonNull Runnable runnable) {
        runnable.run();
    }
}
