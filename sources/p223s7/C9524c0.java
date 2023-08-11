package p223s7;

import com.google.protobuf.C7159q0;
import com.google.protobuf.C7186x;
import com.google.protobuf.C7193x0;

/* renamed from: s7.c0 */
/* compiled from: MessagesProto */
public final class C9524c0 extends C7186x<C9524c0, C9525a> implements C7159q0 {
    public static final int BACKGROUND_HEX_COLOR_FIELD_NUMBER = 5;
    public static final int BODY_FIELD_NUMBER = 2;
    /* access modifiers changed from: private */
    public static final C9524c0 DEFAULT_INSTANCE;
    public static final int LANDSCAPE_IMAGE_URL_FIELD_NUMBER = 4;
    private static volatile C7193x0<C9524c0> PARSER = null;
    public static final int PORTRAIT_IMAGE_URL_FIELD_NUMBER = 3;
    public static final int PRIMARY_ACTION_BUTTON_FIELD_NUMBER = 6;
    public static final int PRIMARY_ACTION_FIELD_NUMBER = 7;
    public static final int SECONDARY_ACTION_BUTTON_FIELD_NUMBER = 8;
    public static final int SECONDARY_ACTION_FIELD_NUMBER = 9;
    public static final int TITLE_FIELD_NUMBER = 1;
    private String backgroundHexColor_ = "";
    private C9541g0 body_;
    private String landscapeImageUrl_ = "";
    private String portraitImageUrl_ = "";
    private C9521b0 primaryActionButton_;
    private C9575z primaryAction_;
    private C9521b0 secondaryActionButton_;
    private C9575z secondaryAction_;
    private C9541g0 title_;

    /* renamed from: s7.c0$a */
    /* compiled from: MessagesProto */
    public static final class C9525a extends C7186x.C7187a<C9524c0, C9525a> implements C7159q0 {
        /* synthetic */ C9525a(C9574y yVar) {
            this();
        }

        private C9525a() {
            super(C9524c0.DEFAULT_INSTANCE);
        }
    }

    static {
        C9524c0 c0Var = new C9524c0();
        DEFAULT_INSTANCE = c0Var;
        C7186x.m13874G(C9524c0.class, c0Var);
    }

    private C9524c0() {
    }

    /* renamed from: L */
    public static C9524c0 m19767L() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: J */
    public String mo43996J() {
        return this.backgroundHexColor_;
    }

    /* renamed from: K */
    public C9541g0 mo43997K() {
        C9541g0 g0Var = this.body_;
        if (g0Var == null) {
            return C9541g0.m19826J();
        }
        return g0Var;
    }

    /* renamed from: M */
    public String mo43998M() {
        return this.landscapeImageUrl_;
    }

    /* renamed from: N */
    public String mo43999N() {
        return this.portraitImageUrl_;
    }

    /* renamed from: P */
    public C9575z mo44000P() {
        C9575z zVar = this.primaryAction_;
        if (zVar == null) {
            return C9575z.m19887K();
        }
        return zVar;
    }

    /* renamed from: R */
    public C9521b0 mo44001R() {
        C9521b0 b0Var = this.primaryActionButton_;
        if (b0Var == null) {
            return C9521b0.m19761K();
        }
        return b0Var;
    }

    /* renamed from: S */
    public C9575z mo44002S() {
        C9575z zVar = this.secondaryAction_;
        if (zVar == null) {
            return C9575z.m19887K();
        }
        return zVar;
    }

    /* renamed from: T */
    public C9521b0 mo44003T() {
        C9521b0 b0Var = this.secondaryActionButton_;
        if (b0Var == null) {
            return C9521b0.m19761K();
        }
        return b0Var;
    }

    /* renamed from: U */
    public C9541g0 mo44004U() {
        C9541g0 g0Var = this.title_;
        if (g0Var == null) {
            return C9541g0.m19826J();
        }
        return g0Var;
    }

    /* renamed from: V */
    public boolean mo44005V() {
        if (this.body_ != null) {
            return true;
        }
        return false;
    }

    /* renamed from: W */
    public boolean mo44006W() {
        if (this.primaryAction_ != null) {
            return true;
        }
        return false;
    }

    /* renamed from: X */
    public boolean mo44007X() {
        if (this.primaryActionButton_ != null) {
            return true;
        }
        return false;
    }

    /* renamed from: Y */
    public boolean mo44008Y() {
        if (this.secondaryAction_ != null) {
            return true;
        }
        return false;
    }

    /* renamed from: Z */
    public boolean mo44009Z() {
        if (this.secondaryActionButton_ != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a0 */
    public boolean mo44010a0() {
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
                return new C9524c0();
            case 2:
                return new C9525a((C9574y) null);
            case 3:
                return C7186x.m13872E(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0000\u0000\u0001\t\u0002\t\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006\t\u0007\t\b\t\t\t", new Object[]{"title_", "body_", "portraitImageUrl_", "landscapeImageUrl_", "backgroundHexColor_", "primaryActionButton_", "primaryAction_", "secondaryActionButton_", "secondaryAction_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C7193x0<C9524c0> x0Var = PARSER;
                if (x0Var == null) {
                    synchronized (C9524c0.class) {
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
