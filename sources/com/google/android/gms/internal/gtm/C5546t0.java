package com.google.android.gms.internal.gtm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.PersistableBundle;
import androidx.core.app.NotificationCompat;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.gtm.t0 */
public final class C5546t0 extends C5407k {

    /* renamed from: d */
    private boolean f6319d;

    /* renamed from: e */
    private boolean f6320e;

    /* renamed from: f */
    private final AlarmManager f6321f = ((AlarmManager) mo33276c().getSystemService(NotificationCompat.CATEGORY_ALARM));

    /* renamed from: g */
    private Integer f6322g;

    protected C5546t0(C5437m mVar) {
        super(mVar);
    }

    /* renamed from: S0 */
    private final int m8504S0() {
        String str;
        if (this.f6322g == null) {
            String valueOf = String.valueOf(mo33276c().getPackageName());
            if (valueOf.length() != 0) {
                str = "analytics".concat(valueOf);
            } else {
                str = new String("analytics");
            }
            this.f6322g = Integer.valueOf(str.hashCode());
        }
        return this.f6322g.intValue();
    }

    /* renamed from: W0 */
    private final PendingIntent m8505W0() {
        Context c = mo33276c();
        return PendingIntent.getBroadcast(c, 0, new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH").setComponent(new ComponentName(c, "com.google.android.gms.analytics.AnalyticsReceiver")), 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: P0 */
    public final void mo33181P0() {
        try {
            mo33526R0();
            if (C5468o0.m8259e() > 0) {
                Context c = mo33276c();
                ActivityInfo receiverInfo = c.getPackageManager().getReceiverInfo(new ComponentName(c, "com.google.android.gms.analytics.AnalyticsReceiver"), 0);
                if (receiverInfo != null && receiverInfo.enabled) {
                    mo33266I0("Receiver registered for local dispatch.");
                    this.f6319d = true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* renamed from: R0 */
    public final void mo33526R0() {
        this.f6320e = false;
        this.f6321f.cancel(m8505W0());
        int S0 = m8504S0();
        mo33257A("Cancelling job. JobID", Integer.valueOf(S0));
        ((JobScheduler) mo33276c().getSystemService("jobscheduler")).cancel(S0);
    }

    /* renamed from: T0 */
    public final boolean mo33527T0() {
        return this.f6320e;
    }

    /* renamed from: U0 */
    public final boolean mo33528U0() {
        return this.f6319d;
    }

    /* renamed from: V0 */
    public final void mo33529V0() {
        mo33310Q0();
        C9713p.m20279n(this.f6319d, "Receiver not registered");
        long e = C5468o0.m8259e();
        if (e > 0) {
            mo33526R0();
            mo33279k0().mo33548b();
            this.f6320e = true;
            C5592w0.f6417R.mo33605a().booleanValue();
            mo33266I0("Scheduling upload with JobScheduler");
            Context c = mo33276c();
            ComponentName componentName = new ComponentName(c, "com.google.android.gms.analytics.AnalyticsJobService");
            int S0 = m8504S0();
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString("action", "com.google.android.gms.analytics.ANALYTICS_DISPATCH");
            JobInfo build = new JobInfo.Builder(S0, componentName).setMinimumLatency(e).setOverrideDeadline(e << 1).setExtras(persistableBundle).build();
            mo33257A("Scheduling job. JobID", Integer.valueOf(S0));
            C5532s1.m8482b(c, build, "com.google.android.gms", "DispatchAlarm");
        }
    }
}
