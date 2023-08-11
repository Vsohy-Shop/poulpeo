package p268w8;

import com.google.protobuf.C7159q0;
import com.google.protobuf.C7186x;
import com.google.protobuf.C7193x0;

/* renamed from: w8.c */
/* compiled from: ClientAppInfo */
public final class C10140c extends C7186x<C10140c, C10142b> implements C7159q0 {
    public static final int APP_INSTANCE_ID_FIELD_NUMBER = 2;
    public static final int APP_INSTANCE_ID_TOKEN_FIELD_NUMBER = 3;
    /* access modifiers changed from: private */
    public static final C10140c DEFAULT_INSTANCE;
    public static final int GMP_APP_ID_FIELD_NUMBER = 1;
    private static volatile C7193x0<C10140c> PARSER;
    private String appInstanceIdToken_ = "";
    private String appInstanceId_ = "";
    private String gmpAppId_ = "";

    /* renamed from: w8.c$a */
    /* compiled from: ClientAppInfo */
    static /* synthetic */ class C10141a {

        /* renamed from: a */
        static final /* synthetic */ int[] f15330a;

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
                f15330a = r0
                com.google.protobuf.x$f r1 = com.google.protobuf.C7186x.C7192f.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f15330a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.x$f r1 = com.google.protobuf.C7186x.C7192f.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f15330a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.x$f r1 = com.google.protobuf.C7186x.C7192f.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f15330a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.x$f r1 = com.google.protobuf.C7186x.C7192f.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f15330a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.x$f r1 = com.google.protobuf.C7186x.C7192f.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f15330a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.x$f r1 = com.google.protobuf.C7186x.C7192f.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f15330a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.x$f r1 = com.google.protobuf.C7186x.C7192f.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p268w8.C10140c.C10141a.<clinit>():void");
        }
    }

    /* renamed from: w8.c$b */
    /* compiled from: ClientAppInfo */
    public static final class C10142b extends C7186x.C7187a<C10140c, C10142b> implements C7159q0 {
        /* synthetic */ C10142b(C10141a aVar) {
            this();
        }

        /* renamed from: B */
        public C10142b mo44735B(String str) {
            mo40696t();
            ((C10140c) this.f9839c).m21354P(str);
            return this;
        }

        /* renamed from: C */
        public C10142b mo44736C(String str) {
            mo40696t();
            ((C10140c) this.f9839c).m21355R(str);
            return this;
        }

        /* renamed from: z */
        public C10142b mo44737z(String str) {
            mo40696t();
            ((C10140c) this.f9839c).m21353N(str);
            return this;
        }

        private C10142b() {
            super(C10140c.DEFAULT_INSTANCE);
        }
    }

    static {
        C10140c cVar = new C10140c();
        DEFAULT_INSTANCE = cVar;
        C7186x.m13874G(C10140c.class, cVar);
    }

    private C10140c() {
    }

    /* renamed from: M */
    public static C10142b m21352M() {
        return (C10142b) DEFAULT_INSTANCE.mo40686r();
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public void m21353N(String str) {
        str.getClass();
        this.appInstanceId_ = str;
    }

    /* access modifiers changed from: private */
    /* renamed from: P */
    public void m21354P(String str) {
        str.getClass();
        this.appInstanceIdToken_ = str;
    }

    /* access modifiers changed from: private */
    /* renamed from: R */
    public void m21355R(String str) {
        str.getClass();
        this.gmpAppId_ = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final Object mo29952v(C7186x.C7192f fVar, Object obj, Object obj2) {
        switch (C10141a.f15330a[fVar.ordinal()]) {
            case 1:
                return new C10140c();
            case 2:
                return new C10142b((C10141a) null);
            case 3:
                return C7186x.m13872E(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"gmpAppId_", "appInstanceId_", "appInstanceIdToken_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C7193x0<C10140c> x0Var = PARSER;
                if (x0Var == null) {
                    synchronized (C10140c.class) {
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
