package com.google.android.gms.internal.gtm;

/* renamed from: com.google.android.gms.internal.gtm.i2 */
final class C5380i2 implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ C5349g2 f6049b;

    C5380i2(C5349g2 g2Var) {
        this.f6049b = g2Var;
    }

    public final void run() {
        this.f6049b.f6000g.execute(new C5440m2(this.f6049b, (C5365h2) null));
    }
}
