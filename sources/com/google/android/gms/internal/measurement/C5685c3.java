package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.c3 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
public final class C5685c3 extends C6003v8<C5685c3, C5668b3> implements C6068z9 {
    /* access modifiers changed from: private */
    public static final C5685c3 zza;
    private int zze;
    private int zzf;
    private C5691c9<C5870n3> zzg = C6003v8.m10154k();
    private C5691c9<C5719e3> zzh = C6003v8.m10154k();
    private boolean zzi;
    private boolean zzj;

    static {
        C5685c3 c3Var = new C5685c3();
        zza = c3Var;
        C6003v8.m10158o(C5685c3.class, c3Var);
    }

    private C5685c3() {
    }

    /* renamed from: F */
    static /* synthetic */ void m8866F(C5685c3 c3Var, int i, C5870n3 n3Var) {
        n3Var.getClass();
        C5691c9<C5870n3> c9Var = c3Var.zzg;
        if (!c9Var.mo33774x()) {
            c3Var.zzg = C6003v8.m10155l(c9Var);
        }
        c3Var.zzg.set(i, n3Var);
    }

    /* renamed from: H */
    static /* synthetic */ void m8867H(C5685c3 c3Var, int i, C5719e3 e3Var) {
        e3Var.getClass();
        C5691c9<C5719e3> c9Var = c3Var.zzh;
        if (!c9Var.mo33774x()) {
            c3Var.zzh = C6003v8.m10155l(c9Var);
        }
        c3Var.zzh.set(i, e3Var);
    }

    /* renamed from: B */
    public final C5719e3 mo33738B(int i) {
        return this.zzh.get(i);
    }

    /* renamed from: C */
    public final C5870n3 mo33739C(int i) {
        return this.zzg.get(i);
    }

    /* renamed from: D */
    public final List<C5719e3> mo33740D() {
        return this.zzh;
    }

    /* renamed from: E */
    public final List<C5870n3> mo33741E() {
        return this.zzg;
    }

    /* renamed from: I */
    public final boolean mo33742I() {
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
            return C6003v8.m10157n(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zze", "zzf", "zzg", C5870n3.class, "zzh", C5719e3.class, "zzi", "zzj"});
        } else if (i2 == 3) {
            return new C5685c3();
        } else {
            if (i2 == 4) {
                return new C5668b3((C5651a3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: w */
    public final int mo33743w() {
        return this.zzf;
    }

    /* renamed from: x */
    public final int mo33744x() {
        return this.zzh.size();
    }

    /* renamed from: y */
    public final int mo33745y() {
        return this.zzg.size();
    }
}
