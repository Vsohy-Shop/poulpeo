package com.google.android.gms.internal.gtm;

/* renamed from: com.google.android.gms.internal.gtm.e5 */
final class C5322e5 implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ C5277b5 f5970b;

    C5322e5(C5277b5 b5Var) {
        this.f5970b = b5Var;
    }

    public final void run() {
        if (this.f5970b.f5873a.isEmpty()) {
            C5426l3.m8134d("TagManagerBackend dispatch called without loaded container.");
            return;
        }
        for (C5349g2 a : this.f5970b.f5873a.values()) {
            a.mo33217a();
        }
    }
}
