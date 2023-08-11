package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.ea */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public final class C4893ea extends C4878dd implements C4999ke {
    /* access modifiers changed from: private */
    public static final C4893ea zzb;
    private int zzd;
    private int zze;
    private long zzf;
    private int zzg;

    static {
        C4893ea eaVar = new C4893ea();
        zzb = eaVar;
        C4878dd.m6907i(C4893ea.class, eaVar);
    }

    private C4893ea() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final Object mo32613r(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C4878dd.m6906f(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ဌ\u0002", new Object[]{"zzd", "zze", C4834b5.m6816a(), "zzf", "zzg", C5157u2.m7521a()});
        } else if (i2 == 3) {
            return new C4893ea();
        } else {
            if (i2 == 4) {
                return new C4875da((C5145t7) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
