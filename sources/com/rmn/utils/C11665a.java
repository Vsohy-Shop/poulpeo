package com.rmn.utils;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.rmn.utils_common.IListener;

/* renamed from: com.rmn.utils.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C11665a implements IListener {

    /* renamed from: b */
    public final /* synthetic */ IListener f18160b;

    public /* synthetic */ C11665a(IListener iListener) {
        this.f18160b = iListener;
    }

    /* renamed from: J0 */
    public final void mo40744J0(Object obj) {
        AndroidUtil.lambda$retrieveAdvertisingIdAsync$2(this.f18160b, (AdvertisingIdClient.Info) obj);
    }
}
