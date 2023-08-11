package p277x6;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p277x6.C10450a0;

/* renamed from: x6.b */
/* compiled from: AutoValue_CrashlyticsReport */
final class C10491b extends C10450a0 {

    /* renamed from: b */
    private final String f15857b;

    /* renamed from: c */
    private final String f15858c;

    /* renamed from: d */
    private final int f15859d;

    /* renamed from: e */
    private final String f15860e;

    /* renamed from: f */
    private final String f15861f;

    /* renamed from: g */
    private final String f15862g;

    /* renamed from: h */
    private final C10450a0.C10460e f15863h;

    /* renamed from: i */
    private final C10450a0.C10456d f15864i;

    /* renamed from: x6.b$b */
    /* compiled from: AutoValue_CrashlyticsReport */
    static final class C10493b extends C10450a0.C10453b {

        /* renamed from: a */
        private String f15865a;

        /* renamed from: b */
        private String f15866b;

        /* renamed from: c */
        private Integer f15867c;

        /* renamed from: d */
        private String f15868d;

        /* renamed from: e */
        private String f15869e;

        /* renamed from: f */
        private String f15870f;

        /* renamed from: g */
        private C10450a0.C10460e f15871g;

        /* renamed from: h */
        private C10450a0.C10456d f15872h;

        /* renamed from: a */
        public C10450a0 mo45165a() {
            String str = "";
            if (this.f15865a == null) {
                str = str + " sdkVersion";
            }
            if (this.f15866b == null) {
                str = str + " gmpAppId";
            }
            if (this.f15867c == null) {
                str = str + " platform";
            }
            if (this.f15868d == null) {
                str = str + " installationUuid";
            }
            if (this.f15869e == null) {
                str = str + " buildVersion";
            }
            if (this.f15870f == null) {
                str = str + " displayVersion";
            }
            if (str.isEmpty()) {
                return new C10491b(this.f15865a, this.f15866b, this.f15867c.intValue(), this.f15868d, this.f15869e, this.f15870f, this.f15871g, this.f15872h);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C10450a0.C10453b mo45166b(String str) {
            if (str != null) {
                this.f15869e = str;
                return this;
            }
            throw new NullPointerException("Null buildVersion");
        }

        /* renamed from: c */
        public C10450a0.C10453b mo45167c(String str) {
            if (str != null) {
                this.f15870f = str;
                return this;
            }
            throw new NullPointerException("Null displayVersion");
        }

        /* renamed from: d */
        public C10450a0.C10453b mo45168d(String str) {
            if (str != null) {
                this.f15866b = str;
                return this;
            }
            throw new NullPointerException("Null gmpAppId");
        }

        /* renamed from: e */
        public C10450a0.C10453b mo45169e(String str) {
            if (str != null) {
                this.f15868d = str;
                return this;
            }
            throw new NullPointerException("Null installationUuid");
        }

        /* renamed from: f */
        public C10450a0.C10453b mo45170f(C10450a0.C10456d dVar) {
            this.f15872h = dVar;
            return this;
        }

        /* renamed from: g */
        public C10450a0.C10453b mo45171g(int i) {
            this.f15867c = Integer.valueOf(i);
            return this;
        }

        /* renamed from: h */
        public C10450a0.C10453b mo45172h(String str) {
            if (str != null) {
                this.f15865a = str;
                return this;
            }
            throw new NullPointerException("Null sdkVersion");
        }

        /* renamed from: i */
        public C10450a0.C10453b mo45173i(C10450a0.C10460e eVar) {
            this.f15871g = eVar;
            return this;
        }

        C10493b() {
        }

        private C10493b(C10450a0 a0Var) {
            this.f15865a = a0Var.mo45142i();
            this.f15866b = a0Var.mo45138e();
            this.f15867c = Integer.valueOf(a0Var.mo45141h());
            this.f15868d = a0Var.mo45139f();
            this.f15869e = a0Var.mo45136c();
            this.f15870f = a0Var.mo45137d();
            this.f15871g = a0Var.mo45143j();
            this.f15872h = a0Var.mo45140g();
        }
    }

    @NonNull
    /* renamed from: c */
    public String mo45136c() {
        return this.f15861f;
    }

    @NonNull
    /* renamed from: d */
    public String mo45137d() {
        return this.f15862g;
    }

    @NonNull
    /* renamed from: e */
    public String mo45138e() {
        return this.f15858c;
    }

    public boolean equals(Object obj) {
        C10450a0.C10460e eVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10450a0)) {
            return false;
        }
        C10450a0 a0Var = (C10450a0) obj;
        if (this.f15857b.equals(a0Var.mo45142i()) && this.f15858c.equals(a0Var.mo45138e()) && this.f15859d == a0Var.mo45141h() && this.f15860e.equals(a0Var.mo45139f()) && this.f15861f.equals(a0Var.mo45136c()) && this.f15862g.equals(a0Var.mo45137d()) && ((eVar = this.f15863h) != null ? eVar.equals(a0Var.mo45143j()) : a0Var.mo45143j() == null)) {
            C10450a0.C10456d dVar = this.f15864i;
            if (dVar == null) {
                if (a0Var.mo45140g() == null) {
                    return true;
                }
            } else if (dVar.equals(a0Var.mo45140g())) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    /* renamed from: f */
    public String mo45139f() {
        return this.f15860e;
    }

    @Nullable
    /* renamed from: g */
    public C10450a0.C10456d mo45140g() {
        return this.f15864i;
    }

    /* renamed from: h */
    public int mo45141h() {
        return this.f15859d;
    }

    public int hashCode() {
        int i;
        int hashCode = (((((((((((this.f15857b.hashCode() ^ 1000003) * 1000003) ^ this.f15858c.hashCode()) * 1000003) ^ this.f15859d) * 1000003) ^ this.f15860e.hashCode()) * 1000003) ^ this.f15861f.hashCode()) * 1000003) ^ this.f15862g.hashCode()) * 1000003;
        C10450a0.C10460e eVar = this.f15863h;
        int i2 = 0;
        if (eVar == null) {
            i = 0;
        } else {
            i = eVar.hashCode();
        }
        int i3 = (hashCode ^ i) * 1000003;
        C10450a0.C10456d dVar = this.f15864i;
        if (dVar != null) {
            i2 = dVar.hashCode();
        }
        return i3 ^ i2;
    }

    @NonNull
    /* renamed from: i */
    public String mo45142i() {
        return this.f15857b;
    }

    @Nullable
    /* renamed from: j */
    public C10450a0.C10460e mo45143j() {
        return this.f15863h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public C10450a0.C10453b mo45144k() {
        return new C10493b(this);
    }

    public String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f15857b + ", gmpAppId=" + this.f15858c + ", platform=" + this.f15859d + ", installationUuid=" + this.f15860e + ", buildVersion=" + this.f15861f + ", displayVersion=" + this.f15862g + ", session=" + this.f15863h + ", ndkPayload=" + this.f15864i + "}";
    }

    private C10491b(String str, String str2, int i, String str3, String str4, String str5, @Nullable C10450a0.C10460e eVar, @Nullable C10450a0.C10456d dVar) {
        this.f15857b = str;
        this.f15858c = str2;
        this.f15859d = i;
        this.f15860e = str3;
        this.f15861f = str4;
        this.f15862g = str5;
        this.f15863h = eVar;
        this.f15864i = dVar;
    }
}
