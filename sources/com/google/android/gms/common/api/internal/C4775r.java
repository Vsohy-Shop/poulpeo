package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.r */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class C4775r implements Runnable {

    /* renamed from: b */
    final /* synthetic */ C4776s f5027b;

    C4775r(C4776s sVar) {
        this.f5027b = sVar;
    }

    public final void run() {
        C4777t tVar = this.f5027b.f5028a;
        tVar.f5030b.mo32395b(tVar.f5030b.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
