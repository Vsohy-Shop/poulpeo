package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.g4 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
public final class C5754g4 extends C6003v8<C5754g4, C5737f4> implements C6068z9 {
    /* access modifiers changed from: private */
    public static final C5754g4 zza;
    private int zze;
    private int zzf;
    private C5653a5 zzg;
    private C5653a5 zzh;
    private boolean zzi;

    static {
        C5754g4 g4Var = new C5754g4();
        zza = g4Var;
        C6003v8.m10158o(C5754g4.class, g4Var);
    }

    private C5754g4() {
    }

    /* renamed from: C */
    static /* synthetic */ void m9268C(C5754g4 g4Var, int i) {
        g4Var.zze |= 1;
        g4Var.zzf = i;
    }

    /* renamed from: D */
    static /* synthetic */ void m9269D(C5754g4 g4Var, C5653a5 a5Var) {
        a5Var.getClass();
        g4Var.zzg = a5Var;
        g4Var.zze |= 2;
    }

    /* renamed from: E */
    static /* synthetic */ void m9270E(C5754g4 g4Var, C5653a5 a5Var) {
        g4Var.zzh = a5Var;
        g4Var.zze |= 4;
    }

    /* renamed from: F */
    static /* synthetic */ void m9271F(C5754g4 g4Var, boolean z) {
        g4Var.zze |= 8;
        g4Var.zzi = z;
    }

    /* renamed from: x */
    public static C5737f4 m9272x() {
        return (C5737f4) zza.mo34556p();
    }

    /* renamed from: B */
    public final C5653a5 mo34033B() {
        C5653a5 a5Var = this.zzh;
        if (a5Var == null) {
            return C5653a5.m8738E();
        }
        return a5Var;
    }

    /* renamed from: H */
    public final boolean mo34034H() {
        return this.zzi;
    }

    /* renamed from: I */
    public final boolean mo34035I() {
        if ((this.zze & 1) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: J */
    public final boolean mo34036J() {
        if ((this.zze & 8) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: K */
    public final boolean mo34037K() {
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
            return C6003v8.m10157n(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        } else if (i2 == 3) {
            return new C5754g4();
        } else {
            if (i2 == 4) {
                return new C5737f4((C5669b4) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: w */
    public final int mo34038w() {
        return this.zzf;
    }

    /* renamed from: z */
    public final C5653a5 mo34039z() {
        C5653a5 a5Var = this.zzg;
        if (a5Var == null) {
            return C5653a5.m8738E();
        }
        return a5Var;
    }
}
