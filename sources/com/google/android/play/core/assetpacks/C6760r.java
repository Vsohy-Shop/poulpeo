package com.google.android.play.core.assetpacks;

import android.os.Bundle;

/* renamed from: com.google.android.play.core.assetpacks.r */
final /* synthetic */ class C6760r implements Runnable {

    /* renamed from: b */
    private final C6768t f8791b;

    /* renamed from: c */
    private final Bundle f8792c;

    /* renamed from: d */
    private final AssetPackState f8793d;

    C6760r(C6768t tVar, Bundle bundle, AssetPackState assetPackState) {
        this.f8791b = tVar;
        this.f8792c = bundle;
        this.f8793d = assetPackState;
    }

    public final void run() {
        this.f8791b.mo39364g(this.f8792c, this.f8793d);
    }
}
