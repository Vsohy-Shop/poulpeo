package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.oa */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public final class C5063oa extends C4878dd implements C4999ke {
    /* access modifiers changed from: private */
    public static final C5063oa zzb;
    private int zzd;
    private int zze;
    private String zzf = "";

    static {
        C5063oa oaVar = new C5063oa();
        zzb = oaVar;
        C4878dd.m6907i(C5063oa.class, oaVar);
    }

    private C5063oa() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final Object mo32613r(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C4878dd.m6906f(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        } else if (i2 == 3) {
            return new C5063oa();
        } else {
            if (i2 == 4) {
                return new C5046na((C5145t7) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
