package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.y3 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
public final class C6046y3 extends C6003v8<C6046y3, C6030x3> implements C6068z9 {
    /* access modifiers changed from: private */
    public static final C6046y3 zza;
    private int zze;
    private long zzf;
    private String zzg = "";
    private int zzh;
    private C5691c9<C5652a4> zzi = C6003v8.m10154k();
    private C5691c9<C6014w3> zzj = C6003v8.m10154k();
    /* access modifiers changed from: private */
    public C5691c9<C5685c3> zzk = C6003v8.m10154k();
    private String zzl = "";
    private boolean zzm;
    private C5691c9<C5840l5> zzn = C6003v8.m10154k();

    static {
        C6046y3 y3Var = new C6046y3();
        zza = y3Var;
        C6003v8.m10158o(C6046y3.class, y3Var);
    }

    private C6046y3() {
    }

    /* renamed from: B */
    public static C6030x3 m10276B() {
        return (C6030x3) zza.mo34556p();
    }

    /* renamed from: D */
    public static C6046y3 m10278D() {
        return zza;
    }

    /* renamed from: J */
    static /* synthetic */ void m10279J(C6046y3 y3Var, int i, C6014w3 w3Var) {
        w3Var.getClass();
        C5691c9<C6014w3> c9Var = y3Var.zzj;
        if (!c9Var.mo33774x()) {
            y3Var.zzj = C6003v8.m10155l(c9Var);
        }
        y3Var.zzj.set(i, w3Var);
    }

    /* renamed from: E */
    public final String mo34625E() {
        return this.zzg;
    }

    /* renamed from: F */
    public final List<C5685c3> mo34626F() {
        return this.zzk;
    }

    /* renamed from: H */
    public final List<C5840l5> mo34627H() {
        return this.zzn;
    }

    /* renamed from: I */
    public final List<C5652a4> mo34628I() {
        return this.zzi;
    }

    /* renamed from: L */
    public final boolean mo34629L() {
        return this.zzm;
    }

    /* renamed from: M */
    public final boolean mo34630M() {
        if ((this.zze & 2) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: N */
    public final boolean mo34631N() {
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
            return C6003v8.m10157n(zza, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0004\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", C5652a4.class, "zzj", C6014w3.class, "zzk", C5685c3.class, "zzl", "zzm", "zzn", C5840l5.class});
        } else if (i2 == 3) {
            return new C6046y3();
        } else {
            if (i2 == 4) {
                return new C6030x3((C5966t3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: w */
    public final int mo34632w() {
        return this.zzn.size();
    }

    /* renamed from: x */
    public final int mo34633x() {
        return this.zzj.size();
    }

    /* renamed from: y */
    public final long mo34634y() {
        return this.zzf;
    }

    /* renamed from: z */
    public final C6014w3 mo34635z(int i) {
        return this.zzj.get(i);
    }
}
