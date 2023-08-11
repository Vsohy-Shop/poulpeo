package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.sb */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public final class C5132sb extends C4878dd implements C4999ke {
    /* access modifiers changed from: private */
    public static final C5132sb zzb;
    private int zzd;
    private String zze = "";
    private long zzf;
    private long zzg;
    private C5166ub zzh;

    static {
        C5132sb sbVar = new C5132sb();
        zzb = sbVar;
        C4878dd.m6907i(C5132sb.class, sbVar);
    }

    private C5132sb() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final Object mo32613r(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C4878dd.m6906f(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဉ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new C5132sb();
        } else {
            if (i2 == 4) {
                return new C5098qb((C5145t7) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
