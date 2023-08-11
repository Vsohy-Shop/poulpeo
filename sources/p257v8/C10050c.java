package p257v8;

import com.google.protobuf.C7115i0;
import com.google.protobuf.C7120j0;
import com.google.protobuf.C7159q0;
import com.google.protobuf.C7160q1;
import com.google.protobuf.C7186x;
import com.google.protobuf.C7193x0;
import com.google.protobuf.C7196z;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p223s7.C9528d0;
import p223s7.C9531e;
import p223s7.C9543h;

/* renamed from: v8.c */
/* compiled from: CampaignProto */
public final class C10050c extends C7186x<C10050c, C10051a> implements C7159q0 {
    public static final int CONTENT_FIELD_NUMBER = 3;
    public static final int DATA_BUNDLE_FIELD_NUMBER = 8;
    /* access modifiers changed from: private */
    public static final C10050c DEFAULT_INSTANCE;
    public static final int EXPERIMENTAL_PAYLOAD_FIELD_NUMBER = 2;
    public static final int IS_TEST_CAMPAIGN_FIELD_NUMBER = 7;
    private static volatile C7193x0<C10050c> PARSER = null;
    public static final int PRIORITY_FIELD_NUMBER = 4;
    public static final int TRIGGERING_CONDITIONS_FIELD_NUMBER = 5;
    public static final int VANILLA_PAYLOAD_FIELD_NUMBER = 1;
    private C9528d0 content_;
    private C7120j0<String, String> dataBundle_ = C7120j0.m13319e();
    private boolean isTestCampaign_;
    private int payloadCase_ = 0;
    private Object payload_;
    private C9531e priority_;
    private C7196z.C7205i<C9543h> triggeringConditions_ = C7186x.m13875w();

    /* renamed from: v8.c$a */
    /* compiled from: CampaignProto */
    public static final class C10051a extends C7186x.C7187a<C10050c, C10051a> implements C7159q0 {
        /* synthetic */ C10051a(C10047a aVar) {
            this();
        }

        private C10051a() {
            super(C10050c.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: v8.c$b */
    /* compiled from: CampaignProto */
    private static final class C10052b {

        /* renamed from: a */
        static final C7115i0<String, String> f15200a;

        static {
            C7160q1.C7162b bVar = C7160q1.C7162b.STRING;
            f15200a = C7115i0.m13257d(bVar, "", bVar, "");
        }
    }

    /* renamed from: v8.c$c */
    /* compiled from: CampaignProto */
    public enum C10053c {
        VANILLA_PAYLOAD(1),
        EXPERIMENTAL_PAYLOAD(2),
        PAYLOAD_NOT_SET(0);
        

        /* renamed from: b */
        private final int f15205b;

        private C10053c(int i) {
            this.f15205b = i;
        }

        /* renamed from: a */
        public static C10053c m21108a(int i) {
            if (i == 0) {
                return PAYLOAD_NOT_SET;
            }
            if (i == 1) {
                return VANILLA_PAYLOAD;
            }
            if (i != 2) {
                return null;
            }
            return EXPERIMENTAL_PAYLOAD;
        }
    }

    static {
        C10050c cVar = new C10050c();
        DEFAULT_INSTANCE = cVar;
        C7186x.m13874G(C10050c.class, cVar);
    }

    private C10050c() {
    }

    /* renamed from: T */
    private C7120j0<String, String> m21098T() {
        return this.dataBundle_;
    }

    /* renamed from: J */
    public C9528d0 mo44627J() {
        C9528d0 d0Var = this.content_;
        if (d0Var == null) {
            return C9528d0.m19789L();
        }
        return d0Var;
    }

    /* renamed from: K */
    public Map<String, String> mo44628K() {
        return Collections.unmodifiableMap(m21098T());
    }

    /* renamed from: L */
    public C10048b mo44629L() {
        if (this.payloadCase_ == 2) {
            return (C10048b) this.payload_;
        }
        return C10048b.m21090N();
    }

    /* renamed from: M */
    public boolean mo44630M() {
        return this.isTestCampaign_;
    }

    /* renamed from: N */
    public C10053c mo44631N() {
        return C10053c.m21108a(this.payloadCase_);
    }

    /* renamed from: P */
    public C9531e mo44632P() {
        C9531e eVar = this.priority_;
        if (eVar == null) {
            return C9531e.m19798J();
        }
        return eVar;
    }

    /* renamed from: R */
    public List<C9543h> mo44633R() {
        return this.triggeringConditions_;
    }

    /* renamed from: S */
    public C10054d mo44634S() {
        if (this.payloadCase_ == 1) {
            return (C10054d) this.payload_;
        }
        return C10054d.m21110N();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final Object mo29952v(C7186x.C7192f fVar, Object obj, Object obj2) {
        switch (C10047a.f15199a[fVar.ordinal()]) {
            case 1:
                return new C10050c();
            case 2:
                return new C10051a((C10047a) null);
            case 3:
                return C7186x.m13872E(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0000\u0001\b\u0007\u0001\u0001\u0000\u0001<\u0000\u0002<\u0000\u0003\t\u0004\t\u0005\u001b\u0007\u0007\b2", new Object[]{"payload_", "payloadCase_", C10054d.class, C10048b.class, "content_", "priority_", "triggeringConditions_", C9543h.class, "isTestCampaign_", "dataBundle_", C10052b.f15200a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C7193x0<C10050c> x0Var = PARSER;
                if (x0Var == null) {
                    synchronized (C10050c.class) {
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
