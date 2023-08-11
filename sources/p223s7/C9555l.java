package p223s7;

import com.google.protobuf.C7159q0;
import com.google.protobuf.C7186x;
import com.google.protobuf.C7193x0;

/* renamed from: s7.l */
/* compiled from: ExperimentPayloadProto */
public final class C9555l extends C7186x<C9555l, C9556a> implements C7159q0 {
    /* access modifiers changed from: private */
    public static final C9555l DEFAULT_INSTANCE;
    public static final int EXPERIMENT_ID_FIELD_NUMBER = 1;
    private static volatile C7193x0<C9555l> PARSER;
    private String experimentId_ = "";

    /* renamed from: s7.l$a */
    /* compiled from: ExperimentPayloadProto */
    public static final class C9556a extends C7186x.C7187a<C9555l, C9556a> implements C7159q0 {
        /* synthetic */ C9556a(C9554k kVar) {
            this();
        }

        private C9556a() {
            super(C9555l.DEFAULT_INSTANCE);
        }
    }

    static {
        C9555l lVar = new C9555l();
        DEFAULT_INSTANCE = lVar;
        C7186x.m13874G(C9555l.class, lVar);
    }

    private C9555l() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final Object mo29952v(C7186x.C7192f fVar, Object obj, Object obj2) {
        switch (C9554k.f14226a[fVar.ordinal()]) {
            case 1:
                return new C9555l();
            case 2:
                return new C9556a((C9554k) null);
            case 3:
                return C7186x.m13872E(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"experimentId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C7193x0<C9555l> x0Var = PARSER;
                if (x0Var == null) {
                    synchronized (C9555l.class) {
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
