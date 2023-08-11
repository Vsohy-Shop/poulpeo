package com.google.firebase.remoteconfig.internal;

import p286y4.C10670d;

/* renamed from: com.google.firebase.remoteconfig.internal.k */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C7046k implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C10670d f9466b;

    /* renamed from: c */
    public final /* synthetic */ String f9467c;

    /* renamed from: d */
    public final /* synthetic */ C7037e f9468d;

    public /* synthetic */ C7046k(C10670d dVar, String str, C7037e eVar) {
        this.f9466b = dVar;
        this.f9467c = str;
        this.f9468d = eVar;
    }

    public final void run() {
        this.f9466b.accept(this.f9467c, this.f9468d);
    }
}
