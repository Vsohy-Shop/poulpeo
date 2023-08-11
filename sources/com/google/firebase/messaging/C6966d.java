package com.google.firebase.messaging;

import android.content.Intent;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import p276x5.C10398c;

/* renamed from: com.google.firebase.messaging.d */
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
public final /* synthetic */ class C6966d implements C10398c {
    @NonNull

    /* renamed from: a */
    public /* synthetic */ C6976g f9259a;
    @NonNull

    /* renamed from: b */
    public /* synthetic */ Intent f9260b;

    public /* synthetic */ C6966d(@NonNull C6976g gVar, @NonNull Intent intent) {
        this.f9259a = gVar;
        this.f9260b = intent;
    }

    /* renamed from: a */
    public final void mo28794a(@NonNull Task task) {
        this.f9259a.mo39922f(this.f9260b, task);
    }
}
