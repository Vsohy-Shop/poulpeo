package com.google.protobuf;

/* renamed from: com.google.protobuf.w0 */
/* compiled from: NewInstanceSchemas */
final class C7185w0 {

    /* renamed from: a */
    private static final C7181u0 f9836a = m13869c();

    /* renamed from: b */
    private static final C7181u0 f9837b = new C7183v0();

    /* renamed from: a */
    static C7181u0 m13867a() {
        return f9836a;
    }

    /* renamed from: b */
    static C7181u0 m13868b() {
        return f9837b;
    }

    /* renamed from: c */
    private static C7181u0 m13869c() {
        try {
            return (C7181u0) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
