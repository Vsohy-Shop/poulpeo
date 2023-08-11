package p277x6;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p277x6.C10450a0;

/* renamed from: x6.e */
/* compiled from: AutoValue_CrashlyticsReport_FilesPayload */
final class C10505e extends C10450a0.C10456d {

    /* renamed from: a */
    private final C10494b0<C10450a0.C10456d.C10458b> f15894a;

    /* renamed from: b */
    private final String f15895b;

    /* renamed from: x6.e$b */
    /* compiled from: AutoValue_CrashlyticsReport_FilesPayload */
    static final class C10507b extends C10450a0.C10456d.C10457a {

        /* renamed from: a */
        private C10494b0<C10450a0.C10456d.C10458b> f15896a;

        /* renamed from: b */
        private String f15897b;

        C10507b() {
        }

        /* renamed from: a */
        public C10450a0.C10456d mo45181a() {
            String str = "";
            if (this.f15896a == null) {
                str = str + " files";
            }
            if (str.isEmpty()) {
                return new C10505e(this.f15896a, this.f15897b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C10450a0.C10456d.C10457a mo45182b(C10494b0<C10450a0.C10456d.C10458b> b0Var) {
            if (b0Var != null) {
                this.f15896a = b0Var;
                return this;
            }
            throw new NullPointerException("Null files");
        }

        /* renamed from: c */
        public C10450a0.C10456d.C10457a mo45183c(String str) {
            this.f15897b = str;
            return this;
        }
    }

    @NonNull
    /* renamed from: b */
    public C10494b0<C10450a0.C10456d.C10458b> mo45179b() {
        return this.f15894a;
    }

    @Nullable
    /* renamed from: c */
    public String mo45180c() {
        return this.f15895b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10450a0.C10456d)) {
            return false;
        }
        C10450a0.C10456d dVar = (C10450a0.C10456d) obj;
        if (this.f15894a.equals(dVar.mo45179b())) {
            String str = this.f15895b;
            if (str == null) {
                if (dVar.mo45180c() == null) {
                    return true;
                }
            } else if (str.equals(dVar.mo45180c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode = (this.f15894a.hashCode() ^ 1000003) * 1000003;
        String str = this.f15895b;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "FilesPayload{files=" + this.f15894a + ", orgId=" + this.f15895b + "}";
    }

    private C10505e(C10494b0<C10450a0.C10456d.C10458b> b0Var, @Nullable String str) {
        this.f15894a = b0Var;
        this.f15895b = str;
    }
}
