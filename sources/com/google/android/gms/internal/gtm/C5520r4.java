package com.google.android.gms.internal.gtm;

import android.os.Bundle;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.gtm.r4 */
final class C5520r4 implements Runnable {

    /* renamed from: b */
    private boolean f6278b = false;

    /* renamed from: c */
    private final /* synthetic */ String f6279c;

    /* renamed from: d */
    private final /* synthetic */ Bundle f6280d;

    /* renamed from: e */
    private final /* synthetic */ String f6281e;

    /* renamed from: f */
    private final /* synthetic */ long f6282f;

    /* renamed from: g */
    private final /* synthetic */ String f6283g;

    /* renamed from: h */
    private final /* synthetic */ C5505q4 f6284h;

    C5520r4(C5505q4 q4Var, String str, Bundle bundle, String str2, long j, String str3) {
        this.f6284h = q4Var;
        this.f6279c = str;
        this.f6280d = bundle;
        this.f6281e = str2;
        this.f6282f = j;
        this.f6283g = str3;
    }

    public final void run() {
        if (this.f6284h.f6256a.f6206l == 3) {
            this.f6284h.f6256a.f6198d.mo33296c(this.f6279c, this.f6280d, this.f6281e, this.f6282f, true);
        } else if (this.f6284h.f6256a.f6206l == 4) {
            C5426l3.m8133c(String.format("Container failed to load: skipping  event interceptor by logging event back to Firebase directly: name = %s, origin = %s, params = %s.", new Object[]{this.f6279c, this.f6281e, this.f6280d}));
            try {
                this.f6284h.f6256a.f6196b.mo35447z0(this.f6281e, this.f6279c, this.f6280d, this.f6282f);
            } catch (RemoteException e) {
                C5503q2.m8409b("Error logging event on measurement proxy: ", e, this.f6284h.f6256a.f6195a);
            }
        } else if (this.f6284h.f6256a.f6206l != 1 && this.f6284h.f6256a.f6206l != 2) {
            int a = this.f6284h.f6256a.f6206l;
            StringBuilder sb = new StringBuilder(28);
            sb.append("Unexpected state:");
            sb.append(a);
            C5503q2.m8410c(sb.toString(), this.f6284h.f6256a.f6195a);
        } else if (!this.f6278b) {
            C5426l3.m8133c(String.format("Container not loaded yet: deferring event interceptor by enqueuing the event: name = %s, origin = %s, params = %s.", new Object[]{this.f6279c, this.f6283g, this.f6280d}));
            this.f6278b = true;
            this.f6284h.f6256a.f6207m.add(this);
        } else {
            C5503q2.m8410c("Invalid state - not expecting to see a deferredevent during container loading.", this.f6284h.f6256a.f6195a);
        }
    }
}
