package com.google.android.gms.internal.gtm;

import android.content.ComponentName;

/* renamed from: com.google.android.gms.internal.gtm.u */
final class C5561u implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ ComponentName f6348b;

    /* renamed from: c */
    private final /* synthetic */ C5530s f6349c;

    C5561u(C5530s sVar, ComponentName componentName) {
        this.f6349c = sVar;
        this.f6348b = componentName;
    }

    public final void run() {
        this.f6349c.f6296d.m8372U0(this.f6348b);
    }
}
