package p144k8;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p144k8.C8589c;
import p144k8.C8591d;

/* renamed from: k8.a */
/* compiled from: AutoValue_PersistedInstallationEntry */
final class C8585a extends C8591d {

    /* renamed from: b */
    private final String f12255b;

    /* renamed from: c */
    private final C8589c.C8590a f12256c;

    /* renamed from: d */
    private final String f12257d;

    /* renamed from: e */
    private final String f12258e;

    /* renamed from: f */
    private final long f12259f;

    /* renamed from: g */
    private final long f12260g;

    /* renamed from: h */
    private final String f12261h;

    /* renamed from: k8.a$b */
    /* compiled from: AutoValue_PersistedInstallationEntry */
    static final class C8587b extends C8591d.C8592a {

        /* renamed from: a */
        private String f12262a;

        /* renamed from: b */
        private C8589c.C8590a f12263b;

        /* renamed from: c */
        private String f12264c;

        /* renamed from: d */
        private String f12265d;

        /* renamed from: e */
        private Long f12266e;

        /* renamed from: f */
        private Long f12267f;

        /* renamed from: g */
        private String f12268g;

        /* renamed from: a */
        public C8591d mo42657a() {
            String str = "";
            if (this.f12263b == null) {
                str = str + " registrationStatus";
            }
            if (this.f12266e == null) {
                str = str + " expiresInSecs";
            }
            if (this.f12267f == null) {
                str = str + " tokenCreationEpochInSecs";
            }
            if (str.isEmpty()) {
                return new C8585a(this.f12262a, this.f12263b, this.f12264c, this.f12265d, this.f12266e.longValue(), this.f12267f.longValue(), this.f12268g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C8591d.C8592a mo42658b(@Nullable String str) {
            this.f12264c = str;
            return this;
        }

        /* renamed from: c */
        public C8591d.C8592a mo42659c(long j) {
            this.f12266e = Long.valueOf(j);
            return this;
        }

        /* renamed from: d */
        public C8591d.C8592a mo42660d(String str) {
            this.f12262a = str;
            return this;
        }

        /* renamed from: e */
        public C8591d.C8592a mo42661e(@Nullable String str) {
            this.f12268g = str;
            return this;
        }

        /* renamed from: f */
        public C8591d.C8592a mo42662f(@Nullable String str) {
            this.f12265d = str;
            return this;
        }

        /* renamed from: g */
        public C8591d.C8592a mo42663g(C8589c.C8590a aVar) {
            if (aVar != null) {
                this.f12263b = aVar;
                return this;
            }
            throw new NullPointerException("Null registrationStatus");
        }

        /* renamed from: h */
        public C8591d.C8592a mo42664h(long j) {
            this.f12267f = Long.valueOf(j);
            return this;
        }

        C8587b() {
        }

        private C8587b(C8591d dVar) {
            this.f12262a = dVar.mo42648d();
            this.f12263b = dVar.mo42652g();
            this.f12264c = dVar.mo42646b();
            this.f12265d = dVar.mo42651f();
            this.f12266e = Long.valueOf(dVar.mo42647c());
            this.f12267f = Long.valueOf(dVar.mo42653h());
            this.f12268g = dVar.mo42649e();
        }
    }

    @Nullable
    /* renamed from: b */
    public String mo42646b() {
        return this.f12257d;
    }

    /* renamed from: c */
    public long mo42647c() {
        return this.f12259f;
    }

    @Nullable
    /* renamed from: d */
    public String mo42648d() {
        return this.f12255b;
    }

    @Nullable
    /* renamed from: e */
    public String mo42649e() {
        return this.f12261h;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8591d)) {
            return false;
        }
        C8591d dVar = (C8591d) obj;
        String str3 = this.f12255b;
        if (str3 != null ? str3.equals(dVar.mo42648d()) : dVar.mo42648d() == null) {
            if (this.f12256c.equals(dVar.mo42652g()) && ((str = this.f12257d) != null ? str.equals(dVar.mo42646b()) : dVar.mo42646b() == null) && ((str2 = this.f12258e) != null ? str2.equals(dVar.mo42651f()) : dVar.mo42651f() == null) && this.f12259f == dVar.mo42647c() && this.f12260g == dVar.mo42653h()) {
                String str4 = this.f12261h;
                if (str4 == null) {
                    if (dVar.mo42649e() == null) {
                        return true;
                    }
                } else if (str4.equals(dVar.mo42649e())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Nullable
    /* renamed from: f */
    public String mo42651f() {
        return this.f12258e;
    }

    @NonNull
    /* renamed from: g */
    public C8589c.C8590a mo42652g() {
        return this.f12256c;
    }

    /* renamed from: h */
    public long mo42653h() {
        return this.f12260g;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        String str = this.f12255b;
        int i4 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int hashCode = (((i ^ 1000003) * 1000003) ^ this.f12256c.hashCode()) * 1000003;
        String str2 = this.f12257d;
        if (str2 == null) {
            i2 = 0;
        } else {
            i2 = str2.hashCode();
        }
        int i5 = (hashCode ^ i2) * 1000003;
        String str3 = this.f12258e;
        if (str3 == null) {
            i3 = 0;
        } else {
            i3 = str3.hashCode();
        }
        long j = this.f12259f;
        long j2 = this.f12260g;
        int i6 = (((((i5 ^ i3) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str4 = this.f12261h;
        if (str4 != null) {
            i4 = str4.hashCode();
        }
        return i6 ^ i4;
    }

    /* renamed from: n */
    public C8591d.C8592a mo42655n() {
        return new C8587b(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.f12255b + ", registrationStatus=" + this.f12256c + ", authToken=" + this.f12257d + ", refreshToken=" + this.f12258e + ", expiresInSecs=" + this.f12259f + ", tokenCreationEpochInSecs=" + this.f12260g + ", fisError=" + this.f12261h + "}";
    }

    private C8585a(@Nullable String str, C8589c.C8590a aVar, @Nullable String str2, @Nullable String str3, long j, long j2, @Nullable String str4) {
        this.f12255b = str;
        this.f12256c = aVar;
        this.f12257d = str2;
        this.f12258e = str3;
        this.f12259f = j;
        this.f12260g = j2;
        this.f12261h = str4;
    }
}
