package com.google.android.gms.internal.cast;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.cast.b */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.2.0 */
public final class C4828b {

    /* renamed from: a */
    private static long f5144a = 6000;

    /* renamed from: a */
    public static /* synthetic */ void m6793a(Bundle bundle) {
        bundle.getLong("com.google.android.gms.cast.FLAG_MEDIA_ROUTE_DIALOG_UPDATE_DEVICES_DELAY_MS", 300);
        bundle.getLong("com.google.android.gms.cast.FLAG_MEDIA_ROUTE_DIALOG_DISCOVERY_TIMEOUT_MS", 10000);
        f5144a = bundle.getLong("com.google.android.gms.cast.FLAG_MEDIA_ROUTE_DIALOG_ZERO_DEVICE_TIMEOUT_MS", 6000);
    }
}
