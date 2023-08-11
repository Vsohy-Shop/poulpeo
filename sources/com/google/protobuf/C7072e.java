package com.google.protobuf;

import com.google.protobuf.C7160q1;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: com.google.protobuf.e */
/* compiled from: BinaryReader */
abstract class C7072e implements C7071d1 {

    /* renamed from: com.google.protobuf.e$a */
    /* compiled from: BinaryReader */
    static /* synthetic */ class C7073a {

        /* renamed from: a */
        static final /* synthetic */ int[] f9544a;

        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.protobuf.q1$b[] r0 = com.google.protobuf.C7160q1.C7162b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f9544a = r0
                com.google.protobuf.q1$b r1 = com.google.protobuf.C7160q1.C7162b.BOOL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f9544a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.q1$b r1 = com.google.protobuf.C7160q1.C7162b.BYTES     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f9544a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.q1$b r1 = com.google.protobuf.C7160q1.C7162b.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f9544a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.q1$b r1 = com.google.protobuf.C7160q1.C7162b.ENUM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f9544a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.q1$b r1 = com.google.protobuf.C7160q1.C7162b.FIXED32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f9544a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.q1$b r1 = com.google.protobuf.C7160q1.C7162b.FIXED64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f9544a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.q1$b r1 = com.google.protobuf.C7160q1.C7162b.FLOAT     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f9544a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.google.protobuf.q1$b r1 = com.google.protobuf.C7160q1.C7162b.INT32     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f9544a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.google.protobuf.q1$b r1 = com.google.protobuf.C7160q1.C7162b.INT64     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f9544a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.google.protobuf.q1$b r1 = com.google.protobuf.C7160q1.C7162b.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f9544a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.google.protobuf.q1$b r1 = com.google.protobuf.C7160q1.C7162b.SFIXED32     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f9544a     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.google.protobuf.q1$b r1 = com.google.protobuf.C7160q1.C7162b.SFIXED64     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f9544a     // Catch:{ NoSuchFieldError -> 0x009c }
                com.google.protobuf.q1$b r1 = com.google.protobuf.C7160q1.C7162b.SINT32     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f9544a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.google.protobuf.q1$b r1 = com.google.protobuf.C7160q1.C7162b.SINT64     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f9544a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.google.protobuf.q1$b r1 = com.google.protobuf.C7160q1.C7162b.STRING     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f9544a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.google.protobuf.q1$b r1 = com.google.protobuf.C7160q1.C7162b.UINT32     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f9544a     // Catch:{ NoSuchFieldError -> 0x00cc }
                com.google.protobuf.q1$b r1 = com.google.protobuf.C7160q1.C7162b.UINT64     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C7072e.C7073a.<clinit>():void");
        }
    }

    /* renamed from: com.google.protobuf.e$b */
    /* compiled from: BinaryReader */
    private static final class C7074b extends C7072e {

        /* renamed from: a */
        private final boolean f9545a;

        /* renamed from: b */
        private final byte[] f9546b;

        /* renamed from: c */
        private int f9547c;

        /* renamed from: d */
        private final int f9548d;

        /* renamed from: e */
        private int f9549e;

        /* renamed from: f */
        private int f9550f;

        /* renamed from: g */
        private int f9551g;

        public C7074b(ByteBuffer byteBuffer, boolean z) {
            super((C7073a) null);
            this.f9545a = z;
            this.f9546b = byteBuffer.array();
            int arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
            this.f9547c = arrayOffset;
            this.f9548d = arrayOffset;
            this.f9549e = byteBuffer.arrayOffset() + byteBuffer.limit();
        }

        /* renamed from: Q */
        private boolean m12877Q() {
            if (this.f9547c == this.f9549e) {
                return true;
            }
            return false;
        }

        /* renamed from: R */
        private byte m12878R() {
            int i = this.f9547c;
            if (i != this.f9549e) {
                byte[] bArr = this.f9546b;
                this.f9547c = i + 1;
                return bArr[i];
            }
            throw InvalidProtocolBufferException.m12761m();
        }

        /* renamed from: S */
        private Object m12879S(C7160q1.C7162b bVar, Class<?> cls, C7139o oVar) {
            switch (C7073a.f9544a[bVar.ordinal()]) {
                case 1:
                    return Boolean.valueOf(mo40252j());
                case 2:
                    return mo40232F();
                case 3:
                    return Double.valueOf(readDouble());
                case 4:
                    return Integer.valueOf(mo40264t());
                case 5:
                    return Integer.valueOf(mo40251i());
                case 6:
                    return Long.valueOf(mo40244c());
                case 7:
                    return Float.valueOf(readFloat());
                case 8:
                    return Integer.valueOf(mo40234H());
                case 9:
                    return Long.valueOf(mo40239M());
                case 10:
                    return mo40250h(cls, oVar);
                case 11:
                    return Integer.valueOf(mo40236J());
                case 12:
                    return Long.valueOf(mo40254l());
                case 13:
                    return Integer.valueOf(mo40266v());
                case 14:
                    return Long.valueOf(mo40267w());
                case 15:
                    return mo40240N();
                case 16:
                    return Integer.valueOf(mo40257o());
                case 17:
                    return Long.valueOf(mo40243b());
                default:
                    throw new RuntimeException("unsupported field type.");
            }
        }

        /* renamed from: T */
        private <T> T m12880T(C7076e1<T> e1Var, C7139o oVar) {
            int i = this.f9551g;
            this.f9551g = C7160q1.m13682c(C7160q1.m13680a(this.f9550f), 4);
            try {
                T h = e1Var.mo40281h();
                e1Var.mo40278e(h, this, oVar);
                e1Var.mo40276c(h);
                if (this.f9550f == this.f9551g) {
                    return h;
                }
                throw InvalidProtocolBufferException.m12758h();
            } finally {
                this.f9551g = i;
            }
        }

        /* renamed from: U */
        private int m12881U() {
            m12888e0(4);
            return m12882V();
        }

        /* renamed from: V */
        private int m12882V() {
            int i = this.f9547c;
            byte[] bArr = this.f9546b;
            this.f9547c = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        /* renamed from: W */
        private long m12883W() {
            m12888e0(8);
            return m12884X();
        }

        /* renamed from: X */
        private long m12884X() {
            int i = this.f9547c;
            byte[] bArr = this.f9546b;
            this.f9547c = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }

        /* renamed from: Y */
        private <T> T m12885Y(C7076e1<T> e1Var, C7139o oVar) {
            int b0 = m12886b0();
            m12888e0(b0);
            int i = this.f9549e;
            int i2 = this.f9547c + b0;
            this.f9549e = i2;
            try {
                T h = e1Var.mo40281h();
                e1Var.mo40278e(h, this, oVar);
                e1Var.mo40276c(h);
                if (this.f9547c == i2) {
                    return h;
                }
                throw InvalidProtocolBufferException.m12758h();
            } finally {
                this.f9549e = i;
            }
        }

        /* renamed from: b0 */
        private int m12886b0() {
            byte b;
            int i = this.f9547c;
            int i2 = this.f9549e;
            if (i2 != i) {
                byte[] bArr = this.f9546b;
                int i3 = i + 1;
                byte b2 = bArr[i];
                if (b2 >= 0) {
                    this.f9547c = i3;
                    return b2;
                } else if (i2 - i3 < 9) {
                    return (int) m12887d0();
                } else {
                    int i4 = i3 + 1;
                    byte b3 = b2 ^ (bArr[i3] << 7);
                    if (b3 < 0) {
                        b = b3 ^ Byte.MIN_VALUE;
                    } else {
                        int i5 = i4 + 1;
                        byte b4 = b3 ^ (bArr[i4] << 14);
                        if (b4 >= 0) {
                            b = b4 ^ 16256;
                        } else {
                            i4 = i5 + 1;
                            byte b5 = b4 ^ (bArr[i5] << 21);
                            if (b5 < 0) {
                                b = b5 ^ -2080896;
                            } else {
                                i5 = i4 + 1;
                                byte b6 = bArr[i4];
                                b = (b5 ^ (b6 << 28)) ^ 266354560;
                                if (b6 < 0) {
                                    i4 = i5 + 1;
                                    if (bArr[i5] < 0) {
                                        i5 = i4 + 1;
                                        if (bArr[i4] < 0) {
                                            i4 = i5 + 1;
                                            if (bArr[i5] < 0) {
                                                i5 = i4 + 1;
                                                if (bArr[i4] < 0) {
                                                    i4 = i5 + 1;
                                                    if (bArr[i5] < 0) {
                                                        throw InvalidProtocolBufferException.m12756f();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        i4 = i5;
                    }
                    this.f9547c = i4;
                    return b;
                }
            } else {
                throw InvalidProtocolBufferException.m12761m();
            }
        }

        /* renamed from: d0 */
        private long m12887d0() {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte R = m12878R();
                j |= ((long) (R & Byte.MAX_VALUE)) << i;
                if ((R & 128) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.m12756f();
        }

        /* renamed from: e0 */
        private void m12888e0(int i) {
            if (i < 0 || i > this.f9549e - this.f9547c) {
                throw InvalidProtocolBufferException.m12761m();
            }
        }

        /* renamed from: f0 */
        private void m12889f0(int i) {
            if (this.f9547c != i) {
                throw InvalidProtocolBufferException.m12761m();
            }
        }

        /* renamed from: g0 */
        private void m12890g0(int i) {
            if (C7160q1.m13681b(this.f9550f) != i) {
                throw InvalidProtocolBufferException.m12755e();
            }
        }

        /* renamed from: h0 */
        private void m12891h0(int i) {
            m12888e0(i);
            this.f9547c += i;
        }

        /* JADX WARNING: Removed duplicated region for block: B:1:0x000f A[LOOP:0: B:1:0x000f->B:4:0x001c, LOOP_START] */
        /* renamed from: i0 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m12892i0() {
            /*
                r3 = this;
                int r0 = r3.f9551g
                int r1 = r3.f9550f
                int r1 = com.google.protobuf.C7160q1.m13680a(r1)
                r2 = 4
                int r1 = com.google.protobuf.C7160q1.m13682c(r1, r2)
                r3.f9551g = r1
            L_0x000f:
                int r1 = r3.mo40227A()
                r2 = 2147483647(0x7fffffff, float:NaN)
                if (r1 == r2) goto L_0x001e
                boolean r1 = r3.mo40235I()
                if (r1 != 0) goto L_0x000f
            L_0x001e:
                int r1 = r3.f9550f
                int r2 = r3.f9551g
                if (r1 != r2) goto L_0x0027
                r3.f9551g = r0
                return
            L_0x0027:
                com.google.protobuf.InvalidProtocolBufferException r0 = com.google.protobuf.InvalidProtocolBufferException.m12758h()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C7072e.C7074b.m12892i0():void");
        }

        /* renamed from: j0 */
        private void m12893j0() {
            int i = this.f9549e;
            int i2 = this.f9547c;
            if (i - i2 >= 10) {
                byte[] bArr = this.f9546b;
                int i3 = 0;
                while (i3 < 10) {
                    int i4 = i2 + 1;
                    if (bArr[i2] >= 0) {
                        this.f9547c = i4;
                        return;
                    } else {
                        i3++;
                        i2 = i4;
                    }
                }
            }
            m12894k0();
        }

        /* renamed from: k0 */
        private void m12894k0() {
            int i = 0;
            while (i < 10) {
                if (m12878R() < 0) {
                    i++;
                } else {
                    return;
                }
            }
            throw InvalidProtocolBufferException.m12756f();
        }

        /* renamed from: l0 */
        private void m12895l0(int i) {
            m12888e0(i);
            if ((i & 3) != 0) {
                throw InvalidProtocolBufferException.m12758h();
            }
        }

        /* renamed from: m0 */
        private void m12896m0(int i) {
            m12888e0(i);
            if ((i & 7) != 0) {
                throw InvalidProtocolBufferException.m12758h();
            }
        }

        /* renamed from: A */
        public int mo40227A() {
            if (m12877Q()) {
                return Integer.MAX_VALUE;
            }
            int b0 = m12886b0();
            this.f9550f = b0;
            if (b0 == this.f9551g) {
                return Integer.MAX_VALUE;
            }
            return C7160q1.m13680a(b0);
        }

        /* renamed from: B */
        public void mo40228B(List<String> list) {
            mo40272a0(list, false);
        }

        /* renamed from: C */
        public <T> T mo40229C(C7076e1<T> e1Var, C7139o oVar) {
            m12890g0(2);
            return m12885Y(e1Var, oVar);
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(3:19|20|(2:22|35)(3:30|23|24)) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0052, code lost:
            if (mo40235I() != false) goto L_0x0054;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x005a, code lost:
            throw new com.google.protobuf.InvalidProtocolBufferException("Unable to parse map entry.");
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004e */
        /* renamed from: D */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public <K, V> void mo40230D(java.util.Map<K, V> r8, com.google.protobuf.C7115i0.C7116a<K, V> r9, com.google.protobuf.C7139o r10) {
            /*
                r7 = this;
                r0 = 2
                r7.m12890g0(r0)
                int r1 = r7.m12886b0()
                r7.m12888e0(r1)
                int r2 = r7.f9549e
                int r3 = r7.f9547c
                int r3 = r3 + r1
                r7.f9549e = r3
                K r1 = r9.f9627b     // Catch:{ all -> 0x005b }
                V r3 = r9.f9629d     // Catch:{ all -> 0x005b }
            L_0x0016:
                int r4 = r7.mo40227A()     // Catch:{ all -> 0x005b }
                r5 = 2147483647(0x7fffffff, float:NaN)
                if (r4 != r5) goto L_0x0025
                r8.put(r1, r3)     // Catch:{ all -> 0x005b }
                r7.f9549e = r2
                return
            L_0x0025:
                r5 = 1
                java.lang.String r6 = "Unable to parse map entry."
                if (r4 == r5) goto L_0x0046
                if (r4 == r0) goto L_0x0039
                boolean r4 = r7.mo40235I()     // Catch:{ InvalidWireTypeException -> 0x004e }
                if (r4 == 0) goto L_0x0033
                goto L_0x0016
            L_0x0033:
                com.google.protobuf.InvalidProtocolBufferException r4 = new com.google.protobuf.InvalidProtocolBufferException     // Catch:{ InvalidWireTypeException -> 0x004e }
                r4.<init>((java.lang.String) r6)     // Catch:{ InvalidWireTypeException -> 0x004e }
                throw r4     // Catch:{ InvalidWireTypeException -> 0x004e }
            L_0x0039:
                com.google.protobuf.q1$b r4 = r9.f9628c     // Catch:{ InvalidWireTypeException -> 0x004e }
                V r5 = r9.f9629d     // Catch:{ InvalidWireTypeException -> 0x004e }
                java.lang.Class r5 = r5.getClass()     // Catch:{ InvalidWireTypeException -> 0x004e }
                java.lang.Object r3 = r7.m12879S(r4, r5, r10)     // Catch:{ InvalidWireTypeException -> 0x004e }
                goto L_0x0016
            L_0x0046:
                com.google.protobuf.q1$b r4 = r9.f9626a     // Catch:{ InvalidWireTypeException -> 0x004e }
                r5 = 0
                java.lang.Object r1 = r7.m12879S(r4, r5, r5)     // Catch:{ InvalidWireTypeException -> 0x004e }
                goto L_0x0016
            L_0x004e:
                boolean r4 = r7.mo40235I()     // Catch:{ all -> 0x005b }
                if (r4 == 0) goto L_0x0055
                goto L_0x0016
            L_0x0055:
                com.google.protobuf.InvalidProtocolBufferException r8 = new com.google.protobuf.InvalidProtocolBufferException     // Catch:{ all -> 0x005b }
                r8.<init>((java.lang.String) r6)     // Catch:{ all -> 0x005b }
                throw r8     // Catch:{ all -> 0x005b }
            L_0x005b:
                r8 = move-exception
                r7.f9549e = r2
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C7072e.C7074b.mo40230D(java.util.Map, com.google.protobuf.i0$a, com.google.protobuf.o):void");
        }

        /* renamed from: E */
        public void mo40231E(List<String> list) {
            mo40272a0(list, true);
        }

        /* renamed from: F */
        public C7086h mo40232F() {
            C7086h hVar;
            m12890g0(2);
            int b0 = m12886b0();
            if (b0 == 0) {
                return C7086h.f9565c;
            }
            m12888e0(b0);
            if (this.f9545a) {
                hVar = C7086h.m13057P(this.f9546b, this.f9547c, b0);
            } else {
                hVar = C7086h.m13062r(this.f9546b, this.f9547c, b0);
            }
            this.f9547c += b0;
            return hVar;
        }

        /* renamed from: G */
        public void mo40233G(List<Float> list) {
            int i;
            int i2;
            if (list instanceof C7182v) {
                C7182v vVar = (C7182v) list;
                int b = C7160q1.m13681b(this.f9550f);
                if (b == 2) {
                    int b0 = m12886b0();
                    m12895l0(b0);
                    int i3 = this.f9547c + b0;
                    while (this.f9547c < i3) {
                        vVar.mo40672k(Float.intBitsToFloat(m12882V()));
                    }
                } else if (b == 5) {
                    do {
                        vVar.mo40672k(readFloat());
                        if (!m12877Q()) {
                            i2 = this.f9547c;
                        } else {
                            return;
                        }
                    } while (m12886b0() == this.f9550f);
                    this.f9547c = i2;
                } else {
                    throw InvalidProtocolBufferException.m12755e();
                }
            } else {
                int b2 = C7160q1.m13681b(this.f9550f);
                if (b2 == 2) {
                    int b02 = m12886b0();
                    m12895l0(b02);
                    int i4 = this.f9547c + b02;
                    while (this.f9547c < i4) {
                        list.add(Float.valueOf(Float.intBitsToFloat(m12882V())));
                    }
                } else if (b2 == 5) {
                    do {
                        list.add(Float.valueOf(readFloat()));
                        if (!m12877Q()) {
                            i = this.f9547c;
                        } else {
                            return;
                        }
                    } while (m12886b0() == this.f9550f);
                    this.f9547c = i;
                } else {
                    throw InvalidProtocolBufferException.m12755e();
                }
            }
        }

        /* renamed from: H */
        public int mo40234H() {
            m12890g0(0);
            return m12886b0();
        }

        /* renamed from: I */
        public boolean mo40235I() {
            int i;
            if (m12877Q() || (i = this.f9550f) == this.f9551g) {
                return false;
            }
            int b = C7160q1.m13681b(i);
            if (b == 0) {
                m12893j0();
                return true;
            } else if (b == 1) {
                m12891h0(8);
                return true;
            } else if (b == 2) {
                m12891h0(m12886b0());
                return true;
            } else if (b == 3) {
                m12892i0();
                return true;
            } else if (b == 5) {
                m12891h0(4);
                return true;
            } else {
                throw InvalidProtocolBufferException.m12755e();
            }
        }

        /* renamed from: J */
        public int mo40236J() {
            m12890g0(5);
            return m12881U();
        }

        /* renamed from: K */
        public void mo40237K(List<C7086h> list) {
            int i;
            if (C7160q1.m13681b(this.f9550f) == 2) {
                do {
                    list.add(mo40232F());
                    if (!m12877Q()) {
                        i = this.f9547c;
                    } else {
                        return;
                    }
                } while (m12886b0() == this.f9550f);
                this.f9547c = i;
                return;
            }
            throw InvalidProtocolBufferException.m12755e();
        }

        /* renamed from: L */
        public void mo40238L(List<Double> list) {
            int i;
            int i2;
            if (list instanceof C7128l) {
                C7128l lVar = (C7128l) list;
                int b = C7160q1.m13681b(this.f9550f);
                if (b == 1) {
                    do {
                        lVar.mo40535k(readDouble());
                        if (!m12877Q()) {
                            i2 = this.f9547c;
                        } else {
                            return;
                        }
                    } while (m12886b0() == this.f9550f);
                    this.f9547c = i2;
                } else if (b == 2) {
                    int b0 = m12886b0();
                    m12896m0(b0);
                    int i3 = this.f9547c + b0;
                    while (this.f9547c < i3) {
                        lVar.mo40535k(Double.longBitsToDouble(m12884X()));
                    }
                } else {
                    throw InvalidProtocolBufferException.m12755e();
                }
            } else {
                int b2 = C7160q1.m13681b(this.f9550f);
                if (b2 == 1) {
                    do {
                        list.add(Double.valueOf(readDouble()));
                        if (!m12877Q()) {
                            i = this.f9547c;
                        } else {
                            return;
                        }
                    } while (m12886b0() == this.f9550f);
                    this.f9547c = i;
                } else if (b2 == 2) {
                    int b02 = m12886b0();
                    m12896m0(b02);
                    int i4 = this.f9547c + b02;
                    while (this.f9547c < i4) {
                        list.add(Double.valueOf(Double.longBitsToDouble(m12884X())));
                    }
                } else {
                    throw InvalidProtocolBufferException.m12755e();
                }
            }
        }

        /* renamed from: M */
        public long mo40239M() {
            m12890g0(0);
            return mo40273c0();
        }

        /* renamed from: N */
        public String mo40240N() {
            return mo40271Z(true);
        }

        /* renamed from: O */
        public void mo40241O(List<Long> list) {
            int i;
            int i2;
            if (list instanceof C7084g0) {
                C7084g0 g0Var = (C7084g0) list;
                int b = C7160q1.m13681b(this.f9550f);
                if (b == 1) {
                    do {
                        g0Var.mo40311q(mo40244c());
                        if (!m12877Q()) {
                            i2 = this.f9547c;
                        } else {
                            return;
                        }
                    } while (m12886b0() == this.f9550f);
                    this.f9547c = i2;
                } else if (b == 2) {
                    int b0 = m12886b0();
                    m12896m0(b0);
                    int i3 = this.f9547c + b0;
                    while (this.f9547c < i3) {
                        g0Var.mo40311q(m12884X());
                    }
                } else {
                    throw InvalidProtocolBufferException.m12755e();
                }
            } else {
                int b2 = C7160q1.m13681b(this.f9550f);
                if (b2 == 1) {
                    do {
                        list.add(Long.valueOf(mo40244c()));
                        if (!m12877Q()) {
                            i = this.f9547c;
                        } else {
                            return;
                        }
                    } while (m12886b0() == this.f9550f);
                    this.f9547c = i;
                } else if (b2 == 2) {
                    int b02 = m12886b0();
                    m12896m0(b02);
                    int i4 = this.f9547c + b02;
                    while (this.f9547c < i4) {
                        list.add(Long.valueOf(m12884X()));
                    }
                } else {
                    throw InvalidProtocolBufferException.m12755e();
                }
            }
        }

        /* renamed from: Z */
        public String mo40271Z(boolean z) {
            m12890g0(2);
            int b0 = m12886b0();
            if (b0 == 0) {
                return "";
            }
            m12888e0(b0);
            if (z) {
                byte[] bArr = this.f9546b;
                int i = this.f9547c;
                if (!C7151p1.m13633n(bArr, i, i + b0)) {
                    throw InvalidProtocolBufferException.m12754d();
                }
            }
            String str = new String(this.f9546b, this.f9547c, b0, C7196z.f9860a);
            this.f9547c += b0;
            return str;
        }

        /* renamed from: a */
        public void mo40242a(List<Integer> list) {
            int i;
            int i2;
            if (list instanceof C7194y) {
                C7194y yVar = (C7194y) list;
                int b = C7160q1.m13681b(this.f9550f);
                if (b == 0) {
                    do {
                        yVar.mo40719k(mo40266v());
                        if (!m12877Q()) {
                            i2 = this.f9547c;
                        } else {
                            return;
                        }
                    } while (m12886b0() == this.f9550f);
                    this.f9547c = i2;
                } else if (b == 2) {
                    int b0 = this.f9547c + m12886b0();
                    while (this.f9547c < b0) {
                        yVar.mo40719k(C7111i.m13141b(m12886b0()));
                    }
                } else {
                    throw InvalidProtocolBufferException.m12755e();
                }
            } else {
                int b2 = C7160q1.m13681b(this.f9550f);
                if (b2 == 0) {
                    do {
                        list.add(Integer.valueOf(mo40266v()));
                        if (!m12877Q()) {
                            i = this.f9547c;
                        } else {
                            return;
                        }
                    } while (m12886b0() == this.f9550f);
                    this.f9547c = i;
                } else if (b2 == 2) {
                    int b02 = this.f9547c + m12886b0();
                    while (this.f9547c < b02) {
                        list.add(Integer.valueOf(C7111i.m13141b(m12886b0())));
                    }
                } else {
                    throw InvalidProtocolBufferException.m12755e();
                }
            }
        }

        /* renamed from: a0 */
        public void mo40272a0(List<String> list, boolean z) {
            int i;
            int i2;
            if (C7160q1.m13681b(this.f9550f) != 2) {
                throw InvalidProtocolBufferException.m12755e();
            } else if (!(list instanceof C7075e0) || z) {
                do {
                    list.add(mo40271Z(z));
                    if (!m12877Q()) {
                        i = this.f9547c;
                    } else {
                        return;
                    }
                } while (m12886b0() == this.f9550f);
                this.f9547c = i;
            } else {
                C7075e0 e0Var = (C7075e0) list;
                do {
                    e0Var.mo40219o(mo40232F());
                    if (!m12877Q()) {
                        i2 = this.f9547c;
                    } else {
                        return;
                    }
                } while (m12886b0() == this.f9550f);
                this.f9547c = i2;
            }
        }

        /* renamed from: b */
        public long mo40243b() {
            m12890g0(0);
            return mo40273c0();
        }

        /* renamed from: c */
        public long mo40244c() {
            m12890g0(1);
            return m12883W();
        }

        /* renamed from: c0 */
        public long mo40273c0() {
            long j;
            int i;
            long j2;
            long j3;
            byte b;
            int i2 = this.f9547c;
            int i3 = this.f9549e;
            if (i3 != i2) {
                byte[] bArr = this.f9546b;
                int i4 = i2 + 1;
                byte b2 = bArr[i2];
                if (b2 >= 0) {
                    this.f9547c = i4;
                    return (long) b2;
                } else if (i3 - i4 < 9) {
                    return m12887d0();
                } else {
                    int i5 = i4 + 1;
                    byte b3 = b2 ^ (bArr[i4] << 7);
                    if (b3 < 0) {
                        b = b3 ^ Byte.MIN_VALUE;
                    } else {
                        int i6 = i5 + 1;
                        byte b4 = b3 ^ (bArr[i5] << 14);
                        if (b4 >= 0) {
                            i = i6;
                            j = (long) (b4 ^ 16256);
                        } else {
                            i5 = i6 + 1;
                            byte b5 = b4 ^ (bArr[i6] << 21);
                            if (b5 < 0) {
                                b = b5 ^ -2080896;
                            } else {
                                long j4 = (long) b5;
                                int i7 = i5 + 1;
                                long j5 = j4 ^ (((long) bArr[i5]) << 28);
                                if (j5 >= 0) {
                                    j3 = 266354560;
                                } else {
                                    int i8 = i7 + 1;
                                    long j6 = j5 ^ (((long) bArr[i7]) << 35);
                                    if (j6 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        i7 = i8 + 1;
                                        j5 = j6 ^ (((long) bArr[i8]) << 42);
                                        if (j5 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            i8 = i7 + 1;
                                            j6 = j5 ^ (((long) bArr[i7]) << 49);
                                            if (j6 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                int i9 = i8 + 1;
                                                long j7 = (j6 ^ (((long) bArr[i8]) << 56)) ^ 71499008037633920L;
                                                if (j7 < 0) {
                                                    i = i9 + 1;
                                                    if (((long) bArr[i9]) < 0) {
                                                        throw InvalidProtocolBufferException.m12756f();
                                                    }
                                                } else {
                                                    i = i9;
                                                }
                                                j = j7;
                                            }
                                        }
                                    }
                                    j = j6 ^ j2;
                                }
                                j = j5 ^ j3;
                                i = i7;
                            }
                        }
                        this.f9547c = i;
                        return j;
                    }
                    j = (long) b;
                    this.f9547c = i;
                    return j;
                }
            } else {
                throw InvalidProtocolBufferException.m12761m();
            }
        }

        /* renamed from: d */
        public void mo40245d(List<Integer> list) {
            int i;
            int i2;
            if (list instanceof C7194y) {
                C7194y yVar = (C7194y) list;
                int b = C7160q1.m13681b(this.f9550f);
                if (b == 2) {
                    int b0 = m12886b0();
                    m12895l0(b0);
                    int i3 = this.f9547c + b0;
                    while (this.f9547c < i3) {
                        yVar.mo40719k(m12882V());
                    }
                } else if (b == 5) {
                    do {
                        yVar.mo40719k(mo40236J());
                        if (!m12877Q()) {
                            i2 = this.f9547c;
                        } else {
                            return;
                        }
                    } while (m12886b0() == this.f9550f);
                    this.f9547c = i2;
                } else {
                    throw InvalidProtocolBufferException.m12755e();
                }
            } else {
                int b2 = C7160q1.m13681b(this.f9550f);
                if (b2 == 2) {
                    int b02 = m12886b0();
                    m12895l0(b02);
                    int i4 = this.f9547c + b02;
                    while (this.f9547c < i4) {
                        list.add(Integer.valueOf(m12882V()));
                    }
                } else if (b2 == 5) {
                    do {
                        list.add(Integer.valueOf(mo40236J()));
                        if (!m12877Q()) {
                            i = this.f9547c;
                        } else {
                            return;
                        }
                    } while (m12886b0() == this.f9550f);
                    this.f9547c = i;
                } else {
                    throw InvalidProtocolBufferException.m12755e();
                }
            }
        }

        /* renamed from: e */
        public void mo40246e(List<Long> list) {
            int i;
            int i2;
            if (list instanceof C7084g0) {
                C7084g0 g0Var = (C7084g0) list;
                int b = C7160q1.m13681b(this.f9550f);
                if (b == 0) {
                    do {
                        g0Var.mo40311q(mo40267w());
                        if (!m12877Q()) {
                            i2 = this.f9547c;
                        } else {
                            return;
                        }
                    } while (m12886b0() == this.f9550f);
                    this.f9547c = i2;
                } else if (b == 2) {
                    int b0 = this.f9547c + m12886b0();
                    while (this.f9547c < b0) {
                        g0Var.mo40311q(C7111i.m13142c(mo40273c0()));
                    }
                } else {
                    throw InvalidProtocolBufferException.m12755e();
                }
            } else {
                int b2 = C7160q1.m13681b(this.f9550f);
                if (b2 == 0) {
                    do {
                        list.add(Long.valueOf(mo40267w()));
                        if (!m12877Q()) {
                            i = this.f9547c;
                        } else {
                            return;
                        }
                    } while (m12886b0() == this.f9550f);
                    this.f9547c = i;
                } else if (b2 == 2) {
                    int b02 = this.f9547c + m12886b0();
                    while (this.f9547c < b02) {
                        list.add(Long.valueOf(C7111i.m13142c(mo40273c0())));
                    }
                } else {
                    throw InvalidProtocolBufferException.m12755e();
                }
            }
        }

        /* renamed from: f */
        public <T> void mo40247f(List<T> list, C7076e1<T> e1Var, C7139o oVar) {
            int i;
            if (C7160q1.m13681b(this.f9550f) == 3) {
                int i2 = this.f9550f;
                do {
                    list.add(m12880T(e1Var, oVar));
                    if (!m12877Q()) {
                        i = this.f9547c;
                    } else {
                        return;
                    }
                } while (m12886b0() == i2);
                this.f9547c = i;
                return;
            }
            throw InvalidProtocolBufferException.m12755e();
        }

        /* renamed from: g */
        public void mo40248g(List<Integer> list) {
            int i;
            int i2;
            if (list instanceof C7194y) {
                C7194y yVar = (C7194y) list;
                int b = C7160q1.m13681b(this.f9550f);
                if (b == 0) {
                    do {
                        yVar.mo40719k(mo40257o());
                        if (!m12877Q()) {
                            i2 = this.f9547c;
                        } else {
                            return;
                        }
                    } while (m12886b0() == this.f9550f);
                    this.f9547c = i2;
                } else if (b == 2) {
                    int b0 = this.f9547c + m12886b0();
                    while (this.f9547c < b0) {
                        yVar.mo40719k(m12886b0());
                    }
                } else {
                    throw InvalidProtocolBufferException.m12755e();
                }
            } else {
                int b2 = C7160q1.m13681b(this.f9550f);
                if (b2 == 0) {
                    do {
                        list.add(Integer.valueOf(mo40257o()));
                        if (!m12877Q()) {
                            i = this.f9547c;
                        } else {
                            return;
                        }
                    } while (m12886b0() == this.f9550f);
                    this.f9547c = i;
                } else if (b2 == 2) {
                    int b02 = this.f9547c + m12886b0();
                    while (this.f9547c < b02) {
                        list.add(Integer.valueOf(m12886b0()));
                    }
                } else {
                    throw InvalidProtocolBufferException.m12755e();
                }
            }
        }

        public int getTag() {
            return this.f9550f;
        }

        /* renamed from: h */
        public <T> T mo40250h(Class<T> cls, C7139o oVar) {
            m12890g0(2);
            return m12885Y(C7059a1.m12782a().mo40162d(cls), oVar);
        }

        /* renamed from: i */
        public int mo40251i() {
            m12890g0(5);
            return m12881U();
        }

        /* renamed from: j */
        public boolean mo40252j() {
            m12890g0(0);
            if (m12886b0() != 0) {
                return true;
            }
            return false;
        }

        /* renamed from: k */
        public <T> void mo40253k(List<T> list, C7076e1<T> e1Var, C7139o oVar) {
            int i;
            if (C7160q1.m13681b(this.f9550f) == 2) {
                int i2 = this.f9550f;
                do {
                    list.add(m12885Y(e1Var, oVar));
                    if (!m12877Q()) {
                        i = this.f9547c;
                    } else {
                        return;
                    }
                } while (m12886b0() == i2);
                this.f9547c = i;
                return;
            }
            throw InvalidProtocolBufferException.m12755e();
        }

        /* renamed from: l */
        public long mo40254l() {
            m12890g0(1);
            return m12883W();
        }

        /* renamed from: m */
        public void mo40255m(List<Long> list) {
            int i;
            int i2;
            if (list instanceof C7084g0) {
                C7084g0 g0Var = (C7084g0) list;
                int b = C7160q1.m13681b(this.f9550f);
                if (b == 0) {
                    do {
                        g0Var.mo40311q(mo40243b());
                        if (!m12877Q()) {
                            i2 = this.f9547c;
                        } else {
                            return;
                        }
                    } while (m12886b0() == this.f9550f);
                    this.f9547c = i2;
                } else if (b == 2) {
                    int b0 = this.f9547c + m12886b0();
                    while (this.f9547c < b0) {
                        g0Var.mo40311q(mo40273c0());
                    }
                    m12889f0(b0);
                } else {
                    throw InvalidProtocolBufferException.m12755e();
                }
            } else {
                int b2 = C7160q1.m13681b(this.f9550f);
                if (b2 == 0) {
                    do {
                        list.add(Long.valueOf(mo40243b()));
                        if (!m12877Q()) {
                            i = this.f9547c;
                        } else {
                            return;
                        }
                    } while (m12886b0() == this.f9550f);
                    this.f9547c = i;
                } else if (b2 == 2) {
                    int b02 = this.f9547c + m12886b0();
                    while (this.f9547c < b02) {
                        list.add(Long.valueOf(mo40273c0()));
                    }
                    m12889f0(b02);
                } else {
                    throw InvalidProtocolBufferException.m12755e();
                }
            }
        }

        /* renamed from: n */
        public <T> T mo40256n(C7076e1<T> e1Var, C7139o oVar) {
            m12890g0(3);
            return m12880T(e1Var, oVar);
        }

        /* renamed from: o */
        public int mo40257o() {
            m12890g0(0);
            return m12886b0();
        }

        /* renamed from: p */
        public void mo40258p(List<Long> list) {
            int i;
            int i2;
            if (list instanceof C7084g0) {
                C7084g0 g0Var = (C7084g0) list;
                int b = C7160q1.m13681b(this.f9550f);
                if (b == 0) {
                    do {
                        g0Var.mo40311q(mo40239M());
                        if (!m12877Q()) {
                            i2 = this.f9547c;
                        } else {
                            return;
                        }
                    } while (m12886b0() == this.f9550f);
                    this.f9547c = i2;
                } else if (b == 2) {
                    int b0 = this.f9547c + m12886b0();
                    while (this.f9547c < b0) {
                        g0Var.mo40311q(mo40273c0());
                    }
                    m12889f0(b0);
                } else {
                    throw InvalidProtocolBufferException.m12755e();
                }
            } else {
                int b2 = C7160q1.m13681b(this.f9550f);
                if (b2 == 0) {
                    do {
                        list.add(Long.valueOf(mo40239M()));
                        if (!m12877Q()) {
                            i = this.f9547c;
                        } else {
                            return;
                        }
                    } while (m12886b0() == this.f9550f);
                    this.f9547c = i;
                } else if (b2 == 2) {
                    int b02 = this.f9547c + m12886b0();
                    while (this.f9547c < b02) {
                        list.add(Long.valueOf(mo40273c0()));
                    }
                    m12889f0(b02);
                } else {
                    throw InvalidProtocolBufferException.m12755e();
                }
            }
        }

        /* renamed from: q */
        public void mo40259q(List<Long> list) {
            int i;
            int i2;
            if (list instanceof C7084g0) {
                C7084g0 g0Var = (C7084g0) list;
                int b = C7160q1.m13681b(this.f9550f);
                if (b == 1) {
                    do {
                        g0Var.mo40311q(mo40254l());
                        if (!m12877Q()) {
                            i2 = this.f9547c;
                        } else {
                            return;
                        }
                    } while (m12886b0() == this.f9550f);
                    this.f9547c = i2;
                } else if (b == 2) {
                    int b0 = m12886b0();
                    m12896m0(b0);
                    int i3 = this.f9547c + b0;
                    while (this.f9547c < i3) {
                        g0Var.mo40311q(m12884X());
                    }
                } else {
                    throw InvalidProtocolBufferException.m12755e();
                }
            } else {
                int b2 = C7160q1.m13681b(this.f9550f);
                if (b2 == 1) {
                    do {
                        list.add(Long.valueOf(mo40254l()));
                        if (!m12877Q()) {
                            i = this.f9547c;
                        } else {
                            return;
                        }
                    } while (m12886b0() == this.f9550f);
                    this.f9547c = i;
                } else if (b2 == 2) {
                    int b02 = m12886b0();
                    m12896m0(b02);
                    int i4 = this.f9547c + b02;
                    while (this.f9547c < i4) {
                        list.add(Long.valueOf(m12884X()));
                    }
                } else {
                    throw InvalidProtocolBufferException.m12755e();
                }
            }
        }

        /* renamed from: r */
        public void mo40260r(List<Integer> list) {
            int i;
            int i2;
            if (list instanceof C7194y) {
                C7194y yVar = (C7194y) list;
                int b = C7160q1.m13681b(this.f9550f);
                if (b == 0) {
                    do {
                        yVar.mo40719k(mo40234H());
                        if (!m12877Q()) {
                            i2 = this.f9547c;
                        } else {
                            return;
                        }
                    } while (m12886b0() == this.f9550f);
                    this.f9547c = i2;
                } else if (b == 2) {
                    int b0 = this.f9547c + m12886b0();
                    while (this.f9547c < b0) {
                        yVar.mo40719k(m12886b0());
                    }
                    m12889f0(b0);
                } else {
                    throw InvalidProtocolBufferException.m12755e();
                }
            } else {
                int b2 = C7160q1.m13681b(this.f9550f);
                if (b2 == 0) {
                    do {
                        list.add(Integer.valueOf(mo40234H()));
                        if (!m12877Q()) {
                            i = this.f9547c;
                        } else {
                            return;
                        }
                    } while (m12886b0() == this.f9550f);
                    this.f9547c = i;
                } else if (b2 == 2) {
                    int b02 = this.f9547c + m12886b0();
                    while (this.f9547c < b02) {
                        list.add(Integer.valueOf(m12886b0()));
                    }
                    m12889f0(b02);
                } else {
                    throw InvalidProtocolBufferException.m12755e();
                }
            }
        }

        public double readDouble() {
            m12890g0(1);
            return Double.longBitsToDouble(m12883W());
        }

        public float readFloat() {
            m12890g0(5);
            return Float.intBitsToFloat(m12881U());
        }

        /* renamed from: s */
        public void mo40263s(List<Integer> list) {
            int i;
            int i2;
            if (list instanceof C7194y) {
                C7194y yVar = (C7194y) list;
                int b = C7160q1.m13681b(this.f9550f);
                if (b == 0) {
                    do {
                        yVar.mo40719k(mo40264t());
                        if (!m12877Q()) {
                            i2 = this.f9547c;
                        } else {
                            return;
                        }
                    } while (m12886b0() == this.f9550f);
                    this.f9547c = i2;
                } else if (b == 2) {
                    int b0 = this.f9547c + m12886b0();
                    while (this.f9547c < b0) {
                        yVar.mo40719k(m12886b0());
                    }
                } else {
                    throw InvalidProtocolBufferException.m12755e();
                }
            } else {
                int b2 = C7160q1.m13681b(this.f9550f);
                if (b2 == 0) {
                    do {
                        list.add(Integer.valueOf(mo40264t()));
                        if (!m12877Q()) {
                            i = this.f9547c;
                        } else {
                            return;
                        }
                    } while (m12886b0() == this.f9550f);
                    this.f9547c = i;
                } else if (b2 == 2) {
                    int b02 = this.f9547c + m12886b0();
                    while (this.f9547c < b02) {
                        list.add(Integer.valueOf(m12886b0()));
                    }
                } else {
                    throw InvalidProtocolBufferException.m12755e();
                }
            }
        }

        /* renamed from: t */
        public int mo40264t() {
            m12890g0(0);
            return m12886b0();
        }

        /* renamed from: u */
        public void mo40265u(List<Integer> list) {
            int i;
            int i2;
            if (list instanceof C7194y) {
                C7194y yVar = (C7194y) list;
                int b = C7160q1.m13681b(this.f9550f);
                if (b == 2) {
                    int b0 = m12886b0();
                    m12895l0(b0);
                    int i3 = this.f9547c + b0;
                    while (this.f9547c < i3) {
                        yVar.mo40719k(m12882V());
                    }
                } else if (b == 5) {
                    do {
                        yVar.mo40719k(mo40251i());
                        if (!m12877Q()) {
                            i2 = this.f9547c;
                        } else {
                            return;
                        }
                    } while (m12886b0() == this.f9550f);
                    this.f9547c = i2;
                } else {
                    throw InvalidProtocolBufferException.m12755e();
                }
            } else {
                int b2 = C7160q1.m13681b(this.f9550f);
                if (b2 == 2) {
                    int b02 = m12886b0();
                    m12895l0(b02);
                    int i4 = this.f9547c + b02;
                    while (this.f9547c < i4) {
                        list.add(Integer.valueOf(m12882V()));
                    }
                } else if (b2 == 5) {
                    do {
                        list.add(Integer.valueOf(mo40251i()));
                        if (!m12877Q()) {
                            i = this.f9547c;
                        } else {
                            return;
                        }
                    } while (m12886b0() == this.f9550f);
                    this.f9547c = i;
                } else {
                    throw InvalidProtocolBufferException.m12755e();
                }
            }
        }

        /* renamed from: v */
        public int mo40266v() {
            m12890g0(0);
            return C7111i.m13141b(m12886b0());
        }

        /* renamed from: w */
        public long mo40267w() {
            m12890g0(0);
            return C7111i.m13142c(mo40273c0());
        }

        /* renamed from: x */
        public void mo40268x(List<Boolean> list) {
            int i;
            boolean z;
            int i2;
            boolean z2;
            if (list instanceof C7077f) {
                C7077f fVar = (C7077f) list;
                int b = C7160q1.m13681b(this.f9550f);
                if (b == 0) {
                    do {
                        fVar.mo40291q(mo40252j());
                        if (!m12877Q()) {
                            i2 = this.f9547c;
                        } else {
                            return;
                        }
                    } while (m12886b0() == this.f9550f);
                    this.f9547c = i2;
                } else if (b == 2) {
                    int b0 = this.f9547c + m12886b0();
                    while (this.f9547c < b0) {
                        if (m12886b0() != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        fVar.mo40291q(z2);
                    }
                    m12889f0(b0);
                } else {
                    throw InvalidProtocolBufferException.m12755e();
                }
            } else {
                int b2 = C7160q1.m13681b(this.f9550f);
                if (b2 == 0) {
                    do {
                        list.add(Boolean.valueOf(mo40252j()));
                        if (!m12877Q()) {
                            i = this.f9547c;
                        } else {
                            return;
                        }
                    } while (m12886b0() == this.f9550f);
                    this.f9547c = i;
                } else if (b2 == 2) {
                    int b02 = this.f9547c + m12886b0();
                    while (this.f9547c < b02) {
                        if (m12886b0() != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        list.add(Boolean.valueOf(z));
                    }
                    m12889f0(b02);
                } else {
                    throw InvalidProtocolBufferException.m12755e();
                }
            }
        }

        /* renamed from: y */
        public String mo40269y() {
            return mo40271Z(false);
        }

        /* renamed from: z */
        public <T> T mo40270z(Class<T> cls, C7139o oVar) {
            m12890g0(3);
            return m12880T(C7059a1.m12782a().mo40162d(cls), oVar);
        }
    }

    private C7072e() {
    }

    /* synthetic */ C7072e(C7073a aVar) {
        this();
    }

    /* renamed from: P */
    public static C7072e m12876P(ByteBuffer byteBuffer, boolean z) {
        if (byteBuffer.hasArray()) {
            return new C7074b(byteBuffer, z);
        }
        throw new IllegalArgumentException("Direct buffers not yet supported");
    }
}
