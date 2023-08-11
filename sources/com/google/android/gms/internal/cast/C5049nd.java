package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.nd */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public enum C5049nd {
    VOID(Void.class, Void.class, (Class) null),
    INT(r13, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, Boolean.FALSE),
    STRING(String.class, String.class, ""),
    BYTE_STRING(C4980jc.class, C4980jc.class, C4980jc.f5269c),
    ENUM(r13, Integer.class, (Class) null),
    MESSAGE(Object.class, Object.class, (Class) null);
    

    /* renamed from: b */
    private final Class f5419b;

    /* renamed from: c */
    private final Class f5420c;

    /* renamed from: d */
    private final Object f5421d;

    private C5049nd(Class cls, Class cls2, Object obj) {
        this.f5419b = cls;
        this.f5420c = cls2;
        this.f5421d = obj;
    }

    /* renamed from: a */
    public final Class mo32903a() {
        return this.f5420c;
    }
}
