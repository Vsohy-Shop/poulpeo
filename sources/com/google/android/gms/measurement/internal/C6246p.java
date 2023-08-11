package com.google.android.gms.measurement.internal;

import p231t4.C9713p;

/* renamed from: com.google.android.gms.measurement.internal.p */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
final class C6246p {

    /* renamed from: a */
    final String f8066a;

    /* renamed from: b */
    final String f8067b;

    /* renamed from: c */
    final long f8068c;

    /* renamed from: d */
    final long f8069d;

    /* renamed from: e */
    final long f8070e;

    /* renamed from: f */
    final long f8071f;

    /* renamed from: g */
    final long f8072g;

    /* renamed from: h */
    final Long f8073h;

    /* renamed from: i */
    final Long f8074i;

    /* renamed from: j */
    final Long f8075j;

    /* renamed from: k */
    final Boolean f8076k;

    C6246p(String str, String str2, long j, long j2, long j3, long j4, long j5, Long l, Long l2, Long l3, Boolean bool) {
        boolean z;
        boolean z2;
        boolean z3;
        long j6 = j;
        long j7 = j2;
        long j8 = j3;
        long j9 = j5;
        C9713p.m20271f(str);
        C9713p.m20271f(str2);
        boolean z4 = true;
        if (j6 >= 0) {
            z = true;
        } else {
            z = false;
        }
        C9713p.m20266a(z);
        if (j7 >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        C9713p.m20266a(z2);
        if (j8 >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        C9713p.m20266a(z3);
        C9713p.m20266a(j9 < 0 ? false : z4);
        this.f8066a = str;
        this.f8067b = str2;
        this.f8068c = j6;
        this.f8069d = j7;
        this.f8070e = j8;
        this.f8071f = j4;
        this.f8072g = j9;
        this.f8073h = l;
        this.f8074i = l2;
        this.f8075j = l3;
        this.f8076k = bool;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C6246p mo35175a(Long l, Long l2, Boolean bool) {
        Boolean bool2;
        if (bool == null || bool.booleanValue()) {
            bool2 = bool;
        } else {
            bool2 = null;
        }
        return new C6246p(this.f8066a, this.f8067b, this.f8068c, this.f8069d, this.f8070e, this.f8071f, this.f8072g, this.f8073h, l, l2, bool2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C6246p mo35176b(long j, long j2) {
        return new C6246p(this.f8066a, this.f8067b, this.f8068c, this.f8069d, this.f8070e, this.f8071f, j, Long.valueOf(j2), this.f8074i, this.f8075j, this.f8076k);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final C6246p mo35177c(long j) {
        return new C6246p(this.f8066a, this.f8067b, this.f8068c, this.f8069d, this.f8070e, j, this.f8072g, this.f8073h, this.f8074i, this.f8075j, this.f8076k);
    }
}
