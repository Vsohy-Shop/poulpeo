package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.j8 */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public final class C4976j8 extends C4878dd implements C4999ke {
    /* access modifiers changed from: private */
    public static final C4976j8 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        C4976j8 j8Var = new C4976j8();
        zzb = j8Var;
        C4878dd.m6907i(C4976j8.class, j8Var);
    }

    private C4976j8() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final Object mo32613r(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C4878dd.m6906f(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဌ\u0002\u0004င\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", C5176v4.m7563a(), "zzh"});
        } else if (i2 == 3) {
            return new C4976j8();
        } else {
            if (i2 == 4) {
                return new C4959i8((C5145t7) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
