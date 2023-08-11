package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.i4 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
public final class C5788i4 extends C6003v8<C5788i4, C5771h4> implements C6068z9 {
    /* access modifiers changed from: private */
    public static final C5788i4 zza;
    private int zze;
    private int zzf;
    private long zzg;

    static {
        C5788i4 i4Var = new C5788i4();
        zza = i4Var;
        C6003v8.m10158o(C5788i4.class, i4Var);
    }

    private C5788i4() {
    }

    /* renamed from: B */
    static /* synthetic */ void m9389B(C5788i4 i4Var, int i) {
        i4Var.zze |= 1;
        i4Var.zzf = i;
    }

    /* renamed from: C */
    static /* synthetic */ void m9390C(C5788i4 i4Var, long j) {
        i4Var.zze |= 2;
        i4Var.zzg = j;
    }

    /* renamed from: y */
    public static C5771h4 m9391y() {
        return (C5771h4) zza.mo34556p();
    }

    /* renamed from: D */
    public final boolean mo34087D() {
        if ((this.zze & 2) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: E */
    public final boolean mo34088E() {
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
            return C6003v8.m10157n(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new C5788i4();
        } else {
            if (i2 == 4) {
                return new C5771h4((C5669b4) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: w */
    public final int mo34089w() {
        return this.zzf;
    }

    /* renamed from: x */
    public final long mo34090x() {
        return this.zzg;
    }
}
