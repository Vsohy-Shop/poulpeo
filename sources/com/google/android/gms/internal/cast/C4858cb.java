package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.cb */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public final class C4858cb extends C4878dd implements C4999ke {
    /* access modifiers changed from: private */
    public static final C4858cb zzb;
    private int zzd;
    private C4837b8 zze;

    static {
        C4858cb cbVar = new C4858cb();
        zzb = cbVar;
        C4878dd.m6907i(C4858cb.class, cbVar);
    }

    private C4858cb() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final Object mo32613r(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C4878dd.m6906f(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zzd", "zze"});
        } else if (i2 == 3) {
            return new C4858cb();
        } else {
            if (i2 == 4) {
                return new C4840bb((C5145t7) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
