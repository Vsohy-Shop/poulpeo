package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.legacy.content.WakefulBroadcastReceiver;
import com.google.android.gms.measurement.internal.C6178i8;
import p201q5.C9275v;

/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
public final class AppMeasurementService extends Service implements C9275v {

    /* renamed from: b */
    private C6178i8<AppMeasurementService> f7523b;

    /* renamed from: c */
    private final C6178i8<AppMeasurementService> m10415c() {
        if (this.f7523b == null) {
            this.f7523b = new C6178i8<>(this);
        }
        return this.f7523b;
    }

    /* renamed from: a */
    public final void mo34706a(@NonNull Intent intent) {
        WakefulBroadcastReceiver.completeWakefulIntent(intent);
    }

    /* renamed from: b */
    public final void mo34707b(@NonNull JobParameters jobParameters, boolean z) {
        throw new UnsupportedOperationException();
    }

    @MainThread
    @NonNull
    public IBinder onBind(@NonNull Intent intent) {
        return m10415c().mo34976b(intent);
    }

    @MainThread
    public void onCreate() {
        super.onCreate();
        m10415c().mo34979e();
    }

    @MainThread
    public void onDestroy() {
        m10415c().mo34980f();
        super.onDestroy();
    }

    @MainThread
    public void onRebind(@NonNull Intent intent) {
        m10415c().mo34981g(intent);
    }

    @MainThread
    public int onStartCommand(@NonNull Intent intent, int i, int i2) {
        m10415c().mo34975a(intent, i, i2);
        return 2;
    }

    @MainThread
    public boolean onUnbind(@NonNull Intent intent) {
        m10415c().mo34984j(intent);
        return true;
    }

    /* renamed from: t */
    public final boolean mo34714t(int i) {
        return stopSelfResult(i);
    }
}
