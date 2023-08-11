package p277x6;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p277x6.C10450a0;

/* renamed from: x6.k */
/* compiled from: AutoValue_CrashlyticsReport_Session_Event */
final class C10521k extends C10450a0.C10460e.C10467d {

    /* renamed from: a */
    private final long f15957a;

    /* renamed from: b */
    private final String f15958b;

    /* renamed from: c */
    private final C10450a0.C10460e.C10467d.C10468a f15959c;

    /* renamed from: d */
    private final C10450a0.C10460e.C10467d.C10483c f15960d;

    /* renamed from: e */
    private final C10450a0.C10460e.C10467d.C10485d f15961e;

    /* renamed from: x6.k$b */
    /* compiled from: AutoValue_CrashlyticsReport_Session_Event */
    static final class C10523b extends C10450a0.C10460e.C10467d.C10482b {

        /* renamed from: a */
        private Long f15962a;

        /* renamed from: b */
        private String f15963b;

        /* renamed from: c */
        private C10450a0.C10460e.C10467d.C10468a f15964c;

        /* renamed from: d */
        private C10450a0.C10460e.C10467d.C10483c f15965d;

        /* renamed from: e */
        private C10450a0.C10460e.C10467d.C10485d f15966e;

        /* renamed from: a */
        public C10450a0.C10460e.C10467d mo45327a() {
            String str = "";
            if (this.f15962a == null) {
                str = str + " timestamp";
            }
            if (this.f15963b == null) {
                str = str + " type";
            }
            if (this.f15964c == null) {
                str = str + " app";
            }
            if (this.f15965d == null) {
                str = str + " device";
            }
            if (str.isEmpty()) {
                return new C10521k(this.f15962a.longValue(), this.f15963b, this.f15964c, this.f15965d, this.f15966e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C10450a0.C10460e.C10467d.C10482b mo45328b(C10450a0.C10460e.C10467d.C10468a aVar) {
            if (aVar != null) {
                this.f15964c = aVar;
                return this;
            }
            throw new NullPointerException("Null app");
        }

        /* renamed from: c */
        public C10450a0.C10460e.C10467d.C10482b mo45329c(C10450a0.C10460e.C10467d.C10483c cVar) {
            if (cVar != null) {
                this.f15965d = cVar;
                return this;
            }
            throw new NullPointerException("Null device");
        }

        /* renamed from: d */
        public C10450a0.C10460e.C10467d.C10482b mo45330d(C10450a0.C10460e.C10467d.C10485d dVar) {
            this.f15966e = dVar;
            return this;
        }

        /* renamed from: e */
        public C10450a0.C10460e.C10467d.C10482b mo45331e(long j) {
            this.f15962a = Long.valueOf(j);
            return this;
        }

        /* renamed from: f */
        public C10450a0.C10460e.C10467d.C10482b mo45332f(String str) {
            if (str != null) {
                this.f15963b = str;
                return this;
            }
            throw new NullPointerException("Null type");
        }

        C10523b() {
        }

        private C10523b(C10450a0.C10460e.C10467d dVar) {
            this.f15962a = Long.valueOf(dVar.mo45254e());
            this.f15963b = dVar.mo45255f();
            this.f15964c = dVar.mo45251b();
            this.f15965d = dVar.mo45252c();
            this.f15966e = dVar.mo45253d();
        }
    }

    @NonNull
    /* renamed from: b */
    public C10450a0.C10460e.C10467d.C10468a mo45251b() {
        return this.f15959c;
    }

    @NonNull
    /* renamed from: c */
    public C10450a0.C10460e.C10467d.C10483c mo45252c() {
        return this.f15960d;
    }

    @Nullable
    /* renamed from: d */
    public C10450a0.C10460e.C10467d.C10485d mo45253d() {
        return this.f15961e;
    }

    /* renamed from: e */
    public long mo45254e() {
        return this.f15957a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10450a0.C10460e.C10467d)) {
            return false;
        }
        C10450a0.C10460e.C10467d dVar = (C10450a0.C10460e.C10467d) obj;
        if (this.f15957a == dVar.mo45254e() && this.f15958b.equals(dVar.mo45255f()) && this.f15959c.equals(dVar.mo45251b()) && this.f15960d.equals(dVar.mo45252c())) {
            C10450a0.C10460e.C10467d.C10485d dVar2 = this.f15961e;
            if (dVar2 == null) {
                if (dVar.mo45253d() == null) {
                    return true;
                }
            } else if (dVar2.equals(dVar.mo45253d())) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    /* renamed from: f */
    public String mo45255f() {
        return this.f15958b;
    }

    /* renamed from: g */
    public C10450a0.C10460e.C10467d.C10482b mo45256g() {
        return new C10523b(this);
    }

    public int hashCode() {
        int i;
        long j = this.f15957a;
        int hashCode = (((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f15958b.hashCode()) * 1000003) ^ this.f15959c.hashCode()) * 1000003) ^ this.f15960d.hashCode()) * 1000003;
        C10450a0.C10460e.C10467d.C10485d dVar = this.f15961e;
        if (dVar == null) {
            i = 0;
        } else {
            i = dVar.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "Event{timestamp=" + this.f15957a + ", type=" + this.f15958b + ", app=" + this.f15959c + ", device=" + this.f15960d + ", log=" + this.f15961e + "}";
    }

    private C10521k(long j, String str, C10450a0.C10460e.C10467d.C10468a aVar, C10450a0.C10460e.C10467d.C10483c cVar, @Nullable C10450a0.C10460e.C10467d.C10485d dVar) {
        this.f15957a = j;
        this.f15958b = str;
        this.f15959c = aVar;
        this.f15960d = cVar;
        this.f15961e = dVar;
    }
}
