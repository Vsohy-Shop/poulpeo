package p268w8;

import com.google.protobuf.C7159q0;
import com.google.protobuf.C7186x;
import com.google.protobuf.C7193x0;
import com.google.protobuf.C7196z;
import java.util.List;
import p257v8.C10050c;

/* renamed from: w8.e */
/* compiled from: FetchEligibleCampaignsResponse */
public final class C10146e extends C7186x<C10146e, C10148b> implements C7159q0 {
    /* access modifiers changed from: private */
    public static final C10146e DEFAULT_INSTANCE;
    public static final int EXPIRATION_EPOCH_TIMESTAMP_MILLIS_FIELD_NUMBER = 2;
    public static final int MESSAGES_FIELD_NUMBER = 1;
    private static volatile C7193x0<C10146e> PARSER;
    private long expirationEpochTimestampMillis_;
    private C7196z.C7205i<C10050c> messages_ = C7186x.m13875w();

    /* renamed from: w8.e$a */
    /* compiled from: FetchEligibleCampaignsResponse */
    static /* synthetic */ class C10147a {

        /* renamed from: a */
        static final /* synthetic */ int[] f15332a;

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
                f15332a = r0
                com.google.protobuf.x$f r1 = com.google.protobuf.C7186x.C7192f.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f15332a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.x$f r1 = com.google.protobuf.C7186x.C7192f.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f15332a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.x$f r1 = com.google.protobuf.C7186x.C7192f.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f15332a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.x$f r1 = com.google.protobuf.C7186x.C7192f.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f15332a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.x$f r1 = com.google.protobuf.C7186x.C7192f.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f15332a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.x$f r1 = com.google.protobuf.C7186x.C7192f.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f15332a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.x$f r1 = com.google.protobuf.C7186x.C7192f.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p268w8.C10146e.C10147a.<clinit>():void");
        }
    }

    /* renamed from: w8.e$b */
    /* compiled from: FetchEligibleCampaignsResponse */
    public static final class C10148b extends C7186x.C7187a<C10146e, C10148b> implements C7159q0 {
        /* synthetic */ C10148b(C10147a aVar) {
            this();
        }

        /* renamed from: z */
        public C10148b mo44744z(long j) {
            mo40696t();
            ((C10146e) this.f9839c).m21382R(j);
            return this;
        }

        private C10148b() {
            super(C10146e.DEFAULT_INSTANCE);
        }
    }

    static {
        C10146e eVar = new C10146e();
        DEFAULT_INSTANCE = eVar;
        C7186x.m13874G(C10146e.class, eVar);
    }

    private C10146e() {
    }

    /* renamed from: K */
    public static C10146e m21379K() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: N */
    public static C10148b m21380N() {
        return (C10148b) DEFAULT_INSTANCE.mo40686r();
    }

    /* renamed from: P */
    public static C7193x0<C10146e> m21381P() {
        return DEFAULT_INSTANCE.mo40629i();
    }

    /* access modifiers changed from: private */
    /* renamed from: R */
    public void m21382R(long j) {
        this.expirationEpochTimestampMillis_ = j;
    }

    /* renamed from: L */
    public long mo44742L() {
        return this.expirationEpochTimestampMillis_;
    }

    /* renamed from: M */
    public List<C10050c> mo44743M() {
        return this.messages_;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final Object mo29952v(C7186x.C7192f fVar, Object obj, Object obj2) {
        switch (C10147a.f15332a[fVar.ordinal()]) {
            case 1:
                return new C10146e();
            case 2:
                return new C10148b((C10147a) null);
            case 3:
                return C7186x.m13872E(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0002", new Object[]{"messages_", C10050c.class, "expirationEpochTimestampMillis_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C7193x0<C10146e> x0Var = PARSER;
                if (x0Var == null) {
                    synchronized (C10146e.class) {
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
