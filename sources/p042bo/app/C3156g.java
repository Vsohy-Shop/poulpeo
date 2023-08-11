package p042bo.app;

import kotlin.jvm.internal.C12775o;

/* renamed from: bo.app.g */
public final class C3156g implements C3584q2 {

    /* renamed from: a */
    private final String f1716a;

    /* renamed from: b */
    private final C3042c2 f1717b;

    public C3156g(String str, C3042c2 c2Var) {
        C12775o.m28639i(c2Var, "originalRequest");
        this.f1716a = str;
        this.f1717b = c2Var;
    }

    /* renamed from: a */
    public String mo28922a() {
        return this.f1716a;
    }

    /* renamed from: b */
    public C3042c2 mo28923b() {
        return this.f1717b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3156g)) {
            return false;
        }
        C3156g gVar = (C3156g) obj;
        if (C12775o.m28634d(mo28922a(), gVar.mo28922a()) && C12775o.m28634d(mo28923b(), gVar.mo28923b())) {
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
        return (i * 31) + mo28923b().hashCode();
    }

    public String toString() {
        return "BasicResponseError(errorMessage=" + mo28922a() + ", originalRequest=" + mo28923b() + ')';
    }
}
