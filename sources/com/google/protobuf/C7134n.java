package com.google.protobuf;

/* renamed from: com.google.protobuf.n */
/* compiled from: ExtensionRegistryFactory */
final class C7134n {

    /* renamed from: a */
    static final Class<?> f9656a = m13487c();

    /* renamed from: a */
    public static C7139o m13485a() {
        C7139o b = m13486b("getEmptyRegistry");
        if (b != null) {
            return b;
        }
        return C7139o.f9665d;
    }

    /* renamed from: b */
    private static final C7139o m13486b(String str) {
        Class<?> cls = f9656a;
        if (cls == null) {
            return null;
        }
        try {
            return (C7139o) cls.getDeclaredMethod(str, new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: c */
    static Class<?> m13487c() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
