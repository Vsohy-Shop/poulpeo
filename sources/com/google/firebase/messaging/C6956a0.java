package com.google.firebase.messaging;

import androidx.annotation.NonNull;
import p276x5.C10406g;

/* renamed from: com.google.firebase.messaging.a0 */
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
public final /* synthetic */ class C6956a0 implements Runnable {
    @NonNull

    /* renamed from: b */
    public /* synthetic */ FirebaseMessaging f9238b;
    @NonNull

    /* renamed from: c */
    public /* synthetic */ C10406g f9239c;

    public /* synthetic */ C6956a0(@NonNull FirebaseMessaging firebaseMessaging, @NonNull C10406g gVar) {
        this.f9238b = firebaseMessaging;
        this.f9239c = gVar;
    }

    public final void run() {
        this.f9238b.mo39857xd6d6bd74(this.f9239c);
    }
}
