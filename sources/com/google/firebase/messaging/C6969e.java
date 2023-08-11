package com.google.firebase.messaging;

import android.content.Intent;
import androidx.annotation.NonNull;
import p276x5.C10406g;

/* renamed from: com.google.firebase.messaging.e */
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
public final /* synthetic */ class C6969e implements Runnable {
    @NonNull

    /* renamed from: b */
    public /* synthetic */ C6976g f9267b;
    @NonNull

    /* renamed from: c */
    public /* synthetic */ Intent f9268c;
    @NonNull

    /* renamed from: d */
    public /* synthetic */ C10406g f9269d;

    public /* synthetic */ C6969e(@NonNull C6976g gVar, @NonNull Intent intent, @NonNull C10406g gVar2) {
        this.f9267b = gVar;
        this.f9268c = intent;
        this.f9269d = gVar2;
    }

    public final void run() {
        this.f9267b.mo39923g(this.f9268c, this.f9269d);
    }
}
