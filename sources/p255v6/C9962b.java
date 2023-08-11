package p255v6;

import java.io.File;
import p277x6.C10450a0;

/* renamed from: v6.b */
/* compiled from: AutoValue_CrashlyticsReportWithSessionId */
final class C9962b extends C10010p {

    /* renamed from: a */
    private final C10450a0 f14944a;

    /* renamed from: b */
    private final String f14945b;

    /* renamed from: c */
    private final File f14946c;

    C9962b(C10450a0 a0Var, String str, File file) {
        if (a0Var != null) {
            this.f14944a = a0Var;
            if (str != null) {
                this.f14945b = str;
                if (file != null) {
                    this.f14946c = file;
                    return;
                }
                throw new NullPointerException("Null reportFile");
            }
            throw new NullPointerException("Null sessionId");
        }
        throw new NullPointerException("Null report");
    }

    /* renamed from: b */
    public C10450a0 mo44510b() {
        return this.f14944a;
    }

    /* renamed from: c */
    public File mo44511c() {
        return this.f14946c;
    }

    /* renamed from: d */
    public String mo44512d() {
        return this.f14945b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10010p)) {
            return false;
        }
        C10010p pVar = (C10010p) obj;
        if (!this.f14944a.equals(pVar.mo44510b()) || !this.f14945b.equals(pVar.mo44512d()) || !this.f14946c.equals(pVar.mo44511c())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((this.f14944a.hashCode() ^ 1000003) * 1000003) ^ this.f14945b.hashCode()) * 1000003) ^ this.f14946c.hashCode();
    }

    public String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f14944a + ", sessionId=" + this.f14945b + ", reportFile=" + this.f14946c + "}";
    }
}
