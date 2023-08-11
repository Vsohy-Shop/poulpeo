package com.google.android.gms.internal.gtm;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.gtm.c5 */
final class C5292c5 implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ String f5901b;

    /* renamed from: c */
    private final /* synthetic */ String f5902c;

    /* renamed from: d */
    private final /* synthetic */ String f5903d;

    /* renamed from: e */
    private final /* synthetic */ C5320e3 f5904e;

    /* renamed from: f */
    private final /* synthetic */ C5277b5 f5905f;

    C5292c5(C5277b5 b5Var, String str, String str2, String str3, C5320e3 e3Var) {
        this.f5905f = b5Var;
        this.f5901b = str;
        this.f5902c = str2;
        this.f5903d = str3;
        this.f5904e = e3Var;
    }

    public final void run() {
        boolean z;
        try {
            z = true;
            if (!this.f5905f.f5873a.containsKey(this.f5901b)) {
                this.f5905f.f5873a.put(this.f5901b, this.f5905f.f5875c.mo33419a(this.f5901b, this.f5902c, this.f5903d));
            }
        } catch (Exception e) {
            C5503q2.m8409b("Fail to load container: ", e, this.f5905f.f5877e);
            z = false;
        }
        try {
            C5320e3 e3Var = this.f5904e;
            if (e3Var != null) {
                e3Var.mo33185Y(z, this.f5901b);
            }
        } catch (RemoteException e2) {
            C5503q2.m8409b("Error relaying callback: ", e2, this.f5905f.f5877e);
        }
    }
}
