package p042bo.app;

import kotlin.jvm.internal.C12775o;

/* renamed from: bo.app.k5 */
public final class C3319k5 {

    /* renamed from: a */
    private final C3208h5 f1983a;

    public C3319k5(C3208h5 h5Var) {
        C12775o.m28639i(h5Var, "sealedSession");
        this.f1983a = h5Var;
    }

    /* renamed from: a */
    public final C3208h5 mo29201a() {
        return this.f1983a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C3319k5) && C12775o.m28634d(this.f1983a, ((C3319k5) obj).f1983a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f1983a.hashCode();
    }

    public String toString() {
        return "SessionSealedEvent(sealedSession=" + this.f1983a + ')';
    }
}
