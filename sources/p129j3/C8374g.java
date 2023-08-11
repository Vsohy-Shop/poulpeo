package p129j3;

import androidx.annotation.Nullable;
import java.util.List;
import p129j3.C8387m;

/* renamed from: j3.g */
/* compiled from: AutoValue_LogRequest */
final class C8374g extends C8387m {

    /* renamed from: a */
    private final long f11868a;

    /* renamed from: b */
    private final long f11869b;

    /* renamed from: c */
    private final C8382k f11870c;

    /* renamed from: d */
    private final Integer f11871d;

    /* renamed from: e */
    private final String f11872e;

    /* renamed from: f */
    private final List<C8385l> f11873f;

    /* renamed from: g */
    private final C8394p f11874g;

    /* renamed from: j3.g$b */
    /* compiled from: AutoValue_LogRequest */
    static final class C8376b extends C8387m.C8388a {

        /* renamed from: a */
        private Long f11875a;

        /* renamed from: b */
        private Long f11876b;

        /* renamed from: c */
        private C8382k f11877c;

        /* renamed from: d */
        private Integer f11878d;

        /* renamed from: e */
        private String f11879e;

        /* renamed from: f */
        private List<C8385l> f11880f;

        /* renamed from: g */
        private C8394p f11881g;

        C8376b() {
        }

        /* renamed from: a */
        public C8387m mo42390a() {
            String str = "";
            if (this.f11875a == null) {
                str = str + " requestTimeMs";
            }
            if (this.f11876b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new C8374g(this.f11875a.longValue(), this.f11876b.longValue(), this.f11877c, this.f11878d, this.f11879e, this.f11880f, this.f11881g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C8387m.C8388a mo42391b(@Nullable C8382k kVar) {
            this.f11877c = kVar;
            return this;
        }

        /* renamed from: c */
        public C8387m.C8388a mo42392c(@Nullable List<C8385l> list) {
            this.f11880f = list;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public C8387m.C8388a mo42393d(@Nullable Integer num) {
            this.f11878d = num;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public C8387m.C8388a mo42394e(@Nullable String str) {
            this.f11879e = str;
            return this;
        }

        /* renamed from: f */
        public C8387m.C8388a mo42395f(@Nullable C8394p pVar) {
            this.f11881g = pVar;
            return this;
        }

        /* renamed from: g */
        public C8387m.C8388a mo42396g(long j) {
            this.f11875a = Long.valueOf(j);
            return this;
        }

        /* renamed from: h */
        public C8387m.C8388a mo42397h(long j) {
            this.f11876b = Long.valueOf(j);
            return this;
        }
    }

    @Nullable
    /* renamed from: b */
    public C8382k mo42380b() {
        return this.f11870c;
    }

    @Nullable
    /* renamed from: c */
    public List<C8385l> mo42381c() {
        return this.f11873f;
    }

    @Nullable
    /* renamed from: d */
    public Integer mo42382d() {
        return this.f11871d;
    }

    @Nullable
    /* renamed from: e */
    public String mo42383e() {
        return this.f11872e;
    }

    public boolean equals(Object obj) {
        C8382k kVar;
        Integer num;
        String str;
        List<C8385l> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8387m)) {
            return false;
        }
        C8387m mVar = (C8387m) obj;
        if (this.f11868a == mVar.mo42386g() && this.f11869b == mVar.mo42387h() && ((kVar = this.f11870c) != null ? kVar.equals(mVar.mo42380b()) : mVar.mo42380b() == null) && ((num = this.f11871d) != null ? num.equals(mVar.mo42382d()) : mVar.mo42382d() == null) && ((str = this.f11872e) != null ? str.equals(mVar.mo42383e()) : mVar.mo42383e() == null) && ((list = this.f11873f) != null ? list.equals(mVar.mo42381c()) : mVar.mo42381c() == null)) {
            C8394p pVar = this.f11874g;
            if (pVar == null) {
                if (mVar.mo42385f() == null) {
                    return true;
                }
            } else if (pVar.equals(mVar.mo42385f())) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    /* renamed from: f */
    public C8394p mo42385f() {
        return this.f11874g;
    }

    /* renamed from: g */
    public long mo42386g() {
        return this.f11868a;
    }

    /* renamed from: h */
    public long mo42387h() {
        return this.f11869b;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        long j = this.f11868a;
        long j2 = this.f11869b;
        int i5 = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        C8382k kVar = this.f11870c;
        int i6 = 0;
        if (kVar == null) {
            i = 0;
        } else {
            i = kVar.hashCode();
        }
        int i7 = (i5 ^ i) * 1000003;
        Integer num = this.f11871d;
        if (num == null) {
            i2 = 0;
        } else {
            i2 = num.hashCode();
        }
        int i8 = (i7 ^ i2) * 1000003;
        String str = this.f11872e;
        if (str == null) {
            i3 = 0;
        } else {
            i3 = str.hashCode();
        }
        int i9 = (i8 ^ i3) * 1000003;
        List<C8385l> list = this.f11873f;
        if (list == null) {
            i4 = 0;
        } else {
            i4 = list.hashCode();
        }
        int i10 = (i9 ^ i4) * 1000003;
        C8394p pVar = this.f11874g;
        if (pVar != null) {
            i6 = pVar.hashCode();
        }
        return i10 ^ i6;
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.f11868a + ", requestUptimeMs=" + this.f11869b + ", clientInfo=" + this.f11870c + ", logSource=" + this.f11871d + ", logSourceName=" + this.f11872e + ", logEvents=" + this.f11873f + ", qosTier=" + this.f11874g + "}";
    }

    private C8374g(long j, long j2, @Nullable C8382k kVar, @Nullable Integer num, @Nullable String str, @Nullable List<C8385l> list, @Nullable C8394p pVar) {
        this.f11868a = j;
        this.f11869b = j2;
        this.f11870c = kVar;
        this.f11871d = num;
        this.f11872e = str;
        this.f11873f = list;
        this.f11874g = pVar;
    }
}
