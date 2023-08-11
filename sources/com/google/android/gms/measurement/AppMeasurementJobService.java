package com.google.android.gms.measurement;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import com.google.android.gms.measurement.internal.C6178i8;
import p201q5.C9275v;

/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
public final class AppMeasurementJobService extends JobService implements C9275v {

    /* renamed from: b */
    private C6178i8<AppMeasurementJobService> f7521b;

    /* renamed from: c */
    private final C6178i8<AppMeasurementJobService> m10410c() {
        if (this.f7521b == null) {
            this.f7521b = new C6178i8<>(this);
        }
        return this.f7521b;
    }

    /* renamed from: b */
    public final void mo34707b(@NonNull JobParameters jobParameters, boolean z) {
        jobFinished(jobParameters, false);
    }

    @MainThread
    public void onCreate() {
        super.onCreate();
        m10410c().mo34979e();
    }

    @MainThread
    public void onDestroy() {
        m10410c().mo34980f();
        super.onDestroy();
    }

    @MainThread
    public void onRebind(@NonNull Intent intent) {
        m10410c().mo34981g(intent);
    }

    public boolean onStartJob(@NonNull JobParameters jobParameters) {
        m10410c().mo34983i(jobParameters);
        return true;
    }

    public boolean onStopJob(@NonNull JobParameters jobParameters) {
        return false;
    }

    @MainThread
    public boolean onUnbind(@NonNull Intent intent) {
        m10410c().mo34984j(intent);
        return true;
    }

    /* renamed from: t */
    public final boolean mo34714t(int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final void mo34706a(@NonNull Intent intent) {
    }
}
