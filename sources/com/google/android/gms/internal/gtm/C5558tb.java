package com.google.android.gms.internal.gtm;

/* renamed from: com.google.android.gms.internal.gtm.tb */
final class C5558tb implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ String f6340b;

    /* renamed from: c */
    private final /* synthetic */ String f6341c;

    /* renamed from: d */
    private final /* synthetic */ C5313db f6342d;

    /* renamed from: e */
    private final /* synthetic */ C5497pb f6343e;

    C5558tb(C5497pb pbVar, String str, String str2, C5313db dbVar) {
        this.f6343e = pbVar;
        this.f6340b = str;
        this.f6341c = str2;
        this.f6342d = dbVar;
    }

    public final void run() {
        this.f6343e.mo33457f(this.f6340b, this.f6341c, this.f6342d);
    }
}
