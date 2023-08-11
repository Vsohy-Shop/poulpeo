package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.wc */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
final class C5201wc {

    /* renamed from: a */
    private static final C5167uc f5580a = new C5184vc();

    /* renamed from: b */
    private static final C5167uc f5581b;

    static {
        C5167uc ucVar;
        try {
            ucVar = (C5167uc) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            ucVar = null;
        }
        f5581b = ucVar;
    }

    /* renamed from: a */
    static C5167uc m7617a() {
        C5167uc ucVar = f5581b;
        if (ucVar != null) {
            return ucVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* renamed from: b */
    static C5167uc m7618b() {
        return f5580a;
    }
}
