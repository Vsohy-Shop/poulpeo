package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.ib */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public final class C4962ib extends C4878dd implements C4999ke {
    /* access modifiers changed from: private */
    public static final C4962ib zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private C4837b8 zzg;

    static {
        C4962ib ibVar = new C4962ib();
        zzb = ibVar;
        C4878dd.m6907i(C4962ib.class, ibVar);
    }

    private C4962ib() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final Object mo32613r(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C4878dd.m6906f(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဋ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", C5093q6.m7372a(), "zzf", "zzg"});
        } else if (i2 == 3) {
            return new C4962ib();
        } else {
            if (i2 == 4) {
                return new C4945hb((C5145t7) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
