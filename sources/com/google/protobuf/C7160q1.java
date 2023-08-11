package com.google.protobuf;

/* renamed from: com.google.protobuf.q1 */
/* compiled from: WireFormat */
public final class C7160q1 {

    /* renamed from: a */
    static final int f9695a = m13682c(1, 3);

    /* renamed from: b */
    static final int f9696b = m13682c(1, 4);

    /* renamed from: c */
    static final int f9697c = m13682c(2, 0);

    /* renamed from: d */
    static final int f9698d = m13682c(3, 2);

    /* renamed from: com.google.protobuf.q1$b */
    /* compiled from: WireFormat */
    public enum C7162b {
        DOUBLE(C7167c.DOUBLE, 1),
        FLOAT(C7167c.FLOAT, 5),
        INT64(r5, 0),
        UINT64(r5, 0),
        INT32(r11, 0),
        FIXED64(r5, 1),
        FIXED32(r11, 5),
        BOOL(C7167c.BOOLEAN, 0),
        STRING(C7167c.STRING, 2) {
        },
        GROUP(r13, 3) {
        },
        MESSAGE(r13, 2) {
        },
        BYTES(C7167c.BYTE_STRING, 2) {
        },
        UINT32(r11, 0),
        ENUM(C7167c.ENUM, 0),
        SFIXED32(r11, 5),
        SFIXED64(r5, 1),
        SINT32(r11, 0),
        SINT64(r5, 0);
        

        /* renamed from: b */
        private final C7167c f9718b;

        /* renamed from: c */
        private final int f9719c;

        /* renamed from: a */
        public C7167c mo40638a() {
            return this.f9718b;
        }

        /* renamed from: b */
        public int mo40639b() {
            return this.f9719c;
        }

        private C7162b(C7167c cVar, int i) {
            this.f9718b = cVar;
            this.f9719c = i;
        }
    }

    /* renamed from: com.google.protobuf.q1$c */
    /* compiled from: WireFormat */
    public enum C7167c {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(C7086h.f9565c),
        ENUM((String) null),
        MESSAGE((String) null);
        

        /* renamed from: b */
        private final Object f9730b;

        private C7167c(Object obj) {
            this.f9730b = obj;
        }
    }

    /* renamed from: a */
    public static int m13680a(int i) {
        return i >>> 3;
    }

    /* renamed from: b */
    public static int m13681b(int i) {
        return i & 7;
    }

    /* renamed from: c */
    static int m13682c(int i, int i2) {
        return (i << 3) | i2;
    }
}
