package p277x6;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p277x6.C10450a0;

/* renamed from: x6.h */
/* compiled from: AutoValue_CrashlyticsReport_Session_Application */
final class C10514h extends C10450a0.C10460e.C10461a {

    /* renamed from: a */
    private final String f15924a;

    /* renamed from: b */
    private final String f15925b;

    /* renamed from: c */
    private final String f15926c;

    /* renamed from: d */
    private final C10450a0.C10460e.C10461a.C10463b f15927d;

    /* renamed from: e */
    private final String f15928e;

    /* renamed from: f */
    private final String f15929f;

    /* renamed from: g */
    private final String f15930g;

    /* renamed from: x6.h$b */
    /* compiled from: AutoValue_CrashlyticsReport_Session_Application */
    static final class C10516b extends C10450a0.C10460e.C10461a.C10462a {

        /* renamed from: a */
        private String f15931a;

        /* renamed from: b */
        private String f15932b;

        /* renamed from: c */
        private String f15933c;

        /* renamed from: d */
        private C10450a0.C10460e.C10461a.C10463b f15934d;

        /* renamed from: e */
        private String f15935e;

        /* renamed from: f */
        private String f15936f;

        /* renamed from: g */
        private String f15937g;

        C10516b() {
        }

        /* renamed from: a */
        public C10450a0.C10460e.C10461a mo45211a() {
            String str = "";
            if (this.f15931a == null) {
                str = str + " identifier";
            }
            if (this.f15932b == null) {
                str = str + " version";
            }
            if (str.isEmpty()) {
                return new C10514h(this.f15931a, this.f15932b, this.f15933c, this.f15934d, this.f15935e, this.f15936f, this.f15937g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C10450a0.C10460e.C10461a.C10462a mo45212b(@Nullable String str) {
            this.f15936f = str;
            return this;
        }

        /* renamed from: c */
        public C10450a0.C10460e.C10461a.C10462a mo45213c(@Nullable String str) {
            this.f15937g = str;
            return this;
        }

        /* renamed from: d */
        public C10450a0.C10460e.C10461a.C10462a mo45214d(String str) {
            this.f15933c = str;
            return this;
        }

        /* renamed from: e */
        public C10450a0.C10460e.C10461a.C10462a mo45215e(String str) {
            if (str != null) {
                this.f15931a = str;
                return this;
            }
            throw new NullPointerException("Null identifier");
        }

        /* renamed from: f */
        public C10450a0.C10460e.C10461a.C10462a mo45216f(String str) {
            this.f15935e = str;
            return this;
        }

        /* renamed from: g */
        public C10450a0.C10460e.C10461a.C10462a mo45217g(String str) {
            if (str != null) {
                this.f15932b = str;
                return this;
            }
            throw new NullPointerException("Null version");
        }
    }

    @Nullable
    /* renamed from: b */
    public String mo45204b() {
        return this.f15929f;
    }

    @Nullable
    /* renamed from: c */
    public String mo45205c() {
        return this.f15930g;
    }

    @Nullable
    /* renamed from: d */
    public String mo45206d() {
        return this.f15926c;
    }

    @NonNull
    /* renamed from: e */
    public String mo45207e() {
        return this.f15924a;
    }

    public boolean equals(Object obj) {
        String str;
        C10450a0.C10460e.C10461a.C10463b bVar;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10450a0.C10460e.C10461a)) {
            return false;
        }
        C10450a0.C10460e.C10461a aVar = (C10450a0.C10460e.C10461a) obj;
        if (this.f15924a.equals(aVar.mo45207e()) && this.f15925b.equals(aVar.mo45210h()) && ((str = this.f15926c) != null ? str.equals(aVar.mo45206d()) : aVar.mo45206d() == null) && ((bVar = this.f15927d) != null ? bVar.equals(aVar.mo45209g()) : aVar.mo45209g() == null) && ((str2 = this.f15928e) != null ? str2.equals(aVar.mo45208f()) : aVar.mo45208f() == null) && ((str3 = this.f15929f) != null ? str3.equals(aVar.mo45204b()) : aVar.mo45204b() == null)) {
            String str4 = this.f15930g;
            if (str4 == null) {
                if (aVar.mo45205c() == null) {
                    return true;
                }
            } else if (str4.equals(aVar.mo45205c())) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    /* renamed from: f */
    public String mo45208f() {
        return this.f15928e;
    }

    @Nullable
    /* renamed from: g */
    public C10450a0.C10460e.C10461a.C10463b mo45209g() {
        return this.f15927d;
    }

    @NonNull
    /* renamed from: h */
    public String mo45210h() {
        return this.f15925b;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int hashCode = (((this.f15924a.hashCode() ^ 1000003) * 1000003) ^ this.f15925b.hashCode()) * 1000003;
        String str = this.f15926c;
        int i5 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i6 = (hashCode ^ i) * 1000003;
        C10450a0.C10460e.C10461a.C10463b bVar = this.f15927d;
        if (bVar == null) {
            i2 = 0;
        } else {
            i2 = bVar.hashCode();
        }
        int i7 = (i6 ^ i2) * 1000003;
        String str2 = this.f15928e;
        if (str2 == null) {
            i3 = 0;
        } else {
            i3 = str2.hashCode();
        }
        int i8 = (i7 ^ i3) * 1000003;
        String str3 = this.f15929f;
        if (str3 == null) {
            i4 = 0;
        } else {
            i4 = str3.hashCode();
        }
        int i9 = (i8 ^ i4) * 1000003;
        String str4 = this.f15930g;
        if (str4 != null) {
            i5 = str4.hashCode();
        }
        return i9 ^ i5;
    }

    public String toString() {
        return "Application{identifier=" + this.f15924a + ", version=" + this.f15925b + ", displayVersion=" + this.f15926c + ", organization=" + this.f15927d + ", installationUuid=" + this.f15928e + ", developmentPlatform=" + this.f15929f + ", developmentPlatformVersion=" + this.f15930g + "}";
    }

    private C10514h(String str, String str2, @Nullable String str3, @Nullable C10450a0.C10460e.C10461a.C10463b bVar, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        this.f15924a = str;
        this.f15925b = str2;
        this.f15926c = str3;
        this.f15927d = bVar;
        this.f15928e = str4;
        this.f15929f = str5;
        this.f15930g = str6;
    }
}
