package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.f8 */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public final class C4908f8 extends C4878dd implements C4999ke {
    /* access modifiers changed from: private */
    public static final C4908f8 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        C4908f8 f8Var = new C4908f8();
        zzb = f8Var;
        C4878dd.m6907i(C4908f8.class, f8Var);
    }

    private C4908f8() {
    }

    /* renamed from: A */
    static /* synthetic */ void m6972A(C4908f8 f8Var, String str) {
        str.getClass();
        f8Var.zzd |= 1;
        f8Var.zze = str;
    }

    /* renamed from: B */
    static /* synthetic */ void m6973B(C4908f8 f8Var, String str) {
        str.getClass();
        f8Var.zzd |= 2;
        f8Var.zzf = str;
    }

    /* renamed from: y */
    public static C4891e8 m6974y() {
        return (C4891e8) zzb.mo32743t();
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final Object mo32613r(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C4878dd.m6906f(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        } else if (i2 == 3) {
            return new C4908f8();
        } else {
            if (i2 == 4) {
                return new C4891e8((C5145t7) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
