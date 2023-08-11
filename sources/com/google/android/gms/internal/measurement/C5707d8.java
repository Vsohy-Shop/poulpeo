package com.google.android.gms.internal.measurement;

import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.measurement.d8 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
public abstract class C5707d8 extends C5858m7 {

    /* renamed from: b */
    private static final Logger f6848b = Logger.getLogger(C5707d8.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final boolean f6849c = C5778hb.m9348C();

    /* renamed from: a */
    C5724e8 f6850a;

    private C5707d8() {
    }

    /* synthetic */ C5707d8(C5673b8 b8Var) {
    }

    /* renamed from: A */
    public static int m8984A(C5742f9 f9Var) {
        int a = f9Var.mo34014a();
        return m8988a(a) + a;
    }

    /* renamed from: B */
    static int m8985B(C6052y9 y9Var, C5811ja jaVar) {
        C5757g7 g7Var = (C5757g7) y9Var;
        int g = g7Var.mo34042g();
        if (g == -1) {
            g = jaVar.mo33706b(g7Var);
            g7Var.mo34043i(g);
        }
        return m8988a(g) + g;
    }

    /* renamed from: C */
    public static int m8986C(String str) {
        int i;
        try {
            i = C5862mb.m9642c(str);
        } catch (C5846lb unused) {
            i = str.getBytes(C5708d9.f6852b).length;
        }
        return m8988a(i) + i;
    }

    /* renamed from: D */
    public static int m8987D(int i) {
        return m8988a(i << 3);
    }

    /* renamed from: a */
    public static int m8988a(int i) {
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

    /* renamed from: b */
    public static int m8989b(long j) {
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

    /* renamed from: c */
    public static C5707d8 m8990c(byte[] bArr) {
        return new C5690c8(bArr, 0, bArr.length);
    }

    /* renamed from: x */
    public static int m8992x(C6018w7 w7Var) {
        int j = w7Var.mo34319j();
        return m8988a(j) + j;
    }

    @Deprecated
    /* renamed from: y */
    static int m8993y(int i, C6052y9 y9Var, C5811ja jaVar) {
        int a = m8988a(i << 3);
        int i2 = a + a;
        C5757g7 g7Var = (C5757g7) y9Var;
        int g = g7Var.mo34042g();
        if (g == -1) {
            g = jaVar.mo33706b(g7Var);
            g7Var.mo34043i(g);
        }
        return i2 + g;
    }

    /* renamed from: z */
    public static int m8994z(int i) {
        if (i >= 0) {
            return m8988a(i);
        }
        return 10;
    }

    /* renamed from: d */
    public final void mo33836d() {
        if (mo33756g() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo33837e(String str, C5846lb lbVar) {
        f6848b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", lbVar);
        byte[] bytes = str.getBytes(C5708d9.f6852b);
        try {
            int length = bytes.length;
            mo33770u(length);
            mo33766q(bytes, 0, length);
        } catch (IndexOutOfBoundsException e) {
            throw new zzjd(e);
        } catch (zzjd e2) {
            throw e2;
        }
    }

    /* renamed from: g */
    public abstract int mo33756g();

    /* renamed from: h */
    public abstract void mo33757h(byte b);

    /* renamed from: i */
    public abstract void mo33758i(int i, boolean z);

    /* renamed from: j */
    public abstract void mo33759j(int i, C6018w7 w7Var);

    /* renamed from: k */
    public abstract void mo33760k(int i, int i2);

    /* renamed from: l */
    public abstract void mo33761l(int i);

    /* renamed from: m */
    public abstract void mo33762m(int i, long j);

    /* renamed from: n */
    public abstract void mo33763n(long j);

    /* renamed from: o */
    public abstract void mo33764o(int i, int i2);

    /* renamed from: p */
    public abstract void mo33765p(int i);

    /* renamed from: q */
    public abstract void mo33766q(byte[] bArr, int i, int i2);

    /* renamed from: r */
    public abstract void mo33767r(int i, String str);

    /* renamed from: s */
    public abstract void mo33768s(int i, int i2);

    /* renamed from: t */
    public abstract void mo33769t(int i, int i2);

    /* renamed from: u */
    public abstract void mo33770u(int i);

    /* renamed from: v */
    public abstract void mo33771v(int i, long j);

    /* renamed from: w */
    public abstract void mo33772w(long j);
}
