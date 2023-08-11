package p042bo.app;

import kotlin.jvm.internal.C12775o;

/* renamed from: bo.app.s3 */
public final class C3668s3 implements C3584q2 {

    /* renamed from: a */
    private final String f2548a;

    /* renamed from: b */
    private final C3042c2 f2549b;

    public C3668s3(String str, C3042c2 c2Var) {
        C12775o.m28639i(c2Var, "originalRequest");
        this.f2548a = str;
        this.f2549b = c2Var;
    }

    /* renamed from: a */
    public String mo28922a() {
        return this.f2548a;
    }

    /* renamed from: b */
    public C3042c2 mo29635b() {
        return this.f2549b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3668s3)) {
            return false;
        }
        C3668s3 s3Var = (C3668s3) obj;
        if (C12775o.m28634d(mo28922a(), s3Var.mo28922a()) && C12775o.m28634d(mo29635b(), s3Var.mo29635b())) {
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
        return (i * 31) + mo29635b().hashCode();
    }

    public String toString() {
        return "NetworkCommunicationFailureResponseError(errorMessage=" + mo28922a() + ", originalRequest=" + mo29635b() + ')';
    }
}
