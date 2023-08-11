package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.e5 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
public final class C5721e5 extends C6003v8<C5721e5, C5704d5> implements C6068z9 {
    /* access modifiers changed from: private */
    public static final C5721e5 zza;
    private int zze;
    private long zzf;
    private String zzg = "";
    private String zzh = "";
    private long zzi;
    private float zzj;
    private double zzk;

    static {
        C5721e5 e5Var = new C5721e5();
        zza = e5Var;
        C6003v8.m10158o(C5721e5.class, e5Var);
    }

    private C5721e5() {
    }

    /* renamed from: E */
    static /* synthetic */ void m9086E(C5721e5 e5Var, long j) {
        e5Var.zze |= 1;
        e5Var.zzf = j;
    }

    /* renamed from: F */
    static /* synthetic */ void m9087F(C5721e5 e5Var, String str) {
        str.getClass();
        e5Var.zze |= 2;
        e5Var.zzg = str;
    }

    /* renamed from: H */
    static /* synthetic */ void m9088H(C5721e5 e5Var, String str) {
        str.getClass();
        e5Var.zze |= 4;
        e5Var.zzh = str;
    }

    /* renamed from: I */
    static /* synthetic */ void m9089I(C5721e5 e5Var) {
        e5Var.zze &= -5;
        e5Var.zzh = zza.zzh;
    }

    /* renamed from: J */
    static /* synthetic */ void m9090J(C5721e5 e5Var, long j) {
        e5Var.zze |= 8;
        e5Var.zzi = j;
    }

    /* renamed from: K */
    static /* synthetic */ void m9091K(C5721e5 e5Var) {
        e5Var.zze &= -9;
        e5Var.zzi = 0;
    }

    /* renamed from: L */
    static /* synthetic */ void m9092L(C5721e5 e5Var, double d) {
        e5Var.zze |= 32;
        e5Var.zzk = d;
    }

    /* renamed from: M */
    static /* synthetic */ void m9093M(C5721e5 e5Var) {
        e5Var.zze &= -33;
        e5Var.zzk = 0.0d;
    }

    /* renamed from: z */
    public static C5704d5 m9094z() {
        return (C5704d5) zza.mo34556p();
    }

    /* renamed from: C */
    public final String mo33891C() {
        return this.zzg;
    }

    /* renamed from: D */
    public final String mo33892D() {
        return this.zzh;
    }

    /* renamed from: N */
    public final boolean mo33893N() {
        if ((this.zze & 32) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: O */
    public final boolean mo33894O() {
        if ((this.zze & 8) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: P */
    public final boolean mo33895P() {
        if ((this.zze & 1) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: Q */
    public final boolean mo33896Q() {
        if ((this.zze & 4) != 0) {
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
            return C6003v8.m10157n(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        } else if (i2 == 3) {
            return new C5721e5();
        } else {
            if (i2 == 4) {
                return new C5704d5((C5669b4) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: w */
    public final double mo33897w() {
        return this.zzk;
    }

    /* renamed from: x */
    public final long mo33898x() {
        return this.zzi;
    }

    /* renamed from: y */
    public final long mo33899y() {
        return this.zzf;
    }
}
