package com.google.protobuf;

/* renamed from: com.google.protobuf.h0 */
/* compiled from: ManifestSchemaFactory */
final class C7098h0 implements C7082f1 {

    /* renamed from: b */
    private static final C7141o0 f9577b = new C7099a();

    /* renamed from: a */
    private final C7141o0 f9578a;

    /* renamed from: com.google.protobuf.h0$a */
    /* compiled from: ManifestSchemaFactory */
    static class C7099a implements C7141o0 {
        C7099a() {
        }

        /* renamed from: a */
        public C7135n0 mo40351a(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }

        /* renamed from: b */
        public boolean mo40352b(Class<?> cls) {
            return false;
        }
    }

    /* renamed from: com.google.protobuf.h0$b */
    /* compiled from: ManifestSchemaFactory */
    private static class C7100b implements C7141o0 {

        /* renamed from: a */
        private C7141o0[] f9579a;

        C7100b(C7141o0... o0VarArr) {
            this.f9579a = o0VarArr;
        }

        /* renamed from: a */
        public C7135n0 mo40351a(Class<?> cls) {
            for (C7141o0 o0Var : this.f9579a) {
                if (o0Var.mo40352b(cls)) {
                    return o0Var.mo40351a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        /* renamed from: b */
        public boolean mo40352b(Class<?> cls) {
            for (C7141o0 b : this.f9579a) {
                if (b.mo40352b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public C7098h0() {
        this(m13102b());
    }

    /* renamed from: b */
    private static C7141o0 m13102b() {
        return new C7100b(C7184w.m13864c(), m13103c());
    }

    /* renamed from: c */
    private static C7141o0 m13103c() {
        try {
            return (C7141o0) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            return f9577b;
        }
    }

    /* renamed from: d */
    private static boolean m13104d(C7135n0 n0Var) {
        if (n0Var.mo40211c() == C7206z0.PROTO2) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private static <T> C7076e1<T> m13105e(Class<T> cls, C7135n0 n0Var) {
        if (C7186x.class.isAssignableFrom(cls)) {
            if (m13104d(n0Var)) {
                return C7173s0.m13747N(cls, n0Var, C7185w0.m13868b(), C7078f0.m12968b(), C7085g1.m13008M(), C7168r.m13686b(), C7132m0.m13449b());
            }
            return C7173s0.m13747N(cls, n0Var, C7185w0.m13868b(), C7078f0.m12968b(), C7085g1.m13008M(), (C7148p<?>) null, C7132m0.m13449b());
        } else if (m13104d(n0Var)) {
            return C7173s0.m13747N(cls, n0Var, C7185w0.m13867a(), C7078f0.m12967a(), C7085g1.m13003H(), C7168r.m13685a(), C7132m0.m13448a());
        } else {
            return C7173s0.m13747N(cls, n0Var, C7185w0.m13867a(), C7078f0.m12967a(), C7085g1.m13004I(), (C7148p<?>) null, C7132m0.m13448a());
        }
    }

    /* renamed from: a */
    public <T> C7076e1<T> mo40302a(Class<T> cls) {
        C7085g1.m13005J(cls);
        C7135n0 a = this.f9578a.mo40351a(cls);
        if (!a.mo40209a()) {
            return m13105e(cls, a);
        }
        if (C7186x.class.isAssignableFrom(cls)) {
            return C7177t0.m13836l(C7085g1.m13008M(), C7168r.m13686b(), a.mo40210b());
        }
        return C7177t0.m13836l(C7085g1.m13003H(), C7168r.m13685a(), a.mo40210b());
    }

    private C7098h0(C7141o0 o0Var) {
        this.f9578a = (C7141o0) C7196z.m13945b(o0Var, "messageInfoFactory");
    }
}
