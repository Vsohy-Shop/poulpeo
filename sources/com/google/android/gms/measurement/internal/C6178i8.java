package com.google.android.gms.measurement.internal;

import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.MainThread;
import com.google.android.gms.internal.measurement.C5884o1;
import p201q5.C9275v;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.measurement.internal.i8 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
public final class C6178i8<T extends Context & C9275v> {

    /* renamed from: a */
    private final T f7873a;

    public C6178i8(T t) {
        C9713p.m20275j(t);
        this.f7873a = t;
    }

    /* renamed from: k */
    private final C6206l3 m10718k() {
        return C6251p4.m10988H(this.f7873a, (C5884o1) null, (Long) null).mo34920b();
    }

    @MainThread
    /* renamed from: a */
    public final int mo34975a(Intent intent, int i, int i2) {
        C6251p4 H = C6251p4.m10988H(this.f7873a, (C5884o1) null, (Long) null);
        C6206l3 b = H.mo34920b();
        if (intent == null) {
            b.mo35080w().mo35037a("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        H.mo34924d();
        b.mo35079v().mo35039c("Local AppMeasurementService called. startId, action", Integer.valueOf(i2), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            mo34982h(new C6145f8(this, i2, b, intent));
        }
        return 2;
    }

    @MainThread
    /* renamed from: b */
    public final IBinder mo34976b(Intent intent) {
        if (intent == null) {
            m10718k().mo35075r().mo35037a("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new C6175i5(C6157g9.m10636e0(this.f7873a), (String) null);
        }
        m10718k().mo35080w().mo35038b("onBind received unknown action", action);
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo34977c(int i, C6206l3 l3Var, Intent intent) {
        if (((C9275v) this.f7873a).mo34714t(i)) {
            l3Var.mo35079v().mo35038b("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i));
            m10718k().mo35079v().mo35037a("Completed wakeful intent.");
            ((C9275v) this.f7873a).mo34706a(intent);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void mo34978d(C6206l3 l3Var, JobParameters jobParameters) {
        l3Var.mo35079v().mo35037a("AppMeasurementJobService processed last upload request.");
        ((C9275v) this.f7873a).mo34707b(jobParameters, false);
    }

    @MainThread
    /* renamed from: e */
    public final void mo34979e() {
        C6251p4 H = C6251p4.m10988H(this.f7873a, (C5884o1) null, (Long) null);
        C6206l3 b = H.mo34920b();
        H.mo34924d();
        b.mo35079v().mo35037a("Local AppMeasurementService is starting up");
    }

    @MainThread
    /* renamed from: f */
    public final void mo34980f() {
        C6251p4 H = C6251p4.m10988H(this.f7873a, (C5884o1) null, (Long) null);
        C6206l3 b = H.mo34920b();
        H.mo34924d();
        b.mo35079v().mo35037a("Local AppMeasurementService is shutting down");
    }

    @MainThread
    /* renamed from: g */
    public final void mo34981g(Intent intent) {
        if (intent == null) {
            m10718k().mo35075r().mo35037a("onRebind called with null intent");
            return;
        }
        m10718k().mo35079v().mo35038b("onRebind called. action", intent.getAction());
    }

    /* renamed from: h */
    public final void mo34982h(Runnable runnable) {
        C6157g9 e0 = C6157g9.m10636e0(this.f7873a);
        e0.mo34919a().mo35110z(new C6167h8(this, e0, runnable));
    }

    @MainThread
    /* renamed from: i */
    public final boolean mo34983i(JobParameters jobParameters) {
        C6251p4 H = C6251p4.m10988H(this.f7873a, (C5884o1) null, (Long) null);
        C6206l3 b = H.mo34920b();
        String string = jobParameters.getExtras().getString("action");
        H.mo34924d();
        b.mo35079v().mo35038b("Local AppMeasurementJobService called. action", string);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(string)) {
            return true;
        }
        mo34982h(new C6156g8(this, b, jobParameters));
        return true;
    }

    @MainThread
    /* renamed from: j */
    public final boolean mo34984j(Intent intent) {
        if (intent == null) {
            m10718k().mo35075r().mo35037a("onUnbind called with null intent");
            return true;
        }
        m10718k().mo35079v().mo35038b("onUnbind called for intent. action", intent.getAction());
        return true;
    }
}
