package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.d8 */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public final class C4873d8 extends C4878dd implements C4999ke {
    /* access modifiers changed from: private */
    public static final C4873d8 zzb;
    private int zzd;
    private int zze;
    private boolean zzf;
    private int zzg;
    private boolean zzh;
    private C5015ld zzi = C4878dd.m6903c();
    private C5015ld zzj = C4878dd.m6903c();
    private String zzk = "";

    static {
        C4873d8 d8Var = new C4873d8();
        zzb = d8Var;
        C4878dd.m6907i(C4873d8.class, d8Var);
    }

    private C4873d8() {
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
            return C4878dd.m6906f(zzb, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0002\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဌ\u0002\u0004ဇ\u0003\u0007\u001b\b\u001b\tဈ\u0004", new Object[]{"zzd", "zze", C4936h2.m7027a(), "zzf", "zzg", C5243z3.m7719a(), "zzh", "zzi", cls, "zzj", cls, "zzk"});
        } else if (i2 == 3) {
            return new C4873d8();
        } else {
            if (i2 == 4) {
                return new C4855c8((C5145t7) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
