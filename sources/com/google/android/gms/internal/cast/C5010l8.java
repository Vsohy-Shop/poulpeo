package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.l8 */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public final class C5010l8 extends C4878dd implements C4999ke {
    /* access modifiers changed from: private */
    public static final C5010l8 zzb;
    private int zzd;
    private int zze;

    static {
        C5010l8 l8Var = new C5010l8();
        zzb = l8Var;
        C4878dd.m6907i(C5010l8.class, l8Var);
    }

    private C5010l8() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final Object mo32613r(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C4878dd.m6906f(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"zzd", "zze", C5208x2.m7675a()});
        } else if (i2 == 3) {
            return new C5010l8();
        } else {
            if (i2 == 4) {
                return new C4993k8((C5145t7) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
