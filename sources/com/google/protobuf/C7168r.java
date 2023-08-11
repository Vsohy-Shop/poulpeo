package com.google.protobuf;

/* renamed from: com.google.protobuf.r */
/* compiled from: ExtensionSchemas */
final class C7168r {

    /* renamed from: a */
    private static final C7148p<?> f9731a = new C7157q();

    /* renamed from: b */
    private static final C7148p<?> f9732b = m13687c();

    /* renamed from: a */
    static C7148p<?> m13685a() {
        C7148p<?> pVar = f9732b;
        if (pVar != null) {
            return pVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* renamed from: b */
    static C7148p<?> m13686b() {
        return f9731a;
    }

    /* renamed from: c */
    private static C7148p<?> m13687c() {
        try {
            return (C7148p) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
