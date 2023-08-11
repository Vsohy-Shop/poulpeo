package com.google.android.gms.measurement.internal;

import p201q5.C9257d;

/* renamed from: com.google.android.gms.measurement.internal.x7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
final class C6342x7 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ C9257d f8398b;

    /* renamed from: c */
    final /* synthetic */ C6112c8 f8399c;

    C6342x7(C6112c8 c8Var, C9257d dVar) {
        this.f8399c = c8Var;
        this.f8398b = dVar;
    }

    public final void run() {
        synchronized (this.f8399c) {
            this.f8399c.f7688b = false;
            if (!this.f8399c.f7690d.mo34842z()) {
                this.f8399c.f7690d.f7899a.mo34920b().mo35079v().mo35037a("Connected to service");
                this.f8399c.f7690d.mo34840x(this.f8398b);
            }
        }
    }
}
