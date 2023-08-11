package com.google.android.gms.internal.cast;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.cast.z7 */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public final class C5247z7 extends C4878dd implements C4999ke {
    private static final C4981jd zzb = new C5213x7();
    /* access modifiers changed from: private */
    public static final C5247z7 zzd;
    private int zze;
    private C4908f8 zzf;
    private C4857ca zzg;
    private C5015ld zzh = C4878dd.m6903c();
    private C4964id zzi = C4878dd.m6910w();

    static {
        C5247z7 z7Var = new C5247z7();
        zzd = z7Var;
        C4878dd.m6907i(C5247z7.class, z7Var);
    }

    private C5247z7() {
    }

    /* renamed from: A */
    static /* synthetic */ void m7721A(C5247z7 z7Var, C4908f8 f8Var) {
        f8Var.getClass();
        z7Var.zzf = f8Var;
        z7Var.zze |= 1;
    }

    /* renamed from: B */
    static /* synthetic */ void m7722B(C5247z7 z7Var, Iterable iterable) {
        int i;
        C4964id idVar = z7Var.zzi;
        if (!idVar.mo32880x()) {
            int size = idVar.size();
            if (size == 0) {
                i = 10;
            } else {
                i = size + size;
            }
            z7Var.zzi = idVar.mo32772f(i);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            z7Var.zzi.mo32764E(((C5009l7) it.next()).zza());
        }
    }

    /* renamed from: y */
    public static C5230y7 m7723y() {
        return (C5230y7) zzd.mo32743t();
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final Object mo32613r(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C4878dd.m6906f(zzd, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004\u001e", new Object[]{"zze", "zzf", "zzg", "zzh", C5232y9.class, "zzi", C5009l7.m7155b()});
        } else if (i2 == 3) {
            return new C5247z7();
        } else {
            if (i2 == 4) {
                return new C5230y7((C5145t7) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzd;
        }
    }
}
