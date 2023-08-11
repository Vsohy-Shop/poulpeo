package com.google.android.gms.internal.gtm;

/* renamed from: com.google.android.gms.internal.gtm.t */
final class C5545t implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ C5288c1 f6317b;

    /* renamed from: c */
    private final /* synthetic */ C5530s f6318c;

    C5545t(C5530s sVar, C5288c1 c1Var) {
        this.f6318c = sVar;
        this.f6317b = c1Var;
    }

    public final void run() {
        if (!this.f6318c.f6296d.mo33467T0()) {
            this.f6318c.f6296d.mo33267J0("Connected to service after a timeout");
            this.f6318c.f6296d.m8376Y0(this.f6317b);
        }
    }
}
