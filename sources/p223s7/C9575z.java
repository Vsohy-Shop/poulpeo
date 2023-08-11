package p223s7;

import com.google.protobuf.C7159q0;
import com.google.protobuf.C7186x;
import com.google.protobuf.C7193x0;

/* renamed from: s7.z */
/* compiled from: MessagesProto */
public final class C9575z extends C7186x<C9575z, C9576a> implements C7159q0 {
    public static final int ACTION_URL_FIELD_NUMBER = 1;
    /* access modifiers changed from: private */
    public static final C9575z DEFAULT_INSTANCE;
    private static volatile C7193x0<C9575z> PARSER;
    private String actionUrl_ = "";

    /* renamed from: s7.z$a */
    /* compiled from: MessagesProto */
    public static final class C9576a extends C7186x.C7187a<C9575z, C9576a> implements C7159q0 {
        /* synthetic */ C9576a(C9574y yVar) {
            this();
        }

        private C9576a() {
            super(C9575z.DEFAULT_INSTANCE);
        }
    }

    static {
        C9575z zVar = new C9575z();
        DEFAULT_INSTANCE = zVar;
        C7186x.m13874G(C9575z.class, zVar);
    }

    private C9575z() {
    }

    /* renamed from: K */
    public static C9575z m19887K() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: J */
    public String mo44050J() {
        return this.actionUrl_;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final Object mo29952v(C7186x.C7192f fVar, Object obj, Object obj2) {
        switch (C9574y.f14261a[fVar.ordinal()]) {
            case 1:
                return new C9575z();
            case 2:
                return new C9576a((C9574y) null);
            case 3:
                return C7186x.m13872E(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"actionUrl_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C7193x0<C9575z> x0Var = PARSER;
                if (x0Var == null) {
                    synchronized (C9575z.class) {
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
