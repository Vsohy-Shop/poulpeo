package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.annotation.MainThread;
import com.google.android.gms.internal.measurement.C5947s0;
import com.google.android.gms.internal.measurement.C5963t0;

/* renamed from: com.google.android.gms.measurement.internal.b4 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
public final class C6097b4 implements ServiceConnection {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final String f7642b;

    /* renamed from: c */
    final /* synthetic */ C6108c4 f7643c;

    C6097b4(C6108c4 c4Var, String str) {
        this.f7643c = c4Var;
        this.f7642b = str;
    }

    @MainThread
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder != null) {
            try {
                C5963t0 G = C5947s0.m9846G(iBinder);
                if (G == null) {
                    this.f7643c.f7668a.mo34920b().mo35080w().mo35037a("Install Referrer Service implementation was not found");
                    return;
                }
                this.f7643c.f7668a.mo34920b().mo35079v().mo35037a("Install Referrer Service connected");
                this.f7643c.f7668a.mo34919a().mo35110z(new C6085a4(this, G, this));
            } catch (RuntimeException e) {
                this.f7643c.f7668a.mo34920b().mo35080w().mo35038b("Exception occurred while calling Install Referrer API", e);
            }
        } else {
            this.f7643c.f7668a.mo34920b().mo35080w().mo35037a("Install Referrer connection returned with null binder");
        }
    }

    @MainThread
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f7643c.f7668a.mo34920b().mo35079v().mo35037a("Install Referrer Service disconnected");
    }
}
