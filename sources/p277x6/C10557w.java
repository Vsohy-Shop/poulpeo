package p277x6;

import p277x6.C10498c0;

/* renamed from: x6.w */
/* compiled from: AutoValue_StaticSessionData */
final class C10557w extends C10498c0 {

    /* renamed from: a */
    private final C10498c0.C10499a f16051a;

    /* renamed from: b */
    private final C10498c0.C10501c f16052b;

    /* renamed from: c */
    private final C10498c0.C10500b f16053c;

    C10557w(C10498c0.C10499a aVar, C10498c0.C10501c cVar, C10498c0.C10500b bVar) {
        if (aVar != null) {
            this.f16051a = aVar;
            if (cVar != null) {
                this.f16052b = cVar;
                if (bVar != null) {
                    this.f16053c = bVar;
                    return;
                }
                throw new NullPointerException("Null deviceData");
            }
            throw new NullPointerException("Null osData");
        }
        throw new NullPointerException("Null appData");
    }

    /* renamed from: a */
    public C10498c0.C10499a mo45392a() {
        return this.f16051a;
    }

    /* renamed from: c */
    public C10498c0.C10500b mo45393c() {
        return this.f16053c;
    }

    /* renamed from: d */
    public C10498c0.C10501c mo45394d() {
        return this.f16052b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10498c0)) {
            return false;
        }
        C10498c0 c0Var = (C10498c0) obj;
        if (!this.f16051a.equals(c0Var.mo45392a()) || !this.f16052b.equals(c0Var.mo45394d()) || !this.f16053c.equals(c0Var.mo45393c())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((this.f16051a.hashCode() ^ 1000003) * 1000003) ^ this.f16052b.hashCode()) * 1000003) ^ this.f16053c.hashCode();
    }

    public String toString() {
        return "StaticSessionData{appData=" + this.f16051a + ", osData=" + this.f16052b + ", deviceData=" + this.f16053c + "}";
    }
}
