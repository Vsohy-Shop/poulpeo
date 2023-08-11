package p051c8;

import com.google.protobuf.C7159q0;
import com.google.protobuf.C7186x;
import com.google.protobuf.C7193x0;

/* renamed from: c8.b3 */
/* compiled from: RateLimitProto */
public final class C3907b3 extends C7186x<C3907b3, C3908a> implements C7159q0 {
    /* access modifiers changed from: private */
    public static final C3907b3 DEFAULT_INSTANCE;
    private static volatile C7193x0<C3907b3> PARSER = null;
    public static final int START_TIME_EPOCH_FIELD_NUMBER = 2;
    public static final int VALUE_FIELD_NUMBER = 1;
    private long startTimeEpoch_;
    private long value_;

    /* renamed from: c8.b3$a */
    /* compiled from: RateLimitProto */
    public static final class C3908a extends C7186x.C7187a<C3907b3, C3908a> implements C7159q0 {
        /* synthetic */ C3908a(C3902a3 a3Var) {
            this();
        }

        /* renamed from: B */
        public C3908a mo29953B(long j) {
            mo40696t();
            ((C3907b3) this.f9839c).m4431U(j);
            return this;
        }

        /* renamed from: C */
        public C3908a mo29954C(long j) {
            mo40696t();
            ((C3907b3) this.f9839c).m4432V(j);
            return this;
        }

        /* renamed from: z */
        public C3908a mo29955z() {
            mo40696t();
            ((C3907b3) this.f9839c).m4427M();
            return this;
        }

        private C3908a() {
            super(C3907b3.DEFAULT_INSTANCE);
        }
    }

    static {
        C3907b3 b3Var = new C3907b3();
        DEFAULT_INSTANCE = b3Var;
        C7186x.m13874G(C3907b3.class, b3Var);
    }

    private C3907b3() {
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public void m4427M() {
        this.value_ = 0;
    }

    /* renamed from: N */
    public static C3907b3 m4428N() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: S */
    public static C3908a m4429S() {
        return (C3908a) DEFAULT_INSTANCE.mo40686r();
    }

    /* renamed from: T */
    public static C3908a m4430T(C3907b3 b3Var) {
        return (C3908a) DEFAULT_INSTANCE.mo40687s(b3Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: U */
    public void m4431U(long j) {
        this.startTimeEpoch_ = j;
    }

    /* access modifiers changed from: private */
    /* renamed from: V */
    public void m4432V(long j) {
        this.value_ = j;
    }

    /* renamed from: P */
    public long mo29950P() {
        return this.startTimeEpoch_;
    }

    /* renamed from: R */
    public long mo29951R() {
        return this.value_;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final Object mo29952v(C7186x.C7192f fVar, Object obj, Object obj2) {
        switch (C3902a3.f2997a[fVar.ordinal()]) {
            case 1:
                return new C3907b3();
            case 2:
                return new C3908a((C3902a3) null);
            case 3:
                return C7186x.m13872E(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0002", new Object[]{"value_", "startTimeEpoch_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C7193x0<C3907b3> x0Var = PARSER;
                if (x0Var == null) {
                    synchronized (C3907b3.class) {
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
