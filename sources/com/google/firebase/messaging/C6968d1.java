package com.google.firebase.messaging;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.firebase.messaging.d1 */
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
public final /* synthetic */ class C6968d1 implements Callable {
    @NonNull

    /* renamed from: b */
    public /* synthetic */ Context f9262b;
    @NonNull

    /* renamed from: c */
    public /* synthetic */ ScheduledExecutorService f9263c;
    @NonNull

    /* renamed from: d */
    public /* synthetic */ FirebaseMessaging f9264d;
    @NonNull

    /* renamed from: e */
    public /* synthetic */ C6991k0 f9265e;
    @NonNull

    /* renamed from: f */
    public /* synthetic */ C6973f0 f9266f;

    public /* synthetic */ C6968d1(@NonNull Context context, @NonNull ScheduledExecutorService scheduledExecutorService, @NonNull FirebaseMessaging firebaseMessaging, @NonNull C6991k0 k0Var, @NonNull C6973f0 f0Var) {
        this.f9262b = context;
        this.f9263c = scheduledExecutorService;
        this.f9264d = firebaseMessaging;
        this.f9265e = k0Var;
        this.f9266f = f0Var;
    }

    @NonNull
    public final Object call() {
        return C6971e1.m12251i(this.f9262b, this.f9263c, this.f9264d, this.f9265e, this.f9266f);
    }
}
