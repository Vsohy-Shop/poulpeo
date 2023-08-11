package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.s9 */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public final class C5130s9 extends C4878dd implements C4999ke {
    /* access modifiers changed from: private */
    public static final C5130s9 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        C5130s9 s9Var = new C5130s9();
        zzb = s9Var;
        C4878dd.m6907i(C5130s9.class, s9Var);
    }

    private C5130s9() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final Object mo32613r(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C4878dd.m6906f(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zzd", "zze", C5023m4.m7185a(), "zzf", "zzg"});
        } else if (i2 == 3) {
            return new C5130s9();
        } else {
            if (i2 == 4) {
                return new C5113r9((C5145t7) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
