package p223s7;

import com.google.protobuf.C7159q0;
import com.google.protobuf.C7186x;
import com.google.protobuf.C7193x0;

/* renamed from: s7.g0 */
/* compiled from: MessagesProto */
public final class C9541g0 extends C7186x<C9541g0, C9542a> implements C7159q0 {
    /* access modifiers changed from: private */
    public static final C9541g0 DEFAULT_INSTANCE;
    public static final int HEX_COLOR_FIELD_NUMBER = 2;
    private static volatile C7193x0<C9541g0> PARSER = null;
    public static final int TEXT_FIELD_NUMBER = 1;
    private String hexColor_ = "";
    private String text_ = "";

    /* renamed from: s7.g0$a */
    /* compiled from: MessagesProto */
    public static final class C9542a extends C7186x.C7187a<C9541g0, C9542a> implements C7159q0 {
        /* synthetic */ C9542a(C9574y yVar) {
            this();
        }

        private C9542a() {
            super(C9541g0.DEFAULT_INSTANCE);
        }
    }

    static {
        C9541g0 g0Var = new C9541g0();
        DEFAULT_INSTANCE = g0Var;
        C7186x.m13874G(C9541g0.class, g0Var);
    }

    private C9541g0() {
    }

    /* renamed from: J */
    public static C9541g0 m19826J() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: K */
    public String mo44031K() {
        return this.hexColor_;
    }

    /* renamed from: L */
    public String mo44032L() {
        return this.text_;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final Object mo29952v(C7186x.C7192f fVar, Object obj, Object obj2) {
        switch (C9574y.f14261a[fVar.ordinal()]) {
            case 1:
                return new C9541g0();
            case 2:
                return new C9542a((C9574y) null);
            case 3:
                return C7186x.m13872E(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"text_", "hexColor_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C7193x0<C9541g0> x0Var = PARSER;
                if (x0Var == null) {
                    synchronized (C9541g0.class) {
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
