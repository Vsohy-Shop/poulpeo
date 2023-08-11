package com.google.firebase.messaging;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.C7026z0;
import p276x5.C10404f;

/* renamed from: com.google.firebase.messaging.s */
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
public final /* synthetic */ class C7010s implements C10404f {
    @NonNull

    /* renamed from: a */
    public /* synthetic */ FirebaseMessaging f9350a;
    @NonNull

    /* renamed from: b */
    public /* synthetic */ String f9351b;
    @NonNull

    /* renamed from: c */
    public /* synthetic */ C7026z0.C7027a f9352c;

    public /* synthetic */ C7010s(@NonNull FirebaseMessaging firebaseMessaging, @NonNull String str, @NonNull C7026z0.C7027a aVar) {
        this.f9350a = firebaseMessaging;
        this.f9351b = str;
        this.f9352c = aVar;
    }

    @NonNull
    /* renamed from: a */
    public final Task mo29941a(@NonNull Object obj) {
        return this.f9350a.mo39854xa7f5779b(this.f9351b, this.f9352c, (String) obj);
    }
}
