package com.google.android.gms.measurement.internal;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import com.google.android.gms.internal.measurement.C5943rc;

/* renamed from: com.google.android.gms.measurement.internal.r8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
final class C6277r8 {

    /* renamed from: a */
    final /* synthetic */ C6288s8 f8181a;

    C6277r8(C6288s8 s8Var) {
        this.f8181a = s8Var;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: a */
    public final void mo35283a() {
        this.f8181a.mo34778h();
        if (this.f8181a.f7899a.mo35184F().mo35430v(this.f8181a.f7899a.mo34922c().mo33547a())) {
            this.f8181a.f7899a.mo35184F().f8442l.mo35300a(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                this.f8181a.f7899a.mo34920b().mo35079v().mo35037a("Detected application was in foreground");
                mo35285c(this.f8181a.f7899a.mo34922c().mo33547a(), false);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: b */
    public final void mo35284b(long j, boolean z) {
        this.f8181a.mo34778h();
        this.f8181a.m11110s();
        if (this.f8181a.f7899a.mo35184F().mo35430v(j)) {
            this.f8181a.f7899a.mo35184F().f8442l.mo35300a(true);
        }
        this.f8181a.f7899a.mo35184F().f8445o.mo35385b(j);
        if (this.f8181a.f7899a.mo35184F().f8442l.mo35301b()) {
            mo35285c(j, z);
        }
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: c */
    public final void mo35285c(long j, boolean z) {
        this.f8181a.mo34778h();
        if (this.f8181a.f7899a.mo35204o()) {
            this.f8181a.f7899a.mo35184F().f8445o.mo35385b(j);
            this.f8181a.f7899a.mo34920b().mo35079v().mo35038b("Session started, time", Long.valueOf(this.f8181a.f7899a.mo34922c().mo33548b()));
            Long valueOf = Long.valueOf(j / 1000);
            this.f8181a.f7899a.mo35186I().mo35235N("auto", "_sid", valueOf, j);
            this.f8181a.f7899a.mo35184F().f8442l.mo35300a(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", valueOf.longValue());
            if (this.f8181a.f7899a.mo35211z().mo34873B((String) null, C6084a3.f7579f0) && z) {
                bundle.putLong("_aib", 1);
            }
            this.f8181a.f7899a.mo35186I().mo35258v("auto", "_s", j, bundle);
            C5943rc.m9843b();
            if (this.f8181a.f7899a.mo35211z().mo34873B((String) null, C6084a3.f7587j0)) {
                String a = this.f8181a.f7899a.mo35184F().f8450t.mo35400a();
                if (!TextUtils.isEmpty(a)) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("_ffr", a);
                    this.f8181a.f7899a.mo35186I().mo35258v("auto", "_ssr", j, bundle2);
                }
            }
        }
    }
}
