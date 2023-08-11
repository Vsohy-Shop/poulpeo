package com.google.android.gms.measurement.internal;

import p201q5.C9257d;

/* renamed from: com.google.android.gms.measurement.internal.z7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
final class C6364z7 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ C9257d f8460b;

    /* renamed from: c */
    final /* synthetic */ C6112c8 f8461c;

    C6364z7(C6112c8 c8Var, C9257d dVar) {
        this.f8461c = c8Var;
        this.f8460b = dVar;
    }

    public final void run() {
        synchronized (this.f8461c) {
            this.f8461c.f7688b = false;
            if (!this.f8461c.f7690d.mo34842z()) {
                this.f8461c.f7690d.f7899a.mo34920b().mo35074q().mo35037a("Connected to remote service");
                this.f8461c.f7690d.mo34840x(this.f8460b);
            }
        }
    }
}
