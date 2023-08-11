package p042bo.app;

import kotlin.jvm.internal.C12775o;

/* renamed from: bo.app.p6 */
public final class C3563p6 {

    /* renamed from: a */
    private final C3766w2 f2385a;

    /* renamed from: b */
    private final C3024b3 f2386b;

    public C3563p6(C3766w2 w2Var, C3024b3 b3Var) {
        C12775o.m28639i(w2Var, "originalTriggerEvent");
        C12775o.m28639i(b3Var, "failedTriggeredAction");
        this.f2385a = w2Var;
        this.f2386b = b3Var;
    }

    /* renamed from: a */
    public final C3766w2 mo29507a() {
        return this.f2385a;
    }

    /* renamed from: b */
    public final C3024b3 mo29508b() {
        return this.f2386b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3563p6)) {
            return false;
        }
        C3563p6 p6Var = (C3563p6) obj;
        if (C12775o.m28634d(this.f2385a, p6Var.f2385a) && C12775o.m28634d(this.f2386b, p6Var.f2386b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f2385a.hashCode() * 31) + this.f2386b.hashCode();
    }

    public String toString() {
        return "TriggeredActionRetryEvent(originalTriggerEvent=" + this.f2385a + ", failedTriggeredAction=" + this.f2386b + ')';
    }
}
