package p223s7;

import com.google.protobuf.C7159q0;
import com.google.protobuf.C7186x;
import com.google.protobuf.C7193x0;

/* renamed from: s7.d0 */
/* compiled from: MessagesProto */
public final class C9528d0 extends C7186x<C9528d0, C9529a> implements C7159q0 {
    public static final int BANNER_FIELD_NUMBER = 1;
    public static final int CARD_FIELD_NUMBER = 4;
    /* access modifiers changed from: private */
    public static final C9528d0 DEFAULT_INSTANCE;
    public static final int IMAGE_ONLY_FIELD_NUMBER = 3;
    public static final int MODAL_FIELD_NUMBER = 2;
    private static volatile C7193x0<C9528d0> PARSER;
    private int messageDetailsCase_ = 0;
    private Object messageDetails_;

    /* renamed from: s7.d0$a */
    /* compiled from: MessagesProto */
    public static final class C9529a extends C7186x.C7187a<C9528d0, C9529a> implements C7159q0 {
        /* synthetic */ C9529a(C9574y yVar) {
            this();
        }

        private C9529a() {
            super(C9528d0.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: s7.d0$b */
    /* compiled from: MessagesProto */
    public enum C9530b {
        BANNER(1),
        MODAL(2),
        IMAGE_ONLY(3),
        CARD(4),
        MESSAGEDETAILS_NOT_SET(0);
        

        /* renamed from: b */
        private final int f14195b;

        private C9530b(int i) {
            this.f14195b = i;
        }

        /* renamed from: a */
        public static C9530b m19796a(int i) {
            if (i == 0) {
                return MESSAGEDETAILS_NOT_SET;
            }
            if (i == 1) {
                return BANNER;
            }
            if (i == 2) {
                return MODAL;
            }
            if (i == 3) {
                return IMAGE_ONLY;
            }
            if (i != 4) {
                return null;
            }
            return CARD;
        }
    }

    static {
        C9528d0 d0Var = new C9528d0();
        DEFAULT_INSTANCE = d0Var;
        C7186x.m13874G(C9528d0.class, d0Var);
    }

    private C9528d0() {
    }

    /* renamed from: L */
    public static C9528d0 m19789L() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: J */
    public C9516a0 mo44012J() {
        if (this.messageDetailsCase_ == 1) {
            return (C9516a0) this.messageDetails_;
        }
        return C9516a0.m19741M();
    }

    /* renamed from: K */
    public C9524c0 mo44013K() {
        if (this.messageDetailsCase_ == 4) {
            return (C9524c0) this.messageDetails_;
        }
        return C9524c0.m19767L();
    }

    /* renamed from: M */
    public C9533e0 mo44014M() {
        if (this.messageDetailsCase_ == 3) {
            return (C9533e0) this.messageDetails_;
        }
        return C9533e0.m19802K();
    }

    /* renamed from: N */
    public C9530b mo44015N() {
        return C9530b.m19796a(this.messageDetailsCase_);
    }

    /* renamed from: P */
    public C9537f0 mo44016P() {
        if (this.messageDetailsCase_ == 2) {
            return (C9537f0) this.messageDetails_;
        }
        return C9537f0.m19812N();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final Object mo29952v(C7186x.C7192f fVar, Object obj, Object obj2) {
        switch (C9574y.f14261a[fVar.ordinal()]) {
            case 1:
                return new C9528d0();
            case 2:
                return new C9529a((C9574y) null);
            case 3:
                return C7186x.m13872E(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"messageDetails_", "messageDetailsCase_", C9516a0.class, C9537f0.class, C9533e0.class, C9524c0.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C7193x0<C9528d0> x0Var = PARSER;
                if (x0Var == null) {
                    synchronized (C9528d0.class) {
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
