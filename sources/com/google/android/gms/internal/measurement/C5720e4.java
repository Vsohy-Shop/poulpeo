package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.e4 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
public final class C5720e4 extends C6003v8<C5720e4, C5703d4> implements C6068z9 {
    /* access modifiers changed from: private */
    public static final C5720e4 zza;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";
    private String zzl = "";

    static {
        C5720e4 e4Var = new C5720e4();
        zza = e4Var;
        C6003v8.m10158o(C5720e4.class, e4Var);
    }

    private C5720e4() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final Object mo33646v(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C6003v8.m10157n(zza, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        } else if (i2 == 3) {
            return new C5720e4();
        } else {
            if (i2 == 4) {
                return new C5703d4((C5669b4) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
