package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.ma */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public final class C5029ma extends C4878dd implements C4999ke {
    /* access modifiers changed from: private */
    public static final C5029ma zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        C5029ma maVar = new C5029ma();
        zzb = maVar;
        C4878dd.m6907i(C5029ma.class, maVar);
    }

    private C5029ma() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final Object mo32613r(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C4878dd.m6906f(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new C5029ma();
        } else {
            if (i2 == 4) {
                return new C5012la((C5145t7) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
