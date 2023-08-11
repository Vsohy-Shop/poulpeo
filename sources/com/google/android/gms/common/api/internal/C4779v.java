package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import p231t4.C9692j;

/* renamed from: com.google.android.gms.common.api.internal.v */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class C4779v implements Runnable {

    /* renamed from: b */
    final /* synthetic */ ConnectionResult f5044b;

    /* renamed from: c */
    final /* synthetic */ C4780w f5045c;

    C4779v(C4780w wVar, ConnectionResult connectionResult) {
        this.f5045c = wVar;
        this.f5044b = connectionResult;
    }

    public final void run() {
        C4780w wVar = this.f5045c;
        C4777t tVar = (C4777t) wVar.f5051f.f4961m.get(wVar.f5047b);
        if (tVar != null) {
            if (this.f5044b.mo32338I()) {
                this.f5045c.f5050e = true;
                if (this.f5045c.f5046a.mo32407o()) {
                    this.f5045c.m6684h();
                    return;
                }
                try {
                    C4780w wVar2 = this.f5045c;
                    wVar2.f5046a.mo32406n((C9692j) null, wVar2.f5046a.mo32394a());
                } catch (SecurityException e) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e);
                    this.f5045c.f5046a.mo32395b("Failed to get service from broker.");
                    tVar.mo32551F(new ConnectionResult(10), (Exception) null);
                }
            } else {
                tVar.mo32551F(this.f5044b, (Exception) null);
            }
        }
    }
}
