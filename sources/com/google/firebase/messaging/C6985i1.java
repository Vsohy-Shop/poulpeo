package com.google.firebase.messaging;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.messaging.i1 */
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
public final /* synthetic */ class C6985i1 implements Executor {
    @NonNull

    /* renamed from: b */
    public static final /* synthetic */ C6985i1 f9315b = new C6985i1();

    private /* synthetic */ C6985i1() {
    }

    public final void execute(@NonNull Runnable runnable) {
        runnable.run();
    }
}
