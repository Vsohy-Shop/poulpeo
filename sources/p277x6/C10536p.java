package p277x6;

import androidx.annotation.NonNull;
import p277x6.C10450a0;

/* renamed from: x6.p */
/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal */
final class C10536p extends C10450a0.C10460e.C10467d.C10468a.C10470b.C10476d {

    /* renamed from: a */
    private final String f16005a;

    /* renamed from: b */
    private final String f16006b;

    /* renamed from: c */
    private final long f16007c;

    /* renamed from: x6.p$b */
    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal */
    static final class C10538b extends C10450a0.C10460e.C10467d.C10468a.C10470b.C10476d.C10477a {

        /* renamed from: a */
        private String f16008a;

        /* renamed from: b */
        private String f16009b;

        /* renamed from: c */
        private Long f16010c;

        C10538b() {
        }

        /* renamed from: a */
        public C10450a0.C10460e.C10467d.C10468a.C10470b.C10476d mo45305a() {
            String str = "";
            if (this.f16008a == null) {
                str = str + " name";
            }
            if (this.f16009b == null) {
                str = str + " code";
            }
            if (this.f16010c == null) {
                str = str + " address";
            }
            if (str.isEmpty()) {
                return new C10536p(this.f16008a, this.f16009b, this.f16010c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C10450a0.C10460e.C10467d.C10468a.C10470b.C10476d.C10477a mo45306b(long j) {
            this.f16010c = Long.valueOf(j);
            return this;
        }

        /* renamed from: c */
        public C10450a0.C10460e.C10467d.C10468a.C10470b.C10476d.C10477a mo45307c(String str) {
            if (str != null) {
                this.f16009b = str;
                return this;
            }
            throw new NullPointerException("Null code");
        }

        /* renamed from: d */
        public C10450a0.C10460e.C10467d.C10468a.C10470b.C10476d.C10477a mo45308d(String str) {
            if (str != null) {
                this.f16008a = str;
                return this;
            }
            throw new NullPointerException("Null name");
        }
    }

    @NonNull
    /* renamed from: b */
    public long mo45302b() {
        return this.f16007c;
    }

    @NonNull
    /* renamed from: c */
    public String mo45303c() {
        return this.f16006b;
    }

    @NonNull
    /* renamed from: d */
    public String mo45304d() {
        return this.f16005a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10450a0.C10460e.C10467d.C10468a.C10470b.C10476d)) {
            return false;
        }
        C10450a0.C10460e.C10467d.C10468a.C10470b.C10476d dVar = (C10450a0.C10460e.C10467d.C10468a.C10470b.C10476d) obj;
        if (!this.f16005a.equals(dVar.mo45304d()) || !this.f16006b.equals(dVar.mo45303c()) || this.f16007c != dVar.mo45302b()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.f16007c;
        return ((((this.f16005a.hashCode() ^ 1000003) * 1000003) ^ this.f16006b.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "Signal{name=" + this.f16005a + ", code=" + this.f16006b + ", address=" + this.f16007c + "}";
    }

    private C10536p(String str, String str2, long j) {
        this.f16005a = str;
        this.f16006b = str2;
        this.f16007c = j;
    }
}
