package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import java.util.concurrent.Callable;

/* renamed from: com.google.firebase.messaging.k */
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
public final /* synthetic */ class C6990k implements Callable {
    @NonNull

    /* renamed from: b */
    public /* synthetic */ Context f9318b;
    @NonNull

    /* renamed from: c */
    public /* synthetic */ Intent f9319c;

    public /* synthetic */ C6990k(@NonNull Context context, @NonNull Intent intent) {
        this.f9318b = context;
        this.f9319c = intent;
    }

    @NonNull
    public final Object call() {
        return Integer.valueOf(C7020w0.m12426b().mo39997g(this.f9318b, this.f9319c));
    }
}
