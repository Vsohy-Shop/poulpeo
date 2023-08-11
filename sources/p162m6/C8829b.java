package p162m6;

import com.google.protobuf.C7159q0;
import com.google.protobuf.C7186x;
import com.google.protobuf.C7193x0;

/* renamed from: m6.b */
/* compiled from: ClientSignalsProto */
public final class C8829b extends C7186x<C8829b, C8830a> implements C7159q0 {
    public static final int APP_VERSION_FIELD_NUMBER = 1;
    /* access modifiers changed from: private */
    public static final C8829b DEFAULT_INSTANCE;
    public static final int LANGUAGE_CODE_FIELD_NUMBER = 3;
    private static volatile C7193x0<C8829b> PARSER = null;
    public static final int PLATFORM_VERSION_FIELD_NUMBER = 2;
    public static final int TIME_ZONE_FIELD_NUMBER = 4;
    private String appVersion_ = "";
    private String languageCode_ = "";
    private String platformVersion_ = "";
    private String timeZone_ = "";

    /* renamed from: m6.b$a */
    /* compiled from: ClientSignalsProto */
    public static final class C8830a extends C7186x.C7187a<C8829b, C8830a> implements C7159q0 {
        /* synthetic */ C8830a(C8828a aVar) {
            this();
        }

        /* renamed from: B */
        public C8830a mo42964B(String str) {
            mo40696t();
            ((C8829b) this.f9839c).m17898R(str);
            return this;
        }

        /* renamed from: C */
        public C8830a mo42965C(String str) {
            mo40696t();
            ((C8829b) this.f9839c).m17899S(str);
            return this;
        }

        /* renamed from: D */
        public C8830a mo42966D(String str) {
            mo40696t();
            ((C8829b) this.f9839c).m17900T(str);
            return this;
        }

        /* renamed from: z */
        public C8830a mo42967z(String str) {
            mo40696t();
            ((C8829b) this.f9839c).m17897P(str);
            return this;
        }

        private C8830a() {
            super(C8829b.DEFAULT_INSTANCE);
        }
    }

    static {
        C8829b bVar = new C8829b();
        DEFAULT_INSTANCE = bVar;
        C7186x.m13874G(C8829b.class, bVar);
    }

    private C8829b() {
    }

    /* renamed from: N */
    public static C8830a m17896N() {
        return (C8830a) DEFAULT_INSTANCE.mo40686r();
    }

    /* access modifiers changed from: private */
    /* renamed from: P */
    public void m17897P(String str) {
        str.getClass();
        this.appVersion_ = str;
    }

    /* access modifiers changed from: private */
    /* renamed from: R */
    public void m17898R(String str) {
        str.getClass();
        this.languageCode_ = str;
    }

    /* access modifiers changed from: private */
    /* renamed from: S */
    public void m17899S(String str) {
        str.getClass();
        this.platformVersion_ = str;
    }

    /* access modifiers changed from: private */
    /* renamed from: T */
    public void m17900T(String str) {
        str.getClass();
        this.timeZone_ = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final Object mo29952v(C7186x.C7192f fVar, Object obj, Object obj2) {
        switch (C8828a.f12803a[fVar.ordinal()]) {
            case 1:
                return new C8829b();
            case 2:
                return new C8830a((C8828a) null);
            case 3:
                return C7186x.m13872E(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"appVersion_", "platformVersion_", "languageCode_", "timeZone_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C7193x0<C8829b> x0Var = PARSER;
                if (x0Var == null) {
                    synchronized (C8829b.class) {
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
