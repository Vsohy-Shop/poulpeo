package p042bo.app;

import kotlin.jvm.internal.C12775o;

/* renamed from: bo.app.u4 */
public final class C3729u4 {

    /* renamed from: a */
    private final C3042c2 f2655a;

    public C3729u4(C3042c2 c2Var) {
        C12775o.m28639i(c2Var, "request");
        this.f2655a = c2Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C3729u4) && C12775o.m28634d(this.f2655a, ((C3729u4) obj).f2655a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f2655a.hashCode();
    }

    public String toString() {
        return "RequestNetworkSuccessEvent(request=" + this.f2655a + ')';
    }
}
