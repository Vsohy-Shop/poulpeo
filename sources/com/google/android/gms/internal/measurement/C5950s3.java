package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.s3 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
public final class C5950s3 extends C6003v8<C5950s3, C5886o3> implements C6068z9 {
    /* access modifiers changed from: private */
    public static final C5950s3 zza;
    private int zze;
    private int zzf;
    private String zzg = "";
    private boolean zzh;
    private C5691c9<String> zzi = C6003v8.m10154k();

    static {
        C5950s3 s3Var = new C5950s3();
        zza = s3Var;
        C6003v8.m10158o(C5950s3.class, s3Var);
    }

    private C5950s3() {
    }

    /* renamed from: y */
    public static C5950s3 m9851y() {
        return zza;
    }

    /* renamed from: B */
    public final List<String> mo34339B() {
        return this.zzi;
    }

    /* renamed from: C */
    public final boolean mo34340C() {
        return this.zzh;
    }

    /* renamed from: D */
    public final boolean mo34341D() {
        if ((this.zze & 4) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: E */
    public final boolean mo34342E() {
        if ((this.zze & 2) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: F */
    public final boolean mo34343F() {
        if ((this.zze & 1) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: H */
    public final int mo34344H() {
        int a = C5934r3.m9821a(this.zzf);
        if (a == 0) {
            return 1;
        }
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final Object mo33646v(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C6003v8.m10157n(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zze", "zzf", C5918q3.f7303a, "zzg", "zzh", "zzi"});
        } else if (i2 == 3) {
            return new C5950s3();
        } else {
            if (i2 == 4) {
                return new C5886o3((C5651a3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: w */
    public final int mo34345w() {
        return this.zzi.size();
    }

    /* renamed from: z */
    public final String mo34346z() {
        return this.zzg;
    }
}
