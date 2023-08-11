package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.e8 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
final class C5724e8 {

    /* renamed from: a */
    private final C5707d8 f6872a;

    private C5724e8(C5707d8 d8Var) {
        C5708d9.m9019f(d8Var, "output");
        this.f6872a = d8Var;
        d8Var.f6850a = this;
    }

    /* renamed from: l */
    public static C5724e8 m9107l(C5707d8 d8Var) {
        C5724e8 e8Var = d8Var.f6850a;
        if (e8Var != null) {
            return e8Var;
        }
        return new C5724e8(d8Var);
    }

    /* renamed from: A */
    public final void mo33901A(int i, List<Float> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f6872a.mo33768s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).floatValue();
                i3 += 4;
            }
            this.f6872a.mo33770u(i3);
            while (i2 < list.size()) {
                this.f6872a.mo33761l(Float.floatToRawIntBits(list.get(i2).floatValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f6872a.mo33760k(i, Float.floatToRawIntBits(list.get(i2).floatValue()));
            i2++;
        }
    }

    /* renamed from: B */
    public final void mo33902B(int i, Object obj, C5811ja jaVar) {
        C5707d8 d8Var = this.f6872a;
        d8Var.mo33768s(i, 3);
        jaVar.mo33713i((C6052y9) obj, d8Var.f6850a);
        d8Var.mo33768s(i, 4);
    }

    /* renamed from: C */
    public final void mo33903C(int i, int i2) {
        this.f6872a.mo33764o(i, i2);
    }

    /* renamed from: D */
    public final void mo33904D(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f6872a.mo33768s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C5707d8.m8994z(list.get(i4).intValue());
            }
            this.f6872a.mo33770u(i3);
            while (i2 < list.size()) {
                this.f6872a.mo33765p(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f6872a.mo33764o(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: E */
    public final void mo33905E(int i, long j) {
        this.f6872a.mo33771v(i, j);
    }

    /* renamed from: F */
    public final void mo33906F(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f6872a.mo33768s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C5707d8.m8989b(list.get(i4).longValue());
            }
            this.f6872a.mo33770u(i3);
            while (i2 < list.size()) {
                this.f6872a.mo33772w(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f6872a.mo33771v(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: G */
    public final void mo33907G(int i, Object obj, C5811ja jaVar) {
        C6052y9 y9Var = (C6052y9) obj;
        C5690c8 c8Var = (C5690c8) this.f6872a;
        c8Var.mo33770u((i << 3) | 2);
        C5757g7 g7Var = (C5757g7) y9Var;
        int g = g7Var.mo34042g();
        if (g == -1) {
            g = jaVar.mo33706b(g7Var);
            g7Var.mo34043i(g);
        }
        c8Var.mo33770u(g);
        jaVar.mo33713i(y9Var, c8Var.f6850a);
    }

    /* renamed from: H */
    public final void mo33908H(int i, int i2) {
        this.f6872a.mo33760k(i, i2);
    }

    /* renamed from: I */
    public final void mo33909I(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f6872a.mo33768s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).intValue();
                i3 += 4;
            }
            this.f6872a.mo33770u(i3);
            while (i2 < list.size()) {
                this.f6872a.mo33761l(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f6872a.mo33760k(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: J */
    public final void mo33910J(int i, long j) {
        this.f6872a.mo33762m(i, j);
    }

    /* renamed from: K */
    public final void mo33911K(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f6872a.mo33768s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).longValue();
                i3 += 8;
            }
            this.f6872a.mo33770u(i3);
            while (i2 < list.size()) {
                this.f6872a.mo33763n(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f6872a.mo33762m(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: a */
    public final void mo33912a(int i, int i2) {
        this.f6872a.mo33769t(i, (i2 >> 31) ^ (i2 + i2));
    }

    /* renamed from: b */
    public final void mo33913b(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f6872a.mo33768s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                int intValue = list.get(i4).intValue();
                i3 += C5707d8.m8988a((intValue >> 31) ^ (intValue + intValue));
            }
            this.f6872a.mo33770u(i3);
            while (i2 < list.size()) {
                C5707d8 d8Var = this.f6872a;
                int intValue2 = list.get(i2).intValue();
                d8Var.mo33770u((intValue2 >> 31) ^ (intValue2 + intValue2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            C5707d8 d8Var2 = this.f6872a;
            int intValue3 = list.get(i2).intValue();
            d8Var2.mo33769t(i, (intValue3 >> 31) ^ (intValue3 + intValue3));
            i2++;
        }
    }

    /* renamed from: c */
    public final void mo33914c(int i, long j) {
        this.f6872a.mo33771v(i, (j >> 63) ^ (j + j));
    }

    /* renamed from: d */
    public final void mo33915d(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f6872a.mo33768s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                long longValue = list.get(i4).longValue();
                i3 += C5707d8.m8989b((longValue >> 63) ^ (longValue + longValue));
            }
            this.f6872a.mo33770u(i3);
            while (i2 < list.size()) {
                C5707d8 d8Var = this.f6872a;
                long longValue2 = list.get(i2).longValue();
                d8Var.mo33772w((longValue2 >> 63) ^ (longValue2 + longValue2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            C5707d8 d8Var2 = this.f6872a;
            long longValue3 = list.get(i2).longValue();
            d8Var2.mo33771v(i, (longValue3 >> 63) ^ (longValue3 + longValue3));
            i2++;
        }
    }

    @Deprecated
    /* renamed from: e */
    public final void mo33916e(int i) {
        this.f6872a.mo33768s(i, 3);
    }

    /* renamed from: f */
    public final void mo33917f(int i, String str) {
        this.f6872a.mo33767r(i, str);
    }

    /* renamed from: g */
    public final void mo33918g(int i, List<String> list) {
        int i2 = 0;
        if (list instanceof C5776h9) {
            C5776h9 h9Var = (C5776h9) list;
            while (i2 < list.size()) {
                Object f = h9Var.mo33777f(i2);
                if (f instanceof String) {
                    this.f6872a.mo33767r(i, (String) f);
                } else {
                    this.f6872a.mo33759j(i, (C6018w7) f);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f6872a.mo33767r(i, list.get(i2));
            i2++;
        }
    }

    /* renamed from: h */
    public final void mo33919h(int i, int i2) {
        this.f6872a.mo33769t(i, i2);
    }

    /* renamed from: i */
    public final void mo33920i(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f6872a.mo33768s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C5707d8.m8988a(list.get(i4).intValue());
            }
            this.f6872a.mo33770u(i3);
            while (i2 < list.size()) {
                this.f6872a.mo33770u(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f6872a.mo33769t(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: j */
    public final void mo33921j(int i, long j) {
        this.f6872a.mo33771v(i, j);
    }

    /* renamed from: k */
    public final void mo33922k(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f6872a.mo33768s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C5707d8.m8989b(list.get(i4).longValue());
            }
            this.f6872a.mo33770u(i3);
            while (i2 < list.size()) {
                this.f6872a.mo33772w(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f6872a.mo33771v(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: m */
    public final void mo33923m(int i, boolean z) {
        this.f6872a.mo33758i(i, z);
    }

    /* renamed from: n */
    public final void mo33924n(int i, List<Boolean> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f6872a.mo33768s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).booleanValue();
                i3++;
            }
            this.f6872a.mo33770u(i3);
            while (i2 < list.size()) {
                this.f6872a.mo33757h(list.get(i2).booleanValue() ? (byte) 1 : 0);
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f6872a.mo33758i(i, list.get(i2).booleanValue());
            i2++;
        }
    }

    /* renamed from: o */
    public final void mo33925o(int i, C6018w7 w7Var) {
        this.f6872a.mo33759j(i, w7Var);
    }

    /* renamed from: p */
    public final void mo33926p(int i, List<C6018w7> list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f6872a.mo33759j(i, list.get(i2));
        }
    }

    /* renamed from: q */
    public final void mo33927q(int i, double d) {
        this.f6872a.mo33762m(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: r */
    public final void mo33928r(int i, List<Double> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f6872a.mo33768s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).doubleValue();
                i3 += 8;
            }
            this.f6872a.mo33770u(i3);
            while (i2 < list.size()) {
                this.f6872a.mo33763n(Double.doubleToRawLongBits(list.get(i2).doubleValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f6872a.mo33762m(i, Double.doubleToRawLongBits(list.get(i2).doubleValue()));
            i2++;
        }
    }

    @Deprecated
    /* renamed from: s */
    public final void mo33929s(int i) {
        this.f6872a.mo33768s(i, 4);
    }

    /* renamed from: t */
    public final void mo33930t(int i, int i2) {
        this.f6872a.mo33764o(i, i2);
    }

    /* renamed from: u */
    public final void mo33931u(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f6872a.mo33768s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C5707d8.m8994z(list.get(i4).intValue());
            }
            this.f6872a.mo33770u(i3);
            while (i2 < list.size()) {
                this.f6872a.mo33765p(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f6872a.mo33764o(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: v */
    public final void mo33932v(int i, int i2) {
        this.f6872a.mo33760k(i, i2);
    }

    /* renamed from: w */
    public final void mo33933w(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f6872a.mo33768s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).intValue();
                i3 += 4;
            }
            this.f6872a.mo33770u(i3);
            while (i2 < list.size()) {
                this.f6872a.mo33761l(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f6872a.mo33760k(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: x */
    public final void mo33934x(int i, long j) {
        this.f6872a.mo33762m(i, j);
    }

    /* renamed from: y */
    public final void mo33935y(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f6872a.mo33768s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).longValue();
                i3 += 8;
            }
            this.f6872a.mo33770u(i3);
            while (i2 < list.size()) {
                this.f6872a.mo33763n(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f6872a.mo33762m(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: z */
    public final void mo33936z(int i, float f) {
        this.f6872a.mo33760k(i, Float.floatToRawIntBits(f));
    }
}
