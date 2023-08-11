package p042bo.app;

import kotlin.jvm.internal.C12775o;

/* renamed from: bo.app.e6 */
public final class C3130e6 {

    /* renamed from: a */
    private final C3042c2 f1681a;

    public C3130e6(C3042c2 c2Var) {
        C12775o.m28639i(c2Var, "request");
        this.f1681a = c2Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C3130e6) && C12775o.m28634d(this.f1681a, ((C3130e6) obj).f1681a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f1681a.hashCode();
    }

    public String toString() {
        return "TriggerDispatchCompletedEvent(request=" + this.f1681a + ')';
    }
}
