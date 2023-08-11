package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.h8 */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public final class C4942h8 extends C4878dd implements C4999ke {
    /* access modifiers changed from: private */
    public static final C4942h8 zzb;
    private int zzd;
    private C4856c9 zze;
    private boolean zzf;
    private long zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private C5199wa zzm;
    private int zzn;
    private int zzo;
    private boolean zzp;
    private int zzq;
    private int zzr;

    static {
        C4942h8 h8Var = new C4942h8();
        zzb = h8Var;
        C4878dd.m6907i(C4942h8.class, h8Var);
    }

    private C4942h8() {
    }

    /* renamed from: B */
    public static C4942h8 m7030B() {
        return zzb;
    }

    /* renamed from: C */
    static /* synthetic */ void m7031C(C4942h8 h8Var, C4856c9 c9Var) {
        c9Var.getClass();
        h8Var.zze = c9Var;
        h8Var.zzd |= 1;
    }

    /* renamed from: D */
    static /* synthetic */ void m7032D(C4942h8 h8Var, boolean z) {
        h8Var.zzd |= 2;
        h8Var.zzf = z;
    }

    /* renamed from: E */
    static /* synthetic */ void m7033E(C4942h8 h8Var, long j) {
        h8Var.zzd |= 4;
        h8Var.zzg = j;
    }

    /* renamed from: F */
    static /* synthetic */ void m7034F(C4942h8 h8Var, int i) {
        h8Var.zzd |= 64;
        h8Var.zzk = i;
    }

    /* renamed from: G */
    static /* synthetic */ void m7035G(C4942h8 h8Var, int i) {
        h8Var.zzd |= 128;
        h8Var.zzl = i;
    }

    /* renamed from: H */
    static /* synthetic */ void m7036H(C4942h8 h8Var, int i) {
        h8Var.zzd |= 1024;
        h8Var.zzo = i;
    }

    /* renamed from: I */
    static /* synthetic */ void m7037I(C4942h8 h8Var, boolean z) {
        h8Var.zzd |= 2048;
        h8Var.zzp = z;
    }

    /* renamed from: J */
    static /* synthetic */ void m7038J(C4942h8 h8Var, int i) {
        h8Var.zzd |= 4096;
        h8Var.zzq = i;
    }

    /* renamed from: K */
    static /* synthetic */ void m7039K(C4942h8 h8Var, int i) {
        h8Var.zzd |= 8192;
        h8Var.zzr = i;
    }

    /* renamed from: y */
    public static C4925g8 m7040y() {
        return (C4925g8) zzb.mo32743t();
    }

    /* renamed from: z */
    public static C4925g8 m7041z(C4942h8 h8Var) {
        C4842bd t = zzb.mo32743t();
        t.mo32642d(h8Var);
        return (C4925g8) t;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final Object mo32613r(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C4878dd.m6906f(zzb, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0003စ\u0002\u0004ဆ\u0003\u0005ဌ\u0004\u0006ဌ\u0005\u0007င\u0006\bင\u0007\tဉ\b\nဌ\t\u000bင\n\fဇ\u000b\rင\f\u000eင\r", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", C5055o2.m7299a(), "zzj", C5004l2.m7144a(), "zzk", "zzl", "zzm", "zzn", C4851c4.m6839a(), "zzo", "zzp", "zzq", "zzr"});
        } else if (i2 == 3) {
            return new C4942h8();
        } else {
            if (i2 == 4) {
                return new C4925g8((C5145t7) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
