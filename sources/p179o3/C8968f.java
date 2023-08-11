package p179o3;

import p183o7.C9004d;

/* renamed from: o3.f */
/* compiled from: TimeWindow */
public final class C8968f {

    /* renamed from: c */
    private static final C8968f f13044c = new C8969a().mo43135a();

    /* renamed from: a */
    private final long f13045a;

    /* renamed from: b */
    private final long f13046b;

    /* renamed from: o3.f$a */
    /* compiled from: TimeWindow */
    public static final class C8969a {

        /* renamed from: a */
        private long f13047a = 0;

        /* renamed from: b */
        private long f13048b = 0;

        C8969a() {
        }

        /* renamed from: a */
        public C8968f mo43135a() {
            return new C8968f(this.f13047a, this.f13048b);
        }

        /* renamed from: b */
        public C8969a mo43136b(long j) {
            this.f13048b = j;
            return this;
        }

        /* renamed from: c */
        public C8969a mo43137c(long j) {
            this.f13047a = j;
            return this;
        }
    }

    C8968f(long j, long j2) {
        this.f13045a = j;
        this.f13046b = j2;
    }

    /* renamed from: c */
    public static C8969a m18203c() {
        return new C8969a();
    }

    @C9004d(tag = 2)
    /* renamed from: a */
    public long mo43133a() {
        return this.f13046b;
    }

    @C9004d(tag = 1)
    /* renamed from: b */
    public long mo43134b() {
        return this.f13045a;
    }
}
