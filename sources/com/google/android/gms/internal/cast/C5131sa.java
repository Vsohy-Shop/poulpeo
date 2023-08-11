package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.sa */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public final class C5131sa extends C4878dd implements C4999ke {
    /* access modifiers changed from: private */
    public static final C5131sa zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        C5131sa saVar = new C5131sa();
        zzb = saVar;
        C4878dd.m6907i(C5131sa.class, saVar);
    }

    private C5131sa() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final Object mo32613r(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C4878dd.m6906f(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဌ\u0001\u0003င\u0002", new Object[]{"zzd", "zze", "zzf", C5058o5.m7300a(), "zzg"});
        } else if (i2 == 3) {
            return new C5131sa();
        } else {
            if (i2 == 4) {
                return new C5114ra((C5145t7) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
