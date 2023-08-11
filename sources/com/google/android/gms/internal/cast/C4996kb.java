package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.kb */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public final class C4996kb extends C4878dd implements C4999ke {
    /* access modifiers changed from: private */
    public static final C4996kb zzb;
    private int zzd;
    private int zze;
    private C5015ld zzf = C4878dd.m6903c();
    private C5015ld zzg = C4878dd.m6903c();
    private int zzh;

    static {
        C4996kb kbVar = new C4996kb();
        zzb = kbVar;
        C4878dd.m6907i(C4996kb.class, kbVar);
    }

    private C4996kb() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final Object mo32613r(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            Class<C5063oa> cls = C5063oa.class;
            return C4878dd.m6906f(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဌ\u0000\u0002\u001b\u0003\u001b\u0004င\u0001", new Object[]{"zzd", "zze", C5195w6.m7606a(), "zzf", cls, "zzg", cls, "zzh"});
        } else if (i2 == 3) {
            return new C4996kb();
        } else {
            if (i2 == 4) {
                return new C4979jb((C5145t7) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
