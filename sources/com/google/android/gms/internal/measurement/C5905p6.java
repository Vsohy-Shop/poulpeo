package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;

/* renamed from: com.google.android.gms.internal.measurement.p6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
public final class C5905p6 {

    /* renamed from: a */
    final String f7266a;

    /* renamed from: b */
    final Uri f7267b;

    /* renamed from: c */
    final String f7268c;

    /* renamed from: d */
    final String f7269d;

    /* renamed from: e */
    final boolean f7270e;

    /* renamed from: f */
    final boolean f7271f;

    /* renamed from: g */
    final boolean f7272g;

    /* renamed from: h */
    final boolean f7273h;

    private C5905p6(String str, Uri uri, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, C6017w6<Context, Boolean> w6Var) {
        this.f7266a = null;
        this.f7267b = uri;
        this.f7268c = "";
        this.f7269d = "";
        this.f7270e = z;
        this.f7271f = false;
        this.f7272g = false;
        this.f7273h = false;
    }

    /* renamed from: a */
    public final C5905p6 mo34261a() {
        if (this.f7268c.isEmpty()) {
            return new C5905p6((String) null, this.f7267b, this.f7268c, this.f7269d, true, false, false, false, (C6017w6<Context, Boolean>) null);
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    /* renamed from: b */
    public final C5953s6<Double> mo34262b(String str, double d) {
        return new C5873n6(this, "measurement.test.double_flag", Double.valueOf(-3.0d), true);
    }

    /* renamed from: c */
    public final C5953s6<Long> mo34263c(String str, long j) {
        return new C5841l6(this, str, Long.valueOf(j), true);
    }

    /* renamed from: d */
    public final C5953s6<String> mo34264d(String str, String str2) {
        return new C5889o6(this, str, str2, true);
    }

    /* renamed from: e */
    public final C5953s6<Boolean> mo34265e(String str, boolean z) {
        return new C5857m6(this, str, Boolean.valueOf(z), true);
    }

    public C5905p6(Uri uri) {
        this((String) null, uri, "", "", false, false, false, false, (C6017w6<Context, Boolean>) null);
    }
}
