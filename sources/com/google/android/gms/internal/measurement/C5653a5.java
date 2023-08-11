package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.a5 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
public final class C5653a5 extends C6003v8<C5653a5, C6063z4> implements C6068z9 {
    /* access modifiers changed from: private */
    public static final C5653a5 zza;
    /* access modifiers changed from: private */
    public C5674b9 zze = C6003v8.m10161t();
    /* access modifiers changed from: private */
    public C5674b9 zzf = C6003v8.m10161t();
    private C5691c9<C5788i4> zzg = C6003v8.m10154k();
    private C5691c9<C5687c5> zzh = C6003v8.m10154k();

    static {
        C5653a5 a5Var = new C5653a5();
        zza = a5Var;
        C6003v8.m10158o(C5653a5.class, a5Var);
    }

    private C5653a5() {
    }

    /* renamed from: C */
    public static C6063z4 m8736C() {
        return (C6063z4) zza.mo34556p();
    }

    /* renamed from: E */
    public static C5653a5 m8738E() {
        return zza;
    }

    /* renamed from: L */
    static /* synthetic */ void m8739L(C5653a5 a5Var, Iterable iterable) {
        C5674b9 b9Var = a5Var.zze;
        if (!b9Var.mo33774x()) {
            a5Var.zze = C6003v8.m10162u(b9Var);
        }
        C5757g7.m9283h(iterable, a5Var.zze);
    }

    /* renamed from: N */
    static /* synthetic */ void m8741N(C5653a5 a5Var, Iterable iterable) {
        C5674b9 b9Var = a5Var.zzf;
        if (!b9Var.mo33774x()) {
            a5Var.zzf = C6003v8.m10162u(b9Var);
        }
        C5757g7.m9283h(iterable, a5Var.zzf);
    }

    /* renamed from: P */
    static /* synthetic */ void m8743P(C5653a5 a5Var, Iterable iterable) {
        a5Var.m8747U();
        C5757g7.m9283h(iterable, a5Var.zzg);
    }

    /* renamed from: Q */
    static /* synthetic */ void m8744Q(C5653a5 a5Var, int i) {
        a5Var.m8747U();
        a5Var.zzg.remove(i);
    }

    /* renamed from: S */
    static /* synthetic */ void m8745S(C5653a5 a5Var, Iterable iterable) {
        a5Var.m8748W();
        C5757g7.m9283h(iterable, a5Var.zzh);
    }

    /* renamed from: T */
    static /* synthetic */ void m8746T(C5653a5 a5Var, int i) {
        a5Var.m8748W();
        a5Var.zzh.remove(i);
    }

    /* renamed from: U */
    private final void m8747U() {
        C5691c9<C5788i4> c9Var = this.zzg;
        if (!c9Var.mo33774x()) {
            this.zzg = C6003v8.m10155l(c9Var);
        }
    }

    /* renamed from: W */
    private final void m8748W() {
        C5691c9<C5687c5> c9Var = this.zzh;
        if (!c9Var.mo33774x()) {
            this.zzh = C6003v8.m10155l(c9Var);
        }
    }

    /* renamed from: B */
    public final C5788i4 mo33649B(int i) {
        return this.zzg.get(i);
    }

    /* renamed from: F */
    public final C5687c5 mo33650F(int i) {
        return this.zzh.get(i);
    }

    /* renamed from: H */
    public final List<C5788i4> mo33651H() {
        return this.zzg;
    }

    /* renamed from: I */
    public final List<Long> mo33652I() {
        return this.zzf;
    }

    /* renamed from: J */
    public final List<C5687c5> mo33653J() {
        return this.zzh;
    }

    /* renamed from: K */
    public final List<Long> mo33654K() {
        return this.zze;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final Object mo33646v(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C6003v8.m10157n(zza, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zze", "zzf", "zzg", C5788i4.class, "zzh", C5687c5.class});
        } else if (i2 == 3) {
            return new C5653a5();
        } else {
            if (i2 == 4) {
                return new C6063z4((C5669b4) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: w */
    public final int mo33655w() {
        return this.zzg.size();
    }

    /* renamed from: x */
    public final int mo33656x() {
        return this.zzf.size();
    }

    /* renamed from: y */
    public final int mo33657y() {
        return this.zzh.size();
    }

    /* renamed from: z */
    public final int mo33658z() {
        return this.zze.size();
    }
}
