package p277x6;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p277x6.C10450a0;

/* renamed from: x6.l */
/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application */
final class C10524l extends C10450a0.C10460e.C10467d.C10468a {

    /* renamed from: a */
    private final C10450a0.C10460e.C10467d.C10468a.C10470b f15967a;

    /* renamed from: b */
    private final C10494b0<C10450a0.C10454c> f15968b;

    /* renamed from: c */
    private final C10494b0<C10450a0.C10454c> f15969c;

    /* renamed from: d */
    private final Boolean f15970d;

    /* renamed from: e */
    private final int f15971e;

    /* renamed from: x6.l$b */
    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application */
    static final class C10526b extends C10450a0.C10460e.C10467d.C10468a.C10469a {

        /* renamed from: a */
        private C10450a0.C10460e.C10467d.C10468a.C10470b f15972a;

        /* renamed from: b */
        private C10494b0<C10450a0.C10454c> f15973b;

        /* renamed from: c */
        private C10494b0<C10450a0.C10454c> f15974c;

        /* renamed from: d */
        private Boolean f15975d;

        /* renamed from: e */
        private Integer f15976e;

        /* renamed from: a */
        public C10450a0.C10460e.C10467d.C10468a mo45263a() {
            String str = "";
            if (this.f15972a == null) {
                str = str + " execution";
            }
            if (this.f15976e == null) {
                str = str + " uiOrientation";
            }
            if (str.isEmpty()) {
                return new C10524l(this.f15972a, this.f15973b, this.f15974c, this.f15975d, this.f15976e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C10450a0.C10460e.C10467d.C10468a.C10469a mo45264b(@Nullable Boolean bool) {
            this.f15975d = bool;
            return this;
        }

        /* renamed from: c */
        public C10450a0.C10460e.C10467d.C10468a.C10469a mo45265c(C10494b0<C10450a0.C10454c> b0Var) {
            this.f15973b = b0Var;
            return this;
        }

        /* renamed from: d */
        public C10450a0.C10460e.C10467d.C10468a.C10469a mo45266d(C10450a0.C10460e.C10467d.C10468a.C10470b bVar) {
            if (bVar != null) {
                this.f15972a = bVar;
                return this;
            }
            throw new NullPointerException("Null execution");
        }

        /* renamed from: e */
        public C10450a0.C10460e.C10467d.C10468a.C10469a mo45267e(C10494b0<C10450a0.C10454c> b0Var) {
            this.f15974c = b0Var;
            return this;
        }

        /* renamed from: f */
        public C10450a0.C10460e.C10467d.C10468a.C10469a mo45268f(int i) {
            this.f15976e = Integer.valueOf(i);
            return this;
        }

        C10526b() {
        }

        private C10526b(C10450a0.C10460e.C10467d.C10468a aVar) {
            this.f15972a = aVar.mo45259d();
            this.f15973b = aVar.mo45258c();
            this.f15974c = aVar.mo45260e();
            this.f15975d = aVar.mo45257b();
            this.f15976e = Integer.valueOf(aVar.mo45261f());
        }
    }

    @Nullable
    /* renamed from: b */
    public Boolean mo45257b() {
        return this.f15970d;
    }

    @Nullable
    /* renamed from: c */
    public C10494b0<C10450a0.C10454c> mo45258c() {
        return this.f15968b;
    }

    @NonNull
    /* renamed from: d */
    public C10450a0.C10460e.C10467d.C10468a.C10470b mo45259d() {
        return this.f15967a;
    }

    @Nullable
    /* renamed from: e */
    public C10494b0<C10450a0.C10454c> mo45260e() {
        return this.f15969c;
    }

    public boolean equals(Object obj) {
        C10494b0<C10450a0.C10454c> b0Var;
        C10494b0<C10450a0.C10454c> b0Var2;
        Boolean bool;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10450a0.C10460e.C10467d.C10468a)) {
            return false;
        }
        C10450a0.C10460e.C10467d.C10468a aVar = (C10450a0.C10460e.C10467d.C10468a) obj;
        if (!this.f15967a.equals(aVar.mo45259d()) || ((b0Var = this.f15968b) != null ? !b0Var.equals(aVar.mo45258c()) : aVar.mo45258c() != null) || ((b0Var2 = this.f15969c) != null ? !b0Var2.equals(aVar.mo45260e()) : aVar.mo45260e() != null) || ((bool = this.f15970d) != null ? !bool.equals(aVar.mo45257b()) : aVar.mo45257b() != null) || this.f15971e != aVar.mo45261f()) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public int mo45261f() {
        return this.f15971e;
    }

    /* renamed from: g */
    public C10450a0.C10460e.C10467d.C10468a.C10469a mo45262g() {
        return new C10526b(this);
    }

    public int hashCode() {
        int i;
        int i2;
        int hashCode = (this.f15967a.hashCode() ^ 1000003) * 1000003;
        C10494b0<C10450a0.C10454c> b0Var = this.f15968b;
        int i3 = 0;
        if (b0Var == null) {
            i = 0;
        } else {
            i = b0Var.hashCode();
        }
        int i4 = (hashCode ^ i) * 1000003;
        C10494b0<C10450a0.C10454c> b0Var2 = this.f15969c;
        if (b0Var2 == null) {
            i2 = 0;
        } else {
            i2 = b0Var2.hashCode();
        }
        int i5 = (i4 ^ i2) * 1000003;
        Boolean bool = this.f15970d;
        if (bool != null) {
            i3 = bool.hashCode();
        }
        return ((i5 ^ i3) * 1000003) ^ this.f15971e;
    }

    public String toString() {
        return "Application{execution=" + this.f15967a + ", customAttributes=" + this.f15968b + ", internalKeys=" + this.f15969c + ", background=" + this.f15970d + ", uiOrientation=" + this.f15971e + "}";
    }

    private C10524l(C10450a0.C10460e.C10467d.C10468a.C10470b bVar, @Nullable C10494b0<C10450a0.C10454c> b0Var, @Nullable C10494b0<C10450a0.C10454c> b0Var2, @Nullable Boolean bool, int i) {
        this.f15967a = bVar;
        this.f15968b = b0Var;
        this.f15969c = b0Var2;
        this.f15970d = bool;
        this.f15971e = i;
    }
}
