package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.ab */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public final class C4822ab extends C4878dd implements C4999ke {
    /* access modifiers changed from: private */
    public static final C4822ab zzb;
    private int zzd;
    private String zze = "";
    private C5015ld zzf = C4878dd.m6903c();
    private C5015ld zzg = C4878dd.m6903c();
    private boolean zzh;

    static {
        C4822ab abVar = new C4822ab();
        zzb = abVar;
        C4878dd.m6907i(C4822ab.class, abVar);
    }

    private C4822ab() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final Object mo32613r(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C4878dd.m6906f(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001", new Object[]{"zzd", "zze", "zzf", C5130s9.class, "zzg", C4856c9.class, "zzh"});
        } else if (i2 == 3) {
            return new C4822ab();
        } else {
            if (i2 == 4) {
                return new C5250za((C5145t7) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
