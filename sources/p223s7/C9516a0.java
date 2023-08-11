package p223s7;

import com.google.protobuf.C7159q0;
import com.google.protobuf.C7186x;
import com.google.protobuf.C7193x0;

/* renamed from: s7.a0 */
/* compiled from: MessagesProto */
public final class C9516a0 extends C7186x<C9516a0, C9517a> implements C7159q0 {
    public static final int ACTION_FIELD_NUMBER = 4;
    public static final int BACKGROUND_HEX_COLOR_FIELD_NUMBER = 5;
    public static final int BODY_FIELD_NUMBER = 2;
    /* access modifiers changed from: private */
    public static final C9516a0 DEFAULT_INSTANCE;
    public static final int IMAGE_URL_FIELD_NUMBER = 3;
    private static volatile C7193x0<C9516a0> PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 1;
    private C9575z action_;
    private String backgroundHexColor_ = "";
    private C9541g0 body_;
    private String imageUrl_ = "";
    private C9541g0 title_;

    /* renamed from: s7.a0$a */
    /* compiled from: MessagesProto */
    public static final class C9517a extends C7186x.C7187a<C9516a0, C9517a> implements C7159q0 {
        /* synthetic */ C9517a(C9574y yVar) {
            this();
        }

        private C9517a() {
            super(C9516a0.DEFAULT_INSTANCE);
        }
    }

    static {
        C9516a0 a0Var = new C9516a0();
        DEFAULT_INSTANCE = a0Var;
        C7186x.m13874G(C9516a0.class, a0Var);
    }

    private C9516a0() {
    }

    /* renamed from: M */
    public static C9516a0 m19741M() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: J */
    public C9575z mo43983J() {
        C9575z zVar = this.action_;
        if (zVar == null) {
            return C9575z.m19887K();
        }
        return zVar;
    }

    /* renamed from: K */
    public String mo43984K() {
        return this.backgroundHexColor_;
    }

    /* renamed from: L */
    public C9541g0 mo43985L() {
        C9541g0 g0Var = this.body_;
        if (g0Var == null) {
            return C9541g0.m19826J();
        }
        return g0Var;
    }

    /* renamed from: N */
    public String mo43986N() {
        return this.imageUrl_;
    }

    /* renamed from: P */
    public C9541g0 mo43987P() {
        C9541g0 g0Var = this.title_;
        if (g0Var == null) {
            return C9541g0.m19826J();
        }
        return g0Var;
    }

    /* renamed from: R */
    public boolean mo43988R() {
        if (this.action_ != null) {
            return true;
        }
        return false;
    }

    /* renamed from: S */
    public boolean mo43989S() {
        if (this.body_ != null) {
            return true;
        }
        return false;
    }

    /* renamed from: T */
    public boolean mo43990T() {
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
                return new C9516a0();
            case 2:
                return new C9517a((C9574y) null);
            case 3:
                return C7186x.m13872E(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\t\u0002\t\u0003Ȉ\u0004\t\u0005Ȉ", new Object[]{"title_", "body_", "imageUrl_", "action_", "backgroundHexColor_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C7193x0<C9516a0> x0Var = PARSER;
                if (x0Var == null) {
                    synchronized (C9516a0.class) {
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
