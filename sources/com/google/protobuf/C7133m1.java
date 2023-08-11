package com.google.protobuf;

/* renamed from: com.google.protobuf.m1 */
/* compiled from: UnknownFieldSetLiteSchema */
class C7133m1 extends C7127k1<C7130l1, C7130l1> {
    C7133m1() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public C7130l1 mo40513g(Object obj) {
        return ((C7186x) obj).unknownFields;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public int mo40514h(C7130l1 l1Var) {
        return l1Var.mo40544d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public int mo40515i(C7130l1 l1Var) {
        return l1Var.mo40545e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public C7130l1 mo40517k(C7130l1 l1Var, C7130l1 l1Var2) {
        if (l1Var2.equals(C7130l1.m13432c())) {
            return l1Var;
        }
        return C7130l1.m13435i(l1Var, l1Var2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public C7130l1 mo40520n() {
        return C7130l1.m13436j();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public void mo40521o(Object obj, C7130l1 l1Var) {
        mo40522p(obj, l1Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public void mo40522p(Object obj, C7130l1 l1Var) {
        ((C7186x) obj).unknownFields = l1Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public C7130l1 mo40524r(C7130l1 l1Var) {
        l1Var.mo40547h();
        return l1Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public void mo40525s(C7130l1 l1Var, C7170r1 r1Var) {
        l1Var.mo40551o(r1Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public void mo40526t(C7130l1 l1Var, C7170r1 r1Var) {
        l1Var.mo40552q(r1Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo40516j(Object obj) {
        mo40513g(obj).mo40547h();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public boolean mo40523q(C7071d1 d1Var) {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo40507a(C7130l1 l1Var, int i, int i2) {
        l1Var.mo40550m(C7160q1.m13682c(i, 5), Integer.valueOf(i2));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo40508b(C7130l1 l1Var, int i, long j) {
        l1Var.mo40550m(C7160q1.m13682c(i, 1), Long.valueOf(j));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo40509c(C7130l1 l1Var, int i, C7130l1 l1Var2) {
        l1Var.mo40550m(C7160q1.m13682c(i, 3), l1Var2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo40510d(C7130l1 l1Var, int i, C7086h hVar) {
        l1Var.mo40550m(C7160q1.m13682c(i, 2), hVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo40511e(C7130l1 l1Var, int i, long j) {
        l1Var.mo40550m(C7160q1.m13682c(i, 0), Long.valueOf(j));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public C7130l1 mo40512f(Object obj) {
        C7130l1 A = mo40513g(obj);
        if (A != C7130l1.m13432c()) {
            return A;
        }
        C7130l1 j = C7130l1.m13436j();
        mo40522p(obj, j);
        return j;
    }
}
