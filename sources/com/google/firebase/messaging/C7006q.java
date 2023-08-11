package com.google.firebase.messaging;

import androidx.annotation.NonNull;
import p276x5.C10406g;

/* renamed from: com.google.firebase.messaging.q */
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
public final /* synthetic */ class C7006q implements Runnable {
    @NonNull

    /* renamed from: b */
    public /* synthetic */ FirebaseMessaging f9347b;
    @NonNull

    /* renamed from: c */
    public /* synthetic */ C10406g f9348c;

    public /* synthetic */ C7006q(@NonNull FirebaseMessaging firebaseMessaging, @NonNull C10406g gVar) {
        this.f9347b = firebaseMessaging;
        this.f9348c = gVar;
    }

    public final void run() {
        this.f9347b.mo39858x6c2cd681(this.f9348c);
    }
}
