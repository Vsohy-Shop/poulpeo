package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

/* renamed from: com.google.android.gms.measurement.internal.y7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
final class C6353y7 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ ComponentName f8413b;

    /* renamed from: c */
    final /* synthetic */ C6112c8 f8414c;

    C6353y7(C6112c8 c8Var, ComponentName componentName) {
        this.f8414c = c8Var;
        this.f8413b = componentName;
    }

    public final void run() {
        C6123d8.m10539M(this.f8414c.f7690d, this.f8413b);
    }
}
