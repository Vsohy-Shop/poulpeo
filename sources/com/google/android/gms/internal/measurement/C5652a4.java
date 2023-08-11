package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.a4 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
public final class C5652a4 extends C6003v8<C5652a4, C6062z3> implements C6068z9 {
    /* access modifiers changed from: private */
    public static final C5652a4 zza;
    private int zze;
    private String zzf = "";
    private String zzg = "";

    static {
        C5652a4 a4Var = new C5652a4();
        zza = a4Var;
        C6003v8.m10158o(C5652a4.class, a4Var);
    }

    private C5652a4() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final Object mo33646v(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C6003v8.m10157n(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new C5652a4();
        } else {
            if (i2 == 4) {
                return new C6062z3((C5966t3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: x */
    public final String mo33647x() {
        return this.zzf;
    }

    /* renamed from: y */
    public final String mo33648y() {
        return this.zzg;
    }
}
