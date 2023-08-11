package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.w8 */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public final class C5197w8 extends C4878dd implements C4999ke {
    /* access modifiers changed from: private */
    public static final C5197w8 zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        C5197w8 w8Var = new C5197w8();
        zzb = w8Var;
        C4878dd.m6907i(C5197w8.class, w8Var);
    }

    private C5197w8() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final Object mo32613r(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C4878dd.m6906f(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"zzd", "zze", C5039n3.m7253a(), "zzf", C4971j3.m7086a()});
        } else if (i2 == 3) {
            return new C5197w8();
        } else {
            if (i2 == 4) {
                return new C5180v8((C5145t7) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
