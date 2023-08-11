package p223s7;

import com.google.protobuf.C7159q0;
import com.google.protobuf.C7186x;
import com.google.protobuf.C7193x0;
import p223s7.C9518b;

/* renamed from: s7.a */
/* compiled from: CampaignAnalytics */
public final class C9513a extends C7186x<C9513a, C9515b> implements C7159q0 {
    public static final int CAMPAIGN_ID_FIELD_NUMBER = 2;
    public static final int CLIENT_APP_FIELD_NUMBER = 3;
    public static final int CLIENT_TIMESTAMP_MILLIS_FIELD_NUMBER = 4;
    /* access modifiers changed from: private */
    public static final C9513a DEFAULT_INSTANCE;
    public static final int DISMISS_TYPE_FIELD_NUMBER = 6;
    public static final int ENGAGEMENTMETRICS_DELIVERY_RETRY_COUNT_FIELD_NUMBER = 10;
    public static final int EVENT_TYPE_FIELD_NUMBER = 5;
    public static final int FETCH_ERROR_REASON_FIELD_NUMBER = 8;
    public static final int FIAM_SDK_VERSION_FIELD_NUMBER = 9;
    private static volatile C7193x0<C9513a> PARSER = null;
    public static final int PROJECT_NUMBER_FIELD_NUMBER = 1;
    public static final int RENDER_ERROR_REASON_FIELD_NUMBER = 7;
    private int bitField0_;
    private String campaignId_ = "";
    private C9518b clientApp_;
    private long clientTimestampMillis_;
    private int engagementMetricsDeliveryRetryCount_;
    private int eventCase_ = 0;
    private Object event_;
    private String fiamSdkVersion_ = "";
    private String projectNumber_ = "";

    /* renamed from: s7.a$a */
    /* compiled from: CampaignAnalytics */
    static /* synthetic */ class C9514a {

        /* renamed from: a */
        static final /* synthetic */ int[] f14186a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.protobuf.x$f[] r0 = com.google.protobuf.C7186x.C7192f.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f14186a = r0
                com.google.protobuf.x$f r1 = com.google.protobuf.C7186x.C7192f.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f14186a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.x$f r1 = com.google.protobuf.C7186x.C7192f.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f14186a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.x$f r1 = com.google.protobuf.C7186x.C7192f.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f14186a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.x$f r1 = com.google.protobuf.C7186x.C7192f.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f14186a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.x$f r1 = com.google.protobuf.C7186x.C7192f.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f14186a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.x$f r1 = com.google.protobuf.C7186x.C7192f.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f14186a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.x$f r1 = com.google.protobuf.C7186x.C7192f.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p223s7.C9513a.C9514a.<clinit>():void");
        }
    }

    /* renamed from: s7.a$b */
    /* compiled from: CampaignAnalytics */
    public static final class C9515b extends C7186x.C7187a<C9513a, C9515b> implements C7159q0 {
        /* synthetic */ C9515b(C9514a aVar) {
            this();
        }

        /* renamed from: B */
        public C9515b mo43975B(C9518b.C9520b bVar) {
            mo40696t();
            ((C9513a) this.f9839c).m19724V((C9518b) bVar.build());
            return this;
        }

        /* renamed from: C */
        public C9515b mo43976C(long j) {
            mo40696t();
            ((C9513a) this.f9839c).m19725W(j);
            return this;
        }

        /* renamed from: D */
        public C9515b mo43977D(C9548i iVar) {
            mo40696t();
            ((C9513a) this.f9839c).m19726X(iVar);
            return this;
        }

        /* renamed from: E */
        public C9515b mo43978E(C9551j jVar) {
            mo40696t();
            ((C9513a) this.f9839c).m19727Y(jVar);
            return this;
        }

        /* renamed from: F */
        public C9515b mo43979F(String str) {
            mo40696t();
            ((C9513a) this.f9839c).m19728Z(str);
            return this;
        }

        /* renamed from: H */
        public C9515b mo43980H(String str) {
            mo40696t();
            ((C9513a) this.f9839c).m19729a0(str);
            return this;
        }

        /* renamed from: I */
        public C9515b mo43981I(C9545h0 h0Var) {
            mo40696t();
            ((C9513a) this.f9839c).m19730b0(h0Var);
            return this;
        }

        /* renamed from: z */
        public C9515b mo43982z(String str) {
            mo40696t();
            ((C9513a) this.f9839c).m19723U(str);
            return this;
        }

        private C9515b() {
            super(C9513a.DEFAULT_INSTANCE);
        }
    }

    static {
        C9513a aVar = new C9513a();
        DEFAULT_INSTANCE = aVar;
        C7186x.m13874G(C9513a.class, aVar);
    }

    private C9513a() {
    }

    /* renamed from: T */
    public static C9515b m19722T() {
        return (C9515b) DEFAULT_INSTANCE.mo40686r();
    }

    /* access modifiers changed from: private */
    /* renamed from: U */
    public void m19723U(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.campaignId_ = str;
    }

    /* access modifiers changed from: private */
    /* renamed from: V */
    public void m19724V(C9518b bVar) {
        bVar.getClass();
        this.clientApp_ = bVar;
        this.bitField0_ |= 4;
    }

    /* access modifiers changed from: private */
    /* renamed from: W */
    public void m19725W(long j) {
        this.bitField0_ |= 8;
        this.clientTimestampMillis_ = j;
    }

    /* access modifiers changed from: private */
    /* renamed from: X */
    public void m19726X(C9548i iVar) {
        this.event_ = Integer.valueOf(iVar.mo40727y());
        this.eventCase_ = 6;
    }

    /* access modifiers changed from: private */
    /* renamed from: Y */
    public void m19727Y(C9551j jVar) {
        this.event_ = Integer.valueOf(jVar.mo40727y());
        this.eventCase_ = 5;
    }

    /* access modifiers changed from: private */
    /* renamed from: Z */
    public void m19728Z(String str) {
        str.getClass();
        this.bitField0_ |= 256;
        this.fiamSdkVersion_ = str;
    }

    /* access modifiers changed from: private */
    /* renamed from: a0 */
    public void m19729a0(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.projectNumber_ = str;
    }

    /* access modifiers changed from: private */
    /* renamed from: b0 */
    public void m19730b0(C9545h0 h0Var) {
        this.event_ = Integer.valueOf(h0Var.mo40727y());
        this.eventCase_ = 7;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final Object mo29952v(C7186x.C7192f fVar, Object obj, Object obj2) {
        switch (C9514a.f14186a[fVar.ordinal()]) {
            case 1:
                return new C9513a();
            case 2:
                return new C9515b((C9514a) null);
            case 3:
                return C7186x.m13872E(DEFAULT_INSTANCE, "\u0001\n\u0001\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဂ\u0003\u0005ဿ\u0000\u0006ဿ\u0000\u0007ဿ\u0000\bဿ\u0000\tဈ\b\nင\t", new Object[]{"event_", "eventCase_", "bitField0_", "projectNumber_", "campaignId_", "clientApp_", "clientTimestampMillis_", C9551j.m19847b(), C9548i.m19841b(), C9545h0.m19835b(), C9559n.m19864b(), "fiamSdkVersion_", "engagementMetricsDeliveryRetryCount_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C7193x0<C9513a> x0Var = PARSER;
                if (x0Var == null) {
                    synchronized (C9513a.class) {
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
