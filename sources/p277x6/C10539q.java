package p277x6;

import androidx.annotation.NonNull;
import p277x6.C10450a0;

/* renamed from: x6.q */
/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread */
final class C10539q extends C10450a0.C10460e.C10467d.C10468a.C10470b.C10478e {

    /* renamed from: a */
    private final String f16011a;

    /* renamed from: b */
    private final int f16012b;

    /* renamed from: c */
    private final C10494b0<C10450a0.C10460e.C10467d.C10468a.C10470b.C10478e.C10480b> f16013c;

    /* renamed from: x6.q$b */
    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread */
    static final class C10541b extends C10450a0.C10460e.C10467d.C10468a.C10470b.C10478e.C10479a {

        /* renamed from: a */
        private String f16014a;

        /* renamed from: b */
        private Integer f16015b;

        /* renamed from: c */
        private C10494b0<C10450a0.C10460e.C10467d.C10468a.C10470b.C10478e.C10480b> f16016c;

        C10541b() {
        }

        /* renamed from: a */
        public C10450a0.C10460e.C10467d.C10468a.C10470b.C10478e mo45312a() {
            String str = "";
            if (this.f16014a == null) {
                str = str + " name";
            }
            if (this.f16015b == null) {
                str = str + " importance";
            }
            if (this.f16016c == null) {
                str = str + " frames";
            }
            if (str.isEmpty()) {
                return new C10539q(this.f16014a, this.f16015b.intValue(), this.f16016c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C10450a0.C10460e.C10467d.C10468a.C10470b.C10478e.C10479a mo45313b(C10494b0<C10450a0.C10460e.C10467d.C10468a.C10470b.C10478e.C10480b> b0Var) {
            if (b0Var != null) {
                this.f16016c = b0Var;
                return this;
            }
            throw new NullPointerException("Null frames");
        }

        /* renamed from: c */
        public C10450a0.C10460e.C10467d.C10468a.C10470b.C10478e.C10479a mo45314c(int i) {
            this.f16015b = Integer.valueOf(i);
            return this;
        }

        /* renamed from: d */
        public C10450a0.C10460e.C10467d.C10468a.C10470b.C10478e.C10479a mo45315d(String str) {
            if (str != null) {
                this.f16014a = str;
                return this;
            }
            throw new NullPointerException("Null name");
        }
    }

    @NonNull
    /* renamed from: b */
    public C10494b0<C10450a0.C10460e.C10467d.C10468a.C10470b.C10478e.C10480b> mo45309b() {
        return this.f16013c;
    }

    /* renamed from: c */
    public int mo45310c() {
        return this.f16012b;
    }

    @NonNull
    /* renamed from: d */
    public String mo45311d() {
        return this.f16011a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10450a0.C10460e.C10467d.C10468a.C10470b.C10478e)) {
            return false;
        }
        C10450a0.C10460e.C10467d.C10468a.C10470b.C10478e eVar = (C10450a0.C10460e.C10467d.C10468a.C10470b.C10478e) obj;
        if (!this.f16011a.equals(eVar.mo45311d()) || this.f16012b != eVar.mo45310c() || !this.f16013c.equals(eVar.mo45309b())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((this.f16011a.hashCode() ^ 1000003) * 1000003) ^ this.f16012b) * 1000003) ^ this.f16013c.hashCode();
    }

    public String toString() {
        return "Thread{name=" + this.f16011a + ", importance=" + this.f16012b + ", frames=" + this.f16013c + "}";
    }

    private C10539q(String str, int i, C10494b0<C10450a0.C10460e.C10467d.C10468a.C10470b.C10478e.C10480b> b0Var) {
        this.f16011a = str;
        this.f16012b = i;
        this.f16013c = b0Var;
    }
}
