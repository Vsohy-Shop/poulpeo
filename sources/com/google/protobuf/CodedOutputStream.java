package com.google.protobuf;

import com.google.protobuf.C7151p1;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class CodedOutputStream extends C7083g {

    /* renamed from: c */
    private static final Logger f9488c = Logger.getLogger(CodedOutputStream.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final boolean f9489d = C7142o1.m13510E();

    /* renamed from: a */
    C7124k f9490a;

    /* renamed from: b */
    private boolean f9491b;

    public static class OutOfSpaceException extends IOException {
        private static final long serialVersionUID = -6947486886997889499L;

        OutOfSpaceException() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        OutOfSpaceException(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        OutOfSpaceException(String str, Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th);
        }
    }

    /* renamed from: com.google.protobuf.CodedOutputStream$b */
    private static abstract class C7053b extends CodedOutputStream {

        /* renamed from: e */
        final byte[] f9492e;

        /* renamed from: f */
        final int f9493f;

        /* renamed from: g */
        int f9494g;

        /* renamed from: h */
        int f9495h;

        C7053b(int i) {
            super();
            if (i >= 0) {
                byte[] bArr = new byte[Math.max(i, 20)];
                this.f9492e = bArr;
                this.f9493f = bArr.length;
                return;
            }
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b1 */
        public final void mo40133b1(byte b) {
            byte[] bArr = this.f9492e;
            int i = this.f9494g;
            this.f9494g = i + 1;
            bArr[i] = b;
            this.f9495h++;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c1 */
        public final void mo40134c1(int i) {
            byte[] bArr = this.f9492e;
            int i2 = this.f9494g;
            int i3 = i2 + 1;
            bArr[i2] = (byte) (i & 255);
            int i4 = i3 + 1;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i4 + 1;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.f9494g = i5 + 1;
            bArr[i5] = (byte) ((i >> 24) & 255);
            this.f9495h += 4;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d1 */
        public final void mo40135d1(long j) {
            byte[] bArr = this.f9492e;
            int i = this.f9494g;
            int i2 = i + 1;
            bArr[i] = (byte) ((int) (j & 255));
            int i3 = i2 + 1;
            bArr[i2] = (byte) ((int) ((j >> 8) & 255));
            int i4 = i3 + 1;
            bArr[i3] = (byte) ((int) ((j >> 16) & 255));
            int i5 = i4 + 1;
            bArr[i4] = (byte) ((int) (255 & (j >> 24)));
            int i6 = i5 + 1;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i6 + 1;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i7 + 1;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.f9494g = i8 + 1;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
            this.f9495h += 8;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e1 */
        public final void mo40136e1(int i) {
            if (i >= 0) {
                mo40138g1(i);
            } else {
                mo40139h1((long) i);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f1 */
        public final void mo40137f1(int i, int i2) {
            mo40138g1(C7160q1.m13682c(i, i2));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g1 */
        public final void mo40138g1(int i) {
            if (CodedOutputStream.f9489d) {
                long j = (long) this.f9494g;
                while ((i & -128) != 0) {
                    byte[] bArr = this.f9492e;
                    int i2 = this.f9494g;
                    this.f9494g = i2 + 1;
                    C7142o1.m13516K(bArr, (long) i2, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
                byte[] bArr2 = this.f9492e;
                int i3 = this.f9494g;
                this.f9494g = i3 + 1;
                C7142o1.m13516K(bArr2, (long) i3, (byte) i);
                this.f9495h += (int) (((long) this.f9494g) - j);
                return;
            }
            while ((i & -128) != 0) {
                byte[] bArr3 = this.f9492e;
                int i4 = this.f9494g;
                this.f9494g = i4 + 1;
                bArr3[i4] = (byte) ((i & 127) | 128);
                this.f9495h++;
                i >>>= 7;
            }
            byte[] bArr4 = this.f9492e;
            int i5 = this.f9494g;
            this.f9494g = i5 + 1;
            bArr4[i5] = (byte) i;
            this.f9495h++;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h1 */
        public final void mo40139h1(long j) {
            if (CodedOutputStream.f9489d) {
                long j2 = (long) this.f9494g;
                while ((j & -128) != 0) {
                    byte[] bArr = this.f9492e;
                    int i = this.f9494g;
                    this.f9494g = i + 1;
                    C7142o1.m13516K(bArr, (long) i, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr2 = this.f9492e;
                int i2 = this.f9494g;
                this.f9494g = i2 + 1;
                C7142o1.m13516K(bArr2, (long) i2, (byte) ((int) j));
                this.f9495h += (int) (((long) this.f9494g) - j2);
                return;
            }
            while ((j & -128) != 0) {
                byte[] bArr3 = this.f9492e;
                int i3 = this.f9494g;
                this.f9494g = i3 + 1;
                bArr3[i3] = (byte) ((((int) j) & 127) | 128);
                this.f9495h++;
                j >>>= 7;
            }
            byte[] bArr4 = this.f9492e;
            int i4 = this.f9494g;
            this.f9494g = i4 + 1;
            bArr4[i4] = (byte) ((int) j);
            this.f9495h++;
        }

        /* renamed from: i0 */
        public final int mo40115i0() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }
    }

    /* renamed from: com.google.protobuf.CodedOutputStream$d */
    private static final class C7055d extends C7053b {

        /* renamed from: i */
        private final OutputStream f9500i;

        C7055d(OutputStream outputStream, int i) {
            super(i);
            if (outputStream != null) {
                this.f9500i = outputStream;
                return;
            }
            throw new NullPointerException("out");
        }

        /* renamed from: i1 */
        private void m12723i1() {
            this.f9500i.write(this.f9492e, 0, this.f9494g);
            this.f9494g = 0;
        }

        /* renamed from: j1 */
        private void m12724j1(int i) {
            if (this.f9493f - this.f9494g < i) {
                m12723i1();
            }
        }

        /* renamed from: E0 */
        public void mo40087E0(int i, int i2) {
            m12724j1(20);
            mo40137f1(i, 0);
            mo40136e1(i2);
        }

        /* renamed from: F0 */
        public void mo40088F0(int i) {
            if (i >= 0) {
                mo40107Y0(i);
            } else {
                mo40110a1((long) i);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: I0 */
        public void mo40091I0(int i, C7149p0 p0Var, C7076e1 e1Var) {
            mo40105W0(i, 2);
            mo40144m1(p0Var, e1Var);
        }

        /* renamed from: J0 */
        public void mo40092J0(C7149p0 p0Var) {
            mo40107Y0(p0Var.mo40627f());
            p0Var.mo40626d(this);
        }

        /* renamed from: K0 */
        public void mo40093K0(int i, C7149p0 p0Var) {
            mo40105W0(1, 3);
            mo40106X0(2, i);
            mo40143l1(3, p0Var);
            mo40105W0(1, 4);
        }

        /* renamed from: L0 */
        public void mo40094L0(int i, C7086h hVar) {
            mo40105W0(1, 3);
            mo40106X0(2, i);
            mo40121o0(3, hVar);
            mo40105W0(1, 4);
        }

        /* renamed from: U0 */
        public void mo40103U0(int i, String str) {
            mo40105W0(i, 2);
            mo40104V0(str);
        }

        /* renamed from: V0 */
        public void mo40104V0(String str) {
            int i;
            int i2;
            try {
                int length = str.length() * 3;
                int X = CodedOutputStream.m12606X(length);
                int i3 = X + length;
                int i4 = this.f9493f;
                if (i3 > i4) {
                    byte[] bArr = new byte[length];
                    int f = C7151p1.m13625f(str, bArr, 0, length);
                    mo40107Y0(f);
                    mo40109a(bArr, 0, f);
                    return;
                }
                if (i3 > i4 - this.f9494g) {
                    m12723i1();
                }
                int X2 = CodedOutputStream.m12606X(str.length());
                i = this.f9494g;
                if (X2 == X) {
                    int i5 = i + X2;
                    this.f9494g = i5;
                    int f2 = C7151p1.m13625f(str, this.f9492e, i5, this.f9493f - i5);
                    this.f9494g = i;
                    i2 = (f2 - i) - X2;
                    mo40138g1(i2);
                    this.f9494g = f2;
                } else {
                    i2 = C7151p1.m13626g(str);
                    mo40138g1(i2);
                    this.f9494g = C7151p1.m13625f(str, this.f9492e, this.f9494g, i2);
                }
                this.f9495h += i2;
            } catch (C7151p1.C7155d e) {
                this.f9495h -= this.f9494g - i;
                this.f9494g = i;
                throw e;
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(e2);
            } catch (C7151p1.C7155d e3) {
                mo40113d0(str, e3);
            }
        }

        /* renamed from: W0 */
        public void mo40105W0(int i, int i2) {
            mo40107Y0(C7160q1.m13682c(i, i2));
        }

        /* renamed from: X0 */
        public void mo40106X0(int i, int i2) {
            m12724j1(20);
            mo40137f1(i, 0);
            mo40138g1(i2);
        }

        /* renamed from: Y0 */
        public void mo40107Y0(int i) {
            m12724j1(5);
            mo40138g1(i);
        }

        /* renamed from: Z0 */
        public void mo40108Z0(int i, long j) {
            m12724j1(20);
            mo40137f1(i, 0);
            mo40139h1(j);
        }

        /* renamed from: a */
        public void mo40109a(byte[] bArr, int i, int i2) {
            mo40142k1(bArr, i, i2);
        }

        /* renamed from: a1 */
        public void mo40110a1(long j) {
            m12724j1(10);
            mo40139h1(j);
        }

        /* renamed from: c0 */
        public void mo40112c0() {
            if (this.f9494g > 0) {
                m12723i1();
            }
        }

        /* renamed from: j0 */
        public void mo40116j0(byte b) {
            if (this.f9494g == this.f9493f) {
                m12723i1();
            }
            mo40133b1(b);
        }

        /* renamed from: k0 */
        public void mo40117k0(int i, boolean z) {
            m12724j1(11);
            mo40137f1(i, 0);
            mo40133b1(z ? (byte) 1 : 0);
        }

        /* renamed from: k1 */
        public void mo40142k1(byte[] bArr, int i, int i2) {
            int i3 = this.f9493f;
            int i4 = this.f9494g;
            if (i3 - i4 >= i2) {
                System.arraycopy(bArr, i, this.f9492e, i4, i2);
                this.f9494g += i2;
                this.f9495h += i2;
                return;
            }
            int i5 = i3 - i4;
            System.arraycopy(bArr, i, this.f9492e, i4, i5);
            int i6 = i + i5;
            int i7 = i2 - i5;
            this.f9494g = this.f9493f;
            this.f9495h += i5;
            m12723i1();
            if (i7 <= this.f9493f) {
                System.arraycopy(bArr, i6, this.f9492e, 0, i7);
                this.f9494g = i7;
            } else {
                this.f9500i.write(bArr, i6, i7);
            }
            this.f9495h += i7;
        }

        /* renamed from: l1 */
        public void mo40143l1(int i, C7149p0 p0Var) {
            mo40105W0(i, 2);
            mo40092J0(p0Var);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m1 */
        public void mo40144m1(C7149p0 p0Var, C7076e1 e1Var) {
            mo40107Y0(((C7056a) p0Var).mo40153m(e1Var));
            e1Var.mo40275b(p0Var, this.f9490a);
        }

        /* renamed from: n0 */
        public void mo40120n0(byte[] bArr, int i, int i2) {
            mo40107Y0(i2);
            mo40142k1(bArr, i, i2);
        }

        /* renamed from: o0 */
        public void mo40121o0(int i, C7086h hVar) {
            mo40105W0(i, 2);
            mo40122p0(hVar);
        }

        /* renamed from: p0 */
        public void mo40122p0(C7086h hVar) {
            mo40107Y0(hVar.size());
            hVar.mo40327Q(this);
        }

        /* renamed from: u0 */
        public void mo40127u0(int i, int i2) {
            m12724j1(14);
            mo40137f1(i, 5);
            mo40134c1(i2);
        }

        /* renamed from: v0 */
        public void mo40128v0(int i) {
            m12724j1(4);
            mo40134c1(i);
        }

        /* renamed from: w0 */
        public void mo40129w0(int i, long j) {
            m12724j1(18);
            mo40137f1(i, 1);
            mo40135d1(j);
        }

        /* renamed from: x0 */
        public void mo40130x0(long j) {
            m12724j1(8);
            mo40135d1(j);
        }
    }

    /* renamed from: A */
    public static int m12583A(int i, C7067c0 c0Var) {
        return m12604V(i) + m12584B(c0Var);
    }

    /* renamed from: B */
    public static int m12584B(C7067c0 c0Var) {
        return m12585C(c0Var.mo40205b());
    }

    /* renamed from: C */
    static int m12585C(int i) {
        return m12606X(i) + i;
    }

    /* renamed from: D */
    public static int m12586D(int i, C7149p0 p0Var) {
        return (m12604V(1) * 2) + m12605W(2, i) + m12587E(3, p0Var);
    }

    /* renamed from: E */
    public static int m12587E(int i, C7149p0 p0Var) {
        return m12604V(i) + m12589G(p0Var);
    }

    /* renamed from: F */
    static int m12588F(int i, C7149p0 p0Var, C7076e1 e1Var) {
        return m12604V(i) + m12590H(p0Var, e1Var);
    }

    /* renamed from: G */
    public static int m12589G(C7149p0 p0Var) {
        return m12585C(p0Var.mo40627f());
    }

    /* renamed from: H */
    static int m12590H(C7149p0 p0Var, C7076e1 e1Var) {
        return m12585C(((C7056a) p0Var).mo40153m(e1Var));
    }

    /* renamed from: I */
    static int m12591I(int i) {
        if (i > 4096) {
            return 4096;
        }
        return i;
    }

    /* renamed from: J */
    public static int m12592J(int i, C7086h hVar) {
        return (m12604V(1) * 2) + m12605W(2, i) + m12616g(3, hVar);
    }

    @Deprecated
    /* renamed from: K */
    public static int m12593K(int i) {
        return m12606X(i);
    }

    /* renamed from: L */
    public static int m12594L(int i, int i2) {
        return m12604V(i) + m12595M(i2);
    }

    /* renamed from: M */
    public static int m12595M(int i) {
        return 4;
    }

    /* renamed from: N */
    public static int m12596N(int i, long j) {
        return m12604V(i) + m12597O(j);
    }

    /* renamed from: O */
    public static int m12597O(long j) {
        return 8;
    }

    /* renamed from: P */
    public static int m12598P(int i, int i2) {
        return m12604V(i) + m12599Q(i2);
    }

    /* renamed from: Q */
    public static int m12599Q(int i) {
        return m12606X(m12609a0(i));
    }

    /* renamed from: R */
    public static int m12600R(int i, long j) {
        return m12604V(i) + m12601S(j);
    }

    /* renamed from: S */
    public static int m12601S(long j) {
        return m12608Z(m12611b0(j));
    }

    /* renamed from: T */
    public static int m12602T(int i, String str) {
        return m12604V(i) + m12603U(str);
    }

    /* renamed from: U */
    public static int m12603U(String str) {
        int i;
        try {
            i = C7151p1.m13626g(str);
        } catch (C7151p1.C7155d unused) {
            i = str.getBytes(C7196z.f9860a).length;
        }
        return m12585C(i);
    }

    /* renamed from: V */
    public static int m12604V(int i) {
        return m12606X(C7160q1.m13682c(i, 0));
    }

    /* renamed from: W */
    public static int m12605W(int i, int i2) {
        return m12604V(i) + m12606X(i2);
    }

    /* renamed from: X */
    public static int m12606X(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        if ((i & -268435456) == 0) {
            return 4;
        }
        return 5;
    }

    /* renamed from: Y */
    public static int m12607Y(int i, long j) {
        return m12604V(i) + m12608Z(j);
    }

    /* renamed from: Z */
    public static int m12608Z(long j) {
        int i;
        if ((-128 & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if ((-34359738368L & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if ((-2097152 & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        if ((j & -16384) != 0) {
            return i + 1;
        }
        return i;
    }

    /* renamed from: a0 */
    public static int m12609a0(int i) {
        return (i >> 31) ^ (i << 1);
    }

    /* renamed from: b0 */
    public static long m12611b0(long j) {
        return (j >> 63) ^ (j << 1);
    }

    /* renamed from: d */
    public static int m12612d(int i, boolean z) {
        return m12604V(i) + m12613e(z);
    }

    /* renamed from: e */
    public static int m12613e(boolean z) {
        return 1;
    }

    /* renamed from: f */
    public static int m12614f(byte[] bArr) {
        return m12585C(bArr.length);
    }

    /* renamed from: f0 */
    public static CodedOutputStream m12615f0(OutputStream outputStream, int i) {
        return new C7055d(outputStream, i);
    }

    /* renamed from: g */
    public static int m12616g(int i, C7086h hVar) {
        return m12604V(i) + m12618h(hVar);
    }

    /* renamed from: g0 */
    public static CodedOutputStream m12617g0(byte[] bArr) {
        return m12619h0(bArr, 0, bArr.length);
    }

    /* renamed from: h */
    public static int m12618h(C7086h hVar) {
        return m12585C(hVar.size());
    }

    /* renamed from: h0 */
    public static CodedOutputStream m12619h0(byte[] bArr, int i, int i2) {
        return new C7054c(bArr, i, i2);
    }

    /* renamed from: i */
    public static int m12620i(int i, double d) {
        return m12604V(i) + m12621j(d);
    }

    /* renamed from: j */
    public static int m12621j(double d) {
        return 8;
    }

    /* renamed from: k */
    public static int m12622k(int i, int i2) {
        return m12604V(i) + m12623l(i2);
    }

    /* renamed from: l */
    public static int m12623l(int i) {
        return m12634w(i);
    }

    /* renamed from: m */
    public static int m12624m(int i, int i2) {
        return m12604V(i) + m12625n(i2);
    }

    /* renamed from: n */
    public static int m12625n(int i) {
        return 4;
    }

    /* renamed from: o */
    public static int m12626o(int i, long j) {
        return m12604V(i) + m12627p(j);
    }

    /* renamed from: p */
    public static int m12627p(long j) {
        return 8;
    }

    /* renamed from: q */
    public static int m12628q(int i, float f) {
        return m12604V(i) + m12629r(f);
    }

    /* renamed from: r */
    public static int m12629r(float f) {
        return 4;
    }

    @Deprecated
    /* renamed from: s */
    static int m12630s(int i, C7149p0 p0Var, C7076e1 e1Var) {
        return (m12604V(i) * 2) + m12632u(p0Var, e1Var);
    }

    @Deprecated
    /* renamed from: t */
    public static int m12631t(C7149p0 p0Var) {
        return p0Var.mo40627f();
    }

    @Deprecated
    /* renamed from: u */
    static int m12632u(C7149p0 p0Var, C7076e1 e1Var) {
        return ((C7056a) p0Var).mo40153m(e1Var);
    }

    /* renamed from: v */
    public static int m12633v(int i, int i2) {
        return m12604V(i) + m12634w(i2);
    }

    /* renamed from: w */
    public static int m12634w(int i) {
        if (i >= 0) {
            return m12606X(i);
        }
        return 10;
    }

    /* renamed from: x */
    public static int m12635x(int i, long j) {
        return m12604V(i) + m12636y(j);
    }

    /* renamed from: y */
    public static int m12636y(long j) {
        return m12608Z(j);
    }

    /* renamed from: z */
    public static int m12637z(int i, C7067c0 c0Var) {
        return (m12604V(1) * 2) + m12605W(2, i) + m12583A(3, c0Var);
    }

    @Deprecated
    /* renamed from: A0 */
    public final void mo40083A0(int i, C7149p0 p0Var) {
        mo40105W0(i, 3);
        mo40085C0(p0Var);
        mo40105W0(i, 4);
    }

    /* access modifiers changed from: package-private */
    @Deprecated
    /* renamed from: B0 */
    public final void mo40084B0(int i, C7149p0 p0Var, C7076e1 e1Var) {
        mo40105W0(i, 3);
        mo40086D0(p0Var, e1Var);
        mo40105W0(i, 4);
    }

    @Deprecated
    /* renamed from: C0 */
    public final void mo40085C0(C7149p0 p0Var) {
        p0Var.mo40626d(this);
    }

    /* access modifiers changed from: package-private */
    @Deprecated
    /* renamed from: D0 */
    public final void mo40086D0(C7149p0 p0Var, C7076e1 e1Var) {
        e1Var.mo40275b(p0Var, this.f9490a);
    }

    /* renamed from: E0 */
    public abstract void mo40087E0(int i, int i2);

    /* renamed from: F0 */
    public abstract void mo40088F0(int i);

    /* renamed from: G0 */
    public final void mo40089G0(int i, long j) {
        mo40108Z0(i, j);
    }

    /* renamed from: H0 */
    public final void mo40090H0(long j) {
        mo40110a1(j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I0 */
    public abstract void mo40091I0(int i, C7149p0 p0Var, C7076e1 e1Var);

    /* renamed from: J0 */
    public abstract void mo40092J0(C7149p0 p0Var);

    /* renamed from: K0 */
    public abstract void mo40093K0(int i, C7149p0 p0Var);

    /* renamed from: L0 */
    public abstract void mo40094L0(int i, C7086h hVar);

    /* renamed from: M0 */
    public final void mo40095M0(int i, int i2) {
        mo40127u0(i, i2);
    }

    /* renamed from: N0 */
    public final void mo40096N0(int i) {
        mo40128v0(i);
    }

    /* renamed from: O0 */
    public final void mo40097O0(int i, long j) {
        mo40129w0(i, j);
    }

    /* renamed from: P0 */
    public final void mo40098P0(long j) {
        mo40130x0(j);
    }

    /* renamed from: Q0 */
    public final void mo40099Q0(int i, int i2) {
        mo40106X0(i, m12609a0(i2));
    }

    /* renamed from: R0 */
    public final void mo40100R0(int i) {
        mo40107Y0(m12609a0(i));
    }

    /* renamed from: S0 */
    public final void mo40101S0(int i, long j) {
        mo40108Z0(i, m12611b0(j));
    }

    /* renamed from: T0 */
    public final void mo40102T0(long j) {
        mo40110a1(m12611b0(j));
    }

    /* renamed from: U0 */
    public abstract void mo40103U0(int i, String str);

    /* renamed from: V0 */
    public abstract void mo40104V0(String str);

    /* renamed from: W0 */
    public abstract void mo40105W0(int i, int i2);

    /* renamed from: X0 */
    public abstract void mo40106X0(int i, int i2);

    /* renamed from: Y0 */
    public abstract void mo40107Y0(int i);

    /* renamed from: Z0 */
    public abstract void mo40108Z0(int i, long j);

    /* renamed from: a */
    public abstract void mo40109a(byte[] bArr, int i, int i2);

    /* renamed from: a1 */
    public abstract void mo40110a1(long j);

    /* renamed from: c */
    public final void mo40111c() {
        if (mo40115i0() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* renamed from: c0 */
    public abstract void mo40112c0();

    /* access modifiers changed from: package-private */
    /* renamed from: d0 */
    public final void mo40113d0(String str, C7151p1.C7155d dVar) {
        f9488c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", dVar);
        byte[] bytes = str.getBytes(C7196z.f9860a);
        try {
            mo40107Y0(bytes.length);
            mo40109a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new OutOfSpaceException(e);
        } catch (OutOfSpaceException e2) {
            throw e2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e0 */
    public boolean mo40114e0() {
        return this.f9491b;
    }

    /* renamed from: i0 */
    public abstract int mo40115i0();

    /* renamed from: j0 */
    public abstract void mo40116j0(byte b);

    /* renamed from: k0 */
    public abstract void mo40117k0(int i, boolean z);

    /* renamed from: l0 */
    public final void mo40118l0(boolean z) {
        mo40116j0(z ? (byte) 1 : 0);
    }

    /* renamed from: m0 */
    public final void mo40119m0(byte[] bArr) {
        mo40120n0(bArr, 0, bArr.length);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n0 */
    public abstract void mo40120n0(byte[] bArr, int i, int i2);

    /* renamed from: o0 */
    public abstract void mo40121o0(int i, C7086h hVar);

    /* renamed from: p0 */
    public abstract void mo40122p0(C7086h hVar);

    /* renamed from: q0 */
    public final void mo40123q0(int i, double d) {
        mo40129w0(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: r0 */
    public final void mo40124r0(double d) {
        mo40130x0(Double.doubleToRawLongBits(d));
    }

    /* renamed from: s0 */
    public final void mo40125s0(int i, int i2) {
        mo40087E0(i, i2);
    }

    /* renamed from: t0 */
    public final void mo40126t0(int i) {
        mo40088F0(i);
    }

    /* renamed from: u0 */
    public abstract void mo40127u0(int i, int i2);

    /* renamed from: v0 */
    public abstract void mo40128v0(int i);

    /* renamed from: w0 */
    public abstract void mo40129w0(int i, long j);

    /* renamed from: x0 */
    public abstract void mo40130x0(long j);

    /* renamed from: y0 */
    public final void mo40131y0(int i, float f) {
        mo40127u0(i, Float.floatToRawIntBits(f));
    }

    /* renamed from: z0 */
    public final void mo40132z0(float f) {
        mo40128v0(Float.floatToRawIntBits(f));
    }

    private CodedOutputStream() {
    }

    /* renamed from: com.google.protobuf.CodedOutputStream$c */
    private static class C7054c extends CodedOutputStream {

        /* renamed from: e */
        private final byte[] f9496e;

        /* renamed from: f */
        private final int f9497f;

        /* renamed from: g */
        private final int f9498g;

        /* renamed from: h */
        private int f9499h;

        C7054c(byte[] bArr, int i, int i2) {
            super();
            if (bArr != null) {
                int i3 = i + i2;
                if ((i | i2 | (bArr.length - i3)) >= 0) {
                    this.f9496e = bArr;
                    this.f9497f = i;
                    this.f9499h = i;
                    this.f9498g = i3;
                    return;
                }
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)}));
            }
            throw new NullPointerException("buffer");
        }

        /* renamed from: E0 */
        public final void mo40087E0(int i, int i2) {
            mo40105W0(i, 0);
            mo40088F0(i2);
        }

        /* renamed from: F0 */
        public final void mo40088F0(int i) {
            if (i >= 0) {
                mo40107Y0(i);
            } else {
                mo40110a1((long) i);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: I0 */
        public final void mo40091I0(int i, C7149p0 p0Var, C7076e1 e1Var) {
            mo40105W0(i, 2);
            mo40107Y0(((C7056a) p0Var).mo40153m(e1Var));
            e1Var.mo40275b(p0Var, this.f9490a);
        }

        /* renamed from: J0 */
        public final void mo40092J0(C7149p0 p0Var) {
            mo40107Y0(p0Var.mo40627f());
            p0Var.mo40626d(this);
        }

        /* renamed from: K0 */
        public final void mo40093K0(int i, C7149p0 p0Var) {
            mo40105W0(1, 3);
            mo40106X0(2, i);
            mo40141c1(3, p0Var);
            mo40105W0(1, 4);
        }

        /* renamed from: L0 */
        public final void mo40094L0(int i, C7086h hVar) {
            mo40105W0(1, 3);
            mo40106X0(2, i);
            mo40121o0(3, hVar);
            mo40105W0(1, 4);
        }

        /* renamed from: U0 */
        public final void mo40103U0(int i, String str) {
            mo40105W0(i, 2);
            mo40104V0(str);
        }

        /* renamed from: V0 */
        public final void mo40104V0(String str) {
            int i = this.f9499h;
            try {
                int X = CodedOutputStream.m12606X(str.length() * 3);
                int X2 = CodedOutputStream.m12606X(str.length());
                if (X2 == X) {
                    int i2 = i + X2;
                    this.f9499h = i2;
                    int f = C7151p1.m13625f(str, this.f9496e, i2, mo40115i0());
                    this.f9499h = i;
                    mo40107Y0((f - i) - X2);
                    this.f9499h = f;
                    return;
                }
                mo40107Y0(C7151p1.m13626g(str));
                this.f9499h = C7151p1.m13625f(str, this.f9496e, this.f9499h, mo40115i0());
            } catch (C7151p1.C7155d e) {
                this.f9499h = i;
                mo40113d0(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(e2);
            }
        }

        /* renamed from: W0 */
        public final void mo40105W0(int i, int i2) {
            mo40107Y0(C7160q1.m13682c(i, i2));
        }

        /* renamed from: X0 */
        public final void mo40106X0(int i, int i2) {
            mo40105W0(i, 0);
            mo40107Y0(i2);
        }

        /* renamed from: Y0 */
        public final void mo40107Y0(int i) {
            if (!CodedOutputStream.f9489d || C7069d.m12822c() || mo40115i0() < 5) {
                while ((i & -128) != 0) {
                    byte[] bArr = this.f9496e;
                    int i2 = this.f9499h;
                    this.f9499h = i2 + 1;
                    bArr[i2] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f9496e;
                    int i3 = this.f9499h;
                    this.f9499h = i3 + 1;
                    bArr2[i3] = (byte) i;
                } catch (IndexOutOfBoundsException e) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f9499h), Integer.valueOf(this.f9498g), 1}), e);
                }
            } else if ((i & -128) == 0) {
                byte[] bArr3 = this.f9496e;
                int i4 = this.f9499h;
                this.f9499h = i4 + 1;
                C7142o1.m13516K(bArr3, (long) i4, (byte) i);
            } else {
                byte[] bArr4 = this.f9496e;
                int i5 = this.f9499h;
                this.f9499h = i5 + 1;
                C7142o1.m13516K(bArr4, (long) i5, (byte) (i | 128));
                int i6 = i >>> 7;
                if ((i6 & -128) == 0) {
                    byte[] bArr5 = this.f9496e;
                    int i7 = this.f9499h;
                    this.f9499h = i7 + 1;
                    C7142o1.m13516K(bArr5, (long) i7, (byte) i6);
                    return;
                }
                byte[] bArr6 = this.f9496e;
                int i8 = this.f9499h;
                this.f9499h = i8 + 1;
                C7142o1.m13516K(bArr6, (long) i8, (byte) (i6 | 128));
                int i9 = i6 >>> 7;
                if ((i9 & -128) == 0) {
                    byte[] bArr7 = this.f9496e;
                    int i10 = this.f9499h;
                    this.f9499h = i10 + 1;
                    C7142o1.m13516K(bArr7, (long) i10, (byte) i9);
                    return;
                }
                byte[] bArr8 = this.f9496e;
                int i11 = this.f9499h;
                this.f9499h = i11 + 1;
                C7142o1.m13516K(bArr8, (long) i11, (byte) (i9 | 128));
                int i12 = i9 >>> 7;
                if ((i12 & -128) == 0) {
                    byte[] bArr9 = this.f9496e;
                    int i13 = this.f9499h;
                    this.f9499h = i13 + 1;
                    C7142o1.m13516K(bArr9, (long) i13, (byte) i12);
                    return;
                }
                byte[] bArr10 = this.f9496e;
                int i14 = this.f9499h;
                this.f9499h = i14 + 1;
                C7142o1.m13516K(bArr10, (long) i14, (byte) (i12 | 128));
                byte[] bArr11 = this.f9496e;
                int i15 = this.f9499h;
                this.f9499h = i15 + 1;
                C7142o1.m13516K(bArr11, (long) i15, (byte) (i12 >>> 7));
            }
        }

        /* renamed from: Z0 */
        public final void mo40108Z0(int i, long j) {
            mo40105W0(i, 0);
            mo40110a1(j);
        }

        /* renamed from: a */
        public final void mo40109a(byte[] bArr, int i, int i2) {
            mo40140b1(bArr, i, i2);
        }

        /* renamed from: a1 */
        public final void mo40110a1(long j) {
            if (!CodedOutputStream.f9489d || mo40115i0() < 10) {
                while ((j & -128) != 0) {
                    byte[] bArr = this.f9496e;
                    int i = this.f9499h;
                    this.f9499h = i + 1;
                    bArr[i] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f9496e;
                    int i2 = this.f9499h;
                    this.f9499h = i2 + 1;
                    bArr2[i2] = (byte) ((int) j);
                } catch (IndexOutOfBoundsException e) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f9499h), Integer.valueOf(this.f9498g), 1}), e);
                }
            } else {
                while ((j & -128) != 0) {
                    byte[] bArr3 = this.f9496e;
                    int i3 = this.f9499h;
                    this.f9499h = i3 + 1;
                    C7142o1.m13516K(bArr3, (long) i3, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr4 = this.f9496e;
                int i4 = this.f9499h;
                this.f9499h = i4 + 1;
                C7142o1.m13516K(bArr4, (long) i4, (byte) ((int) j));
            }
        }

        /* renamed from: b1 */
        public final void mo40140b1(byte[] bArr, int i, int i2) {
            try {
                System.arraycopy(bArr, i, this.f9496e, this.f9499h, i2);
                this.f9499h += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f9499h), Integer.valueOf(this.f9498g), Integer.valueOf(i2)}), e);
            }
        }

        /* renamed from: c1 */
        public final void mo40141c1(int i, C7149p0 p0Var) {
            mo40105W0(i, 2);
            mo40092J0(p0Var);
        }

        /* renamed from: i0 */
        public final int mo40115i0() {
            return this.f9498g - this.f9499h;
        }

        /* renamed from: j0 */
        public final void mo40116j0(byte b) {
            try {
                byte[] bArr = this.f9496e;
                int i = this.f9499h;
                this.f9499h = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f9499h), Integer.valueOf(this.f9498g), 1}), e);
            }
        }

        /* renamed from: k0 */
        public final void mo40117k0(int i, boolean z) {
            mo40105W0(i, 0);
            mo40116j0(z ? (byte) 1 : 0);
        }

        /* renamed from: n0 */
        public final void mo40120n0(byte[] bArr, int i, int i2) {
            mo40107Y0(i2);
            mo40140b1(bArr, i, i2);
        }

        /* renamed from: o0 */
        public final void mo40121o0(int i, C7086h hVar) {
            mo40105W0(i, 2);
            mo40122p0(hVar);
        }

        /* renamed from: p0 */
        public final void mo40122p0(C7086h hVar) {
            mo40107Y0(hVar.size());
            hVar.mo40327Q(this);
        }

        /* renamed from: u0 */
        public final void mo40127u0(int i, int i2) {
            mo40105W0(i, 5);
            mo40128v0(i2);
        }

        /* renamed from: v0 */
        public final void mo40128v0(int i) {
            try {
                byte[] bArr = this.f9496e;
                int i2 = this.f9499h;
                int i3 = i2 + 1;
                bArr[i2] = (byte) (i & 255);
                int i4 = i3 + 1;
                bArr[i3] = (byte) ((i >> 8) & 255);
                int i5 = i4 + 1;
                bArr[i4] = (byte) ((i >> 16) & 255);
                this.f9499h = i5 + 1;
                bArr[i5] = (byte) ((i >> 24) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f9499h), Integer.valueOf(this.f9498g), 1}), e);
            }
        }

        /* renamed from: w0 */
        public final void mo40129w0(int i, long j) {
            mo40105W0(i, 1);
            mo40130x0(j);
        }

        /* renamed from: x0 */
        public final void mo40130x0(long j) {
            try {
                byte[] bArr = this.f9496e;
                int i = this.f9499h;
                int i2 = i + 1;
                bArr[i] = (byte) (((int) j) & 255);
                int i3 = i2 + 1;
                bArr[i2] = (byte) (((int) (j >> 8)) & 255);
                int i4 = i3 + 1;
                bArr[i3] = (byte) (((int) (j >> 16)) & 255);
                int i5 = i4 + 1;
                bArr[i4] = (byte) (((int) (j >> 24)) & 255);
                int i6 = i5 + 1;
                bArr[i5] = (byte) (((int) (j >> 32)) & 255);
                int i7 = i6 + 1;
                bArr[i6] = (byte) (((int) (j >> 40)) & 255);
                int i8 = i7 + 1;
                bArr[i7] = (byte) (((int) (j >> 48)) & 255);
                this.f9499h = i8 + 1;
                bArr[i8] = (byte) (((int) (j >> 56)) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f9499h), Integer.valueOf(this.f9498g), 1}), e);
            }
        }

        /* renamed from: c0 */
        public void mo40112c0() {
        }
    }
}
