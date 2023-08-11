package p223s7;

import com.google.protobuf.C7159q0;
import com.google.protobuf.C7186x;
import com.google.protobuf.C7193x0;

/* renamed from: s7.h */
/* compiled from: CommonTypesProto */
public final class C9543h extends C7186x<C9543h, C9544a> implements C7159q0 {
    /* access modifiers changed from: private */
    public static final C9543h DEFAULT_INSTANCE;
    public static final int EVENT_FIELD_NUMBER = 2;
    public static final int FIAM_TRIGGER_FIELD_NUMBER = 1;
    private static volatile C7193x0<C9543h> PARSER;
    private int conditionCase_ = 0;
    private Object condition_;

    /* renamed from: s7.h$a */
    /* compiled from: CommonTypesProto */
    public static final class C9544a extends C7186x.C7187a<C9543h, C9544a> implements C7159q0 {
        /* synthetic */ C9544a(C9523c cVar) {
            this();
        }

        private C9544a() {
            super(C9543h.DEFAULT_INSTANCE);
        }
    }

    static {
        C9543h hVar = new C9543h();
        DEFAULT_INSTANCE = hVar;
        C7186x.m13874G(C9543h.class, hVar);
    }

    private C9543h() {
    }

    /* renamed from: J */
    public C9526d mo44033J() {
        if (this.conditionCase_ == 2) {
            return (C9526d) this.condition_;
        }
        return C9526d.m19785J();
    }

    /* renamed from: K */
    public C9535f mo44034K() {
        if (this.conditionCase_ != 1) {
            return C9535f.UNKNOWN_TRIGGER;
        }
        C9535f a = C9535f.m19807a(((Integer) this.condition_).intValue());
        if (a == null) {
            return C9535f.UNRECOGNIZED;
        }
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final Object mo29952v(C7186x.C7192f fVar, Object obj, Object obj2) {
        switch (C9523c.f14188a[fVar.ordinal()]) {
            case 1:
                return new C9543h();
            case 2:
                return new C9544a((C9523c) null);
            case 3:
                return C7186x.m13872E(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001?\u0000\u0002<\u0000", new Object[]{"condition_", "conditionCase_", C9526d.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C7193x0<C9543h> x0Var = PARSER;
                if (x0Var == null) {
                    synchronized (C9543h.class) {
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
