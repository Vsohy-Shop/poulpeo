package com.google.android.gms.internal.gtm;

/* renamed from: com.google.android.gms.internal.gtm.sb */
final class C5542sb implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ String f6309b;

    /* renamed from: c */
    private final /* synthetic */ C5313db f6310c;

    /* renamed from: d */
    private final /* synthetic */ C5497pb f6311d;

    C5542sb(C5497pb pbVar, String str, C5313db dbVar) {
        this.f6311d = pbVar;
        this.f6309b = str;
        this.f6310c = dbVar;
    }

    public final void run() {
        this.f6311d.mo33456e(this.f6309b, this.f6310c);
    }
}
