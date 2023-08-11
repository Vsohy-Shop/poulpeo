package com.google.android.gms.measurement.internal;

import android.app.job.JobParameters;

/* renamed from: com.google.android.gms.measurement.internal.g8 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
public final /* synthetic */ class C6156g8 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C6178i8 f7799b;

    /* renamed from: c */
    public final /* synthetic */ C6206l3 f7800c;

    /* renamed from: d */
    public final /* synthetic */ JobParameters f7801d;

    public /* synthetic */ C6156g8(C6178i8 i8Var, C6206l3 l3Var, JobParameters jobParameters) {
        this.f7799b = i8Var;
        this.f7800c = l3Var;
        this.f7801d = jobParameters;
    }

    public final void run() {
        this.f7799b.mo34978d(this.f7800c, this.f7801d);
    }
}
