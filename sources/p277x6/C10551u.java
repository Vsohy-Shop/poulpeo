package p277x6;

import androidx.annotation.NonNull;
import p277x6.C10450a0;

/* renamed from: x6.u */
/* compiled from: AutoValue_CrashlyticsReport_Session_OperatingSystem */
final class C10551u extends C10450a0.C10460e.C10487e {

    /* renamed from: a */
    private final int f16041a;

    /* renamed from: b */
    private final String f16042b;

    /* renamed from: c */
    private final String f16043c;

    /* renamed from: d */
    private final boolean f16044d;

    /* renamed from: x6.u$b */
    /* compiled from: AutoValue_CrashlyticsReport_Session_OperatingSystem */
    static final class C10553b extends C10450a0.C10460e.C10487e.C10488a {

        /* renamed from: a */
        private Integer f16045a;

        /* renamed from: b */
        private String f16046b;

        /* renamed from: c */
        private String f16047c;

        /* renamed from: d */
        private Boolean f16048d;

        C10553b() {
        }

        /* renamed from: a */
        public C10450a0.C10460e.C10487e mo45353a() {
            String str = "";
            if (this.f16045a == null) {
                str = str + " platform";
            }
            if (this.f16046b == null) {
                str = str + " version";
            }
            if (this.f16047c == null) {
                str = str + " buildVersion";
            }
            if (this.f16048d == null) {
                str = str + " jailbroken";
            }
            if (str.isEmpty()) {
                return new C10551u(this.f16045a.intValue(), this.f16046b, this.f16047c, this.f16048d.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C10450a0.C10460e.C10487e.C10488a mo45354b(String str) {
            if (str != null) {
                this.f16047c = str;
                return this;
            }
            throw new NullPointerException("Null buildVersion");
        }

        /* renamed from: c */
        public C10450a0.C10460e.C10487e.C10488a mo45355c(boolean z) {
            this.f16048d = Boolean.valueOf(z);
            return this;
        }

        /* renamed from: d */
        public C10450a0.C10460e.C10487e.C10488a mo45356d(int i) {
            this.f16045a = Integer.valueOf(i);
            return this;
        }

        /* renamed from: e */
        public C10450a0.C10460e.C10487e.C10488a mo45357e(String str) {
            if (str != null) {
                this.f16046b = str;
                return this;
            }
            throw new NullPointerException("Null version");
        }
    }

    @NonNull
    /* renamed from: b */
    public String mo45349b() {
        return this.f16043c;
    }

    /* renamed from: c */
    public int mo45350c() {
        return this.f16041a;
    }

    @NonNull
    /* renamed from: d */
    public String mo45351d() {
        return this.f16042b;
    }

    /* renamed from: e */
    public boolean mo45352e() {
        return this.f16044d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10450a0.C10460e.C10487e)) {
            return false;
        }
        C10450a0.C10460e.C10487e eVar = (C10450a0.C10460e.C10487e) obj;
        if (this.f16041a != eVar.mo45350c() || !this.f16042b.equals(eVar.mo45351d()) || !this.f16043c.equals(eVar.mo45349b()) || this.f16044d != eVar.mo45352e()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        int hashCode = (((((this.f16041a ^ 1000003) * 1000003) ^ this.f16042b.hashCode()) * 1000003) ^ this.f16043c.hashCode()) * 1000003;
        if (this.f16044d) {
            i = 1231;
        } else {
            i = 1237;
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "OperatingSystem{platform=" + this.f16041a + ", version=" + this.f16042b + ", buildVersion=" + this.f16043c + ", jailbroken=" + this.f16044d + "}";
    }

    private C10551u(int i, String str, String str2, boolean z) {
        this.f16041a = i;
        this.f16042b = str;
        this.f16043c = str2;
        this.f16044d = z;
    }
}
