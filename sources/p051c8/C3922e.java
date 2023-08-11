package p051c8;

import com.google.firebase.installations.C6949f;

/* renamed from: c8.e */
/* compiled from: AutoValue_InstallationIdResult */
final class C3922e extends C3956k2 {

    /* renamed from: a */
    private final String f3020a;

    /* renamed from: b */
    private final C6949f f3021b;

    C3922e(String str, C6949f fVar) {
        if (str != null) {
            this.f3020a = str;
            if (fVar != null) {
                this.f3021b = fVar;
                return;
            }
            throw new NullPointerException("Null installationTokenResult");
        }
        throw new NullPointerException("Null installationId");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo29964b() {
        return this.f3020a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C6949f mo29965c() {
        return this.f3021b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3956k2)) {
            return false;
        }
        C3956k2 k2Var = (C3956k2) obj;
        if (!this.f3020a.equals(k2Var.mo29964b()) || !this.f3021b.equals(k2Var.mo29965c())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.f3020a.hashCode() ^ 1000003) * 1000003) ^ this.f3021b.hashCode();
    }

    public String toString() {
        return "InstallationIdResult{installationId=" + this.f3020a + ", installationTokenResult=" + this.f3021b + "}";
    }
}
