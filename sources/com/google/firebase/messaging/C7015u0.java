package com.google.firebase.messaging;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import p276x5.C10394a;

/* renamed from: com.google.firebase.messaging.u0 */
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
public final /* synthetic */ class C7015u0 implements C10394a {
    @NonNull

    /* renamed from: a */
    public /* synthetic */ C7017v0 f9357a;
    @NonNull

    /* renamed from: b */
    public /* synthetic */ String f9358b;

    public /* synthetic */ C7015u0(@NonNull C7017v0 v0Var, @NonNull String str) {
        this.f9357a = v0Var;
        this.f9358b = str;
    }

    @NonNull
    /* renamed from: a */
    public final Object mo39780a(@NonNull Task task) {
        this.f9357a.mo39992b(this.f9358b, task);
        return task;
    }
}
