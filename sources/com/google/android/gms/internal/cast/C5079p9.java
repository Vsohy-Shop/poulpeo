package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.p9 */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public final class C5079p9 extends C4878dd implements C4999ke {
    /* access modifiers changed from: private */
    public static final C5079p9 zzb;
    private int zzd;
    private int zze;

    static {
        C5079p9 p9Var = new C5079p9();
        zzb = p9Var;
        C4878dd.m6907i(C5079p9.class, p9Var);
    }

    private C5079p9() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final Object mo32613r(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C4878dd.m6906f(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"zzd", "zze", C5023m4.m7185a()});
        } else if (i2 == 3) {
            return new C5079p9();
        } else {
            if (i2 == 4) {
                return new C5062o9((C5145t7) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
