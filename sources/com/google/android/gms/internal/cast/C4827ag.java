package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.ag */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public enum C4827ag {
    DOUBLE(C4845bg.DOUBLE, 1),
    FLOAT(C4845bg.FLOAT, 5),
    INT64(r5, 0),
    UINT64(r5, 0),
    INT32(r11, 0),
    FIXED64(r5, 1),
    FIXED32(r11, 5),
    BOOL(C4845bg.BOOLEAN, 0),
    STRING(C4845bg.STRING, 2),
    GROUP(r13, 3),
    MESSAGE(r13, 2),
    BYTES(C4845bg.BYTE_STRING, 2),
    UINT32(r11, 0),
    ENUM(C4845bg.ENUM, 0),
    SFIXED32(r11, 5),
    SFIXED64(r5, 1),
    SINT32(r11, 0),
    SINT64(r5, 0);
    

    /* renamed from: b */
    private final C4845bg f5143b;

    private C4827ag(C4845bg bgVar, int i) {
        this.f5143b = bgVar;
    }

    /* renamed from: a */
    public final C4845bg mo32618a() {
        return this.f5143b;
    }
}
