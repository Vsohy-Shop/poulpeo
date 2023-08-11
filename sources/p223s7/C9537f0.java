package p223s7;

import com.google.protobuf.C7159q0;
import com.google.protobuf.C7186x;
import com.google.protobuf.C7193x0;

/* renamed from: s7.f0 */
/* compiled from: MessagesProto */
public final class C9537f0 extends C7186x<C9537f0, C9538a> implements C7159q0 {
    public static final int ACTION_BUTTON_FIELD_NUMBER = 4;
    public static final int ACTION_FIELD_NUMBER = 5;
    public static final int BACKGROUND_HEX_COLOR_FIELD_NUMBER = 6;
    public static final int BODY_FIELD_NUMBER = 2;
    /* access modifiers changed from: private */
    public static final C9537f0 DEFAULT_INSTANCE;
    public static final int IMAGE_URL_FIELD_NUMBER = 3;
    private static volatile C7193x0<C9537f0> PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 1;
    private C9521b0 actionButton_;
    private C9575z action_;
    private String backgroundHexColor_ = "";
    private C9541g0 body_;
    private String imageUrl_ = "";
    private C9541g0 title_;

    /* renamed from: s7.f0$a */
    /* compiled from: MessagesProto */
    public static final class C9538a extends C7186x.C7187a<C9537f0, C9538a> implements C7159q0 {
        /* synthetic */ C9538a(C9574y yVar) {
            this();
        }

        private C9538a() {
            super(C9537f0.DEFAULT_INSTANCE);
        }
    }

    static {
        C9537f0 f0Var = new C9537f0();
        DEFAULT_INSTANCE = f0Var;
        C7186x.m13874G(C9537f0.class, f0Var);
    }

    private C9537f0() {
    }

    /* renamed from: N */
    public static C9537f0 m19812N() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: J */
    public C9575z mo44022J() {
        C9575z zVar = this.action_;
        if (zVar == null) {
            return C9575z.m19887K();
        }
        return zVar;
    }

    /* renamed from: K */
    public C9521b0 mo44023K() {
        C9521b0 b0Var = this.actionButton_;
        if (b0Var == null) {
            return C9521b0.m19761K();
        }
        return b0Var;
    }

    /* renamed from: L */
    public String mo44024L() {
        return this.backgroundHexColor_;
    }

    /* renamed from: M */
    public C9541g0 mo44025M() {
        C9541g0 g0Var = this.body_;
        if (g0Var == null) {
            return C9541g0.m19826J();
        }
        return g0Var;
    }

    /* renamed from: P */
    public String mo44026P() {
        return this.imageUrl_;
    }

    /* renamed from: R */
    public C9541g0 mo44027R() {
        C9541g0 g0Var = this.title_;
        if (g0Var == null) {
            return C9541g0.m19826J();
        }
        return g0Var;
    }

    /* renamed from: S */
    public boolean mo44028S() {
        if (this.action_ != null) {
            return true;
        }
        return false;
    }

    /* renamed from: T */
    public boolean mo44029T() {
        if (this.body_ != null) {
            return true;
        }
        return false;
    }

    /* renamed from: U */
    public boolean mo44030U() {
        if (this.title_ != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final Object mo29952v(C7186x.C7192f fVar, Object obj, Object obj2) {
        switch (C9574y.f14261a[fVar.ordinal()]) {
            case 1:
                return new C9537f0();
            case 2:
                return new C9538a((C9574y) null);
            case 3:
                return C7186x.m13872E(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\t\u0002\t\u0003Ȉ\u0004\t\u0005\t\u0006Ȉ", new Object[]{"title_", "body_", "imageUrl_", "actionButton_", "action_", "backgroundHexColor_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C7193x0<C9537f0> x0Var = PARSER;
                if (x0Var == null) {
                    synchronized (C9537f0.class) {
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
