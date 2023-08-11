package p205r;

/* renamed from: r.a */
/* compiled from: CachePolicy.kt */
public enum C9332a {
    ENABLED(true, true),
    READ_ONLY(true, false),
    WRITE_ONLY(false, true),
    DISABLED(false, false);
    

    /* renamed from: b */
    private final boolean f13756b;

    /* renamed from: c */
    private final boolean f13757c;

    private C9332a(boolean z, boolean z2) {
        this.f13756b = z;
        this.f13757c = z2;
    }

    /* renamed from: b */
    public final boolean mo43647b() {
        return this.f13756b;
    }

    /* renamed from: c */
    public final boolean mo43648c() {
        return this.f13757c;
    }
}
