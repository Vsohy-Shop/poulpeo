package p257v8;

import com.google.protobuf.C7159q0;
import com.google.protobuf.C7186x;
import com.google.protobuf.C7193x0;
import p223s7.C9557m;

/* renamed from: v8.b */
/* compiled from: CampaignProto */
public final class C10048b extends C7186x<C10048b, C10049a> implements C7159q0 {
    public static final int CAMPAIGN_END_TIME_MILLIS_FIELD_NUMBER = 4;
    public static final int CAMPAIGN_ID_FIELD_NUMBER = 1;
    public static final int CAMPAIGN_NAME_FIELD_NUMBER = 5;
    public static final int CAMPAIGN_START_TIME_MILLIS_FIELD_NUMBER = 3;
    /* access modifiers changed from: private */
    public static final C10048b DEFAULT_INSTANCE;
    public static final int EXPERIMENT_PAYLOAD_FIELD_NUMBER = 2;
    private static volatile C7193x0<C10048b> PARSER;
    private long campaignEndTimeMillis_;
    private String campaignId_ = "";
    private String campaignName_ = "";
    private long campaignStartTimeMillis_;
    private C9557m experimentPayload_;

    /* renamed from: v8.b$a */
    /* compiled from: CampaignProto */
    public static final class C10049a extends C7186x.C7187a<C10048b, C10049a> implements C7159q0 {
        /* synthetic */ C10049a(C10047a aVar) {
            this();
        }

        private C10049a() {
            super(C10048b.DEFAULT_INSTANCE);
        }
    }

    static {
        C10048b bVar = new C10048b();
        DEFAULT_INSTANCE = bVar;
        C7186x.m13874G(C10048b.class, bVar);
    }

    private C10048b() {
    }

    /* renamed from: N */
    public static C10048b m21090N() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: J */
    public long mo44622J() {
        return this.campaignEndTimeMillis_;
    }

    /* renamed from: K */
    public String mo44623K() {
        return this.campaignId_;
    }

    /* renamed from: L */
    public String mo44624L() {
        return this.campaignName_;
    }

    /* renamed from: M */
    public long mo44625M() {
        return this.campaignStartTimeMillis_;
    }

    /* renamed from: P */
    public C9557m mo44626P() {
        C9557m mVar = this.experimentPayload_;
        if (mVar == null) {
            return C9557m.m19855J();
        }
        return mVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final Object mo29952v(C7186x.C7192f fVar, Object obj, Object obj2) {
        switch (C10047a.f15199a[fVar.ordinal()]) {
            case 1:
                return new C10048b();
            case 2:
                return new C10049a((C10047a) null);
            case 3:
                return C7186x.m13872E(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002\t\u0003\u0002\u0004\u0002\u0005Ȉ", new Object[]{"campaignId_", "experimentPayload_", "campaignStartTimeMillis_", "campaignEndTimeMillis_", "campaignName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C7193x0<C10048b> x0Var = PARSER;
                if (x0Var == null) {
                    synchronized (C10048b.class) {
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
