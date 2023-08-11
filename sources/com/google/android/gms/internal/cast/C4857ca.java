package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.ca */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public final class C4857ca extends C4878dd implements C4999ke {
    /* access modifiers changed from: private */
    public static final C4857ca zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        C4857ca caVar = new C4857ca();
        zzb = caVar;
        C4878dd.m6907i(C4857ca.class, caVar);
    }

    private C4857ca() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final Object mo32613r(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C4878dd.m6906f(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        } else if (i2 == 3) {
            return new C4857ca();
        } else {
            if (i2 == 4) {
                return new C4839ba((C5145t7) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
