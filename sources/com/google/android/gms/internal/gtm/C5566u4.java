package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.C5472o4;

/* renamed from: com.google.android.gms.internal.gtm.u4 */
final class C5566u4 implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ String f6357b;

    /* renamed from: c */
    private final /* synthetic */ String f6358c;

    /* renamed from: d */
    private final /* synthetic */ String f6359d = null;

    /* renamed from: e */
    private final /* synthetic */ C5472o4 f6360e;

    C5566u4(C5472o4 o4Var, String str, String str2, String str3) {
        this.f6360e = o4Var;
        this.f6357b = str;
        this.f6358c = str2;
    }

    public final void run() {
        String str = this.f6357b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 28);
        sb.append("Starting to load container ");
        sb.append(str);
        sb.append(".");
        C5426l3.m8133c(sb.toString());
        if (this.f6360e.f6206l != 1) {
            C5503q2.m8410c("Unexpected state - container loading already initiated.", this.f6360e.f6195a);
            return;
        }
        int unused = this.f6360e.f6206l = 2;
        this.f6360e.f6198d.mo33297d(this.f6357b, this.f6358c, this.f6359d, new C5472o4.C5474b(this.f6360e, (C5490p4) null));
    }
}
