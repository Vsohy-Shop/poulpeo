package p250v1;

/* renamed from: v1.d */
/* compiled from: RequestCoordinator */
public interface C9917d {

    /* renamed from: v1.d$a */
    /* compiled from: RequestCoordinator */
    public enum C9918a {
        RUNNING(false),
        PAUSED(false),
        CLEARED(false),
        SUCCESS(true),
        FAILED(true);
        

        /* renamed from: b */
        private final boolean f14880b;

        private C9918a(boolean z) {
            this.f14880b = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo44495a() {
            return this.f14880b;
        }
    }

    /* renamed from: a */
    boolean mo44480a(C9916c cVar);

    /* renamed from: b */
    boolean mo44481b(C9916c cVar);

    /* renamed from: c */
    boolean mo44482c();

    /* renamed from: d */
    void mo44484d(C9916c cVar);

    /* renamed from: f */
    void mo44486f(C9916c cVar);

    C9917d getRoot();

    /* renamed from: i */
    boolean mo44490i(C9916c cVar);
}
