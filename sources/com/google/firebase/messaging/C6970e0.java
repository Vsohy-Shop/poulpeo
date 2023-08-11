package com.google.firebase.messaging;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.messaging.e0 */
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
public final /* synthetic */ class C6970e0 implements Executor {
    @NonNull

    /* renamed from: b */
    public static final /* synthetic */ C6970e0 f9270b = new C6970e0();

    private /* synthetic */ C6970e0() {
    }

    public final void execute(@NonNull Runnable runnable) {
        runnable.run();
    }
}
