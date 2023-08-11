package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.MainThread;
import androidx.annotation.WorkerThread;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.measurement.internal.s3 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
final class C6283s3 extends BroadcastReceiver {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C6157g9 f8187a;

    /* renamed from: b */
    private boolean f8188b;

    /* renamed from: c */
    private boolean f8189c;

    C6283s3(C6157g9 g9Var) {
        C9713p.m20275j(g9Var);
        this.f8187a = g9Var;
    }

    @WorkerThread
    /* renamed from: b */
    public final void mo35289b() {
        this.f8187a.mo34929g();
        this.f8187a.mo34919a().mo34778h();
        if (!this.f8188b) {
            this.f8187a.mo34927f().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.f8189c = this.f8187a.mo34916X().mo35219m();
            this.f8187a.mo34920b().mo35079v().mo35038b("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.f8189c));
            this.f8188b = true;
        }
    }

    @WorkerThread
    /* renamed from: c */
    public final void mo35290c() {
        this.f8187a.mo34929g();
        this.f8187a.mo34919a().mo34778h();
        this.f8187a.mo34919a().mo34778h();
        if (this.f8188b) {
            this.f8187a.mo34920b().mo35079v().mo35037a("Unregistering connectivity change receiver");
            this.f8188b = false;
            this.f8189c = false;
            try {
                this.f8187a.mo34927f().unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                this.f8187a.mo34920b().mo35075r().mo35038b("Failed to unregister the network broadcast receiver", e);
            }
        }
    }

    @MainThread
    public final void onReceive(Context context, Intent intent) {
        this.f8187a.mo34929g();
        String action = intent.getAction();
        this.f8187a.mo34920b().mo35079v().mo35038b("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            boolean m = this.f8187a.mo34916X().mo35219m();
            if (this.f8189c != m) {
                this.f8189c = m;
                this.f8187a.mo34919a().mo35110z(new C6272r3(this, m));
                return;
            }
            return;
        }
        this.f8187a.mo34920b().mo35080w().mo35038b("NetworkBroadcastReceiver received unknown action", action);
    }
}
