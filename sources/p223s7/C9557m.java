package p223s7;

import com.google.protobuf.C7159q0;
import com.google.protobuf.C7186x;
import com.google.protobuf.C7193x0;
import com.google.protobuf.C7196z;

/* renamed from: s7.m */
/* compiled from: ExperimentPayloadProto */
public final class C9557m extends C7186x<C9557m, C9558a> implements C7159q0 {
    public static final int ACTIVATE_EVENT_TO_LOG_FIELD_NUMBER = 8;
    public static final int CLEAR_EVENT_TO_LOG_FIELD_NUMBER = 9;
    /* access modifiers changed from: private */
    public static final C9557m DEFAULT_INSTANCE;
    public static final int EXPERIMENT_ID_FIELD_NUMBER = 1;
    public static final int EXPERIMENT_START_TIME_MILLIS_FIELD_NUMBER = 3;
    public static final int ONGOING_EXPERIMENTS_FIELD_NUMBER = 13;
    public static final int OVERFLOW_POLICY_FIELD_NUMBER = 12;
    private static volatile C7193x0<C9557m> PARSER = null;
    public static final int SET_EVENT_TO_LOG_FIELD_NUMBER = 7;
    public static final int TIMEOUT_EVENT_TO_LOG_FIELD_NUMBER = 10;
    public static final int TIME_TO_LIVE_MILLIS_FIELD_NUMBER = 6;
    public static final int TRIGGER_EVENT_FIELD_NUMBER = 4;
    public static final int TRIGGER_TIMEOUT_MILLIS_FIELD_NUMBER = 5;
    public static final int TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER = 11;
    public static final int VARIANT_ID_FIELD_NUMBER = 2;
    private String activateEventToLog_ = "";
    private String clearEventToLog_ = "";
    private String experimentId_ = "";
    private long experimentStartTimeMillis_;
    private C7196z.C7205i<C9555l> ongoingExperiments_ = C7186x.m13875w();
    private int overflowPolicy_;
    private String setEventToLog_ = "";
    private long timeToLiveMillis_;
    private String timeoutEventToLog_ = "";
    private String triggerEvent_ = "";
    private long triggerTimeoutMillis_;
    private String ttlExpiryEventToLog_ = "";
    private String variantId_ = "";

    /* renamed from: s7.m$a */
    /* compiled from: ExperimentPayloadProto */
    public static final class C9558a extends C7186x.C7187a<C9557m, C9558a> implements C7159q0 {
        /* synthetic */ C9558a(C9554k kVar) {
            this();
        }

        private C9558a() {
            super(C9557m.DEFAULT_INSTANCE);
        }
    }

    static {
        C9557m mVar = new C9557m();
        DEFAULT_INSTANCE = mVar;
        C7186x.m13874G(C9557m.class, mVar);
    }

    private C9557m() {
    }

    /* renamed from: J */
    public static C9557m m19855J() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: K */
    public String mo44038K() {
        return this.experimentId_;
    }

    /* renamed from: L */
    public long mo44039L() {
        return this.experimentStartTimeMillis_;
    }

    /* renamed from: M */
    public long mo44040M() {
        return this.timeToLiveMillis_;
    }

    /* renamed from: N */
    public String mo44041N() {
        return this.triggerEvent_;
    }

    /* renamed from: P */
    public long mo44042P() {
        return this.triggerTimeoutMillis_;
    }

    /* renamed from: R */
    public String mo44043R() {
        return this.variantId_;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final Object mo29952v(C7186x.C7192f fVar, Object obj, Object obj2) {
        switch (C9554k.f14226a[fVar.ordinal()]) {
            case 1:
                return new C9557m();
            case 2:
                return new C9558a((C9554k) null);
            case 3:
                return C7186x.m13872E(DEFAULT_INSTANCE, "\u0000\r\u0000\u0000\u0001\r\r\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u0002\u0004Ȉ\u0005\u0002\u0006\u0002\u0007Ȉ\bȈ\tȈ\nȈ\u000bȈ\f\f\r\u001b", new Object[]{"experimentId_", "variantId_", "experimentStartTimeMillis_", "triggerEvent_", "triggerTimeoutMillis_", "timeToLiveMillis_", "setEventToLog_", "activateEventToLog_", "clearEventToLog_", "timeoutEventToLog_", "ttlExpiryEventToLog_", "overflowPolicy_", "ongoingExperiments_", C9555l.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C7193x0<C9557m> x0Var = PARSER;
                if (x0Var == null) {
                    synchronized (C9557m.class) {
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
