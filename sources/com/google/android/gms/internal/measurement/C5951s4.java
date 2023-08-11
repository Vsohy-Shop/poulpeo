package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.s4 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
public final class C5951s4 extends C6003v8<C5951s4, C5935r4> implements C6068z9 {
    /* access modifiers changed from: private */
    public static final C5951s4 zza;
    private C5691c9<C5983u4> zze = C6003v8.m10154k();

    static {
        C5951s4 s4Var = new C5951s4();
        zza = s4Var;
        C6003v8.m10158o(C5951s4.class, s4Var);
    }

    private C5951s4() {
    }

    /* renamed from: B */
    static /* synthetic */ void m9861B(C5951s4 s4Var, C5983u4 u4Var) {
        u4Var.getClass();
        C5691c9<C5983u4> c9Var = s4Var.zze;
        if (!c9Var.mo33774x()) {
            s4Var.zze = C6003v8.m10155l(c9Var);
        }
        s4Var.zze.add(u4Var);
    }

    /* renamed from: w */
    public static C5935r4 m9862w() {
        return (C5935r4) zza.mo34556p();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final Object mo33646v(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C6003v8.m10157n(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", C5983u4.class});
        } else if (i2 == 3) {
            return new C5951s4();
        } else {
            if (i2 == 4) {
                return new C5935r4((C5669b4) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: y */
    public final C5983u4 mo34347y(int i) {
        return this.zze.get(0);
    }

    /* renamed from: z */
    public final List<C5983u4> mo34348z() {
        return this.zze;
    }
}
