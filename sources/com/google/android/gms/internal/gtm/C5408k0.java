package com.google.android.gms.internal.gtm;

/* renamed from: com.google.android.gms.internal.gtm.k0 */
public enum C5408k0 {
    NONE,
    GZIP;

    /* renamed from: a */
    public static C5408k0 m8107a(String str) {
        if ("GZIP".equalsIgnoreCase(str)) {
            return GZIP;
        }
        return NONE;
    }
}
