package p277x6;

import androidx.annotation.NonNull;
import p277x6.C10450a0;

/* renamed from: x6.j */
/* compiled from: AutoValue_CrashlyticsReport_Session_Device */
final class C10518j extends C10450a0.C10460e.C10465c {

    /* renamed from: a */
    private final int f15939a;

    /* renamed from: b */
    private final String f15940b;

    /* renamed from: c */
    private final int f15941c;

    /* renamed from: d */
    private final long f15942d;

    /* renamed from: e */
    private final long f15943e;

    /* renamed from: f */
    private final boolean f15944f;

    /* renamed from: g */
    private final int f15945g;

    /* renamed from: h */
    private final String f15946h;

    /* renamed from: i */
    private final String f15947i;

    /* renamed from: x6.j$b */
    /* compiled from: AutoValue_CrashlyticsReport_Session_Device */
    static final class C10520b extends C10450a0.C10460e.C10465c.C10466a {

        /* renamed from: a */
        private Integer f15948a;

        /* renamed from: b */
        private String f15949b;

        /* renamed from: c */
        private Integer f15950c;

        /* renamed from: d */
        private Long f15951d;

        /* renamed from: e */
        private Long f15952e;

        /* renamed from: f */
        private Boolean f15953f;

        /* renamed from: g */
        private Integer f15954g;

        /* renamed from: h */
        private String f15955h;

        /* renamed from: i */
        private String f15956i;

        C10520b() {
        }

        /* renamed from: a */
        public C10450a0.C10460e.C10465c mo45241a() {
            String str = "";
            if (this.f15948a == null) {
                str = str + " arch";
            }
            if (this.f15949b == null) {
                str = str + " model";
            }
            if (this.f15950c == null) {
                str = str + " cores";
            }
            if (this.f15951d == null) {
                str = str + " ram";
            }
            if (this.f15952e == null) {
                str = str + " diskSpace";
            }
            if (this.f15953f == null) {
                str = str + " simulator";
            }
            if (this.f15954g == null) {
                str = str + " state";
            }
            if (this.f15955h == null) {
                str = str + " manufacturer";
            }
            if (this.f15956i == null) {
                str = str + " modelClass";
            }
            if (str.isEmpty()) {
                return new C10518j(this.f15948a.intValue(), this.f15949b, this.f15950c.intValue(), this.f15951d.longValue(), this.f15952e.longValue(), this.f15953f.booleanValue(), this.f15954g.intValue(), this.f15955h, this.f15956i);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C10450a0.C10460e.C10465c.C10466a mo45242b(int i) {
            this.f15948a = Integer.valueOf(i);
            return this;
        }

        /* renamed from: c */
        public C10450a0.C10460e.C10465c.C10466a mo45243c(int i) {
            this.f15950c = Integer.valueOf(i);
            return this;
        }

        /* renamed from: d */
        public C10450a0.C10460e.C10465c.C10466a mo45244d(long j) {
            this.f15952e = Long.valueOf(j);
            return this;
        }

        /* renamed from: e */
        public C10450a0.C10460e.C10465c.C10466a mo45245e(String str) {
            if (str != null) {
                this.f15955h = str;
                return this;
            }
            throw new NullPointerException("Null manufacturer");
        }

        /* renamed from: f */
        public C10450a0.C10460e.C10465c.C10466a mo45246f(String str) {
            if (str != null) {
                this.f15949b = str;
                return this;
            }
            throw new NullPointerException("Null model");
        }

        /* renamed from: g */
        public C10450a0.C10460e.C10465c.C10466a mo45247g(String str) {
            if (str != null) {
                this.f15956i = str;
                return this;
            }
            throw new NullPointerException("Null modelClass");
        }

        /* renamed from: h */
        public C10450a0.C10460e.C10465c.C10466a mo45248h(long j) {
            this.f15951d = Long.valueOf(j);
            return this;
        }

        /* renamed from: i */
        public C10450a0.C10460e.C10465c.C10466a mo45249i(boolean z) {
            this.f15953f = Boolean.valueOf(z);
            return this;
        }

        /* renamed from: j */
        public C10450a0.C10460e.C10465c.C10466a mo45250j(int i) {
            this.f15954g = Integer.valueOf(i);
            return this;
        }
    }

    @NonNull
    /* renamed from: b */
    public int mo45232b() {
        return this.f15939a;
    }

    /* renamed from: c */
    public int mo45233c() {
        return this.f15941c;
    }

    /* renamed from: d */
    public long mo45234d() {
        return this.f15943e;
    }

    @NonNull
    /* renamed from: e */
    public String mo45235e() {
        return this.f15946h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10450a0.C10460e.C10465c)) {
            return false;
        }
        C10450a0.C10460e.C10465c cVar = (C10450a0.C10460e.C10465c) obj;
        if (this.f15939a == cVar.mo45232b() && this.f15940b.equals(cVar.mo45236f()) && this.f15941c == cVar.mo45233c() && this.f15942d == cVar.mo45238h() && this.f15943e == cVar.mo45234d() && this.f15944f == cVar.mo45240j() && this.f15945g == cVar.mo45239i() && this.f15946h.equals(cVar.mo45235e()) && this.f15947i.equals(cVar.mo45237g())) {
            return true;
        }
        return false;
    }

    @NonNull
    /* renamed from: f */
    public String mo45236f() {
        return this.f15940b;
    }

    @NonNull
    /* renamed from: g */
    public String mo45237g() {
        return this.f15947i;
    }

    /* renamed from: h */
    public long mo45238h() {
        return this.f15942d;
    }

    public int hashCode() {
        int i;
        long j = this.f15942d;
        long j2 = this.f15943e;
        int hashCode = (((((((((this.f15939a ^ 1000003) * 1000003) ^ this.f15940b.hashCode()) * 1000003) ^ this.f15941c) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        if (this.f15944f) {
            i = 1231;
        } else {
            i = 1237;
        }
        return ((((((hashCode ^ i) * 1000003) ^ this.f15945g) * 1000003) ^ this.f15946h.hashCode()) * 1000003) ^ this.f15947i.hashCode();
    }

    /* renamed from: i */
    public int mo45239i() {
        return this.f15945g;
    }

    /* renamed from: j */
    public boolean mo45240j() {
        return this.f15944f;
    }

    public String toString() {
        return "Device{arch=" + this.f15939a + ", model=" + this.f15940b + ", cores=" + this.f15941c + ", ram=" + this.f15942d + ", diskSpace=" + this.f15943e + ", simulator=" + this.f15944f + ", state=" + this.f15945g + ", manufacturer=" + this.f15946h + ", modelClass=" + this.f15947i + "}";
    }

    private C10518j(int i, String str, int i2, long j, long j2, boolean z, int i3, String str2, String str3) {
        this.f15939a = i;
        this.f15940b = str;
        this.f15941c = i2;
        this.f15942d = j;
        this.f15943e = j2;
        this.f15944f = z;
        this.f15945g = i3;
        this.f15946h = str2;
        this.f15947i = str3;
    }
}
