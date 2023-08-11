package p101g8;

import p101g8.C7826m;

/* renamed from: g8.b */
/* compiled from: AutoValue_RateLimit */
final class C7799b extends C7826m {

    /* renamed from: a */
    private final String f10841a;

    /* renamed from: b */
    private final long f10842b;

    /* renamed from: c */
    private final long f10843c;

    /* renamed from: g8.b$b */
    /* compiled from: AutoValue_RateLimit */
    static final class C7801b extends C7826m.C7827a {

        /* renamed from: a */
        private String f10844a;

        /* renamed from: b */
        private Long f10845b;

        /* renamed from: c */
        private Long f10846c;

        C7801b() {
        }

        /* renamed from: a */
        public C7826m mo41459a() {
            String str = "";
            if (this.f10844a == null) {
                str = str + " limiterKey";
            }
            if (this.f10845b == null) {
                str = str + " limit";
            }
            if (this.f10846c == null) {
                str = str + " timeToLiveMillis";
            }
            if (str.isEmpty()) {
                return new C7799b(this.f10844a, this.f10845b.longValue(), this.f10846c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C7826m.C7827a mo41460b(long j) {
            this.f10845b = Long.valueOf(j);
            return this;
        }

        /* renamed from: c */
        public C7826m.C7827a mo41461c(String str) {
            if (str != null) {
                this.f10844a = str;
                return this;
            }
            throw new NullPointerException("Null limiterKey");
        }

        /* renamed from: d */
        public C7826m.C7827a mo41462d(long j) {
            this.f10846c = Long.valueOf(j);
            return this;
        }
    }

    /* renamed from: b */
    public long mo41453b() {
        return this.f10842b;
    }

    /* renamed from: c */
    public String mo41454c() {
        return this.f10841a;
    }

    /* renamed from: d */
    public long mo41455d() {
        return this.f10843c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7826m)) {
            return false;
        }
        C7826m mVar = (C7826m) obj;
        if (this.f10841a.equals(mVar.mo41454c()) && this.f10842b == mVar.mo41453b() && this.f10843c == mVar.mo41455d()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.f10842b;
        long j2 = this.f10843c;
        return ((((this.f10841a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "RateLimit{limiterKey=" + this.f10841a + ", limit=" + this.f10842b + ", timeToLiveMillis=" + this.f10843c + "}";
    }

    private C7799b(String str, long j, long j2) {
        this.f10841a = str;
        this.f10842b = j;
        this.f10843c = j2;
    }
}
