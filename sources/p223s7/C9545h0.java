package p223s7;

import com.google.protobuf.C7196z;

/* renamed from: s7.h0 */
/* compiled from: RenderErrorReason */
public enum C9545h0 implements C7196z.C7199c {
    UNSPECIFIED_RENDER_ERROR(0),
    IMAGE_FETCH_ERROR(1),
    IMAGE_DISPLAY_ERROR(2),
    IMAGE_UNSUPPORTED_FORMAT(3);
    

    /* renamed from: g */
    private static final C7196z.C7200d<C9545h0> f14207g = null;

    /* renamed from: b */
    private final int f14209b;

    /* renamed from: s7.h0$a */
    /* compiled from: RenderErrorReason */
    class C9546a implements C7196z.C7200d<C9545h0> {
        C9546a() {
        }

        /* renamed from: b */
        public C9545h0 mo40728a(int i) {
            return C9545h0.m19834a(i);
        }
    }

    /* renamed from: s7.h0$b */
    /* compiled from: RenderErrorReason */
    private static final class C9547b implements C7196z.C7201e {

        /* renamed from: a */
        static final C7196z.C7201e f14210a = null;

        static {
            f14210a = new C9547b();
        }

        private C9547b() {
        }

        /* renamed from: a */
        public boolean mo40729a(int i) {
            if (C9545h0.m19834a(i) != null) {
                return true;
            }
            return false;
        }
    }

    static {
        f14207g = new C9546a();
    }

    private C9545h0(int i) {
        this.f14209b = i;
    }

    /* renamed from: a */
    public static C9545h0 m19834a(int i) {
        if (i == 0) {
            return UNSPECIFIED_RENDER_ERROR;
        }
        if (i == 1) {
            return IMAGE_FETCH_ERROR;
        }
        if (i == 2) {
            return IMAGE_DISPLAY_ERROR;
        }
        if (i != 3) {
            return null;
        }
        return IMAGE_UNSUPPORTED_FORMAT;
    }

    /* renamed from: b */
    public static C7196z.C7201e m19835b() {
        return C9547b.f14210a;
    }

    /* renamed from: y */
    public final int mo40727y() {
        return this.f14209b;
    }
}
