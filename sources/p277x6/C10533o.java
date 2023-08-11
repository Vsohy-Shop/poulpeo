package p277x6;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p277x6.C10450a0;

/* renamed from: x6.o */
/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception */
final class C10533o extends C10450a0.C10460e.C10467d.C10468a.C10470b.C10474c {

    /* renamed from: a */
    private final String f15995a;

    /* renamed from: b */
    private final String f15996b;

    /* renamed from: c */
    private final C10494b0<C10450a0.C10460e.C10467d.C10468a.C10470b.C10478e.C10480b> f15997c;

    /* renamed from: d */
    private final C10450a0.C10460e.C10467d.C10468a.C10470b.C10474c f15998d;

    /* renamed from: e */
    private final int f15999e;

    /* renamed from: x6.o$b */
    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception */
    static final class C10535b extends C10450a0.C10460e.C10467d.C10468a.C10470b.C10474c.C10475a {

        /* renamed from: a */
        private String f16000a;

        /* renamed from: b */
        private String f16001b;

        /* renamed from: c */
        private C10494b0<C10450a0.C10460e.C10467d.C10468a.C10470b.C10478e.C10480b> f16002c;

        /* renamed from: d */
        private C10450a0.C10460e.C10467d.C10468a.C10470b.C10474c f16003d;

        /* renamed from: e */
        private Integer f16004e;

        C10535b() {
        }

        /* renamed from: a */
        public C10450a0.C10460e.C10467d.C10468a.C10470b.C10474c mo45296a() {
            String str = "";
            if (this.f16000a == null) {
                str = str + " type";
            }
            if (this.f16002c == null) {
                str = str + " frames";
            }
            if (this.f16004e == null) {
                str = str + " overflowCount";
            }
            if (str.isEmpty()) {
                return new C10533o(this.f16000a, this.f16001b, this.f16002c, this.f16003d, this.f16004e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C10450a0.C10460e.C10467d.C10468a.C10470b.C10474c.C10475a mo45297b(C10450a0.C10460e.C10467d.C10468a.C10470b.C10474c cVar) {
            this.f16003d = cVar;
            return this;
        }

        /* renamed from: c */
        public C10450a0.C10460e.C10467d.C10468a.C10470b.C10474c.C10475a mo45298c(C10494b0<C10450a0.C10460e.C10467d.C10468a.C10470b.C10478e.C10480b> b0Var) {
            if (b0Var != null) {
                this.f16002c = b0Var;
                return this;
            }
            throw new NullPointerException("Null frames");
        }

        /* renamed from: d */
        public C10450a0.C10460e.C10467d.C10468a.C10470b.C10474c.C10475a mo45299d(int i) {
            this.f16004e = Integer.valueOf(i);
            return this;
        }

        /* renamed from: e */
        public C10450a0.C10460e.C10467d.C10468a.C10470b.C10474c.C10475a mo45300e(String str) {
            this.f16001b = str;
            return this;
        }

        /* renamed from: f */
        public C10450a0.C10460e.C10467d.C10468a.C10470b.C10474c.C10475a mo45301f(String str) {
            if (str != null) {
                this.f16000a = str;
                return this;
            }
            throw new NullPointerException("Null type");
        }
    }

    @Nullable
    /* renamed from: b */
    public C10450a0.C10460e.C10467d.C10468a.C10470b.C10474c mo45291b() {
        return this.f15998d;
    }

    @NonNull
    /* renamed from: c */
    public C10494b0<C10450a0.C10460e.C10467d.C10468a.C10470b.C10478e.C10480b> mo45292c() {
        return this.f15997c;
    }

    /* renamed from: d */
    public int mo45293d() {
        return this.f15999e;
    }

    @Nullable
    /* renamed from: e */
    public String mo45294e() {
        return this.f15996b;
    }

    public boolean equals(Object obj) {
        String str;
        C10450a0.C10460e.C10467d.C10468a.C10470b.C10474c cVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10450a0.C10460e.C10467d.C10468a.C10470b.C10474c)) {
            return false;
        }
        C10450a0.C10460e.C10467d.C10468a.C10470b.C10474c cVar2 = (C10450a0.C10460e.C10467d.C10468a.C10470b.C10474c) obj;
        if (!this.f15995a.equals(cVar2.mo45295f()) || ((str = this.f15996b) != null ? !str.equals(cVar2.mo45294e()) : cVar2.mo45294e() != null) || !this.f15997c.equals(cVar2.mo45292c()) || ((cVar = this.f15998d) != null ? !cVar.equals(cVar2.mo45291b()) : cVar2.mo45291b() != null) || this.f15999e != cVar2.mo45293d()) {
            return false;
        }
        return true;
    }

    @NonNull
    /* renamed from: f */
    public String mo45295f() {
        return this.f15995a;
    }

    public int hashCode() {
        int i;
        int hashCode = (this.f15995a.hashCode() ^ 1000003) * 1000003;
        String str = this.f15996b;
        int i2 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int hashCode2 = (((hashCode ^ i) * 1000003) ^ this.f15997c.hashCode()) * 1000003;
        C10450a0.C10460e.C10467d.C10468a.C10470b.C10474c cVar = this.f15998d;
        if (cVar != null) {
            i2 = cVar.hashCode();
        }
        return ((hashCode2 ^ i2) * 1000003) ^ this.f15999e;
    }

    public String toString() {
        return "Exception{type=" + this.f15995a + ", reason=" + this.f15996b + ", frames=" + this.f15997c + ", causedBy=" + this.f15998d + ", overflowCount=" + this.f15999e + "}";
    }

    private C10533o(String str, @Nullable String str2, C10494b0<C10450a0.C10460e.C10467d.C10468a.C10470b.C10478e.C10480b> b0Var, @Nullable C10450a0.C10460e.C10467d.C10468a.C10470b.C10474c cVar, int i) {
        this.f15995a = str;
        this.f15996b = str2;
        this.f15997c = b0Var;
        this.f15998d = cVar;
        this.f15999e = i;
    }
}
