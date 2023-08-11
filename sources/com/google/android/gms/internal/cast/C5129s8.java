package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.s8 */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public final class C5129s8 extends C4878dd implements C4999ke {
    /* access modifiers changed from: private */
    public static final C5129s8 zzb;
    private int zzd;
    private String zze = "";
    private long zzf;

    static {
        C5129s8 s8Var = new C5129s8();
        zzb = s8Var;
        C4878dd.m6907i(C5129s8.class, s8Var);
    }

    private C5129s8() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final Object mo32613r(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C4878dd.m6906f(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        } else if (i2 == 3) {
            return new C5129s8();
        } else {
            if (i2 == 4) {
                return new C5112r8((C5145t7) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
