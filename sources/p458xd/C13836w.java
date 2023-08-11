package p458xd;

import p111h6.C8003j;
import p111h6.C8007k;
import p111h6.C8012n;

/* renamed from: xd.w */
/* compiled from: InternalChannelz */
public final class C13836w {

    /* renamed from: a */
    public final String f22316a;

    /* renamed from: b */
    public final C13838b f22317b;

    /* renamed from: c */
    public final long f22318c;

    /* renamed from: d */
    public final C13776a0 f22319d;

    /* renamed from: e */
    public final C13776a0 f22320e;

    /* renamed from: xd.w$a */
    /* compiled from: InternalChannelz */
    public static final class C13837a {

        /* renamed from: a */
        private String f22321a;

        /* renamed from: b */
        private C13838b f22322b;

        /* renamed from: c */
        private Long f22323c;

        /* renamed from: d */
        private C13776a0 f22324d;

        /* renamed from: e */
        private C13776a0 f22325e;

        /* renamed from: a */
        public C13836w mo53517a() {
            boolean z;
            C8012n.m15756o(this.f22321a, "description");
            C8012n.m15756o(this.f22322b, "severity");
            C8012n.m15756o(this.f22323c, "timestampNanos");
            if (this.f22324d == null || this.f22325e == null) {
                z = true;
            } else {
                z = false;
            }
            C8012n.m15762u(z, "at least one of channelRef and subchannelRef must be null");
            return new C13836w(this.f22321a, this.f22322b, this.f22323c.longValue(), this.f22324d, this.f22325e);
        }

        /* renamed from: b */
        public C13837a mo53518b(String str) {
            this.f22321a = str;
            return this;
        }

        /* renamed from: c */
        public C13837a mo53519c(C13838b bVar) {
            this.f22322b = bVar;
            return this;
        }

        /* renamed from: d */
        public C13837a mo53520d(C13776a0 a0Var) {
            this.f22325e = a0Var;
            return this;
        }

        /* renamed from: e */
        public C13837a mo53521e(long j) {
            this.f22323c = Long.valueOf(j);
            return this;
        }
    }

    /* renamed from: xd.w$b */
    /* compiled from: InternalChannelz */
    public enum C13838b {
        CT_UNKNOWN,
        CT_INFO,
        CT_WARNING,
        CT_ERROR
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C13836w)) {
            return false;
        }
        C13836w wVar = (C13836w) obj;
        if (!C8007k.m15735a(this.f22316a, wVar.f22316a) || !C8007k.m15735a(this.f22317b, wVar.f22317b) || this.f22318c != wVar.f22318c || !C8007k.m15735a(this.f22319d, wVar.f22319d) || !C8007k.m15735a(this.f22320e, wVar.f22320e)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C8007k.m15736b(this.f22316a, this.f22317b, Long.valueOf(this.f22318c), this.f22319d, this.f22320e);
    }

    public String toString() {
        return C8003j.m15723c(this).mo41840d("description", this.f22316a).mo41840d("severity", this.f22317b).mo41839c("timestampNanos", this.f22318c).mo41840d("channelRef", this.f22319d).mo41840d("subchannelRef", this.f22320e).toString();
    }

    private C13836w(String str, C13838b bVar, long j, C13776a0 a0Var, C13776a0 a0Var2) {
        this.f22316a = str;
        this.f22317b = (C13838b) C8012n.m15756o(bVar, "severity");
        this.f22318c = j;
        this.f22319d = a0Var;
        this.f22320e = a0Var2;
    }
}
