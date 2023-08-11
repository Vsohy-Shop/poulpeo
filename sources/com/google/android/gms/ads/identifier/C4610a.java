package com.google.android.gms.ads.identifier;

import android.net.Uri;
import java.util.Map;
import p285y3.C10666a;

/* renamed from: com.google.android.gms.ads.identifier.a */
/* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
final class C4610a extends Thread {

    /* renamed from: b */
    final /* synthetic */ Map f4426b;

    C4610a(AdvertisingIdClient advertisingIdClient, Map map) {
        this.f4426b = map;
    }

    public final void run() {
        Map map = this.f4426b;
        Uri.Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        for (String str : map.keySet()) {
            buildUpon.appendQueryParameter(str, (String) map.get(str));
        }
        C10666a.m22663a(buildUpon.build().toString());
    }
}
