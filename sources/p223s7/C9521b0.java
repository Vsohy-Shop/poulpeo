package p223s7;

import com.google.protobuf.C7159q0;
import com.google.protobuf.C7186x;
import com.google.protobuf.C7193x0;

/* renamed from: s7.b0 */
/* compiled from: MessagesProto */
public final class C9521b0 extends C7186x<C9521b0, C9522a> implements C7159q0 {
    public static final int BUTTON_HEX_COLOR_FIELD_NUMBER = 2;
    /* access modifiers changed from: private */
    public static final C9521b0 DEFAULT_INSTANCE;
    private static volatile C7193x0<C9521b0> PARSER = null;
    public static final int TEXT_FIELD_NUMBER = 1;
    private String buttonHexColor_ = "";
    private C9541g0 text_;

    /* renamed from: s7.b0$a */
    /* compiled from: MessagesProto */
    public static final class C9522a extends C7186x.C7187a<C9521b0, C9522a> implements C7159q0 {
        /* synthetic */ C9522a(C9574y yVar) {
            this();
        }

        private C9522a() {
            super(C9521b0.DEFAULT_INSTANCE);
        }
    }

    static {
        C9521b0 b0Var = new C9521b0();
        DEFAULT_INSTANCE = b0Var;
        C7186x.m13874G(C9521b0.class, b0Var);
    }

    private C9521b0() {
    }

    /* renamed from: K */
    public static C9521b0 m19761K() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: J */
    public String mo43993J() {
        return this.buttonHexColor_;
    }

    /* renamed from: L */
    public C9541g0 mo43994L() {
        C9541g0 g0Var = this.text_;
        if (g0Var == null) {
            return C9541g0.m19826J();
        }
        return g0Var;
    }

    /* renamed from: M */
    public boolean mo43995M() {
        if (this.text_ != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final Object mo29952v(C7186x.C7192f fVar, Object obj, Object obj2) {
        switch (C9574y.f14261a[fVar.ordinal()]) {
            case 1:
                return new C9521b0();
            case 2:
                return new C9522a((C9574y) null);
            case 3:
                return C7186x.m13872E(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002Ȉ", new Object[]{"text_", "buttonHexColor_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C7193x0<C9521b0> x0Var = PARSER;
                if (x0Var == null) {
                    synchronized (C9521b0.class) {
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
