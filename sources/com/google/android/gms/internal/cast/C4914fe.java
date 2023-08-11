package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.fe */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
final class C4914fe {

    /* renamed from: a */
    private static final C4897ee f5221a;

    /* renamed from: b */
    private static final C4897ee f5222b = new C4897ee();

    static {
        C4897ee eeVar;
        try {
            eeVar = (C4897ee) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            eeVar = null;
        }
        f5221a = eeVar;
    }

    /* renamed from: a */
    static C4897ee m6979a() {
        return f5221a;
    }

    /* renamed from: b */
    static C4897ee m6980b() {
        return f5222b;
    }
}
