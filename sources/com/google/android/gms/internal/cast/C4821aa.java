package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.aa */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public final class C4821aa extends C4878dd implements C4999ke {
    /* access modifiers changed from: private */
    public static final C4821aa zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private byte zzh = 2;

    static {
        C4821aa aaVar = new C4821aa();
        zzb = aaVar;
        C4878dd.m6907i(C4821aa.class, aaVar);
    }

    private C4821aa() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final Object mo32613r(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzh);
        }
        byte b = 1;
        if (i2 == 2) {
            return C4878dd.m6906f(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᔌ\u0000\u0002င\u0001\u0003ဌ\u0002", new Object[]{"zzd", "zze", C5227y4.m7690a(), "zzf", "zzg", C5128s7.m7443a()});
        } else if (i2 == 3) {
            return new C4821aa();
        } else {
            if (i2 == 4) {
                return new C5249z9((C5145t7) null);
            }
            if (i2 == 5) {
                return zzb;
            }
            if (obj == null) {
                b = 0;
            }
            this.zzh = b;
            return null;
        }
    }
}
