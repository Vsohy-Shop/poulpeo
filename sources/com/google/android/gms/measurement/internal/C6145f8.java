package com.google.android.gms.measurement.internal;

import android.content.Intent;

/* renamed from: com.google.android.gms.measurement.internal.f8 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
public final /* synthetic */ class C6145f8 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C6178i8 f7773b;

    /* renamed from: c */
    public final /* synthetic */ int f7774c;

    /* renamed from: d */
    public final /* synthetic */ C6206l3 f7775d;

    /* renamed from: e */
    public final /* synthetic */ Intent f7776e;

    public /* synthetic */ C6145f8(C6178i8 i8Var, int i, C6206l3 l3Var, Intent intent) {
        this.f7773b = i8Var;
        this.f7774c = i;
        this.f7775d = l3Var;
        this.f7776e = intent;
    }

    public final void run() {
        this.f7773b.mo34977c(this.f7774c, this.f7775d, this.f7776e);
    }
}
