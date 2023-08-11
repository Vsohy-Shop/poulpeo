package com.google.android.gms.internal.gtm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.gtm.h1 */
class C5364h1 extends BroadcastReceiver {

    /* renamed from: d */
    private static final String f6023d = "com.google.android.gms.internal.gtm.h1";

    /* renamed from: a */
    private final C5437m f6024a;

    /* renamed from: b */
    private boolean f6025b;

    /* renamed from: c */
    private boolean f6026c;

    C5364h1(C5437m mVar) {
        C9713p.m20275j(mVar);
        this.f6024a = mVar;
    }

    /* renamed from: d */
    private final void m7989d() {
        this.f6024a.mo33330e();
        this.f6024a.mo33333h();
    }

    /* renamed from: f */
    private final boolean m7990f() {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f6024a.mo33328a().getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                return false;
            }
            return true;
        } catch (SecurityException unused) {
        }
    }

    /* renamed from: a */
    public final boolean mo33227a() {
        if (!this.f6025b) {
            this.f6024a.mo33330e().mo33269L0("Connectivity unknown. Receiver not registered");
        }
        return this.f6026c;
    }

    /* renamed from: b */
    public final void mo33228b() {
        if (this.f6025b) {
            this.f6024a.mo33330e().mo33266I0("Unregistering connectivity change receiver");
            this.f6025b = false;
            this.f6026c = false;
            try {
                this.f6024a.mo33328a().unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                this.f6024a.mo33330e().mo33265H0("Failed to unregister the network broadcast receiver", e);
            }
        }
    }

    /* renamed from: c */
    public final void mo33229c() {
        m7989d();
        if (!this.f6025b) {
            Context a = this.f6024a.mo33328a();
            a.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            IntentFilter intentFilter = new IntentFilter("com.google.analytics.RADIO_POWERED");
            intentFilter.addCategory(a.getPackageName());
            a.registerReceiver(this, intentFilter);
            this.f6026c = m7990f();
            this.f6024a.mo33330e().mo33257A("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.f6026c));
            this.f6025b = true;
        }
    }

    /* renamed from: e */
    public final void mo33230e() {
        Context a = this.f6024a.mo33328a();
        Intent intent = new Intent("com.google.analytics.RADIO_POWERED");
        intent.addCategory(a.getPackageName());
        intent.putExtra(f6023d, true);
        a.sendOrderedBroadcast(intent, (String) null);
    }

    public void onReceive(Context context, Intent intent) {
        m7989d();
        String action = intent.getAction();
        this.f6024a.mo33330e().mo33257A("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            boolean f = m7990f();
            if (this.f6026c != f) {
                this.f6026c = f;
                C5331f h = this.f6024a.mo33333h();
                h.mo33257A("Network connectivity status changed", Boolean.valueOf(f));
                h.mo33282u0().mo45758d(new C5346g(h, f));
            }
        } else if (!"com.google.analytics.RADIO_POWERED".equals(action)) {
            this.f6024a.mo33330e().mo33262E0("NetworkBroadcastReceiver received unknown action", action);
        } else if (!intent.hasExtra(f6023d)) {
            C5331f h2 = this.f6024a.mo33333h();
            h2.mo33266I0("Radio powered up");
            h2.mo33204X0();
        }
    }
}
