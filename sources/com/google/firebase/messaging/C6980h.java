package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import p276x5.C10394a;

/* renamed from: com.google.firebase.messaging.h */
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
public final /* synthetic */ class C6980h implements C10394a {
    @NonNull

    /* renamed from: a */
    public /* synthetic */ Context f9307a;
    @NonNull

    /* renamed from: b */
    public /* synthetic */ Intent f9308b;

    public /* synthetic */ C6980h(@NonNull Context context, @NonNull Intent intent) {
        this.f9307a = context;
        this.f9308b = intent;
    }

    @NonNull
    /* renamed from: a */
    public final Object mo39780a(@NonNull Task task) {
        return C6996m.m12384f(this.f9307a, this.f9308b, task);
    }
}
