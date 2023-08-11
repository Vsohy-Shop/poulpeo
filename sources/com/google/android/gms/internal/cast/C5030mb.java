package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.mb */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public final class C5030mb extends C4878dd implements C4999ke {
    /* access modifiers changed from: private */
    public static final C5030mb zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private C5015ld zzg = C4878dd.m6903c();
    private C5015ld zzh = C4878dd.m6903c();
    private int zzi;

    static {
        C5030mb mbVar = new C5030mb();
        zzb = mbVar;
        C4878dd.m6907i(C5030mb.class, mbVar);
    }

    private C5030mb() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final Object mo32613r(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            Class<C4856c9> cls = C4856c9.class;
            return C4878dd.m6906f(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003\u001b\u0004\u001b\u0005ဌ\u0002", new Object[]{"zzd", "zze", C5246z6.m7720a(), "zzf", C4854c7.m6840a(), "zzg", cls, "zzh", cls, "zzi", C5243z3.m7719a()});
        } else if (i2 == 3) {
            return new C5030mb();
        } else {
            if (i2 == 4) {
                return new C5013lb((C5145t7) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
