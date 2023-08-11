package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.k4 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
public final class C5822k4 extends C6003v8<C5822k4, C5805j4> implements C6068z9 {
    /* access modifiers changed from: private */
    public static final C5822k4 zza;
    private int zze;
    /* access modifiers changed from: private */
    public C5691c9<C5887o4> zzf = C6003v8.m10154k();
    private String zzg = "";
    private long zzh;
    private long zzi;
    private int zzj;

    static {
        C5822k4 k4Var = new C5822k4();
        zza = k4Var;
        C6003v8.m10158o(C5822k4.class, k4Var);
    }

    private C5822k4() {
    }

    /* renamed from: B */
    public static C5805j4 m9480B() {
        return (C5805j4) zza.mo34556p();
    }

    /* renamed from: H */
    static /* synthetic */ void m9482H(C5822k4 k4Var, int i, C5887o4 o4Var) {
        o4Var.getClass();
        k4Var.m9490T();
        k4Var.zzf.set(i, o4Var);
    }

    /* renamed from: I */
    static /* synthetic */ void m9483I(C5822k4 k4Var, C5887o4 o4Var) {
        o4Var.getClass();
        k4Var.m9490T();
        k4Var.zzf.add(o4Var);
    }

    /* renamed from: J */
    static /* synthetic */ void m9484J(C5822k4 k4Var, Iterable iterable) {
        k4Var.m9490T();
        C5757g7.m9283h(iterable, k4Var.zzf);
    }

    /* renamed from: L */
    static /* synthetic */ void m9486L(C5822k4 k4Var, int i) {
        k4Var.m9490T();
        k4Var.zzf.remove(i);
    }

    /* renamed from: M */
    static /* synthetic */ void m9487M(C5822k4 k4Var, String str) {
        str.getClass();
        k4Var.zze |= 1;
        k4Var.zzg = str;
    }

    /* renamed from: N */
    static /* synthetic */ void m9488N(C5822k4 k4Var, long j) {
        k4Var.zze |= 2;
        k4Var.zzh = j;
    }

    /* renamed from: O */
    static /* synthetic */ void m9489O(C5822k4 k4Var, long j) {
        k4Var.zze |= 4;
        k4Var.zzi = j;
    }

    /* renamed from: T */
    private final void m9490T() {
        C5691c9<C5887o4> c9Var = this.zzf;
        if (!c9Var.mo33774x()) {
            this.zzf = C6003v8.m10155l(c9Var);
        }
    }

    /* renamed from: D */
    public final C5887o4 mo34133D(int i) {
        return this.zzf.get(i);
    }

    /* renamed from: E */
    public final String mo34134E() {
        return this.zzg;
    }

    /* renamed from: F */
    public final List<C5887o4> mo34135F() {
        return this.zzf;
    }

    /* renamed from: P */
    public final boolean mo34136P() {
        if ((this.zze & 8) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: Q */
    public final boolean mo34137Q() {
        if ((this.zze & 4) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: S */
    public final boolean mo34138S() {
        if ((this.zze & 2) != 0) {
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
            return C6003v8.m10157n(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zze", "zzf", C5887o4.class, "zzg", "zzh", "zzi", "zzj"});
        } else if (i2 == 3) {
            return new C5822k4();
        } else {
            if (i2 == 4) {
                return new C5805j4((C5669b4) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: w */
    public final int mo34139w() {
        return this.zzj;
    }

    /* renamed from: x */
    public final int mo34140x() {
        return this.zzf.size();
    }

    /* renamed from: y */
    public final long mo34141y() {
        return this.zzi;
    }

    /* renamed from: z */
    public final long mo34142z() {
        return this.zzh;
    }
}
