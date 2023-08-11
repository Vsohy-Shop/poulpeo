package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.e9 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
public enum C5725e9 {
    VOID(Void.class, Void.class, (Class<?>) null),
    INT(r13, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, Boolean.FALSE),
    STRING(String.class, String.class, ""),
    BYTE_STRING(C6018w7.class, C6018w7.class, C6018w7.f7451c),
    ENUM(r13, Integer.class, (Class<?>) null),
    MESSAGE(Object.class, Object.class, (Class<?>) null);
    

    /* renamed from: b */
    private final Class<?> f6884b;

    /* renamed from: c */
    private final Class<?> f6885c;

    /* renamed from: d */
    private final Object f6886d;

    private C5725e9(Class<?> cls, Class<?> cls2, Object obj) {
        this.f6884b = cls;
        this.f6885c = cls2;
        this.f6886d = obj;
    }

    /* renamed from: a */
    public final Class<?> mo33937a() {
        return this.f6885c;
    }
}
