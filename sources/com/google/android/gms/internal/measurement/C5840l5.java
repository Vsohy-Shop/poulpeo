package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.l5 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
public final class C5840l5 extends C6003v8<C5840l5, C5823k5> implements C6068z9 {
    /* access modifiers changed from: private */
    public static final C5840l5 zza;
    private int zze;
    private C5691c9<C5920q5> zzf = C6003v8.m10154k();
    private C5772h5 zzg;

    static {
        C5840l5 l5Var = new C5840l5();
        zza = l5Var;
        C6003v8.m10158o(C5840l5.class, l5Var);
    }

    private C5840l5() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final Object mo33646v(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C6003v8.m10157n(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zze", "zzf", C5920q5.class, "zzg"});
        } else if (i2 == 3) {
            return new C5840l5();
        } else {
            if (i2 == 4) {
                return new C5823k5((C5738f5) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: w */
    public final C5772h5 mo34162w() {
        C5772h5 h5Var = this.zzg;
        if (h5Var == null) {
            return C5772h5.m9331y();
        }
        return h5Var;
    }

    /* renamed from: y */
    public final List<C5920q5> mo34163y() {
        return this.zzf;
    }
}
