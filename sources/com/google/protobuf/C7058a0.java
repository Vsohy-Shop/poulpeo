package com.google.protobuf;

/* renamed from: com.google.protobuf.a0 */
/* compiled from: JavaType */
public enum C7058a0 {
    VOID(Void.class, Void.class, (Class<?>) null),
    INT(r13, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, Boolean.FALSE),
    STRING(String.class, String.class, ""),
    BYTE_STRING(C7086h.class, C7086h.class, C7086h.f9565c),
    ENUM(r13, Integer.class, (Class<?>) null),
    MESSAGE(Object.class, Object.class, (Class<?>) null);
    

    /* renamed from: b */
    private final Class<?> f9515b;

    /* renamed from: c */
    private final Class<?> f9516c;

    /* renamed from: d */
    private final Object f9517d;

    private C7058a0(Class<?> cls, Class<?> cls2, Object obj) {
        this.f9515b = cls;
        this.f9516c = cls2;
        this.f9517d = obj;
    }

    /* renamed from: a */
    public Class<?> mo40159a() {
        return this.f9516c;
    }
}
