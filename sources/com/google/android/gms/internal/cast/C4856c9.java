package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.c9 */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public final class C4856c9 extends C4878dd implements C4999ke {
    /* access modifiers changed from: private */
    public static final C4856c9 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        C4856c9 c9Var = new C4856c9();
        zzb = c9Var;
        C4878dd.m6907i(C4856c9.class, c9Var);
    }

    private C4856c9() {
    }

    /* renamed from: A */
    static /* synthetic */ void m6841A(C4856c9 c9Var, String str) {
        str.getClass();
        c9Var.zzd |= 1;
        c9Var.zze = str;
    }

    /* renamed from: y */
    public static C4838b9 m6842y() {
        return (C4838b9) zzb.mo32743t();
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
            return new C4856c9();
        } else {
            if (i2 == 4) {
                return new C4838b9((C5145t7) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
