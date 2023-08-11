package p223s7;

import com.google.protobuf.C7159q0;
import com.google.protobuf.C7186x;
import com.google.protobuf.C7193x0;
import com.google.protobuf.C7196z;

/* renamed from: s7.d */
/* compiled from: CommonTypesProto */
public final class C9526d extends C7186x<C9526d, C9527a> implements C7159q0 {
    public static final int COUNT_FIELD_NUMBER = 5;
    /* access modifiers changed from: private */
    public static final C9526d DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile C7193x0<C9526d> PARSER = null;
    public static final int PREVIOUS_TIMESTAMP_MILLIS_FIELD_NUMBER = 4;
    public static final int TIMESTAMP_MILLIS_FIELD_NUMBER = 3;
    public static final int TRIGGER_PARAMS_FIELD_NUMBER = 1;
    private int count_;
    private String name_ = "";
    private long previousTimestampMillis_;
    private long timestampMillis_;
    private C7196z.C7205i<C9539g> triggerParams_ = C7186x.m13875w();

    /* renamed from: s7.d$a */
    /* compiled from: CommonTypesProto */
    public static final class C9527a extends C7186x.C7187a<C9526d, C9527a> implements C7159q0 {
        /* synthetic */ C9527a(C9523c cVar) {
            this();
        }

        private C9527a() {
            super(C9526d.DEFAULT_INSTANCE);
        }
    }

    static {
        C9526d dVar = new C9526d();
        DEFAULT_INSTANCE = dVar;
        C7186x.m13874G(C9526d.class, dVar);
    }

    private C9526d() {
    }

    /* renamed from: J */
    public static C9526d m19785J() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: K */
    public String mo44011K() {
        return this.name_;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final Object mo29952v(C7186x.C7192f fVar, Object obj, Object obj2) {
        switch (C9523c.f14188a[fVar.ordinal()]) {
            case 1:
                return new C9526d();
            case 2:
                return new C9527a((C9523c) null);
            case 3:
                return C7186x.m13872E(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002Ȉ\u0003\u0002\u0004\u0002\u0005\u0004", new Object[]{"triggerParams_", C9539g.class, "name_", "timestampMillis_", "previousTimestampMillis_", "count_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C7193x0<C9526d> x0Var = PARSER;
                if (x0Var == null) {
                    synchronized (C9526d.class) {
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
