package p223s7;

import com.google.protobuf.C7159q0;
import com.google.protobuf.C7186x;
import com.google.protobuf.C7193x0;

/* renamed from: s7.g */
/* compiled from: CommonTypesProto */
public final class C9539g extends C7186x<C9539g, C9540a> implements C7159q0 {
    /* access modifiers changed from: private */
    public static final C9539g DEFAULT_INSTANCE;
    public static final int DOUBLE_VALUE_FIELD_NUMBER = 5;
    public static final int FLOAT_VALUE_FIELD_NUMBER = 4;
    public static final int INT_VALUE_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile C7193x0<C9539g> PARSER = null;
    public static final int STRING_VALUE_FIELD_NUMBER = 2;
    private double doubleValue_;
    private float floatValue_;
    private long intValue_;
    private String name_ = "";
    private String stringValue_ = "";

    /* renamed from: s7.g$a */
    /* compiled from: CommonTypesProto */
    public static final class C9540a extends C7186x.C7187a<C9539g, C9540a> implements C7159q0 {
        /* synthetic */ C9540a(C9523c cVar) {
            this();
        }

        private C9540a() {
            super(C9539g.DEFAULT_INSTANCE);
        }
    }

    static {
        C9539g gVar = new C9539g();
        DEFAULT_INSTANCE = gVar;
        C7186x.m13874G(C9539g.class, gVar);
    }

    private C9539g() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final Object mo29952v(C7186x.C7192f fVar, Object obj, Object obj2) {
        switch (C9523c.f14188a[fVar.ordinal()]) {
            case 1:
                return new C9539g();
            case 2:
                return new C9540a((C9523c) null);
            case 3:
                return C7186x.m13872E(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0002\u0004\u0001\u0005\u0000", new Object[]{"name_", "stringValue_", "intValue_", "floatValue_", "doubleValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C7193x0<C9539g> x0Var = PARSER;
                if (x0Var == null) {
                    synchronized (C9539g.class) {
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
