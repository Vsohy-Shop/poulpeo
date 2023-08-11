package com.google.android.gms.internal.gtm;

import android.os.Build;

/* renamed from: com.google.android.gms.internal.gtm.v0 */
public final class C5577v0 {
    /* renamed from: a */
    public static int m8575a() {
        try {
            return Integer.parseInt(Build.VERSION.SDK);
        } catch (NumberFormatException unused) {
            C5333f1.m7925d("Invalid version number", Build.VERSION.SDK);
            return 0;
        }
    }
}
