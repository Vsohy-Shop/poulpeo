package p051c8;

import com.google.protobuf.C7115i0;
import com.google.protobuf.C7120j0;
import com.google.protobuf.C7159q0;
import com.google.protobuf.C7160q1;
import com.google.protobuf.C7186x;
import com.google.protobuf.C7193x0;
import java.util.Map;

/* renamed from: c8.c3 */
/* compiled from: RateLimitProto */
public final class C3914c3 extends C7186x<C3914c3, C3915a> implements C7159q0 {
    /* access modifiers changed from: private */
    public static final C3914c3 DEFAULT_INSTANCE;
    public static final int LIMITS_FIELD_NUMBER = 1;
    private static volatile C7193x0<C3914c3> PARSER;
    private C7120j0<String, C3907b3> limits_ = C7120j0.m13319e();

    /* renamed from: c8.c3$a */
    /* compiled from: RateLimitProto */
    public static final class C3915a extends C7186x.C7187a<C3914c3, C3915a> implements C7159q0 {
        /* synthetic */ C3915a(C3902a3 a3Var) {
            this();
        }

        /* renamed from: z */
        public C3915a mo29962z(String str, C3907b3 b3Var) {
            str.getClass();
            b3Var.getClass();
            mo40696t();
            ((C3914c3) this.f9839c).m4448M().put(str, b3Var);
            return this;
        }

        private C3915a() {
            super(C3914c3.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: c8.c3$b */
    /* compiled from: RateLimitProto */
    private static final class C3916b {

        /* renamed from: a */
        static final C7115i0<String, C3907b3> f3009a = C7115i0.m13257d(C7160q1.C7162b.STRING, "", C7160q1.C7162b.MESSAGE, C3907b3.m4428N());
    }

    static {
        C3914c3 c3Var = new C3914c3();
        DEFAULT_INSTANCE = c3Var;
        C7186x.m13874G(C3914c3.class, c3Var);
    }

    private C3914c3() {
    }

    /* renamed from: K */
    public static C3914c3 m4447K() {
        return DEFAULT_INSTANCE;
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public Map<String, C3907b3> m4448M() {
        return m4450P();
    }

    /* renamed from: N */
    private C7120j0<String, C3907b3> m4449N() {
        return this.limits_;
    }

    /* renamed from: P */
    private C7120j0<String, C3907b3> m4450P() {
        if (!this.limits_.mo40449i()) {
            this.limits_ = this.limits_.mo40452m();
        }
        return this.limits_;
    }

    /* renamed from: R */
    public static C3915a m4451R(C3914c3 c3Var) {
        return (C3915a) DEFAULT_INSTANCE.mo40687s(c3Var);
    }

    /* renamed from: S */
    public static C7193x0<C3914c3> m4452S() {
        return DEFAULT_INSTANCE.mo40629i();
    }

    /* renamed from: L */
    public C3907b3 mo29961L(String str, C3907b3 b3Var) {
        str.getClass();
        C7120j0<String, C3907b3> N = m4449N();
        if (N.containsKey(str)) {
            return N.get(str);
        }
        return b3Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final Object mo29952v(C7186x.C7192f fVar, Object obj, Object obj2) {
        switch (C3902a3.f2997a[fVar.ordinal()]) {
            case 1:
                return new C3914c3();
            case 2:
                return new C3915a((C3902a3) null);
            case 3:
                return C7186x.m13872E(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"limits_", C3916b.f3009a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C7193x0<C3914c3> x0Var = PARSER;
                if (x0Var == null) {
                    synchronized (C3914c3.class) {
                        x0Var = PARSER;
                        if (x0Var == null) {
                            x0Var = new C7186x.C7188b<>(DEFAULT_INSTANCE);
                            PARSER = x0Var;
                        }
                    }
                }
                return x0Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
