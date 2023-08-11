package p277x6;

import p222s6.C9508e;
import p277x6.C10498c0;

/* renamed from: x6.x */
/* compiled from: AutoValue_StaticSessionData_AppData */
final class C10558x extends C10498c0.C10499a {

    /* renamed from: a */
    private final String f16054a;

    /* renamed from: b */
    private final String f16055b;

    /* renamed from: c */
    private final String f16056c;

    /* renamed from: d */
    private final String f16057d;

    /* renamed from: e */
    private final int f16058e;

    /* renamed from: f */
    private final C9508e f16059f;

    C10558x(String str, String str2, String str3, String str4, int i, C9508e eVar) {
        if (str != null) {
            this.f16054a = str;
            if (str2 != null) {
                this.f16055b = str2;
                if (str3 != null) {
                    this.f16056c = str3;
                    if (str4 != null) {
                        this.f16057d = str4;
                        this.f16058e = i;
                        if (eVar != null) {
                            this.f16059f = eVar;
                            return;
                        }
                        throw new NullPointerException("Null developmentPlatformProvider");
                    }
                    throw new NullPointerException("Null installUuid");
                }
                throw new NullPointerException("Null versionName");
            }
            throw new NullPointerException("Null versionCode");
        }
        throw new NullPointerException("Null appIdentifier");
    }

    /* renamed from: a */
    public String mo45395a() {
        return this.f16054a;
    }

    /* renamed from: c */
    public int mo45396c() {
        return this.f16058e;
    }

    /* renamed from: d */
    public C9508e mo45397d() {
        return this.f16059f;
    }

    /* renamed from: e */
    public String mo45398e() {
        return this.f16057d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10498c0.C10499a)) {
            return false;
        }
        C10498c0.C10499a aVar = (C10498c0.C10499a) obj;
        if (!this.f16054a.equals(aVar.mo45395a()) || !this.f16055b.equals(aVar.mo45399f()) || !this.f16056c.equals(aVar.mo45400g()) || !this.f16057d.equals(aVar.mo45398e()) || this.f16058e != aVar.mo45396c() || !this.f16059f.equals(aVar.mo45397d())) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public String mo45399f() {
        return this.f16055b;
    }

    /* renamed from: g */
    public String mo45400g() {
        return this.f16056c;
    }

    public int hashCode() {
        return ((((((((((this.f16054a.hashCode() ^ 1000003) * 1000003) ^ this.f16055b.hashCode()) * 1000003) ^ this.f16056c.hashCode()) * 1000003) ^ this.f16057d.hashCode()) * 1000003) ^ this.f16058e) * 1000003) ^ this.f16059f.hashCode();
    }

    public String toString() {
        return "AppData{appIdentifier=" + this.f16054a + ", versionCode=" + this.f16055b + ", versionName=" + this.f16056c + ", installUuid=" + this.f16057d + ", deliveryMechanism=" + this.f16058e + ", developmentPlatformProvider=" + this.f16059f + "}";
    }
}
