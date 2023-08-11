package com.google.android.gms.internal.gtm;

import android.content.Context;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.gtm.n1 */
public final class C5454n1 {

    /* renamed from: a */
    static Object f6137a = new Object();

    /* renamed from: b */
    private static Boolean f6138b;

    /* renamed from: a */
    public static boolean m8216a(Context context) {
        C9713p.m20275j(context);
        Boolean bool = f6138b;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean f = C5502q1.m8399f(context, "com.google.android.gms.analytics.AnalyticsReceiver", false);
        f6138b = Boolean.valueOf(f);
        return f;
    }
}
