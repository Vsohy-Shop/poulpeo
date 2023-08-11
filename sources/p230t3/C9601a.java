package p230t3;

import p230t3.C9611e;

/* renamed from: t3.a */
/* compiled from: AutoValue_EventStoreConfig */
final class C9601a extends C9611e {

    /* renamed from: b */
    private final long f14293b;

    /* renamed from: c */
    private final int f14294c;

    /* renamed from: d */
    private final int f14295d;

    /* renamed from: e */
    private final long f14296e;

    /* renamed from: f */
    private final int f14297f;

    /* renamed from: t3.a$b */
    /* compiled from: AutoValue_EventStoreConfig */
    static final class C9603b extends C9611e.C9612a {

        /* renamed from: a */
        private Long f14298a;

        /* renamed from: b */
        private Integer f14299b;

        /* renamed from: c */
        private Integer f14300c;

        /* renamed from: d */
        private Long f14301d;

        /* renamed from: e */
        private Integer f14302e;

        C9603b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C9611e mo44073a() {
            String str = "";
            if (this.f14298a == null) {
                str = str + " maxStorageSizeInBytes";
            }
            if (this.f14299b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f14300c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f14301d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f14302e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new C9601a(this.f14298a.longValue(), this.f14299b.intValue(), this.f14300c.intValue(), this.f14301d.longValue(), this.f14302e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C9611e.C9612a mo44074b(int i) {
            this.f14300c = Integer.valueOf(i);
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C9611e.C9612a mo44075c(long j) {
            this.f14301d = Long.valueOf(j);
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public C9611e.C9612a mo44076d(int i) {
            this.f14299b = Integer.valueOf(i);
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public C9611e.C9612a mo44077e(int i) {
            this.f14302e = Integer.valueOf(i);
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public C9611e.C9612a mo44078f(long j) {
            this.f14298a = Long.valueOf(j);
            return this;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo44065b() {
        return this.f14295d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public long mo44066c() {
        return this.f14296e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo44067d() {
        return this.f14294c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo44068e() {
        return this.f14297f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C9611e)) {
            return false;
        }
        C9611e eVar = (C9611e) obj;
        if (this.f14293b == eVar.mo44070f() && this.f14294c == eVar.mo44067d() && this.f14295d == eVar.mo44065b() && this.f14296e == eVar.mo44066c() && this.f14297f == eVar.mo44068e()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public long mo44070f() {
        return this.f14293b;
    }

    public int hashCode() {
        long j = this.f14293b;
        long j2 = this.f14296e;
        return ((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f14294c) * 1000003) ^ this.f14295d) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f14297f;
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f14293b + ", loadBatchSize=" + this.f14294c + ", criticalSectionEnterTimeoutMs=" + this.f14295d + ", eventCleanUpAge=" + this.f14296e + ", maxBlobByteSizePerRow=" + this.f14297f + "}";
    }

    private C9601a(long j, int i, int i2, long j2, int i3) {
        this.f14293b = j;
        this.f14294c = i;
        this.f14295d = i2;
        this.f14296e = j2;
        this.f14297f = i3;
    }
}
