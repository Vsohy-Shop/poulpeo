package com.google.android.gms.internal.cast;

import androidx.mediarouter.media.MediaRouteSelector;

/* renamed from: com.google.android.gms.internal.cast.a0 */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.2.0 */
public final /* synthetic */ class C4811a0 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C4829b0 f5109b;

    /* renamed from: c */
    public final /* synthetic */ MediaRouteSelector f5110c;

    public /* synthetic */ C4811a0(C4829b0 b0Var, MediaRouteSelector mediaRouteSelector) {
        this.f5109b = b0Var;
        this.f5110c = mediaRouteSelector;
    }

    public final void run() {
        this.f5109b.mo32629c3(this.f5110c);
    }
}
