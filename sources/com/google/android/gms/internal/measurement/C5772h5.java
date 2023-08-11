package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.h5 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
public final class C5772h5 extends C6003v8<C5772h5, C5755g5> implements C6068z9 {
    /* access modifiers changed from: private */
    public static final C5772h5 zza;
    private C5691c9<C5806j5> zze = C6003v8.m10154k();

    static {
        C5772h5 h5Var = new C5772h5();
        zza = h5Var;
        C6003v8.m10158o(C5772h5.class, h5Var);
    }

    private C5772h5() {
    }

    /* renamed from: y */
    public static C5772h5 m9331y() {
        return zza;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final Object mo33646v(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C6003v8.m10157n(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", C5806j5.class});
        } else if (i2 == 3) {
            return new C5772h5();
        } else {
            if (i2 == 4) {
                return new C5755g5((C5738f5) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: w */
    public final int mo34070w() {
        return this.zze.size();
    }

    /* renamed from: z */
    public final List<C5806j5> mo34071z() {
        return this.zze;
    }
}
