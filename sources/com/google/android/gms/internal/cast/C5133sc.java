package com.google.android.gms.internal.cast;

import java.util.List;

/* renamed from: com.google.android.gms.internal.cast.sc */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
final class C5133sc implements C4863cg {

    /* renamed from: a */
    private final C5099qc f5523a;

    private C5133sc(C5099qc qcVar) {
        C5032md.m7199f(qcVar, "output");
        this.f5523a = qcVar;
        qcVar.f5488a = this;
    }

    /* renamed from: I */
    public static C5133sc m7452I(C5099qc qcVar) {
        C5133sc scVar = qcVar.f5488a;
        if (scVar != null) {
            return scVar;
        }
        return new C5133sc(qcVar);
    }

    /* renamed from: A */
    public final void mo32682A(int i, long j) {
        this.f5523a.mo32934m(i, j);
    }

    /* renamed from: B */
    public final void mo32683B(int i, C4980jc jcVar) {
        this.f5523a.mo32931j(i, jcVar);
    }

    /* renamed from: C */
    public final void mo32684C(int i, Object obj, C5169ue ueVar) {
        C4982je jeVar = (C4982je) obj;
        C5065oc ocVar = (C5065oc) this.f5523a;
        ocVar.mo32942u((i << 3) | 2);
        ocVar.mo32942u(((C5200wb) jeVar).mo32732b(ueVar));
        ueVar.mo32898f(jeVar, ocVar.f5488a);
    }

    /* renamed from: D */
    public final void mo32685D(int i, long j) {
        this.f5523a.mo32943v(i, (j >> 63) ^ (j + j));
    }

    /* renamed from: E */
    public final void mo32686E(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f5523a.mo32940s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            this.f5523a.mo32942u(i3);
            while (i2 < list.size()) {
                this.f5523a.mo32933l(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f5523a.mo32932k(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: F */
    public final void mo32687F(int i, int i2) {
        this.f5523a.mo32932k(i, i2);
    }

    /* renamed from: G */
    public final void mo32688G(int i, String str) {
        this.f5523a.mo32939r(i, str);
    }

    /* renamed from: H */
    public final void mo32689H(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f5523a.mo32940s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).floatValue();
                i3 += 4;
            }
            this.f5523a.mo32942u(i3);
            while (i2 < list.size()) {
                this.f5523a.mo32933l(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f5523a.mo32932k(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    /* renamed from: a */
    public final void mo32690a(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f5523a.mo32940s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C5099qc.m7393a(((Integer) list.get(i4)).intValue());
            }
            this.f5523a.mo32942u(i3);
            while (i2 < list.size()) {
                this.f5523a.mo32942u(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f5523a.mo32941t(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: b */
    public final void mo32691b(int i, long j) {
        this.f5523a.mo32943v(i, j);
    }

    /* renamed from: c */
    public final void mo32692c(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f5523a.mo32940s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C5099qc.m7399z(((Integer) list.get(i4)).intValue());
            }
            this.f5523a.mo32942u(i3);
            while (i2 < list.size()) {
                this.f5523a.mo32937p(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f5523a.mo32936o(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: d */
    public final void mo32693d(int i, int i2) {
        this.f5523a.mo32932k(i, i2);
    }

    /* renamed from: e */
    public final void mo32694e(int i, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f5523a.mo32931j(i, (C4980jc) list.get(i2));
        }
    }

    /* renamed from: f */
    public final void mo32695f(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f5523a.mo32940s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C5099qc.m7399z(((Integer) list.get(i4)).intValue());
            }
            this.f5523a.mo32942u(i3);
            while (i2 < list.size()) {
                this.f5523a.mo32937p(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f5523a.mo32936o(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: g */
    public final void mo32696g(int i, long j) {
        this.f5523a.mo32943v(i, j);
    }

    /* renamed from: h */
    public final void mo32697h(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f5523a.mo32940s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            this.f5523a.mo32942u(i3);
            while (i2 < list.size()) {
                this.f5523a.mo32935n(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f5523a.mo32934m(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: i */
    public final void mo32698i(int i, boolean z) {
        this.f5523a.mo32930i(i, z);
    }

    /* renamed from: j */
    public final void mo32699j(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f5523a.mo32940s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C5099qc.m7394b(((Long) list.get(i4)).longValue());
            }
            this.f5523a.mo32942u(i3);
            while (i2 < list.size()) {
                this.f5523a.mo32944w(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f5523a.mo32943v(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: k */
    public final void mo32700k(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f5523a.mo32940s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Boolean) list.get(i4)).booleanValue();
                i3++;
            }
            this.f5523a.mo32942u(i3);
            while (i2 < list.size()) {
                this.f5523a.mo32929h(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : 0);
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f5523a.mo32930i(i, ((Boolean) list.get(i2)).booleanValue());
            i2++;
        }
    }

    /* renamed from: l */
    public final void mo32701l(int i, List list) {
        int i2 = 0;
        if (list instanceof C5117rd) {
            C5117rd rdVar = (C5117rd) list;
            while (i2 < list.size()) {
                Object i3 = rdVar.mo32981i(i2);
                if (i3 instanceof String) {
                    this.f5523a.mo32939r(i, (String) i3);
                } else {
                    this.f5523a.mo32931j(i, (C4980jc) i3);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f5523a.mo32939r(i, (String) list.get(i2));
            i2++;
        }
    }

    /* renamed from: m */
    public final void mo32702m(int i, int i2) {
        this.f5523a.mo32936o(i, i2);
    }

    /* renamed from: n */
    public final void mo32703n(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f5523a.mo32940s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C5099qc.m7394b(((Long) list.get(i4)).longValue());
            }
            this.f5523a.mo32942u(i3);
            while (i2 < list.size()) {
                this.f5523a.mo32944w(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f5523a.mo32943v(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: o */
    public final void mo32704o(int i, int i2) {
        this.f5523a.mo32941t(i, i2);
    }

    /* renamed from: p */
    public final void mo32705p(int i, int i2) {
        this.f5523a.mo32936o(i, i2);
    }

    /* renamed from: q */
    public final void mo32706q(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f5523a.mo32940s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                int intValue = ((Integer) list.get(i4)).intValue();
                i3 += C5099qc.m7393a((intValue >> 31) ^ (intValue + intValue));
            }
            this.f5523a.mo32942u(i3);
            while (i2 < list.size()) {
                C5099qc qcVar = this.f5523a;
                int intValue2 = ((Integer) list.get(i2)).intValue();
                qcVar.mo32942u((intValue2 >> 31) ^ (intValue2 + intValue2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            C5099qc qcVar2 = this.f5523a;
            int intValue3 = ((Integer) list.get(i2)).intValue();
            qcVar2.mo32941t(i, (intValue3 >> 31) ^ (intValue3 + intValue3));
            i2++;
        }
    }

    /* renamed from: r */
    public final void mo32707r(int i, int i2) {
        this.f5523a.mo32941t(i, (i2 >> 31) ^ (i2 + i2));
    }

    /* renamed from: s */
    public final void mo32708s(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f5523a.mo32940s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            this.f5523a.mo32942u(i3);
            while (i2 < list.size()) {
                this.f5523a.mo32933l(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f5523a.mo32932k(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: t */
    public final void mo32709t(int i, Object obj, C5169ue ueVar) {
        C5099qc qcVar = this.f5523a;
        qcVar.mo32940s(i, 3);
        ueVar.mo32898f((C4982je) obj, qcVar.f5488a);
        qcVar.mo32940s(i, 4);
    }

    /* renamed from: u */
    public final void mo32710u(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f5523a.mo32940s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                long longValue = ((Long) list.get(i4)).longValue();
                i3 += C5099qc.m7394b((longValue >> 63) ^ (longValue + longValue));
            }
            this.f5523a.mo32942u(i3);
            while (i2 < list.size()) {
                C5099qc qcVar = this.f5523a;
                long longValue2 = ((Long) list.get(i2)).longValue();
                qcVar.mo32944w((longValue2 >> 63) ^ (longValue2 + longValue2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            C5099qc qcVar2 = this.f5523a;
            long longValue3 = ((Long) list.get(i2)).longValue();
            qcVar2.mo32943v(i, (longValue3 >> 63) ^ (longValue3 + longValue3));
            i2++;
        }
    }

    /* renamed from: v */
    public final void mo32711v(int i, float f) {
        this.f5523a.mo32932k(i, Float.floatToRawIntBits(f));
    }

    /* renamed from: w */
    public final void mo32712w(int i, double d) {
        this.f5523a.mo32934m(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: x */
    public final void mo32713x(int i, long j) {
        this.f5523a.mo32934m(i, j);
    }

    /* renamed from: y */
    public final void mo32714y(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f5523a.mo32940s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            this.f5523a.mo32942u(i3);
            while (i2 < list.size()) {
                this.f5523a.mo32935n(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f5523a.mo32934m(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: z */
    public final void mo32715z(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f5523a.mo32940s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Double) list.get(i4)).doubleValue();
                i3 += 8;
            }
            this.f5523a.mo32942u(i3);
            while (i2 < list.size()) {
                this.f5523a.mo32935n(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f5523a.mo32934m(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }
}
