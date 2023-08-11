package com.rmn.utils;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.rmn.utils_common.IListener;

/* renamed from: com.rmn.utils.c */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C11667c implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ IListener f18163b;

    /* renamed from: c */
    public final /* synthetic */ AdvertisingIdClient.Info f18164c;

    public /* synthetic */ C11667c(IListener iListener, AdvertisingIdClient.Info info) {
        this.f18163b = iListener;
        this.f18164c = info;
    }

    public final void run() {
        this.f18163b.mo40744J0(this.f18164c);
    }
}
