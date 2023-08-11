package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.j5 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
public final class C5806j5 extends C6003v8<C5806j5, C5789i5> implements C6068z9 {
    /* access modifiers changed from: private */
    public static final C5806j5 zza;
    private int zze;
    private String zzf = "";
    private C5691c9<C5920q5> zzg = C6003v8.m10154k();

    static {
        C5806j5 j5Var = new C5806j5();
        zza = j5Var;
        C6003v8.m10158o(C5806j5.class, j5Var);
    }

    private C5806j5() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final Object mo33646v(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C6003v8.m10157n(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zze", "zzf", "zzg", C5920q5.class});
        } else if (i2 == 3) {
            return new C5806j5();
        } else {
            if (i2 == 4) {
                return new C5789i5((C5738f5) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: x */
    public final String mo34121x() {
        return this.zzf;
    }

    /* renamed from: y */
    public final List<C5920q5> mo34122y() {
        return this.zzg;
    }
}
