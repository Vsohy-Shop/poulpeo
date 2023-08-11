package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.y4 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
public final class C6047y4 extends C6003v8<C6047y4, C5999v4> implements C6068z9 {
    /* access modifiers changed from: private */
    public static final C6047y4 zza;
    private int zze;
    private int zzf = 1;
    private C5691c9<C5855m4> zzg = C6003v8.m10154k();

    static {
        C6047y4 y4Var = new C6047y4();
        zza = y4Var;
        C6003v8.m10158o(C6047y4.class, y4Var);
    }

    private C6047y4() {
    }

    /* renamed from: w */
    public static C5999v4 m10293w() {
        return (C5999v4) zza.mo34556p();
    }

    /* renamed from: y */
    static /* synthetic */ void m10295y(C6047y4 y4Var, C5855m4 m4Var) {
        m4Var.getClass();
        C5691c9<C5855m4> c9Var = y4Var.zzg;
        if (!c9Var.mo33774x()) {
            y4Var.zzg = C6003v8.m10155l(c9Var);
        }
        y4Var.zzg.add(m4Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final Object mo33646v(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C6003v8.m10157n(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"zze", "zzf", C6031x4.f7469a, "zzg", C5855m4.class});
        } else if (i2 == 3) {
            return new C6047y4();
        } else {
            if (i2 == 4) {
                return new C5999v4((C5669b4) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
