package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.g3 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
public final class C5753g3 extends C6003v8<C5753g3, C5736f3> implements C6068z9 {
    /* access modifiers changed from: private */
    public static final C5753g3 zza;
    private int zze;
    private C5950s3 zzf;
    private C5838l3 zzg;
    private boolean zzh;
    private String zzi = "";

    static {
        C5753g3 g3Var = new C5753g3();
        zza = g3Var;
        C6003v8.m10158o(C5753g3.class, g3Var);
    }

    private C5753g3() {
    }

    /* renamed from: C */
    static /* synthetic */ void m9256C(C5753g3 g3Var, String str) {
        g3Var.zze |= 8;
        g3Var.zzi = str;
    }

    /* renamed from: x */
    public static C5753g3 m9258x() {
        return zza;
    }

    /* renamed from: B */
    public final String mo34025B() {
        return this.zzi;
    }

    /* renamed from: D */
    public final boolean mo34026D() {
        return this.zzh;
    }

    /* renamed from: E */
    public final boolean mo34027E() {
        if ((this.zze & 4) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: F */
    public final boolean mo34028F() {
        if ((this.zze & 2) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: H */
    public final boolean mo34029H() {
        if ((this.zze & 8) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: I */
    public final boolean mo34030I() {
        if ((this.zze & 1) != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final Object mo33646v(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C6003v8.m10157n(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        } else if (i2 == 3) {
            return new C5753g3();
        } else {
            if (i2 == 4) {
                return new C5736f3((C5651a3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: y */
    public final C5838l3 mo34031y() {
        C5838l3 l3Var = this.zzg;
        if (l3Var == null) {
            return C5838l3.m9534x();
        }
        return l3Var;
    }

    /* renamed from: z */
    public final C5950s3 mo34032z() {
        C5950s3 s3Var = this.zzf;
        if (s3Var == null) {
            return C5950s3.m9851y();
        }
        return s3Var;
    }
}
