package com.google.android.gms.internal.cast;

import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.cast.qc */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public abstract class C5099qc extends C5251zb {

    /* renamed from: b */
    private static final Logger f5486b = Logger.getLogger(C5099qc.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final boolean f5487c = C5187vf.m7572C();

    /* renamed from: a */
    C5133sc f5488a;

    private C5099qc() {
    }

    /* synthetic */ C5099qc(C5082pc pcVar) {
    }

    /* renamed from: A */
    public static int m7389A(C5083pd pdVar) {
        int a = pdVar.mo32956a();
        return m7393a(a) + a;
    }

    /* renamed from: B */
    static int m7390B(C4982je jeVar, C5169ue ueVar) {
        int b = ((C5200wb) jeVar).mo32732b(ueVar);
        return m7393a(b) + b;
    }

    /* renamed from: C */
    public static int m7391C(String str) {
        int i;
        try {
            i = C5255zf.m7730c(str);
        } catch (C5238yf unused) {
            i = str.getBytes(C5032md.f5364b).length;
        }
        return m7393a(i) + i;
    }

    /* renamed from: D */
    public static int m7392D(int i) {
        return m7393a(i << 3);
    }

    /* renamed from: a */
    public static int m7393a(int i) {
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
    public static int m7394b(long j) {
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
    public static C5099qc m7395c(byte[] bArr) {
        return new C5065oc(bArr, 0, bArr.length);
    }

    /* renamed from: x */
    public static int m7397x(C4980jc jcVar) {
        int j = jcVar.mo32730j();
        return m7393a(j) + j;
    }

    @Deprecated
    /* renamed from: y */
    static int m7398y(int i, C4982je jeVar, C5169ue ueVar) {
        int a = m7393a(i << 3);
        return a + a + ((C5200wb) jeVar).mo32732b(ueVar);
    }

    /* renamed from: z */
    public static int m7399z(int i) {
        if (i >= 0) {
            return m7393a(i);
        }
        return 10;
    }

    /* renamed from: d */
    public final void mo32973d() {
        if (mo32928g() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo32974e(String str, C5238yf yfVar) {
        f5486b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", yfVar);
        byte[] bytes = str.getBytes(C5032md.f5364b);
        try {
            int length = bytes.length;
            mo32942u(length);
            mo32938q(bytes, 0, length);
        } catch (IndexOutOfBoundsException e) {
            throw new zzpx(e);
        }
    }

    /* renamed from: g */
    public abstract int mo32928g();

    /* renamed from: h */
    public abstract void mo32929h(byte b);

    /* renamed from: i */
    public abstract void mo32930i(int i, boolean z);

    /* renamed from: j */
    public abstract void mo32931j(int i, C4980jc jcVar);

    /* renamed from: k */
    public abstract void mo32932k(int i, int i2);

    /* renamed from: l */
    public abstract void mo32933l(int i);

    /* renamed from: m */
    public abstract void mo32934m(int i, long j);

    /* renamed from: n */
    public abstract void mo32935n(long j);

    /* renamed from: o */
    public abstract void mo32936o(int i, int i2);

    /* renamed from: p */
    public abstract void mo32937p(int i);

    /* renamed from: q */
    public abstract void mo32938q(byte[] bArr, int i, int i2);

    /* renamed from: r */
    public abstract void mo32939r(int i, String str);

    /* renamed from: s */
    public abstract void mo32940s(int i, int i2);

    /* renamed from: t */
    public abstract void mo32941t(int i, int i2);

    /* renamed from: u */
    public abstract void mo32942u(int i);

    /* renamed from: v */
    public abstract void mo32943v(int i, long j);

    /* renamed from: w */
    public abstract void mo32944w(long j);
}
