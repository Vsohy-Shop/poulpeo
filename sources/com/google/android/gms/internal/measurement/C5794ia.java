package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.ia */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
final class C5794ia implements C5988u9 {

    /* renamed from: a */
    private final C6052y9 f7010a;

    /* renamed from: b */
    private final String f7011b;

    /* renamed from: c */
    private final Object[] f7012c;

    /* renamed from: d */
    private final int f7013d;

    C5794ia(C6052y9 y9Var, String str, Object[] objArr) {
        this.f7010a = y9Var;
        this.f7011b = str;
        this.f7012c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f7013d = charAt;
            return;
        }
        char c = charAt & 8191;
        int i = 13;
        int i2 = 1;
        while (true) {
            int i3 = i2 + 1;
            char charAt2 = str.charAt(i2);
            if (charAt2 >= 55296) {
                c |= (charAt2 & 8191) << i;
                i += 13;
                i2 = i3;
            } else {
                this.f7013d = c | (charAt2 << i);
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo34092a() {
        return this.f7011b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final Object[] mo34093b() {
        return this.f7012c;
    }

    /* renamed from: x */
    public final int mo34094x() {
        if ((this.f7013d & 1) == 1) {
            return 1;
        }
        return 2;
    }

    public final C6052y9 zza() {
        return this.f7010a;
    }

    public final boolean zzb() {
        if ((this.f7013d & 2) == 2) {
            return true;
        }
        return false;
    }
}
