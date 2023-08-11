package p277x6;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p277x6.C10450a0;

/* renamed from: x6.n */
/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage */
final class C10530n extends C10450a0.C10460e.C10467d.C10468a.C10470b.C10471a {

    /* renamed from: a */
    private final long f15987a;

    /* renamed from: b */
    private final long f15988b;

    /* renamed from: c */
    private final String f15989c;

    /* renamed from: d */
    private final String f15990d;

    /* renamed from: x6.n$b */
    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage */
    static final class C10532b extends C10450a0.C10460e.C10467d.C10468a.C10470b.C10471a.C10472a {

        /* renamed from: a */
        private Long f15991a;

        /* renamed from: b */
        private Long f15992b;

        /* renamed from: c */
        private String f15993c;

        /* renamed from: d */
        private String f15994d;

        C10532b() {
        }

        /* renamed from: a */
        public C10450a0.C10460e.C10467d.C10468a.C10470b.C10471a mo45279a() {
            String str = "";
            if (this.f15991a == null) {
                str = str + " baseAddress";
            }
            if (this.f15992b == null) {
                str = str + " size";
            }
            if (this.f15993c == null) {
                str = str + " name";
            }
            if (str.isEmpty()) {
                return new C10530n(this.f15991a.longValue(), this.f15992b.longValue(), this.f15993c, this.f15994d);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C10450a0.C10460e.C10467d.C10468a.C10470b.C10471a.C10472a mo45280b(long j) {
            this.f15991a = Long.valueOf(j);
            return this;
        }

        /* renamed from: c */
        public C10450a0.C10460e.C10467d.C10468a.C10470b.C10471a.C10472a mo45281c(String str) {
            if (str != null) {
                this.f15993c = str;
                return this;
            }
            throw new NullPointerException("Null name");
        }

        /* renamed from: d */
        public C10450a0.C10460e.C10467d.C10468a.C10470b.C10471a.C10472a mo45282d(long j) {
            this.f15992b = Long.valueOf(j);
            return this;
        }

        /* renamed from: e */
        public C10450a0.C10460e.C10467d.C10468a.C10470b.C10471a.C10472a mo45283e(@Nullable String str) {
            this.f15994d = str;
            return this;
        }
    }

    @NonNull
    /* renamed from: b */
    public long mo45274b() {
        return this.f15987a;
    }

    @NonNull
    /* renamed from: c */
    public String mo45275c() {
        return this.f15989c;
    }

    /* renamed from: d */
    public long mo45276d() {
        return this.f15988b;
    }

    @Nullable
    /* renamed from: e */
    public String mo45277e() {
        return this.f15990d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10450a0.C10460e.C10467d.C10468a.C10470b.C10471a)) {
            return false;
        }
        C10450a0.C10460e.C10467d.C10468a.C10470b.C10471a aVar = (C10450a0.C10460e.C10467d.C10468a.C10470b.C10471a) obj;
        if (this.f15987a == aVar.mo45274b() && this.f15988b == aVar.mo45276d() && this.f15989c.equals(aVar.mo45275c())) {
            String str = this.f15990d;
            if (str == null) {
                if (aVar.mo45277e() == null) {
                    return true;
                }
            } else if (str.equals(aVar.mo45277e())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i;
        long j = this.f15987a;
        long j2 = this.f15988b;
        int hashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f15989c.hashCode()) * 1000003;
        String str = this.f15990d;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "BinaryImage{baseAddress=" + this.f15987a + ", size=" + this.f15988b + ", name=" + this.f15989c + ", uuid=" + this.f15990d + "}";
    }

    private C10530n(long j, long j2, String str, @Nullable String str2) {
        this.f15987a = j;
        this.f15988b = j2;
        this.f15989c = str;
        this.f15990d = str2;
    }
}
