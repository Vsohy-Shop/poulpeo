package com.google.android.gms.internal.gtm;

/* renamed from: com.google.android.gms.internal.gtm.ub */
final class C5573ub implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ String f6361b;

    /* renamed from: c */
    private final /* synthetic */ byte[] f6362c;

    /* renamed from: d */
    private final /* synthetic */ C5497pb f6363d;

    C5573ub(C5497pb pbVar, String str, byte[] bArr) {
        this.f6363d = pbVar;
        this.f6361b = str;
        this.f6362c = bArr;
    }

    public final void run() {
        this.f6363d.mo33458g(this.f6361b, this.f6362c);
    }
}
