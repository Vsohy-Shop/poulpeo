package p223s7;

import com.google.protobuf.C7196z;

/* renamed from: s7.i */
/* compiled from: DismissType */
public enum C9548i implements C7196z.C7199c {
    UNKNOWN_DISMISS_TYPE(0),
    AUTO(1),
    CLICK(2),
    SWIPE(3);
    

    /* renamed from: g */
    private static final C7196z.C7200d<C9548i> f14215g = null;

    /* renamed from: b */
    private final int f14217b;

    /* renamed from: s7.i$a */
    /* compiled from: DismissType */
    class C9549a implements C7196z.C7200d<C9548i> {
        C9549a() {
        }

        /* renamed from: b */
        public C9548i mo40728a(int i) {
            return C9548i.m19840a(i);
        }
    }

    /* renamed from: s7.i$b */
    /* compiled from: DismissType */
    private static final class C9550b implements C7196z.C7201e {

        /* renamed from: a */
        static final C7196z.C7201e f14218a = null;

        static {
            f14218a = new C9550b();
        }

        private C9550b() {
        }

        /* renamed from: a */
        public boolean mo40729a(int i) {
            if (C9548i.m19840a(i) != null) {
                return true;
            }
            return false;
        }
    }

    static {
        f14215g = new C9549a();
    }

    private C9548i(int i) {
        this.f14217b = i;
    }

    /* renamed from: a */
    public static C9548i m19840a(int i) {
        if (i == 0) {
            return UNKNOWN_DISMISS_TYPE;
        }
        if (i == 1) {
            return AUTO;
        }
        if (i == 2) {
            return CLICK;
        }
        if (i != 3) {
            return null;
        }
        return SWIPE;
    }

    /* renamed from: b */
    public static C7196z.C7201e m19841b() {
        return C9550b.f14218a;
    }

    /* renamed from: y */
    public final int mo40727y() {
        return this.f14217b;
    }
}
