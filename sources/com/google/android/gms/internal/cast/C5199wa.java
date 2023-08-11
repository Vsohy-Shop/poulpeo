package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.wa */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public final class C5199wa extends C4878dd implements C4999ke {
    /* access modifiers changed from: private */
    public static final C5199wa zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        C5199wa waVar = new C5199wa();
        zzb = waVar;
        C4878dd.m6907i(C5199wa.class, waVar);
    }

    private C5199wa() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final Object mo32613r(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C4878dd.m6906f(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"zzd", "zze", C5211x5.m7676a(), "zzf", C5211x5.m7676a()});
        } else if (i2 == 3) {
            return new C5199wa();
        } else {
            if (i2 == 4) {
                return new C5182va((C5145t7) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
