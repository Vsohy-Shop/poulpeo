package p223s7;

import com.google.protobuf.C7159q0;
import com.google.protobuf.C7186x;
import com.google.protobuf.C7193x0;

/* renamed from: s7.e */
/* compiled from: CommonTypesProto */
public final class C9531e extends C7186x<C9531e, C9532a> implements C7159q0 {
    /* access modifiers changed from: private */
    public static final C9531e DEFAULT_INSTANCE;
    private static volatile C7193x0<C9531e> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private int value_;

    /* renamed from: s7.e$a */
    /* compiled from: CommonTypesProto */
    public static final class C9532a extends C7186x.C7187a<C9531e, C9532a> implements C7159q0 {
        /* synthetic */ C9532a(C9523c cVar) {
            this();
        }

        private C9532a() {
            super(C9531e.DEFAULT_INSTANCE);
        }
    }

    static {
        C9531e eVar = new C9531e();
        DEFAULT_INSTANCE = eVar;
        C7186x.m13874G(C9531e.class, eVar);
    }

    private C9531e() {
    }

    /* renamed from: J */
    public static C9531e m19798J() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: K */
    public int mo44017K() {
        return this.value_;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final Object mo29952v(C7186x.C7192f fVar, Object obj, Object obj2) {
        switch (C9523c.f14188a[fVar.ordinal()]) {
            case 1:
                return new C9531e();
            case 2:
                return new C9532a((C9523c) null);
            case 3:
                return C7186x.m13872E(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C7193x0<C9531e> x0Var = PARSER;
                if (x0Var == null) {
                    synchronized (C9531e.class) {
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
