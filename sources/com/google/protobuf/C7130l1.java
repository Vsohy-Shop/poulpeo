package com.google.protobuf;

import com.google.protobuf.C7170r1;
import java.util.Arrays;

/* renamed from: com.google.protobuf.l1 */
/* compiled from: UnknownFieldSetLite */
public final class C7130l1 {

    /* renamed from: f */
    private static final C7130l1 f9648f = new C7130l1(0, new int[0], new Object[0], false);

    /* renamed from: a */
    private int f9649a;

    /* renamed from: b */
    private int[] f9650b;

    /* renamed from: c */
    private Object[] f9651c;

    /* renamed from: d */
    private int f9652d;

    /* renamed from: e */
    private boolean f9653e;

    private C7130l1() {
        this(0, new int[8], new Object[8], true);
    }

    /* renamed from: b */
    private void m13431b() {
        int i;
        int i2 = this.f9649a;
        int[] iArr = this.f9650b;
        if (i2 == iArr.length) {
            if (i2 < 4) {
                i = 8;
            } else {
                i = i2 >> 1;
            }
            int i3 = i2 + i;
            this.f9650b = Arrays.copyOf(iArr, i3);
            this.f9651c = Arrays.copyOf(this.f9651c, i3);
        }
    }

    /* renamed from: c */
    public static C7130l1 m13432c() {
        return f9648f;
    }

    /* renamed from: f */
    private static int m13433f(int[] iArr, int i) {
        int i2 = 17;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + iArr[i3];
        }
        return i2;
    }

    /* renamed from: g */
    private static int m13434g(Object[] objArr, int i) {
        int i2 = 17;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + objArr[i3].hashCode();
        }
        return i2;
    }

    /* renamed from: i */
    static C7130l1 m13435i(C7130l1 l1Var, C7130l1 l1Var2) {
        int i = l1Var.f9649a + l1Var2.f9649a;
        int[] copyOf = Arrays.copyOf(l1Var.f9650b, i);
        System.arraycopy(l1Var2.f9650b, 0, copyOf, l1Var.f9649a, l1Var2.f9649a);
        Object[] copyOf2 = Arrays.copyOf(l1Var.f9651c, i);
        System.arraycopy(l1Var2.f9651c, 0, copyOf2, l1Var.f9649a, l1Var2.f9649a);
        return new C7130l1(i, copyOf, copyOf2, true);
    }

    /* renamed from: j */
    static C7130l1 m13436j() {
        return new C7130l1();
    }

    /* renamed from: k */
    private static boolean m13437k(Object[] objArr, Object[] objArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (!objArr[i2].equals(objArr2[i2])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: n */
    private static boolean m13438n(int[] iArr, int[] iArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (iArr[i2] != iArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: p */
    private static void m13439p(int i, Object obj, C7170r1 r1Var) {
        int a = C7160q1.m13680a(i);
        int b = C7160q1.m13681b(i);
        if (b == 0) {
            r1Var.mo40489q(a, ((Long) obj).longValue());
        } else if (b == 1) {
            r1Var.mo40483k(a, ((Long) obj).longValue());
        } else if (b == 2) {
            r1Var.mo40494v(a, (C7086h) obj);
        } else if (b != 3) {
            if (b == 5) {
                r1Var.mo40478f(a, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(InvalidProtocolBufferException.m12755e());
        } else if (r1Var.mo40484l() == C7170r1.C7171a.ASCENDING) {
            r1Var.mo40493u(a);
            ((C7130l1) obj).mo40552q(r1Var);
            r1Var.mo40465H(a);
        } else {
            r1Var.mo40465H(a);
            ((C7130l1) obj).mo40552q(r1Var);
            r1Var.mo40493u(a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo40543a() {
        if (!this.f9653e) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: d */
    public int mo40544d() {
        int i;
        int i2 = this.f9652d;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f9649a; i4++) {
            int i5 = this.f9650b[i4];
            int a = C7160q1.m13680a(i5);
            int b = C7160q1.m13681b(i5);
            if (b == 0) {
                i = CodedOutputStream.m12607Y(a, ((Long) this.f9651c[i4]).longValue());
            } else if (b == 1) {
                i = CodedOutputStream.m12626o(a, ((Long) this.f9651c[i4]).longValue());
            } else if (b == 2) {
                i = CodedOutputStream.m12616g(a, (C7086h) this.f9651c[i4]);
            } else if (b == 3) {
                i = (CodedOutputStream.m12604V(a) * 2) + ((C7130l1) this.f9651c[i4]).mo40544d();
            } else if (b == 5) {
                i = CodedOutputStream.m12624m(a, ((Integer) this.f9651c[i4]).intValue());
            } else {
                throw new IllegalStateException(InvalidProtocolBufferException.m12755e());
            }
            i3 += i;
        }
        this.f9652d = i3;
        return i3;
    }

    /* renamed from: e */
    public int mo40545e() {
        int i = this.f9652d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f9649a; i3++) {
            i2 += CodedOutputStream.m12592J(C7160q1.m13680a(this.f9650b[i3]), (C7086h) this.f9651c[i3]);
        }
        this.f9652d = i2;
        return i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C7130l1)) {
            return false;
        }
        C7130l1 l1Var = (C7130l1) obj;
        int i = this.f9649a;
        if (i != l1Var.f9649a || !m13438n(this.f9650b, l1Var.f9650b, i) || !m13437k(this.f9651c, l1Var.f9651c, this.f9649a)) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public void mo40547h() {
        this.f9653e = false;
    }

    public int hashCode() {
        int i = this.f9649a;
        return ((((527 + i) * 31) + m13433f(this.f9650b, i)) * 31) + m13434g(this.f9651c, this.f9649a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final void mo40549l(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f9649a; i2++) {
            C7169r0.m13690c(sb, i, String.valueOf(C7160q1.m13680a(this.f9650b[i2])), this.f9651c[i2]);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo40550m(int i, Object obj) {
        mo40543a();
        m13431b();
        int[] iArr = this.f9650b;
        int i2 = this.f9649a;
        iArr[i2] = i;
        this.f9651c[i2] = obj;
        this.f9649a = i2 + 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo40551o(C7170r1 r1Var) {
        if (r1Var.mo40484l() == C7170r1.C7171a.DESCENDING) {
            for (int i = this.f9649a - 1; i >= 0; i--) {
                r1Var.mo40477e(C7160q1.m13680a(this.f9650b[i]), this.f9651c[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.f9649a; i2++) {
            r1Var.mo40477e(C7160q1.m13680a(this.f9650b[i2]), this.f9651c[i2]);
        }
    }

    /* renamed from: q */
    public void mo40552q(C7170r1 r1Var) {
        if (this.f9649a != 0) {
            if (r1Var.mo40484l() == C7170r1.C7171a.ASCENDING) {
                for (int i = 0; i < this.f9649a; i++) {
                    m13439p(this.f9650b[i], this.f9651c[i], r1Var);
                }
                return;
            }
            for (int i2 = this.f9649a - 1; i2 >= 0; i2--) {
                m13439p(this.f9650b[i2], this.f9651c[i2], r1Var);
            }
        }
    }

    private C7130l1(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f9652d = -1;
        this.f9649a = i;
        this.f9650b = iArr;
        this.f9651c = objArr;
        this.f9653e = z;
    }
}
