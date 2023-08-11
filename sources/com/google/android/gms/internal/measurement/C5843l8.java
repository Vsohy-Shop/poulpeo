package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.l8 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
final class C5843l8 {

    /* renamed from: a */
    private static final C5809j8<?> f7051a = new C5826k8();

    /* renamed from: b */
    private static final C5809j8<?> f7052b;

    static {
        C5809j8<?> j8Var;
        try {
            j8Var = (C5809j8) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            j8Var = null;
        }
        f7052b = j8Var;
    }

    /* renamed from: a */
    static C5809j8<?> m9557a() {
        C5809j8<?> j8Var = f7052b;
        if (j8Var != null) {
            return j8Var;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* renamed from: b */
    static C5809j8<?> m9558b() {
        return f7051a;
    }
}
