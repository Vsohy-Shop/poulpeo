package com.google.android.gms.internal.gtm;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.gtm.t4 */
final class C5551t4 implements Runnable {

    /* renamed from: b */
    private boolean f6331b = false;

    /* renamed from: c */
    private final /* synthetic */ String f6332c;

    /* renamed from: d */
    private final /* synthetic */ Bundle f6333d;

    /* renamed from: e */
    private final /* synthetic */ String f6334e;

    /* renamed from: f */
    private final /* synthetic */ long f6335f;

    /* renamed from: g */
    private final /* synthetic */ String f6336g;

    /* renamed from: h */
    private final /* synthetic */ C5535s4 f6337h;

    C5551t4(C5535s4 s4Var, String str, Bundle bundle, String str2, long j, String str3) {
        this.f6337h = s4Var;
        this.f6332c = str;
        this.f6333d = bundle;
        this.f6334e = str2;
        this.f6335f = j;
        this.f6336g = str3;
    }

    public final void run() {
        if (this.f6337h.f6307a.f6206l == 3) {
            this.f6337h.f6307a.f6198d.mo33296c(this.f6332c, this.f6333d, this.f6334e, this.f6335f, false);
        } else if (this.f6337h.f6307a.f6206l == 1 || this.f6337h.f6307a.f6206l == 2) {
            if (!this.f6331b) {
                C5426l3.m8133c(String.format("Container not loaded yet: deferring event listener by enqueuing the event: name = %s, origin = %s, params = %s.", new Object[]{this.f6332c, this.f6336g, this.f6333d}));
                this.f6331b = true;
                this.f6337h.f6307a.f6207m.add(this);
                return;
            }
            C5426l3.m8134d("Invalid state - not expecting to see a deferred event during container loading.");
        } else if (this.f6337h.f6307a.f6206l == 4) {
            C5426l3.m8133c(String.format("Container failed to load: skipping event listener by ignoring the event: name = %s, origin = %s, params = %s.", new Object[]{this.f6332c, this.f6336g, this.f6333d}));
        } else {
            int a = this.f6337h.f6307a.f6206l;
            StringBuilder sb = new StringBuilder(28);
            sb.append("Unexpected state:");
            sb.append(a);
            C5503q2.m8410c(sb.toString(), this.f6337h.f6307a.f6195a);
        }
    }
}
