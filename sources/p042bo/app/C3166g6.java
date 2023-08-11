package p042bo.app;

import kotlin.jvm.internal.C12775o;

/* renamed from: bo.app.g6 */
public final class C3166g6 {

    /* renamed from: a */
    private final String f1729a;

    /* renamed from: b */
    private final C3785x1 f1730b;

    public C3166g6(String str, C3785x1 x1Var) {
        C12775o.m28639i(str, "campaignId");
        C12775o.m28639i(x1Var, "pushClickEvent");
        this.f1729a = str;
        this.f1730b = x1Var;
    }

    /* renamed from: a */
    public final String mo28943a() {
        return this.f1729a;
    }

    /* renamed from: b */
    public final C3785x1 mo28944b() {
        return this.f1730b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3166g6)) {
            return false;
        }
        C3166g6 g6Var = (C3166g6) obj;
        if (C12775o.m28634d(this.f1729a, g6Var.f1729a) && C12775o.m28634d(this.f1730b, g6Var.f1730b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f1729a.hashCode() * 31) + this.f1730b.hashCode();
    }

    public String toString() {
        return "TriggerEligiblePushClickEvent(campaignId=" + this.f1729a + ", pushClickEvent=" + this.f1730b + ')';
    }
}
