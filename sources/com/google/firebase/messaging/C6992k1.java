package com.google.firebase.messaging;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ScheduledFuture;
import p276x5.C10398c;

/* renamed from: com.google.firebase.messaging.k1 */
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
public final /* synthetic */ class C6992k1 implements C10398c {
    @NonNull

    /* renamed from: a */
    public /* synthetic */ ScheduledFuture f9325a;

    public /* synthetic */ C6992k1(@NonNull ScheduledFuture scheduledFuture) {
        this.f9325a = scheduledFuture;
    }

    /* renamed from: a */
    public final void mo28794a(@NonNull Task task) {
        this.f9325a.cancel(false);
    }
}
