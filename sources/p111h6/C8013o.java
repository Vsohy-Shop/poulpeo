package p111h6;

/* renamed from: h6.o */
/* compiled from: Splitter */
public final class C8013o {

    /* renamed from: a */
    private final C7988b f11246a;

    /* renamed from: b */
    private final boolean f11247b;

    /* renamed from: c */
    private final C8015b f11248c;

    /* renamed from: d */
    private final int f11249d;

    /* renamed from: h6.o$a */
    /* compiled from: Splitter */
    class C8014a implements C8015b {

        /* renamed from: a */
        final /* synthetic */ C7988b f11250a;

        C8014a(C7988b bVar) {
            this.f11250a = bVar;
        }
    }

    /* renamed from: h6.o$b */
    /* compiled from: Splitter */
    private interface C8015b {
    }

    private C8013o(C8015b bVar) {
        this(bVar, false, C7988b.m15699c(), Integer.MAX_VALUE);
    }

    /* renamed from: a */
    public static C8013o m15765a(char c) {
        return m15766b(C7988b.m15698b(c));
    }

    /* renamed from: b */
    public static C8013o m15766b(C7988b bVar) {
        C8012n.m15755n(bVar);
        return new C8013o(new C8014a(bVar));
    }

    /* renamed from: c */
    public C8013o mo41845c() {
        return mo41846d(C7988b.m15701e());
    }

    /* renamed from: d */
    public C8013o mo41846d(C7988b bVar) {
        C8012n.m15755n(bVar);
        return new C8013o(this.f11248c, this.f11247b, bVar, this.f11249d);
    }

    private C8013o(C8015b bVar, boolean z, C7988b bVar2, int i) {
        this.f11248c = bVar;
        this.f11247b = z;
        this.f11246a = bVar2;
        this.f11249d = i;
    }
}
