package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.e3 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
public final class C5719e3 extends C6003v8<C5719e3, C5702d3> implements C6068z9 {
    /* access modifiers changed from: private */
    public static final C5719e3 zza;
    private int zze;
    private int zzf;
    private String zzg = "";
    private C5691c9<C5753g3> zzh = C6003v8.m10154k();
    private boolean zzi;
    private C5838l3 zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;

    static {
        C5719e3 e3Var = new C5719e3();
        zza = e3Var;
        C6003v8.m10158o(C5719e3.class, e3Var);
    }

    private C5719e3() {
    }

    /* renamed from: F */
    static /* synthetic */ void m9066F(C5719e3 e3Var, String str) {
        e3Var.zze |= 2;
        e3Var.zzg = str;
    }

    /* renamed from: H */
    static /* synthetic */ void m9067H(C5719e3 e3Var, int i, C5753g3 g3Var) {
        g3Var.getClass();
        C5691c9<C5753g3> c9Var = e3Var.zzh;
        if (!c9Var.mo33774x()) {
            e3Var.zzh = C6003v8.m10155l(c9Var);
        }
        e3Var.zzh.set(i, g3Var);
    }

    /* renamed from: y */
    public static C5702d3 m9068y() {
        return (C5702d3) zza.mo34556p();
    }

    /* renamed from: B */
    public final C5753g3 mo33879B(int i) {
        return this.zzh.get(i);
    }

    /* renamed from: C */
    public final C5838l3 mo33880C() {
        C5838l3 l3Var = this.zzj;
        if (l3Var == null) {
            return C5838l3.m9534x();
        }
        return l3Var;
    }

    /* renamed from: D */
    public final String mo33881D() {
        return this.zzg;
    }

    /* renamed from: E */
    public final List<C5753g3> mo33882E() {
        return this.zzh;
    }

    /* renamed from: I */
    public final boolean mo33883I() {
        return this.zzk;
    }

    /* renamed from: J */
    public final boolean mo33884J() {
        return this.zzl;
    }

    /* renamed from: K */
    public final boolean mo33885K() {
        return this.zzm;
    }

    /* renamed from: L */
    public final boolean mo33886L() {
        if ((this.zze & 8) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: M */
    public final boolean mo33887M() {
        if ((this.zze & 1) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: N */
    public final boolean mo33888N() {
        if ((this.zze & 64) != 0) {
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
            return C6003v8.m10157n(zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", C5753g3.class, "zzi", "zzj", "zzk", "zzl", "zzm"});
        } else if (i2 == 3) {
            return new C5719e3();
        } else {
            if (i2 == 4) {
                return new C5702d3((C5651a3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: w */
    public final int mo33889w() {
        return this.zzh.size();
    }

    /* renamed from: x */
    public final int mo33890x() {
        return this.zzf;
    }
}
