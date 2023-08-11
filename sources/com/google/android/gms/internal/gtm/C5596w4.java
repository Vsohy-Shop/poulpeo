package com.google.android.gms.internal.gtm;

/* renamed from: com.google.android.gms.internal.gtm.w4 */
final class C5596w4 implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ C5581v4 f6447b;

    C5596w4(C5581v4 v4Var) {
        this.f6447b = v4Var;
    }

    public final void run() {
        if (this.f6447b.f6387b.f6206l == 1 || this.f6447b.f6387b.f6206l == 2) {
            int unused = this.f6447b.f6387b.f6206l = 4;
            C5426l3.m8135e("Container load timed out after 5000ms.");
            while (!this.f6447b.f6387b.f6207m.isEmpty()) {
                this.f6447b.f6387b.f6199e.execute((Runnable) this.f6447b.f6387b.f6207m.remove());
            }
        }
    }
}
