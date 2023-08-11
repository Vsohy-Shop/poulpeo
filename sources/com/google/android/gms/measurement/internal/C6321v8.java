package com.google.android.gms.measurement.internal;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PersistableBundle;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.internal.measurement.C5979u0;
import com.google.android.gms.internal.measurement.C5995v0;

/* renamed from: com.google.android.gms.measurement.internal.v8 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
public final class C6321v8 extends C6343x8 {

    /* renamed from: d */
    private final AlarmManager f8334d = ((AlarmManager) this.f7899a.mo34927f().getSystemService(NotificationCompat.CATEGORY_ALARM));

    /* renamed from: e */
    private C6213m f8335e;

    /* renamed from: f */
    private Integer f8336f;

    protected C6321v8(C6157g9 g9Var) {
        super(g9Var);
    }

    /* renamed from: o */
    private final int m11194o() {
        String str;
        if (this.f8336f == null) {
            String valueOf = String.valueOf(this.f7899a.mo34927f().getPackageName());
            if (valueOf.length() != 0) {
                str = "measurement".concat(valueOf);
            } else {
                str = new String("measurement");
            }
            this.f8336f = Integer.valueOf(str.hashCode());
        }
        return this.f8336f.intValue();
    }

    /* renamed from: p */
    private final PendingIntent m11195p() {
        Context f = this.f7899a.mo34927f();
        return C5979u0.m9994a(f, 0, new Intent().setClassName(f, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), C5979u0.f7405a);
    }

    /* renamed from: q */
    private final C6213m m11196q() {
        if (this.f8335e == null) {
            this.f8335e = new C6310u8(this, this.f8374b.mo34921b0());
        }
        return this.f8335e;
    }

    /* renamed from: r */
    private final void m11197r() {
        JobScheduler jobScheduler = (JobScheduler) this.f7899a.mo34927f().getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(m11194o());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final boolean mo34749l() {
        AlarmManager alarmManager = this.f8334d;
        if (alarmManager != null) {
            alarmManager.cancel(m11195p());
        }
        m11197r();
        return false;
    }

    /* renamed from: m */
    public final void mo35389m() {
        mo35406i();
        this.f7899a.mo34920b().mo35079v().mo35037a("Unscheduling upload");
        AlarmManager alarmManager = this.f8334d;
        if (alarmManager != null) {
            alarmManager.cancel(m11195p());
        }
        m11196q().mo35088b();
        m11197r();
    }

    /* renamed from: n */
    public final void mo35390n(long j) {
        mo35406i();
        this.f7899a.mo34924d();
        Context f = this.f7899a.mo34927f();
        if (!C6234n9.m10923X(f)) {
            this.f7899a.mo34920b().mo35074q().mo35037a("Receiver not registered/enabled");
        }
        if (!C6234n9.m10924Y(f, false)) {
            this.f7899a.mo34920b().mo35074q().mo35037a("Service not registered/enabled");
        }
        mo35389m();
        this.f7899a.mo34920b().mo35079v().mo35038b("Scheduling upload, millis", Long.valueOf(j));
        this.f7899a.mo34922c().mo33548b();
        this.f7899a.mo35211z();
        if (j < Math.max(0, C6084a3.f7616y.mo35421a(null).longValue()) && !m11196q().mo35091e()) {
            m11196q().mo35090d(j);
        }
        this.f7899a.mo34924d();
        Context f2 = this.f7899a.mo34927f();
        ComponentName componentName = new ComponentName(f2, "com.google.android.gms.measurement.AppMeasurementJobService");
        int o = m11194o();
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
        C5995v0.m10147a(f2, new JobInfo.Builder(o, componentName).setMinimumLatency(j).setOverrideDeadline(j + j).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
    }
}
