package com.google.android.gms.measurement;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.legacy.content.WakefulBroadcastReceiver;
import p201q5.C9261h;
import p201q5.C9262i;

/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
public final class AppMeasurementReceiver extends WakefulBroadcastReceiver implements C9261h {

    /* renamed from: a */
    private C9262i f7522a;

    @MainThread
    /* renamed from: a */
    public void mo34715a(@NonNull Context context, @NonNull Intent intent) {
        WakefulBroadcastReceiver.startWakefulService(context, intent);
    }

    @MainThread
    public void onReceive(@NonNull Context context, @NonNull Intent intent) {
        if (this.f7522a == null) {
            this.f7522a = new C9262i(this);
        }
        this.f7522a.mo43557a(context, intent);
    }
}
