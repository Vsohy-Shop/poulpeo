package com.google.android.gms.internal.gtm;

import android.content.Context;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.gtm.o1 */
public final class C5469o1<T extends Context> {

    /* renamed from: a */
    private static Boolean f6173a;

    /* renamed from: a */
    public static boolean m8268a(Context context) {
        C9713p.m20275j(context);
        Boolean bool = f6173a;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean n = C5502q1.m8407n(context, "com.google.android.gms.analytics.AnalyticsService");
        f6173a = Boolean.valueOf(n);
        return n;
    }
}
