package p277x6;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p277x6.C10450a0;

/* renamed from: x6.g */
/* compiled from: AutoValue_CrashlyticsReport_Session */
final class C10511g extends C10450a0.C10460e {

    /* renamed from: a */
    private final String f15902a;

    /* renamed from: b */
    private final String f15903b;

    /* renamed from: c */
    private final long f15904c;

    /* renamed from: d */
    private final Long f15905d;

    /* renamed from: e */
    private final boolean f15906e;

    /* renamed from: f */
    private final C10450a0.C10460e.C10461a f15907f;

    /* renamed from: g */
    private final C10450a0.C10460e.C10489f f15908g;

    /* renamed from: h */
    private final C10450a0.C10460e.C10487e f15909h;

    /* renamed from: i */
    private final C10450a0.C10460e.C10465c f15910i;

    /* renamed from: j */
    private final C10494b0<C10450a0.C10460e.C10467d> f15911j;

    /* renamed from: k */
    private final int f15912k;

    /* renamed from: x6.g$b */
    /* compiled from: AutoValue_CrashlyticsReport_Session */
    static final class C10513b extends C10450a0.C10460e.C10464b {

        /* renamed from: a */
        private String f15913a;

        /* renamed from: b */
        private String f15914b;

        /* renamed from: c */
        private Long f15915c;

        /* renamed from: d */
        private Long f15916d;

        /* renamed from: e */
        private Boolean f15917e;

        /* renamed from: f */
        private C10450a0.C10460e.C10461a f15918f;

        /* renamed from: g */
        private C10450a0.C10460e.C10489f f15919g;

        /* renamed from: h */
        private C10450a0.C10460e.C10487e f15920h;

        /* renamed from: i */
        private C10450a0.C10460e.C10465c f15921i;

        /* renamed from: j */
        private C10494b0<C10450a0.C10460e.C10467d> f15922j;

        /* renamed from: k */
        private Integer f15923k;

        /* renamed from: a */
        public C10450a0.C10460e mo45219a() {
            String str = "";
            if (this.f15913a == null) {
                str = str + " generator";
            }
            if (this.f15914b == null) {
                str = str + " identifier";
            }
            if (this.f15915c == null) {
                str = str + " startedAt";
            }
            if (this.f15917e == null) {
                str = str + " crashed";
            }
            if (this.f15918f == null) {
                str = str + " app";
            }
            if (this.f15923k == null) {
                str = str + " generatorType";
            }
            if (str.isEmpty()) {
                return new C10511g(this.f15913a, this.f15914b, this.f15915c.longValue(), this.f15916d, this.f15917e.booleanValue(), this.f15918f, this.f15919g, this.f15920h, this.f15921i, this.f15922j, this.f15923k.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C10450a0.C10460e.C10464b mo45220b(C10450a0.C10460e.C10461a aVar) {
            if (aVar != null) {
                this.f15918f = aVar;
                return this;
            }
            throw new NullPointerException("Null app");
        }

        /* renamed from: c */
        public C10450a0.C10460e.C10464b mo45221c(boolean z) {
            this.f15917e = Boolean.valueOf(z);
            return this;
        }

        /* renamed from: d */
        public C10450a0.C10460e.C10464b mo45222d(C10450a0.C10460e.C10465c cVar) {
            this.f15921i = cVar;
            return this;
        }

        /* renamed from: e */
        public C10450a0.C10460e.C10464b mo45223e(Long l) {
            this.f15916d = l;
            return this;
        }

        /* renamed from: f */
        public C10450a0.C10460e.C10464b mo45224f(C10494b0<C10450a0.C10460e.C10467d> b0Var) {
            this.f15922j = b0Var;
            return this;
        }

        /* renamed from: g */
        public C10450a0.C10460e.C10464b mo45225g(String str) {
            if (str != null) {
                this.f15913a = str;
                return this;
            }
            throw new NullPointerException("Null generator");
        }

        /* renamed from: h */
        public C10450a0.C10460e.C10464b mo45226h(int i) {
            this.f15923k = Integer.valueOf(i);
            return this;
        }

        /* renamed from: i */
        public C10450a0.C10460e.C10464b mo45227i(String str) {
            if (str != null) {
                this.f15914b = str;
                return this;
            }
            throw new NullPointerException("Null identifier");
        }

        /* renamed from: k */
        public C10450a0.C10460e.C10464b mo45229k(C10450a0.C10460e.C10487e eVar) {
            this.f15920h = eVar;
            return this;
        }

        /* renamed from: l */
        public C10450a0.C10460e.C10464b mo45230l(long j) {
            this.f15915c = Long.valueOf(j);
            return this;
        }

        /* renamed from: m */
        public C10450a0.C10460e.C10464b mo45231m(C10450a0.C10460e.C10489f fVar) {
            this.f15919g = fVar;
            return this;
        }

        C10513b() {
        }

        private C10513b(C10450a0.C10460e eVar) {
            this.f15913a = eVar.mo45193f();
            this.f15914b = eVar.mo45195h();
            this.f15915c = Long.valueOf(eVar.mo45198k());
            this.f15916d = eVar.mo45191d();
            this.f15917e = Boolean.valueOf(eVar.mo45200m());
            this.f15918f = eVar.mo45189b();
            this.f15919g = eVar.mo45199l();
            this.f15920h = eVar.mo45197j();
            this.f15921i = eVar.mo45190c();
            this.f15922j = eVar.mo45192e();
            this.f15923k = Integer.valueOf(eVar.mo45194g());
        }
    }

    @NonNull
    /* renamed from: b */
    public C10450a0.C10460e.C10461a mo45189b() {
        return this.f15907f;
    }

    @Nullable
    /* renamed from: c */
    public C10450a0.C10460e.C10465c mo45190c() {
        return this.f15910i;
    }

    @Nullable
    /* renamed from: d */
    public Long mo45191d() {
        return this.f15905d;
    }

    @Nullable
    /* renamed from: e */
    public C10494b0<C10450a0.C10460e.C10467d> mo45192e() {
        return this.f15911j;
    }

    public boolean equals(Object obj) {
        Long l;
        C10450a0.C10460e.C10489f fVar;
        C10450a0.C10460e.C10487e eVar;
        C10450a0.C10460e.C10465c cVar;
        C10494b0<C10450a0.C10460e.C10467d> b0Var;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10450a0.C10460e)) {
            return false;
        }
        C10450a0.C10460e eVar2 = (C10450a0.C10460e) obj;
        if (!this.f15902a.equals(eVar2.mo45193f()) || !this.f15903b.equals(eVar2.mo45195h()) || this.f15904c != eVar2.mo45198k() || ((l = this.f15905d) != null ? !l.equals(eVar2.mo45191d()) : eVar2.mo45191d() != null) || this.f15906e != eVar2.mo45200m() || !this.f15907f.equals(eVar2.mo45189b()) || ((fVar = this.f15908g) != null ? !fVar.equals(eVar2.mo45199l()) : eVar2.mo45199l() != null) || ((eVar = this.f15909h) != null ? !eVar.equals(eVar2.mo45197j()) : eVar2.mo45197j() != null) || ((cVar = this.f15910i) != null ? !cVar.equals(eVar2.mo45190c()) : eVar2.mo45190c() != null) || ((b0Var = this.f15911j) != null ? !b0Var.equals(eVar2.mo45192e()) : eVar2.mo45192e() != null) || this.f15912k != eVar2.mo45194g()) {
            return false;
        }
        return true;
    }

    @NonNull
    /* renamed from: f */
    public String mo45193f() {
        return this.f15902a;
    }

    /* renamed from: g */
    public int mo45194g() {
        return this.f15912k;
    }

    @NonNull
    /* renamed from: h */
    public String mo45195h() {
        return this.f15903b;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        long j = this.f15904c;
        int hashCode = (((((this.f15902a.hashCode() ^ 1000003) * 1000003) ^ this.f15903b.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        Long l = this.f15905d;
        int i6 = 0;
        if (l == null) {
            i = 0;
        } else {
            i = l.hashCode();
        }
        int i7 = (hashCode ^ i) * 1000003;
        if (this.f15906e) {
            i2 = 1231;
        } else {
            i2 = 1237;
        }
        int hashCode2 = (((i7 ^ i2) * 1000003) ^ this.f15907f.hashCode()) * 1000003;
        C10450a0.C10460e.C10489f fVar = this.f15908g;
        if (fVar == null) {
            i3 = 0;
        } else {
            i3 = fVar.hashCode();
        }
        int i8 = (hashCode2 ^ i3) * 1000003;
        C10450a0.C10460e.C10487e eVar = this.f15909h;
        if (eVar == null) {
            i4 = 0;
        } else {
            i4 = eVar.hashCode();
        }
        int i9 = (i8 ^ i4) * 1000003;
        C10450a0.C10460e.C10465c cVar = this.f15910i;
        if (cVar == null) {
            i5 = 0;
        } else {
            i5 = cVar.hashCode();
        }
        int i10 = (i9 ^ i5) * 1000003;
        C10494b0<C10450a0.C10460e.C10467d> b0Var = this.f15911j;
        if (b0Var != null) {
            i6 = b0Var.hashCode();
        }
        return ((i10 ^ i6) * 1000003) ^ this.f15912k;
    }

    @Nullable
    /* renamed from: j */
    public C10450a0.C10460e.C10487e mo45197j() {
        return this.f15909h;
    }

    /* renamed from: k */
    public long mo45198k() {
        return this.f15904c;
    }

    @Nullable
    /* renamed from: l */
    public C10450a0.C10460e.C10489f mo45199l() {
        return this.f15908g;
    }

    /* renamed from: m */
    public boolean mo45200m() {
        return this.f15906e;
    }

    /* renamed from: n */
    public C10450a0.C10460e.C10464b mo45201n() {
        return new C10513b(this);
    }

    public String toString() {
        return "Session{generator=" + this.f15902a + ", identifier=" + this.f15903b + ", startedAt=" + this.f15904c + ", endedAt=" + this.f15905d + ", crashed=" + this.f15906e + ", app=" + this.f15907f + ", user=" + this.f15908g + ", os=" + this.f15909h + ", device=" + this.f15910i + ", events=" + this.f15911j + ", generatorType=" + this.f15912k + "}";
    }

    private C10511g(String str, String str2, long j, @Nullable Long l, boolean z, C10450a0.C10460e.C10461a aVar, @Nullable C10450a0.C10460e.C10489f fVar, @Nullable C10450a0.C10460e.C10487e eVar, @Nullable C10450a0.C10460e.C10465c cVar, @Nullable C10494b0<C10450a0.C10460e.C10467d> b0Var, int i) {
        this.f15902a = str;
        this.f15903b = str2;
        this.f15904c = j;
        this.f15905d = l;
        this.f15906e = z;
        this.f15907f = aVar;
        this.f15908g = fVar;
        this.f15909h = eVar;
        this.f15910i = cVar;
        this.f15911j = b0Var;
        this.f15912k = i;
    }
}
