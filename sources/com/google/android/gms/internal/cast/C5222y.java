package com.google.android.gms.internal.cast;

import androidx.mediarouter.media.MediaRouteSelector;

/* renamed from: com.google.android.gms.internal.cast.y */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.2.0 */
public final /* synthetic */ class C5222y implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C4829b0 f5594b;

    /* renamed from: c */
    public final /* synthetic */ MediaRouteSelector f5595c;

    /* renamed from: d */
    public final /* synthetic */ int f5596d;

    public /* synthetic */ C5222y(C4829b0 b0Var, MediaRouteSelector mediaRouteSelector, int i) {
        this.f5594b = b0Var;
        this.f5595c = mediaRouteSelector;
        this.f5596d = i;
    }

    public final void run() {
        this.f5594b.mo32624J(this.f5595c, this.f5596d);
    }
}
