package com.google.android.gms.internal.gtm;

import android.content.Context;
import p286y4.C10673g;

/* renamed from: com.google.android.gms.internal.gtm.q2 */
final class C5503q2 {
    /* renamed from: a */
    public static void m8408a(String str, Context context) {
        C5426l3.m8135e(str);
        if (C10673g.m22679a(context, new RuntimeException(str))) {
            C5426l3.m8133c("Crash reported successfully.");
        } else {
            C5426l3.m8133c("Failed to report crash");
        }
    }

    /* renamed from: b */
    public static void m8409b(String str, Throwable th, Context context) {
        C5426l3.m8132b(str, th);
        if (C10673g.m22679a(context, th)) {
            C5426l3.m8133c("Crash reported successfully.");
        } else {
            C5426l3.m8133c("Failed to report crash");
        }
    }

    /* renamed from: c */
    public static void m8410c(String str, Context context) {
        C5426l3.m8134d(str);
        if (C10673g.m22679a(context, new RuntimeException(str))) {
            C5426l3.m8133c("Crash reported successfully.");
        } else {
            C5426l3.m8133c("Failed to report crash");
        }
    }
}
