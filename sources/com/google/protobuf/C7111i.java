package com.google.protobuf;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.protobuf.i */
/* compiled from: CodedInputStream */
public abstract class C7111i {

    /* renamed from: a */
    int f9601a;

    /* renamed from: b */
    int f9602b;

    /* renamed from: c */
    int f9603c;

    /* renamed from: d */
    C7118j f9604d;

    /* renamed from: e */
    private boolean f9605e;

    /* renamed from: com.google.protobuf.i$b */
    /* compiled from: CodedInputStream */
    private static final class C7113b extends C7111i {

        /* renamed from: f */
        private final byte[] f9606f;

        /* renamed from: g */
        private final boolean f9607g;

        /* renamed from: h */
        private int f9608h;

        /* renamed from: i */
        private int f9609i;

        /* renamed from: j */
        private int f9610j;

        /* renamed from: k */
        private int f9611k;

        /* renamed from: l */
        private int f9612l;

        /* renamed from: m */
        private boolean f9613m;

        /* renamed from: n */
        private int f9614n;

        /* renamed from: N */
        private void m13173N() {
            int i = this.f9608h + this.f9609i;
            this.f9608h = i;
            int i2 = i - this.f9611k;
            int i3 = this.f9614n;
            if (i2 > i3) {
                int i4 = i2 - i3;
                this.f9609i = i4;
                this.f9608h = i - i4;
                return;
            }
            this.f9609i = 0;
        }

        /* renamed from: Q */
        private void m13174Q() {
            if (this.f9608h - this.f9610j >= 10) {
                m13175R();
            } else {
                m13176S();
            }
        }

        /* renamed from: R */
        private void m13175R() {
            int i = 0;
            while (i < 10) {
                byte[] bArr = this.f9606f;
                int i2 = this.f9610j;
                this.f9610j = i2 + 1;
                if (bArr[i2] < 0) {
                    i++;
                } else {
                    return;
                }
            }
            throw InvalidProtocolBufferException.m12756f();
        }

        /* renamed from: S */
        private void m13176S() {
            int i = 0;
            while (i < 10) {
                if (mo40423G() < 0) {
                    i++;
                } else {
                    return;
                }
            }
            throw InvalidProtocolBufferException.m12756f();
        }

        /* renamed from: A */
        public String mo40398A() {
            int K = mo40427K();
            if (K > 0) {
                int i = this.f9608h;
                int i2 = this.f9610j;
                if (K <= i - i2) {
                    String e = C7151p1.m13624e(this.f9606f, i2, K);
                    this.f9610j += K;
                    return e;
                }
            }
            if (K == 0) {
                return "";
            }
            if (K <= 0) {
                throw InvalidProtocolBufferException.m12757g();
            }
            throw InvalidProtocolBufferException.m12761m();
        }

        /* renamed from: B */
        public int mo40399B() {
            if (mo40406e()) {
                this.f9612l = 0;
                return 0;
            }
            int K = mo40427K();
            this.f9612l = K;
            if (C7160q1.m13680a(K) != 0) {
                return this.f9612l;
            }
            throw InvalidProtocolBufferException.m12753c();
        }

        /* renamed from: C */
        public int mo40400C() {
            return mo40427K();
        }

        /* renamed from: D */
        public long mo40401D() {
            return mo40428L();
        }

        /* renamed from: F */
        public boolean mo40403F(int i) {
            int b = C7160q1.m13681b(i);
            if (b == 0) {
                m13174Q();
                return true;
            } else if (b == 1) {
                mo40431P(8);
                return true;
            } else if (b == 2) {
                mo40431P(mo40427K());
                return true;
            } else if (b == 3) {
                mo40430O();
                mo40404a(C7160q1.m13682c(C7160q1.m13680a(i), 4));
                return true;
            } else if (b == 4) {
                return false;
            } else {
                if (b == 5) {
                    mo40431P(4);
                    return true;
                }
                throw InvalidProtocolBufferException.m12755e();
            }
        }

        /* renamed from: G */
        public byte mo40423G() {
            int i = this.f9610j;
            if (i != this.f9608h) {
                byte[] bArr = this.f9606f;
                this.f9610j = i + 1;
                return bArr[i];
            }
            throw InvalidProtocolBufferException.m12761m();
        }

        /* renamed from: H */
        public byte[] mo40424H(int i) {
            if (i > 0) {
                int i2 = this.f9608h;
                int i3 = this.f9610j;
                if (i <= i2 - i3) {
                    int i4 = i + i3;
                    this.f9610j = i4;
                    return Arrays.copyOfRange(this.f9606f, i3, i4);
                }
            }
            if (i > 0) {
                throw InvalidProtocolBufferException.m12761m();
            } else if (i == 0) {
                return C7196z.f9862c;
            } else {
                throw InvalidProtocolBufferException.m12757g();
            }
        }

        /* renamed from: I */
        public int mo40425I() {
            int i = this.f9610j;
            if (this.f9608h - i >= 4) {
                byte[] bArr = this.f9606f;
                this.f9610j = i + 4;
                return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
            }
            throw InvalidProtocolBufferException.m12761m();
        }

        /* renamed from: J */
        public long mo40426J() {
            int i = this.f9610j;
            if (this.f9608h - i >= 8) {
                byte[] bArr = this.f9606f;
                this.f9610j = i + 8;
                return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
            }
            throw InvalidProtocolBufferException.m12761m();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
            if (r2[r3] < 0) goto L_0x006a;
         */
        /* renamed from: K */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo40427K() {
            /*
                r5 = this;
                int r0 = r5.f9610j
                int r1 = r5.f9608h
                if (r1 != r0) goto L_0x0007
                goto L_0x006a
            L_0x0007:
                byte[] r2 = r5.f9606f
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0012
                r5.f9610j = r3
                return r0
            L_0x0012:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L_0x0018
                goto L_0x006a
            L_0x0018:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0024
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
                goto L_0x0070
            L_0x0024:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x0031
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L_0x002f:
                r1 = r3
                goto L_0x0070
            L_0x0031:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x003f
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L_0x0070
            L_0x003f:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r4 = r1 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r3 = r2[r3]
                if (r3 >= 0) goto L_0x0070
                int r3 = r1 + 1
                byte r1 = r2[r1]
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r3 = r2[r3]
                if (r3 >= 0) goto L_0x0070
                int r3 = r1 + 1
                byte r1 = r2[r1]
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r2 = r2[r3]
                if (r2 >= 0) goto L_0x0070
            L_0x006a:
                long r0 = r5.mo40429M()
                int r0 = (int) r0
                return r0
            L_0x0070:
                r5.f9610j = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C7111i.C7113b.mo40427K():int");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b4, code lost:
            if (((long) r2[r0]) < 0) goto L_0x00b6;
         */
        /* renamed from: L */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long mo40428L() {
            /*
                r11 = this;
                int r0 = r11.f9610j
                int r1 = r11.f9608h
                if (r1 != r0) goto L_0x0008
                goto L_0x00b6
            L_0x0008:
                byte[] r2 = r11.f9606f
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0014
                r11.f9610j = r3
                long r0 = (long) r0
                return r0
            L_0x0014:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L_0x001b
                goto L_0x00b6
            L_0x001b:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0029
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            L_0x0026:
                long r2 = (long) r0
                goto L_0x00bd
            L_0x0029:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x003a
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
                long r0 = (long) r0
                r9 = r0
                r1 = r3
                r2 = r9
                goto L_0x00bd
            L_0x003a:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0048
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L_0x0026
            L_0x0048:
                long r3 = (long) r0
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r5 = (long) r1
                r1 = 28
                long r5 = r5 << r1
                long r3 = r3 ^ r5
                r5 = 0
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L_0x005f
                r1 = 266354560(0xfe03f80, double:1.315966377E-315)
            L_0x005b:
                long r2 = r3 ^ r1
                r1 = r0
                goto L_0x00bd
            L_0x005f:
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                r0 = 35
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x0074
                r5 = -34093383808(0xfffffff80fe03f80, double:NaN)
            L_0x0071:
                long r2 = r3 ^ r5
                goto L_0x00bd
            L_0x0074:
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r7 = (long) r1
                r1 = 42
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L_0x0087
                r1 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
                goto L_0x005b
            L_0x0087:
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                r0 = 49
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x009a
                r5 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
                goto L_0x0071
            L_0x009a:
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r7 = (long) r1
                r1 = 56
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                r7 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 >= 0) goto L_0x00bb
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x00bc
            L_0x00b6:
                long r0 = r11.mo40429M()
                return r0
            L_0x00bb:
                r1 = r0
            L_0x00bc:
                r2 = r3
            L_0x00bd:
                r11.f9610j = r1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C7111i.C7113b.mo40428L():long");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: M */
        public long mo40429M() {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte G = mo40423G();
                j |= ((long) (G & Byte.MAX_VALUE)) << i;
                if ((G & 128) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.m12756f();
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* renamed from: O */
        public void mo40430O() {
            /*
                r1 = this;
            L_0x0000:
                int r0 = r1.mo40399B()
                if (r0 == 0) goto L_0x000c
                boolean r0 = r1.mo40403F(r0)
                if (r0 != 0) goto L_0x0000
            L_0x000c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C7111i.C7113b.mo40430O():void");
        }

        /* renamed from: P */
        public void mo40431P(int i) {
            if (i >= 0) {
                int i2 = this.f9608h;
                int i3 = this.f9610j;
                if (i <= i2 - i3) {
                    this.f9610j = i3 + i;
                    return;
                }
            }
            if (i < 0) {
                throw InvalidProtocolBufferException.m12757g();
            }
            throw InvalidProtocolBufferException.m12761m();
        }

        /* renamed from: a */
        public void mo40404a(int i) {
            if (this.f9612l != i) {
                throw InvalidProtocolBufferException.m12752b();
            }
        }

        /* renamed from: d */
        public int mo40405d() {
            return this.f9610j - this.f9611k;
        }

        /* renamed from: e */
        public boolean mo40406e() {
            if (this.f9610j == this.f9608h) {
                return true;
            }
            return false;
        }

        /* renamed from: k */
        public void mo40407k(int i) {
            this.f9614n = i;
            m13173N();
        }

        /* renamed from: l */
        public int mo40408l(int i) {
            if (i >= 0) {
                int d = i + mo40405d();
                if (d >= 0) {
                    int i2 = this.f9614n;
                    if (d <= i2) {
                        this.f9614n = d;
                        m13173N();
                        return i2;
                    }
                    throw InvalidProtocolBufferException.m12761m();
                }
                throw InvalidProtocolBufferException.m12758h();
            }
            throw InvalidProtocolBufferException.m12757g();
        }

        /* renamed from: m */
        public boolean mo40409m() {
            if (mo40428L() != 0) {
                return true;
            }
            return false;
        }

        /* renamed from: n */
        public C7086h mo40410n() {
            C7086h hVar;
            int K = mo40427K();
            if (K > 0) {
                int i = this.f9608h;
                int i2 = this.f9610j;
                if (K <= i - i2) {
                    if (!this.f9607g || !this.f9613m) {
                        hVar = C7086h.m13062r(this.f9606f, i2, K);
                    } else {
                        hVar = C7086h.m13057P(this.f9606f, i2, K);
                    }
                    this.f9610j += K;
                    return hVar;
                }
            }
            if (K == 0) {
                return C7086h.f9565c;
            }
            return C7086h.m13056O(mo40424H(K));
        }

        /* renamed from: o */
        public double mo40411o() {
            return Double.longBitsToDouble(mo40426J());
        }

        /* renamed from: p */
        public int mo40412p() {
            return mo40427K();
        }

        /* renamed from: q */
        public int mo40413q() {
            return mo40425I();
        }

        /* renamed from: r */
        public long mo40414r() {
            return mo40426J();
        }

        /* renamed from: s */
        public float mo40415s() {
            return Float.intBitsToFloat(mo40425I());
        }

        /* renamed from: t */
        public int mo40416t() {
            return mo40427K();
        }

        /* renamed from: u */
        public long mo40417u() {
            return mo40428L();
        }

        /* renamed from: v */
        public int mo40418v() {
            return mo40425I();
        }

        /* renamed from: w */
        public long mo40419w() {
            return mo40426J();
        }

        /* renamed from: x */
        public int mo40420x() {
            return C7111i.m13141b(mo40427K());
        }

        /* renamed from: y */
        public long mo40421y() {
            return C7111i.m13142c(mo40428L());
        }

        /* renamed from: z */
        public String mo40422z() {
            int K = mo40427K();
            if (K > 0) {
                int i = this.f9608h;
                int i2 = this.f9610j;
                if (K <= i - i2) {
                    String str = new String(this.f9606f, i2, K, C7196z.f9860a);
                    this.f9610j += K;
                    return str;
                }
            }
            if (K == 0) {
                return "";
            }
            if (K < 0) {
                throw InvalidProtocolBufferException.m12757g();
            }
            throw InvalidProtocolBufferException.m12761m();
        }

        private C7113b(byte[] bArr, int i, int i2, boolean z) {
            super();
            this.f9614n = Integer.MAX_VALUE;
            this.f9606f = bArr;
            this.f9608h = i2 + i;
            this.f9610j = i;
            this.f9611k = i;
            this.f9607g = z;
        }
    }

    /* renamed from: com.google.protobuf.i$c */
    /* compiled from: CodedInputStream */
    private static final class C7114c extends C7111i {

        /* renamed from: f */
        private final InputStream f9615f;

        /* renamed from: g */
        private final byte[] f9616g;

        /* renamed from: h */
        private int f9617h;

        /* renamed from: i */
        private int f9618i;

        /* renamed from: j */
        private int f9619j;

        /* renamed from: k */
        private int f9620k;

        /* renamed from: l */
        private int f9621l;

        /* renamed from: m */
        private int f9622m;

        /* renamed from: G */
        private static int m13210G(InputStream inputStream) {
            try {
                return inputStream.available();
            } catch (InvalidProtocolBufferException e) {
                e.mo40146j();
                throw e;
            }
        }

        /* renamed from: H */
        private static int m13211H(InputStream inputStream, byte[] bArr, int i, int i2) {
            try {
                return inputStream.read(bArr, i, i2);
            } catch (InvalidProtocolBufferException e) {
                e.mo40146j();
                throw e;
            }
        }

        /* renamed from: I */
        private C7086h m13212I(int i) {
            byte[] L = m13214L(i);
            if (L != null) {
                return C7086h.m13061q(L);
            }
            int i2 = this.f9619j;
            int i3 = this.f9617h;
            int i4 = i3 - i2;
            this.f9621l += i3;
            this.f9619j = 0;
            this.f9617h = 0;
            List<byte[]> M = m13215M(i - i4);
            byte[] bArr = new byte[i];
            System.arraycopy(this.f9616g, i2, bArr, 0, i4);
            for (byte[] next : M) {
                System.arraycopy(next, 0, bArr, i4, next.length);
                i4 += next.length;
            }
            return C7086h.m13056O(bArr);
        }

        /* renamed from: K */
        private byte[] m13213K(int i, boolean z) {
            byte[] L = m13214L(i);
            if (L == null) {
                int i2 = this.f9619j;
                int i3 = this.f9617h;
                int i4 = i3 - i2;
                this.f9621l += i3;
                this.f9619j = 0;
                this.f9617h = 0;
                List<byte[]> M = m13215M(i - i4);
                byte[] bArr = new byte[i];
                System.arraycopy(this.f9616g, i2, bArr, 0, i4);
                for (byte[] next : M) {
                    System.arraycopy(next, 0, bArr, i4, next.length);
                    i4 += next.length;
                }
                return bArr;
            } else if (z) {
                return (byte[]) L.clone();
            } else {
                return L;
            }
        }

        /* renamed from: L */
        private byte[] m13214L(int i) {
            if (i == 0) {
                return C7196z.f9862c;
            }
            if (i >= 0) {
                int i2 = this.f9621l;
                int i3 = this.f9619j;
                int i4 = i2 + i3 + i;
                if (i4 - this.f9603c <= 0) {
                    int i5 = this.f9622m;
                    if (i4 <= i5) {
                        int i6 = this.f9617h - i3;
                        int i7 = i - i6;
                        if (i7 >= 4096 && i7 > m13210G(this.f9615f)) {
                            return null;
                        }
                        byte[] bArr = new byte[i];
                        System.arraycopy(this.f9616g, this.f9619j, bArr, 0, i6);
                        this.f9621l += this.f9617h;
                        this.f9619j = 0;
                        this.f9617h = 0;
                        while (i6 < i) {
                            int H = m13211H(this.f9615f, bArr, i6, i - i6);
                            if (H != -1) {
                                this.f9621l += H;
                                i6 += H;
                            } else {
                                throw InvalidProtocolBufferException.m12761m();
                            }
                        }
                        return bArr;
                    }
                    mo40439W((i5 - i2) - i3);
                    throw InvalidProtocolBufferException.m12761m();
                }
                throw InvalidProtocolBufferException.m12760l();
            }
            throw InvalidProtocolBufferException.m12757g();
        }

        /* renamed from: M */
        private List<byte[]> m13215M(int i) {
            ArrayList arrayList = new ArrayList();
            while (i > 0) {
                int min = Math.min(i, 4096);
                byte[] bArr = new byte[min];
                int i2 = 0;
                while (i2 < min) {
                    int read = this.f9615f.read(bArr, i2, min - i2);
                    if (read != -1) {
                        this.f9621l += read;
                        i2 += read;
                    } else {
                        throw InvalidProtocolBufferException.m12761m();
                    }
                }
                i -= min;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        /* renamed from: S */
        private void m13216S() {
            int i = this.f9617h + this.f9618i;
            this.f9617h = i;
            int i2 = this.f9621l + i;
            int i3 = this.f9622m;
            if (i2 > i3) {
                int i4 = i2 - i3;
                this.f9618i = i4;
                this.f9617h = i - i4;
                return;
            }
            this.f9618i = 0;
        }

        /* renamed from: T */
        private void m13217T(int i) {
            if (m13223b0(i)) {
                return;
            }
            if (i > (this.f9603c - this.f9621l) - this.f9619j) {
                throw InvalidProtocolBufferException.m12760l();
            }
            throw InvalidProtocolBufferException.m12761m();
        }

        /* renamed from: U */
        private static long m13218U(InputStream inputStream, long j) {
            try {
                return inputStream.skip(j);
            } catch (InvalidProtocolBufferException e) {
                e.mo40146j();
                throw e;
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0057, code lost:
            throw new java.lang.IllegalStateException(r7.f9615f.getClass() + "#skip returned invalid result: " + r1 + "\nThe InputStream implementation is buggy.");
         */
        /* renamed from: X */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m13219X(int r8) {
            /*
                r7 = this;
                if (r8 < 0) goto L_0x0092
                int r0 = r7.f9621l
                int r1 = r7.f9619j
                int r2 = r0 + r1
                int r2 = r2 + r8
                int r3 = r7.f9622m
                if (r2 > r3) goto L_0x0088
                int r0 = r0 + r1
                r7.f9621l = r0
                int r0 = r7.f9617h
                int r0 = r0 - r1
                r1 = 0
                r7.f9617h = r1
                r7.f9619j = r1
            L_0x0018:
                if (r0 >= r8) goto L_0x0062
                int r1 = r8 - r0
                java.io.InputStream r2 = r7.f9615f     // Catch:{ all -> 0x0058 }
                long r3 = (long) r1     // Catch:{ all -> 0x0058 }
                long r1 = m13218U(r2, r3)     // Catch:{ all -> 0x0058 }
                r5 = 0
                int r5 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
                if (r5 < 0) goto L_0x0033
                int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r3 > 0) goto L_0x0033
                if (r5 != 0) goto L_0x0030
                goto L_0x0062
            L_0x0030:
                int r1 = (int) r1     // Catch:{ all -> 0x0058 }
                int r0 = r0 + r1
                goto L_0x0018
            L_0x0033:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0058 }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0058 }
                r3.<init>()     // Catch:{ all -> 0x0058 }
                java.io.InputStream r4 = r7.f9615f     // Catch:{ all -> 0x0058 }
                java.lang.Class r4 = r4.getClass()     // Catch:{ all -> 0x0058 }
                r3.append(r4)     // Catch:{ all -> 0x0058 }
                java.lang.String r4 = "#skip returned invalid result: "
                r3.append(r4)     // Catch:{ all -> 0x0058 }
                r3.append(r1)     // Catch:{ all -> 0x0058 }
                java.lang.String r1 = "\nThe InputStream implementation is buggy."
                r3.append(r1)     // Catch:{ all -> 0x0058 }
                java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x0058 }
                r8.<init>(r1)     // Catch:{ all -> 0x0058 }
                throw r8     // Catch:{ all -> 0x0058 }
            L_0x0058:
                r8 = move-exception
                int r1 = r7.f9621l
                int r1 = r1 + r0
                r7.f9621l = r1
                r7.m13216S()
                throw r8
            L_0x0062:
                int r1 = r7.f9621l
                int r1 = r1 + r0
                r7.f9621l = r1
                r7.m13216S()
                if (r0 >= r8) goto L_0x0087
                int r0 = r7.f9617h
                int r1 = r7.f9619j
                int r1 = r0 - r1
                r7.f9619j = r0
                r0 = 1
                r7.m13217T(r0)
            L_0x0078:
                int r2 = r8 - r1
                int r3 = r7.f9617h
                if (r2 <= r3) goto L_0x0085
                int r1 = r1 + r3
                r7.f9619j = r3
                r7.m13217T(r0)
                goto L_0x0078
            L_0x0085:
                r7.f9619j = r2
            L_0x0087:
                return
            L_0x0088:
                int r3 = r3 - r0
                int r3 = r3 - r1
                r7.mo40439W(r3)
                com.google.protobuf.InvalidProtocolBufferException r8 = com.google.protobuf.InvalidProtocolBufferException.m12761m()
                throw r8
            L_0x0092:
                com.google.protobuf.InvalidProtocolBufferException r8 = com.google.protobuf.InvalidProtocolBufferException.m12757g()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C7111i.C7114c.m13219X(int):void");
        }

        /* renamed from: Y */
        private void m13220Y() {
            if (this.f9617h - this.f9619j >= 10) {
                m13221Z();
            } else {
                m13222a0();
            }
        }

        /* renamed from: Z */
        private void m13221Z() {
            int i = 0;
            while (i < 10) {
                byte[] bArr = this.f9616g;
                int i2 = this.f9619j;
                this.f9619j = i2 + 1;
                if (bArr[i2] < 0) {
                    i++;
                } else {
                    return;
                }
            }
            throw InvalidProtocolBufferException.m12756f();
        }

        /* renamed from: a0 */
        private void m13222a0() {
            int i = 0;
            while (i < 10) {
                if (mo40432J() < 0) {
                    i++;
                } else {
                    return;
                }
            }
            throw InvalidProtocolBufferException.m12756f();
        }

        /* renamed from: b0 */
        private boolean m13223b0(int i) {
            int i2 = this.f9619j;
            int i3 = i2 + i;
            int i4 = this.f9617h;
            if (i3 > i4) {
                int i5 = this.f9603c;
                int i6 = this.f9621l;
                if (i > (i5 - i6) - i2 || i6 + i2 + i > this.f9622m) {
                    return false;
                }
                if (i2 > 0) {
                    if (i4 > i2) {
                        byte[] bArr = this.f9616g;
                        System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                    }
                    this.f9621l += i2;
                    this.f9617h -= i2;
                    this.f9619j = 0;
                }
                InputStream inputStream = this.f9615f;
                byte[] bArr2 = this.f9616g;
                int i7 = this.f9617h;
                int H = m13211H(inputStream, bArr2, i7, Math.min(bArr2.length - i7, (this.f9603c - this.f9621l) - i7));
                if (H == 0 || H < -1 || H > this.f9616g.length) {
                    throw new IllegalStateException(this.f9615f.getClass() + "#read(byte[]) returned invalid result: " + H + "\nThe InputStream implementation is buggy.");
                } else if (H <= 0) {
                    return false;
                } else {
                    this.f9617h += H;
                    m13216S();
                    if (this.f9617h >= i) {
                        return true;
                    }
                    return m13223b0(i);
                }
            } else {
                throw new IllegalStateException("refillBuffer() called when " + i + " bytes were already available in buffer");
            }
        }

        /* renamed from: A */
        public String mo40398A() {
            byte[] bArr;
            int P = mo40435P();
            int i = this.f9619j;
            int i2 = this.f9617h;
            if (P <= i2 - i && P > 0) {
                bArr = this.f9616g;
                this.f9619j = i + P;
            } else if (P == 0) {
                return "";
            } else {
                i = 0;
                if (P <= i2) {
                    m13217T(P);
                    bArr = this.f9616g;
                    this.f9619j = P + 0;
                } else {
                    bArr = m13213K(P, false);
                }
            }
            return C7151p1.m13624e(bArr, i, P);
        }

        /* renamed from: B */
        public int mo40399B() {
            if (mo40406e()) {
                this.f9620k = 0;
                return 0;
            }
            int P = mo40435P();
            this.f9620k = P;
            if (C7160q1.m13680a(P) != 0) {
                return this.f9620k;
            }
            throw InvalidProtocolBufferException.m12753c();
        }

        /* renamed from: C */
        public int mo40400C() {
            return mo40435P();
        }

        /* renamed from: D */
        public long mo40401D() {
            return mo40436Q();
        }

        /* renamed from: F */
        public boolean mo40403F(int i) {
            int b = C7160q1.m13681b(i);
            if (b == 0) {
                m13220Y();
                return true;
            } else if (b == 1) {
                mo40439W(8);
                return true;
            } else if (b == 2) {
                mo40439W(mo40435P());
                return true;
            } else if (b == 3) {
                mo40438V();
                mo40404a(C7160q1.m13682c(C7160q1.m13680a(i), 4));
                return true;
            } else if (b == 4) {
                return false;
            } else {
                if (b == 5) {
                    mo40439W(4);
                    return true;
                }
                throw InvalidProtocolBufferException.m12755e();
            }
        }

        /* renamed from: J */
        public byte mo40432J() {
            if (this.f9619j == this.f9617h) {
                m13217T(1);
            }
            byte[] bArr = this.f9616g;
            int i = this.f9619j;
            this.f9619j = i + 1;
            return bArr[i];
        }

        /* renamed from: N */
        public int mo40433N() {
            int i = this.f9619j;
            if (this.f9617h - i < 4) {
                m13217T(4);
                i = this.f9619j;
            }
            byte[] bArr = this.f9616g;
            this.f9619j = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        /* renamed from: O */
        public long mo40434O() {
            int i = this.f9619j;
            if (this.f9617h - i < 8) {
                m13217T(8);
                i = this.f9619j;
            }
            byte[] bArr = this.f9616g;
            this.f9619j = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
            if (r2[r3] < 0) goto L_0x006a;
         */
        /* renamed from: P */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo40435P() {
            /*
                r5 = this;
                int r0 = r5.f9619j
                int r1 = r5.f9617h
                if (r1 != r0) goto L_0x0007
                goto L_0x006a
            L_0x0007:
                byte[] r2 = r5.f9616g
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0012
                r5.f9619j = r3
                return r0
            L_0x0012:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L_0x0018
                goto L_0x006a
            L_0x0018:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0024
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
                goto L_0x0070
            L_0x0024:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x0031
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L_0x002f:
                r1 = r3
                goto L_0x0070
            L_0x0031:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x003f
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L_0x0070
            L_0x003f:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r4 = r1 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r3 = r2[r3]
                if (r3 >= 0) goto L_0x0070
                int r3 = r1 + 1
                byte r1 = r2[r1]
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r3 = r2[r3]
                if (r3 >= 0) goto L_0x0070
                int r3 = r1 + 1
                byte r1 = r2[r1]
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r2 = r2[r3]
                if (r2 >= 0) goto L_0x0070
            L_0x006a:
                long r0 = r5.mo40437R()
                int r0 = (int) r0
                return r0
            L_0x0070:
                r5.f9619j = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C7111i.C7114c.mo40435P():int");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b4, code lost:
            if (((long) r2[r0]) < 0) goto L_0x00b6;
         */
        /* renamed from: Q */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long mo40436Q() {
            /*
                r11 = this;
                int r0 = r11.f9619j
                int r1 = r11.f9617h
                if (r1 != r0) goto L_0x0008
                goto L_0x00b6
            L_0x0008:
                byte[] r2 = r11.f9616g
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0014
                r11.f9619j = r3
                long r0 = (long) r0
                return r0
            L_0x0014:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L_0x001b
                goto L_0x00b6
            L_0x001b:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0029
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            L_0x0026:
                long r2 = (long) r0
                goto L_0x00bd
            L_0x0029:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x003a
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
                long r0 = (long) r0
                r9 = r0
                r1 = r3
                r2 = r9
                goto L_0x00bd
            L_0x003a:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0048
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L_0x0026
            L_0x0048:
                long r3 = (long) r0
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r5 = (long) r1
                r1 = 28
                long r5 = r5 << r1
                long r3 = r3 ^ r5
                r5 = 0
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L_0x005f
                r1 = 266354560(0xfe03f80, double:1.315966377E-315)
            L_0x005b:
                long r2 = r3 ^ r1
                r1 = r0
                goto L_0x00bd
            L_0x005f:
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                r0 = 35
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x0074
                r5 = -34093383808(0xfffffff80fe03f80, double:NaN)
            L_0x0071:
                long r2 = r3 ^ r5
                goto L_0x00bd
            L_0x0074:
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r7 = (long) r1
                r1 = 42
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L_0x0087
                r1 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
                goto L_0x005b
            L_0x0087:
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                r0 = 49
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x009a
                r5 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
                goto L_0x0071
            L_0x009a:
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r7 = (long) r1
                r1 = 56
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                r7 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 >= 0) goto L_0x00bb
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x00bc
            L_0x00b6:
                long r0 = r11.mo40437R()
                return r0
            L_0x00bb:
                r1 = r0
            L_0x00bc:
                r2 = r3
            L_0x00bd:
                r11.f9619j = r1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C7111i.C7114c.mo40436Q():long");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: R */
        public long mo40437R() {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte J = mo40432J();
                j |= ((long) (J & Byte.MAX_VALUE)) << i;
                if ((J & 128) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.m12756f();
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* renamed from: V */
        public void mo40438V() {
            /*
                r1 = this;
            L_0x0000:
                int r0 = r1.mo40399B()
                if (r0 == 0) goto L_0x000c
                boolean r0 = r1.mo40403F(r0)
                if (r0 != 0) goto L_0x0000
            L_0x000c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C7111i.C7114c.mo40438V():void");
        }

        /* renamed from: W */
        public void mo40439W(int i) {
            int i2 = this.f9617h;
            int i3 = this.f9619j;
            if (i > i2 - i3 || i < 0) {
                m13219X(i);
            } else {
                this.f9619j = i3 + i;
            }
        }

        /* renamed from: a */
        public void mo40404a(int i) {
            if (this.f9620k != i) {
                throw InvalidProtocolBufferException.m12752b();
            }
        }

        /* renamed from: d */
        public int mo40405d() {
            return this.f9621l + this.f9619j;
        }

        /* renamed from: e */
        public boolean mo40406e() {
            if (this.f9619j != this.f9617h || m13223b0(1)) {
                return false;
            }
            return true;
        }

        /* renamed from: k */
        public void mo40407k(int i) {
            this.f9622m = i;
            m13216S();
        }

        /* renamed from: l */
        public int mo40408l(int i) {
            if (i >= 0) {
                int i2 = i + this.f9621l + this.f9619j;
                int i3 = this.f9622m;
                if (i2 <= i3) {
                    this.f9622m = i2;
                    m13216S();
                    return i3;
                }
                throw InvalidProtocolBufferException.m12761m();
            }
            throw InvalidProtocolBufferException.m12757g();
        }

        /* renamed from: m */
        public boolean mo40409m() {
            if (mo40436Q() != 0) {
                return true;
            }
            return false;
        }

        /* renamed from: n */
        public C7086h mo40410n() {
            int P = mo40435P();
            int i = this.f9617h;
            int i2 = this.f9619j;
            if (P <= i - i2 && P > 0) {
                C7086h r = C7086h.m13062r(this.f9616g, i2, P);
                this.f9619j += P;
                return r;
            } else if (P == 0) {
                return C7086h.f9565c;
            } else {
                return m13212I(P);
            }
        }

        /* renamed from: o */
        public double mo40411o() {
            return Double.longBitsToDouble(mo40434O());
        }

        /* renamed from: p */
        public int mo40412p() {
            return mo40435P();
        }

        /* renamed from: q */
        public int mo40413q() {
            return mo40433N();
        }

        /* renamed from: r */
        public long mo40414r() {
            return mo40434O();
        }

        /* renamed from: s */
        public float mo40415s() {
            return Float.intBitsToFloat(mo40433N());
        }

        /* renamed from: t */
        public int mo40416t() {
            return mo40435P();
        }

        /* renamed from: u */
        public long mo40417u() {
            return mo40436Q();
        }

        /* renamed from: v */
        public int mo40418v() {
            return mo40433N();
        }

        /* renamed from: w */
        public long mo40419w() {
            return mo40434O();
        }

        /* renamed from: x */
        public int mo40420x() {
            return C7111i.m13141b(mo40435P());
        }

        /* renamed from: y */
        public long mo40421y() {
            return C7111i.m13142c(mo40436Q());
        }

        /* renamed from: z */
        public String mo40422z() {
            int P = mo40435P();
            if (P > 0) {
                int i = this.f9617h;
                int i2 = this.f9619j;
                if (P <= i - i2) {
                    String str = new String(this.f9616g, i2, P, C7196z.f9860a);
                    this.f9619j += P;
                    return str;
                }
            }
            if (P == 0) {
                return "";
            }
            if (P > this.f9617h) {
                return new String(m13213K(P, false), C7196z.f9860a);
            }
            m13217T(P);
            String str2 = new String(this.f9616g, this.f9619j, P, C7196z.f9860a);
            this.f9619j += P;
            return str2;
        }

        private C7114c(InputStream inputStream, int i) {
            super();
            this.f9622m = Integer.MAX_VALUE;
            C7196z.m13945b(inputStream, "input");
            this.f9615f = inputStream;
            this.f9616g = new byte[i];
            this.f9617h = 0;
            this.f9619j = 0;
            this.f9621l = 0;
        }
    }

    /* renamed from: b */
    public static int m13141b(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* renamed from: c */
    public static long m13142c(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* renamed from: f */
    public static C7111i m13143f(InputStream inputStream) {
        return m13144g(inputStream, 4096);
    }

    /* renamed from: g */
    public static C7111i m13144g(InputStream inputStream, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("bufferSize must be > 0");
        } else if (inputStream == null) {
            return m13145h(C7196z.f9862c);
        } else {
            return new C7114c(inputStream, i);
        }
    }

    /* renamed from: h */
    public static C7111i m13145h(byte[] bArr) {
        return m13146i(bArr, 0, bArr.length);
    }

    /* renamed from: i */
    public static C7111i m13146i(byte[] bArr, int i, int i2) {
        return m13147j(bArr, i, i2, false);
    }

    /* renamed from: j */
    static C7111i m13147j(byte[] bArr, int i, int i2, boolean z) {
        C7113b bVar = new C7113b(bArr, i, i2, z);
        try {
            bVar.mo40408l(i2);
            return bVar;
        } catch (InvalidProtocolBufferException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: A */
    public abstract String mo40398A();

    /* renamed from: B */
    public abstract int mo40399B();

    /* renamed from: C */
    public abstract int mo40400C();

    /* renamed from: D */
    public abstract long mo40401D();

    /* renamed from: E */
    public final int mo40402E(int i) {
        if (i >= 0) {
            int i2 = this.f9603c;
            this.f9603c = i;
            return i2;
        }
        throw new IllegalArgumentException("Size limit cannot be negative: " + i);
    }

    /* renamed from: F */
    public abstract boolean mo40403F(int i);

    /* renamed from: a */
    public abstract void mo40404a(int i);

    /* renamed from: d */
    public abstract int mo40405d();

    /* renamed from: e */
    public abstract boolean mo40406e();

    /* renamed from: k */
    public abstract void mo40407k(int i);

    /* renamed from: l */
    public abstract int mo40408l(int i);

    /* renamed from: m */
    public abstract boolean mo40409m();

    /* renamed from: n */
    public abstract C7086h mo40410n();

    /* renamed from: o */
    public abstract double mo40411o();

    /* renamed from: p */
    public abstract int mo40412p();

    /* renamed from: q */
    public abstract int mo40413q();

    /* renamed from: r */
    public abstract long mo40414r();

    /* renamed from: s */
    public abstract float mo40415s();

    /* renamed from: t */
    public abstract int mo40416t();

    /* renamed from: u */
    public abstract long mo40417u();

    /* renamed from: v */
    public abstract int mo40418v();

    /* renamed from: w */
    public abstract long mo40419w();

    /* renamed from: x */
    public abstract int mo40420x();

    /* renamed from: y */
    public abstract long mo40421y();

    /* renamed from: z */
    public abstract String mo40422z();

    private C7111i() {
        this.f9602b = 100;
        this.f9603c = Integer.MAX_VALUE;
        this.f9605e = false;
    }
}
