package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.ia */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public final class C4961ia extends C4878dd implements C4999ke {
    /* access modifiers changed from: private */
    public static final C4961ia zzb;
    private int zzd;
    private long zze;
    private C4998kd zzf = C4878dd.m6911x();
    private C4998kd zzg = C4878dd.m6911x();

    static {
        C4961ia iaVar = new C4961ia();
        zzb = iaVar;
        C4878dd.m6907i(C4961ia.class, iaVar);
    }

    private C4961ia() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final Object mo32613r(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C4878dd.m6906f(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001စ\u0000\u0002\u0017\u0003\u0017", new Object[]{"zzd", "zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new C4961ia();
        } else {
            if (i2 == 4) {
                return new C4944ha((C5145t7) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
