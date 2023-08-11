package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.eb */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public final class C4894eb extends C4878dd implements C4999ke {
    /* access modifiers changed from: private */
    public static final C4894eb zzb;
    private int zzd;
    private long zze;
    private boolean zzf;
    private long zzg;
    private boolean zzh;

    static {
        C4894eb ebVar = new C4894eb();
        zzb = ebVar;
        C4878dd.m6907i(C4894eb.class, ebVar);
    }

    private C4894eb() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final Object mo32613r(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C4878dd.m6906f(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဇ\u0001\u0003ဂ\u0002\u0004ဇ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new C4894eb();
        } else {
            if (i2 == 4) {
                return new C4876db((C5145t7) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
