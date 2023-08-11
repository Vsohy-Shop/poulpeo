package com.google.protobuf;

import java.lang.reflect.Type;

/* renamed from: com.google.protobuf.u */
/* compiled from: FieldType */
public enum C7178u {
    DOUBLE(0, r13, r14),
    FLOAT(1, r11, r1),
    INT64(2, r11, r12),
    UINT64(3, r11, r12),
    INT32(4, r11, r21),
    FIXED64(5, r11, r3),
    FIXED32(6, r11, r21),
    BOOL(7, r11, r25),
    STRING(8, r11, r27),
    MESSAGE(9, r11, r29),
    BYTES(10, r11, r31),
    UINT32(11, r11, r21),
    ENUM(12, r11, r34),
    SFIXED32(13, r11, r21),
    SFIXED64(14, r11, r3),
    SINT32(15, r11, r21),
    SINT64(16, r11, r3),
    GROUP(17, r11, r29),
    DOUBLE_LIST(18, r40, r12),
    FLOAT_LIST(19, r19, r1),
    INT64_LIST(20, r19, r20),
    UINT64_LIST(21, r19, r20),
    INT32_LIST(22, r19, r21),
    FIXED64_LIST(23, r19, r3),
    FIXED32_LIST(24, r19, r21),
    BOOL_LIST(25, r19, r25),
    STRING_LIST(26, r19, r27),
    MESSAGE_LIST(27, r19, r29),
    BYTES_LIST(28, r19, r31),
    UINT32_LIST(29, r19, r21),
    ENUM_LIST(30, r19, r34),
    SFIXED32_LIST(31, r19, r21),
    SFIXED64_LIST(32, r19, r3),
    SINT32_LIST(33, r19, r21),
    SINT64_LIST(34, r19, r3),
    DOUBLE_LIST_PACKED(35, r56, r12),
    FLOAT_LIST_PACKED(36, r19, r1),
    INT64_LIST_PACKED(37, r19, r20),
    UINT64_LIST_PACKED(38, r19, r20),
    INT32_LIST_PACKED(39, r19, r21),
    FIXED64_LIST_PACKED(40, r19, r3),
    FIXED32_LIST_PACKED(41, r19, r21),
    BOOL_LIST_PACKED(42, r19, r25),
    UINT32_LIST_PACKED(43, r19, r21),
    ENUM_LIST_PACKED(44, r19, r34),
    SFIXED32_LIST_PACKED(45, r19, r21),
    SFIXED64_LIST_PACKED(46, r19, r3),
    SINT32_LIST_PACKED(47, r19, r21),
    SINT64_LIST_PACKED(48, r19, r3),
    GROUP_LIST(49, r40, r29),
    MAP(50, C7180b.MAP, C7058a0.VOID);
    

    /* renamed from: s0 */
    private static final C7178u[] f9809s0 = null;

    /* renamed from: t0 */
    private static final Type[] f9811t0 = null;

    /* renamed from: b */
    private final C7058a0 f9819b;

    /* renamed from: c */
    private final int f9820c;

    /* renamed from: d */
    private final C7180b f9821d;

    /* renamed from: e */
    private final Class<?> f9822e;

    /* renamed from: f */
    private final boolean f9823f;

    /* renamed from: com.google.protobuf.u$a */
    /* compiled from: FieldType */
    static /* synthetic */ class C7179a {

        /* renamed from: a */
        static final /* synthetic */ int[] f9824a = null;

        /* renamed from: b */
        static final /* synthetic */ int[] f9825b = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        static {
            /*
                com.google.protobuf.a0[] r0 = com.google.protobuf.C7058a0.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f9825b = r0
                r1 = 1
                com.google.protobuf.a0 r2 = com.google.protobuf.C7058a0.BYTE_STRING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f9825b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.a0 r3 = com.google.protobuf.C7058a0.MESSAGE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f9825b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.a0 r4 = com.google.protobuf.C7058a0.STRING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                com.google.protobuf.u$b[] r3 = com.google.protobuf.C7178u.C7180b.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f9824a = r3
                com.google.protobuf.u$b r4 = com.google.protobuf.C7178u.C7180b.MAP     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f9824a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.google.protobuf.u$b r3 = com.google.protobuf.C7178u.C7180b.VECTOR     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = f9824a     // Catch:{ NoSuchFieldError -> 0x004d }
                com.google.protobuf.u$b r1 = com.google.protobuf.C7178u.C7180b.SCALAR     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C7178u.C7179a.<clinit>():void");
        }
    }

    /* renamed from: com.google.protobuf.u$b */
    /* compiled from: FieldType */
    enum C7180b {
        SCALAR(false),
        VECTOR(true),
        PACKED_VECTOR(true),
        MAP(false);
        

        /* renamed from: b */
        private final boolean f9831b;

        private C7180b(boolean z) {
            this.f9831b = z;
        }
    }

    static {
        int i;
        f9811t0 = new Type[0];
        C7178u[] values = values();
        f9809s0 = new C7178u[values.length];
        for (C7178u uVar : values) {
            f9809s0[uVar.f9820c] = uVar;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
        r1 = com.google.protobuf.C7178u.C7179a.f9825b[r5.ordinal()];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C7178u(int r3, com.google.protobuf.C7178u.C7180b r4, com.google.protobuf.C7058a0 r5) {
        /*
            r0 = this;
            r0.<init>(r1, r2)
            r0.f9820c = r3
            r0.f9821d = r4
            r0.f9819b = r5
            int[] r1 = com.google.protobuf.C7178u.C7179a.f9824a
            int r2 = r4.ordinal()
            r1 = r1[r2]
            r2 = 2
            r3 = 1
            if (r1 == r3) goto L_0x0022
            if (r1 == r2) goto L_0x001b
            r1 = 0
            r0.f9822e = r1
            goto L_0x0028
        L_0x001b:
            java.lang.Class r1 = r5.mo40159a()
            r0.f9822e = r1
            goto L_0x0028
        L_0x0022:
            java.lang.Class r1 = r5.mo40159a()
            r0.f9822e = r1
        L_0x0028:
            com.google.protobuf.u$b r1 = com.google.protobuf.C7178u.C7180b.SCALAR
            if (r4 != r1) goto L_0x003c
            int[] r1 = com.google.protobuf.C7178u.C7179a.f9825b
            int r4 = r5.ordinal()
            r1 = r1[r4]
            if (r1 == r3) goto L_0x003c
            if (r1 == r2) goto L_0x003c
            r2 = 3
            if (r1 == r2) goto L_0x003c
            goto L_0x003d
        L_0x003c:
            r3 = 0
        L_0x003d:
            r0.f9823f = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C7178u.<init>(java.lang.String, int, int, com.google.protobuf.u$b, com.google.protobuf.a0):void");
    }

    /* renamed from: a */
    public int mo40662a() {
        return this.f9820c;
    }
}
