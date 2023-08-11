package com.google.protobuf;

/* renamed from: com.google.protobuf.k1 */
/* compiled from: UnknownFieldSchema */
abstract class C7127k1<T, B> {
    C7127k1() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo40507a(B b, int i, int i2);

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract void mo40508b(B b, int i, long j);

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract void mo40509c(B b, int i, T t);

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract void mo40510d(B b, int i, C7086h hVar);

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract void mo40511e(B b, int i, long j);

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public abstract B mo40512f(Object obj);

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public abstract T mo40513g(Object obj);

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public abstract int mo40514h(T t);

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public abstract int mo40515i(T t);

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public abstract void mo40516j(Object obj);

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public abstract T mo40517k(T t, T t2);

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:3:0x000d, LOOP_START, MTH_ENTER_BLOCK] */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo40518l(B r3, com.google.protobuf.C7071d1 r4) {
        /*
            r2 = this;
        L_0x0000:
            int r0 = r4.mo40227A()
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == r1) goto L_0x000f
            boolean r0 = r2.mo40519m(r3, r4)
            if (r0 != 0) goto L_0x0000
        L_0x000f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C7127k1.mo40518l(java.lang.Object, com.google.protobuf.d1):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final boolean mo40519m(B b, C7071d1 d1Var) {
        int tag = d1Var.getTag();
        int a = C7160q1.m13680a(tag);
        int b2 = C7160q1.m13681b(tag);
        if (b2 == 0) {
            mo40511e(b, a, d1Var.mo40239M());
            return true;
        } else if (b2 == 1) {
            mo40508b(b, a, d1Var.mo40244c());
            return true;
        } else if (b2 == 2) {
            mo40510d(b, a, d1Var.mo40232F());
            return true;
        } else if (b2 == 3) {
            Object n = mo40520n();
            int c = C7160q1.m13682c(a, 4);
            mo40518l(n, d1Var);
            if (c == d1Var.getTag()) {
                mo40509c(b, a, mo40524r(n));
                return true;
            }
            throw InvalidProtocolBufferException.m12752b();
        } else if (b2 == 4) {
            return false;
        } else {
            if (b2 == 5) {
                mo40507a(b, a, d1Var.mo40251i());
                return true;
            }
            throw InvalidProtocolBufferException.m12755e();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public abstract B mo40520n();

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public abstract void mo40521o(Object obj, B b);

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public abstract void mo40522p(Object obj, T t);

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public abstract boolean mo40523q(C7071d1 d1Var);

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public abstract T mo40524r(B b);

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public abstract void mo40525s(T t, C7170r1 r1Var);

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public abstract void mo40526t(T t, C7170r1 r1Var);
}
