package p277x6;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p277x6.C10450a0;

/* renamed from: x6.r */
/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame */
final class C10542r extends C10450a0.C10460e.C10467d.C10468a.C10470b.C10478e.C10480b {

    /* renamed from: a */
    private final long f16017a;

    /* renamed from: b */
    private final String f16018b;

    /* renamed from: c */
    private final String f16019c;

    /* renamed from: d */
    private final long f16020d;

    /* renamed from: e */
    private final int f16021e;

    /* renamed from: x6.r$b */
    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame */
    static final class C10544b extends C10450a0.C10460e.C10467d.C10468a.C10470b.C10478e.C10480b.C10481a {

        /* renamed from: a */
        private Long f16022a;

        /* renamed from: b */
        private String f16023b;

        /* renamed from: c */
        private String f16024c;

        /* renamed from: d */
        private Long f16025d;

        /* renamed from: e */
        private Integer f16026e;

        C10544b() {
        }

        /* renamed from: a */
        public C10450a0.C10460e.C10467d.C10468a.C10470b.C10478e.C10480b mo45321a() {
            String str = "";
            if (this.f16022a == null) {
                str = str + " pc";
            }
            if (this.f16023b == null) {
                str = str + " symbol";
            }
            if (this.f16025d == null) {
                str = str + " offset";
            }
            if (this.f16026e == null) {
                str = str + " importance";
            }
            if (str.isEmpty()) {
                return new C10542r(this.f16022a.longValue(), this.f16023b, this.f16024c, this.f16025d.longValue(), this.f16026e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C10450a0.C10460e.C10467d.C10468a.C10470b.C10478e.C10480b.C10481a mo45322b(String str) {
            this.f16024c = str;
            return this;
        }

        /* renamed from: c */
        public C10450a0.C10460e.C10467d.C10468a.C10470b.C10478e.C10480b.C10481a mo45323c(int i) {
            this.f16026e = Integer.valueOf(i);
            return this;
        }

        /* renamed from: d */
        public C10450a0.C10460e.C10467d.C10468a.C10470b.C10478e.C10480b.C10481a mo45324d(long j) {
            this.f16025d = Long.valueOf(j);
            return this;
        }

        /* renamed from: e */
        public C10450a0.C10460e.C10467d.C10468a.C10470b.C10478e.C10480b.C10481a mo45325e(long j) {
            this.f16022a = Long.valueOf(j);
            return this;
        }

        /* renamed from: f */
        public C10450a0.C10460e.C10467d.C10468a.C10470b.C10478e.C10480b.C10481a mo45326f(String str) {
            if (str != null) {
                this.f16023b = str;
                return this;
            }
            throw new NullPointerException("Null symbol");
        }
    }

    @Nullable
    /* renamed from: b */
    public String mo45316b() {
        return this.f16019c;
    }

    /* renamed from: c */
    public int mo45317c() {
        return this.f16021e;
    }

    /* renamed from: d */
    public long mo45318d() {
        return this.f16020d;
    }

    /* renamed from: e */
    public long mo45319e() {
        return this.f16017a;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10450a0.C10460e.C10467d.C10468a.C10470b.C10478e.C10480b)) {
            return false;
        }
        C10450a0.C10460e.C10467d.C10468a.C10470b.C10478e.C10480b bVar = (C10450a0.C10460e.C10467d.C10468a.C10470b.C10478e.C10480b) obj;
        if (this.f16017a == bVar.mo45319e() && this.f16018b.equals(bVar.mo45320f()) && ((str = this.f16019c) != null ? str.equals(bVar.mo45316b()) : bVar.mo45316b() == null) && this.f16020d == bVar.mo45318d() && this.f16021e == bVar.mo45317c()) {
            return true;
        }
        return false;
    }

    @NonNull
    /* renamed from: f */
    public String mo45320f() {
        return this.f16018b;
    }

    public int hashCode() {
        int i;
        long j = this.f16017a;
        int hashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f16018b.hashCode()) * 1000003;
        String str = this.f16019c;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        long j2 = this.f16020d;
        return ((((hashCode ^ i) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f16021e;
    }

    public String toString() {
        return "Frame{pc=" + this.f16017a + ", symbol=" + this.f16018b + ", file=" + this.f16019c + ", offset=" + this.f16020d + ", importance=" + this.f16021e + "}";
    }

    private C10542r(long j, String str, @Nullable String str2, long j2, int i) {
        this.f16017a = j;
        this.f16018b = str;
        this.f16019c = str2;
        this.f16020d = j2;
        this.f16021e = i;
    }
}
