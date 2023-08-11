package com.google.protobuf;

/* renamed from: com.google.protobuf.m0 */
/* compiled from: MapFieldSchemas */
final class C7132m0 {

    /* renamed from: a */
    private static final C7126k0 f9654a = m13450c();

    /* renamed from: b */
    private static final C7126k0 f9655b = new C7129l0();

    /* renamed from: a */
    static C7126k0 m13448a() {
        return f9654a;
    }

    /* renamed from: b */
    static C7126k0 m13449b() {
        return f9655b;
    }

    /* renamed from: c */
    private static C7126k0 m13450c() {
        try {
            return (C7126k0) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
