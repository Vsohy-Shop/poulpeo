package p257v8;

import com.google.protobuf.C7159q0;
import com.google.protobuf.C7186x;
import com.google.protobuf.C7193x0;

/* renamed from: v8.d */
/* compiled from: CampaignProto */
public final class C10054d extends C7186x<C10054d, C10055a> implements C7159q0 {
    public static final int CAMPAIGN_END_TIME_MILLIS_FIELD_NUMBER = 4;
    public static final int CAMPAIGN_ID_FIELD_NUMBER = 1;
    public static final int CAMPAIGN_NAME_FIELD_NUMBER = 5;
    public static final int CAMPAIGN_START_TIME_MILLIS_FIELD_NUMBER = 3;
    /* access modifiers changed from: private */
    public static final C10054d DEFAULT_INSTANCE;
    public static final int EXPERIMENTAL_CAMPAIGN_ID_FIELD_NUMBER = 2;
    private static volatile C7193x0<C10054d> PARSER;
    private long campaignEndTimeMillis_;
    private String campaignId_ = "";
    private String campaignName_ = "";
    private long campaignStartTimeMillis_;
    private String experimentalCampaignId_ = "";

    /* renamed from: v8.d$a */
    /* compiled from: CampaignProto */
    public static final class C10055a extends C7186x.C7187a<C10054d, C10055a> implements C7159q0 {
        /* synthetic */ C10055a(C10047a aVar) {
            this();
        }

        private C10055a() {
            super(C10054d.DEFAULT_INSTANCE);
        }
    }

    static {
        C10054d dVar = new C10054d();
        DEFAULT_INSTANCE = dVar;
        C7186x.m13874G(C10054d.class, dVar);
    }

    private C10054d() {
    }

    /* renamed from: N */
    public static C10054d m21110N() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: J */
    public long mo44635J() {
        return this.campaignEndTimeMillis_;
    }

    /* renamed from: K */
    public String mo44636K() {
        return this.campaignId_;
    }

    /* renamed from: L */
    public String mo44637L() {
        return this.campaignName_;
    }

    /* renamed from: M */
    public long mo44638M() {
        return this.campaignStartTimeMillis_;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final Object mo29952v(C7186x.C7192f fVar, Object obj, Object obj2) {
        switch (C10047a.f15199a[fVar.ordinal()]) {
            case 1:
                return new C10054d();
            case 2:
                return new C10055a((C10047a) null);
            case 3:
                return C7186x.m13872E(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0002\u0004\u0002\u0005Ȉ", new Object[]{"campaignId_", "experimentalCampaignId_", "campaignStartTimeMillis_", "campaignEndTimeMillis_", "campaignName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C7193x0<C10054d> x0Var = PARSER;
                if (x0Var == null) {
                    synchronized (C10054d.class) {
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
