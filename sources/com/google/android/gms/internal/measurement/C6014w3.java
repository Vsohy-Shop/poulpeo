package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.w3 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
public final class C6014w3 extends C6003v8<C6014w3, C5982u3> implements C6068z9 {
    /* access modifiers changed from: private */
    public static final C6014w3 zza;
    private int zze;
    private String zzf = "";
    private boolean zzg;
    private boolean zzh;
    private int zzi;

    static {
        C6014w3 w3Var = new C6014w3();
        zza = w3Var;
        C6003v8.m10158o(C6014w3.class, w3Var);
    }

    private C6014w3() {
    }

    /* renamed from: z */
    static /* synthetic */ void m10185z(C6014w3 w3Var, String str) {
        str.getClass();
        w3Var.zze |= 1;
        w3Var.zzf = str;
    }

    /* renamed from: B */
    public final boolean mo34565B() {
        return this.zzg;
    }

    /* renamed from: C */
    public final boolean mo34566C() {
        return this.zzh;
    }

    /* renamed from: D */
    public final boolean mo34567D() {
        if ((this.zze & 2) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: E */
    public final boolean mo34568E() {
        if ((this.zze & 4) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: F */
    public final boolean mo34569F() {
        if ((this.zze & 8) != 0) {
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
            return C6003v8.m10157n(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        } else if (i2 == 3) {
            return new C6014w3();
        } else {
            if (i2 == 4) {
                return new C5982u3((C5966t3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: w */
    public final int mo34570w() {
        return this.zzi;
    }

    /* renamed from: y */
    public final String mo34571y() {
        return this.zzf;
    }
}
