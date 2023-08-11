package p223s7;

import com.google.protobuf.C7196z;

/* renamed from: s7.n */
/* compiled from: FetchErrorReason */
public enum C9559n implements C7196z.C7199c {
    UNSPECIFIED_FETCH_ERROR(0),
    SERVER_ERROR(1),
    CLIENT_ERROR(2),
    NETWORK_ERROR(3);
    

    /* renamed from: g */
    private static final C7196z.C7200d<C9559n> f14231g = null;

    /* renamed from: b */
    private final int f14233b;

    /* renamed from: s7.n$a */
    /* compiled from: FetchErrorReason */
    class C9560a implements C7196z.C7200d<C9559n> {
        C9560a() {
        }

        /* renamed from: b */
        public C9559n mo40728a(int i) {
            return C9559n.m19863a(i);
        }
    }

    /* renamed from: s7.n$b */
    /* compiled from: FetchErrorReason */
    private static final class C9561b implements C7196z.C7201e {

        /* renamed from: a */
        static final C7196z.C7201e f14234a = null;

        static {
            f14234a = new C9561b();
        }

        private C9561b() {
        }

        /* renamed from: a */
        public boolean mo40729a(int i) {
            if (C9559n.m19863a(i) != null) {
                return true;
            }
            return false;
        }
    }

    static {
        f14231g = new C9560a();
    }

    private C9559n(int i) {
        this.f14233b = i;
    }

    /* renamed from: a */
    public static C9559n m19863a(int i) {
        if (i == 0) {
            return UNSPECIFIED_FETCH_ERROR;
        }
        if (i == 1) {
            return SERVER_ERROR;
        }
        if (i == 2) {
            return CLIENT_ERROR;
        }
        if (i != 3) {
            return null;
        }
        return NETWORK_ERROR;
    }

    /* renamed from: b */
    public static C7196z.C7201e m19864b() {
        return C9561b.f14234a;
    }

    /* renamed from: y */
    public final int mo40727y() {
        return this.f14233b;
    }
}
