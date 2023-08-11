package p149l3;

/* renamed from: l3.g */
/* compiled from: BackendResponse */
public abstract class C8664g {

    /* renamed from: l3.g$a */
    /* compiled from: BackendResponse */
    public enum C8665a {
        OK,
        TRANSIENT_ERROR,
        FATAL_ERROR,
        INVALID_PAYLOAD
    }

    /* renamed from: a */
    public static C8664g m17418a() {
        return new C8658b(C8665a.FATAL_ERROR, -1);
    }

    /* renamed from: d */
    public static C8664g m17419d() {
        return new C8658b(C8665a.INVALID_PAYLOAD, -1);
    }

    /* renamed from: e */
    public static C8664g m17420e(long j) {
        return new C8658b(C8665a.OK, j);
    }

    /* renamed from: f */
    public static C8664g m17421f() {
        return new C8658b(C8665a.TRANSIENT_ERROR, -1);
    }

    /* renamed from: b */
    public abstract long mo42737b();

    /* renamed from: c */
    public abstract C8665a mo42738c();
}
