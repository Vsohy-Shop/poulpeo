package p179o3;

import p183o7.C9004d;

/* renamed from: o3.e */
/* compiled from: StorageMetrics */
public final class C8966e {

    /* renamed from: c */
    private static final C8966e f13039c = new C8967a().mo43130a();

    /* renamed from: a */
    private final long f13040a;

    /* renamed from: b */
    private final long f13041b;

    /* renamed from: o3.e$a */
    /* compiled from: StorageMetrics */
    public static final class C8967a {

        /* renamed from: a */
        private long f13042a = 0;

        /* renamed from: b */
        private long f13043b = 0;

        C8967a() {
        }

        /* renamed from: a */
        public C8966e mo43130a() {
            return new C8966e(this.f13042a, this.f13043b);
        }

        /* renamed from: b */
        public C8967a mo43131b(long j) {
            this.f13042a = j;
            return this;
        }

        /* renamed from: c */
        public C8967a mo43132c(long j) {
            this.f13043b = j;
            return this;
        }
    }

    C8966e(long j, long j2) {
        this.f13040a = j;
        this.f13041b = j2;
    }

    /* renamed from: c */
    public static C8967a m18197c() {
        return new C8967a();
    }

    @C9004d(tag = 1)
    /* renamed from: a */
    public long mo43128a() {
        return this.f13040a;
    }

    @C9004d(tag = 2)
    /* renamed from: b */
    public long mo43129b() {
        return this.f13041b;
    }
}
