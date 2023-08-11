package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.m4 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
public final class C5855m4 extends C6003v8<C5855m4, C5839l4> implements C6068z9 {
    /* access modifiers changed from: private */
    public static final C5855m4 zza;
    private int zze;
    private String zzf = "";
    private long zzg;

    static {
        C5855m4 m4Var = new C5855m4();
        zza = m4Var;
        C6003v8.m10158o(C5855m4.class, m4Var);
    }

    private C5855m4() {
    }

    /* renamed from: w */
    public static C5839l4 m9625w() {
        return (C5839l4) zza.mo34556p();
    }

    /* renamed from: y */
    static /* synthetic */ void m9627y(C5855m4 m4Var, String str) {
        str.getClass();
        m4Var.zze |= 1;
        m4Var.zzf = str;
    }

    /* renamed from: z */
    static /* synthetic */ void m9628z(C5855m4 m4Var, long j) {
        m4Var.zze |= 2;
        m4Var.zzg = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final Object mo33646v(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C6003v8.m10157n(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new C5855m4();
        } else {
            if (i2 == 4) {
                return new C5839l4((C5669b4) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
