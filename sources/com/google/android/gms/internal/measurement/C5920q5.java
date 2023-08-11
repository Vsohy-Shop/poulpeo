package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.q5 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
public final class C5920q5 extends C6003v8<C5920q5, C5856m5> implements C6068z9 {
    /* access modifiers changed from: private */
    public static final C5920q5 zza;
    private int zze;
    private int zzf;
    private C5691c9<C5920q5> zzg = C6003v8.m10154k();
    private String zzh = "";
    private String zzi = "";
    private boolean zzj;
    private double zzk;

    static {
        C5920q5 q5Var = new C5920q5();
        zza = q5Var;
        C6003v8.m10158o(C5920q5.class, q5Var);
    }

    private C5920q5() {
    }

    /* renamed from: B */
    public final List<C5920q5> mo34278B() {
        return this.zzg;
    }

    /* renamed from: C */
    public final boolean mo34279C() {
        return this.zzj;
    }

    /* renamed from: D */
    public final boolean mo34280D() {
        if ((this.zze & 8) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: E */
    public final boolean mo34281E() {
        if ((this.zze & 16) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: F */
    public final boolean mo34282F() {
        if ((this.zze & 4) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: H */
    public final int mo34283H() {
        int a = C5904p5.m9746a(this.zzf);
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
            return C6003v8.m10157n(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zze", "zzf", C5888o5.f7189a, "zzg", C5920q5.class, "zzh", "zzi", "zzj", "zzk"});
        } else if (i2 == 3) {
            return new C5920q5();
        } else {
            if (i2 == 4) {
                return new C5856m5((C5738f5) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: w */
    public final double mo34284w() {
        return this.zzk;
    }

    /* renamed from: y */
    public final String mo34285y() {
        return this.zzh;
    }

    /* renamed from: z */
    public final String mo34286z() {
        return this.zzi;
    }
}
