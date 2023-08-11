package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.u9 */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public final class C5164u9 extends C4878dd implements C4999ke {
    /* access modifiers changed from: private */
    public static final C5164u9 zzb;
    private int zzd;
    private C5015ld zze = C4878dd.m6903c();
    private boolean zzf;
    private boolean zzg;
    private long zzh;

    static {
        C5164u9 u9Var = new C5164u9();
        zzb = u9Var;
        C4878dd.m6907i(C5164u9.class, u9Var);
    }

    private C5164u9() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final Object mo32613r(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C4878dd.m6906f(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001b\u0002ဇ\u0000\u0003ဇ\u0001\u0004ဂ\u0002", new Object[]{"zzd", "zze", C5011l9.class, "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new C5164u9();
        } else {
            if (i2 == 4) {
                return new C5147t9((C5145t7) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
