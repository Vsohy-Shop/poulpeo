package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.ad */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
final class C4824ad implements C4948he {

    /* renamed from: a */
    private static final C4824ad f5120a = new C4824ad();

    private C4824ad() {
    }

    /* renamed from: c */
    public static C4824ad m6785c() {
        return f5120a;
    }

    /* renamed from: a */
    public final C4931ge mo32616a(Class cls) {
        Class<C4878dd> cls2 = C4878dd.class;
        if (cls2.isAssignableFrom(cls)) {
            try {
                return (C4931ge) C4878dd.m6909u(cls.asSubclass(cls2)).mo32613r(3, (Object) null, (Object) null);
            } catch (Exception e) {
                throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
            }
        } else {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
    }

    /* renamed from: b */
    public final boolean mo32617b(Class cls) {
        return C4878dd.class.isAssignableFrom(cls);
    }
}
