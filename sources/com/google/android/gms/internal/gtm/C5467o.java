package com.google.android.gms.internal.gtm;

import android.content.Context;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.gtm.o */
public final class C5467o {

    /* renamed from: a */
    private final Context f6167a;

    /* renamed from: b */
    private final Context f6168b;

    public C5467o(Context context) {
        C9713p.m20275j(context);
        Context applicationContext = context.getApplicationContext();
        C9713p.m20276k(applicationContext, "Application context can't be null");
        this.f6167a = applicationContext;
        this.f6168b = applicationContext;
    }

    /* renamed from: a */
    public final Context mo33415a() {
        return this.f6167a;
    }

    /* renamed from: b */
    public final Context mo33416b() {
        return this.f6168b;
    }
}
