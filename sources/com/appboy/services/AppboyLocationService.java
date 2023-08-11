package com.appboy.services;

import android.content.Context;
import p126j0.C8266c;
import p270x.C10156b;

@Deprecated
public class AppboyLocationService {
    private static final String TAG = C8266c.m16405n(AppboyLocationService.class);

    @Deprecated
    public static void requestInitialization(Context context) {
        C8266c.m16401j(TAG, "Location permissions were granted. Requesting geofence and location initialization.");
        C10156b.m21418Q(context).mo44796m0();
    }
}
