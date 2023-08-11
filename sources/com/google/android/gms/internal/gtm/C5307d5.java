package com.google.android.gms.internal.gtm;

/* renamed from: com.google.android.gms.internal.gtm.d5 */
final class C5307d5 implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ C5564u2 f5920b;

    /* renamed from: c */
    private final /* synthetic */ C5277b5 f5921c;

    C5307d5(C5277b5 b5Var, C5564u2 u2Var) {
        this.f5921c = b5Var;
        this.f5920b = u2Var;
    }

    public final void run() {
        if (this.f5921c.f5873a.isEmpty()) {
            C5426l3.m8135e("TagManagerBackend emit called without loaded container.");
            return;
        }
        for (C5349g2 g : this.f5921c.f5873a.values()) {
            g.mo33218g(this.f5920b);
        }
    }
}
