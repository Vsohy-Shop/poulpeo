package com.google.android.gms.internal.gtm;

import p286y4.C10671e;

/* renamed from: com.google.android.gms.internal.gtm.e1 */
public final class C5318e1 {

    /* renamed from: a */
    private final long f5948a;

    /* renamed from: b */
    private final int f5949b;

    /* renamed from: c */
    private double f5950c;

    /* renamed from: d */
    private long f5951d;

    /* renamed from: e */
    private final Object f5952e;

    /* renamed from: f */
    private final String f5953f;

    /* renamed from: g */
    private final C10671e f5954g;

    private C5318e1(int i, long j, String str, C10671e eVar) {
        this.f5952e = new Object();
        this.f5949b = 60;
        this.f5950c = (double) 60;
        this.f5948a = 2000;
        this.f5953f = str;
        this.f5954g = eVar;
    }

    /* renamed from: a */
    public final boolean mo33184a() {
        synchronized (this.f5952e) {
            long a = this.f5954g.mo33547a();
            double d = this.f5950c;
            int i = this.f5949b;
            if (d < ((double) i)) {
                double d2 = ((double) (a - this.f5951d)) / ((double) this.f5948a);
                if (d2 > 0.0d) {
                    this.f5950c = Math.min((double) i, d + d2);
                }
            }
            this.f5951d = a;
            double d3 = this.f5950c;
            if (d3 >= 1.0d) {
                this.f5950c = d3 - 1.0d;
                return true;
            }
            String str = this.f5953f;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34);
            sb.append("Excessive ");
            sb.append(str);
            sb.append(" detected; call ignored.");
            C5333f1.m7924c(sb.toString());
            return false;
        }
    }

    public C5318e1(String str, C10671e eVar) {
        this(60, 2000, str, eVar);
    }
}
