package p042bo.app;

import kotlin.jvm.internal.C12775o;

/* renamed from: bo.app.g5 */
public final class C3165g5 {

    /* renamed from: a */
    private final C3584q2 f1728a;

    public C3165g5(C3584q2 q2Var) {
        C12775o.m28639i(q2Var, "responseError");
        this.f1728a = q2Var;
    }

    /* renamed from: a */
    public final C3584q2 mo28939a() {
        return this.f1728a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C3165g5) && C12775o.m28634d(this.f1728a, ((C3165g5) obj).f1728a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f1728a.hashCode();
    }

    public String toString() {
        return "ServerResponseErrorEvent(responseError=" + this.f1728a + ')';
    }
}
