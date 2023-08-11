package p021a3;

/* renamed from: a3.k */
/* compiled from: LoginBehavior */
public enum C2165k {
    NATIVE_WITH_FALLBACK(true, true, true, false, true, true, true),
    NATIVE_ONLY(true, true, false, false, false, true, true),
    KATANA_ONLY(false, true, false, false, false, false, false),
    WEB_ONLY(false, false, true, false, true, false, false),
    WEB_VIEW_ONLY(false, false, true, false, false, false, false),
    DIALOG_ONLY(false, true, true, false, true, true, true),
    DEVICE_AUTH(false, false, false, true, false, false, false);
    

    /* renamed from: b */
    private final boolean f877b;

    /* renamed from: c */
    private final boolean f878c;

    /* renamed from: d */
    private final boolean f879d;

    /* renamed from: e */
    private final boolean f880e;

    /* renamed from: f */
    private final boolean f881f;

    /* renamed from: g */
    private final boolean f882g;

    /* renamed from: h */
    private final boolean f883h;

    private C2165k(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.f877b = z;
        this.f878c = z2;
        this.f879d = z3;
        this.f880e = z4;
        this.f881f = z5;
        this.f882g = z6;
        this.f883h = z7;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo23359a() {
        return this.f881f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo23360b() {
        return this.f880e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo23361c() {
        return this.f882g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo23362d() {
        return this.f877b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo23363e() {
        return this.f883h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo23364f() {
        return this.f878c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo23365g() {
        return this.f879d;
    }
}
