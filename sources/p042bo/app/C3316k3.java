package p042bo.app;

import kotlin.jvm.internal.C12775o;

/* renamed from: bo.app.k3 */
public final class C3316k3 implements C3584q2 {

    /* renamed from: a */
    private final String f1980a;

    /* renamed from: b */
    private final C3042c2 f1981b;

    public C3316k3(String str, C3042c2 c2Var) {
        C12775o.m28639i(c2Var, "originalRequest");
        this.f1980a = str;
        this.f1981b = c2Var;
    }

    /* renamed from: a */
    public String mo28922a() {
        return this.f1980a;
    }

    /* renamed from: b */
    public C3042c2 mo29195b() {
        return this.f1981b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3316k3)) {
            return false;
        }
        C3316k3 k3Var = (C3316k3) obj;
        if (C12775o.m28634d(mo28922a(), k3Var.mo28922a()) && C12775o.m28634d(mo29195b(), k3Var.mo29195b())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        if (mo28922a() == null) {
            i = 0;
        } else {
            i = mo28922a().hashCode();
        }
        return (i * 31) + mo29195b().hashCode();
    }

    public String toString() {
        return "InvalidApiKeyError(errorMessage=" + mo28922a() + ", originalRequest=" + mo29195b() + ')';
    }
}
