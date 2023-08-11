package com.google.firebase.messaging;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.messaging.p0 */
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
public final /* synthetic */ class C7005p0 implements Executor {
    @NonNull

    /* renamed from: b */
    public static final /* synthetic */ C7005p0 f9346b = new C7005p0();

    private /* synthetic */ C7005p0() {
    }

    public final void execute(@NonNull Runnable runnable) {
        runnable.run();
    }
}
