package p277x6;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p277x6.C10450a0;

/* renamed from: x6.m */
/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution */
final class C10527m extends C10450a0.C10460e.C10467d.C10468a.C10470b {

    /* renamed from: a */
    private final C10494b0<C10450a0.C10460e.C10467d.C10468a.C10470b.C10478e> f15977a;

    /* renamed from: b */
    private final C10450a0.C10460e.C10467d.C10468a.C10470b.C10474c f15978b;

    /* renamed from: c */
    private final C10450a0.C10451a f15979c;

    /* renamed from: d */
    private final C10450a0.C10460e.C10467d.C10468a.C10470b.C10476d f15980d;

    /* renamed from: e */
    private final C10494b0<C10450a0.C10460e.C10467d.C10468a.C10470b.C10471a> f15981e;

    /* renamed from: x6.m$b */
    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution */
    static final class C10529b extends C10450a0.C10460e.C10467d.C10468a.C10470b.C10473b {

        /* renamed from: a */
        private C10494b0<C10450a0.C10460e.C10467d.C10468a.C10470b.C10478e> f15982a;

        /* renamed from: b */
        private C10450a0.C10460e.C10467d.C10468a.C10470b.C10474c f15983b;

        /* renamed from: c */
        private C10450a0.C10451a f15984c;

        /* renamed from: d */
        private C10450a0.C10460e.C10467d.C10468a.C10470b.C10476d f15985d;

        /* renamed from: e */
        private C10494b0<C10450a0.C10460e.C10467d.C10468a.C10470b.C10471a> f15986e;

        C10529b() {
        }

        /* renamed from: a */
        public C10450a0.C10460e.C10467d.C10468a.C10470b mo45285a() {
            String str = "";
            if (this.f15985d == null) {
                str = str + " signal";
            }
            if (this.f15986e == null) {
                str = str + " binaries";
            }
            if (str.isEmpty()) {
                return new C10527m(this.f15982a, this.f15983b, this.f15984c, this.f15985d, this.f15986e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C10450a0.C10460e.C10467d.C10468a.C10470b.C10473b mo45286b(C10450a0.C10451a aVar) {
            this.f15984c = aVar;
            return this;
        }

        /* renamed from: c */
        public C10450a0.C10460e.C10467d.C10468a.C10470b.C10473b mo45287c(C10494b0<C10450a0.C10460e.C10467d.C10468a.C10470b.C10471a> b0Var) {
            if (b0Var != null) {
                this.f15986e = b0Var;
                return this;
            }
            throw new NullPointerException("Null binaries");
        }

        /* renamed from: d */
        public C10450a0.C10460e.C10467d.C10468a.C10470b.C10473b mo45288d(C10450a0.C10460e.C10467d.C10468a.C10470b.C10474c cVar) {
            this.f15983b = cVar;
            return this;
        }

        /* renamed from: e */
        public C10450a0.C10460e.C10467d.C10468a.C10470b.C10473b mo45289e(C10450a0.C10460e.C10467d.C10468a.C10470b.C10476d dVar) {
            if (dVar != null) {
                this.f15985d = dVar;
                return this;
            }
            throw new NullPointerException("Null signal");
        }

        /* renamed from: f */
        public C10450a0.C10460e.C10467d.C10468a.C10470b.C10473b mo45290f(C10494b0<C10450a0.C10460e.C10467d.C10468a.C10470b.C10478e> b0Var) {
            this.f15982a = b0Var;
            return this;
        }
    }

    @Nullable
    /* renamed from: b */
    public C10450a0.C10451a mo45269b() {
        return this.f15979c;
    }

    @NonNull
    /* renamed from: c */
    public C10494b0<C10450a0.C10460e.C10467d.C10468a.C10470b.C10471a> mo45270c() {
        return this.f15981e;
    }

    @Nullable
    /* renamed from: d */
    public C10450a0.C10460e.C10467d.C10468a.C10470b.C10474c mo45271d() {
        return this.f15978b;
    }

    @NonNull
    /* renamed from: e */
    public C10450a0.C10460e.C10467d.C10468a.C10470b.C10476d mo45272e() {
        return this.f15980d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10450a0.C10460e.C10467d.C10468a.C10470b)) {
            return false;
        }
        C10450a0.C10460e.C10467d.C10468a.C10470b bVar = (C10450a0.C10460e.C10467d.C10468a.C10470b) obj;
        C10494b0<C10450a0.C10460e.C10467d.C10468a.C10470b.C10478e> b0Var = this.f15977a;
        if (b0Var != null ? b0Var.equals(bVar.mo45273f()) : bVar.mo45273f() == null) {
            C10450a0.C10460e.C10467d.C10468a.C10470b.C10474c cVar = this.f15978b;
            if (cVar != null ? cVar.equals(bVar.mo45271d()) : bVar.mo45271d() == null) {
                C10450a0.C10451a aVar = this.f15979c;
                if (aVar != null ? aVar.equals(bVar.mo45269b()) : bVar.mo45269b() == null) {
                    if (this.f15980d.equals(bVar.mo45272e()) && this.f15981e.equals(bVar.mo45270c())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Nullable
    /* renamed from: f */
    public C10494b0<C10450a0.C10460e.C10467d.C10468a.C10470b.C10478e> mo45273f() {
        return this.f15977a;
    }

    public int hashCode() {
        int i;
        int i2;
        C10494b0<C10450a0.C10460e.C10467d.C10468a.C10470b.C10478e> b0Var = this.f15977a;
        int i3 = 0;
        if (b0Var == null) {
            i = 0;
        } else {
            i = b0Var.hashCode();
        }
        int i4 = (i ^ 1000003) * 1000003;
        C10450a0.C10460e.C10467d.C10468a.C10470b.C10474c cVar = this.f15978b;
        if (cVar == null) {
            i2 = 0;
        } else {
            i2 = cVar.hashCode();
        }
        int i5 = (i4 ^ i2) * 1000003;
        C10450a0.C10451a aVar = this.f15979c;
        if (aVar != null) {
            i3 = aVar.hashCode();
        }
        return ((((i5 ^ i3) * 1000003) ^ this.f15980d.hashCode()) * 1000003) ^ this.f15981e.hashCode();
    }

    public String toString() {
        return "Execution{threads=" + this.f15977a + ", exception=" + this.f15978b + ", appExitInfo=" + this.f15979c + ", signal=" + this.f15980d + ", binaries=" + this.f15981e + "}";
    }

    private C10527m(@Nullable C10494b0<C10450a0.C10460e.C10467d.C10468a.C10470b.C10478e> b0Var, @Nullable C10450a0.C10460e.C10467d.C10468a.C10470b.C10474c cVar, @Nullable C10450a0.C10451a aVar, C10450a0.C10460e.C10467d.C10468a.C10470b.C10476d dVar, C10494b0<C10450a0.C10460e.C10467d.C10468a.C10470b.C10471a> b0Var2) {
        this.f15977a = b0Var;
        this.f15978b = cVar;
        this.f15979c = aVar;
        this.f15980d = dVar;
        this.f15981e = b0Var2;
    }
}
