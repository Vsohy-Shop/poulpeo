package com.google.firebase.messaging;

import androidx.annotation.NonNull;
import p276x5.C10406g;

/* renamed from: com.google.firebase.messaging.z */
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
public final /* synthetic */ class C7025z implements Runnable {
    @NonNull

    /* renamed from: b */
    public /* synthetic */ FirebaseMessaging f9379b;
    @NonNull

    /* renamed from: c */
    public /* synthetic */ C10406g f9380c;

    public /* synthetic */ C7025z(@NonNull FirebaseMessaging firebaseMessaging, @NonNull C10406g gVar) {
        this.f9379b = firebaseMessaging;
        this.f9380c = gVar;
    }

    public final void run() {
        this.f9379b.mo39856xd74d2373(this.f9380c);
    }
}
