package com.google.android.gms.internal.gtm;

import p286y4.C10671e;
import p286y4.C10674h;

/* renamed from: com.google.android.gms.internal.gtm.c4 */
final class C5291c4 implements C5565u3 {

    /* renamed from: a */
    private final long f5895a;

    /* renamed from: b */
    private final int f5896b;

    /* renamed from: c */
    private double f5897c;

    /* renamed from: d */
    private long f5898d;

    /* renamed from: e */
    private final Object f5899e;

    /* renamed from: f */
    private C10671e f5900f;

    private C5291c4(int i, long j) {
        this.f5899e = new Object();
        this.f5896b = 60;
        this.f5897c = (double) 60;
        this.f5895a = 2000;
        this.f5900f = C10674h.m22680c();
    }

    /* renamed from: a */
    public final boolean mo33157a() {
        synchronized (this.f5899e) {
            long a = this.f5900f.mo33547a();
            double d = this.f5897c;
            int i = this.f5896b;
            if (d < ((double) i)) {
                double d2 = ((double) (a - this.f5898d)) / ((double) this.f5895a);
                if (d2 > 0.0d) {
                    this.f5897c = Math.min((double) i, d + d2);
                }
            }
            this.f5898d = a;
            double d3 = this.f5897c;
            if (d3 >= 1.0d) {
                this.f5897c = d3 - 1.0d;
                return true;
            }
            C5426l3.m8134d("No more tokens available.");
            return false;
        }
    }

    public C5291c4() {
        this(60, 2000);
    }
}
