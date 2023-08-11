package com.google.firebase.messaging;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.C7017v0;
import com.google.firebase.messaging.C7026z0;

/* renamed from: com.google.firebase.messaging.w */
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
public final /* synthetic */ class C7019w implements C7017v0.C7018a {
    @NonNull

    /* renamed from: a */
    public /* synthetic */ FirebaseMessaging f9362a;
    @NonNull

    /* renamed from: b */
    public /* synthetic */ String f9363b;
    @NonNull

    /* renamed from: c */
    public /* synthetic */ C7026z0.C7027a f9364c;

    public /* synthetic */ C7019w(@NonNull FirebaseMessaging firebaseMessaging, @NonNull String str, @NonNull C7026z0.C7027a aVar) {
        this.f9362a = firebaseMessaging;
        this.f9363b = str;
        this.f9364c = aVar;
    }

    @NonNull
    public final Task start() {
        return this.f9362a.mo39855xa77f119c(this.f9363b, this.f9364c);
    }
}
