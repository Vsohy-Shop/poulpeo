package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.l3 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
public final class C5838l3 extends C6003v8<C5838l3, C5770h3> implements C6068z9 {
    /* access modifiers changed from: private */
    public static final C5838l3 zza;
    private int zze;
    private int zzf;
    private boolean zzg;
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";

    static {
        C5838l3 l3Var = new C5838l3();
        zza = l3Var;
        C6003v8.m10158o(C5838l3.class, l3Var);
    }

    private C5838l3() {
    }

    /* renamed from: x */
    public static C5838l3 m9534x() {
        return zza;
    }

    /* renamed from: B */
    public final String mo34150B() {
        return this.zzi;
    }

    /* renamed from: C */
    public final boolean mo34151C() {
        return this.zzg;
    }

    /* renamed from: D */
    public final boolean mo34152D() {
        if ((this.zze & 1) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: E */
    public final boolean mo34153E() {
        if ((this.zze & 4) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: F */
    public final boolean mo34154F() {
        if ((this.zze & 2) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: H */
    public final boolean mo34155H() {
        if ((this.zze & 16) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: I */
    public final boolean mo34156I() {
        if ((this.zze & 8) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: J */
    public final int mo34157J() {
        int a = C5821k3.m9479a(this.zzf);
        if (a == 0) {
            return 1;
        }
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final Object mo33646v(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C6003v8.m10157n(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zze", "zzf", C5804j3.f7021a, "zzg", "zzh", "zzi", "zzj"});
        } else if (i2 == 3) {
            return new C5838l3();
        } else {
            if (i2 == 4) {
                return new C5770h3((C5651a3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: y */
    public final String mo34158y() {
        return this.zzh;
    }

    /* renamed from: z */
    public final String mo34159z() {
        return this.zzj;
    }
}
