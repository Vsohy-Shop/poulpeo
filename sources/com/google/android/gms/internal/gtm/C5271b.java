package com.google.android.gms.internal.gtm;

import android.text.TextUtils;
import java.util.HashMap;
import p231t4.C9713p;
import p296z3.C10810n;

/* renamed from: com.google.android.gms.internal.gtm.b */
public final class C5271b extends C10810n<C5271b> {

    /* renamed from: a */
    private String f5834a;

    /* renamed from: b */
    private int f5835b;

    /* renamed from: c */
    private int f5836c;

    /* renamed from: d */
    private String f5837d;

    /* renamed from: e */
    private String f5838e;

    /* renamed from: f */
    private boolean f5839f;

    /* renamed from: g */
    private boolean f5840g;

    public C5271b() {
        this(false);
    }

    /* renamed from: d */
    public final /* synthetic */ void mo33104d(C10810n nVar) {
        C5271b bVar = (C5271b) nVar;
        if (!TextUtils.isEmpty(this.f5834a)) {
            bVar.f5834a = this.f5834a;
        }
        int i = this.f5835b;
        if (i != 0) {
            bVar.f5835b = i;
        }
        int i2 = this.f5836c;
        if (i2 != 0) {
            bVar.f5836c = i2;
        }
        if (!TextUtils.isEmpty(this.f5837d)) {
            bVar.f5837d = this.f5837d;
        }
        if (!TextUtils.isEmpty(this.f5838e)) {
            String str = this.f5838e;
            if (TextUtils.isEmpty(str)) {
                bVar.f5838e = null;
            } else {
                bVar.f5838e = str;
            }
        }
        boolean z = this.f5839f;
        if (z) {
            bVar.f5839f = z;
        }
        boolean z2 = this.f5840g;
        if (z2) {
            bVar.f5840g = z2;
        }
    }

    /* renamed from: e */
    public final String mo33105e() {
        return this.f5834a;
    }

    /* renamed from: f */
    public final int mo33106f() {
        return this.f5835b;
    }

    /* renamed from: g */
    public final String mo33107g() {
        return this.f5838e;
    }

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("screenName", this.f5834a);
        hashMap.put("interstitial", Boolean.valueOf(this.f5839f));
        hashMap.put("automatic", Boolean.valueOf(this.f5840g));
        hashMap.put("screenId", Integer.valueOf(this.f5835b));
        hashMap.put("referrerScreenId", Integer.valueOf(this.f5836c));
        hashMap.put("referrerScreenName", this.f5837d);
        hashMap.put("referrerUri", this.f5838e);
        return C10810n.m23055a(hashMap);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C5271b(boolean r5) {
        /*
            r4 = this;
            java.util.UUID r5 = java.util.UUID.randomUUID()
            long r0 = r5.getLeastSignificantBits()
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r0 = r0 & r2
            int r0 = (int) r0
            if (r0 == 0) goto L_0x0010
            goto L_0x0023
        L_0x0010:
            long r0 = r5.getMostSignificantBits()
            long r0 = r0 & r2
            int r0 = (int) r0
            if (r0 == 0) goto L_0x0019
            goto L_0x0023
        L_0x0019:
            java.lang.String r5 = "GAv4"
            java.lang.String r0 = "UUID.randomUUID() returned 0."
            android.util.Log.e(r5, r0)
            r0 = 2147483647(0x7fffffff, float:NaN)
        L_0x0023:
            r5 = 0
            r4.<init>(r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.C5271b.<init>(boolean):void");
    }

    private C5271b(boolean z, int i) {
        C9713p.m20277l(i);
        this.f5835b = i;
        this.f5840g = false;
    }
}
