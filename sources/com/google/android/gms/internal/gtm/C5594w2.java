package com.google.android.gms.internal.gtm;

import android.os.Build;

/* renamed from: com.google.android.gms.internal.gtm.w2 */
final class C5594w2 {
    /* renamed from: a */
    public static int m8624a() {
        String str;
        try {
            return Integer.parseInt(Build.VERSION.SDK);
        } catch (NumberFormatException unused) {
            String valueOf = String.valueOf(Build.VERSION.SDK);
            if (valueOf.length() != 0) {
                str = "Invalid version number: ".concat(valueOf);
            } else {
                str = new String("Invalid version number: ");
            }
            C5426l3.m8135e(str);
            return 0;
        }
    }
}
