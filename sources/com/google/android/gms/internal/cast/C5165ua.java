package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.ua */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public final class C5165ua extends C4878dd implements C4999ke {
    /* access modifiers changed from: private */
    public static final C5165ua zzb;
    private int zzd;
    private C5015ld zze = C4878dd.m6903c();
    private C5015ld zzf = C4878dd.m6903c();
    private C4858cb zzg;

    static {
        C5165ua uaVar = new C5165ua();
        zzb = uaVar;
        C4878dd.m6907i(C5165ua.class, uaVar);
    }

    private C5165ua() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final Object mo32613r(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C4878dd.m6906f(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003ဉ\u0000", new Object[]{"zzd", "zze", C4962ib.class, "zzf", C4820a9.class, "zzg"});
        } else if (i2 == 3) {
            return new C5165ua();
        } else {
            if (i2 == 4) {
                return new C5148ta((C5145t7) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
