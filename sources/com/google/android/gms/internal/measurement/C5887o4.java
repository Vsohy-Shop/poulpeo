package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.o4 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
public final class C5887o4 extends C6003v8<C5887o4, C5871n4> implements C6068z9 {
    /* access modifiers changed from: private */
    public static final C5887o4 zza;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private long zzh;
    private float zzi;
    private double zzj;
    /* access modifiers changed from: private */
    public C5691c9<C5887o4> zzk = C6003v8.m10154k();

    static {
        C5887o4 o4Var = new C5887o4();
        zza = o4Var;
        C6003v8.m10158o(C5887o4.class, o4Var);
    }

    private C5887o4() {
    }

    /* renamed from: B */
    public static C5871n4 m9708B() {
        return (C5871n4) zza.mo34556p();
    }

    /* renamed from: H */
    static /* synthetic */ void m9710H(C5887o4 o4Var, String str) {
        str.getClass();
        o4Var.zze |= 1;
        o4Var.zzf = str;
    }

    /* renamed from: I */
    static /* synthetic */ void m9711I(C5887o4 o4Var, String str) {
        str.getClass();
        o4Var.zze |= 2;
        o4Var.zzg = str;
    }

    /* renamed from: J */
    static /* synthetic */ void m9712J(C5887o4 o4Var) {
        o4Var.zze &= -3;
        o4Var.zzg = zza.zzg;
    }

    /* renamed from: K */
    static /* synthetic */ void m9713K(C5887o4 o4Var, long j) {
        o4Var.zze |= 4;
        o4Var.zzh = j;
    }

    /* renamed from: L */
    static /* synthetic */ void m9714L(C5887o4 o4Var) {
        o4Var.zze &= -5;
        o4Var.zzh = 0;
    }

    /* renamed from: M */
    static /* synthetic */ void m9715M(C5887o4 o4Var, double d) {
        o4Var.zze |= 16;
        o4Var.zzj = d;
    }

    /* renamed from: N */
    static /* synthetic */ void m9716N(C5887o4 o4Var) {
        o4Var.zze &= -17;
        o4Var.zzj = 0.0d;
    }

    /* renamed from: O */
    static /* synthetic */ void m9717O(C5887o4 o4Var, C5887o4 o4Var2) {
        o4Var2.getClass();
        o4Var.m9720Y();
        o4Var.zzk.add(o4Var2);
    }

    /* renamed from: P */
    static /* synthetic */ void m9718P(C5887o4 o4Var, Iterable iterable) {
        o4Var.m9720Y();
        C5757g7.m9283h(iterable, o4Var.zzk);
    }

    /* renamed from: Y */
    private final void m9720Y() {
        C5691c9<C5887o4> c9Var = this.zzk;
        if (!c9Var.mo33774x()) {
            this.zzk = C6003v8.m10155l(c9Var);
        }
    }

    /* renamed from: D */
    public final String mo34240D() {
        return this.zzf;
    }

    /* renamed from: E */
    public final String mo34241E() {
        return this.zzg;
    }

    /* renamed from: F */
    public final List<C5887o4> mo34242F() {
        return this.zzk;
    }

    /* renamed from: S */
    public final boolean mo34243S() {
        if ((this.zze & 16) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: T */
    public final boolean mo34244T() {
        if ((this.zze & 8) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: U */
    public final boolean mo34245U() {
        if ((this.zze & 4) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: W */
    public final boolean mo34246W() {
        if ((this.zze & 1) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: X */
    public final boolean mo34247X() {
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
            return C6003v8.m10157n(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", C5887o4.class});
        } else if (i2 == 3) {
            return new C5887o4();
        } else {
            if (i2 == 4) {
                return new C5871n4((C5669b4) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: w */
    public final double mo34248w() {
        return this.zzj;
    }

    /* renamed from: x */
    public final float mo34249x() {
        return this.zzi;
    }

    /* renamed from: y */
    public final int mo34250y() {
        return this.zzk.size();
    }

    /* renamed from: z */
    public final long mo34251z() {
        return this.zzh;
    }
}
