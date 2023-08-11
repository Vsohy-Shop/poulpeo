package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.a9 */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public final class C4820a9 extends C4878dd implements C4999ke {
    /* access modifiers changed from: private */
    public static final C4820a9 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private C4837b8 zzg;

    static {
        C4820a9 a9Var = new C4820a9();
        zzb = a9Var;
        C4878dd.m6907i(C4820a9.class, a9Var);
    }

    private C4820a9() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final Object mo32613r(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C4878dd.m6906f(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဋ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", C5141t3.m7506a(), "zzf", "zzg"});
        } else if (i2 == 3) {
            return new C4820a9();
        } else {
            if (i2 == 4) {
                return new C5248z8((C5145t7) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
