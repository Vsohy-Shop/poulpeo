package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.c5 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
public final class C5687c5 extends C6003v8<C5687c5, C5670b5> implements C6068z9 {
    /* access modifiers changed from: private */
    public static final C5687c5 zza;
    private int zze;
    private int zzf;
    private C5674b9 zzg = C6003v8.m10161t();

    static {
        C5687c5 c5Var = new C5687c5();
        zza = c5Var;
        C6003v8.m10158o(C5687c5.class, c5Var);
    }

    private C5687c5() {
    }

    /* renamed from: D */
    static /* synthetic */ void m8880D(C5687c5 c5Var, int i) {
        c5Var.zze |= 1;
        c5Var.zzf = i;
    }

    /* renamed from: E */
    static /* synthetic */ void m8881E(C5687c5 c5Var, Iterable iterable) {
        C5674b9 b9Var = c5Var.zzg;
        if (!b9Var.mo33774x()) {
            c5Var.zzg = C6003v8.m10162u(b9Var);
        }
        C5757g7.m9283h(iterable, c5Var.zzg);
    }

    /* renamed from: z */
    public static C5670b5 m8882z() {
        return (C5670b5) zza.mo34556p();
    }

    /* renamed from: C */
    public final List<Long> mo33747C() {
        return this.zzg;
    }

    /* renamed from: F */
    public final boolean mo33748F() {
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
            return C6003v8.m10157n(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new C5687c5();
        } else {
            if (i2 == 4) {
                return new C5670b5((C5669b4) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: w */
    public final int mo33749w() {
        return this.zzg.size();
    }

    /* renamed from: x */
    public final int mo33750x() {
        return this.zzf;
    }

    /* renamed from: y */
    public final long mo33751y(int i) {
        return this.zzg.mo33702g(i);
    }
}
