package p268w8;

import com.google.protobuf.C7056a;
import com.google.protobuf.C7159q0;
import com.google.protobuf.C7186x;
import com.google.protobuf.C7193x0;
import com.google.protobuf.C7196z;
import p162m6.C8829b;

/* renamed from: w8.d */
/* compiled from: FetchEligibleCampaignsRequest */
public final class C10143d extends C7186x<C10143d, C10145b> implements C7159q0 {
    public static final int ALREADY_SEEN_CAMPAIGNS_FIELD_NUMBER = 3;
    public static final int CLIENT_SIGNALS_FIELD_NUMBER = 4;
    /* access modifiers changed from: private */
    public static final C10143d DEFAULT_INSTANCE;
    private static volatile C7193x0<C10143d> PARSER = null;
    public static final int PROJECT_NUMBER_FIELD_NUMBER = 1;
    public static final int REQUESTING_CLIENT_APP_FIELD_NUMBER = 2;
    private C7196z.C7205i<C10134a> alreadySeenCampaigns_ = C7186x.m13875w();
    private C8829b clientSignals_;
    private String projectNumber_ = "";
    private C10140c requestingClientApp_;

    /* renamed from: w8.d$a */
    /* compiled from: FetchEligibleCampaignsRequest */
    static /* synthetic */ class C10144a {

        /* renamed from: a */
        static final /* synthetic */ int[] f15331a;

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
                f15331a = r0
                com.google.protobuf.x$f r1 = com.google.protobuf.C7186x.C7192f.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f15331a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.x$f r1 = com.google.protobuf.C7186x.C7192f.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f15331a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.x$f r1 = com.google.protobuf.C7186x.C7192f.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f15331a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.x$f r1 = com.google.protobuf.C7186x.C7192f.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f15331a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.x$f r1 = com.google.protobuf.C7186x.C7192f.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f15331a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.x$f r1 = com.google.protobuf.C7186x.C7192f.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f15331a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.x$f r1 = com.google.protobuf.C7186x.C7192f.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p268w8.C10143d.C10144a.<clinit>():void");
        }
    }

    /* renamed from: w8.d$b */
    /* compiled from: FetchEligibleCampaignsRequest */
    public static final class C10145b extends C7186x.C7187a<C10143d, C10145b> implements C7159q0 {
        /* synthetic */ C10145b(C10144a aVar) {
            this();
        }

        /* renamed from: B */
        public C10145b mo44738B(C8829b bVar) {
            mo40696t();
            ((C10143d) this.f9839c).m21369T(bVar);
            return this;
        }

        /* renamed from: C */
        public C10145b mo44739C(String str) {
            mo40696t();
            ((C10143d) this.f9839c).m21370U(str);
            return this;
        }

        /* renamed from: D */
        public C10145b mo44740D(C10140c cVar) {
            mo40696t();
            ((C10143d) this.f9839c).m21371V(cVar);
            return this;
        }

        /* renamed from: z */
        public C10145b mo44741z(Iterable<? extends C10134a> iterable) {
            mo40696t();
            ((C10143d) this.f9839c).m21365N(iterable);
            return this;
        }

        private C10145b() {
            super(C10143d.DEFAULT_INSTANCE);
        }
    }

    static {
        C10143d dVar = new C10143d();
        DEFAULT_INSTANCE = dVar;
        C7186x.m13874G(C10143d.class, dVar);
    }

    private C10143d() {
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public void m21365N(Iterable<? extends C10134a> iterable) {
        m21366P();
        C7056a.m12766k(iterable, this.alreadySeenCampaigns_);
    }

    /* renamed from: P */
    private void m21366P() {
        C7196z.C7205i<C10134a> iVar = this.alreadySeenCampaigns_;
        if (!iVar.mo40193D()) {
            this.alreadySeenCampaigns_ = C7186x.m13871C(iVar);
        }
    }

    /* renamed from: R */
    public static C10143d m21367R() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: S */
    public static C10145b m21368S() {
        return (C10145b) DEFAULT_INSTANCE.mo40686r();
    }

    /* access modifiers changed from: private */
    /* renamed from: T */
    public void m21369T(C8829b bVar) {
        bVar.getClass();
        this.clientSignals_ = bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: U */
    public void m21370U(String str) {
        str.getClass();
        this.projectNumber_ = str;
    }

    /* access modifiers changed from: private */
    /* renamed from: V */
    public void m21371V(C10140c cVar) {
        cVar.getClass();
        this.requestingClientApp_ = cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final Object mo29952v(C7186x.C7192f fVar, Object obj, Object obj2) {
        switch (C10144a.f15331a[fVar.ordinal()]) {
            case 1:
                return new C10143d();
            case 2:
                return new C10145b((C10144a) null);
            case 3:
                return C7186x.m13872E(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002\t\u0003\u001b\u0004\t", new Object[]{"projectNumber_", "requestingClientApp_", "alreadySeenCampaigns_", C10134a.class, "clientSignals_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C7193x0<C10143d> x0Var = PARSER;
                if (x0Var == null) {
                    synchronized (C10143d.class) {
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
