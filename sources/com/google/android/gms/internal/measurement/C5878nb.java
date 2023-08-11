package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.nb */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
public enum C5878nb {
    DOUBLE(C5894ob.DOUBLE, 1),
    FLOAT(C5894ob.FLOAT, 5),
    INT64(r5, 0),
    UINT64(r5, 0),
    INT32(r11, 0),
    FIXED64(r5, 1),
    FIXED32(r11, 5),
    BOOL(C5894ob.BOOLEAN, 0),
    STRING(C5894ob.STRING, 2),
    GROUP(r13, 3),
    MESSAGE(r13, 2),
    BYTES(C5894ob.BYTE_STRING, 2),
    UINT32(r11, 0),
    ENUM(C5894ob.ENUM, 0),
    SFIXED32(r11, 5),
    SFIXED64(r5, 1),
    SINT32(r11, 0),
    SINT64(r5, 0);
    

    /* renamed from: b */
    private final C5894ob f7174b;

    private C5878nb(C5894ob obVar, int i) {
        this.f7174b = obVar;
    }

    /* renamed from: a */
    public final C5894ob mo34229a() {
        return this.f7174b;
    }
}
