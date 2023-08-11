package p223s7;

import com.google.protobuf.C7159q0;
import com.google.protobuf.C7186x;
import com.google.protobuf.C7193x0;

/* renamed from: s7.e0 */
/* compiled from: MessagesProto */
public final class C9533e0 extends C7186x<C9533e0, C9534a> implements C7159q0 {
    public static final int ACTION_FIELD_NUMBER = 2;
    /* access modifiers changed from: private */
    public static final C9533e0 DEFAULT_INSTANCE;
    public static final int IMAGE_URL_FIELD_NUMBER = 1;
    private static volatile C7193x0<C9533e0> PARSER;
    private C9575z action_;
    private String imageUrl_ = "";

    /* renamed from: s7.e0$a */
    /* compiled from: MessagesProto */
    public static final class C9534a extends C7186x.C7187a<C9533e0, C9534a> implements C7159q0 {
        /* synthetic */ C9534a(C9574y yVar) {
            this();
        }

        private C9534a() {
            super(C9533e0.DEFAULT_INSTANCE);
        }
    }

    static {
        C9533e0 e0Var = new C9533e0();
        DEFAULT_INSTANCE = e0Var;
        C7186x.m13874G(C9533e0.class, e0Var);
    }

    private C9533e0() {
    }

    /* renamed from: K */
    public static C9533e0 m19802K() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: J */
    public C9575z mo44018J() {
        C9575z zVar = this.action_;
        if (zVar == null) {
            return C9575z.m19887K();
        }
        return zVar;
    }

    /* renamed from: L */
    public String mo44019L() {
        return this.imageUrl_;
    }

    /* renamed from: M */
    public boolean mo44020M() {
        if (this.action_ != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final Object mo29952v(C7186x.C7192f fVar, Object obj, Object obj2) {
        switch (C9574y.f14261a[fVar.ordinal()]) {
            case 1:
                return new C9533e0();
            case 2:
                return new C9534a((C9574y) null);
            case 3:
                return C7186x.m13872E(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"imageUrl_", "action_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C7193x0<C9533e0> x0Var = PARSER;
                if (x0Var == null) {
                    synchronized (C9533e0.class) {
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
