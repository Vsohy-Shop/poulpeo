package p219s3;

import java.util.Set;
import p219s3.C9470f;

/* renamed from: s3.c */
/* compiled from: AutoValue_SchedulerConfig_ConfigValue */
final class C9465c extends C9470f.C9472b {

    /* renamed from: a */
    private final long f14078a;

    /* renamed from: b */
    private final long f14079b;

    /* renamed from: c */
    private final Set<C9470f.C9474c> f14080c;

    /* renamed from: s3.c$b */
    /* compiled from: AutoValue_SchedulerConfig_ConfigValue */
    static final class C9467b extends C9470f.C9472b.C9473a {

        /* renamed from: a */
        private Long f14081a;

        /* renamed from: b */
        private Long f14082b;

        /* renamed from: c */
        private Set<C9470f.C9474c> f14083c;

        C9467b() {
        }

        /* renamed from: a */
        public C9470f.C9472b mo43915a() {
            String str = "";
            if (this.f14081a == null) {
                str = str + " delta";
            }
            if (this.f14082b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f14083c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new C9465c(this.f14081a.longValue(), this.f14082b.longValue(), this.f14083c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C9470f.C9472b.C9473a mo43916b(long j) {
            this.f14081a = Long.valueOf(j);
            return this;
        }

        /* renamed from: c */
        public C9470f.C9472b.C9473a mo43917c(Set<C9470f.C9474c> set) {
            if (set != null) {
                this.f14083c = set;
                return this;
            }
            throw new NullPointerException("Null flags");
        }

        /* renamed from: d */
        public C9470f.C9472b.C9473a mo43918d(long j) {
            this.f14082b = Long.valueOf(j);
            return this;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public long mo43909b() {
        return this.f14078a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Set<C9470f.C9474c> mo43910c() {
        return this.f14080c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public long mo43911d() {
        return this.f14079b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C9470f.C9472b)) {
            return false;
        }
        C9470f.C9472b bVar = (C9470f.C9472b) obj;
        if (this.f14078a == bVar.mo43909b() && this.f14079b == bVar.mo43911d() && this.f14080c.equals(bVar.mo43910c())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.f14078a;
        long j2 = this.f14079b;
        return ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f14080c.hashCode();
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f14078a + ", maxAllowedDelay=" + this.f14079b + ", flags=" + this.f14080c + "}";
    }

    private C9465c(long j, long j2, Set<C9470f.C9474c> set) {
        this.f14078a = j;
        this.f14079b = j2;
        this.f14080c = set;
    }
}
