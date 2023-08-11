package p223s7;

import com.google.protobuf.C7196z;

/* renamed from: s7.f */
/* compiled from: CommonTypesProto */
public enum C9535f implements C7196z.C7199c {
    UNKNOWN_TRIGGER(0),
    APP_LAUNCH(1),
    ON_FOREGROUND(2),
    UNRECOGNIZED(-1);
    

    /* renamed from: g */
    private static final C7196z.C7200d<C9535f> f14200g = null;

    /* renamed from: b */
    private final int f14202b;

    /* renamed from: s7.f$a */
    /* compiled from: CommonTypesProto */
    class C9536a implements C7196z.C7200d<C9535f> {
        C9536a() {
        }

        /* renamed from: b */
        public C9535f mo40728a(int i) {
            return C9535f.m19807a(i);
        }
    }

    static {
        f14200g = new C9536a();
    }

    private C9535f(int i) {
        this.f14202b = i;
    }

    /* renamed from: a */
    public static C9535f m19807a(int i) {
        if (i == 0) {
            return UNKNOWN_TRIGGER;
        }
        if (i == 1) {
            return APP_LAUNCH;
        }
        if (i != 2) {
            return null;
        }
        return ON_FOREGROUND;
    }

    /* renamed from: y */
    public final int mo40727y() {
        if (this != UNRECOGNIZED) {
            return this.f14202b;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
