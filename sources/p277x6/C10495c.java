package p277x6;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p277x6.C10450a0;

/* renamed from: x6.c */
/* compiled from: AutoValue_CrashlyticsReport_ApplicationExitInfo */
final class C10495c extends C10450a0.C10451a {

    /* renamed from: a */
    private final int f15874a;

    /* renamed from: b */
    private final String f15875b;

    /* renamed from: c */
    private final int f15876c;

    /* renamed from: d */
    private final int f15877d;

    /* renamed from: e */
    private final long f15878e;

    /* renamed from: f */
    private final long f15879f;

    /* renamed from: g */
    private final long f15880g;

    /* renamed from: h */
    private final String f15881h;

    /* renamed from: x6.c$b */
    /* compiled from: AutoValue_CrashlyticsReport_ApplicationExitInfo */
    static final class C10497b extends C10450a0.C10451a.C10452a {

        /* renamed from: a */
        private Integer f15882a;

        /* renamed from: b */
        private String f15883b;

        /* renamed from: c */
        private Integer f15884c;

        /* renamed from: d */
        private Integer f15885d;

        /* renamed from: e */
        private Long f15886e;

        /* renamed from: f */
        private Long f15887f;

        /* renamed from: g */
        private Long f15888g;

        /* renamed from: h */
        private String f15889h;

        C10497b() {
        }

        /* renamed from: a */
        public C10450a0.C10451a mo45156a() {
            String str = "";
            if (this.f15882a == null) {
                str = str + " pid";
            }
            if (this.f15883b == null) {
                str = str + " processName";
            }
            if (this.f15884c == null) {
                str = str + " reasonCode";
            }
            if (this.f15885d == null) {
                str = str + " importance";
            }
            if (this.f15886e == null) {
                str = str + " pss";
            }
            if (this.f15887f == null) {
                str = str + " rss";
            }
            if (this.f15888g == null) {
                str = str + " timestamp";
            }
            if (str.isEmpty()) {
                return new C10495c(this.f15882a.intValue(), this.f15883b, this.f15884c.intValue(), this.f15885d.intValue(), this.f15886e.longValue(), this.f15887f.longValue(), this.f15888g.longValue(), this.f15889h);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C10450a0.C10451a.C10452a mo45157b(int i) {
            this.f15885d = Integer.valueOf(i);
            return this;
        }

        /* renamed from: c */
        public C10450a0.C10451a.C10452a mo45158c(int i) {
            this.f15882a = Integer.valueOf(i);
            return this;
        }

        /* renamed from: d */
        public C10450a0.C10451a.C10452a mo45159d(String str) {
            if (str != null) {
                this.f15883b = str;
                return this;
            }
            throw new NullPointerException("Null processName");
        }

        /* renamed from: e */
        public C10450a0.C10451a.C10452a mo45160e(long j) {
            this.f15886e = Long.valueOf(j);
            return this;
        }

        /* renamed from: f */
        public C10450a0.C10451a.C10452a mo45161f(int i) {
            this.f15884c = Integer.valueOf(i);
            return this;
        }

        /* renamed from: g */
        public C10450a0.C10451a.C10452a mo45162g(long j) {
            this.f15887f = Long.valueOf(j);
            return this;
        }

        /* renamed from: h */
        public C10450a0.C10451a.C10452a mo45163h(long j) {
            this.f15888g = Long.valueOf(j);
            return this;
        }

        /* renamed from: i */
        public C10450a0.C10451a.C10452a mo45164i(@Nullable String str) {
            this.f15889h = str;
            return this;
        }
    }

    @NonNull
    /* renamed from: b */
    public int mo45148b() {
        return this.f15877d;
    }

    @NonNull
    /* renamed from: c */
    public int mo45149c() {
        return this.f15874a;
    }

    @NonNull
    /* renamed from: d */
    public String mo45150d() {
        return this.f15875b;
    }

    @NonNull
    /* renamed from: e */
    public long mo45151e() {
        return this.f15878e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10450a0.C10451a)) {
            return false;
        }
        C10450a0.C10451a aVar = (C10450a0.C10451a) obj;
        if (this.f15874a == aVar.mo45149c() && this.f15875b.equals(aVar.mo45150d()) && this.f15876c == aVar.mo45152f() && this.f15877d == aVar.mo45148b() && this.f15878e == aVar.mo45151e() && this.f15879f == aVar.mo45153g() && this.f15880g == aVar.mo45154h()) {
            String str = this.f15881h;
            if (str == null) {
                if (aVar.mo45155i() == null) {
                    return true;
                }
            } else if (str.equals(aVar.mo45155i())) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    /* renamed from: f */
    public int mo45152f() {
        return this.f15876c;
    }

    @NonNull
    /* renamed from: g */
    public long mo45153g() {
        return this.f15879f;
    }

    @NonNull
    /* renamed from: h */
    public long mo45154h() {
        return this.f15880g;
    }

    public int hashCode() {
        int i;
        long j = this.f15878e;
        long j2 = this.f15879f;
        long j3 = this.f15880g;
        int hashCode = (((((((((((((this.f15874a ^ 1000003) * 1000003) ^ this.f15875b.hashCode()) * 1000003) ^ this.f15876c) * 1000003) ^ this.f15877d) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        String str = this.f15881h;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        return hashCode ^ i;
    }

    @Nullable
    /* renamed from: i */
    public String mo45155i() {
        return this.f15881h;
    }

    public String toString() {
        return "ApplicationExitInfo{pid=" + this.f15874a + ", processName=" + this.f15875b + ", reasonCode=" + this.f15876c + ", importance=" + this.f15877d + ", pss=" + this.f15878e + ", rss=" + this.f15879f + ", timestamp=" + this.f15880g + ", traceFile=" + this.f15881h + "}";
    }

    private C10495c(int i, String str, int i2, int i3, long j, long j2, long j3, @Nullable String str2) {
        this.f15874a = i;
        this.f15875b = str;
        this.f15876c = i2;
        this.f15877d = i3;
        this.f15878e = j;
        this.f15879f = j2;
        this.f15880g = j3;
        this.f15881h = str2;
    }
}
