package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.g9 */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public final class C4926g9 extends C4878dd implements C4999ke {
    /* access modifiers changed from: private */
    public static final C4926g9 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private C5015ld zzh = C4878dd.m6903c();

    static {
        C4926g9 g9Var = new C4926g9();
        zzb = g9Var;
        C4878dd.m6907i(C4926g9.class, g9Var);
    }

    private C4926g9() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final Object mo32613r(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C4878dd.m6906f(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004\u001b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", C4909f9.class});
        } else if (i2 == 3) {
            return new C4926g9();
        } else {
            if (i2 == 4) {
                return new C4874d9((C5145t7) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
