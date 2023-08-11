package p042bo.app;

import kotlin.jvm.internal.C12775o;

/* renamed from: bo.app.i6 */
public final class C3237i6 {

    /* renamed from: a */
    private final C3766w2 f1840a;

    public C3237i6(C3766w2 w2Var) {
        C12775o.m28639i(w2Var, "triggerEvent");
        this.f1840a = w2Var;
    }

    /* renamed from: a */
    public final C3766w2 mo29041a() {
        return this.f1840a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C3237i6) && C12775o.m28634d(this.f1840a, ((C3237i6) obj).f1840a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f1840a.hashCode();
    }

    public String toString() {
        return "TriggerEventEvent(triggerEvent=" + this.f1840a + ')';
    }
}
