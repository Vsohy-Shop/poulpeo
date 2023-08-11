package p042bo.app;

import kotlin.jvm.internal.C12775o;

/* renamed from: bo.app.r0 */
public final class C3604r0 {

    /* renamed from: a */
    private final C3042c2 f2456a;

    public C3604r0(C3042c2 c2Var) {
        C12775o.m28639i(c2Var, "request");
        this.f2456a = c2Var;
    }

    /* renamed from: a */
    public final C3042c2 mo29564a() {
        return this.f2456a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C3604r0) && C12775o.m28634d(this.f2456a, ((C3604r0) obj).f2456a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f2456a.hashCode();
    }

    public String toString() {
        return "DispatchSucceededEvent(request=" + this.f2456a + ')';
    }
}
