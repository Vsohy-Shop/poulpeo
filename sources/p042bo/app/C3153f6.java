package p042bo.app;

import kotlin.jvm.internal.C12775o;

/* renamed from: bo.app.f6 */
public final class C3153f6 {

    /* renamed from: a */
    private final C3042c2 f1714a;

    public C3153f6(C3042c2 c2Var) {
        C12775o.m28639i(c2Var, "request");
        this.f1714a = c2Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C3153f6) && C12775o.m28634d(this.f1714a, ((C3153f6) obj).f1714a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f1714a.hashCode();
    }

    public String toString() {
        return "TriggerDispatchStartedEvent(request=" + this.f1714a + ')';
    }
}
