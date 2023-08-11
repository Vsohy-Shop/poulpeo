package p042bo.app;

import kotlin.jvm.internal.C12775o;
import org.json.JSONObject;

/* renamed from: bo.app.p0 */
public final class C3544p0 {

    /* renamed from: a */
    private final C3042c2 f2363a;

    /* renamed from: b */
    private final JSONObject f2364b;

    public C3544p0(C3042c2 c2Var) {
        C12775o.m28639i(c2Var, "request");
        this.f2363a = c2Var;
        this.f2364b = c2Var.mo28608l();
    }

    /* renamed from: a */
    public final C3042c2 mo29487a() {
        return this.f2363a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C3544p0) && C12775o.m28634d(this.f2363a, ((C3544p0) obj).f2363a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f2363a.hashCode();
    }

    public String toString() {
        return "DispatchFailedEvent(request=" + this.f2363a + ')';
    }
}
