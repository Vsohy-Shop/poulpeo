package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.n3 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
public final class C5870n3 extends C6003v8<C5870n3, C5854m3> implements C6068z9 {
    /* access modifiers changed from: private */
    public static final C5870n3 zza;
    private int zze;
    private int zzf;
    private String zzg = "";
    private C5753g3 zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    static {
        C5870n3 n3Var = new C5870n3();
        zza = n3Var;
        C6003v8.m10158o(C5870n3.class, n3Var);
    }

    private C5870n3() {
    }

    /* renamed from: C */
    static /* synthetic */ void m9663C(C5870n3 n3Var, String str) {
        n3Var.zze |= 2;
        n3Var.zzg = str;
    }

    /* renamed from: y */
    public static C5854m3 m9664y() {
        return (C5854m3) zza.mo34556p();
    }

    /* renamed from: B */
    public final String mo34198B() {
        return this.zzg;
    }

    /* renamed from: D */
    public final boolean mo34199D() {
        return this.zzi;
    }

    /* renamed from: E */
    public final boolean mo34200E() {
        return this.zzj;
    }

    /* renamed from: F */
    public final boolean mo34201F() {
        return this.zzk;
    }

    /* renamed from: H */
    public final boolean mo34202H() {
        if ((this.zze & 1) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: I */
    public final boolean mo34203I() {
        if ((this.zze & 32) != 0) {
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
            return C6003v8.m10157n(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        } else if (i2 == 3) {
            return new C5870n3();
        } else {
            if (i2 == 4) {
                return new C5854m3((C5651a3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: w */
    public final int mo34204w() {
        return this.zzf;
    }

    /* renamed from: x */
    public final C5753g3 mo34205x() {
        C5753g3 g3Var = this.zzh;
        if (g3Var == null) {
            return C5753g3.m9258x();
        }
        return g3Var;
    }
}
