package p223s7;

import com.google.protobuf.C7196z;

/* renamed from: s7.j */
/* compiled from: EventType */
public enum C9551j implements C7196z.C7199c {
    UNKNOWN_EVENT_TYPE(0),
    IMPRESSION_EVENT_TYPE(1),
    CLICK_EVENT_TYPE(2);
    

    /* renamed from: f */
    private static final C7196z.C7200d<C9551j> f14222f = null;

    /* renamed from: b */
    private final int f14224b;

    /* renamed from: s7.j$a */
    /* compiled from: EventType */
    class C9552a implements C7196z.C7200d<C9551j> {
        C9552a() {
        }

        /* renamed from: b */
        public C9551j mo40728a(int i) {
            return C9551j.m19846a(i);
        }
    }

    /* renamed from: s7.j$b */
    /* compiled from: EventType */
    private static final class C9553b implements C7196z.C7201e {

        /* renamed from: a */
        static final C7196z.C7201e f14225a = null;

        static {
            f14225a = new C9553b();
        }

        private C9553b() {
        }

        /* renamed from: a */
        public boolean mo40729a(int i) {
            if (C9551j.m19846a(i) != null) {
                return true;
            }
            return false;
        }
    }

    static {
        f14222f = new C9552a();
    }

    private C9551j(int i) {
        this.f14224b = i;
    }

    /* renamed from: a */
    public static C9551j m19846a(int i) {
        if (i == 0) {
            return UNKNOWN_EVENT_TYPE;
        }
        if (i == 1) {
            return IMPRESSION_EVENT_TYPE;
        }
        if (i != 2) {
            return null;
        }
        return CLICK_EVENT_TYPE;
    }

    /* renamed from: b */
    public static C7196z.C7201e m19847b() {
        return C9553b.f14225a;
    }

    /* renamed from: y */
    public final int mo40727y() {
        return this.f14224b;
    }
}
